package deob;

@ObfuscatedName("gs")
public class class200 extends class130 {

    @ObfuscatedName("gs.x")
    public static class125 field2996 = new class125(64);

    @ObfuscatedName("gs.q")
    public static class125 field2997 = new class125(50);

    @ObfuscatedName("gs.d")
    public int field3010;

    @ObfuscatedName("gs.k")
    public String field2999 = "null";

    @ObfuscatedName("gs.j")
    public int field3000 = 1;

    @ObfuscatedName("gs.s")
    public int[] field3001;

    @ObfuscatedName("gs.o")
    public int[] field3002;

    @ObfuscatedName("gs.a")
    public int field3023 = -1;

    @ObfuscatedName("gs.c")
    public int field3004 = -1;

    @ObfuscatedName("gs.m")
    public int field3019 = -1;

    @ObfuscatedName("gs.h")
    public int field3006 = -1;

    @ObfuscatedName("gs.r")
    public int field3007 = -1;

    @ObfuscatedName("gs.u")
    public int field3008 = -1;

    @ObfuscatedName("gs.i")
    public int field3009 = -1;

    @ObfuscatedName("gs.z")
    public short[] field3003;

    @ObfuscatedName("gs.n")
    public short[] field3011;

    @ObfuscatedName("gs.w")
    public short[] field3022;

    @ObfuscatedName("gs.y")
    public short[] field3028;

    @ObfuscatedName("gs.v")
    public String[] field3014 = new String[5];

    @ObfuscatedName("gs.f")
    public boolean field3012 = true;

    @ObfuscatedName("gs.l")
    public int field3016 = -1;

    @ObfuscatedName("gs.t")
    public int field3017 = 128;

    @ObfuscatedName("gs.b")
    public int field3015 = 128;

    @ObfuscatedName("gs.e")
    public boolean field3005 = false;

    @ObfuscatedName("gs.ai")
    public int field3020 = 0;

    @ObfuscatedName("gs.am")
    public int field3021 = 0;

    @ObfuscatedName("gs.ad")
    public int field3013 = -1;

    @ObfuscatedName("gs.ah")
    public int field2994 = 32;

    @ObfuscatedName("gs.aj")
    public int[] field3024;

    @ObfuscatedName("gs.ax")
    public int field3025 = -1;

    @ObfuscatedName("gs.ak")
    public int field3026 = -1;

    @ObfuscatedName("gs.ar")
    public boolean field3027 = true;

    @ObfuscatedName("gs.aw")
    public boolean field2998 = true;

    @ObfuscatedName("gs.ay")
    public boolean field3029 = false;

    @ObfuscatedName("aw.p(Lgp;Lgp;I)V")
    public static void method689(class183 arg0, class183 arg1) {
        Statics.field3018 = arg0;
        Statics.field2995 = arg1;
    }

