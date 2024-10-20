package deob;

@ObfuscatedName("gq")
public class class200 extends class130 {

    @ObfuscatedName("gq.i")
    public static class125 field2989 = new class125(64);

    @ObfuscatedName("gq.a")
    public static class125 field2990 = new class125(50);

    @ObfuscatedName("gq.f")
    public int field2991;

    @ObfuscatedName("gq.c")
    public String field2992 = "null";

    @ObfuscatedName("gq.d")
    public int field3008 = 1;

    @ObfuscatedName("gq.l")
    public int[] field2994;

    @ObfuscatedName("gq.g")
    public int[] field2995;

    @ObfuscatedName("gq.z")
    public int field2993 = -1;

    @ObfuscatedName("gq.t")
    public int field2988 = -1;

    @ObfuscatedName("gq.m")
    public int field2998 = -1;

    @ObfuscatedName("gq.q")
    public int field3001 = -1;

    @ObfuscatedName("gq.e")
    public int field3020 = -1;

    @ObfuscatedName("gq.v")
    public int field2996 = -1;

    @ObfuscatedName("gq.j")
    public int field3002 = -1;

    @ObfuscatedName("gq.p")
    public short[] field3013;

    @ObfuscatedName("gq.k")
    public short[] field3004;

    @ObfuscatedName("gq.r")
    public short[] field3005;

    @ObfuscatedName("gq.y")
    public short[] field3000;

    @ObfuscatedName("gq.h")
    public String[] field3007 = new String[5];

    @ObfuscatedName("gq.s")
    public boolean field3011 = true;

    @ObfuscatedName("gq.w")
    public int field3009 = -1;

    @ObfuscatedName("gq.n")
    public int field3014 = 128;

    @ObfuscatedName("gq.o")
    public int field3006 = 128;

    @ObfuscatedName("gq.b")
    public boolean field3012 = false;

    @ObfuscatedName("gq.aj")
    public int field2999 = 0;

    @ObfuscatedName("gq.ag")
    public int field2997 = 0;

    @ObfuscatedName("gq.al")
    public int field3015 = -1;

    @ObfuscatedName("gq.an")
    public int field3016 = 32;

    @ObfuscatedName("gq.af")
    public int[] field3017;

    @ObfuscatedName("gq.aa")
    public int field3018 = -1;

    @ObfuscatedName("gq.ax")
    public int field3019 = -1;

    @ObfuscatedName("gq.ai")
    public boolean field3010 = true;

    @ObfuscatedName("gq.ah")
    public boolean field3021 = true;

    @ObfuscatedName("gq.av")
    public boolean field3022 = false;

    @ObfuscatedName("i.u(Lgt;Lgt;S)V")
    public static void method31(class183 arg0, class183 arg1) {
        Statics.field3003 = arg0;
        Statics.field2322 = arg1;
    }

