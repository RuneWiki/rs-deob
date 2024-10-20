package deob;

@ObfuscatedName("b")
public class class8 {

    @ObfuscatedName("b.i")
    public static boolean field233 = false;

    @ObfuscatedName("b.j")
    public static boolean field229 = false;

    @ObfuscatedName("b.a")
    public static boolean field237 = false;

    @ObfuscatedName("b.r")
    public static class12 field230 = class12.field277;

    @ObfuscatedName("b.o")
    public static class193 field232 = new class193();

    public class8() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fv.i(Lem;II)V")
    public static final void method2915(class133 arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.field1940; var2++) {
            if (arg0.field2001[var2] != -2) {
                int var3 = arg0.field1941[var2];
                int var4 = arg0.field1942[var2];
                int var5 = arg0.field1986[var2];
                int var6 = class133.field1984[var3];
                int var7 = class133.field1984[var4];
                int var8 = class133.field1984[var5];
                int var9 = class133.field1971[var3];
                int var10 = class133.field1971[var4];
                int var11 = class133.field1971[var5];
                int var12 = Math.min(var6, Math.min(var7, var8)) - arg1;
                int var13 = Math.max(var6, Math.max(var7, var8)) + arg1;
                int var14 = Math.min(var9, Math.min(var10, var11)) - arg1;
                int var15 = Math.max(var9, Math.max(var10, var11)) + arg1;
                method3970(var12, var14, var13, var15, -49088);
            }
        }
    }

    @ObfuscatedName("cj.j(Lem;IIIII)V")
    public static final void method1403(class133 arg0, int arg1, int arg2, int arg3, int arg4) {
        field232.method3375(new class11(arg0, arg1, arg2, arg3, arg4));
    }

    @ObfuscatedName("ig.a(IIIIII)V")
    public static final void method3970(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field232.method3375(new class9(arg0, arg1, arg2, arg3, arg4));
    }
}
