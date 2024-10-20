package deob;

@ObfuscatedName("gj")
public class class184 extends class67 {

    @ObfuscatedName("gj.i")
    public class196 field2962 = new class196(128);

    @ObfuscatedName("gj.v")
    public int field2943 = 256;

    @ObfuscatedName("gj.r")
    public int field2944 = 1000000;

    @ObfuscatedName("gj.n")
    public int[] field2945 = new int[16];

    @ObfuscatedName("gj.x")
    public int[] field2946 = new int[16];

    @ObfuscatedName("gj.q")
    public int[] field2947 = new int[16];

    @ObfuscatedName("gj.h")
    public int[] field2948 = new int[16];

    @ObfuscatedName("gj.d")
    public int[] field2971 = new int[16];

    @ObfuscatedName("gj.c")
    public int[] field2950 = new int[16];

    @ObfuscatedName("gj.y")
    public int[] field2961 = new int[16];

    @ObfuscatedName("gj.m")
    public int[] field2952 = new int[16];

    @ObfuscatedName("gj.e")
    public int[] field2949 = new int[16];

    @ObfuscatedName("gj.u")
    public int[] field2956 = new int[16];

    @ObfuscatedName("gj.o")
    public int[] field2957 = new int[16];

    @ObfuscatedName("gj.k")
    public int[] field2958 = new int[16];

    @ObfuscatedName("gj.a")
    public int[] field2959 = new int[16];

    @ObfuscatedName("gj.j")
    public int[] field2960 = new int[16];

    @ObfuscatedName("gj.p")
    public int[] field2942 = new int[16];

    @ObfuscatedName("gj.w")
    public class187[][] field2963 = new class187[16][128];

    @ObfuscatedName("gj.au")
    public class187[][] field2953 = new class187[16][128];

    @ObfuscatedName("gj.ar")
    public class182 field2964 = new class182();

    @ObfuscatedName("gj.ah")
    public boolean field2965;

    @ObfuscatedName("gj.af")
    public int field2966;

    @ObfuscatedName("gj.az")
    public int field2967;

    @ObfuscatedName("gj.av")
    public long field2968;

    @ObfuscatedName("gj.al")
    public long field2969;

    @ObfuscatedName("gj.aw")
    public class186 field2970 = new class186(this);

    public class184() {
        this.method3373();
    }

    @ObfuscatedName("gj.i(II)V")
    public synchronized void method3353(int arg0) {
        this.field2943 = arg0;
    }

    @ObfuscatedName("gj.v(B)I")
    public int method3354() {
        return this.field2943;
    }

    @ObfuscatedName("gj.r(Lfw;Lfe;Lby;II)Z")
    public synchronized boolean method3355(class180 arg0, class167 arg1, class60 arg2, int arg3) {
        arg0.method3275();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class197 var7 = (class197) arg0.field2906.method3506(); var7 != null; var7 = (class197) arg0.field2906.method3500()) {
            int var8 = (int) var7.field3100;
            class181 var9 = (class181) this.field2962.method3496((long) var8);
            if (var9 == null) {
                var9 = class181.method2145(arg1, var8);
                if (var9 == null) {
                    var5 = false;
                    continue;
                }
                this.field2962.method3497(var9, (long) var8);
            }
            if (!var9.method3283(arg2, var7.field3079, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method3276();
        }
        return var5;
    }

    @ObfuscatedName("gj.n(B)V")
    public synchronized void method3356() {
        for (class181 var1 = (class181) this.field2962.method3506(); var1 != null; var1 = (class181) this.field2962.method3500()) {
            var1.method3285();
        }
    }

    @ObfuscatedName("gj.x(I)V")
    public synchronized void method3357() {
        for (class181 var1 = (class181) this.field2962.method3506(); var1 != null; var1 = (class181) this.field2962.method3500()) {
            var1.method3626();
        }
    }

    @ObfuscatedName("gj.y(Lfw;ZI)V")
    public synchronized void method3358(class180 arg0, boolean arg1) {
        this.method3386();
        this.field2964.method3291(arg0.field2905);
        this.field2965 = arg1;
        this.field2968 = 0L;
        int var3 = this.field2964.method3329();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2964.method3308(var4);
            this.field2964.method3298(var4);
            this.field2964.method3328(var4);
        }
        this.field2966 = this.field2964.method3303();
        this.field2967 = this.field2964.field2922[this.field2966];
        this.field2969 = this.field2964.method3302(this.field2967);
    }

    @ObfuscatedName("gj.e(I)V")
    public synchronized void method3386() {
        this.field2964.method3292();
        this.method3373();
    }

