package deob;

@ObfuscatedName("fa")
public class class180 {

    @ObfuscatedName("fa.f")
    public static int[] field2939 = new int[32];

    @ObfuscatedName("fa.e")
    public static int[] field2940;

    @ObfuscatedName("fa.n")
    public static int[] field2941;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2939[var1] = var0 - 1;
            var0 += var0;
        }
        field2940 = new int[2000];
        field2941 = new int[2000];
    }

    public class180() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dn.f(IB)I")
    public static int method2322(int arg0) {
        class51 var1 = Statics.method647(arg0);
        int var2 = var1.field1093;
        int var3 = var1.field1095;
        int var4 = var1.field1094;
        int var5 = field2939[var4 - var3];
        return field2941[var2] >> var3 & var5;
    }
}
