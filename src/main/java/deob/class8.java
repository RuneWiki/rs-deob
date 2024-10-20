package deob;

@ObfuscatedName("d")
public class class8 {

    @ObfuscatedName("d.s")
    public static boolean field235 = false;

    @ObfuscatedName("d.c")
    public static boolean field234 = false;

    @ObfuscatedName("d.f")
    public static boolean field232 = false;

    @ObfuscatedName("d.m")
    public static class12 field233 = class12.field270;

    @ObfuscatedName("d.h")
    public static class195 field237 = new class195();

    public class8() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("o.s(Leb;II)V")
    public static final void method53(class134 arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.field1931; var2++) {
            if (arg0.field1937[var2] != -2) {
                int var3 = arg0.field1987[var2];
                int var4 = arg0.field1933[var2];
                int var5 = arg0.field1934[var2];
                int var6 = class134.field1979[var3];
                int var7 = class134.field1979[var4];
                int var8 = class134.field1979[var5];
                method2709(class134.field1965[var3], class134.field1965[var4], class134.field1965[var5], var6, var7, var8, arg1);
            }
        }
    }

    @ObfuscatedName("eh.c(IIIIIIII)V")
    public static final void method2709(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = Math.min(arg3, Math.min(arg4, arg5)) - arg6;
        int var8 = Math.max(arg3, Math.max(arg4, arg5)) + arg6;
        int var9 = Math.min(arg0, Math.min(arg1, arg2)) - arg6;
        int var10 = Math.max(arg0, Math.max(arg1, arg2)) + arg6;
        method39(var7, var9, var8, var10, -49088);
    }

    @ObfuscatedName("n.f(IIIIIB)V")
    public static final void method39(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field237.method3348(new class9(arg0, arg1, arg2, arg3, arg4));
    }
}
