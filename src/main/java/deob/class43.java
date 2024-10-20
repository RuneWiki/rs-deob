package deob;

@ObfuscatedName("au")
public class class43 extends class204 {

    @ObfuscatedName("au.h")
    public static class193 field981 = new class193(64);

    @ObfuscatedName("au.q")
    public static class193 field976 = new class193(100);

    @ObfuscatedName("au.u")
    public int[] field978;

    @ObfuscatedName("au.m")
    public int[] field982;

    @ObfuscatedName("au.y")
    public int[] field980;

    @ObfuscatedName("au.p")
    public int[] field989;

    @ObfuscatedName("au.t")
    public int field974 = -1;

    @ObfuscatedName("au.g")
    public int[] field983;

    @ObfuscatedName("au.v")
    public boolean field984 = false;

    @ObfuscatedName("au.l")
    public int field985 = 5;

    @ObfuscatedName("au.e")
    public int field986 = -1;

    @ObfuscatedName("au.a")
    public int field979 = -1;

    @ObfuscatedName("au.w")
    public int field988 = 99;

    @ObfuscatedName("au.d")
    public int field987 = -1;

    @ObfuscatedName("au.z")
    public int field990 = -1;

    @ObfuscatedName("au.s")
    public int field991 = 2;

    @ObfuscatedName("fp.o(II)Lau;")
    public static class43 method3081(int arg0) {
        class43 var1 = (class43) field981.method3456((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field977.method3030(12, arg0);
        class43 var3 = new class43();
        if (var2 != null) {
            var3.method807(new class119(var2));
        }
        var3.method806();
        field981.method3451(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("au.f(Ldc;S)V")
    public void method807(class119 arg0) {
        while (true) {
            int var2 = arg0.method2290();
            if (var2 == 0) {
                return;
            }
            this.method808(arg0, var2);
        }
    }

    @ObfuscatedName("au.i(Ldc;II)V")
    public void method808(class119 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2292();
            this.field980 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field980[var4] = arg0.method2292();
            }
            this.field978 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field978[var5] = arg0.method2292();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field978[var6] += arg0.method2292() << 16;
            }
        } else if (arg1 == 2) {
            this.field974 = arg0.method2292();
        } else if (arg1 == 3) {
            int var7 = arg0.method2290();
            this.field983 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field983[var8] = arg0.method2290();
            }
            this.field983[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field984 = true;
        } else if (arg1 == 5) {
            this.field985 = arg0.method2290();
        } else if (arg1 == 6) {
            this.field986 = arg0.method2292();
        } else if (arg1 == 7) {
            this.field979 = arg0.method2292();
        } else if (arg1 == 8) {
            this.field988 = arg0.method2290();
        } else if (arg1 == 9) {
            this.field987 = arg0.method2290();
        } else if (arg1 == 10) {
            this.field990 = arg0.method2290();
        } else if (arg1 == 11) {
            this.field991 = arg0.method2290();
        } else if (arg1 == 12) {
            int var9 = arg0.method2290();
            this.field982 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field982[var10] = arg0.method2292();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field982[var11] += arg0.method2292() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method2290();
            this.field989 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field989[var13] = arg0.method2477();
            }
        }
    }

    @ObfuscatedName("au.h(B)V")
    public void method806() {
        if (this.field987 == -1) {
            if (this.field983 == null) {
                this.field987 = 0;
            } else {
                this.field987 = 2;
            }
        }
        if (this.field990 != -1) {
            return;
        }
        if (this.field983 == null) {
            this.field990 = 0;
        } else {
            this.field990 = 2;
        }
    }

    @ObfuscatedName("au.q(Ldm;IB)Ldm;")
    public class105 method817(class105 arg0, int arg1) {
        int var3 = this.field978[arg1];
        class103 var4 = method721(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2090(true);
        } else {
            class105 var6 = arg0.method2090(!var4.method2080(var5));
            var6.method2096(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("au.u(Ldm;III)Ldm;")
    public class105 method810(class105 arg0, int arg1, int arg2) {
        int var4 = this.field978[arg1];
        class103 var5 = method721(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method2090(true);
        }
        class105 var7 = arg0.method2090(!var5.method2080(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2159();
        } else if (var8 == 2) {
            var7.method2100();
        } else if (var8 == 3) {
            var7.method2099();
        }
        var7.method2096(var5, var6);
        if (var8 == 1) {
            var7.method2099();
        } else if (var8 == 2) {
            var7.method2100();
        } else if (var8 == 3) {
            var7.method2159();
        }
        return var7;
    }

    @ObfuscatedName("au.m(Ldm;IB)Ldm;")
    public class105 method811(class105 arg0, int arg1) {
        int var3 = this.field978[arg1];
        class103 var4 = method721(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2091(true);
        } else {
            class105 var6 = arg0.method2091(!var4.method2080(var5));
            var6.method2096(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("au.y(Ldm;ILau;II)Ldm;")
    public class105 method812(class105 arg0, int arg1, class43 arg2, int arg3) {
        int var5 = this.field978[arg1];
        class103 var6 = method721(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method817(arg0, arg3);
        }
        int var8 = arg2.field978[arg3];
        class103 var9 = method721(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class105 var11 = arg0.method2090(!var6.method2080(var7));
            var11.method2096(var6, var7);
            return var11;
        } else {
            class105 var12 = arg0.method2090(!var6.method2080(var7) & !var9.method2080(var10));
            var12.method2156(var6, var7, var9, var10, this.field983);
            return var12;
        }
    }

    @ObfuscatedName("au.p(Ldm;IB)Ldm;")
    public class105 method813(class105 arg0, int arg1) {
        int var3 = this.field978[arg1];
        class103 var4 = method721(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2090(true);
        }
        class103 var6 = null;
        int var7 = 0;
        if (this.field982 != null && arg1 < this.field982.length) {
            int var8 = this.field982[arg1];
            var6 = method721(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class105 var10 = arg0.method2090(!var4.method2080(var5));
            var10.method2096(var4, var5);
            return var10;
        } else {
            class105 var9 = arg0.method2090(!var4.method2080(var5) & !var6.method2080(var7));
            var9.method2096(var4, var5);
            var9.method2096(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("an.t(II)Lcx;")
    public static class103 method721(int arg0) {
        class103 var1 = (class103) field976.method3456((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class167 var2 = Statics.field975;
        class167 var3 = Statics.field77;
        boolean var4 = true;
        int[] var5 = var2.method2983(arg0);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = var2.method2980(arg0, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9 = var3.method2980(var8, 0);
                if (var9 == null) {
                    var4 = false;
                }
            }
        }
        class103 var10;
        if (var4) {
            try {
                var10 = new class103(var2, var3, arg0, false);
            } catch (Exception var13) {
                var10 = null;
            }
        } else {
            var10 = null;
        }
        if (var10 != null) {
            field976.method3451(var10, (long) arg0);
        }
        return var10;
    }
}
