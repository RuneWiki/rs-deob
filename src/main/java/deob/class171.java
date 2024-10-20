package deob;

@ObfuscatedName("ak")
public class class171 extends class6 {

    @ObfuscatedName("ak.f")
    public int[] field2535;

    @ObfuscatedName("ak.g")
    public int field2539 = -1;

    @ObfuscatedName("ak.d")
    public String field2533 = "null";

    @ObfuscatedName("ak.e")
    public int field2541 = -1;

    @ObfuscatedName("ak.c")
    public int field2552 = 128;

    @ObfuscatedName("ak.a")
    public boolean field2544 = true;

    @ObfuscatedName("ak.n")
    public short[] field2546;

    @ObfuscatedName("ak.o")
    public int field2540 = -1;

    @ObfuscatedName("ak.l")
    public int field2563 = 1;

    @ObfuscatedName("ak.m")
    public int field2551 = 128;

    @ObfuscatedName("ak.j")
    public int field2559 = -1;

    @ObfuscatedName("ak.k")
    public static class2 field2543 = new class2(64);

    @ObfuscatedName("ak.i")
    public short[] field2545;

    @ObfuscatedName("ak.w")
    public static class2 field2534 = new class2(50);

    @ObfuscatedName("ak.v")
    public boolean field2565 = false;

    @ObfuscatedName("ak.u")
    public short[] field2547;

    @ObfuscatedName("ak.t")
    public int field2532;

    @ObfuscatedName("ak.s")
    public int[] field2553;

    @ObfuscatedName("ak.r")
    public short[] field2536;

    @ObfuscatedName("ak.q")
    public int field2542 = -1;

    @ObfuscatedName("ak.p")
    public int field2550 = -1;

    @ObfuscatedName("ak.z")
    public int field2537 = -1;

    @ObfuscatedName("ak.y")
    public String[] field2558 = new String[5];

    @ObfuscatedName("ak.x")
    public int field2538 = -1;

    @ObfuscatedName("ak.ar")
    public int field2530 = -1;

    @ObfuscatedName("ak.aq")
    public int field2557 = 32;

    @ObfuscatedName("ak.ax")
    public int field2555 = 0;

    @ObfuscatedName("ak.aw")
    public int field2556 = -1;

    @ObfuscatedName("ak.ak")
    public int[] field2549;

    @ObfuscatedName("ak.ai")
    public boolean field2561 = true;

    @ObfuscatedName("ak.ac")
    public int field2554 = 0;

    @ObfuscatedName("ak.ab")
    public int field2531 = -1;

    @ObfuscatedName("ak.ah")
    public boolean field2562 = true;

    @ObfuscatedName("ak.k(Ldp;B)V")
    public void method2951(class50 arg0) {
        while (true) {
            int var2 = arg0.method726();
            if (var2 == 0) {
                return;
            }
            this.method2954(arg0, var2);
        }
    }

