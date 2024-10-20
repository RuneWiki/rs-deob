package deob;

@ObfuscatedName("ho")
public class class226 {

    public class226() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fs.o(Lgl;III)[Lhj;")
    public static class223[] method3006(class183 arg0, int arg1, int arg2) {
        return method171(arg0, arg1, arg2) ? method3263() : null;
    }

    @ObfuscatedName("n.m(Lgl;III)Lhj;")
    public static class223 method198(class183 arg0, int arg1, int arg2) {
        if (!method171(arg0, arg1, arg2)) {
            return null;
        }
        class223 var3 = new class223();
        var3.field3198 = Statics.field3078;
        var3.field3193 = Statics.field3217;
        var3.field3196 = Statics.field3126[0];
        var3.field3197 = Statics.field3218[0];
        var3.field3194 = Statics.field1558[0];
        var3.field3199 = Statics.field1200[0];
        var3.field3192 = Statics.field3216;
        var3.field3195 = Statics.field37[0];
        method2997();
        return var3;
    }

    @ObfuscatedName("ex.b(Lgl;IIB)Lhm;")
    public static class225 method2535(class183 arg0, int arg1, int arg2) {
        if (!method171(arg0, arg1, arg2)) {
            return null;
        }
        class225 var3 = new class225();
        var3.field3209 = Statics.field3078;
        var3.field3210 = Statics.field3217;
        var3.field3204 = Statics.field3126[0];
        var3.field3212 = Statics.field3218[0];
        var3.field3208 = Statics.field1558[0];
        var3.field3207 = Statics.field1200[0];
        int var4 = var3.field3208 * var3.field3207;
        byte[] var5 = Statics.field37[0];
        var3.field3211 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var3.field3211[var6] = Statics.field3216[var5[var6] & 0xFF];
        }
        method2997();
        return var3;
    }

    @ObfuscatedName("b.g(Lgl;Lgl;III)Lhq;")
    public static class209 method19(class183 arg0, class183 arg1, int arg2, int arg3) {
        if (!method171(arg0, arg2, arg3)) {
            return null;
        }
        byte[] var4 = arg1.method3012(arg2, arg3);
        class209 var5;
        if (var4 == null) {
            var5 = null;
        } else {
            class209 var6 = new class209(var4, Statics.field3126, Statics.field3218, Statics.field1558, Statics.field1200, Statics.field3216, Statics.field37);
            method2997();
            var5 = var6;
        }
        return var5;
    }

    @ObfuscatedName("dz.l(Lgl;Ljava/lang/String;Ljava/lang/String;I)[Lhj;")
    public static class223[] method2052(class183 arg0, String arg1, String arg2) {
        int var3 = arg0.method3027(arg1);
        int var4 = arg0.method3028(var3, arg2);
        return method3006(arg0, var3, var4);
    }

    @ObfuscatedName("ht.c(Lgl;Ljava/lang/String;Ljava/lang/String;I)Lhj;")
    public static class223 method3667(class183 arg0, String arg1, String arg2) {
        int var3 = arg0.method3027(arg1);
        int var4 = arg0.method3028(var3, arg2);
        return method198(arg0, var3, var4);
    }

    @ObfuscatedName("el.k(Lgl;Ljava/lang/String;Ljava/lang/String;I)Lhm;")
    public static class225 method2761(class183 arg0, String arg1, String arg2) {
        int var3 = arg0.method3027(arg1);
        int var4 = arg0.method3028(var3, arg2);
        return method2535(arg0, var3, var4);
    }

    @ObfuscatedName("go.z(I)[Lhj;")
    public static class223[] method3263() {
        class223[] var0 = new class223[Statics.field3219];
        for (int var1 = 0; var1 < Statics.field3219; var1++) {
            class223 var2 = var0[var1] = new class223();
            var2.field3198 = Statics.field3078;
            var2.field3193 = Statics.field3217;
            var2.field3196 = Statics.field3126[var1];
            var2.field3197 = Statics.field3218[var1];
            var2.field3194 = Statics.field1558[var1];
            var2.field3199 = Statics.field1200[var1];
            var2.field3192 = Statics.field3216;
            var2.field3195 = Statics.field37[var1];
        }
        method2997();
        return var0;
    }

    @ObfuscatedName("ek.y(I)[Lhm;")
    public static class225[] method2524() {
        class225[] var0 = new class225[Statics.field3219];
        for (int var1 = 0; var1 < Statics.field3219; var1++) {
            class225 var2 = var0[var1] = new class225();
            var2.field3209 = Statics.field3078;
            var2.field3210 = Statics.field3217;
            var2.field3204 = Statics.field3126[var1];
            var2.field3212 = Statics.field3218[var1];
            var2.field3208 = Statics.field1558[var1];
            var2.field3207 = Statics.field1200[var1];
            int var3 = var2.field3208 * var2.field3207;
            byte[] var4 = Statics.field37[var1];
            var2.field3211 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                var2.field3211[var5] = Statics.field3216[var4[var5] & 0xFF];
            }
        }
        method2997();
        return var0;
    }

    @ObfuscatedName("p.j(Lgl;IIB)Z")
    public static boolean method171(class183 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3012(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method30(var3);
            return true;
        }
    }

    @ObfuscatedName("cn.f(Lgl;II)Z")
    public static boolean method1756(class183 arg0, int arg1) {
        byte[] var2 = arg0.method3017(arg1);
        if (var2 == null) {
            return false;
        } else {
            method30(var2);
            return true;
        }
    }

    @ObfuscatedName("b.p([BI)V")
    public static void method30(byte[] arg0) {
        class154 var1 = new class154(arg0);
        var1.field2105 = arg0.length - 2;
        Statics.field3219 = var1.method2554();
        Statics.field3126 = new int[Statics.field3219];
        Statics.field3218 = new int[Statics.field3219];
        Statics.field1558 = new int[Statics.field3219];
        Statics.field1200 = new int[Statics.field3219];
        Statics.field37 = new byte[Statics.field3219][];
        var1.field2105 = arg0.length - 7 - Statics.field3219 * 8;
        Statics.field3078 = var1.method2554();
        Statics.field3217 = var1.method2554();
        int var2 = (var1.method2552() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field3219; var3++) {
            Statics.field3126[var3] = var1.method2554();
        }
        for (int var4 = 0; var4 < Statics.field3219; var4++) {
            Statics.field3218[var4] = var1.method2554();
        }
        for (int var5 = 0; var5 < Statics.field3219; var5++) {
            Statics.field1558[var5] = var1.method2554();
        }
        for (int var6 = 0; var6 < Statics.field3219; var6++) {
            Statics.field1200[var6] = var1.method2554();
        }
        var1.field2105 = arg0.length - 7 - Statics.field3219 * 8 - (var2 - 1) * 3;
        Statics.field3216 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field3216[var7] = var1.method2556();
            if (Statics.field3216[var7] == 0) {
                Statics.field3216[var7] = 1;
            }
        }
        var1.field2105 = 0;
        for (int var8 = 0; var8 < Statics.field3219; var8++) {
            int var9 = Statics.field1558[var8];
            int var10 = Statics.field1200[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field37[var8] = var12;
            int var13 = var1.method2552();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method2553();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method2553();
                    }
                }
            }
        }
    }

    @ObfuscatedName("fr.i(B)V")
    public static void method2997() {
        Statics.field3126 = null;
        Statics.field3218 = null;
        Statics.field1558 = null;
        Statics.field1200 = null;
        Statics.field3216 = null;
        Statics.field37 = (byte[][]) null;
    }
}
