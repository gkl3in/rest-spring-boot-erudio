package br.com.erudio.restspringbooterudio.mapper.custom;

import br.com.erudio.restspringbooterudio.data.vo.v1.BookVO;
import br.com.erudio.restspringbooterudio.data.vo.v1.PersonVO;
import br.com.erudio.restspringbooterudio.model.Book;
import br.com.erudio.restspringbooterudio.model.Person;
import org.modelmapper.ModelMapper;

import java.util.ArrayList;
import java.util.List;

public class ModelMapperBook {

    private static ModelMapper mapper = new ModelMapper();

    static {
        mapper.createTypeMap(
                        Book.class,
                        BookVO.class)
                .addMapping(Book::getId, BookVO::setKey);
        mapper.createTypeMap(
                        BookVO.class,
                        Book.class)
                .addMapping(BookVO::getKey, Book::setId);
    }

    public static <O, D> D parseObject(O origin, Class<D> destination) {
        return mapper.map(origin, destination);
    }

    public static <O, D> List<D> parseListObjects(List<O> origin, Class<D> destination) {
        List<D> destinationObjects = new ArrayList<D>();
        for (O o : origin) {
            destinationObjects.add(mapper.map(o, destination));
        }
        return destinationObjects;
    }

}
