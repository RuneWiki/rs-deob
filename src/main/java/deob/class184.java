package deob;

@ObfuscatedName("gb")
public class class184 extends class67 {

    @ObfuscatedName("gb.c")
    public class196 field2957 = new class196(128);

    @ObfuscatedName("gb.h")
    public int field2953 = 256;

    @ObfuscatedName("gb.k")
    public int field2947 = 1000000;

    @ObfuscatedName("gb.t")
    public int[] field2948 = new int[16];

    @ObfuscatedName("gb.g")
    public int[] field2949 = new int[16];

    @ObfuscatedName("gb.o")
    public int[] field2973 = new int[16];

    @ObfuscatedName("gb.i")
    public int[] field2951 = new int[16];

    @ObfuscatedName("gb.m")
    public int[] field2965 = new int[16];

    @ObfuscatedName("gb.r")
    public int[] field2950 = new int[16];

    @ObfuscatedName("gb.y")
    public int[] field2954 = new int[16];

    @ObfuscatedName("gb.q")
    public int[] field2968 = new int[16];

    @ObfuscatedName("gb.f")
    public int[] field2956 = new int[16];

    @ObfuscatedName("gb.b")
    public int[] field2958 = new int[16];

    @ObfuscatedName("gb.s")
    public int[] field2959 = new int[16];

    @ObfuscatedName("gb.v")
    public int[] field2955 = new int[16];

    @ObfuscatedName("gb.j")
    public int[] field2961 = new int[16];

    @ObfuscatedName("gb.z")
    public int[] field2971 = new int[16];

    @ObfuscatedName("gb.n")
    public int[] field2963 = new int[16];

    @ObfuscatedName("gb.p")
    public class187[][] field2964 = new class187[16][128];

    @ObfuscatedName("gb.aj")
    public class187[][] field2960 = new class187[16][128];

    @ObfuscatedName("gb.aq")
    public class182 field2966 = new class182();

    @ObfuscatedName("gb.aw")
    public boolean field2967;

    @ObfuscatedName("gb.az")
    public int field2969;

    @ObfuscatedName("gb.at")
    public int field2952;

    @ObfuscatedName("gb.af")
    public long field2970;

    @ObfuscatedName("gb.ax")
    public long field2945;

    @ObfuscatedName("gb.ac")
    public class186 field2972 = new class186(this);

    public class184() {
        this.method3368();
    }

    @ObfuscatedName("gb.c(II)V")
    public synchronized void method3453(int arg0) {
        this.field2953 = arg0;
    }

    @ObfuscatedName("gb.h(B)I")
    public int method3361() {
        return this.field2953;
    }

    @ObfuscatedName("gb.k(Lfx;Lfj;Lbc;II)Z")
    public synchronized boolean method3362(class180 arg0, class167 arg1, class60 arg2, int arg3) {
        arg0.method3277();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class197 var7 = (class197) arg0.field2910.method3520(); var7 != null; var7 = (class197) arg0.field2910.method3533()) {
            int var8 = (int) var7.field3096;
            class181 var9 = (class181) this.field2957.method3521((long) var8);
            if (var9 == null) {
                var9 = class181.method2883(arg1, var8);
                if (var9 == null) {
                    var5 = false;
                    continue;
                }
                this.field2957.method3531(var9, (long) var8);
            }
            if (!var9.method3283(arg2, var7.field3076, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method3278();
        }
        return var5;
    }

    @ObfuscatedName("gb.t(B)V")
    public synchronized void method3391() {
        for (class181 var1 = (class181) this.field2957.method3520(); var1 != null; var1 = (class181) this.field2957.method3533()) {
            var1.method3284();
        }
    }

    @ObfuscatedName("gb.g(I)V")
    public synchronized void method3364() {
        for (class181 var1 = (class181) this.field2957.method3520(); var1 != null; var1 = (class181) this.field2957.method3533()) {
            var1.method3646();
        }
    }

    @ObfuscatedName("gb.r(Lfx;ZB)V")
    public synchronized void method3365(class180 arg0, boolean arg1) {
        this.method3366();
        this.field2966.method3294(arg0.field2909);
        this.field2967 = arg1;
        this.field2970 = 0L;
        int var3 = this.field2966.method3297();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2966.method3305(var4);
            this.field2966.method3301(var4);
            this.field2966.method3299(var4);
        }
        this.field2969 = this.field2966.method3306();
        this.field2952 = this.field2966.field2926[this.field2969];
        this.field2945 = this.field2966.method3319(this.field2952);
    }

    @ObfuscatedName("gb.q(I)V")
    public synchronized void method3366() {
        this.field2966.method3295();
        this.method3368();
    }

