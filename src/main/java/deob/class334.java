package deob;

@ObfuscatedName("lm")
public class class334 {

    @ObfuscatedName("lm.v")
    public static final class334 field3889 = new class334(0);

    @ObfuscatedName("lm.n")
    public static final class334 field3888 = new class334(1);

    @ObfuscatedName("lm.f")
    public static final class334 field3890 = new class334(2);

    @ObfuscatedName("lm.y")
    public final int field3891;

    public class334(int arg0) {
        this.field3891 = arg0;
    }

    @ObfuscatedName("dl.v(II)Llm;")
    public static class334 method2280(int arg0) {
        class334[] var1 = new class334[] { field3889, field3888, field3890 };
        class334[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class334 var4 = var2[var3];
            if (var4.field3891 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
