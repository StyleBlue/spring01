package com.example.spring01.gateway.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QGateway is a Querydsl query type for Gateway
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QGateway extends EntityPathBase<Gateway> {

    private static final long serialVersionUID = 1616503090L;

    public static final QGateway gateway = new QGateway("gateway");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath ipaddress = createString("ipaddress");

    public final NumberPath<Integer> port = createNumber("port", Integer.class);

    public final DateTimePath<java.time.LocalDateTime> regdate = createDateTime("regdate", java.time.LocalDateTime.class);

    public QGateway(String variable) {
        super(Gateway.class, forVariable(variable));
    }

    public QGateway(Path<? extends Gateway> path) {
        super(path.getType(), path.getMetadata());
    }

    public QGateway(PathMetadata metadata) {
        super(Gateway.class, metadata);
    }

}

