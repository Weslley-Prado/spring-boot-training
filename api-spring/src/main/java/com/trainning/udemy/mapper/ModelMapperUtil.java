package com.trainning.udemy.mapper;
import org.modelmapper.ModelMapper;

public class ModelMapperUtil {

    private static ModelMapper modelMapper = new ModelMapper();

    public static <O, D> D map(O origin, Class<D> destinationType) {
        return modelMapper.map(origin, destinationType);
    }

    public static <O, D> void map(O origin, D destination) {
        modelMapper.map(origin, destination);
    }
}
