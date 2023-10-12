
import java.awt.*;
import java.util.*;
import javax.swing.*;
public class Quiz {
    public static void main(String args[]) {

        Quiz object = new Quiz();
        Random random=new Random();
        int menuchoice=0;
        int a=0;
        object.menu(menuchoice,a);

    }

    int  menu(int menuchoice,int a){

        Quiz object = new Quiz();
        Random random=new Random();
        ImageIcon hint  = new ImageIcon("src/images/colage ready.png");
        String[] choice={"CS:GO","League of Legends","Hardware"};
        menuchoice= (JOptionPane.showOptionDialog(null,null,"Quiz",
                JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,hint,choice,null));
        if (menuchoice==1){
            int q1=0;
            int q2=0;
            int q3=0;
            int q4=0;
            int q5=0;
            int q6=0;
            int q7=0;
            int q8=0;
            int q9=0;

            boolean qu1=false;
            boolean qu2=false;
            boolean qu3=false;
            boolean qu4=false;
            boolean qu5=false;
            boolean qu6=false;
            boolean qu7=false;
            boolean qu8=false;
            boolean qu9=false;
            for (int i=1;i<=9;i++){
                int b=random.nextInt((9-1)+1)+1;
                switch(b) {
                    case 1:
                        if (qu1==true)i--;
                        if (qu1==false) {
                            q1 = object.question1();
                            qu1 = true;
                        }
                        break;
                    case 2:
                        if (qu2==true)i--;
                        if (qu2==false) {
                            q2 = object.question2();
                            qu2 = true;
                        }
                        break;
                    case 3:
                        if (qu3==true)i--;
                        if (qu3==false) {
                            q3 = object.question3();
                            qu3 = true;
                        }
                        break;
                    case 4:
                        if (qu4==true)i--;
                        if (qu4==false) {
                            q4 = object.question4();
                            qu4 = true;
                        }
                        break;
                    case 5:
                        if (qu5==true)i--;
                        if (qu5==false) {
                            q5 = object.question5();
                            qu5 = true;
                        }
                        break;
                    case 6:
                        if (qu6==true)i--;
                        if (qu6==false) {
                            q6 = object.question6();
                            qu6 = true;
                        }
                        break;
                    case 7:
                        if (qu7==true)i--;
                        if (qu7==false) {
                            q7 = object.question7();
                            qu7 = true;
                        }
                        break;
                    case 8:
                        if (qu8==true)i--;
                        if (qu8==false) {
                            q8 = object.question8();
                            qu8 = true;
                        }
                        break;
                    case 9:
                        if (qu9==true)i--;
                        if (qu9==false) {
                            q9 = object.question9();
                            qu9 = true;
                        }
                        break;
                }
                if (i==9){
                    int result=q1+q2+q3+q4+q5+q6+q7+q8+q9;
                    object.end(result,menuchoice,a);
                }
            }
        }if (menuchoice==0){
            int q1cs = 0;
            int q2cs = 0;
            int q3cs = 0;
            int q4cs = 0;
            int q5cs = 0;
            int q6cs = 0;
            int q7cs = 0;
            int q8cs = 0;
            int q9cs = 0;
            int q10cs = 0;
            boolean qu1cs = false;
            boolean qu2cs = false;
            boolean qu3cs = false;
            boolean qu4cs = false;
            boolean qu5cs = false;
            boolean qu6cs = false;
            boolean qu7cs = false;
            boolean qu8cs = false;
            boolean qu9cs = false;
            boolean qu10cs = false;
            for (int i = 1; i <= 10; i++) {
                int b = random.nextInt((10 - 1) + 1) + 1;
                switch (b) {
                    case 1:
                        if (qu1cs == true) i--;
                        if (qu1cs == false) {
                            q1cs = object.question1cs();
                            qu1cs = true;
                        }
                        break;
                    case 2:
                        if (qu2cs == true) i--;
                        if (qu2cs == false) {
                            q2cs = object.question2cs();
                            qu2cs = true;
                        }
                        break;
                    case 3:
                        if (qu3cs == true) i--;
                        if (qu3cs == false) {
                            q3cs = object.question3cs();
                            qu3cs = true;
                        }
                        break;
                    case 4:
                        if (qu4cs == true) i--;
                        if (qu4cs == false) {
                            q4cs = object.question4cs();
                            qu4cs = true;
                        }
                        break;
                    case 5:
                        if (qu5cs == true) i--;
                        if (qu5cs == false) {
                            q5cs = object.question5cs();
                            qu5cs = true;
                        }
                        break;
                    case 6:
                        if (qu6cs == true) i--;
                        if (qu6cs == false) {
                            q6cs = object.question6cs();
                            qu6cs = true;
                        }
                        break;
                    case 7:
                        if (qu7cs == true) i--;
                        if (qu7cs == false) {
                            q7cs = object.question7cs();
                            qu7cs = true;
                        }
                        break;
                    case 8:
                        if (qu8cs == true) i--;
                        if (qu8cs == false) {
                            q8cs = object.question8cs();
                            qu8cs = true;
                        }
                        break;
                    case 9:
                        if (qu9cs == true) i--;
                        if (qu9cs == false) {
                            q9cs = object.question9cs();
                            qu9cs = true;
                        }
                        break;
                    case 10:
                        if (qu10cs == true) i--;
                        if (qu10cs == false) {
                            q10cs = object.question10cs();
                            qu10cs = true;
                        }
                        break;
                }
                if (i == 10) {
                    int result = q1cs + q2cs + q3cs + q4cs + q5cs + q6cs + q7cs + q8cs+ q9cs+q10cs;
                    object.end(result,menuchoice,a);
                }
            }
        }
        if (menuchoice==2){
            int q1h=0;
            int q2h=0;
            int q3h=0;
            int q4h=0;
            int q5h=0;
            int q6h=0;
            int q7h=0;
            int q8h=0;
            int q9h=0;
            int q10h=0;
            boolean qu1h=false;
            boolean qu2h=false;
            boolean qu3h=false;
            boolean qu4h=false;
            boolean qu5h=false;
            boolean qu6h=false;
            boolean qu7h=false;
            boolean qu8h=false;
            boolean qu9h=false;
            boolean qu10h=false;
            for (int i=1;i<=10;i++){
                int b=random.nextInt((10-1)+1)+1;
                switch(b) {
                    case 1:
                        if (qu1h==true)i--;
                        if (qu1h==false) {
                            q1h = object.question1h();
                            qu1h = true;
                        }
                        break;
                    case 2:
                        if (qu2h==true)i--;
                        if (qu2h==false) {
                            q2h = object.question2h();
                            qu2h = true;
                        }
                        break;
                    case 3:
                        if (qu3h==true)i--;
                        if (qu3h==false) {
                            q3h = object.question3h();
                            qu3h= true;
                        }
                        break;
                    case 4:
                        if (qu4h==true)i--;
                        if (qu4h==false) {
                            q4h = object.question4h();
                            qu4h = true;
                        }
                        break;
                    case 5:
                        if (qu5h==true)i--;
                        if (qu5h==false) {
                            q5h = object.question5h();
                            qu5h = true;
                        }
                        break;
                    case 6:
                        if (qu6h==true)i--;
                        if (qu6h==false) {
                            q6h = object.question6h();
                            qu6h = true;
                        }
                        break;
                    case 7:
                        if (qu7h==true)i--;
                        if (qu7h==false) {
                            q7h = object.question7h();
                            qu7h = true;
                        }
                        break;
                    case 8:
                        if (qu8h==true)i--;
                        if (qu8h==false) {
                            q8h = object.question8h();
                            qu8h = true;
                        }
                        break;
                    case 9:
                        if (qu9h==true)i--;
                        if (qu9h==false) {
                            q9h = object.question9h();
                            qu9h = true;
                        }
                        break;
                    case 10:
                        if (qu10h==true)i--;
                        if (qu10h==false) {
                            q10h = object.question10h();
                            qu10h = true;
                        }
                        break;
                }
                if (i==10){
                    int result=q1h+q2h+q3h+q4h+q5h+q6h+q7h+q8h+q9h+q10h;
                    object.end(result,menuchoice,a);
                }
            }
        }
        return menuchoice;
    }