    @ObfuscatedName("ag.x(IB)Lgq;")
    public static class200 method614(int arg0) {
        class200 var1 = (class200) field2989.method2186((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3003.method3071(9, arg0);
        class200 var3 = new class200();
        var3.field2991 = arg0;
        if (var2 != null) {
            var3.method3503(new class154(var2));
        }
        var3.method3508();
        field2989.method2179(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gq.i(I)V")
    public void method3508() {
    }

    @ObfuscatedName("gq.a(Len;B)V")
    public void method3503(class154 arg0) {
        while (true) {
            int var2 = arg0.method2708();
            if (var2 == 0) {
                return;
            }
            this.method3495(arg0, var2);
        }
    }

    @ObfuscatedName("gq.c(Len;II)V")
    public void method3495(class154 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2708();
            this.field2994 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2994[var4] = arg0.method2581();
            }
        } else if (arg1 == 2) {
            this.field2992 = arg0.method2778();
        } else if (arg1 == 12) {
            this.field3008 = arg0.method2708();
        } else if (arg1 == 13) {
            this.field2993 = arg0.method2581();
        } else if (arg1 == 14) {
            this.field3001 = arg0.method2581();
        } else if (arg1 == 15) {
            this.field2988 = arg0.method2581();
        } else if (arg1 == 16) {
            this.field2998 = arg0.method2581();
        } else if (arg1 == 17) {
            this.field3001 = arg0.method2581();
            this.field3020 = arg0.method2581();
            this.field2996 = arg0.method2581();
            this.field3002 = arg0.method2581();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3007[arg1 - 30] = arg0.method2778();
            if (this.field3007[arg1 - 30].equalsIgnoreCase(class174.field2555)) {
                this.field3007[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method2708();
            this.field3013 = new short[var5];
            this.field3004 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3013[var6] = (short) arg0.method2581();
                this.field3004[var6] = (short) arg0.method2581();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2708();
            this.field3005 = new short[var7];
            this.field3000 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3005[var8] = (short) arg0.method2581();
                this.field3000[var8] = (short) arg0.method2581();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method2708();
            this.field2995 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field2995[var10] = arg0.method2581();
            }
        } else if (arg1 == 93) {
            this.field3011 = false;
        } else if (arg1 == 95) {
            this.field3009 = arg0.method2581();
        } else if (arg1 == 97) {
            this.field3014 = arg0.method2581();
        } else if (arg1 == 98) {
            this.field3006 = arg0.method2581();
        } else if (arg1 == 99) {
            this.field3012 = true;
        } else if (arg1 == 100) {
            this.field2999 = arg0.method2754();
        } else if (arg1 == 101) {
            this.field2997 = arg0.method2754();
        } else if (arg1 == 102) {
            this.field3015 = arg0.method2581();
        } else if (arg1 == 103) {
            this.field3016 = arg0.method2581();
        } else if (arg1 == 106 || arg1 == 118) {
            this.field3018 = arg0.method2581();
            if (this.field3018 == 65535) {
                this.field3018 = -1;
            }
            this.field3019 = arg0.method2581();
            if (this.field3019 == 65535) {
                this.field3019 = -1;
            }
            int var11 = -1;
            if (arg1 == 118) {
                var11 = arg0.method2581();
                if (var11 == 65535) {
                    var11 = -1;
                }
            }
            int var12 = arg0.method2708();
            this.field3017 = new int[var12 + 2];
            for (int var13 = 0; var13 <= var12; var13++) {
                this.field3017[var13] = arg0.method2581();
                if (this.field3017[var13] == 65535) {
                    this.field3017[var13] = -1;
                }
            }
            this.field3017[var12 + 1] = var11;
        } else if (arg1 == 107) {
            this.field3010 = false;
        } else if (arg1 == 109) {
            this.field3021 = false;
        } else if (arg1 == 111) {
            this.field3022 = true;
        }
    }

    @ObfuscatedName("gq.g(Lgg;ILgg;II)Lcs;")
    public final class83 method3494(class202 arg0, int arg1, class202 arg2, int arg3) {
        if (this.field3017 != null) {
            class200 var5 = this.method3498();
            return var5 == null ? null : var5.method3494(arg0, arg1, arg2, arg3);
        }
        class83 var6 = (class83) field2990.method2186((long) this.field2991);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field2994.length; var8++) {
                if (!Statics.field2322.method3063(this.field2994[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class77[] var9 = new class77[this.field2994.length];
            for (int var10 = 0; var10 < this.field2994.length; var10++) {
                var9[var10] = class77.method1393(Statics.field2322, this.field2994[var10], 0);
            }
            class77 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class77(var9, var9.length);
            }
            if (this.field3013 != null) {
                for (int var12 = 0; var12 < this.field3013.length; var12++) {
                    var11.method1357(this.field3013[var12], this.field3004[var12]);
                }
            }
            if (this.field3005 != null) {
                for (int var13 = 0; var13 < this.field3005.length; var13++) {
                    var11.method1399(this.field3005[var13], this.field3000[var13]);
                }
            }
            var6 = var11.method1416(this.field2999 + 64, this.field2997 * 5 + 850, -30, -50, -30);
            field2990.method2179(var6, (long) this.field2991);
        }
        class83 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method3548(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method3557(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method1487(true);
        } else {
            var14 = arg2.method3557(var6, arg3);
        }
        if (this.field3014 != 128 || this.field3006 != 128) {
            var14.method1444(this.field3014, this.field3006, this.field3014);
        }
        return var14;
    }

    @ObfuscatedName("gq.z(I)Lbc;")
    public final class77 method3497() {
        if (this.field3017 != null) {
            class200 var1 = this.method3498();
            return var1 == null ? null : var1.method3497();
        } else if (this.field2995 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field2995.length; var3++) {
                if (!Statics.field2322.method3063(this.field2995[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class77[] var4 = new class77[this.field2995.length];
            for (int var5 = 0; var5 < this.field2995.length; var5++) {
                var4[var5] = class77.method1393(Statics.field2322, this.field2995[var5], 0);
            }
            class77 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class77(var4, var4.length);
            }
            if (this.field3013 != null) {
                for (int var7 = 0; var7 < this.field3013.length; var7++) {
                    var6.method1357(this.field3013[var7], this.field3004[var7]);
                }
            }
            if (this.field3005 != null) {
                for (int var8 = 0; var8 < this.field3005.length; var8++) {
                    var6.method1399(this.field3005[var8], this.field3000[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("gq.t(I)Lgq;")
    public final class200 method3498() {
        int var1 = -1;
        if (this.field3018 != -1) {
            var1 = class166.method1810(this.field3018);
        } else if (this.field3019 != -1) {
            var1 = class166.field2147[this.field3019];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3017.length - 1) {
            var2 = this.field3017[var1];
        } else {
            var2 = this.field3017[this.field3017.length - 1];
        }
        return var2 == -1 ? null : method614(var2);
    }

    @ObfuscatedName("gq.m(I)Z")
    public boolean method3499() {
        if (this.field3017 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field3018 != -1) {
            var1 = class166.method1810(this.field3018);
        } else if (this.field3019 != -1) {
            var1 = class166.field2147[this.field3019];
        }
        if (var1 >= 0 && var1 < this.field3017.length) {
            return this.field3017[var1] != -1;
        } else {
            return this.field3017[this.field3017.length - 1] != -1;
        }
    }
}
