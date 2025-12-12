public class KillCilantro {
   public static void main(String[] args){
      System.out.println(killCilantro("cilantro, I shure do love cilantro, cilantro is my favorite. MMm, yummy cilantro, doesn't taste like soap.\nI enjoy cilantro in many foods, I love when it is put on other foods like lasagna.\nI always ask for more cilantro on my food, I wan a massive pile of cilantro on everything I eat."));
   }
   
   private static String killCilantro (String sentnc){
      while (sentnc.indexOf("cilantro") >= 0){
         sentnc = sentnc.substring(0, sentnc.indexOf("cilantro")) + "parsley" + sentnc.substring(sentnc.indexOf("cilantro") + 8);
      }
      return sentnc;
   }
}