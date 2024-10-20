package deob;

@ObfuscatedName("gw")
public class class200 extends class130 {

    @ObfuscatedName("gw.f")
    public static class125 field3001 = new class125(64);

    @ObfuscatedName("gw.k")
    public static class125 field3032 = new class125(50);

    @ObfuscatedName("gw.g")
    public int field3027;

    @ObfuscatedName("gw.n")
    public String field3006 = "null";

    @ObfuscatedName("gw.a")
    public int field3013 = 1;

    @ObfuscatedName("gw.q")
    public int[] field3024;

    @ObfuscatedName("gw.w")
    public int[] field3007;

    @ObfuscatedName("gw.v")
    public int field3008 = -1;

    @ObfuscatedName("gw.h")
    public int field3003 = -1;

    @ObfuscatedName("gw.p")
    public int field3011 = -1;

    @ObfuscatedName("gw.l")
    public int field3004 = -1;

    @ObfuscatedName("gw.c")
    public int field3012 = -1;

    @ObfuscatedName("gw.m")
    public int field3002 = -1;

    @ObfuscatedName("gw.r")
    public int field3014 = -1;

    @ObfuscatedName("gw.u")
    public short[] field3015;

    @ObfuscatedName("gw.j")
    public short[] field3016;

    @ObfuscatedName("gw.x")
    public short[] field3017;

    @ObfuscatedName("gw.d")
    public short[] field3018;

    @ObfuscatedName("gw.y")
    public String[] field3019 = new String[5];

    @ObfuscatedName("gw.s")
    public boolean field3020 = true;

    @ObfuscatedName("gw.t")
    public int field3021 = -1;

    @ObfuscatedName("gw.z")
    public int field3022 = 128;

    @ObfuscatedName("gw.b")
    public int field3023 = 128;

    @ObfuscatedName("gw.o")
    public boolean field3009 = false;

    @ObfuscatedName("gw.ak")
    public int field3025 = 0;

    @ObfuscatedName("gw.ai")
    public int field3026 = 0;

    @ObfuscatedName("gw.aq")
    public int field3028 = -1;

    @ObfuscatedName("gw.an")
    public int field2999 = 32;

    @ObfuscatedName("gw.ay")
    public int[] field3029;

    @ObfuscatedName("gw.ap")
    public int field3030 = -1;

    @ObfuscatedName("gw.aj")
    public int field3031 = -1;

    @ObfuscatedName("gw.aw")
    public boolean field3010 = true;

    @ObfuscatedName("gw.am")
    public boolean field3033 = true;

    @ObfuscatedName("gw.av")
    public boolean field3034 = false;

