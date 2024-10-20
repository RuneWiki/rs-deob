package deob;

@ObfuscatedName("fi")
public class class176 {

    @ObfuscatedName("fi.i")
    public static int[] field2887 = new int[32];

    @ObfuscatedName("fi.v")
    public static int[] field2885;

    @ObfuscatedName("fi.r")
    public static int[] field2886;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2887[var1] = var0 - 1;
            var0 += var0;
        }
        field2885 = new int[2000];
        field2886 = new int[2000];
    }

    public class176() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("e.i(II)I")
    public static int method140(int arg0) {
        class48 var1 = class48.method2970(arg0);
        int var2 = var1.field1062;
        int var3 = var1.field1066;
        int var4 = var1.field1060;
        int var5 = field2887[var4 - var3];
        return field2886[var2] >> var3 & var5;
    }
}
