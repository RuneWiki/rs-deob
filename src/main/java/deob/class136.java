package deob;

@ObfuscatedName("eu")
public class class136 {

    @ObfuscatedName("eu.p")
    public static final class136 field2338 = new class136(0);

    @ObfuscatedName("eu.j")
    public static final class136 field2343 = new class136(1);

    @ObfuscatedName("eu.w")
    public static final class136 field2339 = new class136(2);

    @ObfuscatedName("eu.h")
    public final int field2340;

    public class136(int arg0) {
        this.field2340 = arg0;
    }

    @ObfuscatedName("d.p(II)Leu;")
    public static class136 method173(int arg0) {
        class136[] var1 = new class136[] { field2339, field2338, field2343 };
        class136[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class136 var4 = var2[var3];
            if (var4.field2340 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
