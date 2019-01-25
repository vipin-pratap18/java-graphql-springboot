package com.test.exception;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import graphql.ErrorType;
import graphql.GraphQLError;
import graphql.language.SourceLocation;

public class InvalidArgumentException extends RuntimeException implements GraphQLError {

	private static final long serialVersionUID = 8736931872133781173L;
	private Map<String, Object> extensions = new HashMap<>();

    public InvalidArgumentException(String message, String customMessage) {
        super(message);
        extensions.put("QueryArgumentNotValid", customMessage);
    }

    @Override
    public List<SourceLocation> getLocations() {
        return Collections.emptyList();
    }

    @Override
    public Map<String, Object> getExtensions() {
        return extensions;
    }

    @Override
    public ErrorType getErrorType() {
        return ErrorType.DataFetchingException;
    }
}
