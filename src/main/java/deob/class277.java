package deob;

@ObfuscatedName("kk")
public class class277 implements class404 {

    @ObfuscatedName("kk.ac")
    public static final class277 field3039 = new class277((byte) -1, 0.0F);

    @ObfuscatedName("kk.ae")
    public static final class277 field3038 = new class277((byte) 0, 0.5F);

    @ObfuscatedName("kk.ag")
    public static final class277 field3037 = new class277((byte) 1, 1.0F);

    @ObfuscatedName("kk.am")
    public static final class277 field3040 = new class277((byte) 2, 2.0F);

    @ObfuscatedName("kk.ax")
    public static final class277 field3048 = new class277((byte) 3, 1.5F);

    @ObfuscatedName("kk.aq")
    public static final class277 field3041 = new class277((byte) 4, 2.5F);

    @ObfuscatedName("kk.af")
    public static final class277 field3043 = new class277((byte) 5, 3.0F);

    @ObfuscatedName("kk.at")
    public static final class277 field3042 = new class277((byte) 6, 3.5F);

    @ObfuscatedName("kk.au")
    public static final class277 field3045 = new class277((byte) 7, 4.0F);

    @ObfuscatedName("kk.ar")
    public final byte field3046;

    @ObfuscatedName("kk.al")
    public final float field3047;

    @ObfuscatedName("kk.ad")
    public static class277[] field3044;

    static {
        class277[] var0 = new class277[] { field3037, field3041, field3048, field3039, field3045, field3043, field3040, field3042, field3038 };
        field3044 = var0;
        method3003();
    }

    public class277(byte arg0, float arg1) {
        this.field3046 = arg0;
        this.field3047 = arg1;
    }

    @ObfuscatedName("kk.ac(I)I")
    public int method32() {
        return this.field3046;
    }

    @ObfuscatedName("es.ax(I)Ljava/lang/String;")
    public static String method3003() {
        StringBuilder var0 = new StringBuilder();
        class277[] var1 = field3044;
        for (int var2 = 0; var2 < var1.length; var2++) {
            class277 var3 = var1[var2];
            var0.append(var3.field3046);
            var0.append(", ");
        }
        String var4 = var0.toString();
        return var4.substring(0, var4.length() - 2);
    }
}
