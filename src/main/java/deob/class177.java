package deob;

@ObfuscatedName("fe")
public class class177 {

    @ObfuscatedName("fe.e")
    public static int[] field2908 = new int[32];

    @ObfuscatedName("fe.w")
    public static int[] field2906;

    @ObfuscatedName("fe.f")
    public static int[] field2904;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2908[var1] = var0 - 1;
            var0 += var0;
        }
        field2906 = new int[2000];
        field2904 = new int[2000];
    }

    public class177() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ev.e(II)I")
    public static int method2798(int arg0) {
        class48 var1 = (class48) class48.field1050.method3473((long) arg0);
        class48 var2;
        if (var1 == null) {
            byte[] var3 = Statics.field1046.method3048(14, arg0);
            class48 var4 = new class48();
            if (var3 != null) {
                var4.method951(new class120(var3));
            }
            class48.field1050.method3475(var4, (long) arg0);
            var2 = var4;
        } else {
            var2 = var1;
        }
        int var6 = var2.field1044;
        int var7 = var2.field1045;
        int var8 = var2.field1047;
        int var9 = field2908[var8 - var7];
        return field2904[var6] >> var7 & var9;
    }
}
