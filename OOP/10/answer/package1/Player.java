package pack1;
//كذالك هنا
//public class Player extends CaptainBenfit
public class Player extends PlayerBenfit {
    public int id;
    public String name;
    public int number;
    public void call(){
        super.id=1;//عدل id الى موجود فى متغير الاب
        super.allBenefitPlayer="allBenefitPlayer";// عدل allBenefitPlayer الى موجود فى متغير الاب
        super.benefitPlayer="benefitPlayer";// عدل benefitPlayer الى موجود فى متغير الاب
    }
/*
* public void call(){
* super.id=1;
* super.benefitCaptain = "benefitCaptain";
  //super.allBenefitCaptain = "allBenefitCaptain";
* }
*
*
*
* */
}
