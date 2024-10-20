package deob;

@ObfuscatedName("li")
public class class325 {

    public class325() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("j.y(Liu;III)[Llb;")
    public static class323[] method77(class250 arg0, int arg1, int arg2) {
        if (!method1684(arg0, arg1, arg2)) {
            return null;
        }
        class323[] var3 = new class323[Statics.field3860];
        for (int var4 = 0; var4 < Statics.field3860; var4++) {
            class323 var5 = var3[var4] = new class323();
            var5.field3844 = Statics.field3858;
            var5.field3837 = Statics.field3859;
            var5.field3841 = Statics.field3861[var4];
            var5.field3839 = Statics.field3863[var4];
            var5.field3838 = Statics.field2604[var4];
            var5.field3840 = Statics.field3862[var4];
            var5.field3843 = Statics.field3864;
            var5.field3842 = Statics.field2628[var4];
        }
        method3127();
        return var3;
    }

    @ObfuscatedName("cu.c(Liu;III)Llb;")
    public static class323 method1876(class250 arg0, int arg1, int arg2) {
        if (!method1684(arg0, arg1, arg2)) {
            return null;
        }
        class323 var3 = new class323();
        var3.field3844 = Statics.field3858;
        var3.field3837 = Statics.field3859;
        var3.field3841 = Statics.field3861[0];
        var3.field3839 = Statics.field3863[0];
        var3.field3838 = Statics.field2604[0];
        var3.field3840 = Statics.field3862[0];
        var3.field3843 = Statics.field3864;
        var3.field3842 = Statics.field2628[0];
        method3127();
        return var3;
    }

    @ObfuscatedName("kg.n(Liu;III)[Llu;")
    public static class324[] method5226(class250 arg0, int arg1, int arg2) {
        if (!method1684(arg0, arg1, arg2)) {
            return null;
        }
        class324[] var3 = new class324[Statics.field3860];
        for (int var4 = 0; var4 < Statics.field3860; var4++) {
            class324 var5 = var3[var4] = new class324();
            var5.field3850 = Statics.field3858;
            var5.field3854 = Statics.field3859;
            var5.field3848 = Statics.field3861[var4];
            var5.field3846 = Statics.field3863[var4];
            var5.field3845 = Statics.field2604[var4];
            var5.field3847 = Statics.field3862[var4];
            int var6 = var5.field3847 * var5.field3845;
            byte[] var7 = Statics.field2628[var4];
            var5.field3851 = new int[var6];
            for (int var8 = 0; var8 < var6; var8++) {
                var5.field3851[var8] = Statics.field3864[var7[var8] & 0xFF];
            }
        }
        method3127();
        return var3;
    }

    @ObfuscatedName("jb.u(Liu;IIB)Llu;")
    public static class324 method4906(class250 arg0, int arg1, int arg2) {
        return method1684(arg0, arg1, arg2) ? method2985() : null;
    }

    @ObfuscatedName("gb.i(Liu;Liu;IIB)Lkt;")
    public static class301 method3516(class250 arg0, class250 arg1, int arg2, int arg3) {
        return method1684(arg0, arg2, arg3) ? Statics.method997(arg1.method4263(arg2, arg3)) : null;
    }

    @ObfuscatedName("kh.p(Liu;Ljava/lang/String;Ljava/lang/String;I)[Llb;")
    public static class323[] method5059(class250 arg0, String arg1, String arg2) {
        int var3 = arg0.method4274(arg1);
        int var4 = arg0.method4275(var3, arg2);
        return method77(arg0, var3, var4);
    }

    @ObfuscatedName("ed.e(Liu;Ljava/lang/String;Ljava/lang/String;I)Llb;")
    public static class323 method2983(class250 arg0, String arg1, String arg2) {
        int var3 = arg0.method4274(arg1);
        int var4 = arg0.method4275(var3, arg2);
        return method1876(arg0, var3, var4);
    }

