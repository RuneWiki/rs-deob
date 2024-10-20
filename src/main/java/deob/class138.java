package deob;

@ObfuscatedName("ew")
public class class138 {

    @ObfuscatedName("ew.p")
    public static final class138 field2350 = new class138(0);

    @ObfuscatedName("ew.l")
    public static final class138 field2341 = new class138(1);

    @ObfuscatedName("ew.d")
    public static final class138 field2343 = new class138(2);

    @ObfuscatedName("ew.x")
    public final int field2349;

    public class138(int arg0) {
        this.field2349 = arg0;
    }

    @ObfuscatedName("au.p(IB)Lew;")
    public static class138 method789(int arg0) {
        class138[] var1 = new class138[] { field2350, field2341, field2343 };
        class138[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class138 var4 = var2[var3];
            if (var4.field2349 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
