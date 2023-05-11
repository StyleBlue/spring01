package com.example.spring01.userTest.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QLogin is a Querydsl query type for Login
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QLogin extends EntityPathBase<Login> {

    private static final long serialVersionUID = -110854720L;

    public static final QLogin login = new QLogin("login");

    public final NumberPath<Long> memberId = createNumber("memberId", Long.class);


    public final StringPath password = createString("password");

    public final StringPath userId = createString("userId");

    public QLogin(String variable) {
        super(Login.class, forVariable(variable));
    }

    public QLogin(Path<? extends Login> path) {
        super(path.getType(), path.getMetadata());
    }

    public QLogin(PathMetadata metadata) {
        super(Login.class, metadata);
    }

}

