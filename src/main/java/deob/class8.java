package deob;

@ObfuscatedName("y")
public class class8 {

    @ObfuscatedName("y.g")
    public static boolean field230 = false;

    @ObfuscatedName("y.e")
    public static boolean field228 = false;

    @ObfuscatedName("y.b")
    public static boolean field229 = false;

    @ObfuscatedName("y.z")
    public static class12 field227 = class12.field273;

    @ObfuscatedName("y.n")
    public static class216 field231 = new class216();

    public class8() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("jh.g(Lee;II)V")
    public static final void method4615(class132 arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.field1866; var2++) {
            if (arg0.field1836[var2] != -2) {
                int var3 = arg0.field1880[var2];
                int var4 = arg0.field1832[var2];
                int var5 = arg0.field1833[var2];
                int var6 = class132.field1863[var3];
                int var7 = class132.field1863[var4];
                int var8 = class132.field1863[var5];
                int var9 = class132.field1864[var3];
                int var10 = class132.field1864[var4];
                int var11 = class132.field1864[var5];
                int var12 = Math.min(var6, Math.min(var7, var8)) - arg1;
                int var13 = Math.max(var6, Math.max(var7, var8)) + arg1;
                int var14 = Math.min(var9, Math.min(var10, var11)) - arg1;
                int var15 = Math.max(var9, Math.max(var10, var11)) + arg1;
                method542(var12, var14, var13, var15, -49088);
            }
        }
    }

    @ObfuscatedName("al.e(IIIIII)V")
    public static final void method542(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field231.method3757(new class9(arg0, arg1, arg2, arg3, arg4));
    }

    @ObfuscatedName("be.b(I)V")
    public static final void method1585() {
        while (true) {
            class10 var0 = (class10) field231.method3776();
            if (var0 == null) {
                return;
            }
            var0.method35();
        }
    }
}
