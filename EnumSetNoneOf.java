package com.keyword;

import java.util.EnumSet;
import java.util.Set;

enum Phones{SAMSUNG,ONEPLUS,VIVO,OPPO,REDMI,IPHONE}
public class EnumSetNoneOf
{
    public static void main(String[] args)
    {
        Set<Phones> set = EnumSet.noneOf(Phones.class);
        System.out.println("After clearing "+set);
    }
}
