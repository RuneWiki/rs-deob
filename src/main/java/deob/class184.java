package deob;

@ObfuscatedName("gk")
public class class184 extends class67 {

    @ObfuscatedName("gk.n")
    public class196 field2967 = new class196(128);

    @ObfuscatedName("gk.d")
    public int field2954 = 256;

    @ObfuscatedName("gk.s")
    public int field2949 = 1000000;

    @ObfuscatedName("gk.q")
    public int[] field2950 = new int[16];

    @ObfuscatedName("gk.j")
    public int[] field2951 = new int[16];

    @ObfuscatedName("gk.k")
    public int[] field2952 = new int[16];

    @ObfuscatedName("gk.i")
    public int[] field2953 = new int[16];

    @ObfuscatedName("gk.m")
    public int[] field2972 = new int[16];

    @ObfuscatedName("gk.p")
    public int[] field2955 = new int[16];

    @ObfuscatedName("gk.h")
    public int[] field2960 = new int[16];

    @ObfuscatedName("gk.e")
    public int[] field2957 = new int[16];

    @ObfuscatedName("gk.g")
    public int[] field2958 = new int[16];

    @ObfuscatedName("gk.u")
    public int[] field2959 = new int[16];

    @ObfuscatedName("gk.v")
    public int[] field2971 = new int[16];

    @ObfuscatedName("gk.a")
    public int[] field2961 = new int[16];

    @ObfuscatedName("gk.c")
    public int[] field2962 = new int[16];

    @ObfuscatedName("gk.l")
    public int[] field2963 = new int[16];

    @ObfuscatedName("gk.x")
    public int[] field2948 = new int[16];

    @ObfuscatedName("gk.w")
    public class187[][] field2973 = new class187[16][128];

    @ObfuscatedName("gk.aq")
    public class187[][] field2966 = new class187[16][128];

    @ObfuscatedName("gk.az")
    public class182 field2956 = new class182();

    @ObfuscatedName("gk.ab")
    public boolean field2968;

    @ObfuscatedName("gk.ac")
    public int field2969;

    @ObfuscatedName("gk.ad")
    public int field2970;

    @ObfuscatedName("gk.av")
    public long field2965;

    @ObfuscatedName("gk.ar")
    public long field2964;

    @ObfuscatedName("gk.al")
    public class186 field2947 = new class186(this);

    public class184() {
        this.method3372();
    }

    @ObfuscatedName("gk.n(II)V")
    public synchronized void method3387(int arg0) {
        this.field2954 = arg0;
    }

    @ObfuscatedName("gk.d(B)I")
    public int method3384() {
        return this.field2954;
    }

    @ObfuscatedName("gk.s(Lfh;Lfm;Lbf;II)Z")
    public synchronized boolean method3356(class180 arg0, class167 arg1, class60 arg2, int arg3) {
        arg0.method3273();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class197 var7 = (class197) arg0.field2912.method3522(); var7 != null; var7 = (class197) arg0.field2912.method3523()) {
            int var8 = (int) var7.field3096;
            class181 var9 = (class181) this.field2967.method3519((long) var8);
            if (var9 == null) {
                var9 = class181.method737(arg1, var8);
                if (var9 == null) {
                    var5 = false;
                    continue;
                }
                this.field2967.method3526(var9, (long) var8);
            }
            if (!var9.method3281(arg2, var7.field3076, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method3275();
        }
        return var5;
    }

    @ObfuscatedName("gk.q(I)V")
    public synchronized void method3357() {
        for (class181 var1 = (class181) this.field2967.method3522(); var1 != null; var1 = (class181) this.field2967.method3523()) {
            var1.method3286();
        }
    }

    @ObfuscatedName("gk.j(B)V")
    public synchronized void method3444() {
        for (class181 var1 = (class181) this.field2967.method3522(); var1 != null; var1 = (class181) this.field2967.method3523()) {
            var1.method3651();
        }
    }

    @ObfuscatedName("gk.h(Lfh;ZI)V")
    public synchronized void method3359(class180 arg0, boolean arg1) {
        this.method3360();
        this.field2956.method3293(arg0.field2911);
        this.field2968 = arg1;
        this.field2965 = 0L;
        int var3 = this.field2956.method3296();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2956.method3334(var4);
            this.field2956.method3300(var4);
            this.field2956.method3298(var4);
        }
        this.field2969 = this.field2956.method3305();
        this.field2970 = this.field2956.field2928[this.field2969];
        this.field2964 = this.field2956.method3324(this.field2970);
    }

    @ObfuscatedName("gk.g(B)V")
    public synchronized void method3360() {
        this.field2956.method3319();
        this.method3372();
    }

