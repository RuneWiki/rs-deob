package deob;

@ObfuscatedName("gc")
public class class202 extends class130 {

    @ObfuscatedName("gc.r")
    public static class125 field3050 = new class125(64);

    @ObfuscatedName("gc.w")
    public static class125 field3037 = new class125(100);

    @ObfuscatedName("gc.j")
    public int[] field3038;

    @ObfuscatedName("gc.q")
    public int[] field3036;

    @ObfuscatedName("gc.d")
    public int[] field3040;

    @ObfuscatedName("gc.n")
    public int[] field3039;

    @ObfuscatedName("gc.c")
    public int field3042 = -1;

    @ObfuscatedName("gc.s")
    public int[] field3043;

    @ObfuscatedName("gc.g")
    public boolean field3044 = false;

    @ObfuscatedName("gc.i")
    public int field3041 = 5;

    @ObfuscatedName("gc.v")
    public int field3052 = -1;

    @ObfuscatedName("gc.a")
    public int field3047 = -1;

    @ObfuscatedName("gc.h")
    public int field3048 = 99;

    @ObfuscatedName("gc.p")
    public int field3034 = -1;

    @ObfuscatedName("gc.t")
    public int field3033 = -1;

    @ObfuscatedName("gc.f")
    public int field3051 = 2;

    @ObfuscatedName("by.k(II)Lgc;")
    public static class202 method1368(int arg0) {
        class202 var1 = (class202) field3050.method2159((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3046.method3065(12, arg0);
        class202 var3 = new class202();
        if (var2 != null) {
            var3.method3564(new class161(var2));
        }
        var3.method3540();
        field3050.method2164(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gc.y(Lfm;B)V")
    public void method3564(class161 arg0) {
        while (true) {
            int var2 = arg0.method2733();
            if (var2 == 0) {
                return;
            }
            this.method3539(arg0, var2);
        }
    }

    @ObfuscatedName("gc.o(Lfm;IB)V")
    public void method3539(class161 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2735();
            this.field3040 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3040[var4] = arg0.method2735();
            }
            this.field3038 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field3038[var5] = arg0.method2735();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field3038[var6] += arg0.method2735() << 16;
            }
        } else if (arg1 == 2) {
            this.field3042 = arg0.method2735();
        } else if (arg1 == 3) {
            int var7 = arg0.method2733();
            this.field3043 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3043[var8] = arg0.method2733();
            }
            this.field3043[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field3044 = true;
        } else if (arg1 == 5) {
            this.field3041 = arg0.method2733();
        } else if (arg1 == 6) {
            this.field3052 = arg0.method2735();
        } else if (arg1 == 7) {
            this.field3047 = arg0.method2735();
        } else if (arg1 == 8) {
            this.field3048 = arg0.method2733();
        } else if (arg1 == 9) {
            this.field3034 = arg0.method2733();
        } else if (arg1 == 10) {
            this.field3033 = arg0.method2733();
        } else if (arg1 == 11) {
            this.field3051 = arg0.method2733();
        } else if (arg1 == 12) {
            int var9 = arg0.method2733();
            this.field3036 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3036[var10] = arg0.method2735();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field3036[var11] += arg0.method2735() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method2733();
            this.field3039 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field3039[var13] = arg0.method2876();
            }
        }
    }

    @ObfuscatedName("gc.r(I)V")
    public void method3540() {
        if (this.field3034 == -1) {
            if (this.field3043 == null) {
                this.field3034 = 0;
            } else {
                this.field3034 = 2;
            }
        }
        if (this.field3033 != -1) {
            return;
        }
        if (this.field3043 == null) {
            this.field3033 = 0;
        } else {
            this.field3033 = 2;
        }
    }

    @ObfuscatedName("gc.w(Lcu;II)Lcu;")
    public class83 method3541(class83 arg0, int arg1) {
        int var3 = this.field3038[arg1];
        class93 var4 = method2637(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method1479(true);
        } else {
            class83 var6 = arg0.method1479(!var4.method1793(var5));
            var6.method1485(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("gc.j(Lcu;IIB)Lcu;")
    public class83 method3556(class83 arg0, int arg1, int arg2) {
        int var4 = this.field3038[arg1];
        class93 var5 = method2637(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method1479(true);
        }
        class83 var7 = arg0.method1479(!var5.method1793(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method1516();
        } else if (var8 == 2) {
            var7.method1489();
        } else if (var8 == 3) {
            var7.method1488();
        }
        var7.method1485(var5, var6);
        if (var8 == 1) {
            var7.method1488();
        } else if (var8 == 2) {
            var7.method1489();
        } else if (var8 == 3) {
            var7.method1516();
        }
        return var7;
    }

    @ObfuscatedName("gc.c(Lcu;II)Lcu;")
    public class83 method3553(class83 arg0, int arg1) {
        int var3 = this.field3038[arg1];
        class93 var4 = method2637(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method1521(true);
        } else {
            class83 var6 = arg0.method1521(!var4.method1793(var5));
            var6.method1485(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("gc.g(Lcu;ILgc;II)Lcu;")
    public class83 method3544(class83 arg0, int arg1, class202 arg2, int arg3) {
        int var5 = this.field3038[arg1];
        class93 var6 = method2637(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method3541(arg0, arg3);
        }
        int var8 = arg2.field3038[arg3];
        class93 var9 = method2637(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class83 var11 = arg0.method1479(!var6.method1793(var7));
            var11.method1485(var6, var7);
            return var11;
        } else {
            class83 var12 = arg0.method1479(!var6.method1793(var7) & !var9.method1793(var10));
            var12.method1486(var6, var7, var9, var10, this.field3043);
            return var12;
        }
    }

    @ObfuscatedName("gc.i(Lcu;II)Lcu;")
    public class83 method3551(class83 arg0, int arg1) {
        int var3 = this.field3038[arg1];
        class93 var4 = method2637(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method1479(true);
        }
        class93 var6 = null;
        int var7 = 0;
        if (this.field3036 != null && arg1 < this.field3036.length) {
            int var8 = this.field3036[arg1];
            var6 = method2637(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class83 var10 = arg0.method1479(!var4.method1793(var5));
            var10.method1485(var4, var5);
            return var10;
        } else {
            class83 var9 = arg0.method1479(!var4.method1793(var5) & !var6.method1793(var7));
            var9.method1485(var4, var5);
            var9.method1485(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("ee.v(II)Lcp;")
    public static class93 method2637(int arg0) {
        class93 var1 = (class93) field3037.method2159((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class183 var2 = Statics.field3049;
        class183 var3 = Statics.field3035;
        boolean var4 = true;
        int[] var5 = var2.method3074(arg0);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = var2.method3071(arg0, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9 = var3.method3071(var8, 0);
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
            field3037.method2164(var10, (long) arg0);
        }
        return var10;
    }
}
