﻿package interface_keywords;

public interface Output {
	//接口里定义的属性只能是常量
	int MAX_CACHE_LINE = 50;
	//接口里定义的值鞥是public的抽象实例方法
	/*省略public abstract */void out();
	void getData(String msg);
}
