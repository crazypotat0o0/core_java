### 一个简单的Java应用程序
```java
public class FirstSample {
	public static void main(String[] args) {
		System.out.println("Hello world!");
	}
}
```  

+ Java对大小写敏感。
+ public称为访问修饰符，用于控制程序的其他部分对这段代码的访问级别。
+ 关键字class表明Java程序中的全部内容都包含在类中。**Java应用程序的所有内容都必须放置在类中**
+ 类名使用驼峰命名法（以大写字母开头，如果名字由多个单词组成，每个单词首字母应该大写）
+ (.)号表示调用方法。

### 注释

1. // -- 单行注释
2. /\*多行注释\*/
3. /\*\*文档注释\*/

### 数据类型
##### 整型（int short long byte）

1. int最为常用
2. 长整型加后缀L
3. 前缀0x表示十六进制， 0表示八进制， 0b表示二进制
4. 数字字面量加下划线易于阅读。e.g. 1_000_000

##### 浮点类型
1. float类型的数值有一个后缀F
2. 三个特殊的浮点数值：正无穷大 -- Double.POSITIVE_INFINITY、负无穷大 -- Double.NEGATIVE_INFINITY和NaN（不是一个数字）
	+ 检测特定值是否为NaN的方法为：
	```java
	if (Double.isNaN(x)) // check whether x is "not a number"
	```  

##### char类型
1. 代码点：与一个编码表中的某个字符对应的代码值。Unicode中，十六进制数前加上前缀U+表示一个代码点。 e.g.  A的代码点为 U+0041
2. Unicode的代码点可以分成17个代码级别。第一个代码级别为*多语言级别*，其他为附加级别。
3. 多语言级别中， 每个字符用16位表示，通常称为代码单元。
4. 辅助字符采用特定的代码点作为其第一个或第二个代码单元。 e.g. U+D800~U+BFF用于第一个代码单元 U+DC00~U+DFFF用于第二个代码单元。
这样可以迅速的知道一个代码单元是一个字符还是一个辅助字符的第一或第二部分。

##### boolean类型
1. true or false
2. 整型值和布尔型之间不能进行相互转换。

### 变量

1. 每一个变量属于一种类型，变量名必须以一个字母开头的字母或数字构成的序列。
2. Java中字母包括'A'-'Z', 'a'-'z','_', '$'或在某种语言中代表字母的任何Unicode字符。
3. 变量名尽量做到有意义且大小写敏感。
4. 变量名长度不限。但尽量不要出现'$'。
5. Character类中的isJavaIdentifierStart和isJavaIdentifierPart可以检测是否符合规范。
6. 可以在一行中声明多个变量，但不提倡。e.g. int i,j;逐一声明每一个变量可提高程序的阅读性。
7. 变量的声明尽可能靠近变量第一次使用的地方。
8. 关键字final指示常量， static final设置一个类常量。

```java
char 变量 = 0;
System.out.println(Character.isJavaIdentifierPart(变量)); //true
```

### 运算符

1. 整数被0除产生一个异常，浮点数被0除会得到无穷大或NaN结果。0.0 / 0 = NaN、 1.0 / 0 = Infinity
2. 3 % 5 = 3、 3 % -5 = 3、 -3 % 5 = -3、 -3 % -5 = -3

##### 自增和自减
1. 前缀形式：先进性+1再使用。
2. 后缀形式：使用变量原来的值， 再对变量+1。

##### 关系运算和boolean运算
1. &&和||按照短路的方式求值。如果第一个操作数已经能够确定表达式的值，第二个操作数就不用计算了。
2. 三元操作符： condition?expression1:expression2 当条件满足时计算第一个表达式，否则计算第二个。

##### 位运算
&-与、|-或、^-异或、~-非、>>-右移、<<-左移。>>>用0填充高位。

##### 数学函数与常量
1. Math类提供了各种数学函数的计算。
2. Math.sqrt和System.out.println存在微小差异。println方法操作一个定义在System类中的System.out对象。而Math类中的sqrt方法处理的不是对象。这种方法被称为静态方法。
3. Math类中常用方法：
	+ Math.sqrt、 Math.pow
	+ Math.sin、 Math.cos、 Math.tan、 Math.atan(double a)(Returns the arc tangent of a value)、Math.atan2(double x, double y)(Returns the angle theta from the conversion of rectangular coordinates (x, y) to polar coordinates (r, theta).)
	+ Math.exp、 Math.log、 Math.log10
	+ Math.PI、 Math.E

##### 数值类型之间的转换

+ 如果两个操作数中有一个是double型，另一个操作数就会转换为double型。
+ 否则，如果其中一个操作数是float类型，另一个操作数将会转换为float型。
+ 否则，如果其中一个操作数是long型，另一个操作数将会转换为long型。
+ 否则，两个操作数都将转换为int型。

##### 强制类型转换（cast）
强制类型转换的格式： double x = 9.97; int nx = (int) x;   
注意：1. 强制类型转换是直接截断数据，上式nx值为9。
2. (byte)300的实际值为44。
##### 括号与运算符级别
凭感觉、拿不准加括号。  
括号优先级最高，赋值运算优先级最低。
##### 枚举类型


### 字符串

##### 子串&拼接
```java
String greeting = "hello";
String s = greeting.subString(0, 3);// s = "hel"
```  
**注意substring方法第二个参数的位置。**  

