package deob;

@ObfuscatedName("l")
public class class8 {

    @ObfuscatedName("l.m")
    public static boolean field234 = false;

    @ObfuscatedName("l.p")
    public static boolean field231 = false;

    @ObfuscatedName("l.i")
    public static boolean field233 = false;

    @ObfuscatedName("l.j")
    public static class12 field230 = class12.field264;

    @ObfuscatedName("l.v")
    public static class199 field229 = new class199();

    public class8() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("aw.m(Len;IIIB)V")
    public static final void method575(class133 arg0, int arg1, int arg2, int arg3) {
        if (class134.method679(arg0, arg1, arg2, arg3)) {
            method148(arg0, arg1, arg2, arg3, -65281);
        } else if (field230 == class12.field262) {
            method148(arg0, arg1, arg2, arg3, -16776961);
        }
    }

    @ObfuscatedName("eb.p(Len;II)V")
    public static final void method2776(class133 arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.field1851; var2++) {
            if (arg0.field1857[var2] != -2) {
                int var3 = arg0.field1870[var2];
                int var4 = arg0.field1853[var2];
                int var5 = arg0.field1854[var2];
                int var6 = class133.field1901[var3];
                int var7 = class133.field1901[var4];
                int var8 = class133.field1901[var5];
                method8(class133.field1885[var3], class133.field1885[var4], class133.field1885[var5], var6, var7, var8, arg1);
            }
        }
    }

    @ObfuscatedName("j.i(IIIIIIII)V")
    public static final void method8(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = Math.min(arg3, Math.min(arg4, arg5)) - arg6;
        int var8 = Math.max(arg3, Math.max(arg4, arg5)) + arg6;
        int var9 = Math.min(arg0, Math.min(arg1, arg2)) - arg6;
        int var10 = Math.max(arg0, Math.max(arg1, arg2)) + arg6;
        method2368(var7, var9, var8, var10, -49088);
    }

    @ObfuscatedName("r.j(Len;IIIII)V")
    public static final void method148(class133 arg0, int arg1, int arg2, int arg3, int arg4) {
        field229.method3461(new class11(arg0, arg1, arg2, arg3, arg4));
    }

    @ObfuscatedName("dd.v(IIIIIB)V")
    public static final void method2368(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field229.method3461(new class9(arg0, arg1, arg2, arg3, arg4));
    }

    @ObfuscatedName("t.x(S)V")
    public static final void method100() {
        while (true) {
            class10 var0 = (class10) field229.method3468();
            if (var0 == null) {
                return;
            }
            var0.method42();
        }
    }
}
