package deob;

@ObfuscatedName("gh")
public class class184 extends class67 {

    @ObfuscatedName("gh.z")
    public class196 field2961 = new class196(128);

    @ObfuscatedName("gh.q")
    public int field2960 = 256;

    @ObfuscatedName("gh.k")
    public int field2951 = 1000000;

    @ObfuscatedName("gh.f")
    public int[] field2964 = new int[16];

    @ObfuscatedName("gh.d")
    public int[] field2953 = new int[16];

    @ObfuscatedName("gh.l")
    public int[] field2954 = new int[16];

    @ObfuscatedName("gh.r")
    public int[] field2955 = new int[16];

    @ObfuscatedName("gh.g")
    public int[] field2956 = new int[16];

    @ObfuscatedName("gh.h")
    public int[] field2957 = new int[16];

    @ObfuscatedName("gh.n")
    public int[] field2966 = new int[16];

    @ObfuscatedName("gh.j")
    public int[] field2950 = new int[16];

    @ObfuscatedName("gh.a")
    public int[] field2949 = new int[16];

    @ObfuscatedName("gh.e")
    public int[] field2963 = new int[16];

    @ObfuscatedName("gh.m")
    public int[] field2968 = new int[16];

    @ObfuscatedName("gh.s")
    public int[] field2962 = new int[16];

    @ObfuscatedName("gh.x")
    public int[] field2952 = new int[16];

    @ObfuscatedName("gh.y")
    public int[] field2965 = new int[16];

    @ObfuscatedName("gh.w")
    public int[] field2959 = new int[16];

    @ObfuscatedName("gh.o")
    public class187[][] field2967 = new class187[16][128];

    @ObfuscatedName("gh.aw")
    public class187[][] field2958 = new class187[16][128];

    @ObfuscatedName("gh.an")
    public class182 field2969 = new class182();

    @ObfuscatedName("gh.ab")
    public boolean field2970;

    @ObfuscatedName("gh.al")
    public int field2971;

    @ObfuscatedName("gh.ay")
    public int field2972;

    @ObfuscatedName("gh.aq")
    public long field2973;

    @ObfuscatedName("gh.ac")
    public long field2974;

    @ObfuscatedName("gh.ak")
    public class186 field2975 = new class186(this);

    public class184() {
        this.method3315();
    }

    @ObfuscatedName("gh.z(II)V")
    public synchronized void method3374(int arg0) {
        this.field2960 = arg0;
    }

    @ObfuscatedName("gh.q(B)I")
    public int method3299() {
        return this.field2960;
    }

    @ObfuscatedName("gh.k(Lfx;Lfl;Lbb;II)Z")
    public synchronized boolean method3307(class180 arg0, class167 arg1, class60 arg2, int arg3) {
        arg0.method3214();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class197 var7 = (class197) arg0.field2914.method3464(); var7 != null; var7 = (class197) arg0.field2914.method3465()) {
            int var8 = (int) var7.field3102;
            class181 var9 = (class181) this.field2961.method3462((long) var8);
            if (var9 == null) {
                byte[] var10 = arg1.method3060(var8);
                class181 var11;
                if (var10 == null) {
                    var11 = null;
                } else {
                    var11 = new class181(var10);
                }
                var9 = var11;
                if (var11 == null) {
                    var5 = false;
                    continue;
                }
                this.field2961.method3470(var11, (long) var8);
            }
            if (!var9.method3222(arg2, var7.field3081, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method3215();
        }
        return var5;
    }

    @ObfuscatedName("gh.f(I)V")
    public synchronized void method3300() {
        for (class181 var1 = (class181) this.field2961.method3464(); var1 != null; var1 = (class181) this.field2961.method3465()) {
            var1.method3221();
        }
    }

    @ObfuscatedName("gh.d(I)V")
    public synchronized void method3391() {
        for (class181 var1 = (class181) this.field2961.method3464(); var1 != null; var1 = (class181) this.field2961.method3465()) {
            var1.method3583();
        }
    }

    @ObfuscatedName("gh.n(Lfx;ZI)V")
    public synchronized void method3306(class180 arg0, boolean arg1) {
        this.method3302();
        this.field2969.method3231(arg0.field2913);
        this.field2970 = arg1;
        this.field2973 = 0L;
        int var3 = this.field2969.method3234();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2969.method3260(var4);
            this.field2969.method3252(var4);
            this.field2969.method3236(var4);
        }
        this.field2971 = this.field2969.method3242();
        this.field2972 = this.field2969.field2930[this.field2971];
        this.field2974 = this.field2969.method3241(this.field2972);
    }

