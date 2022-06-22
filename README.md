# 2022-AdvancedJAVA

## 2022년 1학기 고급자바 과제

## 문성현 교수님

## 중간고사 정리 -> 파일로 다시 올리기

## 자바 시작하기

### 프로그래밍 언어

의미: 컴퓨터와 인간 사이를 연결할 수 있는 매개체로 컴퓨터에 작업을 시키기 위한 도구이다.

* 기계어인 저급언어부터 자연어에 가까운 고급언어까지 다양하다.

* 프로그래밍 언어라고 하면 보통 고급언어를 의미한다. (C, C++, Java 등)

* 고급언어로 작성한 소스 코드는 컴파일러(Compiler)라는 시스템 소프트웨어를 이용해 먼저 기계어(0과 1로 이루어짐.)로 구성된 실행 코드를 변환한다.

+) 컴파일러: 자연어를 어셈블리어(니모닉 언어: 상징적인 언어)로 변환해준다. 

+) 어셈블러: 어셈블리어를 기계어로 변환해준다.

+) 인터프리터: 컴파일러 같은 번역기로 대표적인 인터프리터 언어는 html

+) 인터프리터 VS 컴파일러

차이점: 인터프리터는 line by line 번역기로 한 문장씩 번역된다. (느린 방식)

    컴파일러는 전체를 읽고 실행 된다. (빠른 방식)

=> 자바는 인터프리터, 컴파일러가 둘 다 되는 언어로 Java virtualMachine이 바이트 코드를 실행한다.

## 자바소개

제임스 고슬링이 1991년에 가정용 전자 제품에 사용할 수 있는 컴퓨터 언어를 설계하기 원해 만들어짐.

특징

단순하고 안전하고 객체지향적이며 분산처리가 가능하고, 멀티 스레드를 지원하고 인터프리터 언어이며 이식성을 가진다. 객체 지향의 하나의 효과로 동적일 수 있으며, 가장 특징적인 부분은 구조 중립적이라는 것이다.

코어가 여러개면 한번에 여러가지 일이 가능하다. -> java는 언어도 가능하게 만들었다.

버전별 특징

자바7: 타입 추론 기능(반환 값 유추 기능)

자바8: 람다식, 인터페이스의 디폴트 메소드, Optional타입, DateTime, 함수프로그래밍

### 자바로 만들 수 있는 것

* 자바 애플리케이션(application): 독립적으로 실행될 수 있는 일반 응용 프로그램

* 자바 애플릿(applet): 웹 브라우저 안에서 실행되는 작은 프로그램

* 자바 서블릿(servlet): 웹 서버에서 동작하는 서버모듈이다.

* 안드로이드 애플리케이션

### 자바 가상 머신 (Java Virtual Machine)

C, C++은 플랫폼에 의존적으로 운영체제나 CPU가 다르면 실행이 불가능하다.

하지만 Java는 자바 가상 머신을 통해 특정한 컴퓨터를 위한 코드를 바로 생성하지 않고 가상적인 컴퓨터의 기계어인 바이트 코드(byte code)를 생성한다. 바이트 코드는 자바 가상 기계(소프트웨어)에 의해 한 줄씩 해석되면서 특정한 컴퓨터에서 실행 된다. 

자바 소스 -> 컴파일러(가상 기계의 명령어로 변환) -> 바이트 코드 -> 자바 가상 기계 (가상 기계의 명령어-> 실제 기계 명령어로 변환)

=> 자바 가상 머신은 번역기라고 생각하면 된다.

JAVA SE 8: 함수형 프로그래밍 지원 ( 우리가 앞으로 배우는 것들 같다! )

Java 버전 8에서 추가된 중요한 특징들

* 함수형 프로그래밍의 지원

* 람다식

* 작은 가상 기계 (VM)

* 병렬 배열 정렬

* 컬렉션을 위한 대용량 데이터 처리

* Base 64 인코딩과 디코딩을 위한 표준 API

* 새로운 날짜, 시간 API

* 강화된 패스워드 기반 암호화 (보안 강화 PBE)

JAVA SE 9: 모듈화 프로그래밍

모듈화의 목적은 자바 응용 프로그램을 만들 때 직소 퍼즐을 연결하듯 필요한 모듈만을 묶어 사용하는 것이다.

## 인터페이스와 특수 클래스

### 추상클래스

추상 메소드

메서드 본체를 완성하지 못한 메서드로 무엇을 할 지 선언은 가능하지만 어떻게 하는지 정의는 할 수 없다.