    int end(int result,int menuchoice,int a){
        Quiz object = new Quiz();
        ImageIcon hint  = new ImageIcon("src/images/GAME OVER.png");
        String[] choice={"Меню","Отговори","Изход"};
        if (menuchoice==0) {
            a = (JOptionPane.showOptionDialog(null, result + " верни отговора от 10", "CS:GO Quiz",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, hint, choice, null));
        }if (menuchoice==1){
            a = (JOptionPane.showOptionDialog(null, result + " верни отговора от 9", "LOL Quiz",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, hint, choice, null));
        }if (menuchoice==2){
            a = (JOptionPane.showOptionDialog(null, result + " верни отговора от 10", "Hardware Quiz",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, hint, choice, null));
        }
        if (a==1&&menuchoice==0){
            object.summarycs(a);
        }if (a==1&&menuchoice==1){
            object.summary(a);
        }if (a==1&&menuchoice==2){
            object.summaryh(a);
        }if (a==0){
            object.menu(menuchoice,a);
        }
        return result;
    }

    int summary(int menuchoice){
        Quiz object = new Quiz();
        ImageIcon hint  = new ImageIcon("src/images/test2.png");
        String[] choice={"Меню","Изход"};


        int a= (JOptionPane.showOptionDialog(null,"През коя година играта излиза официално?\nОтговор: 2009\n\nКоя е компанията създала играта?\nОтговор: Riot games\n\nКак се нарича най - играната League of Legends карта?\nОтговор: Summoner's Rift\n\nКой герой от Shadow Isles не е мъртъв?\nОтговор: Yorick\n\nВ кое от кралствата живеят най - много герои?\nОтговор: Ionia\n\nКой герой е кръстен на дизайн директора на компанията?\nОтговор: Zilean\n\nКой герой е вдъхновен от емблематичния филм \"Властелинът на пръстените\"?\nОтговор: Aatrox\n\nКой е най - редкият скин в играта?\nОтговор: PAX Twisted Fate\n\nОт кое кралство е героят Teemo?\nОтговор: Bandle City","LOL Answers",
                JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,hint,choice,null));
        if (a==0) object.menu(menuchoice,a);
        return a;
    }
    int summarycs(int menuchoice) {
        Quiz object = new Quiz();
        ImageIcon hint = new ImageIcon("src/images/test2.png");
        String[] choice = {"Меню", "Изход"};
        int a = (JOptionPane.showOptionDialog(null, "Как се казва това място?\nОтговор: Palace\n\nКолко струва SSG 08?\nОтговор: 1700\n\nКакъв е кодът на бомбата?\nОтговор: 7355608\n\nКоя е първата кутия в играта?\nОтговор: CS:GO Weapon case\n\nПрез коя година излиза играта?\nОтговор: 2012\n\nОт коя игра произлиза CS:GO?\nОтговор: Half - Life\n\nКолко струва автоматът \"Famas\"?\nОтговор: 2250\n\nКолко патрона е капацитетът на палнителя на M4A1S?\nОтговор: 100\n\nКоя година GS:GO печели титлата \"Игра на годината\" ?\nОтговор: 2015\n\nНа коя карта e сложен графитът \"Flying AWP\"?\nОтговор: Mirage", "CS:GO Answers",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, hint, choice, null));
        if (a == 0) object.menu(menuchoice,a);
        return a;
    }

