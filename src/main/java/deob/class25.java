package deob;

@ObfuscatedName("f")
public class class25 {

    @ObfuscatedName("f.m")
    public static final class25 field357 = new class25("SMALL", 2, 0, 4);

    @ObfuscatedName("f.p")
    public static final class25 field349 = new class25("MEDIUM", 1, 1, 2);

    @ObfuscatedName("f.i")
    public static final class25 field350 = new class25("LARGE", 0, 2, 0);

    @ObfuscatedName("f.j")
    public final String field348;

    @ObfuscatedName("f.v")
    public final int field352;

    @ObfuscatedName("f.x")
    public final int field353;

    @ObfuscatedName("f.e")
    public final int field354;

    public class25(String arg0, int arg1, int arg2, int arg3) {
        this.field348 = arg0;
        this.field352 = arg1;
        this.field353 = arg2;
        this.field354 = arg3;
    }

    @ObfuscatedName("f.m(FB)Z")
    public boolean method183(float arg0) {
        return arg0 >= (float) this.field354;
    }

    @ObfuscatedName("f.p(II)Lf;")
    public static class25 method185(int arg0) {
        class25[] var1 = new class25[] { field357, field349, field350 };
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
