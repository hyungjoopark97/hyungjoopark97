package com.ohgiraffers.section01.conditional;

public class Application1 {
    public static void main(String[] args) {

        A_if a = new A_if();
        /*단독 if 문 흐름 확인용 메소드 출력*/
        // a.testSimpleIfStatement();

        /* 중첩 if문 흐름 확인용 메소드 출력 */
        // a.testNestedIfStatement();

        B_ifElse b = new B_ifElse();
        // b.simpleIfElsestatement();

        /* 중첩 if-else 문 호출 확인용 메소드 호출 */
        // b.testNeatedIfElseStatement();

        C_ifElseIf c = new C_ifElseIf();
        /* if else if 문 호출 확인용 메소드 호출 */
        // c.testSimpleIfElseifStatement();

        // c.testNestedIfElseIfStatement();

        D_switch d = new D_switch();
        //d.testSimpleSwitchStatement();
        //d.testSwitchVendingMachine();













    }


}