    @ObfuscatedName("gk.b(I)Z")
    public synchronized boolean method3414() {
        return this.field2956.method3333();
    }

    @ObfuscatedName("gk.f(IIB)V")
    public synchronized void method3361(int arg0, int arg1) {
        this.method3362(arg0, arg1);
    }

    @ObfuscatedName("gk.y(III)V")
    public void method3362(int arg0, int arg1) {
        this.field2953[arg0] = arg1;
        this.field2955[arg0] = arg1 & 0xFFFFFF80;
        this.method3453(arg0, arg1);
    }

    @ObfuscatedName("gk.z(IIB)V")
    public void method3453(int arg0, int arg1) {
        if (this.field2972[arg0] != arg1) {
            this.field2972[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2966[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("gk.t(IIIB)V")
    public void method3364(int arg0, int arg1, int arg2) {
        this.method3458(arg0, arg1, 64);
        if ((this.field2959[arg0] & 0x2) != 0) {
            for (class187 var4 = (class187) this.field2947.field2985.method3554(); var4 != null; var4 = (class187) this.field2947.field2985.method3556()) {
                if (var4.field3010 == arg0 && var4.field2996 < 0) {
                    this.field2973[arg0][var4.field2997] = null;
                    this.field2973[arg0][arg1] = var4;
                    int var5 = (var4.field3006 * var4.field3001 >> 12) + var4.field3000;
                    var4.field3000 += arg1 - var4.field2997 << 8;
                    var4.field3001 = var5 - var4.field3000;
                    var4.field3006 = 4096;
                    var4.field2997 = arg1;
                    return;
                }
            }
        }
        class181 var6 = (class181) this.field2967.method3519((long) this.field2972[arg0]);
        if (var6 == null) {
            return;
        }
        class63 var7 = var6.field2914[arg1];
        if (var7 == null) {
            return;
        }
        class187 var8 = new class187();
        var8.field3010 = arg0;
        var8.field2993 = var6;
        var8.field2994 = var7;
        var8.field3002 = var6.field2918[arg1];
        var8.field3004 = var6.field2916[arg1];
        var8.field2997 = arg1;
        var8.field2992 = var6.field2920 * arg2 * arg2 * var6.field2917[arg1] + 1024 >> 11;
        var8.field2999 = var6.field2913[arg1] & 0xFF;
        var8.field3000 = (arg1 << 8) - (var6.field2915[arg1] & 0x7FFF);
        var8.field2995 = 0;
        var8.field3008 = 0;
        var8.field3005 = 0;
        var8.field2996 = -1;
        var8.field3007 = 0;
        if (this.field2962[arg0] == 0) {
            var8.field3003 = class65.method1353(var7, this.method3377(var8), this.method3378(var8), this.method3379(var8));
        } else {
            var8.field3003 = class65.method1353(var7, this.method3377(var8), 0, this.method3379(var8));
            this.method3365(var8, var6.field2915[arg1] < 0);
        }
        if (var6.field2915[arg1] < 0) {
            var8.field3003.method1244(-1);
        }
        if (var8.field3004 >= 0) {
            class187 var9 = this.field2966[arg0][var8.field3004];
            if (var9 != null && var9.field2996 < 0) {
                this.field2973[arg0][var9.field2997] = null;
                var9.field2996 = 0;
            }
            this.field2966[arg0][var8.field3004] = var8;
        }
        this.field2947.field2985.method3579(var8);
        this.field2973[arg0][arg1] = var8;
    }

    @ObfuscatedName("gk.o(Lgq;ZI)V")
    public void method3365(class187 arg0, boolean arg1) {
        int var3 = arg0.field2994.field1217.length;
        int var5;
        if (arg1 && arg0.field2994.field1219) {
            int var4 = var3 + var3 - arg0.field2994.field1218;
            var5 = (int) ((long) this.field2962[arg0.field3010] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field3003.method1251(true);
            }
        } else {
            var5 = (int) ((long) this.field2962[arg0.field3010] * (long) var3 >> 6);
        }
        arg0.field3003.method1250(var5);
    }

    @ObfuscatedName("gk.r(IIII)V")
    public void method3458(int arg0, int arg1, int arg2) {
        class187 var4 = this.field2973[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2973[arg0][arg1] = null;
        if ((this.field2959[arg0] & 0x2) == 0) {
            var4.field2996 = 0;
            return;
        }
        for (class187 var5 = (class187) this.field2947.field2985.method3574(); var5 != null; var5 = (class187) this.field2947.field2985.method3568()) {
            if (var4.field3010 == var5.field3010 && var5.field2996 < 0 && var4 != var5) {
                var4.field2996 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("gk.u(IIIB)V")
    public void method3388(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("gk.ac(III)V")
    public void method3367(int arg0, int arg1) {
    }

    @ObfuscatedName("gk.ad(III)V")
    public void method3368(int arg0, int arg1) {
        this.field2960[arg0] = arg1;
    }

    @ObfuscatedName("gk.au(II)V")
    public void method3369(int arg0) {
        for (class187 var2 = (class187) this.field2947.field2985.method3574(); var2 != null; var2 = (class187) this.field2947.field2985.method3568()) {
            if (arg0 < 0 || var2.field3010 == arg0) {
                if (var2.field3003 != null) {
                    var2.field3003.method1255(Statics.field1173 / 100);
                    if (var2.field3003.method1259()) {
                        this.field2947.field2987.method1099(var2.field3003);
                    }
                    var2.method3471();
                }
                if (var2.field2996 < 0) {
                    this.field2973[var2.field3010][var2.field2997] = null;
                }
                var2.method3651();
            }
        }
    }

    @ObfuscatedName("gk.aw(II)V")
    public void method3370(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method3370(var2);
            }
            return;
        }
        this.field2950[arg0] = 12800;
        this.field2951[arg0] = 8192;
        this.field2952[arg0] = 16383;
        this.field2960[arg0] = 8192;
        this.field2957[arg0] = 0;
        this.field2958[arg0] = 8192;
        this.method3373(arg0);
        this.method3374(arg0);
        this.field2959[arg0] = 0;
        this.field2971[arg0] = 32767;
        this.field2961[arg0] = 256;
        this.field2962[arg0] = 0;
        this.method3376(arg0, 8192);
    }

    @ObfuscatedName("gk.ax(IB)V")
    public void method3417(int arg0) {
        for (class187 var2 = (class187) this.field2947.field2985.method3574(); var2 != null; var2 = (class187) this.field2947.field2985.method3568()) {
            if ((arg0 < 0 || var2.field3010 == arg0) && var2.field2996 < 0) {
                this.field2973[var2.field3010][var2.field2997] = null;
                var2.field2996 = 0;
            }
        }
    }

    @ObfuscatedName("gk.ap(I)V")
    public void method3372() {
        this.method3369(-1);
        this.method3370(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2972[var1] = this.field2953[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2955[var2] = this.field2953[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("gk.af(II)V")
    public void method3373(int arg0) {
        if ((this.field2959[arg0] & 0x2) == 0) {
            return;
        }
        for (class187 var2 = (class187) this.field2947.field2985.method3574(); var2 != null; var2 = (class187) this.field2947.field2985.method3568()) {
            if (var2.field3010 == arg0 && this.field2973[arg0][var2.field2997] == null && var2.field2996 < 0) {
                var2.field2996 = 0;
            }
        }
    }

    @ObfuscatedName("gk.ag(II)V")
    public void method3374(int arg0) {
        if ((this.field2959[arg0] & 0x4) == 0) {
            return;
        }
        for (class187 var2 = (class187) this.field2947.field2985.method3574(); var2 != null; var2 = (class187) this.field2947.field2985.method3568()) {
            if (var2.field3010 == arg0) {
                var2.field3012 = 0;
            }
        }
    }

    @ObfuscatedName("gk.ah(II)V")
    public void method3409(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method3458(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method3364(var6, var7, var8);
            } else {
                this.method3458(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method3388(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2955[var12] = (var14 << 14) + (this.field2955[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2955[var12] = (var14 << 7) + (this.field2955[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2957[var12] = (var14 << 7) + (this.field2957[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2957[var12] = (this.field2957[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2958[var12] = (var14 << 7) + (this.field2958[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2958[var12] = (this.field2958[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2950[var12] = (var14 << 7) + (this.field2950[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2950[var12] = (this.field2950[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2951[var12] = (var14 << 7) + (this.field2951[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2951[var12] = (this.field2951[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2952[var12] = (var14 << 7) + (this.field2952[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2952[var12] = (this.field2952[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field2959[var12] |= 0x1;
                } else {
                    this.field2959[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2959[var12] |= 0x2;
                } else {
                    this.method3373(var12);
                    this.field2959[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2971[var12] = (var14 << 7) + (this.field2971[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2971[var12] = (this.field2971[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2971[var12] = (var14 << 7) + (this.field2971[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2971[var12] = (this.field2971[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method3369(var12);
            }
            if (var13 == 121) {
                this.method3370(var12);
            }
            if (var13 == 123) {
                this.method3417(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2971[var12];
                if (var15 == 16384) {
                    this.field2961[var12] = (var14 << 7) + (this.field2961[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2971[var12];
                if (var16 == 16384) {
                    this.field2961[var12] = (this.field2961[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2962[var12] = (var14 << 7) + (this.field2962[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2962[var12] = (this.field2962[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2959[var12] |= 0x4;
                } else {
                    this.method3374(var12);
                    this.field2959[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method3376(var12, (var14 << 7) + (this.field2963[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method3376(var12, (this.field2963[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method3453(var17, this.field2955[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method3367(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 9 & 0x3F80) + (arg0 >> 8 & 0x7F);
            this.method3368(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method3372();
            }
        }
    }

    @ObfuscatedName("gk.at(III)V")
    public void method3376(int arg0, int arg1) {
        this.field2963[arg0] = arg1;
        this.field2948[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("gk.ak(Lgq;B)I")
    public int method3377(class187 arg0) {
        int var2 = (arg0.field3006 * arg0.field3001 >> 12) + arg0.field3000;
        int var3 = ((this.field2960[arg0.field3010] - 8192) * this.field2961[arg0.field3010] >> 12) + var2;
        class185 var4 = arg0.field3002;
        if (var4.field2976 > 0 && (var4.field2981 > 0 || this.field2957[arg0.field3010] > 0)) {
            int var5 = var4.field2981 << 2;
            int var6 = var4.field2983 << 1;
            if (arg0.field2998 < var6) {
                var5 = arg0.field2998 * var5 / var6;
            }
            int var7 = (this.field2957[arg0.field3010] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field3009 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field2994.field1221 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field1173 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("gk.ay(Lgq;I)I")
    public int method3378(class187 arg0) {
        class185 var2 = arg0.field3002;
        int var3 = this.field2952[arg0.field3010] * this.field2950[arg0.field3010] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field2992 * var4 + 16384 >> 15;
        int var6 = this.field2954 * var5 + 128 >> 8;
        if (var2.field2977 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field2995 * 1.953125E-5D * (double) var2.field2977) + 0.5D);
        }
        if (var2.field2982 != null) {
            int var7 = arg0.field3008;
            int var8 = var2.field2982[arg0.field3005 + 1];
            if (arg0.field3005 < var2.field2982.length - 2) {
                int var9 = (var2.field2982[arg0.field3005] & 0xFF) << 8;
                int var10 = (var2.field2982[arg0.field3005 + 2] & 0xFF) << 8;
                var8 += (var2.field2982[arg0.field3005 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field2996 > 0 && var2.field2975 != null) {
            int var11 = arg0.field2996;
            int var12 = var2.field2975[arg0.field3007 + 1];
            if (arg0.field3007 < var2.field2975.length - 2) {
                int var13 = (var2.field2975[arg0.field3007] & 0xFF) << 8;
                int var14 = (var2.field2975[arg0.field3007 + 2] & 0xFF) << 8;
                var12 += (var2.field2975[arg0.field3007 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("gk.ai(Lgq;I)I")
    public int method3379(class187 arg0) {
        int var2 = this.field2951[arg0.field3010];
        return var2 < 8192 ? arg0.field2999 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field2999) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("gk.k()Lbj;")
    public synchronized class67 method1104() {
        return this.field2947;
    }

    @ObfuscatedName("gk.i()Lbj;")
    public synchronized class67 method1121() {
        return null;
    }

    @ObfuscatedName("gk.m()I")
    public synchronized int method1106() {
        return 0;
    }

    @ObfuscatedName("gk.p([III)V")
    public synchronized void method1107(int[] arg0, int arg1, int arg2) {
        if (this.field2956.method3333()) {
            int var4 = this.field2949 * this.field2956.field2929 / Statics.field1173;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2965;
                if (this.field2964 - var5 >= 0L) {
                    this.field2965 = var5;
                    break;
                }
                int var7 = (int) ((this.field2964 - this.field2965 + (long) var4 - 1L) / (long) var4);
                this.field2965 += (long) var4 * (long) var7;
                this.field2947.method1107(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method3381();
            } while (this.field2956.method3333());
        }
        this.field2947.method1107(arg0, arg1, arg2);
    }

    @ObfuscatedName("gk.e(I)V")
    public synchronized void method1109(int arg0) {
        if (this.field2956.method3333()) {
            int var2 = this.field2949 * this.field2956.field2929 / Statics.field1173;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2965;
                if (this.field2964 - var3 >= 0L) {
                    this.field2965 = var3;
                    break;
                }
                int var5 = (int) ((this.field2964 - this.field2965 + (long) var2 - 1L) / (long) var2);
                this.field2965 += (long) var2 * (long) var5;
                this.field2947.method1109(var5);
                arg0 -= var5;
                this.method3381();
            } while (this.field2956.method3333());
        }
        this.field2947.method1109(arg0);
    }

    @ObfuscatedName("gk.am(B)V")
    public void method3381() {
        int var1 = this.field2969;
        int var2 = this.field2970;
        long var3 = this.field2964;
        while (this.field2970 == var2) {
            while (this.field2956.field2928[var1] == var2) {
                this.field2956.method3334(var1);
                int var5 = this.field2956.method3301(var1);
                if (var5 == 1) {
                    this.field2956.method3320();
                    this.field2956.method3298(var1);
                    if (this.field2956.method3316()) {
                        if (!this.field2968 || var2 == 0) {
                            this.method3372();
                            this.field2956.method3319();
                            return;
                        }
                        this.field2956.method3307(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method3409(var5);
                }
                this.field2956.method3300(var1);
                this.field2956.method3298(var1);
            }
            var1 = this.field2956.method3305();
            var2 = this.field2956.field2928[var1];
            var3 = this.field2956.method3324(var2);
        }
        this.field2969 = var1;
        this.field2970 = var2;
        this.field2964 = var3;
    }

    @ObfuscatedName("gk.ao(Lgq;B)Z")
    public boolean method3382(class187 arg0) {
        if (arg0.field3003 != null) {
            return false;
        }
        if (arg0.field2996 >= 0) {
            arg0.method3651();
            if (arg0.field3004 > 0 && this.field2966[arg0.field3010][arg0.field3004] == arg0) {
                this.field2966[arg0.field3010][arg0.field3004] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("gk.as(Lgq;[IIIB)Z")
    public boolean method3383(class187 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field3011 = Statics.field1173 / 100;
        if (arg0.field2996 >= 0 && arg0.field3003 == null || arg0.field3003.method1258()) {
            arg0.method3471();
            arg0.method3651();
            if (arg0.field3004 > 0 && this.field2966[arg0.field3010][arg0.field3004] == arg0) {
                this.field2966[arg0.field3010][arg0.field3004] = null;
            }
            return true;
        }
        int var5 = arg0.field3006;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2958[arg0.field3010] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field3006 = var6;
        }
        arg0.field3003.method1256(this.method3377(arg0));
        class185 var7 = arg0.field3002;
        boolean var8 = false;
        arg0.field2998++;
        arg0.field3009 += var7.field2976;
        double var9 = (double) ((arg0.field2997 - 60 << 8) + (arg0.field3006 * arg0.field3001 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2977 > 0) {
            if (var7.field2980 > 0) {
                arg0.field2995 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2980 * var9) + 0.5D);
            } else {
                arg0.field2995 += 128;
            }
        }
        if (var7.field2982 != null) {
            if (var7.field2978 > 0) {
                arg0.field3008 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2978 * var9) + 0.5D);
            } else {
                arg0.field3008 += 128;
            }
            while (arg0.field3005 < var7.field2982.length - 2 && arg0.field3008 > (var7.field2982[arg0.field3005 + 2] & 0xFF) << 8) {
                arg0.field3005 += 2;
            }
            if (arg0.field3005 == var7.field2982.length - 2 && var7.field2982[arg0.field3005 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field2996 >= 0 && var7.field2975 != null && (this.field2959[arg0.field3010] & 0x1) == 0 && (arg0.field3004 < 0 || this.field2966[arg0.field3010][arg0.field3004] != arg0)) {
            if (var7.field2979 > 0) {
                arg0.field2996 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2979 * var9) + 0.5D);
            } else {
                arg0.field2996 += 128;
            }
            while (arg0.field3007 < var7.field2975.length - 2 && arg0.field2996 > (var7.field2975[arg0.field3007 + 2] & 0xFF) << 8) {
                arg0.field3007 += 2;
            }
            if (arg0.field3007 == var7.field2975.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field3003.method1254(arg0.field3011, this.method3378(arg0), this.method3379(arg0));
            return false;
        }
        arg0.field3003.method1255(arg0.field3011);
        if (arg1 == null) {
            arg0.field3003.method1109(arg3);
        } else {
            arg0.field3003.method1107(arg1, arg2, arg3);
        }
        if (arg0.field3003.method1259()) {
            this.field2947.field2987.method1099(arg0.field3003);
        }
        arg0.method3471();
        if (arg0.field2996 >= 0) {
            arg0.method3651();
            if (arg0.field3004 > 0 && this.field2966[arg0.field3010][arg0.field3004] == arg0) {
                this.field2966[arg0.field3010][arg0.field3004] = null;
            }
        }
        return true;
    }
}
