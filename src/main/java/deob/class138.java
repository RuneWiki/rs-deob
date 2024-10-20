package deob;

@ObfuscatedName("em")
public class class138 {

    @ObfuscatedName("em.b")
    public static final class138 field2376 = new class138(0);

    @ObfuscatedName("em.c")
    public static final class138 field2373 = new class138(1);

    @ObfuscatedName("em.j")
    public static final class138 field2372 = new class138(2);

    @ObfuscatedName("em.i")
    public final int field2375;

    public class138(int arg0) {
        this.field2375 = arg0;
    }

    @ObfuscatedName("dp.b(IB)Lem;")
    public static class138 method2170(int arg0) {
        class138[] var1 = new class138[] { field2373, field2372, field2376 };
        class138[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class138 var4 = var2[var3];
            if (var4.field2375 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
