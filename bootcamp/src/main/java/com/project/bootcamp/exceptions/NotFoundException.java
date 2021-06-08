package com.project.bootcamp.exceptions;

import com.project.bootcamp.uitl.MessageUtils;

public class NotFoundException extends RuntimeException {

    public NotFoundException() {
        super(MessageUtils.NO_RECORDS_FOUND);
    }
}
