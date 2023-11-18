package br.com.xbinario.restclient.domain;

import java.util.List;


public record PagedResponse<T>(
        List<T> content,
        Integer totalPages,
        Integer totalElements,
        Integer size,
        Integer number,
        Integer numberOfElements,
        Boolean first,
        Boolean last
) {
    public static class Builder<T> {
        private List<T> content;
        private Integer totalPages;
        private Integer totalElements;
        private Integer size;
        private Integer number;
        private Integer numberOfElements;
        private Boolean first;
        private Boolean last;

        public Builder<T> content(List<T> content) {
            this.content = content;
            return this;
        }

        public Builder<T> totalPages(Integer totalPages) {
            this.totalPages = totalPages;
            return this;
        }

        public Builder<T> totalElements(Integer totalElements) {
            this.totalElements = totalElements;
            return this;
        }

        public Builder<T> size(Integer size) {
            this.size = size;
            return this;
        }

        public Builder<T> number(Integer number) {
            this.number = number;
            return this;
        }

        public Builder<T> numberOfElements(Integer numberOfElements) {
            this.numberOfElements = numberOfElements;
            return this;
        }

        public Builder<T> first(Boolean first) {
            this.first = first;
            return this;
        }

        public Builder<T> last(Boolean last) {
            this.last = last;
            return this;
        }

        public PagedResponse<T> build() {
            return new PagedResponse<>(content, totalPages, totalElements, size, number, numberOfElements, first, last);
        }
    }
}

