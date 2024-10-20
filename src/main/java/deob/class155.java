package deob;

@ObfuscatedName("er")
public class class155 {

    @ObfuscatedName("er.n")
    public static int[] field2667 = new int[32];

    @ObfuscatedName("er.x")
    public static int[] field2664;

    @ObfuscatedName("er.k")
    public static int[] field2663;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2667[var1] = var0 - 1;
            var0 += var0;
        }
        field2664 = new int[2000];
        field2663 = new int[2000];
    }

    public class155() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("es.n(IB)I")
    public static int method2650(int arg0) {
        class42 var1 = (class42) class42.field974.method3115((long) arg0);
        class42 var2;
        if (var1 == null) {
            byte[] var3 = Statics.field975.method2738(14, arg0);
            class42 var4 = new class42();
            if (var3 != null) {
                var4.method819(new class107(var3));
            }
            class42.field974.method3117(var4, (long) arg0);
            var2 = var4;
        } else {
            var2 = var1;
        }
        int var6 = var2.field976;
        int var7 = var2.field973;
        int var8 = var2.field977;
        int var9 = field2667[var8 - var7];
        return field2663[var6] >> var7 & var9;
    }
}
