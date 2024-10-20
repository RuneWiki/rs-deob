package deob;

@ObfuscatedName("gl")
public class class200 extends class130 {

    @ObfuscatedName("gl.o")
    public static class125 field2987 = new class125(64);

    @ObfuscatedName("gl.r")
    public static class125 field3000 = new class125(50);

    @ObfuscatedName("gl.w")
    public int field3011;

    @ObfuscatedName("gl.j")
    public String field2995 = "null";

    @ObfuscatedName("gl.q")
    public int field2988 = 1;

    @ObfuscatedName("gl.d")
    public int[] field3005;

    @ObfuscatedName("gl.n")
    public int[] field2990;

    @ObfuscatedName("gl.c")
    public int field2991 = -1;

    @ObfuscatedName("gl.s")
    public int field2992 = -1;

    @ObfuscatedName("gl.g")
    public int field2993 = -1;

    @ObfuscatedName("gl.i")
    public int field2994 = -1;

    @ObfuscatedName("gl.v")
    public int field3008 = -1;

    @ObfuscatedName("gl.a")
    public int field2996 = -1;

    @ObfuscatedName("gl.h")
    public int field2997 = -1;

    @ObfuscatedName("gl.p")
    public short[] field2998;

    @ObfuscatedName("gl.t")
    public short[] field2999;

    @ObfuscatedName("gl.f")
    public short[] field3018;

    @ObfuscatedName("gl.z")
    public short[] field3001;

    @ObfuscatedName("gl.u")
    public String[] field3002 = new String[5];

    @ObfuscatedName("gl.b")
    public boolean field3003 = true;

    @ObfuscatedName("gl.m")
    public int field3004 = -1;

    @ObfuscatedName("gl.e")
    public int field3007 = 128;

    @ObfuscatedName("gl.l")
    public int field2982 = 128;

    @ObfuscatedName("gl.x")
    public boolean field3010 = false;

    @ObfuscatedName("gl.ap")
    public int field2984 = 0;

    @ObfuscatedName("gl.aq")
    public int field2989 = 0;

    @ObfuscatedName("gl.aw")
    public int field2986 = -1;

    @ObfuscatedName("gl.as")
    public int field2985 = 32;

    @ObfuscatedName("gl.ah")
    public int[] field3012;

    @ObfuscatedName("gl.aa")
    public int field3013 = -1;

    @ObfuscatedName("gl.ai")
    public int field3014 = -1;

    @ObfuscatedName("gl.af")
    public boolean field3015 = true;

    @ObfuscatedName("gl.aj")
    public boolean field3016 = true;

    @ObfuscatedName("gl.am")
    public boolean field3017 = false;

    @ObfuscatedName("dt.k(Lgh;Lgh;B)V")
    public static void method1924(class183 arg0, class183 arg1) {
        Statics.field3009 = arg0;
        Statics.field2983 = arg1;
    }

