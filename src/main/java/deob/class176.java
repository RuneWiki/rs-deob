package deob;

@ObfuscatedName("fp")
public class class176 {

    @ObfuscatedName("fp.v")
    public static int[] field2910 = new int[32];

    @ObfuscatedName("fp.f")
    public static int[] field2906;

    @ObfuscatedName("fp.i")
    public static int[] field2908;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2910[var1] = var0 - 1;
            var0 += var0;
        }
        field2906 = new int[2000];
        field2908 = new int[2000];
    }

    public class176() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("e.v(II)I")
    public static int method542(int arg0) {
        class48 var1 = (class48) class48.field1058.method3490((long) arg0);
        class48 var2;
        if (var1 == null) {
            byte[] var3 = Statics.field3154.method3082(14, arg0);
            class48 var4 = new class48();
            if (var3 != null) {
                var4.method952(new class119(var3));
            }
            class48.field1058.method3502(var4, (long) arg0);
            var2 = var4;
        } else {
            var2 = var1;
        }
        int var6 = var2.field1060;
        int var7 = var2.field1061;
        int var8 = var2.field1066;
        int var9 = field2910[var8 - var7];
        return field2908[var6] >> var7 & var9;
    }
}