    @ObfuscatedName("cq.g(II)Lgs;")
    public static class200 method1450(int arg0) {
        class200 var1 = (class200) field2996.method2169((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3018.method3044(9, arg0);
        class200 var3 = new class200();
        var3.field3010 = arg0;
        if (var2 != null) {
            var3.method3457(new class154(var2));
        }
        var3.method3456();
        field2996.method2174(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gs.x(I)V")
    public void method3456() {
    }

    @ObfuscatedName("gs.q(Lev;B)V")
    public void method3457(class154 arg0) {
        while (true) {
            int var2 = arg0.method2593();
            if (var2 == 0) {
                return;
            }
            this.method3458(arg0, var2);
        }
    }

    @ObfuscatedName("gs.d(Lev;II)V")
    public void method3458(class154 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2593();
            this.field3001 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3001[var4] = arg0.method2595();
            }
        } else if (arg1 == 2) {
            this.field2999 = arg0.method2625();
        } else if (arg1 == 12) {
            this.field3000 = arg0.method2593();
        } else if (arg1 == 13) {
            this.field3023 = arg0.method2595();
        } else if (arg1 == 14) {
            this.field3006 = arg0.method2595();
        } else if (arg1 == 15) {
            this.field3004 = arg0.method2595();
        } else if (arg1 == 16) {
            this.field3019 = arg0.method2595();
        } else if (arg1 == 17) {
            this.field3006 = arg0.method2595();
            this.field3007 = arg0.method2595();
            this.field3008 = arg0.method2595();
            this.field3009 = arg0.method2595();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3014[arg1 - 30] = arg0.method2625();
            if (this.field3014[arg1 - 30].equalsIgnoreCase(class174.field2443)) {
                this.field3014[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method2593();
            this.field3003 = new short[var5];
            this.field3011 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3003[var6] = (short) arg0.method2595();
                this.field3011[var6] = (short) arg0.method2595();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2593();
            this.field3022 = new short[var7];
            this.field3028 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3022[var8] = (short) arg0.method2595();
                this.field3028[var8] = (short) arg0.method2595();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method2593();
            this.field3002 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3002[var10] = arg0.method2595();
            }
        } else if (arg1 == 93) {
            this.field3012 = false;
        } else if (arg1 == 95) {
            this.field3016 = arg0.method2595();
        } else if (arg1 == 97) {
            this.field3017 = arg0.method2595();
        } else if (arg1 == 98) {
            this.field3015 = arg0.method2595();
        } else if (arg1 == 99) {
            this.field3005 = true;
        } else if (arg1 == 100) {
            this.field3020 = arg0.method2631();
        } else if (arg1 == 101) {
            this.field3021 = arg0.method2631();
        } else if (arg1 == 102) {
            this.field3013 = arg0.method2595();
        } else if (arg1 == 103) {
            this.field2994 = arg0.method2595();
        } else if (arg1 == 106 || arg1 == 118) {
            this.field3025 = arg0.method2595();
            if (this.field3025 == 65535) {
                this.field3025 = -1;
            }
            this.field3026 = arg0.method2595();
            if (this.field3026 == 65535) {
                this.field3026 = -1;
            }
            int var11 = -1;
            if (arg1 == 118) {
                var11 = arg0.method2595();
                if (var11 == 65535) {
                    var11 = -1;
                }
            }
            int var12 = arg0.method2593();
            this.field3024 = new int[var12 + 2];
            for (int var13 = 0; var13 <= var12; var13++) {
                this.field3024[var13] = arg0.method2595();
                if (this.field3024[var13] == 65535) {
                    this.field3024[var13] = -1;
                }
            }
            this.field3024[var12 + 1] = var11;
        } else if (arg1 == 107) {
            this.field3027 = false;
        } else if (arg1 == 109) {
            this.field2998 = false;
        } else if (arg1 == 111) {
            this.field3029 = true;
        }
    }

    @ObfuscatedName("gs.k(Lgu;ILgu;IB)Lcw;")
    public final class83 method3460(class202 arg0, int arg1, class202 arg2, int arg3) {
        if (this.field3024 != null) {
            class200 var5 = this.method3461();
            return var5 == null ? null : var5.method3460(arg0, arg1, arg2, arg3);
        }
        class83 var6 = (class83) field2997.method2169((long) this.field3010);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field3001.length; var8++) {
                if (!Statics.field2995.method3085(this.field3001[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class77[] var9 = new class77[this.field3001.length];
            for (int var10 = 0; var10 < this.field3001.length; var10++) {
                var9[var10] = class77.method1361(Statics.field2995, this.field3001[var10], 0);
            }
            class77 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class77(var9, var9.length);
            }
            if (this.field3003 != null) {
                for (int var12 = 0; var12 < this.field3003.length; var12++) {
                    var11.method1373(this.field3003[var12], this.field3011[var12]);
                }
            }
            if (this.field3022 != null) {
                for (int var13 = 0; var13 < this.field3022.length; var13++) {
                    var11.method1374(this.field3022[var13], this.field3028[var13]);
                }
            }
            var6 = var11.method1381(this.field3020 + 64, this.field3021 * 5 + 850, -30, -50, -30);
            field2997.method2174(var6, (long) this.field3010);
        }
        class83 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method3506(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method3528(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method1457(true);
        } else {
            var14 = arg2.method3528(var6, arg3);
        }
        if (this.field3017 != 128 || this.field3015 != 128) {
            var14.method1503(this.field3017, this.field3015, this.field3017);
        }
        return var14;
    }

    @ObfuscatedName("gs.j(I)Lbz;")
    public final class77 method3455() {
        if (this.field3024 != null) {
            class200 var1 = this.method3461();
            return var1 == null ? null : var1.method3455();
        } else if (this.field3002 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field3002.length; var3++) {
                if (!Statics.field2995.method3085(this.field3002[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class77[] var4 = new class77[this.field3002.length];
            for (int var5 = 0; var5 < this.field3002.length; var5++) {
                var4[var5] = class77.method1361(Statics.field2995, this.field3002[var5], 0);
            }
            class77 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class77(var4, var4.length);
            }
            if (this.field3003 != null) {
                for (int var7 = 0; var7 < this.field3003.length; var7++) {
                    var6.method1373(this.field3003[var7], this.field3011[var7]);
                }
            }
            if (this.field3022 != null) {
                for (int var8 = 0; var8 < this.field3022.length; var8++) {
                    var6.method1374(this.field3022[var8], this.field3028[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("gs.s(B)Lgs;")
    public final class200 method3461() {
        int var1 = -1;
        if (this.field3025 != -1) {
            var1 = Statics.method115(this.field3025);
        } else if (this.field3026 != -1) {
            var1 = class166.field2159[this.field3026];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3024.length - 1) {
            var2 = this.field3024[var1];
        } else {
            var2 = this.field3024[this.field3024.length - 1];
        }
        return var2 == -1 ? null : method1450(var2);
    }

    @ObfuscatedName("gs.o(B)Z")
    public boolean method3468() {
        if (this.field3024 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field3025 != -1) {
            var1 = Statics.method115(this.field3025);
        } else if (this.field3026 != -1) {
            var1 = class166.field2159[this.field3026];
        }
        if (var1 >= 0 && var1 < this.field3024.length) {
            return this.field3024[var1] != -1;
        } else {
            return this.field3024[this.field3024.length - 1] != -1;
        }
    }
}
