package com.example.interfaceinjava;

public class KickBoxer implements fighting {

    @Override
    public String throwJab() {
        return "Throw harder jab";
    }

    @Override
    public String throwCross() {
        return "Throw Harder Cross ";
    }

    @Override
    public String throwHook() {
        return "Throw Harder Hook";
    }

    @Override
    public String throwUppercut() {
        return "Throw Harder Uppercut";
    }
}