    int summaryh(int menuchoice) {
        Quiz object = new Quiz();
        ImageIcon hint = new ImageIcon("src/images/test2.png");
        String[] choice = {"Меню", "Изход"};
        int a = (JOptionPane.showOptionDialog(null, "Преди появата на думата \"Hardware\" се е използвал терминът:\nОтговор: Апаратно осигуряване\n\nКаква е абревиатурата за процесор?\nОтговор: CPU\n\nКакво означава абревиатурата \"CPU\"?\nОтговор: Central Processing Unit\n\nВ коя мерна единица се измерва мощността на процесора?\nОтговор: Херцове(Hz)\n\nКакво означава абревиатурата \"PCI\"?\nОтговор: Personal Computer Interface\n\nКаква е абревиатурата за видео карта?\nОтговор: GPU\n\nКакво означава абревиатурата \"GPU\"?\nОтговор: Graphics Processing Unit\n\nКаква е абревиатурата за твърд диск?\nОтговор: HDD\n\nКаква е абревиатурата за захранващ блок(захранване)?\nОтговор: PSU\n\nКаква е абревиатурата за захранващ блок(захранване)?\nОтговор: 4 физически и 8 логически", "Hardware Answers",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, hint, choice, null));
        if (a == 0) object.menu(menuchoice,a);
        return a;
    }

    void correct(){
        ImageIcon hint  = new ImageIcon("src/images/correct.png");
        String[] choice={"Продължи"};
        System.out.println(JOptionPane.showOptionDialog(null,null,"Correct",
                JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,hint,choice,null));
    }

    void wrong1(){
        ImageIcon hint  = new ImageIcon("src/images/wrong1.png");
        String[] choice={"Продължи"};
        System.out.println(JOptionPane.showOptionDialog(null,null,"Wrong",
                JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,hint,choice,null));
    }

    void wrong2(){
        ImageIcon hint  = new ImageIcon("src/images/wrong2.png");
        String[] choice={"Продължи"};
        System.out.println(JOptionPane.showOptionDialog(null,null,"Wrong",
                JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,hint,choice,null));
    }


    void wrong3(){
        ImageIcon hint  = new ImageIcon("src/images/wrong3.png");
        String[] choice={"Продължи"};
        System.out.println(JOptionPane.showOptionDialog(null,null,"Wrong",
                JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,hint,choice,null));
    }


    void wrong4(){
        ImageIcon hint  = new ImageIcon("src/images/wrong4.png");
        String[] choice={"Продължи"};
        System.out.println(JOptionPane.showOptionDialog(null,null,"Wrong",
                JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,hint,choice,null));
    }


    void wrong5(){
        ImageIcon hint  = new ImageIcon("src/images/wrong5.png");
        String[] choice={"Продължи"};
        System.out.println(JOptionPane.showOptionDialog(null,null,"Wrong",
                JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,hint,choice,null));
    }