    @ObfuscatedName("bo.i(II)Lgw;")
    public static class200 method1368(int arg0) {
        class200 var1 = (class200) field3001.method2150((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3005.method3014(9, arg0);
        class200 var3 = new class200();
        var3.field3027 = arg0;
        if (var2 != null) {
            var3.method3424(new class154(var2));
        }
        var3.method3447();
        field3001.method2152(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gw.e(I)V")
    public void method3447() {
    }

    @ObfuscatedName("gw.f(Let;I)V")
    public void method3424(class154 arg0) {
        while (true) {
            int var2 = arg0.method2573();
            if (var2 == 0) {
                return;
            }
            this.method3425(arg0, var2);
        }
    }

    @ObfuscatedName("gw.k(Let;II)V")
    public void method3425(class154 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2573();
            this.field3024 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3024[var4] = arg0.method2575();
            }
        } else if (arg1 == 2) {
            this.field3006 = arg0.method2581();
        } else if (arg1 == 12) {
            this.field3013 = arg0.method2573();
        } else if (arg1 == 13) {
            this.field3008 = arg0.method2575();
        } else if (arg1 == 14) {
            this.field3004 = arg0.method2575();
        } else if (arg1 == 15) {
            this.field3003 = arg0.method2575();
        } else if (arg1 == 16) {
            this.field3011 = arg0.method2575();
        } else if (arg1 == 17) {
            this.field3004 = arg0.method2575();
            this.field3012 = arg0.method2575();
            this.field3002 = arg0.method2575();
            this.field3014 = arg0.method2575();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3019[arg1 - 30] = arg0.method2581();
            if (this.field3019[arg1 - 30].equalsIgnoreCase(class174.field2409)) {
                this.field3019[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method2573();
            this.field3015 = new short[var5];
            this.field3016 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3015[var6] = (short) arg0.method2575();
                this.field3016[var6] = (short) arg0.method2575();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2573();
            this.field3017 = new short[var7];
            this.field3018 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3017[var8] = (short) arg0.method2575();
                this.field3018[var8] = (short) arg0.method2575();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method2573();
            this.field3007 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3007[var10] = arg0.method2575();
            }
        } else if (arg1 == 93) {
            this.field3020 = false;
        } else if (arg1 == 95) {
            this.field3021 = arg0.method2575();
        } else if (arg1 == 97) {
            this.field3022 = arg0.method2575();
        } else if (arg1 == 98) {
            this.field3023 = arg0.method2575();
        } else if (arg1 == 99) {
            this.field3009 = true;
        } else if (arg1 == 100) {
            this.field3025 = arg0.method2574();
        } else if (arg1 == 101) {
            this.field3026 = arg0.method2574();
        } else if (arg1 == 102) {
            this.field3028 = arg0.method2575();
        } else if (arg1 == 103) {
            this.field2999 = arg0.method2575();
        } else if (arg1 == 106 || arg1 == 118) {
            this.field3030 = arg0.method2575();
            if (this.field3030 == 65535) {
                this.field3030 = -1;
            }
            this.field3031 = arg0.method2575();
            if (this.field3031 == 65535) {
                this.field3031 = -1;
            }
            int var11 = -1;
            if (arg1 == 118) {
                var11 = arg0.method2575();
                if (var11 == 65535) {
                    var11 = -1;
                }
            }
            int var12 = arg0.method2573();
            this.field3029 = new int[var12 + 2];
            for (int var13 = 0; var13 <= var12; var13++) {
                this.field3029[var13] = arg0.method2575();
                if (this.field3029[var13] == 65535) {
                    this.field3029[var13] = -1;
                }
            }
            this.field3029[var12 + 1] = var11;
        } else if (arg1 == 107) {
            this.field3010 = false;
        } else if (arg1 == 109) {
            this.field3033 = false;
        } else if (arg1 == 111) {
            this.field3034 = true;
        }
    }

    @ObfuscatedName("gw.a(Lgd;ILgd;IB)Lch;")
    public final class83 method3428(class202 arg0, int arg1, class202 arg2, int arg3) {
        if (this.field3029 != null) {
            class200 var5 = this.method3429();
            return var5 == null ? null : var5.method3428(arg0, arg1, arg2, arg3);
        }
        class83 var6 = (class83) field3032.method2150((long) this.field3027);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field3024.length; var8++) {
                if (!Statics.field3000.method3016(this.field3024[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class77[] var9 = new class77[this.field3024.length];
            for (int var10 = 0; var10 < this.field3024.length; var10++) {
                var9[var10] = class77.method1374(Statics.field3000, this.field3024[var10], 0);
            }
            class77 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class77(var9, var9.length);
            }
            if (this.field3015 != null) {
                for (int var12 = 0; var12 < this.field3015.length; var12++) {
                    var11.method1405(this.field3015[var12], this.field3016[var12]);
                }
            }
            if (this.field3017 != null) {
                for (int var13 = 0; var13 < this.field3017.length; var13++) {
                    var11.method1398(this.field3017[var13], this.field3018[var13]);
                }
            }
            var6 = var11.method1402(this.field3025 + 64, this.field3026 * 5 + 850, -30, -50, -30);
            field3032.method2152(var6, (long) this.field3027);
        }
        class83 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method3478(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method3475(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method1463(true);
        } else {
            var14 = arg2.method3475(var6, arg3);
        }
        if (this.field3022 != 128 || this.field3023 != 128) {
            var14.method1477(this.field3022, this.field3023, this.field3022);
        }
        return var14;
    }

    @ObfuscatedName("gw.q(B)Lbv;")
    public final class77 method3448() {
        if (this.field3029 != null) {
            class200 var1 = this.method3429();
            return var1 == null ? null : var1.method3448();
        } else if (this.field3007 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field3007.length; var3++) {
                if (!Statics.field3000.method3016(this.field3007[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class77[] var4 = new class77[this.field3007.length];
            for (int var5 = 0; var5 < this.field3007.length; var5++) {
                var4[var5] = class77.method1374(Statics.field3000, this.field3007[var5], 0);
            }
            class77 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class77(var4, var4.length);
            }
            if (this.field3015 != null) {
                for (int var7 = 0; var7 < this.field3015.length; var7++) {
                    var6.method1405(this.field3015[var7], this.field3016[var7]);
                }
            }
            if (this.field3017 != null) {
                for (int var8 = 0; var8 < this.field3017.length; var8++) {
                    var6.method1398(this.field3017[var8], this.field3018[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("gw.w(I)Lgw;")
    public final class200 method3429() {
        int var1 = -1;
        if (this.field3030 != -1) {
            var1 = class166.method1794(this.field3030);
        } else if (this.field3031 != -1) {
            var1 = class166.field2169[this.field3031];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3029.length - 1) {
            var2 = this.field3029[var1];
        } else {
            var2 = this.field3029[this.field3029.length - 1];
        }
        return var2 == -1 ? null : method1368(var2);
    }

    @ObfuscatedName("gw.v(I)Z")
    public boolean method3431() {
        if (this.field3029 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field3030 != -1) {
            var1 = class166.method1794(this.field3030);
        } else if (this.field3031 != -1) {
            var1 = class166.field2169[this.field3031];
        }
        if (var1 >= 0 && var1 < this.field3029.length) {
            return this.field3029[var1] != -1;
        } else {
            return this.field3029[this.field3029.length - 1] != -1;
        }
    }

    @ObfuscatedName("df.h(I)V")
    public static void method2103() {
        field3001.method2155();
        field3032.method2155();
    }
}
