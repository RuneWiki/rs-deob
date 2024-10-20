package deob;

@ObfuscatedName("t")
public class class25 {

    @ObfuscatedName("t.e")
    public static final class25 field359 = new class25("SMALL", 1, 0, 4);

    @ObfuscatedName("t.o")
    public static final class25 field357 = new class25("MEDIUM", 0, 1, 2);

    @ObfuscatedName("t.m")
    public static final class25 field358 = new class25("LARGE", 2, 2, 0);

    @ObfuscatedName("t.g")
    public final String field362;

    @ObfuscatedName("t.d")
    public final int field360;

    @ObfuscatedName("t.b")
    public final int field361;

    @ObfuscatedName("t.k")
    public final int field366;

    public class25(String arg0, int arg1, int arg2, int arg3) {
        this.field362 = arg0;
        this.field360 = arg1;
        this.field361 = arg2;
        this.field366 = arg3;
    }

    @ObfuscatedName("t.e(FI)Z")
    public boolean method144(float arg0) {
        return arg0 >= (float) this.field366;
    }

    @ObfuscatedName("t.o(II)Lt;")
    public static class25 method145(int arg0) {
        class25[] var1 = new class25[] { field357, field359, field358 };
        class25[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class25 var4 = var2[var3];
            if (var4.field361 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
