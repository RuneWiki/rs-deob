package deob;

@ObfuscatedName("el")
public class class138 {

    @ObfuscatedName("el.c")
    public static final class138 field2371 = new class138(0);

    @ObfuscatedName("el.q")
    public static final class138 field2372 = new class138(1);

    @ObfuscatedName("el.y")
    public static final class138 field2373 = new class138(2);

    @ObfuscatedName("el.v")
    public final int field2374;

    @ObfuscatedName("i.c(B)[Lel;")
    public static class138[] method218() {
        return new class138[] { field2372, field2371, field2373 };
    }

    public class138(int arg0) {
        this.field2374 = arg0;
    }

    @ObfuscatedName("be.q(II)Lel;")
    public static class138 method1176(int arg0) {
        class138[] var1 = method218();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class138 var3 = var1[var2];
            if (var3.field2374 == arg0) {
                return var3;
            }
        }
        return null;
    }
}
