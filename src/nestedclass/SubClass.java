package nestedclass;
/**
 *非静态内部类In类的构造器必须使用外部类对象来调用
 *代码中super表示In类的构造器，而out则代表了外部
 *类对象。
 *
 *
 *如果要创建SubClass对象时，必须先要创建一个Out对
 *象。这是合理的，因为SubClass对象里也应该存在一个
 *Out对象的引用。当创建SubClass对象时传给该构造器的
 *Out对象，就是SubClass对象里Out对象引用所指向的对象。
 */
public class SubClass extends Out.In {
	//定义SubClass的构造器
	public SubClass(Out out){
		out.super("hello");
	}
}