    void wrong6(){
        ImageIcon hint  = new ImageIcon("src/images/wrong6.png");
        String[] choice={"Продължи"};
        System.out.println(JOptionPane.showOptionDialog(null,null,"Wrong",
                JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,hint,choice,null));
    }


    void wrong7(){
        ImageIcon hint  = new ImageIcon("src/images/wrong7.png");
        String[] choice={"Продължи"};
        System.out.println(JOptionPane.showOptionDialog(null,null,"Wrong",
                JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,hint,choice,null));
    }


    void wrong8(){
        ImageIcon hint  = new ImageIcon("src/images/wrong8.png");
        String[] choice={"Продължи"};
        System.out.println(JOptionPane.showOptionDialog(null,null,"Wrong",
                JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,hint,choice,null));
    }

    void wrong9(){
        ImageIcon hint  = new ImageIcon("src/images/wrong9.png");
        String[] choice={"Продължи"};
        System.out.println(JOptionPane.showOptionDialog(null,null,"Wrong",
                JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,hint,choice,null));
    }

    int question1(){
        Quiz object = new Quiz();
        int result1;
        ImageIcon hint  = new ImageIcon("src/images/League-of-Legends.png");
        String[] choice={"Нямам идея","2010","2011","2009","2014"};
        String n= (String) JOptionPane.showInputDialog(null,"Коя година е създадена играта?","LOL - Question",JOptionPane.QUESTION_MESSAGE,hint,choice, choice[0]);
        if (n.equals("2009")){
            result1=1;
            object.correct();
        }
        else {
            result1=0;
            object.wrong1();
        }
        return result1;
    }

    int question2(){
        Quiz object = new Quiz();
        int result2;
        ImageIcon hint  = new ImageIcon("src/images/colage comp.png");
        String[] choice={"Нямам идея","Rockstar Games","Riot games","Blizzard Entertainment","Valve Corporation"};
        String n= (String) JOptionPane.showInputDialog(null,"Коя е компанията създала играта?","LOL - Question",JOptionPane.QUESTION_MESSAGE,hint,choice, choice[0]);
        if (n.equals("Riot games")){
            result2=1;
            object.correct();
        }
        else {
            result2=0;
            object.wrong2();
        }
        return result2;
    }

    int question3(){
        Quiz object = new Quiz();
        int result3;
        ImageIcon hint  = new ImageIcon("src/images/sum rift.jpg");
        String[] choice={"Нямам идея","Twisted Treeline","Summoner's Rift","Howling Abyss"};
        String n= (String) JOptionPane.showInputDialog(null,"Как се нарича най - играната League of Legends карта?","LOL - Question",JOptionPane.QUESTION_MESSAGE,hint,choice, choice[0]);
        if (n.equals("Summoner's Rift")){
            result3=1;
            object.correct();
        }
        else {
            result3=0;
            object.wrong3();
        }
        return result3;
    }

    int question4(){
        Quiz object = new Quiz();
        int result4;
        ImageIcon hint  = new ImageIcon("src/images/colage champ.jpg");
        String n= (String) JOptionPane.showInputDialog(null,"Кой герой от Shadow Isles не е мъртъв?","LOL - Question",JOptionPane.QUESTION_MESSAGE,hint,null,null);
        if (n.equalsIgnoreCase("Yorick")){
            result4=1;
            object.correct();
        }
        else {
            result4=0;
            object.wrong4();
        }
        return result4;
    }

    int question5(){
        Quiz object = new Quiz();
        int result5;
        ImageIcon hint  = new ImageIcon("src/images/Ionia.png");
        String n= (String) JOptionPane.showInputDialog(null,"В кое от кралствата живеят най - много герои?","LOL - Question",JOptionPane.PLAIN_MESSAGE,hint,null,null);
        if (n.equalsIgnoreCase("Ionia")){
            result5=1;
            object.correct();
        }
        else {
            result5=0;
            object.wrong5();
        }
        return result5;
    }

    int question6(){
        Quiz object = new Quiz();
        int result6;
        ImageIcon hint  = new ImageIcon("src/images/tomcadwell.jpg");
        String[] choice={"Нямам идея","Jayce","Brand","Jax","Zilean"};
        String n= (String) JOptionPane.showInputDialog(null,"Кой герой е кръстен на дизайн директора на компанията?","LOL - Question",JOptionPane.QUESTION_MESSAGE,hint,choice, choice[0]);
        if (n.equals("Zilean")){
            result6=1;
            object.correct();
        }
        else {
            result6=0;
            object.wrong6();
        }
        return result6;
    }

