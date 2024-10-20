package deob;

@ObfuscatedName("r")
public class class8 {

    @ObfuscatedName("r.p")
    public static boolean field227 = false;

    @ObfuscatedName("r.i")
    public static boolean field221 = false;

    @ObfuscatedName("r.w")
    public static boolean field220 = false;

    @ObfuscatedName("r.s")
    public static class12 field223 = class12.field252;

    @ObfuscatedName("r.j")
    public static class203 field225 = new class203();

    public class8() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("an.p(Len;II)V")
    public static final void method482(class131 arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.field1808; var2++) {
            if (arg0.field1814[var2] != -2) {
                int var3 = arg0.field1809[var2];
                int var4 = arg0.field1860[var2];
                int var5 = arg0.field1811[var2];
                int var6 = class131.field1851[var3];
                int var7 = class131.field1851[var4];
                int var8 = class131.field1851[var5];
                method181(class131.field1842[var3], class131.field1842[var4], class131.field1842[var5], var6, var7, var8, arg1);
            }
        }
    }

    @ObfuscatedName("c.i(IIIIIIIB)V")
    public static final void method181(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = Math.min(arg3, Math.min(arg4, arg5)) - arg6;
        int var8 = Math.max(arg3, Math.max(arg4, arg5)) + arg6;
        int var9 = Math.min(arg0, Math.min(arg1, arg2)) - arg6;
        int var10 = Math.max(arg0, Math.max(arg1, arg2)) + arg6;
        field225.method3533(new class9(var7, var9, var8, var10, -49088));
    }

    @ObfuscatedName("ie.w(B)V")
    public static final void method4260() {
        while (true) {
            class10 var0 = (class10) field225.method3534();
            if (var0 == null) {
                return;
            }
            var0.method49();
        }
    }
}