+号直接拼接两个字符串。  
或者：s1.concat(s2);

##### 不可变字符串与字符串相等问题
字符串一旦创建则不可以被修改，可以视为将字符串存储在公共的存储池中，如果复制一个字符串变量，原始的字符串和复制的字符串共享相同的字符。  
不能用==来判断两个字符串是否相同。==只能检测两个字符串是否在同一个位置，不能检测内容相同的而存放在不同位置的字符串（只有字符串常量是共享的，而+或substring等操作产生的结果并不是共享的）。

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
##### 空串与null
1. String s = "";是一个空串，空串是一个Java对象，可以调用String类的各方法。
2. String s;在null上调用方法，会出现错误。

##### 构建字符串
```java
StringBuilder sb = new StringBuilder();
sb.append(ch);
sb.append(str);
```
用于构建字符串，避免产生过多的String对象。

### 输入输出
##### 读取输入
```java 
//创建Scanner对象。Scanner定义在util包中，使用时在程序最开始加上一行import java.util.*;
Scanner in = new Scanner(System.in);
//调用nextInt方法
int age = in.nextInt();
```
因为输入是可见的，Java SE 6引入了Console类实现控制台读取密码。
```java
Console cons = System.console();  
String username = cons.readLine("User name:");
char[] passwd = cons.readPassWord("Password:");
```
为安全起见，密码存放在数组，在对密码进行处理后，应该立马用一个填充值覆盖数组元素。


##### 格式化输出

可以使用String.format方法创建一个格式化的字符串而不打印输出。  
e.g. String message = String.format("Hello, %s, Next year, you`ll be %d.", name, age);  
格式说明符语法：  
%(格式说明符) -> 参数索引 + "$" -> 标志(+#,等) -> 宽度 -> 1. -> . -> 精度 -> 转换字符
2. -> t -> 转换字符   
##### 文件的输入与输出
1. 读文件    
Scanner in = new Scanner(Paths.get("a.txt"));
2. 写文件  
PrintWriter out = new PrintWroter("b.txt");  


### 控制流程

##### 块作用域
1. 块确定了变量的作用域
2. 不能在嵌套的两个块中声明同名的变量

##### 条件语句
+ else子句与最临近的if构成一组

##### 循环
+ 如果开始循环条件的值为false， 则while循环体一次也不执行
+ do...while循环先执行语句，再判断循环条件。
+ 检测两个浮点数应该格外小心，for (double x = 0; x != 10; x += 0.1)可能永远不会结束。  
可以改为：for (double x = 0; (x - 10) < 1e-64; x += 0.1)

##### switch语句
+ switch从选项值相匹配的case标签处开始执行直到遇到break语句，或者执行到switch语句结束。
+ 如果没有匹配的case标签而又default子句，就执行这个子句。
+ case的标签可以是：
	1. char、byte、short、int等常量表达式
	2. 枚举常量，使用枚举常量时，不需要指明枚举名。
	```java
	Size sz = ...;
	switch(sz) {
		case SMALL: //no need to use Size.SMALL
		...
	}
	```  
	3. 从Java SE 7开始，case标签还可以是字符串字面量。 case “yes”   

##### 中断控制流程语句
+ 如何跳出外圈的循环？
```java
int n;
read_data:
while (...) {
	for (...) {
		n = ...;
		if (n < 0)
			break read_data; //跳出外圈的while循环
	}
}
```
+ continue语句越过了当前循环体的剩余语句，立即调到循环首部。

### 大数值

BigInteger和BigDecimal：  

+ 这两个类可以处理包含任意长度数字序列的数值。
+ BigInteger类实现了任意精度的整数运算。
+ BigDecimal类实现了任意精度的浮点数运算。
+ BigInteger a = BigInteger.valueOf(100);valueOf方法实现了普通数字转换为大数值。
+ add、 subtract、 multiply、 divide、 mod等方法实现了加减乘除取余等运算。

### 数组

+ 数组是用来存储**同一类型值**的集合。
+ 一旦创建了数组，就不能改变其大小

##### for each循环
循环a中的每一个元素：
```java
for (int elements : a) {
	System.out.println(elements);
}
```

##### 数组初始化&匿名数组
+ int arr = {2, 3, 5, 9, 15};
+ 可以初始化一个匿名数组 new int[] {2, 3, 5, 9, 15};

##### 数组拷贝
arr = Arrays.copyOf(arr, 2 * arr.length);  
这个方法通常用来增加数组的大小。

##### 命令行参数
public static void main(String[] args) main中的参数表明main方法接收一个字符串数组，也就是命令行参数。

##### 数组排序等其他方法
Arrays.sort -- 排序
Arrays.copyOfRange(type[] a, int start, int end)不包括end
Arrays.binarySearch(type[] a, type v)
Arrays.fill(type[] a, type v) 将数组所有数据元素设置为v

##### 多维数组
+ double[][] balance;声明一个多维数组
+ int[][] arr = {{1, 2, 3} {4, 5, 6} {7, 8, 9}};
+ 使用Arrays.deeepToString(type[][] a)打印一个二维数组
+ Java实际上没有多维数组，只有一维数组，多维数组被解释为“数组的数组”。
+ 因此，可定义不规则数组：  
```java
int[][] odds = new int[SIZE][];
for (int i = 0; i < SIZE; i++)
	odds[i] = new int[i+1];
```