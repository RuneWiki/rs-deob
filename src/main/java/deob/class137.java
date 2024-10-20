package deob;

@ObfuscatedName("ei")
public class class137 {

    @ObfuscatedName("ei.i")
    public static final class137 field2331 = new class137(0);

    @ObfuscatedName("ei.v")
    public static final class137 field2328 = new class137(1);

    @ObfuscatedName("ei.m")
    public static final class137 field2327 = new class137(2);

    @ObfuscatedName("ei.j")
    public final int field2325;

    public class137(int arg0) {
        this.field2325 = arg0;
    }

    @ObfuscatedName("df.i(II)Lei;")
    public static class137 method2474(int arg0) {
        class137[] var1 = new class137[] { field2327, field2328, field2331 };
        class137[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class137 var4 = var2[var3];
            if (var4.field2325 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
