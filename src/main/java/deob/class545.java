package deob;

@ObfuscatedName("ue")
public class class545 {

    public class545() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dl.ac(Lom;III)[Lud;")
    public static class544[] method2232(class374 arg0, int arg1, int arg2) {
        if (!method3115(arg0, arg1, arg2)) {
            return null;
        }
        class544[] var3 = new class544[Statics.field5248];
        for (int var4 = 0; var4 < Statics.field5248; var4++) {
            class544 var5 = var3[var4] = new class544();
            var5.field5234 = Statics.field1747;
            var5.field5240 = Statics.field5007;
            var5.field5236 = Statics.field3506[var4];
            var5.field5238 = Statics.field2854[var4];
            var5.field5237 = Statics.field443[var4];
            var5.field5239 = Statics.field5247[var4];
            int var6 = var5.field5239 * var5.field5237;
            byte[] var7 = Statics.field4559[var4];
            var5.field5235 = new int[var6];
            for (int var8 = 0; var8 < var6; var8++) {
                var5.field5235[var8] = Statics.field4323[var7[var8] & 0xFF];
            }
        }
        Statics.method6787();
        return var3;
    }

    @ObfuscatedName("bj.al(Lom;III)Lud;")
    public static class544 method842(class374 arg0, int arg1, int arg2) {
        if (!method3115(arg0, arg1, arg2)) {
            return null;
        }
        class544 var3 = new class544();
        var3.field5234 = Statics.field1747;
        var3.field5240 = Statics.field5007;
        var3.field5236 = Statics.field3506[0];
        var3.field5238 = Statics.field2854[0];
        var3.field5237 = Statics.field443[0];
        var3.field5239 = Statics.field5247[0];
        int var4 = var3.field5239 * var3.field5237;
        byte[] var5 = Statics.field4559[0];
        var3.field5235 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var3.field5235[var6] = Statics.field4323[var5[var6] & 0xFF];
        }
        Statics.method6787();
        return var3;
    }

    @ObfuscatedName("hm.ak(Lom;Ljava/lang/String;Ljava/lang/String;S)[Lun;")
    public static class543[] method3313(class374 arg0, String arg1, String arg2) {
        if (!arg0.method6285(arg1, arg2)) {
            return null;
        }
        int var3 = arg0.method6279(arg1);
        int var4 = arg0.method6268(var3, arg2);
        class543[] var5;
        if (method3115(arg0, var3, var4)) {
            var5 = method8190();
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("gp.ax(Lom;Ljava/lang/String;Ljava/lang/String;I)Lun;")
    public static class543 method3136(class374 arg0, String arg1, String arg2) {
        if (!arg0.method6285(arg1, arg2)) {
            return null;
        }
        int var3 = arg0.method6279(arg1);
        int var4 = arg0.method6268(var3, arg2);
        class543 var5;
        if (method3115(arg0, var3, var4)) {
            var5 = method6127();
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("ez.ao(Lom;Ljava/lang/String;Ljava/lang/String;I)[Lud;")
    public static class544[] method2695(class374 arg0, String arg1, String arg2) {
        if (!arg0.method6285(arg1, arg2)) {
            return null;
        }
        int var3 = arg0.method6279(arg1);
        int var4 = arg0.method6268(var3, arg2);
        class544[] var5;
        if (method3115(arg0, var3, var4)) {
            class544[] var6 = new class544[Statics.field5248];
            for (int var7 = 0; var7 < Statics.field5248; var7++) {
                class544 var8 = var6[var7] = new class544();
                var8.field5234 = Statics.field1747;
                var8.field5240 = Statics.field5007;
                var8.field5236 = Statics.field3506[var7];
                var8.field5238 = Statics.field2854[var7];
                var8.field5237 = Statics.field443[var7];
                var8.field5239 = Statics.field5247[var7];
                int var9 = var8.field5239 * var8.field5237;
                byte[] var10 = Statics.field4559[var7];
                var8.field5235 = new int[var9];
                for (int var11 = 0; var11 < var9; var11++) {
                    var8.field5235[var11] = Statics.field4323[var10[var11] & 0xFF];
                }
            }
            Statics.method6787();
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("tx.ah(B)[Lun;")
    public static class543[] method8190() {
        class543[] var0 = new class543[Statics.field5248];
        for (int var1 = 0; var1 < Statics.field5248; var1++) {
            class543 var2 = var0[var1] = new class543();
            var2.field5232 = Statics.field1747;
            var2.field5233 = Statics.field5007;
            var2.field5228 = Statics.field3506[var1];
            var2.field5226 = Statics.field2854[var1];
            var2.field5231 = Statics.field443[var1];
            var2.field5229 = Statics.field5247[var1];
            var2.field5227 = Statics.field4323;
            var2.field5230 = Statics.field4559[var1];
        }
        Statics.method6787();
        return var0;
    }

    @ObfuscatedName("nm.ar(B)Lun;")
    public static class543 method6127() {
        class543 var0 = new class543();
        var0.field5232 = Statics.field1747;
        var0.field5233 = Statics.field5007;
        var0.field5228 = Statics.field3506[0];
        var0.field5226 = Statics.field2854[0];
        var0.field5231 = Statics.field443[0];
        var0.field5229 = Statics.field5247[0];
        var0.field5227 = Statics.field4323;
        var0.field5230 = Statics.field4559[0];
        Statics.method6787();
        return var0;
    }

    @ObfuscatedName("gm.ab(Lom;III)Z")
    public static boolean method3115(class374 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method6342(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method3111(var3);
            return true;
        }
    }

    @ObfuscatedName("pm.am(Lom;IB)Z")
    public static boolean method6749(class374 arg0, int arg1) {
        byte[] var2 = arg0.method6269(arg1);
        if (var2 == null) {
            return false;
        } else {
            method3111(var2);
            return true;
        }
    }

    @ObfuscatedName("gm.av([BI)V")
    public static void method3111(byte[] arg0) {
        class530 var1 = new class530(arg0);
        var1.field5140 = arg0.length - 2;
        Statics.field5248 = var1.method8598();
        Statics.field3506 = new int[Statics.field5248];
        Statics.field2854 = new int[Statics.field5248];
        Statics.field443 = new int[Statics.field5248];
        Statics.field5247 = new int[Statics.field5248];
        Statics.field4559 = new byte[Statics.field5248][];
        var1.field5140 = arg0.length - 7 - Statics.field5248 * 8;
        Statics.field1747 = var1.method8598();
        Statics.field5007 = var1.method8598();
        int var2 = (var1.method8365() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field5248; var3++) {
            Statics.field3506[var3] = var1.method8598();
        }
        for (int var4 = 0; var4 < Statics.field5248; var4++) {
            Statics.field2854[var4] = var1.method8598();
        }
        for (int var5 = 0; var5 < Statics.field5248; var5++) {
            Statics.field443[var5] = var1.method8598();
        }
        for (int var6 = 0; var6 < Statics.field5248; var6++) {
            Statics.field5247[var6] = var1.method8598();
        }
        var1.field5140 = arg0.length - 7 - Statics.field5248 * 8 - (var2 - 1) * 3;
        Statics.field4323 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field4323[var7] = var1.method8445();
            if (Statics.field4323[var7] == 0) {
                Statics.field4323[var7] = 1;
            }
        }
        var1.field5140 = 0;
        for (int var8 = 0; var8 < Statics.field5248; var8++) {
            int var9 = Statics.field443[var8];
            int var10 = Statics.field5247[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field4559[var8] = var12;
            int var13 = var1.method8365();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method8366();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method8366();
                    }
                }
            }
        }
    }
}
