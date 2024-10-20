package deob;

@ObfuscatedName("aa")
public class class39 {

    public class39() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dl.t(Lcy;Ljava/lang/String;Ljava/lang/String;I)[Lfc;")
    public static class171[] method1478(class86 arg0, String arg1, String arg2) {
        int var3 = arg0.method1022(arg1);
        int var4 = arg0.method1071(var3, arg2);
        class171[] var5;
        if (Statics.method738(arg0, var3, var4)) {
            class171[] var6 = new class171[Statics.field526];
            for (int var7 = 0; var7 < Statics.field526; var7++) {
                class171 var8 = var6[var7] = new class171();
                var8.field2518 = Statics.field525;
                var8.field2514 = Statics.field528;
                var8.field2516 = Statics.field527[var7];
                var8.field2517 = Statics.field524[var7];
                var8.field2513 = Statics.field732[var7];
                var8.field2515 = Statics.field529[var7];
                var8.field2519 = Statics.field530;
                var8.field2512 = Statics.field38[var7];
            }
            method158();
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("bf.n(Lcy;Ljava/lang/String;Ljava/lang/String;I)Lfc;")
    public static class171 method759(class86 arg0, String arg1, String arg2) {
        int var3 = arg0.method1022(arg1);
        int var4 = arg0.method1071(var3, arg2);
        class171 var5;
        if (Statics.method738(arg0, var3, var4)) {
            class171 var6 = new class171();
            var6.field2518 = Statics.field525;
            var6.field2514 = Statics.field528;
            var6.field2516 = Statics.field527[0];
            var6.field2517 = Statics.field524[0];
            var6.field2513 = Statics.field732[0];
            var6.field2515 = Statics.field529[0];
            var6.field2519 = Statics.field530;
            var6.field2512 = Statics.field38[0];
            method158();
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("bc.q(Lcy;Ljava/lang/String;Ljava/lang/String;I)[Lfz;")
    public static class170[] method887(class86 arg0, String arg1, String arg2) {
        int var3 = arg0.method1022(arg1);
        int var4 = arg0.method1071(var3, arg2);
        class170[] var5;
        if (Statics.method738(arg0, var3, var4)) {
            var5 = method1479();
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("ae.h(Lcy;Ljava/lang/String;Ljava/lang/String;I)Lfz;")
    public static class170 method368(class86 arg0, String arg1, String arg2) {
        int var3 = arg0.method1022(arg1);
        int var4 = arg0.method1071(var3, arg2);
        class170 var5;
        if (Statics.method738(arg0, var3, var4)) {
            var5 = Statics.method1481();
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("dl.r(I)[Lfz;")
    public static class170[] method1479() {
        class170[] var0 = new class170[Statics.field526];
        for (int var1 = 0; var1 < Statics.field526; var1++) {
            class170 var2 = var0[var1] = new class170();
            var2.field2502 = Statics.field525;
            var2.field2506 = Statics.field528;
            var2.field2511 = Statics.field527[var1];
            var2.field2504 = Statics.field524[var1];
            var2.field2501 = Statics.field732[var1];
            var2.field2500 = Statics.field529[var1];
            int var3 = var2.field2501 * var2.field2500;
            byte[] var4 = Statics.field38[var1];
            var2.field2509 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                var2.field2509[var5] = Statics.field530[var4[var5] & 0xFF];
            }
        }
        method158();
        return var0;
    }

    @ObfuscatedName("h.e(Lcy;IS)Z")
    public static boolean method49(class86 arg0, int arg1) {
        byte[] var2 = arg0.method1013(arg1);
        if (var2 == null) {
            return false;
        } else {
            Statics.method507(var2);
            return true;
        }
    }

    @ObfuscatedName("u.g(I)V")
    public static void method158() {
        Statics.field527 = null;
        Statics.field524 = null;
        Statics.field732 = null;
        Statics.field529 = null;
        Statics.field530 = null;
        Statics.field38 = (byte[][]) null;
    }
}
