package deob;

@ObfuscatedName("n")
public class class25 {

    @ObfuscatedName("n.b")
    public static final class25 field337 = new class25("SMALL", 2, 0, 4);

    @ObfuscatedName("n.q")
    public static final class25 field326 = new class25("MEDIUM", 1, 1, 2);

    @ObfuscatedName("n.o")
    public static final class25 field327 = new class25("LARGE", 0, 2, 0);

    @ObfuscatedName("n.p")
    public final String field328;

    @ObfuscatedName("n.a")
    public final int field338;

    @ObfuscatedName("n.h")
    public final int field330;

    @ObfuscatedName("n.l")
    public final int field331;

    public class25(String arg0, int arg1, int arg2, int arg3) {
        this.field328 = arg0;
        this.field338 = arg1;
        this.field330 = arg2;
        this.field331 = arg3;
    }

    @ObfuscatedName("n.q(FI)Z")
    public boolean method181(float arg0) {
        return arg0 >= (float) this.field331;
    }

    @ObfuscatedName("n.o(II)Ln;")
    public static class25 method182(int arg0) {
        class25[] var1 = Statics.method183();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class25 var3 = var1[var2];
            if (var3.field330 == arg0) {
                return var3;
            }
        }
        return null;
    }
}
