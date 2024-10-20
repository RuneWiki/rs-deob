package deob;

@ObfuscatedName("eo")
public class class138 {

    @ObfuscatedName("eo.p")
    public static final class138 field2348 = new class138(0);

    @ObfuscatedName("eo.e")
    public static final class138 field2343 = new class138(1);

    @ObfuscatedName("eo.a")
    public static final class138 field2349 = new class138(2);

    @ObfuscatedName("eo.h")
    public final int field2344;

    public class138(int arg0) {
        this.field2344 = arg0;
    }

    @ObfuscatedName("bs.p(IB)Leo;")
    public static class138 method1568(int arg0) {
        class138[] var1 = new class138[] { field2349, field2343, field2348 };
        class138[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class138 var4 = var2[var3];
            if (var4.field2344 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
