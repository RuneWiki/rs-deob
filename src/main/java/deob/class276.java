package deob;

@ObfuscatedName("kk")
public class class276 implements class405 {

    @ObfuscatedName("kk.ap")
    public static final class276 field3053 = new class276((byte) -1, 0.0F);

    @ObfuscatedName("kk.aw")
    public static final class276 field3047 = new class276((byte) 0, 0.5F);

    @ObfuscatedName("kk.ak")
    public static final class276 field3049 = new class276((byte) 1, 1.0F);

    @ObfuscatedName("kk.aj")
    public static final class276 field3058 = new class276((byte) 2, 2.0F);

    @ObfuscatedName("kk.ai")
    public static final class276 field3051 = new class276((byte) 3, 1.5F);

    @ObfuscatedName("kk.ay")
    public static final class276 field3052 = new class276((byte) 4, 2.5F);

    @ObfuscatedName("kk.as")
    public static final class276 field3050 = new class276((byte) 5, 3.0F);

    @ObfuscatedName("kk.ae")
    public static final class276 field3054 = new class276((byte) 6, 3.5F);

    @ObfuscatedName("kk.am")
    public static final class276 field3048 = new class276((byte) 7, 4.0F);

    @ObfuscatedName("kk.at")
    public final byte field3056;

    @ObfuscatedName("kk.au")
    public static class276[] field3057;

    static {
        class276[] var0 = new class276[] { field3058, field3047, field3052, field3050, field3053, field3054, field3048, field3049, field3051 };
        field3057 = var0;
        StringBuilder var1 = new StringBuilder();
        class276[] var2 = field3057;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class276 var4 = var2[var3];
            var1.append(var4.field3056);
            var1.append(", ");
        }
        String var5 = var1.toString();
        var5.substring(0, var5.length() - 2);
    }

    public class276(byte arg0, float arg1) {
        this.field3056 = arg0;
    }

    @ObfuscatedName("kk.aw(I)I")
    public int method37() {
        return this.field3056;
    }
}
