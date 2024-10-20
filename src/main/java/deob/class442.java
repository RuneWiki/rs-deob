package deob;

@ObfuscatedName("qb")
public class class442 extends class448 {

    public class442(class448 arg0) {
        super(arg0);
        this.field4844 = "SwapSongTask";
    }

    @ObfuscatedName("qb.ac(I)Z")
    public boolean method7804() {
        if (class335.field3627.size() > 1 && class335.field3627.get(0) != null && ((class347) class335.field3627.get(0)).field3733.method5854() && class335.field3627.get(1) != null && ((class347) class335.field3627.get(1)).field3733.method5854()) {
            class347 var1 = (class347) class335.field3627.get(0);
            class335.field3627.set(0, class335.field3627.get(1));
            class335.field3627.set(1, var1);
        }
        return true;
    }
}
