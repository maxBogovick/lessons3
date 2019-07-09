package com.live.filter;

import com.live.Animal;

public interface MammalFilter extends Filter {
    default void doFilter(Animal[] array) {
         
    }
}
