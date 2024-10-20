package deob;

@ObfuscatedName("lt")
public class class326 {

    public class326() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fe.f(Lhf;IIB)[Lln;")
    public static class325[] method3167(class234 arg0, int arg1, int arg2) {
        if (!method1850(arg0, arg1, arg2)) {
            return null;
        }
        class325[] var3 = new class325[Statics.field3884];
        for (int var4 = 0; var4 < Statics.field3884; var4++) {
            class325 var5 = var3[var4] = new class325();
            var5.field3874 = Statics.field3881;
            var5.field3871 = Statics.field1970;
            var5.field3870 = Statics.field1942[var4];
            var5.field3873 = Statics.field2564[var4];
            var5.field3869 = Statics.field3883[var4];
            var5.field3872 = Statics.field3243[var4];
            int var6 = var5.field3872 * var5.field3869;
            byte[] var7 = Statics.field3858[var4];
            var5.field3877 = new int[var6];
            for (int var8 = 0; var8 < var6; var8++) {
                var5.field3877[var8] = Statics.field3882[var7[var8] & 0xFF];
            }
        }
        method2280();
        return var3;
    }

    @ObfuscatedName("kh.b(Lhf;III)Lln;")
    public static class325 method4926(class234 arg0, int arg1, int arg2) {
        return method1850(arg0, arg1, arg2) ? method3049() : null;
    }

    @ObfuscatedName("bq.g(Lhf;Lhf;III)Lky;")
    public static class295 method1044(class234 arg0, class234 arg1, int arg2, int arg3) {
        return method1850(arg0, arg2, arg3) ? method4443(arg1.method3928(arg2, arg3)) : null;
    }

    @ObfuscatedName("ko.z(Lhf;Ljava/lang/String;Ljava/lang/String;I)Llm;")
    public static class324 method5408(class234 arg0, String arg1, String arg2) {
        int var3 = arg0.method3917(arg1);
        int var4 = arg0.method3901(var3, arg2);
        return Statics.method3190(arg0, var3, var4);
    }

    @ObfuscatedName("gd.h(Lhf;IB)Llm;")
    public static class324 method3345(class234 arg0, int arg1) {
        byte[] var2 = arg0.method3850(arg1);
        boolean var3;
        if (var2 == null) {
            var3 = false;
        } else {
            method5153(var2);
            var3 = true;
        }
        return var3 ? method152() : null;
    }

    @ObfuscatedName("et.y(B)[Llm;")
    public static class324[] method3052() {
        class324[] var0 = new class324[Statics.field3884];
        for (int var1 = 0; var1 < Statics.field3884; var1++) {
            class324 var2 = var0[var1] = new class324();
            var2.field3861 = Statics.field3881;
            var2.field3868 = Statics.field1970;
            var2.field3865 = Statics.field1942[var1];
            var2.field3866 = Statics.field2564[var1];
            var2.field3863 = Statics.field3883[var1];
            var2.field3862 = Statics.field3243[var1];
            var2.field3867 = Statics.field3882;
            var2.field3864 = Statics.field3858[var1];
        }
        method2280();
        return var0;
    }

    @ObfuscatedName("o.w(I)Llm;")
    public static class324 method152() {
        class324 var0 = new class324();
        var0.field3861 = Statics.field3881;
        var0.field3868 = Statics.field1970;
        var0.field3865 = Statics.field1942[0];
        var0.field3866 = Statics.field2564[0];
        var0.field3863 = Statics.field3883[0];
        var0.field3862 = Statics.field3243[0];
        var0.field3867 = Statics.field3882;
        var0.field3864 = Statics.field3858[0];
        method2280();
        return var0;
    }

    @ObfuscatedName("ej.i(B)Lln;")
    public static class325 method3049() {
        class325 var0 = new class325();
        var0.field3874 = Statics.field3881;
        var0.field3871 = Statics.field1970;
        var0.field3870 = Statics.field1942[0];
        var0.field3873 = Statics.field2564[0];
        var0.field3869 = Statics.field3883[0];
        var0.field3872 = Statics.field3243[0];
        int var1 = var0.field3872 * var0.field3869;
        byte[] var2 = Statics.field3858[0];
        var0.field3877 = new int[var1];
        for (int var3 = 0; var3 < var1; var3++) {
            var0.field3877[var3] = Statics.field3882[var2[var3] & 0xFF];
        }
        method2280();
        return var0;
    }

    @ObfuscatedName("ii.k([BI)Lky;")
    public static class295 method4443(byte[] arg0) {
        if (arg0 == null) {
            return null;
        } else {
            class295 var1 = new class295(arg0, Statics.field1942, Statics.field2564, Statics.field3883, Statics.field3243, Statics.field3882, Statics.field3858);
            method2280();
            return var1;
        }
    }

    @ObfuscatedName("bk.x(Lhf;IIB)Z")
    public static boolean method1850(class234 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3928(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method5153(var3);
            return true;
        }
    }

    @ObfuscatedName("kg.o([BI)V")
    public static void method5153(byte[] arg0) {
        class300 var1 = new class300(arg0);
        var1.field3707 = arg0.length - 2;
        Statics.field3884 = var1.method5337();
        Statics.field1942 = new int[Statics.field3884];
        Statics.field2564 = new int[Statics.field3884];
        Statics.field3883 = new int[Statics.field3884];
        Statics.field3243 = new int[Statics.field3884];
        Statics.field3858 = new byte[Statics.field3884][];
        var1.field3707 = arg0.length - 7 - Statics.field3884 * 8;
        Statics.field3881 = var1.method5337();
        Statics.field1970 = var1.method5337();
        int var2 = (var1.method5138() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field3884; var3++) {
            Statics.field1942[var3] = var1.method5337();
        }
        for (int var4 = 0; var4 < Statics.field3884; var4++) {
            Statics.field2564[var4] = var1.method5337();
        }
        for (int var5 = 0; var5 < Statics.field3884; var5++) {
            Statics.field3883[var5] = var1.method5337();
        }
        for (int var6 = 0; var6 < Statics.field3884; var6++) {
            Statics.field3243[var6] = var1.method5337();
        }
        var1.field3707 = arg0.length - 7 - Statics.field3884 * 8 - (var2 - 1) * 3;
        Statics.field3882 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field3882[var7] = var1.method5287();
            if (Statics.field3882[var7] == 0) {
                Statics.field3882[var7] = 1;
            }
        }
        var1.field3707 = 0;
        for (int var8 = 0; var8 < Statics.field3884; var8++) {
            int var9 = Statics.field3883[var8];
            int var10 = Statics.field3243[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field3858[var8] = var12;
            int var13 = var1.method5138();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method5139();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method5139();
                    }
                }
            }
        }
    }

    @ObfuscatedName("de.e(S)V")
    public static void method2280() {
        Statics.field1942 = null;
        Statics.field2564 = null;
        Statics.field3883 = null;
        Statics.field3243 = null;
        Statics.field3882 = null;
        Statics.field3858 = (byte[][]) null;
    }
}
