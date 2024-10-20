package deob;

@ObfuscatedName("hd")
public class class217 {

    @ObfuscatedName("hd.x")
    public static final class217 field3186 = new class217(0);

    @ObfuscatedName("hd.n")
    public static final class217 field3184 = new class217(1);

    @ObfuscatedName("hd.g")
    public static final class217 field3185 = new class217(2);

    @ObfuscatedName("hd.v")
    public final int field3187;

    public class217(int arg0) {
        this.field3187 = arg0;
    }

    @ObfuscatedName("aj.x(II)Lhd;")
    public static class217 method816(int arg0) {
        class217[] var1 = new class217[] { field3184, field3186, field3185 };
        class217[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class217 var4 = var2[var3];
            if (var4.field3187 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
