package deob;

@ObfuscatedName("fy")
public class class157 {

    @ObfuscatedName("fy.m")
    public static final class157 field2336 = new class157("LIVE", 0);

    @ObfuscatedName("fy.w")
    public static final class157 field2332 = new class157("BUILDLIVE", 3);

    @ObfuscatedName("fy.e")
    public static final class157 field2333 = new class157("RC", 1);

    @ObfuscatedName("fy.o")
    public static final class157 field2334 = new class157("WIP", 2);

    @ObfuscatedName("fy.g")
    public final String field2335;

    @ObfuscatedName("fy.l")
    public final int field2331;

    public class157(String arg0, int arg1) {
        this.field2335 = arg0;
        this.field2331 = arg1;
    }

    @ObfuscatedName("cw.m(II)Lfy;")
    public static class157 method2137(int arg0) {
        class157[] var1 = new class157[] { field2332, field2333, field2336, field2334 };
        class157[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class157 var4 = var2[var3];
            if (var4.field2331 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