추상 메소드 선언하는 방법

’’’
abstract 반환타입 메서드이름() ;    // 메서드의 본체가 없이 abstract로 추상 메소드라는 것을 나타낸다.
’’’

추상 클래스

보통 하나 이상의 추상 메소드를 포함하지만 없을 수도 있다.

주로 상속 계층에서 자식 멤버 (필드, 메소드)의 이름을 통일하기 위하여 사용한다.

’’’
추상 클래스 s = new 추상클래스();    // 추상 클래스는 인스턴스를 생성하지 못한다.
’’’

따라서 추상클래스를 선언하는 방법이다.

’’’
abstract class 클래스 이름 {
    // 필드
    // 생성자
    // 메서드
}
’’’

### 인터페이스 기초

인터페이스 의미

다른 클래스를 작성할 때 기본이 되는 틀을 제공하면서, 다른 클래스 사이의 중간 매개 역할까지 담당하는 일종의 추상클래스이다.

즉, 자바의 다형성을 극대화시켜 개발 코드의 수정을 줄이고 프로그램의 유지보수성을 높이기 위해 인터페이스를 사용한다.

### 인터페이스에 의한 장점

인터페이스만 준수하면 통합에 신경 쓰지 않고 다양한 형태로 새로운 클래스를 개발할 수 있다.

클래스의 다중상속을 지원하지 않지만, 인터페이스로 다중 상속 효과를 간접적으로 얻을 수 있다.

### 인터페이스 VS 추상 클래스

분류

인터페이스 // 추상 클래스 

구현 메서드

포함 불가 (단, 디폴트 메소드와 정적 메소드는 예외) //포함가능 (실제로는 사용하지 않음.)

인스턴스 변수

포함 불가 // 포함 가능

다중 상속

가능 // 불가능

디폴트 메서드

선언 가능 // 선언 불가능

생성자와 main()

선언 불가능 // 선언 가능

상속에서의 부모

인터페이스 // 인터페이스, 추상 클래스

접근 범위

모든 멤버를 공개 // 추상 메서드를 최소한 자식에게 공개



### 인터페이스의 예

자바가 기본적으로 제공하는 인터페이스는 다양하다.


대표적인 자바에서 제공되는 인터페이스 

1) java.lang 패키지의 CharSequence, Comparable, Runnable 등

2) java.util 패키지의 Collection, Comparator, List 등

위의 제공되는 인터페이스 중 Comparable 인터페이스의 예시 (객체의 크기를 비교)

’’’
public interface Comparable {
    int compareTo(Object other);    // 객체 other보다 크면 양수, 같으면 0, 작으면 음수 반환
}

public interface Comparable<T> {
    int compareTo(T o);
}
’’’

### 인터페이스 구조
’’’
interface 인터페이스 이름 {
    // 상수 필드        -> 상수만 가능하기 때문에 public static final 키워드 생략 가능
    // abstract 메소드    -> 인터페이스의 모든 메소드가 public abstract이기 때문에 키워드 생략 가능

    // 아래는 JDK 8부터 가능함.

    // default 메소드
    // static 메소드
    // private 메소드
}
’’’

### 디폴트(default) 메소드와 정적(static) 메소드

default 메소드는 오버라이딩이 될 수 있지만 static 메소드는 오버라이딩이 될 수 없다.

=> default 메소드는 implements한 클래스에서 @Override로 재정의 할 수 있지만, static 메소드는 @Override로 재정의 할 수 없다.

default 메소드는 인스턴스 메소드이므로 객체를 생성한 후 호출하지만, static 메소드는 인터페이스로 직접 호출한다.

=> default 메소드는 참조변수를 이용해 호출이 가능하다. 재정의 했을 경우 재정의한 메소드가 호출된다. static 메소드는 “클래스명.static메소드();” 로만 호출이 가능하다. “참조변수.static 메소드();”를 호출하면 에러가 발생한다.

default메소드와 static 메소드는 interface에서 메소드 구현이 가능하다.

인스턴스 메소드: 인스턴스 변수와 관련된 작업을 하는 메소드이다. 즉, 메소드의 작업을 수행하는데 인스턴스를 필요로 하는 메소드이다. 

### 인터페이스의 구조

* 인터페이스 멤버에 명시된 public, static, final abstract 키워드는 생략 가능하다.

* 생략한 키워드는 컴파일 과정에서 자동으로 추가 된다.

* 인터페이스 파일 확장자는 .java 이다.

* 컴파일하면 확장자가 class인 파일을 생성한다.

