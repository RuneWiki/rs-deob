package deob;

@ObfuscatedName("t")
public class class8 {

    @ObfuscatedName("t.b")
    public static boolean field220 = false;

    @ObfuscatedName("t.s")
    public static boolean field218 = false;

    @ObfuscatedName("t.r")
    public static boolean field225 = false;

    @ObfuscatedName("t.g")
    public static class12 field219 = class12.field252;

    @ObfuscatedName("t.x")
    public static class199 field221 = new class199();

    public class8() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("hj.b(Lev;II)V")
    public static final void method3590(class133 arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.field1839; var2++) {
            if (arg0.field1845[var2] != -2) {
                int var3 = arg0.field1838[var2];
                int var4 = arg0.field1841[var2];
                int var5 = arg0.field1842[var2];
                int var6 = class133.field1878[var3];
                int var7 = class133.field1878[var4];
                int var8 = class133.field1878[var5];
                method2305(class133.field1873[var3], class133.field1873[var4], class133.field1873[var5], var6, var7, var8, arg1);
            }
        }
    }

    @ObfuscatedName("ec.s(IIIIIIIB)V")
    public static final void method2305(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = Math.min(arg3, Math.min(arg4, arg5)) - arg6;
        int var8 = Math.max(arg3, Math.max(arg4, arg5)) + arg6;
        int var9 = Math.min(arg0, Math.min(arg1, arg2)) - arg6;
        int var10 = Math.max(arg0, Math.max(arg1, arg2)) + arg6;
        method70(var7, var9, var8, var10, -49088);
    }

    @ObfuscatedName("n.r(Lev;IIIII)V")
    public static final void method49(class133 arg0, int arg1, int arg2, int arg3, int arg4) {
        field221.method3369(new class11(arg0, arg1, arg2, arg3, arg4));
    }

    @ObfuscatedName("q.g(IIIIIB)V")
    public static final void method70(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field221.method3369(new class9(arg0, arg1, arg2, arg3, arg4));
    }

    @ObfuscatedName("v.x(I)V")
    public static final void method166() {
        while (true) {
            class10 var0 = (class10) field221.method3356();
            if (var0 == null) {
                return;
            }
            var0.method38();
        }
    }
}