    @ObfuscatedName("gb.f(I)Z")
    public synchronized boolean method3367() {
        return this.field2966.method3296();
    }

    @ObfuscatedName("gb.x(III)V")
    public synchronized void method3430(int arg0, int arg1) {
        this.method3433(arg0, arg1);
    }

    @ObfuscatedName("gb.d(IIB)V")
    public void method3433(int arg0, int arg1) {
        this.field2951[arg0] = arg1;
        this.field2950[arg0] = arg1 & 0xFFFFFF80;
        this.method3369(arg0, arg1);
    }

    @ObfuscatedName("gb.e(IIB)V")
    public void method3369(int arg0, int arg1) {
        if (this.field2965[arg0] != arg1) {
            this.field2965[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2960[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("gb.l(IIII)V")
    public void method3370(int arg0, int arg1, int arg2) {
        this.method3372(arg0, arg1, 64);
        if ((this.field2958[arg0] & 0x2) != 0) {
            for (class187 var4 = (class187) this.field2972.field2990.method3559(); var4 != null; var4 = (class187) this.field2972.field2990.method3561()) {
                if (var4.field2992 == arg0 && var4.field3000 < 0) {
                    this.field2964[arg0][var4.field2996] = null;
                    this.field2964[arg0][arg1] = var4;
                    int var5 = (var4.field3008 * var4.field2994 >> 12) + var4.field2999;
                    var4.field2999 += arg1 - var4.field2996 << 8;
                    var4.field2994 = var5 - var4.field2999;
                    var4.field3008 = 4096;
                    var4.field2996 = arg1;
                    return;
                }
            }
        }
        class181 var6 = (class181) this.field2957.method3521((long) this.field2965[arg0]);
        if (var6 == null) {
            return;
        }
        class63 var7 = var6.field2916[arg1];
        if (var7 == null) {
            return;
        }
        class187 var8 = new class187();
        var8.field2992 = arg0;
        var8.field3005 = var6;
        var8.field3001 = var7;
        var8.field3011 = var6.field2918[arg1];
        var8.field2995 = var6.field2917[arg1];
        var8.field2996 = arg1;
        var8.field2997 = var6.field2912 * arg2 * arg2 * var6.field2914[arg1] + 1024 >> 11;
        var8.field2998 = var6.field2911[arg1] & 0xFF;
        var8.field2999 = (arg1 << 8) - (var6.field2913[arg1] & 0x7FFF);
        var8.field3002 = 0;
        var8.field2993 = 0;
        var8.field3004 = 0;
        var8.field3000 = -1;
        var8.field3006 = 0;
        if (this.field2961[arg0] == 0) {
            var8.field3009 = class65.method1255(var7, this.method3382(var8), this.method3383(var8), this.method3384(var8));
        } else {
            var8.field3009 = class65.method1255(var7, this.method3382(var8), 0, this.method3384(var8));
            this.method3386(var8, var6.field2913[arg1] < 0);
        }
        if (var6.field2913[arg1] < 0) {
            var8.field3009.method1257(-1);
        }
        if (var8.field2995 >= 0) {
            class187 var9 = this.field2960[arg0][var8.field2995];
            if (var9 != null && var9.field3000 < 0) {
                this.field2964[arg0][var9.field2996] = null;
                var9.field3000 = 0;
            }
            this.field2960[arg0][var8.field2995] = var8;
        }
        this.field2972.field2990.method3585(var8);
        this.field2964[arg0][arg1] = var8;
    }

    @ObfuscatedName("gb.u(Lgf;ZI)V")
    public void method3386(class187 arg0, boolean arg1) {
        int var3 = arg0.field3001.field1225.length;
        int var5;
        if (arg1 && arg0.field3001.field1228) {
            int var4 = var3 + var3 - arg0.field3001.field1226;
            var5 = (int) ((long) this.field2961[arg0.field2992] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field3009.method1306(true);
            }
        } else {
            var5 = (int) ((long) this.field2961[arg0.field2992] * (long) var3 >> 6);
        }
        arg0.field3009.method1263(var5);
    }

    @ObfuscatedName("gb.a(IIII)V")
    public void method3372(int arg0, int arg1, int arg2) {
        class187 var4 = this.field2964[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2964[arg0][arg1] = null;
        if ((this.field2958[arg0] & 0x2) == 0) {
            var4.field3000 = 0;
            return;
        }
        for (class187 var5 = (class187) this.field2972.field2990.method3558(); var5 != null; var5 = (class187) this.field2972.field2990.method3554()) {
            if (var4.field2992 == var5.field2992 && var5.field3000 < 0 && var4 != var5) {
                var4.field3000 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("gb.b(IIIB)V")
    public void method3373(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("gb.s(III)V")
    public void method3374(int arg0, int arg1) {
    }

    @ObfuscatedName("gb.v(IIB)V")
    public void method3394(int arg0, int arg1) {
        this.field2954[arg0] = arg1;
    }

    @ObfuscatedName("gb.j(IB)V")
    public void method3378(int arg0) {
        for (class187 var2 = (class187) this.field2972.field2990.method3558(); var2 != null; var2 = (class187) this.field2972.field2990.method3554()) {
            if (arg0 < 0 || var2.field2992 == arg0) {
                if (var2.field3009 != null) {
                    var2.field3009.method1330(Statics.field1191 / 100);
                    if (var2.field3009.method1272()) {
                        this.field2972.field2987.method1092(var2.field3009);
                    }
                    var2.method3472();
                }
                if (var2.field3000 < 0) {
                    this.field2964[var2.field2992][var2.field2996] = null;
                }
                var2.method3646();
            }
        }
    }

    @ObfuscatedName("gb.ak(II)V")
    public void method3376(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method3376(var2);
            }
            return;
        }
        this.field2948[arg0] = 12800;
        this.field2949[arg0] = 8192;
        this.field2973[arg0] = 16383;
        this.field2954[arg0] = 8192;
        this.field2968[arg0] = 0;
        this.field2956[arg0] = 8192;
        this.method3379(arg0);
        this.method3403(arg0);
        this.field2958[arg0] = 0;
        this.field2959[arg0] = 32767;
        this.field2955[arg0] = 256;
        this.field2961[arg0] = 0;
        this.method3381(arg0, 8192);
    }

    @ObfuscatedName("gb.au(IB)V")
    public void method3377(int arg0) {
        for (class187 var2 = (class187) this.field2972.field2990.method3558(); var2 != null; var2 = (class187) this.field2972.field2990.method3554()) {
            if ((arg0 < 0 || var2.field2992 == arg0) && var2.field3000 < 0) {
                this.field2964[var2.field2992][var2.field2996] = null;
                var2.field3000 = 0;
            }
        }
    }

    @ObfuscatedName("gb.aa(B)V")
    public void method3368() {
        this.method3378(-1);
        this.method3376(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2965[var1] = this.field2951[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2950[var2] = this.field2951[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("gb.ai(II)V")
    public void method3379(int arg0) {
        if ((this.field2958[arg0] & 0x2) == 0) {
            return;
        }
        for (class187 var2 = (class187) this.field2972.field2990.method3558(); var2 != null; var2 = (class187) this.field2972.field2990.method3554()) {
            if (var2.field2992 == arg0 && this.field2964[arg0][var2.field2996] == null && var2.field3000 < 0) {
                var2.field3000 = 0;
            }
        }
    }

    @ObfuscatedName("gb.av(IB)V")
    public void method3403(int arg0) {
        if ((this.field2958[arg0] & 0x4) == 0) {
            return;
        }
        for (class187 var2 = (class187) this.field2972.field2990.method3558(); var2 != null; var2 = (class187) this.field2972.field2990.method3554()) {
            if (var2.field2992 == arg0) {
                var2.field3014 = 0;
            }
        }
    }

    @ObfuscatedName("gb.ab(II)V")
    public void method3444(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method3372(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method3370(var6, var7, var8);
            } else {
                this.method3372(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method3373(var9, var10, var11);
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
                this.field2968[var12] = (var14 << 7) + (this.field2968[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2968[var12] = (this.field2968[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2956[var12] = (var14 << 7) + (this.field2956[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2956[var12] = (this.field2956[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2948[var12] = (var14 << 7) + (this.field2948[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2948[var12] = (this.field2948[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2949[var12] = (var14 << 7) + (this.field2949[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2949[var12] = (this.field2949[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2973[var12] = (var14 << 7) + (this.field2973[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2973[var12] = (this.field2973[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field2958[var12] |= 0x1;
                } else {
                    this.field2958[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2958[var12] |= 0x2;
                } else {
                    this.method3379(var12);
                    this.field2958[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2959[var12] = (var14 << 7) + (this.field2959[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2959[var12] = (this.field2959[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2959[var12] = (var14 << 7) + (this.field2959[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2959[var12] = (this.field2959[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method3378(var12);
            }
            if (var13 == 121) {
                this.method3376(var12);
            }
            if (var13 == 123) {
                this.method3377(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2959[var12];
                if (var15 == 16384) {
                    this.field2955[var12] = (var14 << 7) + (this.field2955[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2959[var12];
                if (var16 == 16384) {
                    this.field2955[var12] = (this.field2955[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2961[var12] = (var14 << 7) + (this.field2961[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2961[var12] = (this.field2961[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2958[var12] |= 0x4;
                } else {
                    this.method3403(var12);
                    this.field2958[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method3381(var12, (var14 << 7) + (this.field2971[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method3381(var12, (this.field2971[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method3369(var17, this.field2950[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method3374(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
            this.method3394(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method3368();
            }
        }
    }

    @ObfuscatedName("gb.al(III)V")
    public void method3381(int arg0, int arg1) {
        this.field2971[arg0] = arg1;
        this.field2963[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("gb.ae(Lgf;I)I")
    public int method3382(class187 arg0) {
        int var2 = (arg0.field3008 * arg0.field2994 >> 12) + arg0.field2999;
        int var3 = ((this.field2954[arg0.field2992] - 8192) * this.field2955[arg0.field2992] >> 12) + var2;
        class185 var4 = arg0.field3011;
        if (var4.field2975 > 0 && (var4.field2980 > 0 || this.field2968[arg0.field2992] > 0)) {
            int var5 = var4.field2980 << 2;
            int var6 = var4.field2974 << 1;
            if (arg0.field3007 < var6) {
                var5 = arg0.field3007 * var5 / var6;
            }
            int var7 = (this.field2968[arg0.field2992] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field3003 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field3001.field1224 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field1191 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("gb.ay(Lgf;I)I")
    public int method3383(class187 arg0) {
        class185 var2 = arg0.field3011;
        int var3 = this.field2973[arg0.field2992] * this.field2948[arg0.field2992] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field2997 * var4 + 16384 >> 15;
        int var6 = this.field2953 * var5 + 128 >> 8;
        if (var2.field2976 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field3002 * 1.953125E-5D * (double) var2.field2976) + 0.5D);
        }
        if (var2.field2981 != null) {
            int var7 = arg0.field2993;
            int var8 = var2.field2981[arg0.field3004 + 1];
            if (arg0.field3004 < var2.field2981.length - 2) {
                int var9 = (var2.field2981[arg0.field3004] & 0xFF) << 8;
                int var10 = (var2.field2981[arg0.field3004 + 2] & 0xFF) << 8;
                var8 += (var2.field2981[arg0.field3004 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field3000 > 0 && var2.field2982 != null) {
            int var11 = arg0.field3000;
            int var12 = var2.field2982[arg0.field3006 + 1];
            if (arg0.field3006 < var2.field2982.length - 2) {
                int var13 = (var2.field2982[arg0.field3006] & 0xFF) << 8;
                int var14 = (var2.field2982[arg0.field3006 + 2] & 0xFF) << 8;
                var12 += (var2.field2982[arg0.field3006 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("gb.an(Lgf;I)I")
    public int method3384(class187 arg0) {
        int var2 = this.field2949[arg0.field2992];
        return var2 < 8192 ? arg0.field2998 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field2998) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("gb.o()Lbv;")
    public synchronized class67 method1110() {
        return this.field2972;
    }

    @ObfuscatedName("gb.i()Lbv;")
    public synchronized class67 method1098() {
        return null;
    }

    @ObfuscatedName("gb.w()I")
    public synchronized int method1124() {
        return 0;
    }

    @ObfuscatedName("gb.m([III)V")
    public synchronized void method1100(int[] arg0, int arg1, int arg2) {
        if (this.field2966.method3296()) {
            int var4 = this.field2947 * this.field2966.field2923 / Statics.field1191;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2970;
                if (this.field2945 - var5 >= 0L) {
                    this.field2970 = var5;
                    break;
                }
                int var7 = (int) ((this.field2945 - this.field2970 + (long) var4 - 1L) / (long) var4);
                this.field2970 += (long) var4 * (long) var7;
                this.field2972.method1100(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method3402();
            } while (this.field2966.method3296());
        }
        this.field2972.method1100(arg0, arg1, arg2);
    }

    @ObfuscatedName("gb.y(I)V")
    public synchronized void method1109(int arg0) {
        if (this.field2966.method3296()) {
            int var2 = this.field2947 * this.field2966.field2923 / Statics.field1191;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2970;
                if (this.field2945 - var3 >= 0L) {
                    this.field2970 = var3;
                    break;
                }
                int var5 = (int) ((this.field2945 - this.field2970 + (long) var2 - 1L) / (long) var2);
                this.field2970 += (long) var2 * (long) var5;
                this.field2972.method1109(var5);
                arg0 -= var5;
                this.method3402();
            } while (this.field2966.method3296());
        }
        this.field2972.method1109(arg0);
    }

    @ObfuscatedName("gb.ah(I)V")
    public void method3402() {
        int var1 = this.field2969;
        int var2 = this.field2952;
        long var3 = this.field2945;
        while (this.field2952 == var2) {
            while (this.field2966.field2926[var1] == var2) {
                this.field2966.method3305(var1);
                int var5 = this.field2966.method3302(var1);
                if (var5 == 1) {
                    this.field2966.method3300();
                    this.field2966.method3299(var1);
                    if (this.field2966.method3311()) {
                        if (!this.field2967 || var2 == 0) {
                            this.method3368();
                            this.field2966.method3295();
                            return;
                        }
                        this.field2966.method3337(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method3444(var5);
                }
                this.field2966.method3301(var1);
                this.field2966.method3299(var1);
            }
            var1 = this.field2966.method3306();
            var2 = this.field2966.field2926[var1];
            var3 = this.field2966.method3319(var2);
        }
        this.field2969 = var1;
        this.field2952 = var2;
        this.field2945 = var3;
    }

    @ObfuscatedName("gb.be(Lgf;I)Z")
    public boolean method3455(class187 arg0) {
        if (arg0.field3009 != null) {
            return false;
        }
        if (arg0.field3000 >= 0) {
            arg0.method3646();
            if (arg0.field2995 > 0 && this.field2960[arg0.field2992][arg0.field2995] == arg0) {
                this.field2960[arg0.field2992][arg0.field2995] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("gb.bb(Lgf;[IIII)Z")
    public boolean method3389(class187 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field3010 = Statics.field1191 / 100;
        if (arg0.field3000 >= 0 && arg0.field3009 == null || arg0.field3009.method1271()) {
            arg0.method3472();
            arg0.method3646();
            if (arg0.field2995 > 0 && this.field2960[arg0.field2992][arg0.field2995] == arg0) {
                this.field2960[arg0.field2992][arg0.field2995] = null;
            }
            return true;
        }
        int var5 = arg0.field3008;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2956[arg0.field2992] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field3008 = var6;
        }
        arg0.field3009.method1387(this.method3382(arg0));
        class185 var7 = arg0.field3011;
        boolean var8 = false;
        arg0.field3007++;
        arg0.field3003 += var7.field2975;
        double var9 = (double) ((arg0.field2996 - 60 << 8) + (arg0.field3008 * arg0.field2994 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2976 > 0) {
            if (var7.field2979 > 0) {
                arg0.field3002 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2979 * var9) + 0.5D);
            } else {
                arg0.field3002 += 128;
            }
        }
        if (var7.field2981 != null) {
            if (var7.field2977 > 0) {
                arg0.field2993 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2977 * var9) + 0.5D);
            } else {
                arg0.field2993 += 128;
            }
            while (arg0.field3004 < var7.field2981.length - 2 && arg0.field2993 > (var7.field2981[arg0.field3004 + 2] & 0xFF) << 8) {
                arg0.field3004 += 2;
            }
            if (arg0.field3004 == var7.field2981.length - 2 && var7.field2981[arg0.field3004 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field3000 >= 0 && var7.field2982 != null && (this.field2958[arg0.field2992] & 0x1) == 0 && (arg0.field2995 < 0 || this.field2960[arg0.field2992][arg0.field2995] != arg0)) {
            if (var7.field2978 > 0) {
                arg0.field3000 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2978 * var9) + 0.5D);
            } else {
                arg0.field3000 += 128;
            }
            while (arg0.field3006 < var7.field2982.length - 2 && arg0.field3000 > (var7.field2982[arg0.field3006 + 2] & 0xFF) << 8) {
                arg0.field3006 += 2;
            }
            if (arg0.field3006 == var7.field2982.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field3009.method1267(arg0.field3010, this.method3383(arg0), this.method3384(arg0));
            return false;
        }
        arg0.field3009.method1330(arg0.field3010);
        if (arg1 == null) {
            arg0.field3009.method1109(arg3);
        } else {
            arg0.field3009.method1100(arg1, arg2, arg3);
        }
        if (arg0.field3009.method1272()) {
            this.field2972.field2987.method1092(arg0.field3009);
        }
        arg0.method3472();
        if (arg0.field3000 >= 0) {
            arg0.method3646();
            if (arg0.field2995 > 0 && this.field2960[arg0.field2992][arg0.field2995] == arg0) {
                this.field2960[arg0.field2992][arg0.field2995] = null;
            }
        }
        return true;
    }
}
