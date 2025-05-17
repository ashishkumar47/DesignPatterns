package CompositeDesignPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @ author  ashishKumar
 * @ since 11-05-2025 12:03 am
 */
public class GiftBox implements GiftItem{

    private List<GiftItem> giftItemList = new ArrayList<>();

    public void addItem(GiftItem giftItem){
        this.giftItemList.add(giftItem);
    }
    @Override
    public void open() {
        System.out.println("Opening gift box...");
        for(GiftItem giftItem:this.giftItemList){
            giftItem.open();
        }
    }
}
