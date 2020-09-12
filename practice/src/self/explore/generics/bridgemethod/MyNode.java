package self.explore.generics.bridgemethod;

public class MyNode extends Node {
	
	public MyNode(Integer data) { 
		super(data); 
	}
	
//	public MyNode(Object data) { 
//		super(data); 
//	}

    public void setData(Integer data) {
        System.out.println("MyNode.setData");
        super.setData(data);
    }
}
