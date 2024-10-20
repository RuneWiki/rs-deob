package deob;

@ObfuscatedName("mq")
public class class320 {

    @ObfuscatedName("mq.at")
    public static int[] field3512 = new int[32];

    @ObfuscatedName("mq.an")
    public static int[] field3513;

    @ObfuscatedName("mq.av")
    public static int[] field3514;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field3512[var1] = var0 - 1;
            var0 += var0;
        }
        field3513 = new int[4000];
        field3514 = new int[4000];
    }

    public class320() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("nn.at(IB)I")
    public static int method5997(int arg0) {
        class201 var1 = (class201) class201.field2096.method5121((long) arg0);
        class201 var2;
        if (var1 == null) {
            byte[] var3 = Statics.field2102.method6080(14, arg0);
            class201 var4 = new class201();
            if (var3 != null) {
                var4.method3483(new class501(var3));
            }
            class201.field2096.method5123(var4, (long) arg0);
            var2 = var4;
        } else {
            var2 = var1;
        }
        int var6 = var2.field2100;
        int var7 = var2.field2099;
        int var8 = var2.field2098;
        int var9 = field3512[var8 - var7];
        return field3514[var6] >> var7 & var9;
    }
}
