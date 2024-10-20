package deob;

@ObfuscatedName("ft")
public class class177 {

    @ObfuscatedName("ft.w")
    public static int[] field2919 = new int[32];

    @ObfuscatedName("ft.x")
    public static int[] field2918;

    @ObfuscatedName("ft.t")
    public static int[] field2917;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2919[var1] = var0 - 1;
            var0 += var0;
        }
        field2918 = new int[2000];
        field2917 = new int[2000];
    }

    public class177() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ej.w(II)I")
    public static int method2977(int arg0) {
        class48 var1 = (class48) class48.field1080.method3520((long) arg0);
        class48 var2;
        if (var1 == null) {
            byte[] var3 = Statics.field1084.method3127(14, arg0);
            class48 var4 = new class48();
            if (var3 != null) {
                var4.method992(new class120(var3));
            }
            class48.field1080.method3522(var4, (long) arg0);
            var2 = var4;
        } else {
            var2 = var1;
        }
        int var6 = var2.field1086;
        int var7 = var2.field1082;
        int var8 = var2.field1083;
        int var9 = field2919[var8 - var7];
        return field2917[var6] >> var7 & var9;
    }
}
