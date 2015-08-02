package collection;
import java.util.TreeSet;
/**
 *下面的运行结果可看出，TreeSet并不是根据元素插入顺序进行排序
 * 
 *
 */
public class TestTreeSetCommon {
	public static void main(String[] args) {
		TreeSet nums = new TreeSet();
		nums.add(5);
		nums.add(2);
		nums.add(10);
		nums.add(-9);
		System.out.println(nums);
		System.out.println(nums.first());
		System.out.println(nums.last());
		//返回小于4的子集 不包含4
		System.out.println(nums.headSet(4));
		//返回大于5的子集，如果set中包含5，子集中还包含5
		System.out.println(nums.tailSet(5));
		System.out.println(nums.tailSet(8)+"---");
		//返回大于等于-3，小于4的子集
		System.out.println(nums.subSet(-3, 4));
	}
}
