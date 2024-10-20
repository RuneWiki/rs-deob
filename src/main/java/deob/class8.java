package deob;

@ObfuscatedName("t")
public class class8 {

    @ObfuscatedName("t.d")
    public static boolean field229 = false;

    @ObfuscatedName("t.q")
    public static boolean field226 = false;

    @ObfuscatedName("t.x")
    public static boolean field231 = false;

    @ObfuscatedName("t.y")
    public static class12 field228 = class12.field257;

    @ObfuscatedName("t.e")
    public static class192 field225 = new class192();

    public class8() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ca.d(Lev;IIII)V")
    public static final void method1638(class134 arg0, int arg1, int arg2, int arg3) {
        if (class135.method942(arg0, arg1, arg2, arg3)) {
            field225.method3278(new class11(arg0, arg1, arg2, arg3, -65281));
        } else if (field228 == class12.field253) {
            field225.method3278(new class11(arg0, arg1, arg2, arg3, -16776961));
        }
    }

    @ObfuscatedName("fh.q(Lev;IS)V")
    public static final void method2878(class134 arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.field1901; var2++) {
            if (arg0.field1923[var2] != -2) {
                int var3 = arg0.field1953[var2];
                int var4 = arg0.field1913[var2];
                int var5 = arg0.field1904[var2];
                int var6 = class134.field1934[var3];
                int var7 = class134.field1934[var4];
                int var8 = class134.field1934[var5];
                int var9 = class134.field1950[var3];
                int var10 = class134.field1950[var4];
                int var11 = class134.field1950[var5];
                int var12 = Math.min(var6, Math.min(var7, var8)) - arg1;
                int var13 = Math.max(var6, Math.max(var7, var8)) + arg1;
                int var14 = Math.min(var9, Math.min(var10, var11)) - arg1;
                int var15 = Math.max(var9, Math.max(var10, var11)) + arg1;
                method1408(var12, var14, var13, var15, -49088);
            }
        }
    }

    @ObfuscatedName("cj.x(IIIIII)V")
    public static final void method1408(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field225.method3278(new class9(arg0, arg1, arg2, arg3, arg4));
    }

    @ObfuscatedName("fn.y(I)V")
    public static final void method2873() {
        while (true) {
            class10 var0 = (class10) field225.method3296();
            if (var0 == null) {
                return;
            }
            var0.method40();
        }
    }
}