    @ObfuscatedName("gj.z(I)Z")
    public synchronized boolean method3360() {
        return this.field2964.method3290();
    }

    @ObfuscatedName("gj.t(III)V")
    public synchronized void method3390(int arg0, int arg1) {
        this.method3359(arg0, arg1);
    }

    @ObfuscatedName("gj.b(III)V")
    public void method3359(int arg0, int arg1) {
        this.field2948[arg0] = arg1;
        this.field2950[arg0] = arg1 & 0xFFFFFF80;
        this.method3363(arg0, arg1);
    }

    @ObfuscatedName("gj.l(IIB)V")
    public void method3363(int arg0, int arg1) {
        if (this.field2971[arg0] != arg1) {
            this.field2971[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2953[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("gj.s(IIII)V")
    public void method3364(int arg0, int arg1, int arg2) {
        this.method3366(arg0, arg1, 64);
        if ((this.field2956[arg0] & 0x2) != 0) {
            for (class187 var4 = (class187) this.field2970.field2985.method3540(); var4 != null; var4 = (class187) this.field2970.field2985.method3537()) {
                if (var4.field2997 == arg0 && var4.field3003 < 0) {
                    this.field2963[arg0][var4.field2994] = null;
                    this.field2963[arg0][arg1] = var4;
                    int var5 = (var4.field2999 * var4.field2998 >> 12) + var4.field2996;
                    var4.field2996 += arg1 - var4.field2994 << 8;
                    var4.field2998 = var5 - var4.field2996;
                    var4.field2999 = 4096;
                    var4.field2994 = arg1;
                    return;
                }
            }
        }
        class181 var6 = (class181) this.field2962.method3496((long) this.field2971[arg0]);
        if (var6 == null) {
            return;
        }
        class63 var7 = var6.field2910[arg1];
        if (var7 == null) {
            return;
        }
        class187 var8 = new class187();
        var8.field2997 = arg0;
        var8.field2990 = var6;
        var8.field3007 = var7;
        var8.field2992 = var6.field2912[arg1];
        var8.field2991 = var6.field2913[arg1];
        var8.field2994 = arg1;
        var8.field3000 = var6.field2911 * arg2 * arg2 * var6.field2907[arg1] + 1024 >> 11;
        var8.field2995 = var6.field2908[arg1] & 0xFF;
        var8.field2996 = (arg1 << 8) - (var6.field2909[arg1] & 0x7FFF);
        var8.field2989 = 0;
        var8.field3001 = 0;
        var8.field3002 = 0;
        var8.field3003 = -1;
        var8.field3004 = 0;
        if (this.field2959[arg0] == 0) {
            var8.field2993 = class65.method1301(var7, this.method3377(var8), this.method3388(var8), this.method3378(var8));
        } else {
            var8.field2993 = class65.method1301(var7, this.method3377(var8), 0, this.method3378(var8));
            this.method3365(var8, var6.field2909[arg1] < 0);
        }
        if (var6.field2909[arg1] < 0) {
            var8.field2993.method1303(-1);
        }
        if (var8.field2991 >= 0) {
            class187 var9 = this.field2953[arg0][var8.field2991];
            if (var9 != null && var9.field3003 < 0) {
                this.field2963[arg0][var9.field2994] = null;
                var9.field3003 = 0;
            }
            this.field2953[arg0][var8.field2991] = var8;
        }
        this.field2970.field2985.method3529(var8);
        this.field2963[arg0][arg1] = var8;
    }

    @ObfuscatedName("gj.f(Lgc;ZI)V")
    public void method3365(class187 arg0, boolean arg1) {
        int var3 = arg0.field3007.field1238.length;
        int var5;
        if (arg1 && arg0.field3007.field1240) {
            int var4 = var3 + var3 - arg0.field3007.field1237;
            var5 = (int) ((long) this.field2959[arg0.field2997] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field2993.method1310(true);
            }
        } else {
            var5 = (int) ((long) this.field2959[arg0.field2997] * (long) var3 >> 6);
        }
        arg0.field2993.method1309(var5);
    }

    @ObfuscatedName("gj.g(IIII)V")
    public void method3366(int arg0, int arg1, int arg2) {
        class187 var4 = this.field2963[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2963[arg0][arg1] = null;
        if ((this.field2956[arg0] & 0x2) == 0) {
            var4.field3003 = 0;
            return;
        }
        for (class187 var5 = (class187) this.field2970.field2985.method3534(); var5 != null; var5 = (class187) this.field2970.field2985.method3536()) {
            if (var4.field2997 == var5.field2997 && var5.field3003 < 0 && var4 != var5) {
                var4.field3003 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("gj.u(IIIB)V")
    public void method3367(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("gj.o(III)V")
    public void method3368(int arg0, int arg1) {
    }

    @ObfuscatedName("gj.k(IIS)V")
    public void method3435(int arg0, int arg1) {
        this.field2961[arg0] = arg1;
    }

    @ObfuscatedName("gj.a(IB)V")
    public void method3370(int arg0) {
        for (class187 var2 = (class187) this.field2970.field2985.method3534(); var2 != null; var2 = (class187) this.field2970.field2985.method3536()) {
            if (arg0 < 0 || var2.field2997 == arg0) {
                if (var2.field2993 != null) {
                    var2.field2993.method1368(Statics.field1190 / 100);
                    if (var2.field2993.method1318()) {
                        this.field2970.field2988.method1158(var2.field2993);
                    }
                    var2.method3453();
                }
                if (var2.field3003 < 0) {
                    this.field2963[var2.field2997][var2.field2994] = null;
                }
                var2.method3626();
            }
        }
    }

    @ObfuscatedName("gj.aw(IB)V")
    public void method3371(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method3371(var2);
            }
            return;
        }
        this.field2945[arg0] = 12800;
        this.field2946[arg0] = 8192;
        this.field2947[arg0] = 16383;
        this.field2961[arg0] = 8192;
        this.field2952[arg0] = 0;
        this.field2949[arg0] = 8192;
        this.method3374(arg0);
        this.method3425(arg0);
        this.field2956[arg0] = 0;
        this.field2957[arg0] = 32767;
        this.field2958[arg0] = 256;
        this.field2959[arg0] = 0;
        this.method3402(arg0, 8192);
    }

    @ObfuscatedName("gj.ac(II)V")
    public void method3379(int arg0) {
        for (class187 var2 = (class187) this.field2970.field2985.method3534(); var2 != null; var2 = (class187) this.field2970.field2985.method3536()) {
            if ((arg0 < 0 || var2.field2997 == arg0) && var2.field3003 < 0) {
                this.field2963[var2.field2997][var2.field2994] = null;
                var2.field3003 = 0;
            }
        }
    }

    @ObfuscatedName("gj.ap(B)V")
    public void method3373() {
        this.method3370(-1);
        this.method3371(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2971[var1] = this.field2948[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2950[var2] = this.field2948[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("gj.ax(II)V")
    public void method3374(int arg0) {
        if ((this.field2956[arg0] & 0x2) == 0) {
            return;
        }
        for (class187 var2 = (class187) this.field2970.field2985.method3534(); var2 != null; var2 = (class187) this.field2970.field2985.method3536()) {
            if (var2.field2997 == arg0 && this.field2963[arg0][var2.field2994] == null && var2.field3003 < 0) {
                var2.field3003 = 0;
            }
        }
    }

    @ObfuscatedName("gj.aa(IB)V")
    public void method3425(int arg0) {
        if ((this.field2956[arg0] & 0x4) == 0) {
            return;
        }
        for (class187 var2 = (class187) this.field2970.field2985.method3534(); var2 != null; var2 = (class187) this.field2970.field2985.method3536()) {
            if (var2.field2997 == arg0) {
                var2.field3009 = 0;
            }
        }
    }

    @ObfuscatedName("gj.aq(II)V")
    public void method3352(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method3366(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method3364(var6, var7, var8);
            } else {
                this.method3366(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method3367(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2950[var12] = (var14 << 14) + (this.field2950[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2950[var12] = (var14 << 7) + (this.field2950[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2952[var12] = (var14 << 7) + (this.field2952[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2952[var12] = (this.field2952[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2949[var12] = (var14 << 7) + (this.field2949[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2949[var12] = (this.field2949[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2945[var12] = (var14 << 7) + (this.field2945[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2945[var12] = (this.field2945[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2946[var12] = (var14 << 7) + (this.field2946[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2946[var12] = (this.field2946[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2947[var12] = (var14 << 7) + (this.field2947[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2947[var12] = (this.field2947[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field2956[var12] |= 0x1;
                } else {
                    this.field2956[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2956[var12] |= 0x2;
                } else {
                    this.method3374(var12);
                    this.field2956[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2957[var12] = (var14 << 7) + (this.field2957[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2957[var12] = (this.field2957[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2957[var12] = (var14 << 7) + (this.field2957[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2957[var12] = (this.field2957[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method3370(var12);
            }
            if (var13 == 121) {
                this.method3371(var12);
            }
            if (var13 == 123) {
                this.method3379(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2957[var12];
                if (var15 == 16384) {
                    this.field2958[var12] = (var14 << 7) + (this.field2958[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2957[var12];
                if (var16 == 16384) {
                    this.field2958[var12] = (this.field2958[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2959[var12] = (var14 << 7) + (this.field2959[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2959[var12] = (this.field2959[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2956[var12] |= 0x4;
                } else {
                    this.method3425(var12);
                    this.field2956[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method3402(var12, (var14 << 7) + (this.field2960[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method3402(var12, (this.field2960[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method3363(var17, this.field2950[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method3368(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
            this.method3435(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method3373();
            }
        }
    }

    @ObfuscatedName("gj.ak(III)V")
    public void method3402(int arg0, int arg1) {
        this.field2960[arg0] = arg1;
        this.field2942[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("gj.at(Lgc;I)I")
    public int method3377(class187 arg0) {
        int var2 = (arg0.field2999 * arg0.field2998 >> 12) + arg0.field2996;
        int var3 = ((this.field2961[arg0.field2997] - 8192) * this.field2958[arg0.field2997] >> 12) + var2;
        class185 var4 = arg0.field2992;
        if (var4.field2975 > 0 && (var4.field2979 > 0 || this.field2952[arg0.field2997] > 0)) {
            int var5 = var4.field2979 << 2;
            int var6 = var4.field2981 << 1;
            if (arg0.field3005 < var6) {
                var5 = arg0.field3005 * var5 / var6;
            }
            int var7 = (this.field2952[arg0.field2997] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field3006 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field3007.field1236 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field1190 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("gj.as(Lgc;I)I")
    public int method3388(class187 arg0) {
        class185 var2 = arg0.field2992;
        int var3 = this.field2947[arg0.field2997] * this.field2945[arg0.field2997] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field3000 * var4 + 16384 >> 15;
        int var6 = this.field2943 * var5 + 128 >> 8;
        if (var2.field2973 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field2989 * 1.953125E-5D * (double) var2.field2973) + 0.5D);
        }
        if (var2.field2980 != null) {
            int var7 = arg0.field3001;
            int var8 = var2.field2980[arg0.field3002 + 1];
            if (arg0.field3002 < var2.field2980.length - 2) {
                int var9 = (var2.field2980[arg0.field3002] & 0xFF) << 8;
                int var10 = (var2.field2980[arg0.field3002 + 2] & 0xFF) << 8;
                var8 += (var2.field2980[arg0.field3002 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field3003 > 0 && var2.field2974 != null) {
            int var11 = arg0.field3003;
            int var12 = var2.field2974[arg0.field3004 + 1];
            if (arg0.field3004 < var2.field2974.length - 2) {
                int var13 = (var2.field2974[arg0.field3004] & 0xFF) << 8;
                int var14 = (var2.field2974[arg0.field3004 + 2] & 0xFF) << 8;
                var12 += (var2.field2974[arg0.field3004 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("gj.ag(Lgc;B)I")
    public int method3378(class187 arg0) {
        int var2 = this.field2946[arg0.field2997];
        return var2 < 8192 ? arg0.field2995 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field2995) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("gj.q()Lbj;")
    public synchronized class67 method1138() {
        return this.field2970;
    }

    @ObfuscatedName("gj.h()Lbj;")
    public synchronized class67 method1139() {
        return null;
    }

    @ObfuscatedName("gj.d()I")
    public synchronized int method1171() {
        return 0;
    }

    @ObfuscatedName("gj.c([III)V")
    public synchronized void method1166(int[] arg0, int arg1, int arg2) {
        if (this.field2964.method3290()) {
            int var4 = this.field2944 * this.field2964.field2924 / Statics.field1190;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2968;
                if (this.field2969 - var5 >= 0L) {
                    this.field2968 = var5;
                    break;
                }
                int var7 = (int) ((this.field2969 - this.field2968 + (long) var4 - 1L) / (long) var4);
                this.field2968 += (long) var4 * (long) var7;
                this.field2970.method1166(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method3381();
            } while (this.field2964.method3290());
        }
        this.field2970.method1166(arg0, arg1, arg2);
    }

    @ObfuscatedName("gj.m(I)V")
    public synchronized void method1154(int arg0) {
        if (this.field2964.method3290()) {
            int var2 = this.field2944 * this.field2964.field2924 / Statics.field1190;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2968;
                if (this.field2969 - var3 >= 0L) {
                    this.field2968 = var3;
                    break;
                }
                int var5 = (int) ((this.field2969 - this.field2968 + (long) var2 - 1L) / (long) var2);
                this.field2968 += (long) var2 * (long) var5;
                this.field2970.method1154(var5);
                arg0 -= var5;
                this.method3381();
            } while (this.field2964.method3290());
        }
        this.field2970.method1154(arg0);
    }

    @ObfuscatedName("gj.ad(I)V")
    public void method3381() {
        int var1 = this.field2966;
        int var2 = this.field2967;
        long var3 = this.field2969;
        while (this.field2967 == var2) {
            while (this.field2964.field2922[var1] == var2) {
                this.field2964.method3308(var1);
                int var5 = this.field2964.method3315(var1);
                if (var5 == 1) {
                    this.field2964.method3297();
                    this.field2964.method3328(var1);
                    if (this.field2964.method3309()) {
                        if (!this.field2965 || var2 == 0) {
                            this.method3373();
                            this.field2964.method3292();
                            return;
                        }
                        this.field2964.method3305(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method3352(var5);
                }
                this.field2964.method3298(var1);
                this.field2964.method3328(var1);
            }
            var1 = this.field2964.method3303();
            var2 = this.field2964.field2922[var1];
            var3 = this.field2964.method3302(var2);
        }
        this.field2966 = var1;
        this.field2967 = var2;
        this.field2969 = var3;
    }

    @ObfuscatedName("gj.bw(Lgc;I)Z")
    public boolean method3382(class187 arg0) {
        if (arg0.field2993 != null) {
            return false;
        }
        if (arg0.field3003 >= 0) {
            arg0.method3626();
            if (arg0.field2991 > 0 && this.field2953[arg0.field2997][arg0.field2991] == arg0) {
                this.field2953[arg0.field2997][arg0.field2991] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("gj.bq(Lgc;[IIIB)Z")
    public boolean method3383(class187 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field3008 = Statics.field1190 / 100;
        if (arg0.field3003 >= 0 && arg0.field2993 == null || arg0.field2993.method1317()) {
            arg0.method3453();
            arg0.method3626();
            if (arg0.field2991 > 0 && this.field2953[arg0.field2997][arg0.field2991] == arg0) {
                this.field2953[arg0.field2997][arg0.field2991] = null;
            }
            return true;
        }
        int var5 = arg0.field2999;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2949[arg0.field2997] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field2999 = var6;
        }
        arg0.field2993.method1315(this.method3377(arg0));
        class185 var7 = arg0.field2992;
        boolean var8 = false;
        arg0.field3005++;
        arg0.field3006 += var7.field2975;
        double var9 = (double) ((arg0.field2994 - 60 << 8) + (arg0.field2999 * arg0.field2998 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2973 > 0) {
            if (var7.field2978 > 0) {
                arg0.field2989 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2978 * var9) + 0.5D);
            } else {
                arg0.field2989 += 128;
            }
        }
        if (var7.field2980 != null) {
            if (var7.field2976 > 0) {
                arg0.field3001 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2976 * var9) + 0.5D);
            } else {
                arg0.field3001 += 128;
            }
            while (arg0.field3002 < var7.field2980.length - 2 && arg0.field3001 > (var7.field2980[arg0.field3002 + 2] & 0xFF) << 8) {
                arg0.field3002 += 2;
            }
            if (arg0.field3002 == var7.field2980.length - 2 && var7.field2980[arg0.field3002 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field3003 >= 0 && var7.field2974 != null && (this.field2956[arg0.field2997] & 0x1) == 0 && (arg0.field2991 < 0 || this.field2953[arg0.field2997][arg0.field2991] != arg0)) {
            if (var7.field2977 > 0) {
                arg0.field3003 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2977 * var9) + 0.5D);
            } else {
                arg0.field3003 += 128;
            }
            while (arg0.field3004 < var7.field2974.length - 2 && arg0.field3003 > (var7.field2974[arg0.field3004 + 2] & 0xFF) << 8) {
                arg0.field3004 += 2;
            }
            if (arg0.field3004 == var7.field2974.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field2993.method1410(arg0.field3008, this.method3388(arg0), this.method3378(arg0));
            return false;
        }
        arg0.field2993.method1368(arg0.field3008);
        if (arg1 == null) {
            arg0.field2993.method1154(arg3);
        } else {
            arg0.field2993.method1166(arg1, arg2, arg3);
        }
        if (arg0.field2993.method1318()) {
            this.field2970.field2988.method1158(arg0.field2993);
        }
        arg0.method3453();
        if (arg0.field3003 >= 0) {
            arg0.method3626();
            if (arg0.field2991 > 0 && this.field2953[arg0.field2997][arg0.field2991] == arg0) {
                this.field2953[arg0.field2997][arg0.field2991] = null;
            }
        }
        return true;
    }
}