    @ObfuscatedName("fd.s(Liu;Ljava/lang/String;Ljava/lang/String;I)[Llu;")
    public static class324[] method3232(class250 arg0, String arg1, String arg2) {
        int var3 = arg0.method4274(arg1);
        int var4 = arg0.method4275(var3, arg2);
        return method5226(arg0, var3, var4);
    }

    @ObfuscatedName("gt.v(Liu;Liu;Ljava/lang/String;Ljava/lang/String;I)Lkt;")
    public static class301 method3571(class250 arg0, class250 arg1, String arg2, String arg3) {
        int var4 = arg0.method4274(arg2);
        int var5 = arg0.method4275(var4, arg3);
        return method3516(arg0, arg1, var4, var5);
    }

    @ObfuscatedName("ex.k(I)Llu;")
    public static class324 method2985() {
        class324 var0 = new class324();
        var0.field3850 = Statics.field3858;
        var0.field3854 = Statics.field3859;
        var0.field3848 = Statics.field3861[0];
        var0.field3846 = Statics.field3863[0];
        var0.field3845 = Statics.field2604[0];
        var0.field3847 = Statics.field3862[0];
        int var1 = var0.field3847 * var0.field3845;
        byte[] var2 = Statics.field2628[0];
        var0.field3851 = new int[var1];
        for (int var3 = 0; var3 < var1; var3++) {
            var0.field3851[var3] = Statics.field3864[var2[var3] & 0xFF];
        }
        method3127();
        return var0;
    }

    @ObfuscatedName("ba.q(Liu;III)Z")
    public static boolean method1684(class250 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method4263(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method4904(var3);
            return true;
        }
    }

    @ObfuscatedName("ac.l(Liu;II)Z")
    public static boolean method640(class250 arg0, int arg1) {
        byte[] var2 = arg0.method4326(arg1);
        if (var2 == null) {
            return false;
        } else {
            method4904(var2);
            return true;
        }
    }

    @ObfuscatedName("jb.f([BI)V")
    public static void method4904(byte[] arg0) {
        class185 var1 = new class185(arg0);
        var1.field2374 = arg0.length - 2;
        Statics.field3860 = var1.method3280();
        Statics.field3861 = new int[Statics.field3860];
        Statics.field3863 = new int[Statics.field3860];
        Statics.field2604 = new int[Statics.field3860];
        Statics.field3862 = new int[Statics.field3860];
        Statics.field2628 = new byte[Statics.field3860][];
        var1.field2374 = arg0.length - 7 - Statics.field3860 * 8;
        Statics.field3858 = var1.method3280();
        Statics.field3859 = var1.method3280();
        int var2 = (var1.method3299() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field3860; var3++) {
            Statics.field3861[var3] = var1.method3280();
        }
        for (int var4 = 0; var4 < Statics.field3860; var4++) {
            Statics.field3863[var4] = var1.method3280();
        }
        for (int var5 = 0; var5 < Statics.field3860; var5++) {
            Statics.field2604[var5] = var1.method3280();
        }
        for (int var6 = 0; var6 < Statics.field3860; var6++) {
            Statics.field3862[var6] = var1.method3280();
        }
        var1.field2374 = arg0.length - 7 - Statics.field3860 * 8 - (var2 - 1) * 3;
        Statics.field3864 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field3864[var7] = var1.method3272();
            if (Statics.field3864[var7] == 0) {
                Statics.field3864[var7] = 1;
            }
        }
        var1.field2374 = 0;
        for (int var8 = 0; var8 < Statics.field3860; var8++) {
            int var9 = Statics.field2604[var8];
            int var10 = Statics.field3862[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field2628[var8] = var12;
            int var13 = var1.method3299();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method3319();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method3319();
                    }
                }
            }
        }
    }

    @ObfuscatedName("fw.z(I)V")
    public static void method3127() {
        Statics.field3861 = null;
        Statics.field3863 = null;
        Statics.field2604 = null;
        Statics.field3862 = null;
        Statics.field3864 = null;
        Statics.field2628 = (byte[][]) null;
    }
}
