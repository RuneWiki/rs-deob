package deob;

@ObfuscatedName("e")
public class class25 {

    @ObfuscatedName("e.o")
    public static final class25 field372 = new class25("SMALL", 1, 0, 4);

    @ObfuscatedName("e.k")
    public static final class25 field364 = new class25("MEDIUM", 0, 1, 2);

    @ObfuscatedName("e.t")
    public static final class25 field369 = new class25("LARGE", 2, 2, 0);

    @ObfuscatedName("e.d")
    public final String field366;

    @ObfuscatedName("e.h")
    public final int field363;

    @ObfuscatedName("e.m")
    public final int field368;

    @ObfuscatedName("e.z")
    public final int field373;

    public class25(String arg0, int arg1, int arg2, int arg3) {
        this.field366 = arg0;
        this.field363 = arg1;
        this.field368 = arg2;
        this.field373 = arg3;
    }

    @ObfuscatedName("e.o(FB)Z")
    public boolean method181(float arg0) {
        return arg0 >= (float) this.field373;
    }

    @ObfuscatedName("e.k(II)Le;")
    public static class25 method184(int arg0) {
        class25[] var1 = new class25[] { field369, field372, field364 };
        class25[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class25 var4 = var2[var3];
            if (var4.field368 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
