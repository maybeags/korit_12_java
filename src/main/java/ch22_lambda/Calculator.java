package ch22_lambda;

@FunctionalInterface        // 얘가 함수형인터페이스형이라는 것을 명시
public interface Calculator {
    int compute(int a, int b);
}
