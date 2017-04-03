### һ���򵥵�JavaӦ�ó���
```java
public class FirstSample {
	public static void main(String[] args) {
		System.out.println("Hello world!");
	}
}
```  

+ Java�Դ�Сд���С�
+ public��Ϊ�������η������ڿ��Ƴ�����������ֶ���δ���ķ��ʼ���
+ �ؼ���class����Java�����е�ȫ�����ݶ����������С�**JavaӦ�ó�����������ݶ��������������**
+ ����ʹ���շ����������Դ�д��ĸ��ͷ����������ɶ��������ɣ�ÿ����������ĸӦ�ô�д��
+ (.)�ű�ʾ���÷�����

### ע��

1. // -- ����ע��
2. /\*����ע��\*/
3. /\*\*�ĵ�ע��\*/

### ��������
##### ���ͣ�int short long byte��

1. int��Ϊ����
2. �����ͼӺ�׺L
3. ǰ׺0x��ʾʮ�����ƣ� 0��ʾ�˽��ƣ� 0b��ʾ������
4. �������������»��������Ķ���e.g. 1_000_000

##### ��������
1. float���͵���ֵ��һ����׺F
2. ��������ĸ�����ֵ��������� -- Double.POSITIVE_INFINITY��������� -- Double.NEGATIVE_INFINITY��NaN������һ�����֣�
	+ ����ض�ֵ�Ƿ�ΪNaN�ķ���Ϊ��
	```java
	if (Double.isNaN(x)) // check whether x is "not a number"
	```  

##### char����
1. ����㣺��һ��������е�ĳ���ַ���Ӧ�Ĵ���ֵ��Unicode�У�ʮ��������ǰ����ǰ׺U+��ʾһ������㡣 e.g.  A�Ĵ����Ϊ U+0041
2. Unicode�Ĵ������Էֳ�17�����뼶�𡣵�һ�����뼶��Ϊ*�����Լ���*������Ϊ���Ӽ���
3. �����Լ����У� ÿ���ַ���16λ��ʾ��ͨ����Ϊ���뵥Ԫ��
4. �����ַ������ض��Ĵ������Ϊ���һ����ڶ������뵥Ԫ�� e.g. U+D800~U+BFF���ڵ�һ�����뵥Ԫ U+DC00~U+DFFF���ڵڶ������뵥Ԫ��
��������Ѹ�ٵ�֪��һ�����뵥Ԫ��һ���ַ�����һ�������ַ��ĵ�һ��ڶ����֡�

##### boolean����
1. true or false
2. ����ֵ�Ͳ�����֮�䲻�ܽ����໥ת����

### ����

1. ÿһ����������һ�����ͣ�������������һ����ĸ��ͷ����ĸ�����ֹ��ɵ����С�
2. Java����ĸ����'A'-'Z', 'a'-'z','_', '$'����ĳ�������д�����ĸ���κ�Unicode�ַ���
3. ���������������������Ҵ�Сд���С�
4. ���������Ȳ��ޡ���������Ҫ����'$'��
5. Character���е�isJavaIdentifierStart��isJavaIdentifierPart���Լ���Ƿ���Ϲ淶��
6. ������һ����������������������ᳫ��e.g. int i,j;��һ����ÿһ����������߳�����Ķ��ԡ�
7. ���������������ܿ���������һ��ʹ�õĵط���
8. �ؼ���finalָʾ������ static final����һ���ೣ����

```java
char ���� = 0;
System.out.println(Character.isJavaIdentifierPart(����)); //true
```

### �����

1. ������0������һ���쳣����������0����õ�������NaN�����0.0 / 0 = NaN�� 1.0 / 0 = Infinity
2. 3 % 5 = 3�� 3 % -5 = 3�� -3 % 5 = -3�� -3 % -5 = -3

##### �������Լ�
1. ǰ׺��ʽ���Ƚ���+1��ʹ�á�
2. ��׺��ʽ��ʹ�ñ���ԭ����ֵ�� �ٶԱ���+1��

##### ��ϵ�����boolean����
1. &&��||���ն�·�ķ�ʽ��ֵ�������һ���������Ѿ��ܹ�ȷ�����ʽ��ֵ���ڶ����������Ͳ��ü����ˡ�
2. ��Ԫ�������� condition?expression1:expression2 ����������ʱ�����һ�����ʽ���������ڶ�����

