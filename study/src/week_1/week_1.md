* 토의
	1. 단계별 개발(TDD)
		* 입력값 받지 말고 하드 코딩으로 확인
	2. 기타
		* 다음 노드 참조를 setNode로 설정해주느냐, 생성자로 해주느냐
		* 내부 클래스 static 여부
			* 빌더 패턴(static) vs. 링크드 리스트(non-static)
		* Comparator<? super E>
			1. [Java Generics - Lower and Upper bound 1](http://egloos.zum.com/ryukato/v/1182733)
			2. [Java Generics - Lower and Upper bound 2](https://tudip.com/blog-post/java-generics-lower-upper-bound/)
			3. [Java Generics - Lower Bounded Wildcards](https://www.tutorialspoint.com/java_generics/java_generics_lower_bounded.htm)
			4. [Java Generics - 와일드카드 심화학습](http://egloos.zum.com/iilii/v/4342731)
 
* 코딩
	1. 입력받은 식물 좌표로 단방향 연결 노드 생성
		* 좌표(obj)로 노드 생성
			1. 데이터: Node<E> newPointer = new Node(obj, null);
				* 꼬리 노드는 어떤 노드도 가리키지 않음
			2. 다음 노드 참조: lastPointer.next = newPointer;
	2. 검색 구현: 선형 검색
		* Comparator
	3. 삭제 구현
	4. 테스트
		* 내부 클래스
			* 노드 생성시 내부 클래스에 접근하진 않음
				* 바깥 클래스의 매개변수, 리턴형 모두 데이터형(E) 사용
				* Node<E> 사용 안함