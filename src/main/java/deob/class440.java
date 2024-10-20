package deob;

@ObfuscatedName("qb")
public class class440 extends class446 {

    public class440(class446 arg0) {
        super(arg0);
        this.field4797 = "SwapSongTask";
    }

    @ObfuscatedName("qb.ab(I)Z")
    public boolean method7665() {
        if (class333.field3565.size() > 1 && class333.field3565.get(0) != null && ((class345) class333.field3565.get(0)).field3683.method5700() && class333.field3565.get(1) != null && ((class345) class333.field3565.get(1)).field3683.method5700()) {
            class345 var1 = (class345) class333.field3565.get(0);
            class333.field3565.set(0, class333.field3565.get(1));
            class333.field3565.set(1, var1);
        }
        return true;
    }
}
