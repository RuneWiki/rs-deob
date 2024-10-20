package deob;

@ObfuscatedName("ed")
public class class138 {

    @ObfuscatedName("ed.q")
    public static final class138 field2359 = new class138(0);

    @ObfuscatedName("ed.c")
    public static final class138 field2358 = new class138(1);

    @ObfuscatedName("ed.p")
    public static final class138 field2356 = new class138(2);

    @ObfuscatedName("ed.z")
    public final int field2357;

    public class138(int arg0) {
        this.field2357 = arg0;
    }

    @ObfuscatedName("bx.q(IB)Led;")
    public static class138 method1562(int arg0) {
        class138[] var1 = new class138[] { field2359, field2358, field2356 };
        class138[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class138 var4 = var2[var3];
            if (var4.field2357 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
