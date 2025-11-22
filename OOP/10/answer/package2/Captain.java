package com.model.service;

import pack1.PlayerBenfit;
// هنا عملنا احتمالين واستدعينا 2 ميثود لو ورث من جوا او بالخارج
//public class Captain extends PlayerBenfit
public class Captain extends CaptainBenfit{

    public int id;
    public String name;
    public int active;

public void call(){
    super.id=1;
    super.benefitCaptain="benefitCaptain";
    super.allBenefitCaptain="allBenefitCaptain";

}
/*
public void call(){

    super.id=1;
    super.benefitPlayer="benefitPlayer";
    super.allBenefitPlayer="allBenefitPlayer"
}


*/







}
