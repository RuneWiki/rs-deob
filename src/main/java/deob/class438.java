package deob;

@ObfuscatedName("qk")
public class class438 extends class444 {

    public class438(class444 arg0) {
        super(arg0);
        this.field4794 = "SwapSongTask";
    }

    @ObfuscatedName("qk.ak(I)Z")
    public boolean method7581() {
        if (class330.field3579.size() > 1 && class330.field3579.get(0) != null && ((class342) class330.field3579.get(0)).field3694.method5673() && class330.field3579.get(1) != null && ((class342) class330.field3579.get(1)).field3694.method5673()) {
            class342 var1 = (class342) class330.field3579.get(0);
            class330.field3579.set(0, class330.field3579.get(1));
            class330.field3579.set(1, var1);
        }
        return true;
    }
}
