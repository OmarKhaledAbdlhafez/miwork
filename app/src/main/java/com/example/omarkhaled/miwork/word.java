package com.example.omarkhaled.miwork;

public class word {
    public String normalword ;
    public String tword;
    public  word (String nword, String transword){
        normalword=nword;
        tword = transword;
    }
    public String getword (){
        return  normalword;
    }
    public String gettranslation(){
        return tword;
    }
}
