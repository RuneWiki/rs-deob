package deob;

@ObfuscatedName("cy")
public class class90 {

    @ObfuscatedName("cy.q")
    public static int[] field1218 = new int[32];

    @ObfuscatedName("cy.l")
    public static int[] field1217;

    @ObfuscatedName("cy.a")
    public static int[] field1219;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field1218[var1] = var0 - 1;
            var0 += var0;
        }
        field1217 = new int[2000];
        field1219 = new int[2000];
    }

    public class90() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("aa.q(II)I")
    public static int method344(int arg0) {
        class160 var1 = (class160) class160.field2416.method1236((long) arg0);
        class160 var2;
        if (var1 == null) {
            byte[] var3 = Statics.field2415.method1024(14, arg0);
            class160 var4 = new class160();
            if (var3 != null) {
                var4.method2507(new class136(var3));
            }
            class160.field2416.method1238(var4, (long) arg0);
            var2 = var4;
        } else {
            var2 = var1;
        }
        int var6 = var2.field2417;
        int var7 = var2.field2418;
        int var8 = var2.field2419;
        int var9 = field1218[var8 - var7];
        return field1219[var6] >> var7 & var9;
    }

    @ObfuscatedName("au.l(IIB)V")
    public static void method401(int arg0, int arg1) {
        class160 var2 = (class160) class160.field2416.method1236((long) arg0);
        class160 var3;
        if (var2 == null) {
            byte[] var4 = Statics.field2415.method1024(14, arg0);
            class160 var5 = new class160();
            if (var4 != null) {
                var5.method2507(new class136(var4));
            }
            class160.field2416.method1238(var5, (long) arg0);
            var3 = var5;
        } else {
            var3 = var2;
        }
        int var7 = var3.field2417;
        int var8 = var3.field2418;
        int var9 = var3.field2419;
        int var10 = field1218[var9 - var8];
        if (arg1 < 0 || arg1 > var10) {
            arg1 = 0;
        }
        int var11 = var10 << var8;
        field1219[var7] = field1219[var7] & ~var11 | arg1 << var8 & var11;
    }
}
