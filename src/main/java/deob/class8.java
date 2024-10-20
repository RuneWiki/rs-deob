package deob;

@ObfuscatedName("g")
public class class8 {

    @ObfuscatedName("g.d")
    public static boolean field244 = false;

    @ObfuscatedName("g.k")
    public static boolean field243 = false;

    @ObfuscatedName("g.e")
    public static boolean field246 = false;

    @ObfuscatedName("g.p")
    public static class12 field245 = class12.field273;

    @ObfuscatedName("g.q")
    public static class192 field248 = new class192();

    public class8() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("jk.d(Leb;IB)V")
    public static final void method4457(class132 arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.field1962; var2++) {
            if (arg0.field1936[var2] != -2) {
                int var3 = arg0.field1922[var2];
                int var4 = arg0.field1923[var2];
                int var5 = arg0.field1924[var2];
                int var6 = class132.field1954[var3];
                int var7 = class132.field1954[var4];
                int var8 = class132.field1954[var5];
                method4418(class132.field1955[var3], class132.field1955[var4], class132.field1955[var5], var6, var7, var8, arg1);
            }
        }
    }

    @ObfuscatedName("iw.k(IIIIIIII)V")
    public static final void method4418(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = Math.min(arg3, Math.min(arg4, arg5)) - arg6;
        int var8 = Math.max(arg3, Math.max(arg4, arg5)) + arg6;
        int var9 = Math.min(arg0, Math.min(arg1, arg2)) - arg6;
        int var10 = Math.max(arg0, Math.max(arg1, arg2)) + arg6;
        method20(var7, var9, var8, var10, -49088);
    }

    @ObfuscatedName("az.e(Leb;IIIIB)V")
    public static final void method457(class132 arg0, int arg1, int arg2, int arg3, int arg4) {
        field248.method3369(new class11(arg0, arg1, arg2, arg3, arg4));
    }

    @ObfuscatedName("r.p(IIIIII)V")
    public static final void method20(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field248.method3369(new class9(arg0, arg1, arg2, arg3, arg4));
    }
}