    int question7(){
        Quiz object = new Quiz();
        int result7;
        ImageIcon hint  = new ImageIcon("src/images/lord-of-the-rings.jpg");
        String[] choice={"Нямам идея","Kalista","Aatrox","Maokai","Trundle"};
        String n= (String) JOptionPane.showInputDialog(null,"Кой герой е вдъхновен от емблематичния филм \n                  \"Властелинът на пръстените\" ?","LOL - Question",JOptionPane.QUESTION_MESSAGE,hint,choice, choice[0]);
        if (n.equals("Aatrox")){
            result7=1;
            object.correct();
        }
        else {
            result7=0;
            object.wrong7();
        }
        return result7;
    }

    int question8(){
        Quiz object = new Quiz();
        int result8;
        ImageIcon hint  = new ImageIcon("src/images/colage champs 2.jpg");
        String[] choice={"Нямам идея","PAX Twisted Fate","Silver Kayle","UFO Corki","Urfwick"};
        String n= (String) JOptionPane.showInputDialog(null,"Кой е най - редкият скин в играта?","LOL - Question",JOptionPane.QUESTION_MESSAGE,hint,choice, choice[0]);
        if (n.equals("PAX Twisted Fate")){
            result8=1;
            object.correct();
        }
        else {
            result8=0;
            object.wrong8();
        }
        return result8;
    }

    int question9(){
        Quiz object = new Quiz();
        int result9;
        ImageIcon hint  = new ImageIcon("src/images/teemo.png");
        String[] choice={"Нямам идея","Ionia","Bandle City","Noxus","Void"};
        String n= (String) JOptionPane.showInputDialog(null,"От кое кралство е героят Teemo?","LOL - Question",JOptionPane.QUESTION_MESSAGE,hint,choice, choice[0]);
        if (n.equals("Bandle City")){
            result9=1;
            object.correct();
        }
        else {
            result9=0;
            object.wrong9();
        }
        return result9;
    }

    void wrong1cs() {
        ImageIcon hint = new ImageIcon("src/images/wrong1cs.png");
        String[] choice = {"Продължи"};
        System.out.println(JOptionPane.showOptionDialog(null, null, "Wrong",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, hint, choice, null));
    }

    void wrong2cs() {
        ImageIcon hint = new ImageIcon("src/images/wrong2cs.png");
        String[] choice = {"Продължи"};
        System.out.println(JOptionPane.showOptionDialog(null, null, "Wrong",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, hint, choice, null));
    }


    void wrong3cs() {
     ImageIcon hint = new ImageIcon("src/images/wrong3cs.png");
        String[] choice = {"Продължи"};
        System.out.println(JOptionPane.showOptionDialog(null, null, "Wrong",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, hint, choice, null));
    }


    void wrong4cs() {
        ImageIcon hint = new ImageIcon("src/images/wrong4cs.png");
        String[] choice = {"Продължи"};
        System.out.println(JOptionPane.showOptionDialog(null, null, "Wrong",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, hint, choice, null));
    }

    void wrong5cs() {
        ImageIcon hint = new ImageIcon("src/images/wrong5cs.png");
        String[] choice = {"Продължи"};
        System.out.println(JOptionPane.showOptionDialog(null, null, "Wrong",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, hint, choice, null));
    }


    void wrong6cs() {
        ImageIcon hint = new ImageIcon("src/images/wrong6cs.png");
        String[] choice = {"Продължи"};
        System.out.println(JOptionPane.showOptionDialog(null, null, "Wrong",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, hint, choice, null));
    }


    void wrong7cs() {
        ImageIcon hint = new ImageIcon("src/images/wrong7cs.png");
        String[] choice = {"Продължи"};
        System.out.println(JOptionPane.showOptionDialog(null, null, "Wrong",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, hint, choice, null));
    }


    void wrong8cs() {
        ImageIcon hint = new ImageIcon("src/images/wrong8cs.png");
        String[] choice = {"Продължи"};
        System.out.println(JOptionPane.showOptionDialog(null, null, "Wrong",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, hint, choice, null));
    }

    void wrong9cs() {
        ImageIcon hint = new ImageIcon("src/images/wrong9cs.png");
        String[] choice = {"Продължи"};
        System.out.println(JOptionPane.showOptionDialog(null, null, "Wrong",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, hint, choice, null));
    }
    void wrong10cs() {
        ImageIcon hint = new ImageIcon("src/images/wrong10cs.png");
        String[] choice = {"Продължи"};
        System.out.println(JOptionPane.showOptionDialog(null, null, "Wrong",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, hint, choice, null));
    }

    int question1cs() {
        Quiz object = new Quiz();
        int result1;
        ImageIcon hint = new ImageIcon("src/images/1.jpg");
        String n = (String) JOptionPane.showInputDialog(null, "Как се казва това място?", "CS:GO - Question", JOptionPane.QUESTION_MESSAGE, hint, null, null);
        if (n.equalsIgnoreCase("Palace")) {
            result1 = 1;
            object.correct();
        } else {
            result1 = 0;
            object.wrong1cs();
        }
        return result1;
    }

