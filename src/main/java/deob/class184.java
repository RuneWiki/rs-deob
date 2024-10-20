package deob;

@ObfuscatedName("gd")
public class class184 extends class67 {

    @ObfuscatedName("gd.n")
    public class196 field2968 = new class196(128);

    @ObfuscatedName("gd.q")
    public int field2980 = 256;

    @ObfuscatedName("gd.c")
    public int field2956 = 1000000;

    @ObfuscatedName("gd.l")
    public int[] field2957 = new int[16];

    @ObfuscatedName("gd.r")
    public int[] field2958 = new int[16];

    @ObfuscatedName("gd.u")
    public int[] field2954 = new int[16];

    @ObfuscatedName("gd.j")
    public int[] field2978 = new int[16];

    @ObfuscatedName("gd.y")
    public int[] field2961 = new int[16];

    @ObfuscatedName("gd.o")
    public int[] field2959 = new int[16];

    @ObfuscatedName("gd.h")
    public int[] field2963 = new int[16];

    @ObfuscatedName("gd.e")
    public int[] field2971 = new int[16];

    @ObfuscatedName("gd.v")
    public int[] field2962 = new int[16];

    @ObfuscatedName("gd.d")
    public int[] field2965 = new int[16];

    @ObfuscatedName("gd.a")
    public int[] field2967 = new int[16];

    @ObfuscatedName("gd.t")
    public int[] field2960 = new int[16];

    @ObfuscatedName("gd.k")
    public int[] field2969 = new int[16];

    @ObfuscatedName("gd.f")
    public int[] field2970 = new int[16];

    @ObfuscatedName("gd.g")
    public int[] field2977 = new int[16];

    @ObfuscatedName("gd.i")
    public class187[][] field2972 = new class187[16][128];

    @ObfuscatedName("gd.ah")
    public class187[][] field2973 = new class187[16][128];

    @ObfuscatedName("gd.ag")
    public class182 field2974 = new class182();

    @ObfuscatedName("gd.ac")
    public boolean field2975;

    @ObfuscatedName("gd.al")
    public int field2964;

    @ObfuscatedName("gd.aj")
    public int field2955;

    @ObfuscatedName("gd.at")
    public long field2966;

    @ObfuscatedName("gd.ap")
    public long field2979;

    @ObfuscatedName("gd.aa")
    public class186 field2976 = new class186(this);

    public class184() {
        this.method3363();
    }

    @ObfuscatedName("gd.n(II)V")
    public synchronized void method3374(int arg0) {
        this.field2980 = arg0;
    }

    @ObfuscatedName("gd.q(B)I")
    public int method3359() {
        return this.field2980;
    }

    @ObfuscatedName("gd.c(Lfv;Lfm;Lbg;II)Z")
    public synchronized boolean method3371(class180 arg0, class167 arg1, class60 arg2, int arg3) {
        arg0.method3260();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class197 var7 = (class197) arg0.field2918.method3517(); var7 != null; var7 = (class197) arg0.field2918.method3520()) {
            int var8 = (int) var7.field3112;
            class181 var9 = (class181) this.field2968.method3518((long) var8);
            if (var9 == null) {
                byte[] var10 = arg1.method3062(var8);
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
                this.field2968.method3524(var11, (long) var8);
            }
            if (!var9.method3269(arg2, var7.field3090, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method3262();
        }
        return var5;
    }

    @ObfuscatedName("gd.l(I)V")
    public synchronized void method3346() {
        for (class181 var1 = (class181) this.field2968.method3517(); var1 != null; var1 = (class181) this.field2968.method3520()) {
            var1.method3270();
        }
    }

    @ObfuscatedName("gd.r(I)V")
    public synchronized void method3347() {
        for (class181 var1 = (class181) this.field2968.method3517(); var1 != null; var1 = (class181) this.field2968.method3520()) {
            var1.method3651();
        }
    }

    @ObfuscatedName("gd.o(Lfv;ZI)V")
    public synchronized void method3348(class180 arg0, boolean arg1) {
        this.method3349();
        this.field2974.method3279(arg0.field2917);
        this.field2975 = arg1;
        this.field2966 = 0L;
        int var3 = this.field2974.method3303();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2974.method3282(var4);
            this.field2974.method3285(var4);
            this.field2974.method3294(var4);
        }
        this.field2964 = this.field2974.method3283();
        this.field2955 = this.field2974.field2940[this.field2964];
        this.field2979 = this.field2974.method3289(this.field2955);
    }

    @ObfuscatedName("gd.e(B)V")
    public synchronized void method3349() {
        this.field2974.method3287();
        this.method3363();
    }

