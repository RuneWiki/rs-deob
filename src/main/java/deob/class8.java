package deob;

@ObfuscatedName("m")
public class class8 {

    @ObfuscatedName("m.w")
    public static boolean field241 = false;

    @ObfuscatedName("m.o")
    public static boolean field237 = false;

    @ObfuscatedName("m.x")
    public static boolean field238 = false;

    @ObfuscatedName("m.k")
    public static class12 field239 = class12.field283;

    @ObfuscatedName("m.f")
    public static class195 field240 = new class195();

    public class8() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ab.w(Lev;IB)V")
    public static final void method581(class134 arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.field1936; var2++) {
            if (arg0.field1989[var2] != -2) {
                int var3 = arg0.field1941[var2];
                int var4 = arg0.field1946[var2];
                int var5 = arg0.field1986[var2];
                int var6 = class134.field1997[var3];
                int var7 = class134.field1997[var4];
                int var8 = class134.field1997[var5];
                int var9 = class134.field1974[var3];
                int var10 = class134.field1974[var4];
                int var11 = class134.field1974[var5];
                int var12 = Math.min(var6, Math.min(var7, var8)) - arg1;
                int var13 = Math.max(var6, Math.max(var7, var8)) + arg1;
                int var14 = Math.min(var9, Math.min(var10, var11)) - arg1;
                int var15 = Math.max(var9, Math.max(var10, var11)) + arg1;
                field240.method3283(new class9(var12, var14, var13, var15, -49088));
            }
        }
    }

    @ObfuscatedName("iv.o(Lev;IIIII)V")
    public static final void method3828(class134 arg0, int arg1, int arg2, int arg3, int arg4) {
        field240.method3283(new class11(arg0, arg1, arg2, arg3, arg4));
    }

    @ObfuscatedName("y.x(B)V")
    public static final void method161() {
        while (true) {
            class10 var0 = (class10) field240.method3288();
            if (var0 == null) {
                return;
            }
            var0.method39();
        }
    }
}
