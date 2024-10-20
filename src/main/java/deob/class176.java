package deob;

@ObfuscatedName("fm")
public class class176 {

    @ObfuscatedName("fm.o")
    public static int[] field2904 = new int[32];

    @ObfuscatedName("fm.e")
    public static int[] field2905;

    @ObfuscatedName("fm.u")
    public static int[] field2906;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2904[var1] = var0 - 1;
            var0 += var0;
        }
        field2905 = new int[2000];
        field2906 = new int[2000];
    }

    public class176() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ey.o(II)I")
    public static int method2678(int arg0) {
        class48 var1 = (class48) class48.field1063.method3510((long) arg0);
        class48 var2;
        if (var1 == null) {
            byte[] var3 = Statics.field1059.method3057(14, arg0);
            class48 var4 = new class48();
            if (var3 != null) {
                var4.method957(new class119(var3));
            }
            class48.field1063.method3512(var4, (long) arg0);
            var2 = var4;
        } else {
            var2 = var1;
        }
        int var6 = var2.field1060;
        int var7 = var2.field1064;
        int var8 = var2.field1062;
        int var9 = field2904[var8 - var7];
        return field2906[var6] >> var7 & var9;
    }
}
