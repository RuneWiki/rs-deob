package deob;

@ObfuscatedName("px")
public class class433 {

    public class433() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("t.c(Lku;IIB)Lpa;")
    public static class431 method19(class302 arg0, int arg1, int arg2) {
        if (!Statics.method2755(arg0, arg1, arg2)) {
            return null;
        }
        class431 var3 = new class431();
        var3.field4563 = Statics.field4581;
        var3.field4564 = Statics.field4578;
        var3.field4558 = Statics.field1607[0];
        var3.field4562 = Statics.field2119[0];
        var3.field4559 = Statics.field4579[0];
        var3.field4560 = Statics.field4008[0];
        var3.field4561 = Statics.field4580;
        var3.field4557 = Statics.field4218[0];
        method2406();
        return var3;
    }

    @ObfuscatedName("j.b(Lku;III)Lpl;")
    public static class432 method55(class302 arg0, int arg1, int arg2) {
        return Statics.method2755(arg0, arg1, arg2) ? method2600() : null;
    }

    @ObfuscatedName("cc.p(Lku;Ljava/lang/String;Ljava/lang/String;B)Lpa;")
    public static class431 method2193(class302 arg0, String arg1, String arg2) {
        int var3 = arg0.method5118(arg1);
        int var4 = arg0.method5070(var3, arg2);
        return method19(arg0, var3, var4);
    }

    @ObfuscatedName("fa.m(Lku;II)Lpa;")
    public static class431 method3087(class302 arg0, int arg1) {
        if (!method3073(arg0, arg1)) {
            return null;
        }
        class431 var2 = new class431();
        var2.field4563 = Statics.field4581;
        var2.field4564 = Statics.field4578;
        var2.field4558 = Statics.field1607[0];
        var2.field4562 = Statics.field2119[0];
        var2.field4559 = Statics.field4579[0];
        var2.field4560 = Statics.field4008[0];
        var2.field4561 = Statics.field4580;
        var2.field4557 = Statics.field4218[0];
        method2406();
        return var2;
    }

    @ObfuscatedName("dl.t(I)Lpl;")
    public static class432 method2600() {
        class432 var0 = new class432();
        var0.field4570 = Statics.field4581;
        var0.field4573 = Statics.field4578;
        var0.field4572 = Statics.field1607[0];
        var0.field4569 = Statics.field2119[0];
        var0.field4566 = Statics.field4579[0];
        var0.field4567 = Statics.field4008[0];
        int var1 = var0.field4567 * var0.field4566;
        byte[] var2 = Statics.field4218[0];
        var0.field4571 = new int[var1];
        for (int var3 = 0; var3 < var1; var3++) {
            var0.field4571[var3] = Statics.field4580[var2[var3] & 0xFF];
        }
        method2406();
        return var0;
    }

    @ObfuscatedName("fy.j(Lku;IB)Z")
    public static boolean method3073(class302 arg0, int arg1) {
        byte[] var2 = arg0.method5059(arg1);
        if (var2 == null) {
            return false;
        } else {
            method4346(var2);
            return true;
        }
    }

    @ObfuscatedName("ha.w([BI)V")
    public static void method4346(byte[] arg0) {
        class419 var1 = new class419(arg0);
        var1.field4475 = arg0.length - 2;
        Statics.field4614 = var1.method6672();
        Statics.field1607 = new int[Statics.field4614];
        Statics.field2119 = new int[Statics.field4614];
        Statics.field4579 = new int[Statics.field4614];
        Statics.field4008 = new int[Statics.field4614];
        Statics.field4218 = new byte[Statics.field4614][];
        var1.field4475 = arg0.length - 7 - Statics.field4614 * 8;
        Statics.field4581 = var1.method6672();
        Statics.field4578 = var1.method6672();
        int var2 = (var1.method6781() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field4614; var3++) {
            Statics.field1607[var3] = var1.method6672();
        }
        for (int var4 = 0; var4 < Statics.field4614; var4++) {
            Statics.field2119[var4] = var1.method6672();
        }
        for (int var5 = 0; var5 < Statics.field4614; var5++) {
            Statics.field4579[var5] = var1.method6672();
        }
        for (int var6 = 0; var6 < Statics.field4614; var6++) {
            Statics.field4008[var6] = var1.method6672();
        }
        var1.field4475 = arg0.length - 7 - Statics.field4614 * 8 - (var2 - 1) * 3;
        Statics.field4580 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field4580[var7] = var1.method6674();
            if (Statics.field4580[var7] == 0) {
                Statics.field4580[var7] = 1;
            }
        }
        var1.field4475 = 0;
        for (int var8 = 0; var8 < Statics.field4614; var8++) {
            int var9 = Statics.field4579[var8];
            int var10 = Statics.field4008[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field4218[var8] = var12;
            int var13 = var1.method6781();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method6846();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method6846();
                    }
                }
            }
        }
    }

    @ObfuscatedName("dr.n(B)V")
    public static void method2406() {
        Statics.field1607 = null;
        Statics.field2119 = null;
        Statics.field4579 = null;
        Statics.field4008 = null;
        Statics.field4580 = null;
        Statics.field4218 = (byte[][]) null;
    }
}