##### λ����
&-�롢|-��^-���~-�ǡ�>>-���ơ�<<-���ơ�>>>��0����λ��

##### ��ѧ�����볣��
1. Math���ṩ�˸�����ѧ�����ļ��㡣
2. Math.sqrt��System.out.println����΢С���졣println��������һ��������System���е�System.out���󡣶�Math���е�sqrt��������Ĳ��Ƕ������ַ�������Ϊ��̬������
3. Math���г��÷�����
	+ Math.sqrt�� Math.pow
	+ Math.sin�� Math.cos�� Math.tan�� Math.atan(double a)(Returns the arc tangent of a value)��Math.atan2(double x, double y)(Returns the angle theta from the conversion of rectangular coordinates (x, y) to polar coordinates (r, theta).)
	+ Math.exp�� Math.log�� Math.log10
	+ Math.PI�� Math.E

##### ��ֵ����֮���ת��

+ �����������������һ����double�ͣ���һ���������ͻ�ת��Ϊdouble�͡�
+ �����������һ����������float���ͣ���һ������������ת��Ϊfloat�͡�
+ �����������һ����������long�ͣ���һ������������ת��Ϊlong�͡�
+ ������������������ת��Ϊint�͡�

##### ǿ������ת����cast��
ǿ������ת���ĸ�ʽ�� double x = 9.97; int nx = (int) x;   
ע�⣺1. ǿ������ת����ֱ�ӽض����ݣ���ʽnxֵΪ9��
2. (byte)300��ʵ��ֵΪ44��
##### ���������������
ƾ�о����ò�׼�����š�  
�������ȼ���ߣ���ֵ�������ȼ���͡�
##### ö������


### �ַ���

##### �Ӵ�&ƴ��
```java
String greeting = "hello";
String s = greeting.subString(0, 3);// s = "hel"
```  
**ע��substring�����ڶ���������λ�á�**  

+��ֱ��ƴ�������ַ�����  
���ߣ�s1.concat(s2);

##### ���ɱ��ַ������ַ����������
�ַ���һ�������򲻿��Ա��޸ģ�������Ϊ���ַ����洢�ڹ����Ĵ洢���У��������һ���ַ���������ԭʼ���ַ����͸��Ƶ��ַ���������ͬ���ַ���  
������==���ж������ַ����Ƿ���ͬ��==ֻ�ܼ�������ַ����Ƿ���ͬһ��λ�ã����ܼ��������ͬ�Ķ�����ڲ�ͬλ�õ��ַ�����ֻ���ַ��������ǹ���ģ���+��substring�Ȳ��������Ľ�������ǹ���ģ���

```java
public final char[] value;
 public boolean equals(Object anObject) {
        if (this == anObject) {
            return true;
        }
        if (anObject instanceof String) {
            String anotherString = (String)anObject;
            int n = value.length;
            if (n == anotherString.value.length) {
                char v1[] = value;
                char v2[] = anotherString.value;
                int i = 0;
                while (n-- != 0) {
                    if (v1[i] != v2[i])
                        return false;
                    i++;
                }
                return true;
            }
        }
        return false;
  }
```     
##### �մ���null
1. String s = "";��һ���մ����մ���һ��Java���󣬿��Ե���String��ĸ�������
2. String s;��null�ϵ��÷���������ִ���

##### �����ַ���
```java
StringBuilder sb = new StringBuilder();
sb.append(ch);
sb.append(str);
```
���ڹ����ַ�����������������String����

### �������
##### ��ȡ����
```java 
//����Scanner����Scanner������util���У�ʹ��ʱ�ڳ����ʼ����һ��import java.util.*;
Scanner in = new Scanner(System.in);
//����nextInt����
int age = in.nextInt();
```
��Ϊ�����ǿɼ��ģ�Java SE 6������Console��ʵ�ֿ���̨��ȡ���롣
```java
Console cons = System.console();  
String username = cons.readLine("User name:");
char[] passwd = cons.readPassWord("Password:");
```
Ϊ��ȫ����������������飬�ڶ�������д����Ӧ��������һ�����ֵ��������Ԫ�ء�


##### ��ʽ�����

