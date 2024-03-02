import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Menu {
    private List<Drink> listOfDrink;

    public Menu() {
        this.listOfDrink = new ArrayList<>();
    }

    public void addDrink(Drink Drink) {
        listOfDrink.add(Drink);
    }

    public int getSize() {
       return listOfDrink.size();
    }

    public double getTotalPrice() {
        double total = 0.0;
        for(Drink drink : listOfDrink) {
            total += drink.getPrice();
        }
        return total;
    }

    public Drink mostExpensiveDrink() {
        Drink mostExpensive = listOfDrink.get(0);
        for(Drink drink : listOfDrink) {
            if(drink.getPrice() > mostExpensive.getPrice())
                mostExpensive=drink;
        }
        return mostExpensive;
//Drink mostExpensive = listOfDrink.get(0);: Phương thức bắt đầu bằng việc
// gán đồ uống đầu tiên trong danh sách listOfDrink vào biến mostExpensive.
// Điều này đảm bảo rằng chúng ta có một giá trị ban đầu để so sánh với các
// đồ uống còn lại trong danh sách.
//
//for(Drink drink : listOfDrink) { ... }: Đoạn mã sử dụng một vòng lặp foreach
// để duyệt qua từng đồ uống trong danh sách listOfDrink.
//
//Trong mỗi lần lặp, điều kiện if(drink.getPrice() > mostExpensive.getPrice())
// kiểm tra xem giá của đồ uống hiện tại (drink) có lớn hơn giá của đồ uống
// đắt nhất hiện tại (mostExpensive) không.
//
//Nếu giá của drink lớn hơn giá của mostExpensive, thì mostExpensive sẽ được cập nhật
// để trỏ đến drink. Điều này giúp chúng ta luôn giữ được tham chiếu đến đồ uống
// có giá cao nhất cho đến khi kết thúc vòng lặp.
    }

    public List<Drink> getAlcoholicDrinks () {
        List<Drink> alcoholic = new ArrayList<>();
        for(Drink drink : listOfDrink) {
            if(drink.isAlcoholic())
                alcoholic.add(drink);
//for (Drink drink : listOfDrink) { ... }: Đoạn mã sử dụng một vòng lặp foreach
// để duyệt qua từng đối tượng Drink trong danh sách listOfDrink.
//
//Trong mỗi lần lặp, điều kiện if (drink.isAlcoholic()) kiểm tra xem đối tượng
// Drink hiện tại (drink) có chứa cồn không. Nếu có, nghĩa là
// phương thức isAlcoholic() trả về true, tức là đồ uống đó có chứa cồn,
// và sau đó đồ uống đó sẽ được thêm vào danh sách alcoholic bằng
// cách sử dụng phương thức add() của ArrayList.
//
//Sau khi vòng lặp kết thúc, phương thức trả về danh sách alcoholic chứa tất cả
// các đồ uống có chứa cồn từ danh sách listOfDrink.
        }
        return alcoholic;
    }

    public void removeMoreExpensiveThen() {
        for (Iterator<Drink> iterator = listOfDrink.iterator(); iterator.hasNext(); ) {
                if (iterator.next().getPrice() > 3)
                    iterator.remove();
            }
        }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(Drink drink : listOfDrink){
            sb.append(drink.toString()).append(", ");
        }
        return sb.toString();
    }

    public void addDrinks(Drink[] drinks) {
        listOfDrink.addAll(Arrays.asList(drinks));
    }


}
