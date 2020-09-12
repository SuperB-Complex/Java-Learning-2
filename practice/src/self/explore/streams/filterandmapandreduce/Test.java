package self.explore.streams.filterandmapandreduce;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
	
	public static void main(String[] args) {

		ProductInfo info = new ProductInfo("apples", "123", 1.00, 5);
		ProductInfo info2 = new ProductInfo("pear", "345", 2.00, 10);
		ProductInfo info3 = new ProductInfo("banana", "653", 0.33, 20);
		ProductInfo info4 = new ProductInfo("onions", "222", 0.89, 15);
		
		List<ProductInfo> products = new ArrayList<>(
				Arrays.asList(new ProductInfo [] {info, info2, info3, info4})
		);
		System.out.println(products);
		System.out.println();
		
		List<ProductInfo> cheapProducts = products.stream()
				.filter((ProductInfo productInfo) -> {
					return productInfo.getPrice() < 1.00;
				})
				.collect(Collectors.toList());
		System.out.println(cheapProducts);
		System.out.println();
		
		List<String> names = products.stream()
				.map((ProductInfo prodInfo) -> {
					return prodInfo.getName();
				})
				.collect(Collectors.toList());
		System.out.println(names);
		System.out.println();
		
		List<String> namesOfProducts = new ArrayList<>();
		for(ProductInfo pinfo : products) {
			namesOfProducts.add(pinfo.getName());
		}
		System.out.println(namesOfProducts);
		System.out.println();
		
		Integer sum = products.stream()
				.map(ProductInfo::getQuantity)
				.reduce(0, (a, b) -> {
					return a + b;
				});
		System.out.println(sum);
		System.out.println();
		
		// filter out products under $1
		// get all of the quantities 
		// reduce the quantites - sum 
		Integer sum1 = products.stream()
			.filter((pInfo) -> {
				return pInfo.getPrice() < 1.00;
			})
			.map(ProductInfo::getQuantity)
			.reduce(0, (a, b) -> {
				return a + b;
			});
		System.out.println(sum1);
		System.out.println();
	}
}
