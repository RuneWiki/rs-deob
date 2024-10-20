package deob;

@ObfuscatedName("rj")
public class class443 extends class449 {

    public class443(class449 arg0) {
        super(arg0);
        this.field4882 = "SwapSongTask";
    }

    @ObfuscatedName("rj.ap(I)Z")
    public boolean method8051() {
        if (class334.field3630.size() > 1 && class334.field3630.get(0) != null && ((class346) class334.field3630.get(0)).field3748.method6046() && class334.field3630.get(1) != null && ((class346) class334.field3630.get(1)).field3748.method6046()) {
            class346 var1 = (class346) class334.field3630.get(0);
            class334.field3630.set(0, class334.field3630.get(1));
            class334.field3630.set(1, var1);
        }
        return true;
    }
}
