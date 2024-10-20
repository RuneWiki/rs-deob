package deob;

@ObfuscatedName("ha")
public class class217 {

    @ObfuscatedName("ha.b")
    public static final class217 field3181 = new class217(0);

    @ObfuscatedName("ha.e")
    public static final class217 field3179 = new class217(1);

    @ObfuscatedName("ha.c")
    public static final class217 field3178 = new class217(2);

    @ObfuscatedName("ha.l")
    public final int field3180;

    public class217(int arg0) {
        this.field3180 = arg0;
    }

    @ObfuscatedName("ak.e(II)Lha;")
    public static class217 method799(int arg0) {
        class217[] var1 = Statics.method3205();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class217 var3 = var1[var2];
            if (var3.field3180 == arg0) {
                return var3;
            }
        }
        return null;
    }
}
