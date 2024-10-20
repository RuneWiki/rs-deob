package deob;

@ObfuscatedName("li")
public class class337 {

    public class337() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fv.f(Liw;IIB)[Lle;")
    public static class335[] method3244(class245 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3905(arg1, arg2);
        boolean var4;
        if (var3 == null) {
            var4 = false;
        } else {
            method3719(var3);
            var4 = true;
        }
        if (!var4) {
            return null;
        }
        class335[] var5 = new class335[Statics.field3921];
        for (int var6 = 0; var6 < Statics.field3921; var6++) {
            class335 var7 = var5[var6] = new class335();
            var7.field3900 = Statics.field3922;
            var7.field3907 = Statics.field3925;
            var7.field3904 = Statics.field3923[var6];
            var7.field3905 = Statics.field2578[var6];
            var7.field3902 = Statics.field3924[var6];
            var7.field3903 = Statics.field3920[var6];
            var7.field3901 = Statics.field295;
            var7.field3906 = Statics.field57[var6];
        }
        Statics.field3923 = null;
        Statics.field2578 = null;
        Statics.field3924 = null;
        Statics.field3920 = null;
        Statics.field295 = null;
        Statics.field57 = (byte[][]) null;
        return var5;
    }

    @ObfuscatedName("jy.l(Liw;III)[Llc;")
    public static class336[] method4468(class245 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3905(arg1, arg2);
        boolean var4;
        if (var3 == null) {
            var4 = false;
        } else {
            method3719(var3);
            var4 = true;
        }
        if (!var4) {
            return null;
        }
        class336[] var5 = new class336[Statics.field3921];
        for (int var6 = 0; var6 < Statics.field3921; var6++) {
            class336 var7 = var5[var6] = new class336();
            var7.field3908 = Statics.field3922;
            var7.field3918 = Statics.field3925;
            var7.field3911 = Statics.field3923[var6];
            var7.field3912 = Statics.field2578[var6];
            var7.field3909 = Statics.field3924[var6];
            var7.field3915 = Statics.field3920[var6];
            int var8 = var7.field3915 * var7.field3909;
            byte[] var9 = Statics.field57[var6];
            var7.field3910 = new int[var8];
            for (int var10 = 0; var10 < var8; var10++) {
                var7.field3910[var10] = Statics.field295[var9[var10] & 0xFF];
            }
        }
        Statics.field3923 = null;
        Statics.field2578 = null;
        Statics.field3924 = null;
        Statics.field3920 = null;
        Statics.field295 = null;
        Statics.field57 = (byte[][]) null;
        return var5;
    }

    @ObfuscatedName("ek.m(Liw;III)Llc;")
    public static class336 method2722(class245 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3905(arg1, arg2);
        boolean var4;
        if (var3 == null) {
            var4 = false;
        } else {
            method3719(var3);
            var4 = true;
        }
        return var4 ? method4718() : null;
    }

    @ObfuscatedName("bj.z(Liw;Ljava/lang/String;Ljava/lang/String;I)Lle;")
    public static class335 method792(class245 arg0, String arg1, String arg2) {
        int var3 = arg0.method3923(arg1);
        int var4 = arg0.method3924(var3, arg2);
        return Statics.method2950(arg0, var3, var4);
    }

    @ObfuscatedName("ju.q(Liw;Ljava/lang/String;Ljava/lang/String;I)[Llc;")
    public static class336[] method4268(class245 arg0, String arg1, String arg2) {
        int var3 = arg0.method3923(arg1);
        int var4 = arg0.method3924(var3, arg2);
        return method4468(arg0, var3, var4);
    }

    @ObfuscatedName("eu.k(Liw;Liw;Ljava/lang/String;Ljava/lang/String;I)Lkq;")
    public static class306 method2945(class245 arg0, class245 arg1, String arg2, String arg3) {
        int var4 = arg0.method3923(arg2);
        int var5 = arg0.method3924(var4, arg3);
        byte[] var6 = arg0.method3905(var4, var5);
        boolean var7;
        if (var6 == null) {
            var7 = false;
        } else {
            method3719(var6);
            var7 = true;
        }
        class306 var8;
        if (var7) {
            var8 = method3146(arg1.method3905(var4, var5));
        } else {
            var8 = null;
        }
        return var8;
    }

    @ObfuscatedName("kg.c(Liw;II)Lle;")
    public static class335 method4960(class245 arg0, int arg1) {
        if (!method655(arg0, arg1)) {
            return null;
        }
        class335 var2 = new class335();
        var2.field3900 = Statics.field3922;
        var2.field3907 = Statics.field3925;
        var2.field3904 = Statics.field3923[0];
        var2.field3905 = Statics.field2578[0];
        var2.field3902 = Statics.field3924[0];
        var2.field3903 = Statics.field3920[0];
        var2.field3901 = Statics.field295;
        var2.field3906 = Statics.field57[0];
        Statics.field3923 = null;
        Statics.field2578 = null;
        Statics.field3924 = null;
        Statics.field3920 = null;
        Statics.field295 = null;
        Statics.field57 = (byte[][]) null;
        return var2;
    }

    @ObfuscatedName("jw.u(I)Llc;")
    public static class336 method4718() {
        class336 var0 = new class336();
        var0.field3908 = Statics.field3922;
        var0.field3918 = Statics.field3925;
        var0.field3911 = Statics.field3923[0];
        var0.field3912 = Statics.field2578[0];
        var0.field3909 = Statics.field3924[0];
        var0.field3915 = Statics.field3920[0];
        int var1 = var0.field3915 * var0.field3909;
        byte[] var2 = Statics.field57[0];
        var0.field3910 = new int[var1];
        for (int var3 = 0; var3 < var1; var3++) {
            var0.field3910[var3] = Statics.field295[var2[var3] & 0xFF];
        }
        Statics.field3923 = null;
        Statics.field2578 = null;
        Statics.field3924 = null;
        Statics.field3920 = null;
        Statics.field295 = null;
        Statics.field57 = (byte[][]) null;
        return var0;
    }

    @ObfuscatedName("es.t([BB)Lkq;")
    public static class306 method3146(byte[] arg0) {
        if (arg0 == null) {
            return null;
        }
        class306 var1 = new class306(arg0, Statics.field3923, Statics.field2578, Statics.field3924, Statics.field3920, Statics.field295, Statics.field57);
        Statics.field3923 = null;
        Statics.field2578 = null;
        Statics.field3924 = null;
        Statics.field3920 = null;
        Statics.field295 = null;
        Statics.field57 = (byte[][]) null;
        return var1;
    }

    @ObfuscatedName("aj.e(Liw;II)Z")
    public static boolean method655(class245 arg0, int arg1) {
        byte[] var2 = arg0.method3912(arg1);
        if (var2 == null) {
            return false;
        } else {
            method3719(var2);
            return true;
        }
    }

    @ObfuscatedName("hq.o([BI)V")
    public static void method3719(byte[] arg0) {
        class311 var1 = new class311(arg0);
        var1.field3741 = arg0.length - 2;
        Statics.field3921 = var1.method5163();
        Statics.field3923 = new int[Statics.field3921];
        Statics.field2578 = new int[Statics.field3921];
        Statics.field3924 = new int[Statics.field3921];
        Statics.field3920 = new int[Statics.field3921];
        Statics.field57 = new byte[Statics.field3921][];
        var1.field3741 = arg0.length - 7 - Statics.field3921 * 8;
        Statics.field3922 = var1.method5163();
        Statics.field3925 = var1.method5163();
        int var2 = (var1.method5276() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field3921; var3++) {
            Statics.field3923[var3] = var1.method5163();
        }
        for (int var4 = 0; var4 < Statics.field3921; var4++) {
            Statics.field2578[var4] = var1.method5163();
        }
        for (int var5 = 0; var5 < Statics.field3921; var5++) {
            Statics.field3924[var5] = var1.method5163();
        }
        for (int var6 = 0; var6 < Statics.field3921; var6++) {
            Statics.field3920[var6] = var1.method5163();
        }
        var1.field3741 = arg0.length - 7 - Statics.field3921 * 8 - (var2 - 1) * 3;
        Statics.field295 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field295[var7] = var1.method5184();
            if (Statics.field295[var7] == 0) {
                Statics.field295[var7] = 1;
            }
        }
        var1.field3741 = 0;
        for (int var8 = 0; var8 < Statics.field3921; var8++) {
            int var9 = Statics.field3924[var8];
            int var10 = Statics.field3920[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field57[var8] = var12;
            int var13 = var1.method5276();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method5181();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method5181();
                    }
                }
            }
        }
    }
}
