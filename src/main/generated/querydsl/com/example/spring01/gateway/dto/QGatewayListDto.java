package com.example.spring01.gateway.dto;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import javax.annotation.processing.Generated;

/**
 * com.example.spring01.gateway.dto.QGatewayListDto is a Querydsl Projection type for GatewayListDto
 */
@Generated("com.querydsl.codegen.DefaultProjectionSerializer")
public class QGatewayListDto extends ConstructorExpression<GatewayListDto> {

    private static final long serialVersionUID = -1240817883L;

    public QGatewayListDto(com.querydsl.core.types.Expression<Long> id, com.querydsl.core.types.Expression<String> ipaddress, com.querydsl.core.types.Expression<Integer> port, com.querydsl.core.types.Expression<java.time.LocalDateTime> regdate) {
        super(GatewayListDto.class, new Class<?>[]{long.class, String.class, int.class, java.time.LocalDateTime.class}, id, ipaddress, port, regdate);
    }

}

