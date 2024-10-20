package deob;

@ObfuscatedName("qg")
public class class460 {

    @ObfuscatedName("qg.c")
    public static final class460 field4819 = new class460(0);

    @ObfuscatedName("qg.v")
    public static final class460 field4818 = new class460(1);

    @ObfuscatedName("qg.q")
    public static final class460 field4820 = new class460(2);

    @ObfuscatedName("qg.f")
    public final int field4821;

    public class460(int arg0) {
        this.field4821 = arg0;
    }

    @ObfuscatedName("nb.c(IB)Lqg;")
    public static class460 method6178(int arg0) {
        class460[] var1 = new class460[] { field4819, field4818, field4820 };
        class460[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class460 var4 = var2[var3];
            if (var4.field4821 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
