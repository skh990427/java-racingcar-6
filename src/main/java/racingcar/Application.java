package racingcar;

import camp.nextstep.edu.missionutils.Console;
import domain.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        List<Car> carList = new ArrayList<>();

        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        StringTokenizer token = new StringTokenizer(Console.readLine(), ",");

        while (token.hasMoreTokens()) {
            carList.add(new Car(token.nextToken()));
        }

    }
}