    int question2cs() {
        Quiz object = new Quiz();
        int result2;
        ImageIcon hint = new ImageIcon("src/images/2.png");
        String[] choice = {"Нямам идея", "1300", "1800", "1700", "2500"};
        String n = (String) JOptionPane.showInputDialog(null, "Колко струва SSG 08?", "CS:GO - Question", JOptionPane.QUESTION_MESSAGE, hint, choice, choice[0]);
        if (n.equals("1700")) {
            result2 = 1;
            object.correct();
        } else {
            result2 = 0;
            object.wrong2cs();
        }
        return result2;
    }

    int question3cs() {
        Quiz object = new Quiz();
        int result3;
        ImageIcon hint = new ImageIcon("src/images/3.png");
        String[] choice = {"Нямам идея", "7355608", "3348685", "9612463","4475891"};
        String n = (String) JOptionPane.showInputDialog(null, "Какъв е кодът на бомбата?", "CS:GO - Question", JOptionPane.QUESTION_MESSAGE, hint, choice, choice[0]);
        if (n.equals("7355608")) {
            result3 = 1;
            object.correct();
        } else {
            result3 = 0;
            object.wrong3cs();
        }
        return result3;
    }

    int question4cs() {
        Quiz object = new Quiz();
        int result4;
        ImageIcon hint = new ImageIcon("src/images/4.jpg");
        String[] choice = {"Нямам идея", "Operation Bravo case", "Operation Phoenix case", "CS:GO Weapon case", "Winter Offensive weapon case"};
        String n = (String) JOptionPane.showInputDialog(null, "Коя е първата кутия в играта?", "CS:GO - Question", JOptionPane.QUESTION_MESSAGE, hint, choice, choice[0]);
        if (n.equals("CS:GO Weapon case")) {
            result4 = 1;
            object.correct();
        } else {
            result4 = 0;
            object.wrong4cs();
        }
        return result4;
    }

    int question5cs() {
        Quiz object = new Quiz();
        int result5;
        ImageIcon hint = new ImageIcon("src/images/5.jpg");
        String[] choice = {"Нямам идея", "2011", "2012", "2013", "2008"};
        String n = (String) JOptionPane.showInputDialog(null, "През коя година излиза играта?", "CS:GO - Question", JOptionPane.QUESTION_MESSAGE, hint, choice, choice[0]);
        if (n.equals("2012")) {
            result5 = 1;
            object.correct();
        } else {
            result5 = 0;
            object.wrong5cs();
        }
        return result5;
    }

    int question6cs() {
        Quiz object = new Quiz();
        int result6;
        ImageIcon hint = new ImageIcon("src/images/6.jpg");
        String[] choice = {"Нямам идея", "ROBLOX", "GTA San Andreas", "Fortnite", "Half - Life"};
        String n = (String) JOptionPane.showInputDialog(null, "От коя игра произлиза CS:GO?", "CS:GO - Question", JOptionPane.QUESTION_MESSAGE, hint, choice, choice[0]);
        if (n.equals("Half - Life")) {
            result6 = 1;
            object.correct();
        } else {
            result6 = 0;
            object.wrong6cs();
        }
        return result6;
    }

    int question7cs() {
        Quiz object = new Quiz();
        int result7;
        ImageIcon hint = new ImageIcon("src/images/7.png");
        String[] choice = {"Нямам идея", "2250", "2300", "3000","2150"};
        String n = (String) JOptionPane.showInputDialog(null, "Колко струва автоматът \"Famas\"?", "CS:GO - Question", JOptionPane.QUESTION_MESSAGE, hint, choice, choice[0]);
        if (n.equals("2250")) {
            result7 = 1;
            object.correct();
        } else {
            result7 = 0;
            object.wrong7cs();
        }
        return result7;
    }

    int question8cs() {
        Quiz object = new Quiz();
        int result8;
        ImageIcon hint = new ImageIcon("src/images/8.png");
        String[] choice = {"Нямам идея", "90", "100", "280", "75"};
        String n = (String) JOptionPane.showInputDialog(null, "Колко патрона е капацитетът на палнителя на M4A1S?", "CS:GO - Question", JOptionPane.QUESTION_MESSAGE, hint, choice, choice[0]);
        if (n.equals("100")) {
            result8 = 1;
            object.correct();
        } else {
            result8 = 0;
            object.wrong8cs();
        }
        return result8;

    }

    int question9cs() {
        Quiz object = new Quiz();
        int result9;
        ImageIcon hint = new ImageIcon("src/images/9.jpg");
        String[] choice = {"Нямам идея", "2017", "2014", "2015", "2016"};
        String n = (String) JOptionPane.showInputDialog(null, "Коя година GS:GO печели титлата \"Игра на годината\"?", "CS:GO - Question", JOptionPane.QUESTION_MESSAGE, hint, choice, choice[0]);
        if (n.equals("2015")) {
            result9 = 1;
            object.correct();
        } else {
            result9 = 0;
            object.wrong9cs();
        }
        return result9;
    }

