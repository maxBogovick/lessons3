package com.live.filter;

@FunctionalInterface
public interface Filter {
    void doFilter();

    boolean equals(Object obj);

    int hashCode();
}
