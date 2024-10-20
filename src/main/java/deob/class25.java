package deob;

@ObfuscatedName("j")
public class class25 {

    @ObfuscatedName("j.s")
    public static final class25 field373 = new class25("SMALL", 1, 0, 4);

    @ObfuscatedName("j.c")
    public static final class25 field365 = new class25("MEDIUM", 0, 1, 2);

    @ObfuscatedName("j.f")
    public static final class25 field367 = new class25("LARGE", 2, 2, 0);

    @ObfuscatedName("j.m")
    public final String field368;

    @ObfuscatedName("j.h")
    public final int field369;

    @ObfuscatedName("j.t")
    public final int field370;

    @ObfuscatedName("j.p")
    public final int field371;

    @ObfuscatedName("j.s(I)[Lj;")
    public static class25[] method176() {
        return new class25[] { field373, field367, field365 };
    }

    public class25(String arg0, int arg1, int arg2, int arg3) {
        this.field368 = arg0;
        this.field369 = arg1;
        this.field370 = arg2;
        this.field371 = arg3;
    }

    @ObfuscatedName("j.c(FB)Z")
    public boolean method170(float arg0) {
        return arg0 >= (float) this.field371;
    }

    @ObfuscatedName("j.f(II)Lj;")
    public static class25 method173(int arg0) {
        class25[] var1 = method176();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class25 var3 = var1[var2];
            if (var3.field370 == arg0) {
                return var3;
            }
        }
        return null;
    }
}
