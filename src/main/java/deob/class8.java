package deob;

@ObfuscatedName("l")
public class class8 {

    @ObfuscatedName("l.j")
    public static boolean field228 = false;

    @ObfuscatedName("l.h")
    public static boolean field229 = false;

    @ObfuscatedName("l.f")
    public static boolean field230 = false;

    @ObfuscatedName("l.p")
    public static class12 field231 = class12.field266;

    @ObfuscatedName("l.x")
    public static class193 field232 = new class193();

    public class8() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("a.j(Leo;II)V")
    public static final void method106(class135 arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.field1935; var2++) {
            if (arg0.field1941[var2] != -2) {
                int var3 = arg0.field1936[var2];
                int var4 = arg0.field1937[var2];
                int var5 = arg0.field1938[var2];
                int var6 = class135.field1953[var3];
                int var7 = class135.field1953[var4];
                int var8 = class135.field1953[var5];
                method3617(class135.field1969[var3], class135.field1969[var4], class135.field1969[var5], var6, var7, var8, arg1);
            }
        }
    }

    @ObfuscatedName("hq.h(IIIIIIIB)V")
    public static final void method3617(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = Math.min(arg3, Math.min(arg4, arg5)) - arg6;
        int var8 = Math.max(arg3, Math.max(arg4, arg5)) + arg6;
        int var9 = Math.min(arg0, Math.min(arg1, arg2)) - arg6;
        int var10 = Math.max(arg0, Math.max(arg1, arg2)) + arg6;
        method1(var7, var9, var8, var10, -49088);
    }

    @ObfuscatedName("hm.f(Leo;IIIIB)V")
    public static final void method3585(class135 arg0, int arg1, int arg2, int arg3, int arg4) {
        field232.method3286(new class11(arg0, arg1, arg2, arg3, arg4));
    }

    @ObfuscatedName("h.p(IIIIIB)V")
    public static final void method1(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field232.method3286(new class9(arg0, arg1, arg2, arg3, arg4));
    }

    @ObfuscatedName("s.x(I)V")
    public static final void method68() {
        while (true) {
            class10 var0 = (class10) field232.method3289();
            if (var0 == null) {
                return;
            }
            var0.method30();
        }
    }
}
