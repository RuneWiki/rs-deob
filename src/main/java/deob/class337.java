package deob;

@ObfuscatedName("lh")
public class class337 {

    public class337() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cd.h(Lib;IIB)[Llm;")
    public static class336[] method1770(class245 arg0, int arg1, int arg2) {
        if (!method4944(arg0, arg1, arg2)) {
            return null;
        }
        class336[] var3 = new class336[Statics.field3924];
        for (int var4 = 0; var4 < Statics.field3924; var4++) {
            class336 var5 = var3[var4] = new class336();
            var5.field3917 = Statics.field2512;
            var5.field3916 = Statics.field3930;
            var5.field3919 = Statics.field3926[var4];
            var5.field3913 = Statics.field3927[var4];
            var5.field3914 = Statics.field3928[var4];
            var5.field3912 = Statics.field3929[var4];
            int var6 = var5.field3914 * var5.field3912;
            byte[] var7 = Statics.field63[var4];
            var5.field3918 = new int[var6];
            for (int var8 = 0; var8 < var6; var8++) {
                var5.field3918[var8] = Statics.field3925[var7[var8] & 0xFF];
            }
        }
        Statics.field3926 = null;
        Statics.field3927 = null;
        Statics.field3928 = null;
        Statics.field3929 = null;
        Statics.field3925 = null;
        Statics.field63 = (byte[][]) null;
        return var3;
    }

    @ObfuscatedName("hp.v(Lib;IIB)Llm;")
    public static class336 method3795(class245 arg0, int arg1, int arg2) {
        if (!method4944(arg0, arg1, arg2)) {
            return null;
        }
        class336 var3 = new class336();
        var3.field3917 = Statics.field2512;
        var3.field3916 = Statics.field3930;
        var3.field3919 = Statics.field3926[0];
        var3.field3913 = Statics.field3927[0];
        var3.field3914 = Statics.field3928[0];
        var3.field3912 = Statics.field3929[0];
        int var4 = var3.field3914 * var3.field3912;
        byte[] var5 = Statics.field63[0];
        var3.field3918 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var3.field3918[var6] = Statics.field3925[var5[var6] & 0xFF];
        }
        Statics.field3926 = null;
        Statics.field3927 = null;
        Statics.field3928 = null;
        Statics.field3929 = null;
        Statics.field3925 = null;
        Statics.field63 = (byte[][]) null;
        return var3;
    }

    @ObfuscatedName("lw.x(Lib;Lib;III)Lku;")
    public static class306 method5469(class245 arg0, class245 arg1, int arg2, int arg3) {
        return method4944(arg0, arg2, arg3) ? method5055(arg1.method3834(arg2, arg3)) : null;
    }

    @ObfuscatedName("cr.w(Lib;Ljava/lang/String;Ljava/lang/String;I)[Llo;")
    public static class335[] method1967(class245 arg0, String arg1, String arg2) {
        int var3 = arg0.method3880(arg1);
        int var4 = arg0.method3909(var3, arg2);
        class335[] var5;
        if (method4944(arg0, var3, var4)) {
            class335[] var6 = new class335[Statics.field3924];
            for (int var7 = 0; var7 < Statics.field3924; var7++) {
                class335 var8 = var6[var7] = new class335();
                var8.field3911 = Statics.field2512;
                var8.field3907 = Statics.field3930;
                var8.field3908 = Statics.field3926[var7];
                var8.field3909 = Statics.field3927[var7];
                var8.field3906 = Statics.field3928[var7];
                var8.field3910 = Statics.field3929[var7];
                var8.field3905 = Statics.field3925;
                var8.field3904 = Statics.field63[var7];
            }
            Statics.field3926 = null;
            Statics.field3927 = null;
            Statics.field3928 = null;
            Statics.field3929 = null;
            Statics.field3925 = null;
            Statics.field63 = (byte[][]) null;
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("at.t(Lib;Ljava/lang/String;Ljava/lang/String;I)Llo;")
    public static class335 method715(class245 arg0, String arg1, String arg2) {
        int var3 = arg0.method3880(arg1);
        int var4 = arg0.method3909(var3, arg2);
        class335 var5;
        if (method4944(arg0, var3, var4)) {
            var5 = method5472();
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("jg.j(Lib;Ljava/lang/String;Ljava/lang/String;B)[Llm;")
    public static class336[] method4636(class245 arg0, String arg1, String arg2) {
        int var3 = arg0.method3880(arg1);
        int var4 = arg0.method3909(var3, arg2);
        return method1770(arg0, var3, var4);
    }

    @ObfuscatedName("fq.n(Lib;Lib;Ljava/lang/String;Ljava/lang/String;B)Lku;")
    public static class306 method3256(class245 arg0, class245 arg1, String arg2, String arg3) {
        int var4 = arg0.method3880(arg2);
        int var5 = arg0.method3909(var4, arg3);
        return method5469(arg0, arg1, var4, var5);
    }

    @ObfuscatedName("jv.p(Lib;IB)Llo;")
    public static class335 method4417(class245 arg0, int arg1) {
        byte[] var2 = arg0.method3841(arg1);
        boolean var3;
        if (var2 == null) {
            var3 = false;
        } else {
            Statics.method3802(var2);
            var3 = true;
        }
        return var3 ? method5472() : null;
    }

    @ObfuscatedName("lw.l(B)Llo;")
    public static class335 method5472() {
        class335 var0 = new class335();
        var0.field3911 = Statics.field2512;
        var0.field3907 = Statics.field3930;
        var0.field3908 = Statics.field3926[0];
        var0.field3909 = Statics.field3927[0];
        var0.field3906 = Statics.field3928[0];
        var0.field3910 = Statics.field3929[0];
        var0.field3905 = Statics.field3925;
        var0.field3904 = Statics.field63[0];
        Statics.field3926 = null;
        Statics.field3927 = null;
        Statics.field3928 = null;
        Statics.field3929 = null;
        Statics.field3925 = null;
        Statics.field63 = (byte[][]) null;
        return var0;
    }

    @ObfuscatedName("km.z([BI)Lku;")
    public static class306 method5055(byte[] arg0) {
        if (arg0 == null) {
            return null;
        }
        class306 var1 = new class306(arg0, Statics.field3926, Statics.field3927, Statics.field3928, Statics.field3929, Statics.field3925, Statics.field63);
        Statics.field3926 = null;
        Statics.field3927 = null;
        Statics.field3928 = null;
        Statics.field3929 = null;
        Statics.field3925 = null;
        Statics.field63 = (byte[][]) null;
        return var1;
    }

    @ObfuscatedName("kw.u(Lib;III)Z")
    public static boolean method4944(class245 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3834(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            Statics.method3802(var3);
            return true;
        }
    }
}
