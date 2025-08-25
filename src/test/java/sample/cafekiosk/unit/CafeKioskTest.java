package sample.cafekiosk.unit;

import org.junit.jupiter.api.Test;
import sample.cafekiosk.unit.beverage.Americano;

import static org.junit.jupiter.api.Assertions.*;

class CafeKioskTest {
    @Test
    void add() {
        CafeKiosk cafeKiosk = new CafeKiosk();
        cafeKiosk.add(new Americano());

        // 최종 단계에서 사람이 개입 + 새로운 개발자가 테스트 코드를 봤을 때, 무엇을 검증하는 지 알 수 없음.
        // 수동 테스트 vs. 자동화된 테스트
        System.out.println(">>> 담긴 음료 수 : " + cafeKiosk.getBeverages().size());
        System.out.println(">>> 담긴 음료 수 : " + cafeKiosk.getBeverages().getFirst().getName());
    }
}