    @ObfuscatedName("ak.w(Ldp;IB)V")
    public void method2954(class50 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method726();
            this.field2535 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2535[var4] = arg0.method720();
            }
        } else if (arg1 == 2) {
            this.field2533 = arg0.method688();
        } else if (arg1 == 12) {
            this.field2563 = arg0.method726();
        } else if (arg1 == 13) {
            this.field2559 = arg0.method720();
        } else if (arg1 == 14) {
            this.field2540 = arg0.method720();
        } else if (arg1 == 15) {
            this.field2538 = arg0.method720();
        } else if (arg1 == 16) {
            this.field2539 = arg0.method720();
        } else if (arg1 == 17) {
            this.field2540 = arg0.method720();
            this.field2541 = arg0.method720();
            this.field2542 = arg0.method720();
            this.field2537 = arg0.method720();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field2558[arg1 - 30] = arg0.method688();
            if (this.field2558[arg1 - 30].equalsIgnoreCase(class85.field983)) {
                this.field2558[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method726();
            this.field2545 = new short[var5];
            this.field2536 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field2545[var6] = (short) arg0.method720();
                this.field2536[var6] = (short) arg0.method720();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method726();
            this.field2546 = new short[var7];
            this.field2547 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2546[var8] = (short) arg0.method720();
                this.field2547[var8] = (short) arg0.method720();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method726();
            this.field2553 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field2553[var10] = arg0.method720();
            }
        } else if (arg1 == 93) {
            this.field2544 = false;
        } else if (arg1 == 95) {
            this.field2550 = arg0.method720();
        } else if (arg1 == 97) {
            this.field2551 = arg0.method720();
        } else if (arg1 == 98) {
            this.field2552 = arg0.method720();
        } else if (arg1 == 99) {
            this.field2565 = true;
        } else if (arg1 == 100) {
            this.field2554 = arg0.method681();
        } else if (arg1 == 101) {
            this.field2555 = arg0.method681() * 5;
        } else if (arg1 == 102) {
            this.field2556 = arg0.method720();
        } else if (arg1 == 103) {
            this.field2557 = arg0.method720();
        } else if (arg1 == 106) {
            this.field2531 = arg0.method720();
            if (this.field2531 == 65535) {
                this.field2531 = -1;
            }
            this.field2530 = arg0.method720();
            if (this.field2530 == 65535) {
                this.field2530 = -1;
            }
            int var11 = arg0.method726();
            this.field2549 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field2549[var12] = arg0.method720();
                if (this.field2549[var12] == 65535) {
                    this.field2549[var12] = -1;
                }
            }
        } else if (arg1 == 107) {
            this.field2561 = false;
        } else if (arg1 == 109) {
            this.field2562 = false;
        }
    }

    @ObfuscatedName("ak.t(Lai;ILai;II)Ldu;")
    public final class27 method2955(class173 arg0, int arg1, class173 arg2, int arg3) {
        if (this.field2549 != null) {
            class171 var5 = this.method2957();
            return var5 == null ? null : var5.method2955(arg0, arg1, arg2, arg3);
        }
        class27 var6 = (class27) field2534.method1((long) this.field2532);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field2535.length; var8++) {
                if (!Statics.field25.method1268(this.field2535[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class157[] var9 = new class157[this.field2535.length];
            for (int var10 = 0; var10 < this.field2535.length; var10++) {
                var9[var10] = class157.method2663(Statics.field25, this.field2535[var10], 0);
            }
            class157 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class157(var9, var9.length);
            }
            if (this.field2545 != null) {
                for (int var12 = 0; var12 < this.field2545.length; var12++) {
                    var11.method2701(this.field2545[var12], this.field2536[var12]);
                }
            }
            if (this.field2546 != null) {
                for (int var13 = 0; var13 < this.field2546.length; var13++) {
                    var11.method2678(this.field2546[var13], this.field2547[var13]);
                }
            }
            var6 = var11.method2706(this.field2554 + 64, this.field2555 + 850, -30, -50, -30);
            field2534.method4(var6, (long) this.field2532);
        }
        class27 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method3029(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method3006(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method386(true);
        } else {
            var14 = arg2.method3006(var6, arg3);
        }
        if (this.field2551 != 128 || this.field2552 != 128) {
            var14.method399(this.field2551, this.field2552, this.field2551);
        }
        return var14;
    }

    @ObfuscatedName("ak.d(I)Lcf;")
    public final class157 method2956() {
        if (this.field2549 != null) {
            class171 var1 = this.method2957();
            return var1 == null ? null : var1.method2956();
        } else if (this.field2553 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field2553.length; var3++) {
                if (!Statics.field25.method1268(this.field2553[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class157[] var4 = new class157[this.field2553.length];
            for (int var5 = 0; var5 < this.field2553.length; var5++) {
                var4[var5] = class157.method2663(Statics.field25, this.field2553[var5], 0);
            }
            class157 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class157(var4, var4.length);
            }
            if (this.field2545 != null) {
                for (int var7 = 0; var7 < this.field2545.length; var7++) {
                    var6.method2701(this.field2545[var7], this.field2536[var7]);
                }
            }
            if (this.field2546 != null) {
                for (int var8 = 0; var8 < this.field2546.length; var8++) {
                    var6.method2678(this.field2546[var8], this.field2547[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("ak.l(I)Lak;")
    public final class171 method2957() {
        int var1 = -1;
        if (this.field2531 != -1) {
            var1 = class71.method2005(this.field2531);
        } else if (this.field2530 != -1) {
            var1 = class71.field800[this.field2530];
        }
        return var1 < 0 || var1 >= this.field2549.length || this.field2549[var1] == -1 ? null : method2388(this.field2549[var1]);
    }

    @ObfuscatedName("ak.f(S)Z")
    public boolean method2958() {
        if (this.field2549 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field2531 != -1) {
            var1 = class71.method2005(this.field2531);
        } else if (this.field2530 != -1) {
            var1 = class71.field800[this.field2530];
        }
        return var1 >= 0 && var1 < this.field2549.length && this.field2549[var1] != -1;
    }

    @ObfuscatedName("ak.h(I)V")
    public void method2972() {
    }

    @ObfuscatedName("cq.b(II)Lak;")
    public static class171 method2388(int arg0) {
        class171 var1 = (class171) field2543.method1((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2548.method1266(9, arg0);
        class171 var3 = new class171();
        var3.field2532 = arg0;
        if (var2 != null) {
            var3.method2951(new class50(var2));
        }
        var3.method2972();
        field2543.method4(var3, (long) arg0);
        return var3;
    }
}
