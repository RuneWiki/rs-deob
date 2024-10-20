package deob;

@ObfuscatedName("gg")
public class class207 extends class151 {

    @ObfuscatedName("gg.q")
    public static class146 field3088 = new class146(64);

    @ObfuscatedName("gg.t")
    public static class146 field3089 = new class146(100);

    @ObfuscatedName("gg.p")
    public int[] field3093;

    @ObfuscatedName("gg.u")
    public int[] field3091;

    @ObfuscatedName("gg.z")
    public int[] field3092;

    @ObfuscatedName("gg.l")
    public int[] field3096;

    @ObfuscatedName("gg.v")
    public int field3094 = -1;

    @ObfuscatedName("gg.g")
    public int[] field3090;

    @ObfuscatedName("gg.w")
    public boolean field3095 = false;

    @ObfuscatedName("gg.r")
    public int field3097 = 5;

    @ObfuscatedName("gg.s")
    public int field3098 = -1;

    @ObfuscatedName("gg.k")
    public int field3085 = -1;

    @ObfuscatedName("gg.e")
    public int field3100 = 99;

    @ObfuscatedName("gg.j")
    public int field3101 = -1;

    @ObfuscatedName("gg.i")
    public int field3102 = -1;

    @ObfuscatedName("gg.a")
    public int field3103 = 2;

    @ObfuscatedName("df.d(Lgd;Lgd;Lgd;I)V")
    public static void method2053(class185 arg0, class185 arg1, class185 arg2) {
        Statics.field3099 = arg0;
        Statics.field3086 = arg1;
        Statics.field3087 = arg2;
    }

    @ObfuscatedName("gx.c(II)Lgg;")
    public static class207 method3621(int arg0) {
        class207 var1 = (class207) field3088.method2598((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3099.method3129(12, arg0);
        class207 var3 = new class207();
        if (var2 != null) {
            var3.method3646(new class130(var2));
        }
        var3.method3654();
        field3088.method2607(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gg.n(Ldu;I)V")
    public void method3646(class130 arg0) {
        while (true) {
            int var2 = arg0.method2379();
            if (var2 == 0) {
                return;
            }
            this.method3647(arg0, var2);
        }
    }

    @ObfuscatedName("gg.q(Ldu;II)V")
    public void method3647(class130 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2232();
            this.field3092 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3092[var4] = arg0.method2232();
            }
            this.field3093 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field3093[var5] = arg0.method2232();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field3093[var6] += arg0.method2232() << 16;
            }
        } else if (arg1 == 2) {
            this.field3094 = arg0.method2232();
        } else if (arg1 == 3) {
            int var7 = arg0.method2379();
            this.field3090 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3090[var8] = arg0.method2379();
            }
            this.field3090[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field3095 = true;
        } else if (arg1 == 5) {
            this.field3097 = arg0.method2379();
        } else if (arg1 == 6) {
            this.field3098 = arg0.method2232();
        } else if (arg1 == 7) {
            this.field3085 = arg0.method2232();
        } else if (arg1 == 8) {
            this.field3100 = arg0.method2379();
        } else if (arg1 == 9) {
            this.field3101 = arg0.method2379();
        } else if (arg1 == 10) {
            this.field3102 = arg0.method2379();
        } else if (arg1 == 11) {
            this.field3103 = arg0.method2379();
        } else if (arg1 == 12) {
            int var9 = arg0.method2379();
            this.field3091 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3091[var10] = arg0.method2232();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field3091[var11] += arg0.method2232() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method2379();
            this.field3096 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field3096[var13] = arg0.method2233();
            }
        }
    }

    @ObfuscatedName("gg.t(I)V")
    public void method3654() {
        if (this.field3101 == -1) {
            if (this.field3090 == null) {
                this.field3101 = 0;
            } else {
                this.field3101 = 2;
            }
        }
        if (this.field3102 != -1) {
            return;
        }
        if (this.field3090 == null) {
            this.field3102 = 0;
        } else {
            this.field3102 = 2;
        }
    }

    @ObfuscatedName("gg.p(Lcf;IB)Lcf;")
    public class83 method3649(class83 arg0, int arg1) {
        int var3 = this.field3093[arg1];
        class93 var4 = method2508(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method1486(true);
        } else {
            class83 var6 = arg0.method1486(!var4.method1818(var5));
            var6.method1492(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("gg.u(Lcf;III)Lcf;")
    public class83 method3666(class83 arg0, int arg1, int arg2) {
        int var4 = this.field3093[arg1];
        class93 var5 = method2508(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method1486(true);
        }
        class83 var7 = arg0.method1486(!var5.method1818(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method1495();
        } else if (var8 == 2) {
            var7.method1508();
        } else if (var8 == 3) {
            var7.method1513();
        }
        var7.method1492(var5, var6);
        if (var8 == 1) {
            var7.method1513();
        } else if (var8 == 2) {
            var7.method1508();
        } else if (var8 == 3) {
            var7.method1495();
        }
        return var7;
    }

    @ObfuscatedName("gg.w(Lcf;II)Lcf;")
    public class83 method3651(class83 arg0, int arg1) {
        int var3 = this.field3093[arg1];
        class93 var4 = method2508(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method1487(true);
        } else {
            class83 var6 = arg0.method1487(!var4.method1818(var5));
            var6.method1492(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("gg.r(Lcf;ILgg;IB)Lcf;")
    public class83 method3662(class83 arg0, int arg1, class207 arg2, int arg3) {
        int var5 = this.field3093[arg1];
        class93 var6 = method2508(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method3649(arg0, arg3);
        }
        int var8 = arg2.field3093[arg3];
        class93 var9 = method2508(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class83 var11 = arg0.method1486(!var6.method1818(var7));
            var11.method1492(var6, var7);
            return var11;
        } else {
            class83 var12 = arg0.method1486(!var6.method1818(var7) & !var9.method1818(var10));
            var12.method1493(var6, var7, var9, var10, this.field3090);
            return var12;
        }
    }

    @ObfuscatedName("gg.s(Lcf;II)Lcf;")
    public class83 method3652(class83 arg0, int arg1) {
        int var3 = this.field3093[arg1];
        class93 var4 = method2508(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method1486(true);
        }
        class93 var6 = null;
        int var7 = 0;
        if (this.field3091 != null && arg1 < this.field3091.length) {
            int var8 = this.field3091[arg1];
            var6 = method2508(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class83 var10 = arg0.method1486(!var4.method1818(var5));
            var10.method1492(var4, var5);
            return var10;
        } else {
            class83 var9 = arg0.method1486(!var4.method1818(var5) & !var6.method1818(var7));
            var9.method1492(var4, var5);
            var9.method1492(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("ex.k(II)Lcn;")
    public static class93 method2508(int arg0) {
        class93 var1 = (class93) field3089.method2598((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class185 var2 = Statics.field3086;
        class185 var3 = Statics.field3087;
        boolean var4 = true;
        int[] var5 = var2.method3096(arg0);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = var2.method3093(arg0, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9 = var3.method3093(var8, 0);
                if (var9 == null) {
                    var4 = false;
                }
            }
        }
        class93 var10;
        if (var4) {
            try {
                var10 = new class93(var2, var3, arg0, false);
            } catch (Exception var13) {
                var10 = null;
            }
        } else {
            var10 = null;
        }
        if (var10 != null) {
            field3089.method2607(var10, (long) arg0);
        }
        return var10;
    }

    @ObfuscatedName("fl.e(I)V")
    public static void method3069() {
        field3088.method2603();
        field3089.method2603();
    }
}