’’’
interface MyInterface {
    int Max = 10;        // 상수 필드 (public static final)
    void sayHello();    // 추상 메소드
}
’’’
MyInterface.java

⬇️

’’’
interface MyInterface {
    public static final int Max = 10;
    public abstract void sayHello();
}
’’’
MyInterface.class


### 인터페이스 상속

인터페이스를 상속하려면 extends 키워드를 사용한다.

’’’
interface 자식인터페이스 extends 부모인터페이스 {
}
’’’
’’’
인터페이스를 구현하려면 implements 키워드를 사용한다.
class 자식 클래스 implements 부모 인터페이스 {
}
’’’

+) 다중상속
’’’
interface 자식인터페이스 extends 부모인터페이스1,부모인터페이스2  {
}
’’’

’’’
class 자식 클래스 implements 부모인터페이스1, 부모인터페이스2 {
}
’’’

’’’
class 자식 클래스 extends 부모 클래스 implements 부모인터페이스1, 부모인터페이스2 {
}
’’’

+) 클래스의 다중 상속은 불가능

’’’
// 안되는 예시 
class 자식클래스 extends 부모클래스1, 부모클래스2 {
}
’’’

### 인터페이스 응용

인터페이스의 상속과 구현 클래스

’’’
public interface Controllable {
    default void repair() {
    show(“수리한다.”);
}
static void reset() {
    System.out.println(“초기화”);
}
private void show(String s){
    System.out.println(s);
}

void turnOn();
void turnOff();
}
’’’

’’’
public interface Remote Controllable extends Controllable {
    void remoteOn();
    void remoteOff();
}
’’’
’’’
public class TV implements Contorllable {
    @Override
    public void turnOn() {
    System.out.println(“TV 켠다.”);
    }

    @Override
    public void turnOff() {
    System.out.println(“TV 끈다.”);
    }
}
’’’
’’’
public class Computer implements Controllable {
    public void turnOn() {
    System.out.println(“컴퓨터 켠다.”);
    }
    public void turnOff() {
    System.out.println(“컴퓨터 끈다.”);
    }
}
’’’

’’’
public class CintrollableDemo {
    public static void main(String[] args) {
    TV tv = new TV();
    Computer com = new Computer();
    
    tv.turnOn();                // TV 켠다.
    tv.turnOff();                // TV 끈다.
    tv.repair();                // 수리한다.
    com.turnOn();                // 컴퓨터를 켠다.
    com.turnOff();                // 컴퓨터를 끈다.
    com.repair();                // 수리한다. 
    Controllable.reset();            // 초기화
    }
}
’’’

### 인터페이스와 다형성

인터페이스 타입

인터페이스는 클래스처럼 하나의 타입으로 변수를 인터페이스 타입으로 선언 가능

인터페이스의 구현클래스는 그 인터페이스의 자식 타입

=> 인터페이스타입 변수 = 구현객체

* 구현 객체는 인터페이스 타입으로 자동 변환 된다.

인터페이스 타입 변수가 구현 객체를 참조한다면 강제 타입 변환 가능

=> 구현클래스타입 변수 = (구현클래스타입) 인터페이스타입변수

* 구현클래스타입: 타입 변환 연산자, 인터페이스타입변수: 인터페이스 구현 객체를 참조하는 변수

### 중첩 클래스와 중첩 인터페이스
  
외부 클래스 접근

외부클래스.this

중첩 클래스의 객체 생성

외부클래스.내부클래스 변수 = 외부클래스의 객체변수.new 내부클래스생성자();

외부클래스.정적멤버클래스 변수 = new 외부클래스.정적멤버클래스생성자();

익명 클래스

중첩 클래스의 특수한 형태로 코드가 단순해지기 때문에 이벤트 처리나 스레드 등에서 자주 사용


### 람다식과 함수형 인터페이스

함수형 프로그래밍의 소개

함수형 프로그래밍 지원은 java 8부터 시작 됨.

java 8부터 람다식, Stream API, 컬렉션 API향상, 디폴트 메소드와 정적 메소드, forEACH() apthem, Concurrency API향상, Java Time API 등이 지원 된다.

### 프로그래밍 패러다임 분류

명령형 VS 선언적 프로그래밍

선언적 프로그래밍은 해야 할 일에 초점을 맞춰 함수들이 계속 적용이 되면서 작업이 진행된다. 그리고 명령문이 아닌 수식이나 함수 호출로 이루어진다. (ex) 샌드위치 주세요.)

