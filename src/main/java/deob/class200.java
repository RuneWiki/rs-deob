package deob;

@ObfuscatedName("gg")
public class class200 extends class130 {

    @ObfuscatedName("gg.m")
    public static class125 field2995 = new class125(64);

    @ObfuscatedName("gg.h")
    public static class125 field2996 = new class125(50);

    @ObfuscatedName("gg.w")
    public int field2997;

    @ObfuscatedName("gg.r")
    public String field2998 = "null";

    @ObfuscatedName("gg.c")
    public int field3010 = 1;

    @ObfuscatedName("gg.p")
    public int[] field3026;

    @ObfuscatedName("gg.g")
    public int[] field3009;

    @ObfuscatedName("gg.z")
    public int field3002 = -1;

    @ObfuscatedName("gg.q")
    public int field3007 = -1;

    @ObfuscatedName("gg.l")
    public int field3004 = -1;

    @ObfuscatedName("gg.y")
    public int field2999 = -1;

    @ObfuscatedName("gg.e")
    public int field3006 = -1;

    @ObfuscatedName("gg.x")
    public int field3012 = -1;

    @ObfuscatedName("gg.f")
    public int field3008 = -1;

    @ObfuscatedName("gg.s")
    public short[] field3015;

    @ObfuscatedName("gg.o")
    public short[] field3013;

    @ObfuscatedName("gg.i")
    public short[] field3011;

    @ObfuscatedName("gg.a")
    public short[] field3027;

    @ObfuscatedName("gg.b")
    public String[] field3005 = new String[5];

    @ObfuscatedName("gg.j")
    public boolean field3014 = true;

    @ObfuscatedName("gg.k")
    public int field3001 = -1;

    @ObfuscatedName("gg.v")
    public int field3016 = 128;

    @ObfuscatedName("gg.u")
    public int field3017 = 128;

    @ObfuscatedName("gg.t")
    public boolean field3018 = false;

    @ObfuscatedName("gg.av")
    public int field3019 = 0;

    @ObfuscatedName("gg.aw")
    public int field3020 = 0;

    @ObfuscatedName("gg.ay")
    public int field3021 = -1;

    @ObfuscatedName("gg.as")
    public int field3022 = 32;

    @ObfuscatedName("gg.ai")
    public int[] field3023;

    @ObfuscatedName("gg.aq")
    public int field3024 = -1;

    @ObfuscatedName("gg.ac")
    public int field2993 = -1;

    @ObfuscatedName("gg.ae")
    public boolean field3025 = true;

    @ObfuscatedName("gg.ag")
    public boolean field3003 = true;

    @ObfuscatedName("gg.am")
    public boolean field3028 = false;

    @ObfuscatedName("fv.n(Lgj;Lgj;B)V")
    public static void method3087(class183 arg0, class183 arg1) {
        Statics.field3000 = arg0;
        Statics.field2994 = arg1;
    }

