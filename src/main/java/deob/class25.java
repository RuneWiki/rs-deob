package deob;

@ObfuscatedName("y")
public class class25 {

    @ObfuscatedName("y.c")
    public static final class25 field348 = new class25("SMALL", 0, 0, 4);

    @ObfuscatedName("y.i")
    public static final class25 field347 = new class25("MEDIUM", 2, 1, 2);

    @ObfuscatedName("y.o")
    public static final class25 field345 = new class25("LARGE", 1, 2, 0);

    @ObfuscatedName("y.j")
    public final String field346;

    @ObfuscatedName("y.k")
    public final int field350;

    @ObfuscatedName("y.x")
    public final int field353;

    @ObfuscatedName("y.z")
    public final int field343;

    public class25(String arg0, int arg1, int arg2, int arg3) {
        this.field346 = arg0;
        this.field350 = arg1;
        this.field353 = arg2;
        this.field343 = arg3;
    }

    @ObfuscatedName("y.c(FB)Z")
    public boolean method182(float arg0) {
        return arg0 >= (float) this.field343;
    }

    @ObfuscatedName("y.i(II)Ly;")
    public static class25 method189(int arg0) {
        class25[] var1 = new class25[] { field348, field347, field345 };
        class25[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class25 var4 = var2[var3];
            if (var4.field353 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
