package com.squareup.square.models;

import java.util.List;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.squareup.square.http.client.HttpContext;


/**
 * This is a model class for CreateCustomerGroupResponse type.
 */
public class CreateCustomerGroupResponse {

    /**
     * Initialization constructor.
     * @param errors
     * @param group
     */
    @JsonCreator
    public CreateCustomerGroupResponse(
            @JsonProperty("errors") List<Error> errors,
            @JsonProperty("group") CustomerGroup group) {
        this.errors = errors;
        this.group = group;
    }

    private HttpContext httpContext;
    private final List<Error> errors;
    private final CustomerGroup group;

    public HttpContext getContext() {
        return httpContext;
    }

    /**
     * Getter for Errors.
     * Any errors that occurred during the request.
     */
    @JsonGetter("errors")
    public List<Error> getErrors() {
        return this.errors;
    }

    /**
     * Getter for Group.
     * Represents a group of customer profiles. 
     * Customer groups can be created, modified, and have their membership defined either via 
     * the Customers API or within Customer Directory in the Square Dashboard or Point of Sale.
     */
    @JsonGetter("group")
    public CustomerGroup getGroup() {
        return this.group;
    }

 
    @Override
    public int hashCode() {
        return Objects.hash(errors, group);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this) {
            return true;
        }
        if(!(obj instanceof CreateCustomerGroupResponse)) {
            return false;
        }
        CreateCustomerGroupResponse createCustomerGroupResponse = (CreateCustomerGroupResponse) obj;
        return Objects.equals(errors, createCustomerGroupResponse.errors) &&
            Objects.equals(group, createCustomerGroupResponse.group);
    }

    /**
     * Builds a new {@link CreateCustomerGroupResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreateCustomerGroupResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
            .errors(getErrors())
            .group(getGroup());
            return builder;
    }

    /**
     * Class to build instances of {@link CreateCustomerGroupResponse}
     */
    public static class Builder {
        private HttpContext httpContext;
        private List<Error> errors;
        private CustomerGroup group;

        /**
         * Initialization constructor
         */
        public Builder() {
           
        }

        /**
         * Setter for httpContext
         * @param httpContext
         * @return Builder
         */
        public Builder httpContext(HttpContext httpContext) {
            this.httpContext = httpContext;
            return this;
        }
        /**
         * Setter for errors
         * @param errors
         * @return Builder
         */
        public Builder errors(List<Error> errors) {
            this.errors = errors;
            return this;
        }
        /**
         * Setter for group
         * @param group
         * @return Builder
         */
        public Builder group(CustomerGroup group) {
            this.group = group;
            return this;
        }

        /**
         * Builds a new {@link CreateCustomerGroupResponse} object using the set fields.
         * @return {@link CreateCustomerGroupResponse}
         */
        public CreateCustomerGroupResponse build() {
            CreateCustomerGroupResponse model = new CreateCustomerGroupResponse(errors,
                group);
            model.httpContext = httpContext;
            return model;
        }
    }
}