명령형 프로그래밍은 하나하나 다 명령 해줘야됨. (ex) 서브웨이에서 샌드위치 주문할 때)

### 람다식 기초

미국 수학자 알론조 처치가 함수를 분명하고 간결한 방법으로 설명하기 위해 고안.

나중에 실행할 목적으로 다른 곳에 전달할 수 있는 코드이다.

익명의 클래스를 단순화해 그 표현식을 메서드의 인수로 전달하거나 인터페이스의 객체를 생성할 수 있는 기능을 제공한다.

“동적 매개 변수화”를 사용해 코드를 전달하면 코드의 빈번한 요구 사항을 변경에 대처가 유용하다.

의미: 메소드를 포함하는 익명 구현 객체를 전달할 수 있는 코드

특징

* 메소드와 달리 이름이 없다.

* 메소드와 달리 특정 클래스에 종속되지 않지만, 매개변수, 반환 타입, 본체를 가지며, 예외도 처리할 수 있다.

* 메소드의 인수로 전달될 수 있고 변수에 대입될 수 있다.

* 익명 구현 객체와 달리 메서드의 핵심 부분만 포함한다.


문법

메소드 참조

전달할 동작을 수행하는 메소드가 이미 정의된 경우에 표현할 수 있는 람다식의 축약형

메소드 참조의 종류와 표현 방식

정적 메소드 참조 => 클래스이름 :: 정적메서드

인스턴스 메소드 => 객체이름 :: 인스턴스메소드    // 클래스이름 :: 인스턴스메소드

생성자 참조 => 클래스이름 :: new    // 배열타입이름 :: new

람다식의 필요성

하나의 Rectangle 클래스를 정의하면 사각형 객체끼리 비교할 수 없다.

문제점: 복잡하고 가독성이 떨어진다. Rectangle 클래스에 색상, 사각형 번호와 같은 다른 속성도 있다면 정렬 메서드를 수정하거나 새로운 메소드를 추가하는 것이 필요하다.

그러나 객체끼리 비교할 기준이 여러가지라면 비교 기준마다 Comparable 구현 클래스를 따로 정의해야된다.

비교 기준을 포함할 클래스가 최종 클래스라면 Comparable 구현 클래스를 정의할 수 없다.

정렬 메서드 구현 

객체 비교 및 정렬

자바는 비교할 수 있는 객체를 생성하기 위해 Comparable 인터페이스를 제공한다.
’’’
public interface Comparable <T> {
    int compareTo(T o);
}
’’’

java.util 패키지의 Arrays 클래스는 sort()라는 정적 메서드를 제공한다.

static void Arrays.sort(Object[] a);

Object[] a -> 배열 월소가 Comparable 타입이어야한다.



동작 매개 변수화(behavior parameterization)

고객의 빈번한 요구 사항 변경을 처리할 수 있는 소프트웨어 개발 패턴

이 방법에서는 사용자의 요구를 담은 코드 블록을 생성하고 이것을 프로그램의 다른 부분에 전달하는 것

예시

영업사원: 자동차 재고를 저장하고 검색할 수 있는 것을 원함.

흰색 자동차를 찾는 기능

자동차 가격이 5000만원 이하 자동차를 찾는 기능

색상이 흰색으로 5000만원 이하인 자동차를 찾는 기능

개발자: 이러한 변화하는 요구 사항에 부응하면서 최소한의 노력으로 구현 및 유지 관리가 간단한 방법을 사용해야됨.

버전 1)

매개변수 없음: 매개변수가 없이 흰색 자동차만 추려서 리스트로 만들어 반환

버전2) 

값 매개 변수화: 색상을 매개 변수화하고 메소드에 색상을 나타내는 매개 변수를 추가

버전3)

동작 매개 변수화 : 자동차의 속성을 검사해 true, false로 반환하는 함수를 작성해 메소드로 전달

버전4)
익명 클래스 사용: 


버전5)
람다식 사용: 

람다 표현식으로 전환


## 함수형 인터페이스

의미: 하나의 추상 메소드만을 가진 인터페이스

분류: 매개 값 -> 함수형 인터페이스 -> 반환 값

함수형 인터페이스 종류

Predicate (Bi, Double, Int, Long을 접두어로 붙인 변종이 있음.)

Predicate<T> p = t -> { T 타입 t 객체를 조사하여 논릿값으로 반환하는 실행문; };


Consumer (Bi, Double, Int, Long, ObjDouble, ObjInt, ObLong를 접두어로 붙인 변종이 있음.)

