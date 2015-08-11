package nestedclass.newadd;

/**
 * 链接到外部类
 * @author Chengxq
 *
 */
public class Sequence {
    private Object[] item;
    private int next = 0;
    public Sequence(int size){
        item = new Object[size];
    }
    public void add(Object x){
        if(next<item.length){
            item[next++]=x;
        }
    }
    private class SimpleItertor implements MyIterator{
        private int index = 0;
        /*public boolean end() {
            if(next == item.length){
                return true ;
            }
            return false;
        }代码冗余 其实可以写的更简洁
        */
        
        /**
         * 内部类可以随意访问外部类的方法和字段
         * @return
         */
        public boolean end() {
            return index == item.length;
        }
        public Object current() {
            return item[index];
        }

        public void next() {
            if(index<item.length){
                index ++;
            }
        }
    }
    
    public MyIterator iterator(){
        return new SimpleItertor();
    }
    
    public static void main(String[] args) {
        Sequence s = new Sequence(10);
        for(int i = 0; i < 10 ; i++){
            s.add(i);
        }
        MyIterator i = s.iterator();
//        while(!i.end()){
//            System.out.println(i.current());
//            i.next();
//        }
    }
}