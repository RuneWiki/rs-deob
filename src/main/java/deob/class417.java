package deob;

@ObfuscatedName("qr")
public class class417 extends class423 {

    public class417(class423 arg0) {
        super(arg0);
        this.field4598 = "SwapSongTask";
    }

    @ObfuscatedName("qr.am(I)Z")
    public boolean method7259() {
        if (class320.field3460.size() > 1 && class320.field3460.get(0) != null && ((class332) class320.field3460.get(0)).field3583.method5511() && class320.field3460.get(1) != null && ((class332) class320.field3460.get(1)).field3583.method5511()) {
            class332 var1 = (class332) class320.field3460.get(0);
            class320.field3460.set(0, class320.field3460.get(1));
            class320.field3460.set(1, var1);
        }
        return true;
    }
}
