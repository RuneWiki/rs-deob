package deob;

@ObfuscatedName("hl")
public class class217 {

    @ObfuscatedName("hl.k")
    public static final class217 field3160 = new class217(0);

    @ObfuscatedName("hl.y")
    public static final class217 field3157 = new class217(1);

    @ObfuscatedName("hl.o")
    public static final class217 field3156 = new class217(2);

    @ObfuscatedName("hl.r")
    public final int field3159;

    public class217(int arg0) {
        this.field3159 = arg0;
    }

    @ObfuscatedName("dm.k(IB)Lhl;")
    public static class217 method1953(int arg0) {
        class217[] var1 = new class217[] { field3160, field3157, field3156 };
        class217[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class217 var4 = var2[var3];
            if (var4.field3159 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
