package self.explore.generics.execises.question2;

public class OddPredict implements UnaryPredict<Integer> {

	@Override
	public boolean test(Integer obj) {
		return obj % 2 == 0 ? false : true;
	}

}
