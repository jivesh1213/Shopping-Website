package pojo;

import cart.Shoppingcart;
import java.util.ArrayList;
import java.util.List;

public class Products {
    private final List<Shoppingcart> Items = new ArrayList<>();

    public List<Shoppingcart> getItems() {
        String[] value = {"c1", "c2", "c3", "c4", "c5", "c6", "c7", "c8", "c9", "c10", "c11", "c12", "c13", "c14", "c15", "c16", "c17", "c18", "c19", "c20", "c21", "c22", "c23", "c24", "c25", "c26", "c27"};
        String[] photo = {"Item1.jpg", "Item2.jpg", "Items3.jpg", "Item4.jpg", "access2.jpg", "access1.jpg", "Item5.jpg", "phone1.jpg", "Item6.jpg", "phone2.jpg","phone4.jpg", "phone3.jpg",
                "Item7.jpg", "Item8.jpg", "refrigerator1.jpg", "guitar2.jpg", "washing1.jpg", "refrigerator2.jpg", "tv3.jpg", "Item10.jpg", "Item11.jpg", "bag2.jpg", "watch2.jpg", "bag1.jpg", "shoes3.jpg", "watch1.jpg", "shoes2.jpg"};
        String [] productNames = {"OnePlus 7 (Mirror Grey, 6GB RAM, Optic AMOLED Display, 128GB Storage, 3700mAH Battery)",
            "Goofy Bluetooth Wireless Headphones Sport Stereo Headsets Hands-Free with Microphone",
            "Mi 10000mAH Li-Polymer Power Bank 2i (Black) with 18W Fast Charging and 3 USB Port",
            "Ron® Protective Soft Silicone Shockproof Protection Back Case Cover(Samsung Galaxy M30s)",
            "Amazfit Bip Lite Smart Watch for Men Activity/Tracker for Android/iOS (Black)",
            "Syska P101032 Power Core 200 20000 mAh Lithium Polymer Red, Smart Charge",
            "OnePlus 7T (Frosted Silver, 8GB RAM, Fluid AMOLED Display, 128GB Storage, 3800mAH Battery)",
            "Redmi Note 8 (Space Black, 6GB RAM, 128GB Storage)",
            "Samsung Galaxy M10s(Metallic Blue, Super AMOLED Display, 32GB Storage, 4000mAH Battery)",
            "Apple iPhone XR (Moonlight White, 64GB Storage, Liquid Retina HD Display)",
            "Samsung Galaxy M30 (Gradation Blue, 5000mAh Battery, Super AMOLED Display, 64GB Storage)",
            "Nokia 6.1 Plus (Blue, 6GB RAM, 64GB Storage)",
            "Samsung Super 6 Series 4K UHD LED Smart TV UA43NU6100 (Black) (2019 model)",
            "Voltas Beko 6 Kg Inverter Fully-Automatic Front Loading Washing Machine (WFL60WS, White)",
            "LG 260 L 4 Star Frost Free Double Door Refrigerator(Shiny Steel, Inverter Compressor)",
            "Kadence Acoustica Series,Semi Acoustic Guitar Ash Wood with Equlizer",
            "Whirlpool Whitemagic Royal 6.2Kg Fully Automatic Washing Machine, Shiny Grey",
            "Amazon Basics 564 L Refrigerator with Water Dispenser (Silver Steel Finish)",
            "OnePlus 138.8 cm (55 inches) Q1 Series 4K Certified Android QLED TV 55Q1IN-1 (Black)",
            "Yomis Men's Formal Suit Waistcoat Tuxedo Slim Fit Casual Business Dress",
            "Nike Men's Air Max 2017 Running Shoes",
            "Polyester 38 cms Grey Travel Duffle (DUFCRSTNG0406)",
            "PZOZ, Analogue White Dial Watch for Women",
            "American Tourister 39L Laptop Trolley Backpack (Black)",
            "Men's Ellipse Mehari Trail Running Shoe, Crown White, 7.5 M US",
            "Fossil Gen 5 Stainless Steel Touchscreen Smartwatch with Speaker, Heart Rate, GPS",
            "La Sportiva Men's Ultra Raptor GTX Trail Running Shoe GREY / GREEN 45.5 M EU"};
        
        Integer [] productPrice = {29999, 438, 899, 144, 3999, 799, 37999, 12999, 7999, 42900, 12499, 12999, 49999, 22479, 25990, 7880, 12490, 42999, 69899, 1239, 12756, 499, 429, 3256, 2756, 22995, 4239};
        Integer [] stock = {10, 6, 10, 4, 6, 3, 5, 2, 13, 34, 2, 43, 22, 23, 2, 23, 21, 12, 8, 5, 8, 1, 2, 3, 4, 5, 6};
        
        for (int i=0; i < productNames.length; i++) {
            this.Items.add(new Shoppingcart(value[i], photo[i], productNames[i], productPrice[i], stock[i]));
        }
        return Items;
    }
    
}
