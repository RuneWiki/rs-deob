package deob;

@ObfuscatedName("pa")
public class class435 {

    public class435() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("mk.c(Lkq;IIS)[Lpt;")
    public static class434[] method5808(class307 arg0, int arg1, int arg2) {
        return method2591(arg0, arg1, arg2) ? method100() : null;
    }

    @ObfuscatedName("dx.l(Lkq;III)Lpt;")
    public static class434 method2593(class307 arg0, int arg1, int arg2) {
        return method2591(arg0, arg1, arg2) ? method4791() : null;
    }

    @ObfuscatedName("bc.s(Lkq;Lkq;IIB)Llv;")
    public static class332 method1898(class307 arg0, class307 arg1, int arg2, int arg3) {
        return method2591(arg0, arg2, arg3) ? method2815(arg1.method5066(arg2, arg3)) : null;
    }

    @ObfuscatedName("je.e(Lkq;Ljava/lang/String;Ljava/lang/String;I)[Lpg;")
    public static class433[] method4753(class307 arg0, String arg1, String arg2) {
        int var3 = arg0.method5046(arg1);
        int var4 = arg0.method5047(var3, arg2);
        class433[] var5;
        if (method2591(arg0, var3, var4)) {
            class433[] var6 = new class433[Statics.field4618];
            for (int var7 = 0; var7 < Statics.field4618; var7++) {
                class433 var8 = var6[var7] = new class433();
                var8.field4599 = Statics.field4613;
                var8.field4593 = Statics.field4615;
                var8.field4597 = Statics.field4616[var7];
                var8.field4598 = Statics.field4614[var7];
                var8.field4595 = Statics.field4617[var7];
                var8.field4600 = Statics.field4415[var7];
                var8.field4594 = Statics.field1189;
                var8.field4596 = Statics.field2610[var7];
            }
            method361();
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("cn.r(Lkq;Ljava/lang/String;Ljava/lang/String;I)Lpg;")
    public static class433 method2155(class307 arg0, String arg1, String arg2) {
        int var3 = arg0.method5046(arg1);
        int var4 = arg0.method5047(var3, arg2);
        class433 var5;
        if (method2591(arg0, var3, var4)) {
            var5 = method5222();
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("bk.o(Lkq;Ljava/lang/String;Ljava/lang/String;I)[Lpt;")
    public static class434[] method1960(class307 arg0, String arg1, String arg2) {
        int var3 = arg0.method5046(arg1);
        int var4 = arg0.method5047(var3, arg2);
        return method5808(arg0, var3, var4);
    }

    @ObfuscatedName("lk.i(I)Lpg;")
    public static class433 method5222() {
        class433 var0 = new class433();
        var0.field4599 = Statics.field4613;
        var0.field4593 = Statics.field4615;
        var0.field4597 = Statics.field4616[0];
        var0.field4598 = Statics.field4614[0];
        var0.field4595 = Statics.field4617[0];
        var0.field4600 = Statics.field4415[0];
        var0.field4594 = Statics.field1189;
        var0.field4596 = Statics.field2610[0];
        method361();
        return var0;
    }

    @ObfuscatedName("y.w(I)[Lpt;")
    public static class434[] method100() {
        class434[] var0 = new class434[Statics.field4618];
        for (int var1 = 0; var1 < Statics.field4618; var1++) {
            class434 var2 = var0[var1] = new class434();
            var2.field4601 = Statics.field4613;
            var2.field4607 = Statics.field4615;
            var2.field4604 = Statics.field4616[var1];
            var2.field4605 = Statics.field4614[var1];
            var2.field4602 = Statics.field4617[var1];
            var2.field4603 = Statics.field4415[var1];
            int var3 = var2.field4603 * var2.field4602;
            byte[] var4 = Statics.field2610[var1];
            var2.field4606 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                var2.field4606[var5] = Statics.field1189[var4[var5] & 0xFF];
            }
        }
        method361();
        return var0;
    }

    @ObfuscatedName("jq.v(B)Lpt;")
    public static class434 method4791() {
        class434 var0 = new class434();
        var0.field4601 = Statics.field4613;
        var0.field4607 = Statics.field4615;
        var0.field4604 = Statics.field4616[0];
        var0.field4605 = Statics.field4614[0];
        var0.field4602 = Statics.field4617[0];
        var0.field4603 = Statics.field4415[0];
        int var1 = var0.field4603 * var0.field4602;
        byte[] var2 = Statics.field2610[0];
        var0.field4606 = new int[var1];
        for (int var3 = 0; var3 < var1; var3++) {
            var0.field4606[var3] = Statics.field1189[var2[var3] & 0xFF];
        }
        method361();
        return var0;
    }

    @ObfuscatedName("fk.a([BI)Llv;")
    public static class332 method2815(byte[] arg0) {
        if (arg0 == null) {
            return null;
        } else {
            class332 var1 = new class332(arg0, Statics.field4616, Statics.field4614, Statics.field4617, Statics.field4415, Statics.field1189, Statics.field2610);
            method361();
            return var1;
        }
    }

    @ObfuscatedName("dn.y(Lkq;III)Z")
    public static boolean method2591(class307 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method5066(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method6097(var3);
            return true;
        }
    }

    @ObfuscatedName("ng.u([BB)V")
    public static void method6097(byte[] arg0) {
        class421 var1 = new class421(arg0);
        var1.field4512 = arg0.length - 2;
        Statics.field4618 = var1.method6666();
        Statics.field4616 = new int[Statics.field4618];
        Statics.field4614 = new int[Statics.field4618];
        Statics.field4617 = new int[Statics.field4618];
        Statics.field4415 = new int[Statics.field4618];
        Statics.field2610 = new byte[Statics.field4618][];
        var1.field4512 = arg0.length - 7 - Statics.field4618 * 8;
        Statics.field4613 = var1.method6666();
        Statics.field4615 = var1.method6666();
        int var2 = (var1.method6686() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field4618; var3++) {
            Statics.field4616[var3] = var1.method6666();
        }
        for (int var4 = 0; var4 < Statics.field4618; var4++) {
            Statics.field4614[var4] = var1.method6666();
        }
        for (int var5 = 0; var5 < Statics.field4618; var5++) {
            Statics.field4617[var5] = var1.method6666();
        }
        for (int var6 = 0; var6 < Statics.field4618; var6++) {
            Statics.field4415[var6] = var1.method6666();
        }
        var1.field4512 = arg0.length - 7 - Statics.field4618 * 8 - (var2 - 1) * 3;
        Statics.field1189 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field1189[var7] = var1.method6668();
            if (Statics.field1189[var7] == 0) {
                Statics.field1189[var7] = 1;
            }
        }
        var1.field4512 = 0;
        for (int var8 = 0; var8 < Statics.field4618; var8++) {
            int var9 = Statics.field4617[var8];
            int var10 = Statics.field4415[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field2610[var8] = var12;
            int var13 = var1.method6686();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method6664();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method6664();
                    }
                }
            }
        }
    }

    @ObfuscatedName("z.h(I)V")
    public static void method361() {
        Statics.field4616 = null;
        Statics.field4614 = null;
        Statics.field4617 = null;
        Statics.field4415 = null;
        Statics.field1189 = null;
        Statics.field2610 = (byte[][]) null;
    }
}