    @ObfuscatedName("ae.y(IB)Lgl;")
    public static class200 method818(int arg0) {
        class200 var1 = (class200) field2987.method2159((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3009.method3065(9, arg0);
        class200 var3 = new class200();
        var3.field3011 = arg0;
        if (var2 != null) {
            var3.method3485(new class161(var2));
        }
        var3.method3484();
        field2987.method2164(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gl.o(I)V")
    public void method3484() {
    }

    @ObfuscatedName("gl.r(Lfm;B)V")
    public void method3485(class161 arg0) {
        while (true) {
            int var2 = arg0.method2733();
            if (var2 == 0) {
                return;
            }
            this.method3503(arg0, var2);
        }
    }

    @ObfuscatedName("gl.w(Lfm;IB)V")
    public void method3503(class161 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2733();
            this.field3005 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3005[var4] = arg0.method2735();
            }
        } else if (arg1 == 2) {
            this.field2995 = arg0.method2740();
        } else if (arg1 == 12) {
            this.field2988 = arg0.method2733();
        } else if (arg1 == 13) {
            this.field2991 = arg0.method2735();
        } else if (arg1 == 14) {
            this.field2994 = arg0.method2735();
        } else if (arg1 == 15) {
            this.field2992 = arg0.method2735();
        } else if (arg1 == 16) {
            this.field2993 = arg0.method2735();
        } else if (arg1 == 17) {
            this.field2994 = arg0.method2735();
            this.field3008 = arg0.method2735();
            this.field2996 = arg0.method2735();
            this.field2997 = arg0.method2735();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3002[arg1 - 30] = arg0.method2740();
            if (this.field3002[arg1 - 30].equalsIgnoreCase(class174.field2344)) {
                this.field3002[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method2733();
            this.field2998 = new short[var5];
            this.field2999 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field2998[var6] = (short) arg0.method2735();
                this.field2999[var6] = (short) arg0.method2735();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2733();
            this.field3018 = new short[var7];
            this.field3001 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3018[var8] = (short) arg0.method2735();
                this.field3001[var8] = (short) arg0.method2735();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method2733();
            this.field2990 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field2990[var10] = arg0.method2735();
            }
        } else if (arg1 == 93) {
            this.field3003 = false;
        } else if (arg1 == 95) {
            this.field3004 = arg0.method2735();
        } else if (arg1 == 97) {
            this.field3007 = arg0.method2735();
        } else if (arg1 == 98) {
            this.field2982 = arg0.method2735();
        } else if (arg1 == 99) {
            this.field3010 = true;
        } else if (arg1 == 100) {
            this.field2984 = arg0.method2734();
        } else if (arg1 == 101) {
            this.field2989 = arg0.method2734() * 5;
        } else if (arg1 == 102) {
            this.field2986 = arg0.method2735();
        } else if (arg1 == 103) {
            this.field2985 = arg0.method2735();
        } else if (arg1 == 106 || arg1 == 118) {
            this.field3013 = arg0.method2735();
            if (this.field3013 == 65535) {
                this.field3013 = -1;
            }
            this.field3014 = arg0.method2735();
            if (this.field3014 == 65535) {
                this.field3014 = -1;
            }
            int var11 = -1;
            if (arg1 == 118) {
                var11 = arg0.method2735();
                if (var11 == 65535) {
                    var11 = -1;
                }
            }
            int var12 = arg0.method2733();
            this.field3012 = new int[var12 + 2];
            for (int var13 = 0; var13 <= var12; var13++) {
                this.field3012[var13] = arg0.method2735();
                if (this.field3012[var13] == 65535) {
                    this.field3012[var13] = -1;
                }
            }
            this.field3012[var12 + 1] = var11;
        } else if (arg1 == 107) {
            this.field3015 = false;
        } else if (arg1 == 109) {
            this.field3016 = false;
        } else if (arg1 == 111) {
            this.field3017 = true;
        }
    }

    @ObfuscatedName("gl.j(Lgc;ILgc;II)Lcu;")
    public final class83 method3487(class202 arg0, int arg1, class202 arg2, int arg3) {
        if (this.field3012 != null) {
            class200 var5 = this.method3513();
            return var5 == null ? null : var5.method3487(arg0, arg1, arg2, arg3);
        }
        class83 var6 = (class83) field3000.method2159((long) this.field3011);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field3005.length; var8++) {
                if (!Statics.field2983.method3067(this.field3005[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class77[] var9 = new class77[this.field3005.length];
            for (int var10 = 0; var10 < this.field3005.length; var10++) {
                var9[var10] = class77.method1384(Statics.field2983, this.field3005[var10], 0);
            }
            class77 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class77(var9, var9.length);
            }
            if (this.field2998 != null) {
                for (int var12 = 0; var12 < this.field2998.length; var12++) {
                    var11.method1388(this.field2998[var12], this.field2999[var12]);
                }
            }
            if (this.field3018 != null) {
                for (int var13 = 0; var13 < this.field3018.length; var13++) {
                    var11.method1398(this.field3018[var13], this.field3001[var13]);
                }
            }
            var6 = var11.method1405(this.field2984 + 64, this.field2989 + 850, -30, -50, -30);
            field3000.method2164(var6, (long) this.field3011);
        }
        class83 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method3544(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method3541(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method1479(true);
        } else {
            var14 = arg2.method3541(var6, arg3);
        }
        if (this.field3007 != 128 || this.field2982 != 128) {
            var14.method1535(this.field3007, this.field2982, this.field3007);
        }
        return var14;
    }

    @ObfuscatedName("gl.c(I)Lbg;")
    public final class77 method3488() {
        if (this.field3012 != null) {
            class200 var1 = this.method3513();
            return var1 == null ? null : var1.method3488();
        } else if (this.field2990 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field2990.length; var3++) {
                if (!Statics.field2983.method3067(this.field2990[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class77[] var4 = new class77[this.field2990.length];
            for (int var5 = 0; var5 < this.field2990.length; var5++) {
                var4[var5] = class77.method1384(Statics.field2983, this.field2990[var5], 0);
            }
            class77 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class77(var4, var4.length);
            }
            if (this.field2998 != null) {
                for (int var7 = 0; var7 < this.field2998.length; var7++) {
                    var6.method1388(this.field2998[var7], this.field2999[var7]);
                }
            }
            if (this.field3018 != null) {
                for (int var8 = 0; var8 < this.field3018.length; var8++) {
                    var6.method1398(this.field3018[var8], this.field3001[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("gl.g(B)Lgl;")
    public final class200 method3513() {
        int var1 = -1;
        if (this.field3013 != -1) {
            var1 = class147.method128(this.field3013);
        } else if (this.field3014 != -1) {
            var1 = class147.field2012[this.field3014];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3012.length - 1) {
            var2 = this.field3012[var1];
        } else {
            var2 = this.field3012[this.field3012.length - 1];
        }
        return var2 == -1 ? null : method818(var2);
    }

    @ObfuscatedName("gl.i(I)Z")
    public boolean method3486() {
        if (this.field3012 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field3013 != -1) {
            var1 = class147.method128(this.field3013);
        } else if (this.field3014 != -1) {
            var1 = class147.field2012[this.field3014];
        }
        if (var1 >= 0 && var1 < this.field3012.length) {
            return this.field3012[var1] != -1;
        } else {
            return this.field3012[this.field3012.length - 1] != -1;
        }
    }

    @ObfuscatedName("fb.v(I)V")
    public static void method2947() {
        field2987.method2161();
        field3000.method2161();
    }
}