    int question10cs() {
        Quiz object = new Quiz();
        int result10;
        ImageIcon hint = new ImageIcon("src/images/10.png");
        String n = (String) JOptionPane.showInputDialog(null, "На коя карта e сложен графитът \"Flying AWP\"?", "CS:GO - Question", JOptionPane.QUESTION_MESSAGE, hint, null, null);
        if (n.equalsIgnoreCase("Mirage")) {
            result10 = 1;
            object.correct();
        } else {
            result10 = 0;
            object.wrong10cs();
        }
        return result10;
    }

    void wrong1h() {
        ImageIcon hint = new ImageIcon("src/images/wrong1h.png");
        String[] choice = {"Продължи"};
        System.out.println(JOptionPane.showOptionDialog(null, null, "Wrong",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, hint, choice, null));
    }

    void wrong2h() {
        ImageIcon hint = new ImageIcon("src/images/wrong2h.png");
        String[] choice = {"Продължи"};
        System.out.println(JOptionPane.showOptionDialog(null, null, "Wrong",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, hint, choice, null));
    }

    void wrong3h() {
        ImageIcon hint = new ImageIcon("src/images/wrong3h.png");
        String[] choice = {"Продължи"};
        System.out.println(JOptionPane.showOptionDialog(null, null, "Wrong",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, hint, choice, null));
    }

    void wrong4h() {
        ImageIcon hint = new ImageIcon("src/images/wrong4h.png");
        String[] choice = {"Продължи"};
        System.out.println(JOptionPane.showOptionDialog(null, null, "Wrong",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, hint, choice, null));
    }

    void wrong5h() {
        ImageIcon hint = new ImageIcon("src/images/wrong5h.png");
        String[] choice = {"Продължи"};
        System.out.println(JOptionPane.showOptionDialog(null, null, "Wrong",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, hint, choice, null));
    }

    void wrong6h() {
        ImageIcon hint = new ImageIcon("src/images/wrong6h.png");
        String[] choice = {"Продължи"};
        System.out.println(JOptionPane.showOptionDialog(null, null, "Wrong",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, hint, choice, null));
    }

    void wrong7h() {
        ImageIcon hint = new ImageIcon("src/images/wrong7h.png");
        String[] choice = {"Продължи"};
        System.out.println(JOptionPane.showOptionDialog(null, null, "Wrong",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, hint, choice, null));
    }

    void wrong8h() {
        ImageIcon hint = new ImageIcon("src/images/wrong8h.png");
        String[] choice = {"Продължи"};
        System.out.println(JOptionPane.showOptionDialog(null, null, "Wrong",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, hint, choice, null));
    }

    void wrong9h() {
        ImageIcon hint = new ImageIcon("src/images/wrong9h.png");
        String[] choice = {"Продължи"};
        System.out.println(JOptionPane.showOptionDialog(null, null, "Wrong",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, hint, choice, null));
    }

    void wrong10h() {
        ImageIcon hint = new ImageIcon("src/images/wrong10h.png");
        String[] choice = {"Продължи"};
        System.out.println(JOptionPane.showOptionDialog(null, null, "Wrong",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, hint, choice, null));
    }

    int question1h() {
        Quiz object = new Quiz();
        int result1;
        ImageIcon hint = new ImageIcon("src/images/q1h.jpg");
        String[] choice = {"Нямам идея", "Компютърно осигуряване", "Апаратно осигуряване", "Апаратно оборудване", "Нямало е термин"};
        String n = (String) JOptionPane.showInputDialog(null, "Преди появата на думата \"Hardware\" се е използвал терминът:", "Hardware - Question", JOptionPane.QUESTION_MESSAGE, hint, choice, choice[0]);
        if (n.equals("Апаратно осигуряване")) {
            result1 = 1;
            object.correct();
        } else {
            result1 = 0;
            object.wrong1h();
        }
        return result1;
    }

    int question2h() {
        Quiz object = new Quiz();
        int result2;
        ImageIcon hint = new ImageIcon("src/images/q2h.png");
        String n = (String) JOptionPane.showInputDialog(null, "Каква е абревиатурата за процесор?", "Hardware - Question", JOptionPane.QUESTION_MESSAGE, hint, null,null);
        if (n.equalsIgnoreCase("CPU")) {
            result2 = 1;
            object.correct();
        } else {
            result2 = 0;
            object.wrong2h();
        }
        return result2;
    }

