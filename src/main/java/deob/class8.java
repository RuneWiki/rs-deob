package deob;

@ObfuscatedName("x")
public class class8 {

    @ObfuscatedName("x.c")
    public static boolean field226 = false;

    @ObfuscatedName("x.o")
    public static boolean field221 = false;

    @ObfuscatedName("x.i")
    public static boolean field222 = false;

    @ObfuscatedName("x.u")
    public static class12 field225 = class12.field256;

    @ObfuscatedName("x.g")
    public static class192 field220 = new class192();

    public class8() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ct.c(Leo;IIII)V")
    public static final void method1527(class134 arg0, int arg1, int arg2, int arg3) {
        if (class135.method1867(arg0, arg1, arg2, arg3)) {
            field220.method3258(new class11(arg0, arg1, arg2, arg3, -65281));
        } else if (field225 == class12.field254) {
            field220.method3258(new class11(arg0, arg1, arg2, arg3, -16776961));
        }
    }

    @ObfuscatedName("as.o(Leo;IS)V")
    public static final void method600(class134 arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.field1887; var2++) {
            if (arg0.field1893[var2] != -2) {
                int var3 = arg0.field1888[var2];
                int var4 = arg0.field1938[var2];
                int var5 = arg0.field1890[var2];
                int var6 = class134.field1932[var3];
                int var7 = class134.field1932[var4];
                int var8 = class134.field1932[var5];
                method3394(class134.field1921[var3], class134.field1921[var4], class134.field1921[var5], var6, var7, var8, arg1);
            }
        }
    }

    @ObfuscatedName("gl.i(IIIIIIIB)V")
    public static final void method3394(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = Math.min(arg3, Math.min(arg4, arg5)) - arg6;
        int var8 = Math.max(arg3, Math.max(arg4, arg5)) + arg6;
        int var9 = Math.min(arg0, Math.min(arg1, arg2)) - arg6;
        int var10 = Math.max(arg0, Math.max(arg1, arg2)) + arg6;
        method107(var7, var9, var8, var10, -49088);
    }

    @ObfuscatedName("y.u(IIIIIB)V")
    public static final void method107(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field220.method3258(new class9(arg0, arg1, arg2, arg3, arg4));
    }
}