Consumer<T> c = t -> { T 타입 t 객체를 사용한 후 void를 반환하는 실행문; };


Supplier (Double, Int 등을 접두어로 붙인 변종이 있음.)

Supplier<T> s = () -> { T 타입 t 객체를 사용한 후 void를 반환하는 실행문; };


Function (Bi, Double, IntToDouble, ToDoubleBi 등을 접두어로 붙인 변종이 있음.)

Function<T, R> f = t -> { T 타입 t 객체를 사용한 후 void를 반환하는 실행문; };


Operator (Operator라는 인터페이스는 없고 Binary, Unary, Double, Int, Long을 접두어로 붙인 변종만 있다.)

BinaryOperator<T> o = (x, y) -> { T 타입 t 객체를 사용한 후 void를 반환하는 실행문; };


Comparator 인터페이스

객체에 순서를 정하기 위하여 사용되는 함수형 인터페이스

compare()라는 추상 메소드 외에도 유용한 정적 메서드와 디폴트 메서드를 제공하며, 메서드의 반환 타입은 모두 Comparator<T> 타입


### 함수형 인터페이스와 람다식

람다식과 함수형 인터페이스는 분리할 수 없는 관계이다. 컴파일러는 람다식을 올바르게 컨파일하려면 함수형 인터페이스가 정의되어야 한다.

=> 람다식을 사용하려면 누군가가 먼저 람다식을 위한 함수형 인터페이스를 정의해야된다.


## 컬렉션 프레임워크

컬렉션(Collection) 프레임워크 기초

의미

* 유사한 객체의 집단을 효율적으로 관리할 수 있도록 컬렉션 프레임워크를 제공 

* 컬렉션: 데이터를 한곳에 모아 편리하게 저장 및 관리하는 가변 크기의 객체 컨테이너

* 컬렉션 프레임워크: 객체를 한 곳에 모아 효율적으로 관리하고 편리하게 사용할 수 있도록 제공하는 환경

필요성

* 유사한 객체를 여러개 저장하고 조작해야 할 때가 빈번

* 고정된 크기의 배열의 불편함을 연결리스트로 해결

구조

* 컬렉션 프레임워크: 인터페이스와 클래스로 구성

* 인터페이스는 컬렉션에서 수행할 수 있는 각종 연산을 제네릭 타입으로 정의해 유사한 클래스에 일관성 있게 접근하게 함

* 클래스는 컬렉션 프레임워크 인터페이스를 구현한 클래스

* java.util 패키지에 포함된다.


### 컬렉션(Collection) 인터페이스

주요 메소드

### 유용한 디폴트 메소드를 제공

default void forEach (Consumer<? super T> action)

default boolean removeIF (Predicate <? super E> filter)

default <T> T[] to Array (IntFunction <T[]> generator)

### 컬렉션의 반복 처리

* ArrayList에 문자열을 저장했다가 꺼내는 다양한 방법

’’’
String a[] = new String[] {“A”, “B”, “C”, “D”, “E”};
List<String> list = Arrays.asList(a);
’’’

### for 구문 사용
’’’
for(int i=0; i<list.size(); i++)
    System.out.println(list.get(i));
’’’

### for-each 구문 사용
’’’
for (String s: list)
    System.out.println(s);
’’’

### Collection 인터페이스는 iterator() 메소드 사용

### iterator 인터페이스가 제공하는 주요 메소드

반복자는 되돌리기 기능이 없다.

List 컬렉션

순서가 있는 객체를 중복 여부와 상관없이 저장하는 리스트 자료구조를 지원.

배열과 유사하지만 크기가 가변적이다.

순서가 있어 원소를 저장하거나 읽어올 때 인덱스를 사용한다.


디폴트 메소드

default void replaceAll (UnaryOperator<E> operator)

default void sort (Comparaotr<? super E> c)


팩토리 메소드

static <E> List<E> of (E … elements)

List타입과 배열사이에는 다음 메소드를 사용해 상호 변환

public static <T> List <T> asList ( T … a)        // java.util.Arrays 클래스의 정적 메소드

<T> T[ ] toArray(T [ ] a)                // java.util.List 클래스의 메소드


대표적인 List 구현 클래스: ArrayList, Vector, LinkedList, Stack

ArrayList 클래스: List 컬렉션처럼 인덱스로 객체를 관리한다. List 컬렉션과 차이점으로는 크기를 동적으로 늘릴 수 있다.