    int question3h() {
        Quiz object = new Quiz();
        int result3;
        ImageIcon hint = new ImageIcon("src/images/q3h.png");
        String[] choice = {"Нямам идея", "Controlling Point Unit", "Central Processing Unit", "Controlling Point Ultra", "Central Point of Utility"};
        String n = (String) JOptionPane.showInputDialog(null, "Какво означава абревиатурата \"CPU\"?", "Hardware - Question", JOptionPane.QUESTION_MESSAGE, hint, choice, choice[0]);
        if (n.equals("Central Processing Unit")) {
            result3 = 1;
            object.correct();
        } else {
            result3 = 0;
            object.wrong3h();
        }
        return result3;
    }

    int question4h() {
        Quiz object = new Quiz();
        int result4;
        ImageIcon hint = new ImageIcon("src/images/q4h.jpg");
        String[] choice = {"Нямам идея", "Херцове(Hz)", "Джаули(J)", "Волтове(V)", "Ватове(W)"};
        String n = (String) JOptionPane.showInputDialog(null, "В коя мерна единица се измерва мощността на процесора?", "Hardware - Question", JOptionPane.QUESTION_MESSAGE, hint, choice, choice[0]);
        if (n.equals("Херцове(Hz)")) {
            result4 = 1;
            object.correct();
        } else {
            result4 = 0;
            object.wrong4h();
        }
        return result4;
    }

    int question5h() {
        Quiz object = new Quiz();
        int result5;
        ImageIcon hint = new ImageIcon("src/images/q5h.png");
        String[] choice = {"Нямам идея", "Personal Controlling Interface", "Presenter of Critical Information", "Presenter of Crucial Issues", "Personal Computer Interface"};
        String n = (String) JOptionPane.showInputDialog(null, "Какво означава абревиатурата \"PCI\"?", "Hardware - Question", JOptionPane.QUESTION_MESSAGE, hint, choice, choice[0]);
        if (n.equals("Personal Computer Interface")) {
            result5 = 1;
            object.correct();
        } else {
            result5 = 0;
            object.wrong5h();
        }
        return result5;
    }

    int question6h() {
        Quiz object = new Quiz();
        int result6;
        ImageIcon hint = new ImageIcon("src/images/q6h.png");
        String n = (String) JOptionPane.showInputDialog(null, "Каква е абревиатурата за видео карта?", "Hardware - Question", JOptionPane.QUESTION_MESSAGE, hint, null,null);
        if (n.equalsIgnoreCase("GPU")) {
            result6 = 1;
            object.correct();
        } else {
            result6 = 0;
            object.wrong6h();
        }
        return result6;
    }

    int question7h() {
        Quiz object = new Quiz();
        int result7;
        ImageIcon hint = new ImageIcon("src/images/q7h.png");
        String[] choice = {"Нямам идея", "Graphics Processing Utility", "General Processed Unit", "Graphics Processing Unit", "General Processed Utility"};
        String n = (String) JOptionPane.showInputDialog(null, "Какво означава абревиатурата \"GPU\"?", "Hardware - Question", JOptionPane.QUESTION_MESSAGE, hint, choice,choice[0]);
        if (n.equals("Graphics Processing Unit")) {
            result7 = 1;
            object.correct();
        } else {
            result7 = 0;
            object.wrong7h();
        }
        return result7;
    }

    int question8h() {
        Quiz object = new Quiz();
        int result8;
        ImageIcon hint = new ImageIcon("src/images/q8h.png");
        String n = (String) JOptionPane.showInputDialog(null, "Каква е абревиатурата за твърд диск?", "Hardware - Question", JOptionPane.QUESTION_MESSAGE, hint, null,null);
        if (n.equalsIgnoreCase("HDD")) {
            result8 = 1;
            object.correct();
        } else {
            result8 = 0;
            object.wrong8h();
        }
        return result8;
    }

    int question9h() {
        Quiz object = new Quiz();
        int result9;
        ImageIcon hint = new ImageIcon("src/images/q9h.png");
        String n = (String) JOptionPane.showInputDialog(null, "Каква е абревиатурата за захранващ блок(захранване)?", "Hardware - Question", JOptionPane.QUESTION_MESSAGE, hint, null,null);
        if (n.equalsIgnoreCase("PSU")) {
            result9 = 1;
            object.correct();
        } else {
            result9 = 0;
            object.wrong9h();
        }
        return result9;
    }

    int question10h() {
        Quiz object = new Quiz();
        int result10;
        ImageIcon hint = new ImageIcon("src/images/q10h.png");
        String[] choice = {"Нямам идея", "8 физически и 4 логически", "4 физически и 8 логически", "2 физически и 4 логически", "4 физически и 4 логически"};
        String n = (String) JOptionPane.showInputDialog(null, "Колко ядра има процесорът \"i7 7700?", "Hardware - Question", JOptionPane.QUESTION_MESSAGE, hint, choice,choice[0]);
        if (n.equals("4 физически и 8 логически")) {
            result10 = 1;
            object.correct();
        } else {
            result10 = 0;
            object.wrong10h();
        }
        return result10;
    }
}

