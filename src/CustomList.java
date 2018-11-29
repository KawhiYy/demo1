import java.util.Arrays;

/*
�ο�Java���Ѿ�ʵ����Ӧ ���ݽṹ �� ������ �����磺 ArrayList �� HashMap ��
Ȼ���Լ�ʵ��һ���Լ��� �������Դ� ���������� ��ɾ�Ĳ� ���ܿ��Բ�ѯ���ϴ�С size 
�����Լ�����һ������,����Ҫд��ע����ʾ 
ʹ�÷�LEVEL */
public class CustomList<E> {
	private Object[] a = null;
	static int size = 0;
	
	public CustomList(){
	        a=new Object[10];
	    }
	public CustomList(int capacity){
        a=new Object[capacity];
    }
	//��
	public <E> void add(E e) {
		ensureCapacity(size+1);
		a[size] = e;
		size++;
	}
	//ɾ��
	public <E> void remove(E e) {
		a[size] = null;
		size--;
	}
	//��
	public <E> void set(int position,E e) {
		a[position] = e;
	}
	//��
	public <E> Object get(int position) {
		return  a[position];
	}
	
	//���ϴ�С
	public <E> int Size() {
		return size;
	}
	//��ӡ
	public void print(){
	        for(int i=0;i<size;i++){
	            System.out.println("��"+(i+1)+"����"+get(i));
	        }
	    }
	private void ensureCapacity(int size){
        if(size>0.8*a.length){
            //����Ϊԭ��������1.5��
            int oldCapacity=a.length;
            int newCapacity=oldCapacity+(oldCapacity>>1);
            a=Arrays.copyOf(a, newCapacity);
        }
    }

	
}
	