Vector 클래스: Vector클래스는 ArrayList와 동일한 기능을 제공하지만 ArrayList와 달리 동기화 된 메서드로 구현해 스레드에 안전하지만 성능이 떨어질 수 있다.


Stack 클래스: 후입선출 방식으로 객체를 관리하며, Vector의 자식클래스이다. 대부분의 인덱스가 0부터 시작하지만 stack 클래스는 1부터 시작한다.


LinkedList 클래스와 ArrayList 클래스 차이 


Queue 컬렉션

선입선출 방식을 지원하고 입구와 출구를 후단(tail)과 전단(head)라고 하며, tail에서 원소를 추가하고 head에서 원소를 제거 한다.

중간에 원소를 추가하거나 제거할 수 없다.

추가된 메소드


Set 컬렉션

순서가 없으며, 중복되지 않는 객체를 저장하는 자료구조를 지원한다.

추가된 메소드는 없지만 중복 원소를 배제한다.

인덱스가 없어 저장이 되는 순서는 무시한다.


Set 컬렉션의 같은 객체


Set 팩토리 메소드

static <E> Set<E> of (E … elements)

대표적인 Set: hashSet, TreeSet


## 맵(Map) 인터페이스

특징

키와 값, 이렇게 쌍으로 구성된 객체를 저장하는 자료구조이다.

맵이 사용하는 키와 값도 모두 객체이다.

키는 중복되지 않고 하나의 값에만 매핑되어 있으므로 키가 있으면 대응하는 값을 얻을 수 있다.

Map 객체에 같은 키로 중복 저장되지 않도록 하려면 Set 객체처럼 키로 사용할 클래스에 대한 hashCode() 와 equals() 메소드를 오버로딩 해야 한다.

### 구현 클래스

HashMap, Hashtable, TreeMap, Properties

### Map 인터페이스가 제공


### Map.Entry<K, V> 인터페이스 제공


### 팩토리 메소드
static <K, V> Map<K, V> of (K k1, V v1)


### 디폴트 메소드

default void forEach(BiConsumer action)

default void replaceAll(BiFunction function)


### HashMap과 Hashtable

Hashtable은 HashMap과 달리 동기화 된 메소드로 구현되어 스레드에 안전하다.

HashMap에서는 키와 값으로 null을 사용할 수 있지만 Hashtable에서는 사용할 수 없다.


## 컬렉션(Collection) 클래스

특징

* 컬렉션을 다루는 다양한 메소드를 제공하는 java.util 패키지의 클래스

* 컬렉션 원소 정렬, 섞기, 탐색 등 문제를 쉽게 해결할 수 있다.

정렬

static void reverse(List list) // static void sort(List list) // static void sort(List list, Comparator c)
static Comparator reverseOrder() // static Comparator reverseOrder(Comparator c)

돌리기 및 섞기

static void rotate(List<?> list, int distance) // static void shuffle(List<?> list)  

// static void shuffle(List<?> list, Random r)

탐색하기 

static <T> int binarySearch(List<T> list, T key)

// static <T> int binarySearch(List<T> list, T key, Comparator<T> c)

기타 메소드


## 스트림

스트림이란

JDK 8부터 새롭게 추가된 기능으로 데이터 집합체를 반복적으로 처리한다.

스트림을 이용하면 다수의 스레드 코드를 구현하지 않아도 데이터를 병렬로 처리한다.

스트림은 스트림 데이터와 스트림 연산의 개념을 모두 포함한다.

### 컬렉션과 스트림 구분

* 컬렉션: 데이터의 공간적 집합체    // 스트림: 데이터의 시간적 집합체

* 컬렉션: 데이터 원소의 효율적인 관리와 접근에 맞게 설계    // 스트림: 데이터 원소에서 수행할 함수형 연산에 맞게 설계 (=> 원소에 직접 접근하거나 조작하는 수단을 제공하지 않음.)

* 스트림을 사용하면 코드가 간단해지고 오류 발생 확률이 줄어든다. (체이닝 기법처럼 메소드 뒤에 메소드가 오는 것!)


### 스트림 종류와 생성

종류

baseStream (객체 스트림: Stream, 숫자 스트림: IntStream, LongStream, DoubleStream)

숫자스트림과 객체 스트림 차이

* 숫자스트림: 평균, 합계를 반환(집계연산자)하는 메소드가 있고 데이터 스트림의 기본 통계 용약 내용을 나타내는 summaryStatistics() 메소드를 제공한다.

