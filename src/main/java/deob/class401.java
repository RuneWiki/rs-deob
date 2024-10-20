package deob;

@ObfuscatedName("po")
public class class401 extends class407 {

    public class401(class407 arg0) {
        super(arg0);
        this.field4524 = "SwapSongTask";
    }

    @ObfuscatedName("po.au(I)Z")
    public boolean method6976() {
        if (class306.field3405.size() > 1 && class306.field3405.get(0) != null && ((class318) class306.field3405.get(0)).field3518.method5334() && class306.field3405.get(1) != null && ((class318) class306.field3405.get(1)).field3518.method5334()) {
            class318 var1 = (class318) class306.field3405.get(0);
            class306.field3405.set(0, class306.field3405.get(1));
            class306.field3405.set(1, var1);
        }
        return true;
    }
}
