package deob;

@ObfuscatedName("qa")
public class class455 {

    @ObfuscatedName("qa.v")
    public static final class455 field4742 = new class455(0);

    @ObfuscatedName("qa.c")
    public static final class455 field4740 = new class455(1);

    @ObfuscatedName("qa.i")
    public static final class455 field4739 = new class455(2);

    @ObfuscatedName("qa.f")
    public final int field4741;

    public class455(int arg0) {
        this.field4741 = arg0;
    }

    @ObfuscatedName("fy.v(IB)Lqa;")
    public static class455 method3017(int arg0) {
        class455[] var1 = new class455[] { field4740, field4742, field4739 };
        class455[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class455 var4 = var2[var3];
            if (var4.field4741 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
