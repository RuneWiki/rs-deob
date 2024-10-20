package deob;

@ObfuscatedName("hd")
public class class217 {

    @ObfuscatedName("hd.p")
    public static final class217 field3170 = new class217(0);

    @ObfuscatedName("hd.g")
    public static final class217 field3165 = new class217(1);

    @ObfuscatedName("hd.x")
    public static final class217 field3164 = new class217(2);

    @ObfuscatedName("hd.q")
    public final int field3167;

    public class217(int arg0) {
        this.field3167 = arg0;
    }

    @ObfuscatedName("gg.p(II)Lhd;")
    public static class217 method3538(int arg0) {
        class217[] var1 = new class217[] { field3164, field3170, field3165 };
        class217[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class217 var4 = var2[var3];
            if (var4.field3167 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
