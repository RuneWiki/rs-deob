package deob;

@ObfuscatedName("fh")
public class class177 {

    @ObfuscatedName("fh.f")
    public static int[] field2905 = new int[32];

    @ObfuscatedName("fh.u")
    public static int[] field2904;

    @ObfuscatedName("fh.x")
    public static int[] field2906;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2905[var1] = var0 - 1;
            var0 += var0;
        }
        field2904 = new int[2000];
        field2906 = new int[2000];
    }

    public class177() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("es.f(II)I")
    public static int method2677(int arg0) {
        class48 var1 = class48.method760(arg0);
        int var2 = var1.field1084;
        int var3 = var1.field1080;
        int var4 = var1.field1081;
        int var5 = field2905[var4 - var3];
        return field2906[var2] >> var3 & var5;
    }

    @ObfuscatedName("ao.u(III)V")
    public static void method685(int arg0, int arg1) {
        class48 var2 = class48.method760(arg0);
        int var3 = var2.field1084;
        int var4 = var2.field1080;
        int var5 = var2.field1081;
        int var6 = field2905[var5 - var4];
        if (arg1 < 0 || arg1 > var6) {
            arg1 = 0;
        }
        int var7 = var6 << var4;
        field2906[var3] = field2906[var3] & ~var7 | arg1 << var4 & var7;
    }
}
