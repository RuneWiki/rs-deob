package deob;

@ObfuscatedName("lc")
public class class325 {

    public class325() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ll.c(Lih;III)[Llp;")
    public static class323[] method5347(class250 arg0, int arg1, int arg2) {
        return method2825(arg0, arg1, arg2) ? method5296() : null;
    }

    @ObfuscatedName("jn.q(Lih;III)Llp;")
    public static class323 method4528(class250 arg0, int arg1, int arg2) {
        if (!method2825(arg0, arg1, arg2)) {
            return null;
        }
        class323 var3 = new class323();
        var3.field3850 = Statics.field3864;
        var3.field3843 = Statics.field78;
        var3.field3849 = Statics.field559[0];
        var3.field3848 = Statics.field3863[0];
        var3.field3845 = Statics.field3865[0];
        var3.field3846 = Statics.field3868[0];
        var3.field3844 = Statics.field3866;
        var3.field3847 = Statics.field326[0];
        method200();
        return var3;
    }

    @ObfuscatedName("gf.m(Lih;III)[Llt;")
    public static class324[] method3520(class250 arg0, int arg1, int arg2) {
        if (!method2825(arg0, arg1, arg2)) {
            return null;
        }
        class324[] var3 = new class324[Statics.field3867];
        for (int var4 = 0; var4 < Statics.field3867; var4++) {
            class324 var5 = var3[var4] = new class324();
            var5.field3855 = Statics.field3864;
            var5.field3857 = Statics.field78;
            var5.field3854 = Statics.field559[var4];
            var5.field3851 = Statics.field3863[var4];
            var5.field3852 = Statics.field3865[var4];
            var5.field3862 = Statics.field3868[var4];
            int var6 = var5.field3862 * var5.field3852;
            byte[] var7 = Statics.field326[var4];
            var5.field3853 = new int[var6];
            for (int var8 = 0; var8 < var6; var8++) {
                var5.field3853[var8] = Statics.field3866[var7[var8] & 0xFF];
            }
        }
        method200();
        return var3;
    }

    @ObfuscatedName("ii.j(Lih;III)Llt;")
    public static class324 method4170(class250 arg0, int arg1, int arg2) {
        return method2825(arg0, arg1, arg2) ? method4394() : null;
    }

    @ObfuscatedName("jt.g(Lih;Lih;IIB)Lkh;")
    public static class301 method4796(class250 arg0, class250 arg1, int arg2, int arg3) {
        return method2825(arg0, arg2, arg3) ? method287(arg1.method4210(arg2, arg3)) : null;
    }

    @ObfuscatedName("in.i(Lih;Ljava/lang/String;Ljava/lang/String;I)[Llp;")
    public static class323[] method4472(class250 arg0, String arg1, String arg2) {
        int var3 = arg0.method4228(arg1);
        int var4 = arg0.method4255(var3, arg2);
        return method5347(arg0, var3, var4);
    }

    @ObfuscatedName("iw.h(Lih;Ljava/lang/String;Ljava/lang/String;I)Llp;")
    public static class323 method4194(class250 arg0, String arg1, String arg2) {
        int var3 = arg0.method4228(arg1);
        int var4 = arg0.method4255(var3, arg2);
        return method4528(arg0, var3, var4);
    }

    @ObfuscatedName("kj.l(B)[Llp;")
    public static class323[] method5296() {
        class323[] var0 = new class323[Statics.field3867];
        for (int var1 = 0; var1 < Statics.field3867; var1++) {
            class323 var2 = var0[var1] = new class323();
            var2.field3850 = Statics.field3864;
            var2.field3843 = Statics.field78;
            var2.field3849 = Statics.field559[var1];
            var2.field3848 = Statics.field3863[var1];
            var2.field3845 = Statics.field3865[var1];
            var2.field3846 = Statics.field3868[var1];
            var2.field3844 = Statics.field3866;
            var2.field3847 = Statics.field326[var1];
        }
        method200();
        return var0;
    }

    @ObfuscatedName("il.o(I)Llt;")
    public static class324 method4394() {
        class324 var0 = new class324();
        var0.field3855 = Statics.field3864;
        var0.field3857 = Statics.field78;
        var0.field3854 = Statics.field559[0];
        var0.field3851 = Statics.field3863[0];
        var0.field3852 = Statics.field3865[0];
        var0.field3862 = Statics.field3868[0];
        int var1 = var0.field3862 * var0.field3852;
        byte[] var2 = Statics.field326[0];
        var0.field3853 = new int[var1];
        for (int var3 = 0; var3 < var1; var3++) {
            var0.field3853[var3] = Statics.field3866[var2[var3] & 0xFF];
        }
        method200();
        return var0;
    }

    @ObfuscatedName("e.k([BB)Lkh;")
    public static class301 method287(byte[] arg0) {
        if (arg0 == null) {
            return null;
        } else {
            class301 var1 = new class301(arg0, Statics.field559, Statics.field3863, Statics.field3865, Statics.field3868, Statics.field3866, Statics.field326);
            method200();
            return var1;
        }
    }

    @ObfuscatedName("dy.v(Lih;IIB)Z")
    public static boolean method2825(class250 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method4210(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method45(var3);
            return true;
        }
    }

    @ObfuscatedName("j.p([BB)V")
    public static void method45(byte[] arg0) {
        class185 var1 = new class185(arg0);
        var1.field2386 = arg0.length - 2;
        Statics.field3867 = var1.method3245();
        Statics.field559 = new int[Statics.field3867];
        Statics.field3863 = new int[Statics.field3867];
        Statics.field3865 = new int[Statics.field3867];
        Statics.field3868 = new int[Statics.field3867];
        Statics.field326 = new byte[Statics.field3867][];
        var1.field2386 = arg0.length - 7 - Statics.field3867 * 8;
        Statics.field3864 = var1.method3245();
        Statics.field78 = var1.method3245();
        int var2 = (var1.method3243() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field3867; var3++) {
            Statics.field559[var3] = var1.method3245();
        }
        for (int var4 = 0; var4 < Statics.field3867; var4++) {
            Statics.field3863[var4] = var1.method3245();
        }
        for (int var5 = 0; var5 < Statics.field3867; var5++) {
            Statics.field3865[var5] = var1.method3245();
        }
        for (int var6 = 0; var6 < Statics.field3867; var6++) {
            Statics.field3868[var6] = var1.method3245();
        }
        var1.field2386 = arg0.length - 7 - Statics.field3867 * 8 - (var2 - 1) * 3;
        Statics.field3866 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field3866[var7] = var1.method3247();
            if (Statics.field3866[var7] == 0) {
                Statics.field3866[var7] = 1;
            }
        }
        var1.field2386 = 0;
        for (int var8 = 0; var8 < Statics.field3867; var8++) {
            int var9 = Statics.field3865[var8];
            int var10 = Statics.field3868[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field326[var8] = var12;
            int var13 = var1.method3243();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method3244();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method3244();
                    }
                }
            }
        }
    }

    @ObfuscatedName("b.n(I)V")
    public static void method200() {
        Statics.field559 = null;
        Statics.field3863 = null;
        Statics.field3865 = null;
        Statics.field3868 = null;
        Statics.field3866 = null;
        Statics.field326 = (byte[][]) null;
    }
}
