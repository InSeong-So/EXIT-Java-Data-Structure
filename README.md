# DataStructure

## File Structure
> src
>> list
>>> arraylist
>>>> implementation
>>>>> ArrayList.java
>>>>> ArrayListExample.java

## ArrayList
### 개념
 - 배열과 리스트는 대비되는 개념이 아니라 굉장히 비슷한 개념이다. ArrayList는 배열 안에서 List를 만드는 것으로, 데이터를 삭제하고 추가할 때마다 해당 데이터의 바로 뒤에 있는 데이터를 전부 이동시킨다. 즉, 시간이 많이 걸린다. 장점은 데이터를 가져올 때 정확한 주소(인덱스)를 알고 있어 매우 빠르다는 것이다. 내부적으로 ArrayList는 size라는 변수를 유지하고 있다. 데이터를 추가하면 size의 값을 1 올리고, 삭제하면 1 내리는 것으로 값을 유지한다. 그 변수 값은 몇 개의 엘리먼트가 리스트 안에 존재하는지 알아낼 수 있다.
### 내부 함수
 - 선언 : **ArrayList<데이터타입> 변수명 = new ArrayList<데이터타입>();**
 - 값 추가 : **변수명.add(인덱스, 값);**
 - 처음에 값 추가 : **변수명.addFirst(값);**
 - 마지막에 값 추가 : **변수명.addLast(값);**
 - 원하는 엘리먼트의 인덱스 가져오기 : **변수명.indexOf(값);**
 - 값 삭제 : **변수명.remove(인덱스);**
 - 처음 값 삭제 : **변수명.removeFirst();**
 - 마지막 값 삭제 : **변수명.removeLast();**
 - 값 가져오기 : **변수명.get(인덱스);**
 - 엘리먼트 개수 확인 : **변수명.size();**
 - 문자열로 변환 : **변수명.toString();**