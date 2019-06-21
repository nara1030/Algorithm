* 토의
	1. 단계별 개발(TDD)
		* 입력값 받지 말고 하드 코딩으로 확인
	2. 구현
		1. 생성
			* 다음 노드 참조를 setNode로 설정해주느냐, 생성자로 해주느냐
				* 생성자에서 next 필드(Node<E>형)를 초기화 해주느냐
			* 내부 클래스 static 선언 여부
				* 목적(의도)
					* 표현(내부 클래스 접근)과 생성(외부 클래스 생성자 호출)을 분리하기 위해
				* 빌더 패턴(static) vs. 링크드 리스트(non-static)
		2. 검색
			* Comparator<? super E>
				1. [Java Generics - Lower and Upper bound 1](http://egloos.zum.com/ryukato/v/1182733)
				2. [Java Generics - Lower and Upper bound 2](https://tudip.com/blog-post/java-generics-lower-upper-bound/)
				3. [Java Generics - Lower Bounded Wildcards](https://www.tutorialspoint.com/java_generics/java_generics_lower_bounded.htm)
				4. [Java Generics - 와일드카드 심화학습](http://egloos.zum.com/iilii/v/4342731)
	3. 기타
		* 노드 구현시 제네릭 사용 여부
			* 사용 O  
			  ```java
			  class LinkedList<E> {
				class Node<E> {
				}
			  }
			  class Use {
			  }
			  ```
			* 사용 X  
			  ```java
			  class LinkedList {
				class Use {
				}
			  }
			  ```
		* 추상클래스 vs. 인터페이스
			* 인터페이스
				* 사용 클래스에서 메소드 public으로 구현
			* 추상클래스
		* [개구리 공주](https://www.acmicpc.net/problem/2983)
			* 방향 및 거리에 따른 노드 추출
				* 추출이 아니라 해당 노드에 체크하는 식으로 접근(필드 추가)
				* 링크드리스트 의도에 맞지 않는 구현 같음