* 객체 스트림: 최종 연산이 Optional 타입을 반환    // 숫자 스트림: OptionalInt 타입,OptionalLong 타입,  OptionalDouble 타입을 반환

* 객체 스트림으로 숫자 스트림을 만들 수 있지만 성능이 떨어지고 average나 sum을 사용할 수 없다.

IntStream => Stream<Integer>    // 사용가능


생성

### 컬렉션으로 부터 스트림을 생성한다.

default Stream<E> stream()

default Stream<E> paralleStream()


list.stream() // 가능


### 배열로부터 스트림 생성 (각자에 맞춰 import를 해줘야 생성 가능)

* Arrays 클래스 제공

static IntStream stream(int[] array)

static IntStream of(int … values)

* Stream 인터페이스 제공

static <T> Stream of (T … values)

* IntStream 인터페이스 제공

static IntStream of (int …values)


### 기타 데이터로부터 스트림 생성

* Random의 ints(), longs(), doubles()

* 숫자 스트림과 객체 스트림의 iterate(), generate()

* IntStream, LongStream의 range(), rangeClosed()

* 입출력 파일이나 폴더로부터도 스트림을 생성


### 스트림 연산과 옵션 타입

스트림 파이프라인 (체이닝 기법)

스트림 연산의 결과가 Stream 타입이면 연속적으로 호출할 수 있다.

스트림 연산의 연속 호출은 여러개의 스트림이 연결되어 스트림 파이프라인을 형성한다.


### 느긋한 연산과 조급한 연산

* 느긋한 연산: 조급한 연산이 데이터 소스에게 원소를 요구할 때까지 아무 연산도 수행하지 않고 기다린다.

* 스트림의 최종연산은 조급한 연산이지만 중간 연산은 느긋한 연산이다.

* 최종 연산이 호출되기 전까지 중간 연산은 아무런 작업을 수행하지 않는다. (최종 연산은 값이 필요해!! -> 중간 연산이 실행 돼!)
* 스트림의 중간 연산이 느긋한 연산이니 다운로드 방식처럼 저장 공간이 따로 필요없어 빅데이터나 무한 스트림에도 대응할 수 있다. (최종 연산이 되기 전에 실행되지 않으니 공간이 필요 없다!!)

* 최종 연산은 반환타입이 스트림이 아니다!! ( 반환 타입이 스트림이면 느긋한 연산!!)

* forEach 실행 -> sorted -> filter


병렬 처리

* 멀티 코어 CPU를 제대로 활용해 데이터 소스를 병렬로 처리할 수 있도록 병렬 스트림도 지원한다.

* 병렬 스트림은 컬렉션 혹은 순차 스트림으로 부터 parallelStream() 혹은 parallel() 메소드를 호출해 획득한다.

* 스트림을 부분 스트림으로 분할하기 어렵거나 데이터 소스의 크기가 작거나 혹은 싱글 코어 CPU라면 오히려 성능이 나빠질 수 있다.

=> 예외를 제외하고는 병렬처리가 순차처리보다 시간이 빠르다.

옵션 타입 (JAVA 8 이후에 나온 개념)

* String는 Date는 상속관계가 아닌데 null을 사용할 수 있다.

String s = null;    // Date d = null;

* java.util 패키지 소속이다.

* Optional은 null을 사용하지 않고, 부재 값을 포함한 데이터를 저장하는 클래스이다. 값을 존재 여부에 따라 다양하게 처리할 수 있는 기능을 제공한다.

* 종류

Optional, OptionalInt, OptionalLong, OptionalDouble

예제를 보며 이해하는게 좋다.



* 예제

스트림 활용 - 필터링

입력된 스트림 원소 중 일부 원소를 걸러내는 중간 연산

필터링 연산: filter(), distinct(), limit(), skip()


## 과제코드

생성자를 이해한다.

인터페이스와 다형성을 이해한다.

’’’
public interface Shape {
// 속성 : PI 값 선언
    public static final double PI = 3.14;
    
    // 추상 메소드 
    public void draw();            // 도형을 그림
    public double getArea();        // 도형의 면적을 리턴
    
    // 디폴드 메소드 
    public default void redraw(){
        System.out.print("--- 다시 그립니다. ");
        draw();
    }
}

class Circle implements Shape {
// 속성: 반지름
    private double radius;
    
    public Circle(double radius) {        //반지름을 매개변수로 받아 초기화하는 생성자 
        this.radius = radius;
    }
    
    @Override
    public double getArea() {        // 원의 넓이 구하기 
        return PI * radius * radius;
    }
    
