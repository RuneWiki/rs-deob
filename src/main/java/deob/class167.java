package deob;

@ObfuscatedName("fk")
public class class167 {

    @ObfuscatedName("fk.o")
    public static int[] field2788 = new int[32];

    @ObfuscatedName("fk.l")
    public static int[] field2786;

    @ObfuscatedName("fk.g")
    public static int[] field2791;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2788[var1] = var0 - 1;
            var0 += var0;
        }
        field2786 = new int[2000];
        field2791 = new int[2000];
    }

    public class167() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("s.o(II)I")
    public static int method558(int arg0) {
        class44 var1 = class44.method2912(arg0);
        int var2 = var1.field1000;
        int var3 = var1.field1001;
        int var4 = var1.field1002;
        int var5 = field2788[var4 - var3];
        return field2791[var2] >> var3 & var5;
    }

    @ObfuscatedName("ck.l(III)V")
    public static void method1934(int arg0, int arg1) {
        class44 var2 = class44.method2912(arg0);
        int var3 = var2.field1000;
        int var4 = var2.field1001;
        int var5 = var2.field1002;
        int var6 = field2788[var5 - var4];
        if (arg1 < 0 || arg1 > var6) {
            arg1 = 0;
        }
        int var7 = var6 << var4;
        field2791[var3] = field2791[var3] & ~var7 | arg1 << var4 & var7;
    }
}
