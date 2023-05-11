package com.example.spring01.userTest.dto;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import javax.annotation.processing.Generated;

/**
 * com.example.spring01.userTest.dto.QLoginListDto is a Querydsl Projection type for LoginListDto
 */
@Generated("com.querydsl.codegen.DefaultProjectionSerializer")
public class QLoginListDto extends ConstructorExpression<LoginListDto> {

    private static final long serialVersionUID = -1690857527L;

    public QLoginListDto(com.querydsl.core.types.Expression<String> userId, com.querydsl.core.types.Expression<String> password) {
        super(LoginListDto.class, new Class<?>[]{String.class, String.class}, userId, password);
    }

}

