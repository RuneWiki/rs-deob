package deob;

@ObfuscatedName("j")
public class class25 {

    @ObfuscatedName("j.e")
    public static final class25 field359 = new class25("SMALL", 0, 0, 4);

    @ObfuscatedName("j.n")
    public static final class25 field362 = new class25("MEDIUM", 1, 1, 2);

    @ObfuscatedName("j.g")
    public static final class25 field360 = new class25("LARGE", 2, 2, 0);

    @ObfuscatedName("j.y")
    public final String field366;

    @ObfuscatedName("j.w")
    public final int field363;

    @ObfuscatedName("j.k")
    public final int field364;

    @ObfuscatedName("j.v")
    public final int field361;

    public class25(String arg0, int arg1, int arg2, int arg3) {
        this.field366 = arg0;
        this.field363 = arg1;
        this.field364 = arg2;
        this.field361 = arg3;
    }

    @ObfuscatedName("j.e(FI)Z")
    public boolean method174(float arg0) {
        return arg0 >= (float) this.field361;
    }

    @ObfuscatedName("j.n(IB)Lj;")
    public static class25 method171(int arg0) {
        class25[] var1 = new class25[] { field360, field362, field359 };
        class25[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class25 var4 = var2[var3];
            if (var4.field364 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
