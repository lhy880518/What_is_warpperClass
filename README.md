# What_is_warpperClass

## 의미
* 기본타입의 변수(데이터의 저장과 참조를 위해 할당된 메모리 공간)만을 사용해서 프로그램을 짤 수도 있겠지만
해당 변수를 객체로 취급해야 하는 경우가 있다
    * 호출하려는 메소드가 객체만을 인수로 가질 때
    * 래퍼 클래스의 메소드 및 상수 사용
    * 각 데이터 별 형변환 또는 진법 변환을 위

* 이럴때에는 기본타입의 변수를 객체로 변환한 후에 해당 메소드를 호출해야한다. 이렇게 8개의 기본타입에 해당하는 데이터를 객체로 포장해주는 클래스를 래퍼 클래스라고 한다.


![래퍼 클래스 이미지](/src/image/wrapperClassImage.png)
## 박싱과 언박싱
* 박싱(boxing)은 기본 자료형의 데이터를 래퍼클래스의 객체로 만드는 과정.
* 언박싱(un boxing)은 래퍼 클래스의 데이터를 기본 자료형으로 얻어내는 과정.

## 오토박싱과 오토언박싱
* JDK1.5부터는 오토박싱과 오토 언박싱이라는 것이 지원된다.(컴파일러가 자동으로 해줌)
* 오토박싱은 해당 래퍼 클래스에 기본 자료형의 데이터를 대입하면 된다(Integer i = 10;)
* 오토 언박싱은 반대로 기본 자료형에 래퍼 객체를 대입하면 된다.(int i2 = i;)

> wrapper class관련 메모리에 대해서 확인해봐야겠다.