    @Override
    public void draw() {
        // 실수형태를 정수형태로 바꾸기 
        int iradius = (int)radius;
        // 출력문 
        System.out.println("반지름이 " + iradius + "인 원입니다.");
    }
    
}

class Rect implements Shape{
    private double area;    // 넓이
    private double height;    // 높이 
    
    public Rect(double area, double height) {        //넓이와 높이를 매개변수로 받아 초기화하는 생성자 
        this.area = area;
        this.height = height;
    }
    
    @Override
    public double getArea() {        // 사각형의 넓이 구하기 
        return area * height;
    }
    
    @Override
    public void draw() {
        // 실수형태를 정수형태로 바꾸기 
        int iarea = (int)area;
        int iheight = (int)height;
        // 출력문 
        System.out.println(iarea + "X" + iheight + "크기의 사각형입니다.");
    }
}

public class Driver {
    public static void main(String[] args) {
        // 크기가 4인 Shape 배열을 생성하고, Circle 객체 2, Rect 객체 2개를 생성하여 배열에 저장
        Shape[] shape = new Shape[4];
        shape[0] = new Circle(10);
        shape[1] = new Circle(20);
        shape[2] = new Rect(10, 40);
        shape[3] = new Rect(20, 40);
        
        // 출력문 
        System.out.println("hw7_1 : 김하은");
        
        // 반복문을 이용하여 배열 원소들의 redraw() 메소드 호출
        for(int i=0; i<shape.length; i++) {
            shape[i].redraw();
        }
        // 반복문을 이용하여 배열 원소들의 getArea() 메소드를 호출하여 아래와 같이 출력
        for(int i=0; i<shape.length; i++) {
            System.out.println("면적은 " + shape[i].getArea());
        }
    }
}

’’’
람다식을 이해한다.
’’’
// 1) Timer 클래스를 사용하여 1초에 한번씩 "beep" 출력을 하는 프로그램이다.
Timer t = new Timer(1000, 
    (ActionEvent event) -> {System.out.println("beep");}
);
’’’

’’’
// 2) 두개의 정수를 받아 두개의 정수를 곱한 값을 반환
Multi m = (x, y) -> {return x * y;};
x = sc.nextInt();
y= sc.nextInt();
System.out.println(m.multiply(x, y));
’’’

’’’
// 3) 사람의 신장과 체중의 평균을 구하기 
Main {
    System.out.println("평균 신장 : " + average(Person.persons, p -> p.getHeight()));
    System.out.println("평균 체중 : " + average(Person.persons, p -> p.getWeight()));
}
public static double average(List<Person> persons, ToIntFunction<Person> f) {
    double sum = 0.0;    
    for(Person p : persons) {
        sum += f.applyAsInt(p);
    }
        
    return sum / persons.size();
}

class Person {
private String name;
    private int height, weight;

    public Person(String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return name + "(" + height + ", " + weight + ")";
    }

    static List<Person> persons = Arrays.asList(
    new Person("황진이", 160, 45), new Person("이순신", 180, 80),
        new Person("김삿갓", 175, 65), new Person("홍길동", 170, 68),
        new Person("배장화", 155, 48)
    );
}

’’’

컬렉션을 이해한다.

’’’
    ArrayList<Integer> arrayList = new ArrayList<>();
    // 학생 성적 출력 
    arrayList.forEach(n -> System.out.print(n + " "));

    HashMap<Integer, String> scoreList = new HashMap<Integer, String>();
    // 최고 점수 찾기 
    int maxx = Collections.max(arrayList);
    // 점수에 따른 등급 저장
    arrayList.forEach(score -> {
        if(maxx - 10 <= score) {
            scoreList.put(score, "A");
        } else if (maxx - 10 > score && score >= maxx-20) {
            scoreList.put(score, "B");
        } else if (maxx - 20 > score && score >= maxx-30) {
            scoreList.put(score, "C");
        } else if (maxx - 30 > score && score >= maxx-40) {
            scoreList.put(score, "D");
        } else {
            scoreList.put(score, "F");
        }
    });
    
    // 출력문
    arrayList.forEach(n -> {
    System.out.println(arrayList.indexOf(n) + "번 학생의 성적은 " + n + "점이며 등급은 " + scoreList.get(n) +"이다."); 
    });

’’’

스트림 필터를 이해한다.

’’’
Stream<String> s1 = Stream.of(arr);
    s1.filter(s -> s.length() == 2).limit(1).forEach(s -> System.out.print(s));
’’’



