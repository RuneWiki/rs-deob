package deob;

@ObfuscatedName("kd")
public class class300 {

    public class300() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dd.n(Lil;III)[Lkm;")
    public static class298[] method1936(class247 arg0, int arg1, int arg2) {
        return method4715(arg0, arg1, arg2) ? method483() : null;
    }

    @ObfuscatedName("cx.v(Lil;III)Lkm;")
    public static class298 method1596(class247 arg0, int arg1, int arg2) {
        return method4715(arg0, arg1, arg2) ? method1706() : null;
    }

    @ObfuscatedName("il.y(Lil;III)[Lkg;")
    public static class299[] method4008(class247 arg0, int arg1, int arg2) {
        return method4715(arg0, arg1, arg2) ? method661() : null;
    }

    @ObfuscatedName("bq.r(Lil;III)Lkg;")
    public static class299 method675(class247 arg0, int arg1, int arg2) {
        return method4715(arg0, arg1, arg2) ? method239() : null;
    }

    @ObfuscatedName("kr.h(Lil;Ljava/lang/String;Ljava/lang/String;B)[Lkm;")
    public static class298[] method4825(class247 arg0, String arg1, String arg2) {
        int var3 = arg0.method4007(arg1);
        int var4 = arg0.method4009(var3, arg2);
        return method1936(arg0, var3, var4);
    }

    @ObfuscatedName("hn.d(Lil;Ljava/lang/String;Ljava/lang/String;I)Lkm;")
    public static class298 method3770(class247 arg0, String arg1, String arg2) {
        int var3 = arg0.method4007(arg1);
        int var4 = arg0.method4009(var3, arg2);
        return method1596(arg0, var3, var4);
    }

    @ObfuscatedName("d.s(Lil;Ljava/lang/String;Ljava/lang/String;I)[Lkg;")
    public static class299[] method17(class247 arg0, String arg1, String arg2) {
        int var3 = arg0.method4007(arg1);
        int var4 = arg0.method4009(var3, arg2);
        return method4008(arg0, var3, var4);
    }

    @ObfuscatedName("iq.b(Lil;Lil;Ljava/lang/String;Ljava/lang/String;I)Ljz;")
    public static class275 method3910(class247 arg0, class247 arg1, String arg2, String arg3) {
        int var4 = arg0.method4007(arg2);
        int var5 = arg0.method4009(var4, arg3);
        class275 var6;
        if (method4715(arg0, var4, var5)) {
            byte[] var7 = arg1.method3931(var4, var5);
            class275 var8;
            if (var7 == null) {
                var8 = null;
            } else {
                class275 var9 = new class275(var7, Statics.field3871, Statics.field3872, Statics.field636, Statics.field2100, Statics.field3870, Statics.field2552);
                method2696();
                var8 = var9;
            }
            var6 = var8;
        } else {
            var6 = null;
        }
        return var6;
    }

    @ObfuscatedName("ae.e(Lil;IB)Lkm;")
    public static class298 method315(class247 arg0, int arg1) {
        if (!method1001(arg0, arg1)) {
            return null;
        }
        class298 var2 = new class298();
        var2.field3854 = Statics.field3869;
        var2.field3848 = Statics.field3868;
        var2.field3852 = Statics.field3871[0];
        var2.field3849 = Statics.field3872[0];
        var2.field3855 = Statics.field636[0];
        var2.field3851 = Statics.field2100[0];
        var2.field3850 = Statics.field3870;
        var2.field3853 = Statics.field2552[0];
        method2696();
        return var2;
    }

    @ObfuscatedName("aj.f(B)[Lkm;")
    public static class298[] method483() {
        class298[] var0 = new class298[Statics.field3873];
        for (int var1 = 0; var1 < Statics.field3873; var1++) {
            class298 var2 = var0[var1] = new class298();
            var2.field3854 = Statics.field3869;
            var2.field3848 = Statics.field3868;
            var2.field3852 = Statics.field3871[var1];
            var2.field3849 = Statics.field3872[var1];
            var2.field3855 = Statics.field636[var1];
            var2.field3851 = Statics.field2100[var1];
            var2.field3850 = Statics.field3870;
            var2.field3853 = Statics.field2552[var1];
        }
        method2696();
        return var0;
    }

    @ObfuscatedName("cn.u(I)Lkm;")
    public static class298 method1706() {
        class298 var0 = new class298();
        var0.field3854 = Statics.field3869;
        var0.field3848 = Statics.field3868;
        var0.field3852 = Statics.field3871[0];
        var0.field3849 = Statics.field3872[0];
        var0.field3855 = Statics.field636[0];
        var0.field3851 = Statics.field2100[0];
        var0.field3850 = Statics.field3870;
        var0.field3853 = Statics.field2552[0];
        method2696();
        return var0;
    }

    @ObfuscatedName("ar.t(I)[Lkg;")
    public static class299[] method661() {
        class299[] var0 = new class299[Statics.field3873];
        for (int var1 = 0; var1 < Statics.field3873; var1++) {
            class299 var2 = var0[var1] = new class299();
            var2.field3856 = Statics.field3869;
            var2.field3862 = Statics.field3868;
            var2.field3863 = Statics.field3871[var1];
            var2.field3860 = Statics.field3872[var1];
            var2.field3861 = Statics.field636[var1];
            var2.field3858 = Statics.field2100[var1];
            int var3 = var2.field3861 * var2.field3858;
            byte[] var4 = Statics.field2552[var1];
            var2.field3857 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                var2.field3857[var5] = Statics.field3870[var4[var5] & 0xFF];
            }
        }
        method2696();
        return var0;
    }

    @ObfuscatedName("af.o(I)Lkg;")
    public static class299 method239() {
        class299 var0 = new class299();
        var0.field3856 = Statics.field3869;
        var0.field3862 = Statics.field3868;
        var0.field3863 = Statics.field3871[0];
        var0.field3860 = Statics.field3872[0];
        var0.field3861 = Statics.field636[0];
        var0.field3858 = Statics.field2100[0];
        int var1 = var0.field3861 * var0.field3858;
        byte[] var2 = Statics.field2552[0];
        var0.field3857 = new int[var1];
        for (int var3 = 0; var3 < var1; var3++) {
            var0.field3857[var3] = Statics.field3870[var2[var3] & 0xFF];
        }
        method2696();
        return var0;
    }

    @ObfuscatedName("kj.a(Lil;IIB)Z")
    public static boolean method4715(class247 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3931(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            Statics.method3906(var3);
            return true;
        }
    }

    @ObfuscatedName("bt.i(Lil;IB)Z")
    public static boolean method1001(class247 arg0, int arg1) {
        byte[] var2 = arg0.method3936(arg1);
        if (var2 == null) {
            return false;
        } else {
            Statics.method3906(var2);
            return true;
        }
    }

    @ObfuscatedName("ep.x(B)V")
    public static void method2696() {
        Statics.field3871 = null;
        Statics.field3872 = null;
        Statics.field636 = null;
        Statics.field2100 = null;
        Statics.field3870 = null;
        Statics.field2552 = (byte[][]) null;
    }
}
