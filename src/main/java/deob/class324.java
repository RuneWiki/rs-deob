package deob;

@ObfuscatedName("lp")
public class class324 {

    public class324() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fm.b(Lie;III)[Llv;")
    public static class322[] method3130(class256 arg0, int arg1, int arg2) {
        return method4314(arg0, arg1, arg2) ? Statics.method3124() : null;
    }

    @ObfuscatedName("bv.q(Lie;III)Llv;")
    public static class322 method1572(class256 arg0, int arg1, int arg2) {
        return method4314(arg0, arg1, arg2) ? method4878() : null;
    }

    @ObfuscatedName("bq.o(Lie;III)[Llm;")
    public static class323[] method1514(class256 arg0, int arg1, int arg2) {
        return method4314(arg0, arg1, arg2) ? method747() : null;
    }

    @ObfuscatedName("fp.a(Lie;Lie;III)Lkt;")
    public static class298 method3084(class256 arg0, class256 arg1, int arg2, int arg3) {
        if (!method4314(arg0, arg2, arg3)) {
            return null;
        }
        byte[] var4 = arg1.method4158(arg2, arg3);
        class298 var5;
        if (var4 == null) {
            var5 = null;
        } else {
            class298 var6 = new class298(var4, Statics.field282, Statics.field3313, Statics.field29, Statics.field1752, Statics.field3913, Statics.field3915);
            method2902();
            var5 = var6;
        }
        return var5;
    }

    @ObfuscatedName("gl.h(Lie;Ljava/lang/String;Ljava/lang/String;I)[Llv;")
    public static class322[] method3228(class256 arg0, String arg1, String arg2) {
        int var3 = arg0.method4177(arg1);
        int var4 = arg0.method4228(var3, arg2);
        return method3130(arg0, var3, var4);
    }

    @ObfuscatedName("el.l(Lie;Ljava/lang/String;Ljava/lang/String;I)Llv;")
    public static class322 method2828(class256 arg0, String arg1, String arg2) {
        int var3 = arg0.method4177(arg1);
        int var4 = arg0.method4228(var3, arg2);
        return method1572(arg0, var3, var4);
    }

    @ObfuscatedName("jb.y(Lie;Ljava/lang/String;Ljava/lang/String;I)[Llm;")
    public static class323[] method4575(class256 arg0, String arg1, String arg2) {
        int var3 = arg0.method4177(arg1);
        int var4 = arg0.method4228(var3, arg2);
        return method1514(arg0, var3, var4);
    }

    @ObfuscatedName("ix.g(Lie;Ljava/lang/String;Ljava/lang/String;I)Llm;")
    public static class323 method4145(class256 arg0, String arg1, String arg2) {
        int var3 = arg0.method4177(arg1);
        int var4 = arg0.method4228(var3, arg2);
        return Statics.method154(arg0, var3, var4);
    }

    @ObfuscatedName("do.c(Lie;II)Llv;")
    public static class322 method2103(class256 arg0, int arg1) {
        return method2837(arg0, arg1) ? method4878() : null;
    }

    @ObfuscatedName("ja.t(I)Llv;")
    public static class322 method4878() {
        class322 var0 = new class322();
        var0.field3893 = Statics.field3914;
        var0.field3900 = Statics.field3916;
        var0.field3897 = Statics.field282[0];
        var0.field3898 = Statics.field3313[0];
        var0.field3895 = Statics.field29[0];
        var0.field3896 = Statics.field1752[0];
        var0.field3899 = Statics.field3913;
        var0.field3894 = Statics.field3915[0];
        method2902();
        return var0;
    }

    @ObfuscatedName("bp.f(I)[Llm;")
    public static class323[] method747() {
        class323[] var0 = new class323[Statics.field3917];
        for (int var1 = 0; var1 < Statics.field3917; var1++) {
            class323 var2 = var0[var1] = new class323();
            var2.field3906 = Statics.field3914;
            var2.field3903 = Statics.field3916;
            var2.field3905 = Statics.field282[var1];
            var2.field3902 = Statics.field3313[var1];
            var2.field3901 = Statics.field29[var1];
            var2.field3911 = Statics.field1752[var1];
            int var3 = var2.field3911 * var2.field3901;
            byte[] var4 = Statics.field3915[var1];
            var2.field3904 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                var2.field3904[var5] = Statics.field3913[var4[var5] & 0xFF];
            }
        }
        method2902();
        return var0;
    }

    @ObfuscatedName("dd.m(I)Llm;")
    public static class323 method2472() {
        class323 var0 = new class323();
        var0.field3906 = Statics.field3914;
        var0.field3903 = Statics.field3916;
        var0.field3905 = Statics.field282[0];
        var0.field3902 = Statics.field3313[0];
        var0.field3901 = Statics.field29[0];
        var0.field3911 = Statics.field1752[0];
        int var1 = var0.field3911 * var0.field3901;
        byte[] var2 = Statics.field3915[0];
        var0.field3904 = new int[var1];
        for (int var3 = 0; var3 < var1; var3++) {
            var0.field3904[var3] = Statics.field3913[var2[var3] & 0xFF];
        }
        method2902();
        return var0;
    }

    @ObfuscatedName("io.x(Lie;IIB)Z")
    public static boolean method4314(class256 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method4158(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method4411(var3);
            return true;
        }
    }

    @ObfuscatedName("et.w(Lie;IB)Z")
    public static boolean method2837(class256 arg0, int arg1) {
        byte[] var2 = arg0.method4167(arg1);
        if (var2 == null) {
            return false;
        } else {
            method4411(var2);
            return true;
        }
    }

    @ObfuscatedName("jp.j([BI)V")
    public static void method4411(byte[] arg0) {
        class194 var1 = new class194(arg0);
        var1.field2538 = arg0.length - 2;
        Statics.field3917 = var1.method3249();
        Statics.field282 = new int[Statics.field3917];
        Statics.field3313 = new int[Statics.field3917];
        Statics.field29 = new int[Statics.field3917];
        Statics.field1752 = new int[Statics.field3917];
        Statics.field3915 = new byte[Statics.field3917][];
        var1.field2538 = arg0.length - 7 - Statics.field3917 * 8;
        Statics.field3914 = var1.method3249();
        Statics.field3916 = var1.method3249();
        int var2 = (var1.method3247() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field3917; var3++) {
            Statics.field282[var3] = var1.method3249();
        }
        for (int var4 = 0; var4 < Statics.field3917; var4++) {
            Statics.field3313[var4] = var1.method3249();
        }
        for (int var5 = 0; var5 < Statics.field3917; var5++) {
            Statics.field29[var5] = var1.method3249();
        }
        for (int var6 = 0; var6 < Statics.field3917; var6++) {
            Statics.field1752[var6] = var1.method3249();
        }
        var1.field2538 = arg0.length - 7 - Statics.field3917 * 8 - (var2 - 1) * 3;
        Statics.field3913 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field3913[var7] = var1.method3251();
            if (Statics.field3913[var7] == 0) {
                Statics.field3913[var7] = 1;
            }
        }
        var1.field2538 = 0;
        for (int var8 = 0; var8 < Statics.field3917; var8++) {
            int var9 = Statics.field29[var8];
            int var10 = Statics.field1752[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field3915[var8] = var12;
            int var13 = var1.method3247();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method3248();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method3248();
                    }
                }
            }
        }
    }

    @ObfuscatedName("eu.z(I)V")
    public static void method2902() {
        Statics.field282 = null;
        Statics.field3313 = null;
        Statics.field29 = null;
        Statics.field1752 = null;
        Statics.field3913 = null;
        Statics.field3915 = (byte[][]) null;
    }
}