����ʹ��String.format��������һ����ʽ�����ַ���������ӡ�����  
e.g. String message = String.format("Hello, %s, Next year, you`ll be %d.", name, age);  
��ʽ˵�����﷨��  
%(��ʽ˵����) -> �������� + "$" -> ��־(+#,��) -> ��� -> 1. -> . -> ���� -> ת���ַ�
2. -> t -> ת���ַ�   
##### �ļ������������
1. ���ļ�    
Scanner in = new Scanner(Paths.get("a.txt"));
2. д�ļ�  
PrintWriter out = new PrintWroter("b.txt");  


### ��������

##### ��������
1. ��ȷ���˱�����������
2. ������Ƕ�׵�������������ͬ���ı���

##### �������
+ else�Ӿ������ٽ���if����һ��

##### ѭ��
+ �����ʼѭ��������ֵΪfalse�� ��whileѭ����һ��Ҳ��ִ��
+ do...whileѭ����ִ����䣬���ж�ѭ��������
+ �������������Ӧ�ø���С�ģ�for (double x = 0; x != 10; x += 0.1)������Զ���������  
���Ը�Ϊ��for (double x = 0; (x - 10) < 1e-64; x += 0.1)

##### switch���
+ switch��ѡ��ֵ��ƥ���case��ǩ����ʼִ��ֱ������break��䣬����ִ�е�switch��������
+ ���û��ƥ���case��ǩ����default�Ӿ䣬��ִ������Ӿ䡣
+ case�ı�ǩ�����ǣ�
	1. char��byte��short��int�ȳ������ʽ
	2. ö�ٳ�����ʹ��ö�ٳ���ʱ������Ҫָ��ö������
	```java
	Size sz = ...;
	switch(sz) {
		case SMALL: //no need to use Size.SMALL
		...
	}
	```  
	3. ��Java SE 7��ʼ��case��ǩ���������ַ����������� case ��yes��   

##### �жϿ����������
+ ���������Ȧ��ѭ����
```java
int n;
read_data:
while (...) {
	for (...) {
		n = ...;
		if (n < 0)
			break read_data; //������Ȧ��whileѭ��
	}
}
```
+ continue���Խ���˵�ǰѭ�����ʣ����䣬��������ѭ���ײ���

### ����ֵ

BigInteger��BigDecimal��  

+ ����������Դ���������ⳤ���������е���ֵ��
+ BigInteger��ʵ�������⾫�ȵ��������㡣
+ BigDecimal��ʵ�������⾫�ȵĸ��������㡣
+ BigInteger a = BigInteger.valueOf(100);valueOf����ʵ������ͨ����ת��Ϊ����ֵ��
+ add�� subtract�� multiply�� divide�� mod�ȷ���ʵ���˼Ӽ��˳�ȡ������㡣

### ����

+ �����������洢**ͬһ����ֵ**�ļ��ϡ�
+ һ�����������飬�Ͳ��ܸı����С

##### for eachѭ��
ѭ��a�е�ÿһ��Ԫ�أ�
```java
for (int elements : a) {
	System.out.println(elements);
}
```

##### �����ʼ��&��������
+ int arr = {2, 3, 5, 9, 15};
+ ���Գ�ʼ��һ���������� new int[] {2, 3, 5, 9, 15};

##### ���鿽��
arr = Arrays.copyOf(arr, 2 * arr.length);  
�������ͨ��������������Ĵ�С��

##### �����в���
public static void main(String[] args) main�еĲ�������main��������һ���ַ������飬Ҳ���������в�����

##### �����������������
Arrays.sort -- ����
Arrays.copyOfRange(type[] a, int start, int end)������end
Arrays.binarySearch(type[] a, type v)
Arrays.fill(type[] a, type v) ��������������Ԫ������Ϊv

##### ��ά����
+ double[][] balance;����һ����ά����
+ int[][] arr = {{1, 2, 3} {4, 5, 6} {7, 8, 9}};
+ ʹ��Arrays.deeepToString(type[][] a)��ӡһ����ά����
+ Javaʵ����û�ж�ά���飬ֻ��һά���飬��ά���鱻����Ϊ����������顱��
+ ��ˣ��ɶ��岻�������飺  
```java
int[][] odds = new int[SIZE][];
for (int i = 0; i < SIZE; i++)
	odds[i] = new int[i+1];
```