    @ObfuscatedName("eq.d(II)Lgg;")
    public static class200 method2713(int arg0) {
        class200 var1 = (class200) field2995.method2221((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3000.method3093(9, arg0);
        class200 var3 = new class200();
        var3.field2997 = arg0;
        if (var2 != null) {
            var3.method3501(new class161(var2));
        }
        var3.method3507();
        field2995.method2219(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gg.m(I)V")
    public void method3507() {
    }

    @ObfuscatedName("gg.h(Lfa;I)V")
    public void method3501(class161 arg0) {
        while (true) {
            int var2 = arg0.method2823();
            if (var2 == 0) {
                return;
            }
            this.method3502(arg0, var2);
        }
    }

    @ObfuscatedName("gg.w(Lfa;II)V")
    public void method3502(class161 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2823();
            this.field3026 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3026[var4] = arg0.method2887();
            }
        } else if (arg1 == 2) {
            this.field2998 = arg0.method2847();
        } else if (arg1 == 12) {
            this.field3010 = arg0.method2823();
        } else if (arg1 == 13) {
            this.field3002 = arg0.method2887();
        } else if (arg1 == 14) {
            this.field2999 = arg0.method2887();
        } else if (arg1 == 15) {
            this.field3007 = arg0.method2887();
        } else if (arg1 == 16) {
            this.field3004 = arg0.method2887();
        } else if (arg1 == 17) {
            this.field2999 = arg0.method2887();
            this.field3006 = arg0.method2887();
            this.field3012 = arg0.method2887();
            this.field3008 = arg0.method2887();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3005[arg1 - 30] = arg0.method2847();
            if (this.field3005[arg1 - 30].equalsIgnoreCase(class174.field2429)) {
                this.field3005[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method2823();
            this.field3015 = new short[var5];
            this.field3013 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3015[var6] = (short) arg0.method2887();
                this.field3013[var6] = (short) arg0.method2887();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2823();
            this.field3011 = new short[var7];
            this.field3027 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3011[var8] = (short) arg0.method2887();
                this.field3027[var8] = (short) arg0.method2887();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method2823();
            this.field3009 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3009[var10] = arg0.method2887();
            }
        } else if (arg1 == 93) {
            this.field3014 = false;
        } else if (arg1 == 95) {
            this.field3001 = arg0.method2887();
        } else if (arg1 == 97) {
            this.field3016 = arg0.method2887();
        } else if (arg1 == 98) {
            this.field3017 = arg0.method2887();
        } else if (arg1 == 99) {
            this.field3018 = true;
        } else if (arg1 == 100) {
            this.field3019 = arg0.method2837();
        } else if (arg1 == 101) {
            this.field3020 = arg0.method2837();
        } else if (arg1 == 102) {
            this.field3021 = arg0.method2887();
        } else if (arg1 == 103) {
            this.field3022 = arg0.method2887();
        } else if (arg1 == 106 || arg1 == 118) {
            this.field3024 = arg0.method2887();
            if (this.field3024 == 65535) {
                this.field3024 = -1;
            }
            this.field2993 = arg0.method2887();
            if (this.field2993 == 65535) {
                this.field2993 = -1;
            }
            int var11 = -1;
            if (arg1 == 118) {
                var11 = arg0.method2887();
                if (var11 == 65535) {
                    var11 = -1;
                }
            }
            int var12 = arg0.method2823();
            this.field3023 = new int[var12 + 2];
            for (int var13 = 0; var13 <= var12; var13++) {
                this.field3023[var13] = arg0.method2887();
                if (this.field3023[var13] == 65535) {
                    this.field3023[var13] = -1;
                }
            }
            this.field3023[var12 + 1] = var11;
        } else if (arg1 == 107) {
            this.field3025 = false;
        } else if (arg1 == 109) {
            this.field3003 = false;
        } else if (arg1 == 111) {
            this.field3028 = true;
        }
    }

    @ObfuscatedName("gg.r(Lgm;ILgm;IB)Lca;")
    public final class83 method3512(class202 arg0, int arg1, class202 arg2, int arg3) {
        if (this.field3023 != null) {
            class200 var5 = this.method3526();
            return var5 == null ? null : var5.method3512(arg0, arg1, arg2, arg3);
        }
        class83 var6 = (class83) field2996.method2221((long) this.field2997);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field3026.length; var8++) {
                if (!Statics.field2994.method3111(this.field3026[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class77[] var9 = new class77[this.field3026.length];
            for (int var10 = 0; var10 < this.field3026.length; var10++) {
                var9[var10] = class77.method1401(Statics.field2994, this.field3026[var10], 0);
            }
            class77 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class77(var9, var9.length);
            }
            if (this.field3015 != null) {
                for (int var12 = 0; var12 < this.field3015.length; var12++) {
                    var11.method1400(this.field3015[var12], this.field3013[var12]);
                }
            }
            if (this.field3011 != null) {
                for (int var13 = 0; var13 < this.field3011.length; var13++) {
                    var11.method1416(this.field3011[var13], this.field3027[var13]);
                }
            }
            var6 = var11.method1422(this.field3019 + 64, this.field3020 * 5 + 850, -30, -50, -30);
            field2996.method2219(var6, (long) this.field2997);
        }
        class83 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method3563(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method3557(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method1492(true);
        } else {
            var14 = arg2.method3557(var6, arg3);
        }
        if (this.field3016 != 128 || this.field3017 != 128) {
            var14.method1505(this.field3016, this.field3017, this.field3016);
        }
        return var14;
    }

    @ObfuscatedName("gg.c(I)Lbz;")
    public final class77 method3504() {
        if (this.field3023 != null) {
            class200 var1 = this.method3526();
            return var1 == null ? null : var1.method3504();
        } else if (this.field3009 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field3009.length; var3++) {
                if (!Statics.field2994.method3111(this.field3009[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class77[] var4 = new class77[this.field3009.length];
            for (int var5 = 0; var5 < this.field3009.length; var5++) {
                var4[var5] = class77.method1401(Statics.field2994, this.field3009[var5], 0);
            }
            class77 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class77(var4, var4.length);
            }
            if (this.field3015 != null) {
                for (int var7 = 0; var7 < this.field3015.length; var7++) {
                    var6.method1400(this.field3015[var7], this.field3013[var7]);
                }
            }
            if (this.field3011 != null) {
                for (int var8 = 0; var8 < this.field3011.length; var8++) {
                    var6.method1416(this.field3011[var8], this.field3027[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("gg.z(I)Lgg;")
    public final class200 method3526() {
        int var1 = -1;
        if (this.field3024 != -1) {
            var1 = class147.method748(this.field3024);
        } else if (this.field2993 != -1) {
            var1 = class147.field2032[this.field2993];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3023.length - 1) {
            var2 = this.field3023[var1];
        } else {
            var2 = this.field3023[this.field3023.length - 1];
        }
        return var2 == -1 ? null : method2713(var2);
    }

    @ObfuscatedName("gg.q(B)Z")
    public boolean method3506() {
        if (this.field3023 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field3024 != -1) {
            var1 = class147.method748(this.field3024);
        } else if (this.field2993 != -1) {
            var1 = class147.field2032[this.field2993];
        }
        if (var1 >= 0 && var1 < this.field3023.length) {
            return this.field3023[var1] != -1;
        } else {
            return this.field3023[this.field3023.length - 1] != -1;
        }
    }

    @ObfuscatedName("ad.l(B)V")
    public static void method769() {
        field2995.method2220();
        field2996.method2220();
    }
}