    @ObfuscatedName("gd.v(I)Z")
    public synchronized boolean method3350() {
        return this.field2974.method3286();
    }

    @ObfuscatedName("gd.p(III)V")
    public synchronized void method3401(int arg0, int arg1) {
        this.method3352(arg0, arg1);
    }

    @ObfuscatedName("gd.m(IIB)V")
    public void method3352(int arg0, int arg1) {
        this.field2978[arg0] = arg1;
        this.field2959[arg0] = arg1 & 0xFFFFFF80;
        this.method3353(arg0, arg1);
    }

    @ObfuscatedName("gd.b(III)V")
    public void method3353(int arg0, int arg1) {
        if (this.field2961[arg0] != arg1) {
            this.field2961[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2973[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("gd.s(IIII)V")
    public void method3354(int arg0, int arg1, int arg2) {
        this.method3356(arg0, arg1, 64);
        if ((this.field2965[arg0] & 0x2) != 0) {
            for (class187 var4 = (class187) this.field2976.field2993.method3570(); var4 != null; var4 = (class187) this.field2976.field2993.method3551()) {
                if (var4.field3016 == arg0 && var4.field3013 < 0) {
                    this.field2972[arg0][var4.field3006] = null;
                    this.field2972[arg0][arg1] = var4;
                    int var5 = (var4.field3008 * var4.field2999 >> 12) + var4.field3007;
                    var4.field3007 += arg1 - var4.field3006 << 8;
                    var4.field3008 = var5 - var4.field3007;
                    var4.field2999 = 4096;
                    var4.field3006 = arg1;
                    return;
                }
            }
        }
        class181 var6 = (class181) this.field2968.method3518((long) this.field2961[arg0]);
        if (var6 == null) {
            return;
        }
        class63 var7 = var6.field2920[arg1];
        if (var7 == null) {
            return;
        }
        class187 var8 = new class187();
        var8.field3016 = arg0;
        var8.field3004 = var6;
        var8.field3001 = var7;
        var8.field3002 = var6.field2924[arg1];
        var8.field3003 = var6.field2929[arg1];
        var8.field3006 = arg1;
        var8.field3005 = var6.field2923 * arg2 * arg2 * var6.field2922[arg1] + 1024 >> 11;
        var8.field3000 = var6.field2919[arg1] & 0xFF;
        var8.field3007 = (arg1 << 8) - (var6.field2921[arg1] & 0x7FFF);
        var8.field3010 = 0;
        var8.field3012 = 0;
        var8.field3015 = 0;
        var8.field3013 = -1;
        var8.field3014 = 0;
        if (this.field2969[arg0] == 0) {
            var8.field3017 = class65.method1286(var7, this.method3408(var8), this.method3373(var8), this.method3368(var8));
        } else {
            var8.field3017 = class65.method1286(var7, this.method3408(var8), 0, this.method3368(var8));
            this.method3417(var8, var6.field2921[arg1] < 0);
        }
        if (var6.field2921[arg1] < 0) {
            var8.field3017.method1310(-1);
        }
        if (var8.field3003 >= 0) {
            class187 var9 = this.field2973[arg0][var8.field3003];
            if (var9 != null && var9.field3013 < 0) {
                this.field2972[arg0][var9.field3006] = null;
                var9.field3013 = 0;
            }
            this.field2973[arg0][var8.field3003] = var8;
        }
        this.field2976.field2993.method3544(var8);
        this.field2972[arg0][arg1] = var8;
    }

    @ObfuscatedName("gd.x(Lgn;ZB)V")
    public void method3417(class187 arg0, boolean arg1) {
        int var3 = arg0.field3001.field1224.length;
        int var5;
        if (arg1 && arg0.field3001.field1225) {
            int var4 = var3 + var3 - arg0.field3001.field1227;
            var5 = (int) ((long) this.field2969[arg0.field3016] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field3017.method1294(true);
            }
        } else {
            var5 = (int) ((long) this.field2969[arg0.field3016] * (long) var3 >> 6);
        }
        arg0.field3017.method1329(var5);
    }

    @ObfuscatedName("gd.z(IIIB)V")
    public void method3356(int arg0, int arg1, int arg2) {
        class187 var4 = this.field2972[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2972[arg0][arg1] = null;
        if ((this.field2965[arg0] & 0x2) == 0) {
            var4.field3013 = 0;
            return;
        }
        for (class187 var5 = (class187) this.field2976.field2993.method3549(); var5 != null; var5 = (class187) this.field2976.field2993.method3550()) {
            if (var4.field3016 == var5.field3016 && var5.field3013 < 0 && var4 != var5) {
                var4.field3013 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("gd.d(IIIB)V")
    public void method3343(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("gd.a(IIB)V")
    public void method3358(int arg0, int arg1) {
    }

    @ObfuscatedName("gd.t(IIB)V")
    public void method3377(int arg0, int arg1) {
        this.field2963[arg0] = arg1;
    }

    @ObfuscatedName("gd.k(II)V")
    public void method3360(int arg0) {
        for (class187 var2 = (class187) this.field2976.field2993.method3549(); var2 != null; var2 = (class187) this.field2976.field2993.method3550()) {
            if (arg0 < 0 || var2.field3016 == arg0) {
                if (var2.field3017 != null) {
                    var2.field3017.method1298(Statics.field2648 / 100);
                    if (var2.field3017.method1302()) {
                        this.field2976.field2997.method1132(var2.field3017);
                    }
                    var2.method3465();
                }
                if (var2.field3013 < 0) {
                    this.field2972[var2.field3016][var2.field3006] = null;
                }
                var2.method3651();
            }
        }
    }

    @ObfuscatedName("gd.f(II)V")
    public void method3361(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method3361(var2);
            }
            return;
        }
        this.field2957[arg0] = 12800;
        this.field2958[arg0] = 8192;
        this.field2954[arg0] = 16383;
        this.field2963[arg0] = 8192;
        this.field2971[arg0] = 0;
        this.field2962[arg0] = 8192;
        this.method3364(arg0);
        this.method3365(arg0);
        this.field2965[arg0] = 0;
        this.field2967[arg0] = 32767;
        this.field2960[arg0] = 256;
        this.field2969[arg0] = 0;
        this.method3422(arg0, 8192);
    }

    @ObfuscatedName("gd.g(IS)V")
    public void method3362(int arg0) {
        for (class187 var2 = (class187) this.field2976.field2993.method3549(); var2 != null; var2 = (class187) this.field2976.field2993.method3550()) {
            if ((arg0 < 0 || var2.field3016 == arg0) && var2.field3013 < 0) {
                this.field2972[var2.field3016][var2.field3006] = null;
                var2.field3013 = 0;
            }
        }
    }

    @ObfuscatedName("gd.i(I)V")
    public void method3363() {
        this.method3360(-1);
        this.method3361(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2961[var1] = this.field2978[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2959[var2] = this.field2978[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("gd.ah(II)V")
    public void method3364(int arg0) {
        if ((this.field2965[arg0] & 0x2) == 0) {
            return;
        }
        for (class187 var2 = (class187) this.field2976.field2993.method3549(); var2 != null; var2 = (class187) this.field2976.field2993.method3550()) {
            if (var2.field3016 == arg0 && this.field2972[arg0][var2.field3006] == null && var2.field3013 < 0) {
                var2.field3013 = 0;
            }
        }
    }

    @ObfuscatedName("gd.ag(II)V")
    public void method3365(int arg0) {
        if ((this.field2965[arg0] & 0x4) == 0) {
            return;
        }
        for (class187 var2 = (class187) this.field2976.field2993.method3549(); var2 != null; var2 = (class187) this.field2976.field2993.method3550()) {
            if (var2.field3016 == arg0) {
                var2.field3020 = 0;
            }
        }
    }

    @ObfuscatedName("gd.ai(II)V")
    public void method3446(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method3356(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method3354(var6, var7, var8);
            } else {
                this.method3356(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method3343(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2959[var12] = (var14 << 14) + (this.field2959[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2959[var12] = (var14 << 7) + (this.field2959[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2971[var12] = (var14 << 7) + (this.field2971[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2971[var12] = (this.field2971[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2962[var12] = (var14 << 7) + (this.field2962[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2962[var12] = (this.field2962[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2957[var12] = (var14 << 7) + (this.field2957[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2957[var12] = (this.field2957[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2958[var12] = (var14 << 7) + (this.field2958[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2958[var12] = (this.field2958[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2954[var12] = (var14 << 7) + (this.field2954[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2954[var12] = (this.field2954[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field2965[var12] |= 0x1;
                } else {
                    this.field2965[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2965[var12] |= 0x2;
                } else {
                    this.method3364(var12);
                    this.field2965[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2967[var12] = (var14 << 7) + (this.field2967[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2967[var12] = (this.field2967[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2967[var12] = (var14 << 7) + (this.field2967[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2967[var12] = (this.field2967[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method3360(var12);
            }
            if (var13 == 121) {
                this.method3361(var12);
            }
            if (var13 == 123) {
                this.method3362(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2967[var12];
                if (var15 == 16384) {
                    this.field2960[var12] = (var14 << 7) + (this.field2960[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2967[var12];
                if (var16 == 16384) {
                    this.field2960[var12] = (this.field2960[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2969[var12] = (var14 << 7) + (this.field2969[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2969[var12] = (this.field2969[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2965[var12] |= 0x4;
                } else {
                    this.method3365(var12);
                    this.field2965[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method3422(var12, (var14 << 7) + (this.field2970[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method3422(var12, (this.field2970[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method3353(var17, this.field2959[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method3358(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 9 & 0x3F80) + (arg0 >> 8 & 0x7F);
            this.method3377(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method3363();
            }
        }
    }

    @ObfuscatedName("gd.az(IIB)V")
    public void method3422(int arg0, int arg1) {
        this.field2970[arg0] = arg1;
        this.field2977[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("gd.ao(Lgn;I)I")
    public int method3408(class187 arg0) {
        int var2 = (arg0.field3008 * arg0.field2999 >> 12) + arg0.field3007;
        int var3 = ((this.field2963[arg0.field3016] - 8192) * this.field2960[arg0.field3016] >> 12) + var2;
        class185 var4 = arg0.field3002;
        if (var4.field2985 > 0 && (var4.field2982 > 0 || this.field2971[arg0.field3016] > 0)) {
            int var5 = var4.field2982 << 2;
            int var6 = var4.field2990 << 1;
            if (arg0.field3011 < var6) {
                var5 = arg0.field3011 * var5 / var6;
            }
            int var7 = (this.field2971[arg0.field3016] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field3009 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field3001.field1223 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field2648 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("gd.ae(Lgn;I)I")
    public int method3373(class187 arg0) {
        class185 var2 = arg0.field3002;
        int var3 = this.field2957[arg0.field3016] * this.field2954[arg0.field3016] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field3005 * var4 + 16384 >> 15;
        int var6 = this.field2980 * var5 + 128 >> 8;
        if (var2.field2984 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field3010 * 1.953125E-5D * (double) var2.field2984) + 0.5D);
        }
        if (var2.field2988 != null) {
            int var7 = arg0.field3012;
            int var8 = var2.field2988[arg0.field3015 + 1];
            if (arg0.field3015 < var2.field2988.length - 2) {
                int var9 = (var2.field2988[arg0.field3015] & 0xFF) << 8;
                int var10 = (var2.field2988[arg0.field3015 + 2] & 0xFF) << 8;
                var8 += (var2.field2988[arg0.field3015 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field3013 > 0 && var2.field2989 != null) {
            int var11 = arg0.field3013;
            int var12 = var2.field2989[arg0.field3014 + 1];
            if (arg0.field3014 < var2.field2989.length - 2) {
                int var13 = (var2.field2989[arg0.field3014] & 0xFF) << 8;
                int var14 = (var2.field2989[arg0.field3014 + 2] & 0xFF) << 8;
                var12 += (var2.field2989[arg0.field3014 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("gd.aw(Lgn;B)I")
    public int method3368(class187 arg0) {
        int var2 = this.field2958[arg0.field3016];
        return var2 < 8192 ? arg0.field3000 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field3000) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("gd.u()Lbu;")
    public synchronized class67 method1146() {
        return this.field2976;
    }

    @ObfuscatedName("gd.j()Lbu;")
    public synchronized class67 method1138() {
        return null;
    }

    @ObfuscatedName("gd.w()I")
    public synchronized int method1139() {
        return 0;
    }

    @ObfuscatedName("gd.y([III)V")
    public synchronized void method1140(int[] arg0, int arg1, int arg2) {
        if (this.field2974.method3286()) {
            int var4 = this.field2956 * this.field2974.field2935 / Statics.field2648;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2966;
                if (this.field2979 - var5 >= 0L) {
                    this.field2966 = var5;
                    break;
                }
                int var7 = (int) ((this.field2979 - this.field2966 + (long) var4 - 1L) / (long) var4);
                this.field2966 += (long) var4 * (long) var7;
                this.field2976.method1140(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method3372();
            } while (this.field2974.method3286());
        }
        this.field2976.method1140(arg0, arg1, arg2);
    }

    @ObfuscatedName("gd.h(I)V")
    public synchronized void method1142(int arg0) {
        if (this.field2974.method3286()) {
            int var2 = this.field2956 * this.field2974.field2935 / Statics.field2648;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2966;
                if (this.field2979 - var3 >= 0L) {
                    this.field2966 = var3;
                    break;
                }
                int var5 = (int) ((this.field2979 - this.field2966 + (long) var2 - 1L) / (long) var2);
                this.field2966 += (long) var2 * (long) var5;
                this.field2976.method1142(var5);
                arg0 -= var5;
                this.method3372();
            } while (this.field2974.method3286());
        }
        this.field2976.method1142(arg0);
    }

    @ObfuscatedName("gd.ay(B)V")
    public void method3372() {
        int var1 = this.field2964;
        int var2 = this.field2955;
        long var3 = this.field2979;
        while (this.field2955 == var2) {
            while (this.field2974.field2940[var1] == var2) {
                this.field2974.method3282(var1);
                int var5 = this.field2974.method3315(var1);
                if (var5 == 1) {
                    this.field2974.method3284();
                    this.field2974.method3294(var1);
                    if (this.field2974.method3291()) {
                        if (!this.field2975 || var2 == 0) {
                            this.method3363();
                            this.field2974.method3287();
                            return;
                        }
                        this.field2974.method3296(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method3446(var5);
                }
                this.field2974.method3285(var1);
                this.field2974.method3294(var1);
            }
            var1 = this.field2974.method3283();
            var2 = this.field2974.field2940[var1];
            var3 = this.field2974.method3289(var2);
        }
        this.field2964 = var1;
        this.field2955 = var2;
        this.field2979 = var3;
    }

    @ObfuscatedName("gd.ab(Lgn;I)Z")
    public boolean method3440(class187 arg0) {
        if (arg0.field3017 != null) {
            return false;
        }
        if (arg0.field3013 >= 0) {
            arg0.method3651();
            if (arg0.field3003 > 0 && this.field2973[arg0.field3016][arg0.field3003] == arg0) {
                this.field2973[arg0.field3016][arg0.field3003] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("gd.ar(Lgn;[IIIB)Z")
    public boolean method3413(class187 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field3018 = Statics.field2648 / 100;
        if (arg0.field3013 >= 0 && arg0.field3017 == null || arg0.field3017.method1301()) {
            arg0.method3465();
            arg0.method3651();
            if (arg0.field3003 > 0 && this.field2973[arg0.field3016][arg0.field3003] == arg0) {
                this.field2973[arg0.field3016][arg0.field3003] = null;
            }
            return true;
        }
        int var5 = arg0.field2999;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2962[arg0.field3016] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field2999 = var6;
        }
        arg0.field3017.method1299(this.method3408(arg0));
        class185 var7 = arg0.field3002;
        boolean var8 = false;
        arg0.field3011++;
        arg0.field3009 += var7.field2985;
        double var9 = (double) ((arg0.field3006 - 60 << 8) + (arg0.field3008 * arg0.field2999 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2984 > 0) {
            if (var7.field2987 > 0) {
                arg0.field3010 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2987 * var9) + 0.5D);
            } else {
                arg0.field3010 += 128;
            }
        }
        if (var7.field2988 != null) {
            if (var7.field2986 > 0) {
                arg0.field3012 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2986 * var9) + 0.5D);
            } else {
                arg0.field3012 += 128;
            }
            while (arg0.field3015 < var7.field2988.length - 2 && arg0.field3012 > (var7.field2988[arg0.field3015 + 2] & 0xFF) << 8) {
                arg0.field3015 += 2;
            }
            if (arg0.field3015 == var7.field2988.length - 2 && var7.field2988[arg0.field3015 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field3013 >= 0 && var7.field2989 != null && (this.field2965[arg0.field3016] & 0x1) == 0 && (arg0.field3003 < 0 || this.field2973[arg0.field3016][arg0.field3003] != arg0)) {
            if (var7.field2983 > 0) {
                arg0.field3013 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2983 * var9) + 0.5D);
            } else {
                arg0.field3013 += 128;
            }
            while (arg0.field3014 < var7.field2989.length - 2 && arg0.field3013 > (var7.field2989[arg0.field3014 + 2] & 0xFF) << 8) {
                arg0.field3014 += 2;
            }
            if (arg0.field3014 == var7.field2989.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field3017.method1338(arg0.field3018, this.method3373(arg0), this.method3368(arg0));
            return false;
        }
        arg0.field3017.method1298(arg0.field3018);
        if (arg1 == null) {
            arg0.field3017.method1142(arg3);
        } else {
            arg0.field3017.method1140(arg1, arg2, arg3);
        }
        if (arg0.field3017.method1302()) {
            this.field2976.field2997.method1132(arg0.field3017);
        }
        arg0.method3465();
        if (arg0.field3013 >= 0) {
            arg0.method3651();
            if (arg0.field3003 > 0 && this.field2973[arg0.field3016][arg0.field3003] == arg0) {
                this.field2973[arg0.field3016][arg0.field3003] = null;
            }
        }
        return true;
    }
}