    @ObfuscatedName("gh.a(I)V")
    public synchronized void method3302() {
        this.field2969.method3256();
        this.method3315();
    }

    @ObfuscatedName("gh.b(B)Z")
    public synchronized boolean method3362() {
        return this.field2969.method3251();
    }

    @ObfuscatedName("gh.c(III)V")
    public synchronized void method3304(int arg0, int arg1) {
        this.method3305(arg0, arg1);
    }

    @ObfuscatedName("gh.v(III)V")
    public void method3305(int arg0, int arg1) {
        this.field2955[arg0] = arg1;
        this.field2957[arg0] = arg1 & 0xFFFFFF80;
        this.method3298(arg0, arg1);
    }

    @ObfuscatedName("gh.p(III)V")
    public void method3298(int arg0, int arg1) {
        if (this.field2956[arg0] != arg1) {
            this.field2956[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2958[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("gh.i(IIII)V")
    public void method3375(int arg0, int arg1, int arg2) {
        this.method3309(arg0, arg1, 64);
        if ((this.field2963[arg0] & 0x2) != 0) {
            for (class187 var4 = (class187) this.field2975.field2990.method3522(); var4 != null; var4 = (class187) this.field2975.field2990.method3499()) {
                if (var4.field3015 == arg0 && var4.field3009 < 0) {
                    this.field2967[arg0][var4.field3000] = null;
                    this.field2967[arg0][arg1] = var4;
                    int var5 = (var4.field3014 * var4.field3002 >> 12) + var4.field3003;
                    var4.field3003 += arg1 - var4.field3000 << 8;
                    var4.field3014 = var5 - var4.field3003;
                    var4.field3002 = 4096;
                    var4.field3000 = arg1;
                    return;
                }
            }
        }
        class181 var6 = (class181) this.field2961.method3462((long) this.field2956[arg0]);
        if (var6 == null) {
            return;
        }
        class63 var7 = var6.field2916[arg1];
        if (var7 == null) {
            return;
        }
        class187 var8 = new class187();
        var8.field3015 = arg0;
        var8.field2996 = var6;
        var8.field2997 = var7;
        var8.field2998 = var6.field2924[arg1];
        var8.field3010 = var6.field2921[arg1];
        var8.field3000 = arg1;
        var8.field2999 = var6.field2919 * arg2 * arg2 * var6.field2920[arg1] + 1024 >> 11;
        var8.field3017 = var6.field2922[arg1] & 0xFF;
        var8.field3003 = (arg1 << 8) - (var6.field2917[arg1] & 0x7FFF);
        var8.field3006 = 0;
        var8.field2995 = 0;
        var8.field3008 = 0;
        var8.field3009 = -1;
        var8.field3005 = 0;
        if (this.field2952[arg0] == 0) {
            var8.field3013 = class65.method1286(var7, this.method3319(var8), this.method3407(var8), this.method3325(var8));
        } else {
            var8.field3013 = class65.method1286(var7, this.method3319(var8), 0, this.method3325(var8));
            this.method3308(var8, var6.field2917[arg1] < 0);
        }
        if (var6.field2917[arg1] < 0) {
            var8.field3013.method1236(-1);
        }
        if (var8.field3010 >= 0) {
            class187 var9 = this.field2958[arg0][var8.field3010];
            if (var9 != null && var9.field3009 < 0) {
                this.field2967[arg0][var9.field3000] = null;
                var9.field3009 = 0;
            }
            this.field2958[arg0][var8.field3010] = var8;
        }
        this.field2975.field2990.method3491(var8);
        this.field2967[arg0][arg1] = var8;
    }

    @ObfuscatedName("gh.t(Lgb;ZB)V")
    public void method3308(class187 arg0, boolean arg1) {
        int var3 = arg0.field2997.field1228.length;
        int var5;
        if (arg1 && arg0.field2997.field1227) {
            int var4 = var3 + var3 - arg0.field2997.field1231;
            var5 = (int) ((long) this.field2952[arg0.field3015] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field3013.method1271(true);
            }
        } else {
            var5 = (int) ((long) this.field2952[arg0.field3015] * (long) var3 >> 6);
        }
        arg0.field3013.method1242(var5);
    }

    @ObfuscatedName("gh.u(IIII)V")
    public void method3309(int arg0, int arg1, int arg2) {
        class187 var4 = this.field2967[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2967[arg0][arg1] = null;
        if ((this.field2963[arg0] & 0x2) == 0) {
            var4.field3009 = 0;
            return;
        }
        for (class187 var5 = (class187) this.field2975.field2990.method3502(); var5 != null; var5 = (class187) this.field2975.field2990.method3489()) {
            if (var4.field3015 == var5.field3015 && var5.field3009 < 0 && var4 != var5) {
                var4.field3009 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("gh.e(IIIB)V")
    public void method3310(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("gh.m(IIB)V")
    public void method3311(int arg0, int arg1) {
    }

    @ObfuscatedName("gh.al(III)V")
    public void method3312(int arg0, int arg1) {
        this.field2966[arg0] = arg1;
    }

    @ObfuscatedName("gh.ay(IB)V")
    public void method3313(int arg0) {
        for (class187 var2 = (class187) this.field2975.field2990.method3502(); var2 != null; var2 = (class187) this.field2975.field2990.method3489()) {
            if (arg0 < 0 || var2.field3015 == arg0) {
                if (var2.field3013 != null) {
                    var2.field3013.method1243(Statics.field1194 / 100);
                    if (var2.field3013.method1250()) {
                        this.field2975.field2989.method1093(var2.field3013);
                    }
                    var2.method3420();
                }
                if (var2.field3009 < 0) {
                    this.field2967[var2.field3015][var2.field3000] = null;
                }
                var2.method3583();
            }
        }
    }

    @ObfuscatedName("gh.aq(IB)V")
    public void method3359(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method3359(var2);
            }
            return;
        }
        this.field2964[arg0] = 12800;
        this.field2953[arg0] = 8192;
        this.field2954[arg0] = 16383;
        this.field2966[arg0] = 8192;
        this.field2950[arg0] = 0;
        this.field2949[arg0] = 8192;
        this.method3316(arg0);
        this.method3317(arg0);
        this.field2963[arg0] = 0;
        this.field2968[arg0] = 32767;
        this.field2962[arg0] = 256;
        this.field2952[arg0] = 0;
        this.method3318(arg0, 8192);
    }

    @ObfuscatedName("gh.au(IB)V")
    public void method3401(int arg0) {
        for (class187 var2 = (class187) this.field2975.field2990.method3502(); var2 != null; var2 = (class187) this.field2975.field2990.method3489()) {
            if ((arg0 < 0 || var2.field3015 == arg0) && var2.field3009 < 0) {
                this.field2967[var2.field3015][var2.field3000] = null;
                var2.field3009 = 0;
            }
        }
    }

    @ObfuscatedName("gh.ad(B)V")
    public void method3315() {
        this.method3313(-1);
        this.method3359(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2956[var1] = this.field2955[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2957[var2] = this.field2955[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("gh.ae(II)V")
    public void method3316(int arg0) {
        if ((this.field2963[arg0] & 0x2) == 0) {
            return;
        }
        for (class187 var2 = (class187) this.field2975.field2990.method3502(); var2 != null; var2 = (class187) this.field2975.field2990.method3489()) {
            if (var2.field3015 == arg0 && this.field2967[arg0][var2.field3000] == null && var2.field3009 < 0) {
                var2.field3009 = 0;
            }
        }
    }

    @ObfuscatedName("gh.ai(II)V")
    public void method3317(int arg0) {
        if ((this.field2963[arg0] & 0x4) == 0) {
            return;
        }
        for (class187 var2 = (class187) this.field2975.field2990.method3502(); var2 != null; var2 = (class187) this.field2975.field2990.method3489()) {
            if (var2.field3015 == arg0) {
                var2.field3004 = 0;
            }
        }
    }

    @ObfuscatedName("gh.at(IB)V")
    public void method3321(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method3309(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method3375(var6, var7, var8);
            } else {
                this.method3309(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method3310(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2957[var12] = (var14 << 14) + (this.field2957[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2957[var12] = (var14 << 7) + (this.field2957[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2950[var12] = (var14 << 7) + (this.field2950[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2950[var12] = (this.field2950[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2949[var12] = (var14 << 7) + (this.field2949[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2949[var12] = (this.field2949[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2964[var12] = (var14 << 7) + (this.field2964[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2964[var12] = (this.field2964[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2953[var12] = (var14 << 7) + (this.field2953[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2953[var12] = (this.field2953[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2954[var12] = (var14 << 7) + (this.field2954[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2954[var12] = (this.field2954[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field2963[var12] |= 0x1;
                } else {
                    this.field2963[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2963[var12] |= 0x2;
                } else {
                    this.method3316(var12);
                    this.field2963[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2968[var12] = (var14 << 7) + (this.field2968[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2968[var12] = (this.field2968[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2968[var12] = (var14 << 7) + (this.field2968[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2968[var12] = (this.field2968[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method3313(var12);
            }
            if (var13 == 121) {
                this.method3359(var12);
            }
            if (var13 == 123) {
                this.method3401(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2968[var12];
                if (var15 == 16384) {
                    this.field2962[var12] = (var14 << 7) + (this.field2962[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2968[var12];
                if (var16 == 16384) {
                    this.field2962[var12] = (this.field2962[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2952[var12] = (var14 << 7) + (this.field2952[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2952[var12] = (this.field2952[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2963[var12] |= 0x4;
                } else {
                    this.method3317(var12);
                    this.field2963[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method3318(var12, (var14 << 7) + (this.field2965[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method3318(var12, (this.field2965[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method3298(var17, this.field2957[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method3311(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
            this.method3312(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method3315();
            }
        }
    }

    @ObfuscatedName("gh.ah(IIB)V")
    public void method3318(int arg0, int arg1) {
        this.field2965[arg0] = arg1;
        this.field2959[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("gh.ao(Lgb;B)I")
    public int method3319(class187 arg0) {
        int var2 = (arg0.field3014 * arg0.field3002 >> 12) + arg0.field3003;
        int var3 = ((this.field2966[arg0.field3015] - 8192) * this.field2962[arg0.field3015] >> 12) + var2;
        class185 var4 = arg0.field2998;
        if (var4.field2981 > 0 && (var4.field2984 > 0 || this.field2950[arg0.field3015] > 0)) {
            int var5 = var4.field2984 << 2;
            int var6 = var4.field2978 << 1;
            if (arg0.field3011 < var6) {
                var5 = arg0.field3011 * var5 / var6;
            }
            int var7 = (this.field2950[arg0.field3015] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field3012 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field2997.field1229 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field1194 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("gh.aa(Lgb;I)I")
    public int method3407(class187 arg0) {
        class185 var2 = arg0.field2998;
        int var3 = this.field2964[arg0.field3015] * this.field2954[arg0.field3015] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field2999 * var4 + 16384 >> 15;
        int var6 = this.field2960 * var5 + 128 >> 8;
        if (var2.field2980 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field3006 * 1.953125E-5D * (double) var2.field2980) + 0.5D);
        }
        if (var2.field2983 != null) {
            int var7 = arg0.field2995;
            int var8 = var2.field2983[arg0.field3008 + 1];
            if (arg0.field3008 < var2.field2983.length - 2) {
                int var9 = (var2.field2983[arg0.field3008] & 0xFF) << 8;
                int var10 = (var2.field2983[arg0.field3008 + 2] & 0xFF) << 8;
                var8 += (var2.field2983[arg0.field3008 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field3009 > 0 && var2.field2979 != null) {
            int var11 = arg0.field3009;
            int var12 = var2.field2979[arg0.field3005 + 1];
            if (arg0.field3005 < var2.field2979.length - 2) {
                int var13 = (var2.field2979[arg0.field3005] & 0xFF) << 8;
                int var14 = (var2.field2979[arg0.field3005 + 2] & 0xFF) << 8;
                var12 += (var2.field2979[arg0.field3005 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("gh.ax(Lgb;B)I")
    public int method3325(class187 arg0) {
        int var2 = this.field2953[arg0.field3015];
        return var2 < 8192 ? arg0.field3017 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field3017) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("gh.l()Lbt;")
    public synchronized class67 method1098() {
        return this.field2975;
    }

    @ObfuscatedName("gh.r()Lbt;")
    public synchronized class67 method1103() {
        return null;
    }

    @ObfuscatedName("gh.g()I")
    public synchronized int method1100() {
        return 0;
    }

    @ObfuscatedName("gh.h([III)V")
    public synchronized void method1113(int[] arg0, int arg1, int arg2) {
        if (this.field2969.method3251()) {
            int var4 = this.field2951 * this.field2969.field2927 / Statics.field1194;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2973;
                if (this.field2974 - var5 >= 0L) {
                    this.field2973 = var5;
                    break;
                }
                int var7 = (int) ((this.field2974 - this.field2973 + (long) var4 - 1L) / (long) var4);
                this.field2973 += (long) var4 * (long) var7;
                this.field2975.method1113(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method3322();
            } while (this.field2969.method3251());
        }
        this.field2975.method1113(arg0, arg1, arg2);
    }

    @ObfuscatedName("gh.j(I)V")
    public synchronized void method1123(int arg0) {
        if (this.field2969.method3251()) {
            int var2 = this.field2951 * this.field2969.field2927 / Statics.field1194;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2973;
                if (this.field2974 - var3 >= 0L) {
                    this.field2973 = var3;
                    break;
                }
                int var5 = (int) ((this.field2974 - this.field2973 + (long) var2 - 1L) / (long) var2);
                this.field2973 += (long) var2 * (long) var5;
                this.field2975.method1123(var5);
                arg0 -= var5;
                this.method3322();
            } while (this.field2969.method3251());
        }
        this.field2975.method1123(arg0);
    }

    @ObfuscatedName("gh.as(B)V")
    public void method3322() {
        int var1 = this.field2971;
        int var2 = this.field2972;
        long var3 = this.field2974;
        while (this.field2972 == var2) {
            while (this.field2969.field2930[var1] == var2) {
                this.field2969.method3260(var1);
                int var5 = this.field2969.method3238(var1);
                if (var5 == 1) {
                    this.field2969.method3250();
                    this.field2969.method3236(var1);
                    if (this.field2969.method3243()) {
                        if (!this.field2970 || var2 == 0) {
                            this.method3315();
                            this.field2969.method3256();
                            return;
                        }
                        this.field2969.method3244(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method3321(var5);
                }
                this.field2969.method3252(var1);
                this.field2969.method3236(var1);
            }
            var1 = this.field2969.method3242();
            var2 = this.field2969.field2930[var1];
            var3 = this.field2969.method3241(var2);
        }
        this.field2971 = var1;
        this.field2972 = var2;
        this.field2974 = var3;
    }

    @ObfuscatedName("gh.ar(Lgb;I)Z")
    public boolean method3327(class187 arg0) {
        if (arg0.field3013 != null) {
            return false;
        }
        if (arg0.field3009 >= 0) {
            arg0.method3583();
            if (arg0.field3010 > 0 && this.field2958[arg0.field3015][arg0.field3010] == arg0) {
                this.field2958[arg0.field3015][arg0.field3010] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("gh.ap(Lgb;[IIIB)Z")
    public boolean method3334(class187 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field3001 = Statics.field1194 / 100;
        if (arg0.field3009 >= 0 && arg0.field3013 == null || arg0.field3013.method1319()) {
            arg0.method3420();
            arg0.method3583();
            if (arg0.field3010 > 0 && this.field2958[arg0.field3015][arg0.field3010] == arg0) {
                this.field2958[arg0.field3015][arg0.field3010] = null;
            }
            return true;
        }
        int var5 = arg0.field3002;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2949[arg0.field3015] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field3002 = var6;
        }
        arg0.field3013.method1247(this.method3319(arg0));
        class185 var7 = arg0.field2998;
        boolean var8 = false;
        arg0.field3011++;
        arg0.field3012 += var7.field2981;
        double var9 = (double) ((arg0.field3000 - 60 << 8) + (arg0.field3014 * arg0.field3002 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2980 > 0) {
            if (var7.field2985 > 0) {
                arg0.field3006 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2985 * var9) + 0.5D);
            } else {
                arg0.field3006 += 128;
            }
        }
        if (var7.field2983 != null) {
            if (var7.field2986 > 0) {
                arg0.field2995 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2986 * var9) + 0.5D);
            } else {
                arg0.field2995 += 128;
            }
            while (arg0.field3008 < var7.field2983.length - 2 && arg0.field2995 > (var7.field2983[arg0.field3008 + 2] & 0xFF) << 8) {
                arg0.field3008 += 2;
            }
            if (arg0.field3008 == var7.field2983.length - 2 && var7.field2983[arg0.field3008 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field3009 >= 0 && var7.field2979 != null && (this.field2963[arg0.field3015] & 0x1) == 0 && (arg0.field3010 < 0 || this.field2958[arg0.field3015][arg0.field3010] != arg0)) {
            if (var7.field2982 > 0) {
                arg0.field3009 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2982 * var9) + 0.5D);
            } else {
                arg0.field3009 += 128;
            }
            while (arg0.field3005 < var7.field2979.length - 2 && arg0.field3009 > (var7.field2979[arg0.field3005 + 2] & 0xFF) << 8) {
                arg0.field3005 += 2;
            }
            if (arg0.field3005 == var7.field2979.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field3013.method1244(arg0.field3001, this.method3407(arg0), this.method3325(arg0));
            return false;
        }
        arg0.field3013.method1243(arg0.field3001);
        if (arg1 == null) {
            arg0.field3013.method1123(arg3);
        } else {
            arg0.field3013.method1113(arg1, arg2, arg3);
        }
        if (arg0.field3013.method1250()) {
            this.field2975.field2989.method1093(arg0.field3013);
        }
        arg0.method3420();
        if (arg0.field3009 >= 0) {
            arg0.method3583();
            if (arg0.field3010 > 0 && this.field2958[arg0.field3015][arg0.field3010] == arg0) {
                this.field2958[arg0.field3015][arg0.field3010] = null;
            }
        }
        return true;
    }
}
