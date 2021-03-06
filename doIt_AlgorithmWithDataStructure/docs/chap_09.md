9장. 리스트
=========
9단원 리스트에 대해 요약 정리합니다.
- - - - -
### 목차
1. [선형 리스트](#선형-리스트)
2. [포인터로 연결 리스트 만들기](#포인터로-연결-리스트-만들기)
3. [커서로 연결 리스트 만들기](#커서로-연결-리스트-만들기)
4. [원형 이중 연결 리스트](#원형-이중-연결-리스트)
5. [참고](#참고)

### 선형 리스트
1. 개념
	* 리스트란?
		* 데이터를 순서대로 나열한(줄지어 늘어놓은) 자료구조
		* 스택과 큐도 리스트 구조로 되어 있음
	* 선형 리스트란?
		* 가장 간단한 리스트 구조를 갖고 있는 리스트
		* 선형 리스트(linear list) 혹은 연결 리스트(linked list)라고 부름
2. 구조 및 구성
	* 구조
		* 데이터를 사슬 모양으로 연결한 형태로 되어 있음
	* 구성
		* 데이터: 노드(node) 또는 요소(element)라고 부름
		* 포인터: 다음 노드를 가리킴
3. 분류 및 장단점
	* 배열
		* 장점
			* 인덱스를 통해 접근 용이
		* 단점
			* 쌓이는 데이터의 크기를 미리 알아야 함
			* 데이터의 삽입, 삭제에 따라 데이터를 모두 옮겨야 하기 때문에 효율이 좋지 않음
	* 이하 설명

### 포인터로 연결 리스트 만들기
1. 장점
	* 배열로 리스트 생성시 단점 해결
2. 구조 및 용어
	* 구조
		* ![단방향 연결 리스트](/doIt_AlgorithmWithDataStructure/images/singly_linked_list.png)
	* 용어
		* 노드 클래스 Node<E>
			* 두 필드(data, next)와 생성자로 구성
				* 생성자: Node<E>의 생성자는 인수로 전달받은 data, next를 해당 필드에 설정
		* 연결 리스트 클래스 LinkedList<E>
			* 두 필드(head, crnt)로 구성
				* head: 머리 노드 가리킴
				* crnt: 현재 선택 노드 가리킴(검색, 삭제 등 용도로 사용)
		* 기타
			* 자기 참조(self-referential)형
				* 데이터용 필드와 별도로 자기 자신과 같은 클래스형의 인스턴스를 참조하기 위한 참조용 필드를 가지는 클래스 구조
			* 클래스형 변수인 data는 데이터 그 자체가 아니라 어디까지나 데이터에 대한 '참조'임
3. 구현 단계애 따른 구현 코드
	1. 노드 형이 클래스 Node<E>형인 연결 리스트를 클래스 LinkedList<E>로 구현 - [A](#A)
	2. 생성자 LinkedList - [B](#B)
		* 클래스 LinkedList<E>의 생성자는 머리 노드를 가리키는 변수 head에 null을 대입
			* 비어 있는 연결 리스트는 노드도 없고 head가 가리키는 곳도 없으므로 그 값을 null로 함
				* Node<E>형의 변수 head가 머리 노드에 대한 참조이지 머리 노드 그 자체가 아님에 주의
			* crnt에도 null을 넣어 어떤 요소도 선택하지 않도록 함
		* 연결 리스트의 노드 갯수를 판단하는 방법
	3. 검색을 수행하는 search 메서드 - [C](#C)
		1. 개요
			* 어떤 조건을 만족하는 노드를 검색
			* 검색에 사용하는 알고리즘은 선형 검색이고 검색할 노드를 만날 때까지 머리 노드부터 스캔함
				* ![검색](/doIt_AlgorithmWithDataStructure/images/search_singly.jpg)
		2. 종료 조건
			* 조건 1. 검색 조건을 만족하는 노드를 찾지 못하고 꼬리 노드를 지나가기 직전인 경우
			* 조건 2. 검색 조건을 만족하는 노드를 찾은 경우
		3. 참고
			* [Java Generic](http://greatzzo.blogspot.com/2016/03/java-generic.html)
			* Comparable and Comparator: 용도와 목적(사용 이유)
				* [자바 객체 정렬의 기준을 정하는 방법](https://jeong-pro.tistory.com/173)
				* [자바의 Comparable, Comparator](https://brunch.co.kr/@kd4/7)
				* [자바 배열 및 ArrayList 정렬](https://developer88.tistory.com/75)
			* API 및 Diagram
				* [Arrays 클래스 sort() 메소드](https://docs.oracle.com/javase/7/docs/api/java/util/Arrays.html)
				* [Design Patterns](https://dzone.com/articles/design-patterns-in-the-real-world-strategy)
				* [Example-1](https://w3.cs.jmu.edu/bernstdh/web/common/labs-solutions/questions_abstract-classes-and-interfaces/)
				* [Example-2](https://www.cs.umb.edu/~bobw/CS110/Project3/index.html)
			* 예제 코드 설명
				* [<? super E> vs. <? extends E>](https://stackoverflow.com/questions/1368166/what-is-a-difference-between-super-e-and-extends-e)
	4. 머리에 노드를 삽입하는 addFirst 메서드 - [D](#D)
	5. 꼬리에 노드를 삽입하는 addLast 메서드 - [E](#E)
	6. 머리 노드를 삭제하는 removeFirst 메서드 - [F](#F)
	7. 꼬리 노드를 삭제하는 removeLast 메서드 - [G](#G)
	8. 선택한 노드를 삭제하는 remove 메서드 - [H](#H)
	9. 기타
		*

#### A
```java
// 연결 리스트 클래스
public class LinkedList<E> {
	// 노드
	class Node<E> {
		private E data;		// 데이터
		private Node<E> next; 	// 뒤쪽 포인터(다음 노드 참조)

		// 생성자
		Node(E data, Node<E> next) {
			this.data = data;
			this.next = next;
		}
	}
	private Node<E> head; 		// 머리 노드
	private Node<E> crnt; 		// 선택 노드
}
```

#### B
```java
// 생성자
public LinkedList() {
	head = crnt = null;
}

// 연결 리스트가 비어 있는지 확인합니다.
head == null;

// 노드가 1개인지 확인합니다.
head.next == null;

// 노드가 2개인지 확인합니다.
head.next.next == null;

// Node<E>형의 변수 p가 가리키는 노드가 꼬리 노드인지 확인합니다.
p.next == null;
```

#### C
```java
// 노드 검색
public E search(E obj, Comparator<? super E> c) {
	Node<E> ptr = head; 				// 현재 스캔 중인 노드

	while (ptr != null) {
		if (c.compare(obj, ptr.data) == 0) { 	// 검색 성공
			crnt = ptr;
			return ptr.data;
		}
		ptr = ptr.next; 			// 다음 노드를 선택
	}
	return null; 					// 검색 실패
}
```

#### D


### 커서로 연결 리스트 만들기

### 원형 이중 연결 리스트

### 참고
[Linked List](https://www.cs.cmu.edu/~adamchik/15-121/lectures/Linked%20Lists/linked%20lists.html)