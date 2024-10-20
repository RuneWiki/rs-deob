package deob;

@ObfuscatedName("d")
public class class8 {

    @ObfuscatedName("d.s")
    public static boolean field225 = false;

    @ObfuscatedName("d.g")
    public static boolean field222 = false;

    @ObfuscatedName("d.m")
    public static boolean field223 = false;

    @ObfuscatedName("d.h")
    public static class12 field221 = class12.field256;

    @ObfuscatedName("d.i")
    public static class203 field224 = new class203();

    public class8() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ju.s(Les;IB)V")
    public static final void method4635(class131 arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.field1850; var2++) {
            if (arg0.field1822[var2] != -2) {
                int var3 = arg0.field1817[var2];
                int var4 = arg0.field1837[var2];
                int var5 = arg0.field1844[var2];
                int var6 = class131.field1871[var3];
                int var7 = class131.field1871[var4];
                int var8 = class131.field1871[var5];
                int var9 = class131.field1814[var3];
                int var10 = class131.field1814[var4];
                int var11 = class131.field1814[var5];
                int var12 = Math.min(var6, Math.min(var7, var8)) - arg1;
                int var13 = Math.max(var6, Math.max(var7, var8)) + arg1;
                int var14 = Math.min(var9, Math.min(var10, var11)) - arg1;
                int var15 = Math.max(var9, Math.max(var10, var11)) + arg1;
                field224.method3707(new class9(var12, var14, var13, var15, -49088));
            }
        }
    }

    @ObfuscatedName("i.g(Les;IIIII)V")
    public static final void method11(class131 arg0, int arg1, int arg2, int arg3, int arg4) {
        field224.method3707(new class11(arg0, arg1, arg2, arg3, arg4));
    }

    @ObfuscatedName("eq.m(IIIIII)V")
    public static final void method2912(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field224.method3707(new class9(arg0, arg1, arg2, arg3, arg4));
    }

    @ObfuscatedName("bw.h(I)V")
    public static final void method1075() {
        while (true) {
            class10 var0 = (class10) field224.method3710();
            if (var0 == null) {
                return;
            }
            var0.method35();
        }
    }
}
