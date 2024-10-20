package deob;

@ObfuscatedName("eg")
public class class137 {

    @ObfuscatedName("eg.i")
    public static final class137 field2335 = new class137(0);

    @ObfuscatedName("eg.p")
    public static final class137 field2341 = new class137(1);

    @ObfuscatedName("eg.a")
    public static final class137 field2337 = new class137(2);

    @ObfuscatedName("eg.l")
    public final int field2338;

    public class137(int arg0) {
        this.field2338 = arg0;
    }

    @ObfuscatedName("t.i(II)Leg;")
    public static class137 method224(int arg0) {
        class137[] var1 = new class137[] { field2337, field2341, field2335 };
        class137[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class137 var4 = var2[var3];
            if (var4.field2338 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
