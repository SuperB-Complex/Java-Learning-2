package self.explore.classandtype.polymorphism;

public class Test {
	public static void main(String[] args) {
		//��ת�ͣ��ø������������Ķ���
        Parent p=new Son();
        //���ø������еķ���
        p.grow();
        //p.dance();����ᱨ����Ϊ������û��dance()����

        //�Խ��й���ת�͵Ķ��󣬽���ǿ����ת��
        Son s=(Son)p;
        //���������еķ���
        s.dance();
	}
}
