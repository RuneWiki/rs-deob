package deob;

@ObfuscatedName("i")
public class class8 {

    @ObfuscatedName("i.o")
    public static boolean field239 = false;

    @ObfuscatedName("i.k")
    public static boolean field232 = false;

    @ObfuscatedName("i.t")
    public static boolean field233 = false;

    @ObfuscatedName("i.d")
    public static class12 field234 = class12.field276;

    @ObfuscatedName("i.h")
    public static class216 field236 = new class216();

    public class8() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bg.o(Lei;IIII)V")
    public static final void method1578(class132 arg0, int arg1, int arg2, int arg3) {
        if (class133.method2076(arg0, arg1, arg2, arg3)) {
            field236.method3652(new class11(arg0, arg1, arg2, arg3, -65281));
        } else if (field234 == class12.field267) {
            field236.method3652(new class11(arg0, arg1, arg2, arg3, -16776961));
        }
    }

    @ObfuscatedName("ah.k(Lei;IS)V")
    public static final void method360(class132 arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.field1898; var2++) {
            if (arg0.field1863[var2] != -2) {
                int var3 = arg0.field1858[var2];
                int var4 = arg0.field1889[var2];
                int var5 = arg0.field1860[var2];
                int var6 = class132.field1890[var3];
                int var7 = class132.field1890[var4];
                int var8 = class132.field1890[var5];
                method361(class132.field1880[var3], class132.field1880[var4], class132.field1880[var5], var6, var7, var8, arg1);
            }
        }
    }

    @ObfuscatedName("ah.t(IIIIIIII)V")
    public static final void method361(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = Math.min(arg3, Math.min(arg4, arg5)) - arg6;
        int var8 = Math.max(arg3, Math.max(arg4, arg5)) + arg6;
        int var9 = Math.min(arg0, Math.min(arg1, arg2)) - arg6;
        int var10 = Math.max(arg0, Math.max(arg1, arg2)) + arg6;
        method2855(var7, var9, var8, var10, -49088);
    }

    @ObfuscatedName("ek.d(IIIIII)V")
    public static final void method2855(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field236.method3652(new class9(arg0, arg1, arg2, arg3, arg4));
    }
}
