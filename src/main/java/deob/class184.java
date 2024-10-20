package deob;

@ObfuscatedName("go")
public class class184 extends class67 {

    @ObfuscatedName("go.d")
    public class196 field2965 = new class196(128);

    @ObfuscatedName("go.p")
    public int field2953 = 256;

    @ObfuscatedName("go.v")
    public int field2954 = 1000000;

    @ObfuscatedName("go.l")
    public int[] field2971 = new int[16];

    @ObfuscatedName("go.y")
    public int[] field2956 = new int[16];

    @ObfuscatedName("go.u")
    public int[] field2957 = new int[16];

    @ObfuscatedName("go.a")
    public int[] field2958 = new int[16];

    @ObfuscatedName("go.e")
    public int[] field2959 = new int[16];

    @ObfuscatedName("go.b")
    public int[] field2952 = new int[16];

    @ObfuscatedName("go.o")
    public int[] field2961 = new int[16];

    @ObfuscatedName("go.m")
    public int[] field2963 = new int[16];

    @ObfuscatedName("go.x")
    public int[] field2976 = new int[16];

    @ObfuscatedName("go.i")
    public int[] field2964 = new int[16];

    @ObfuscatedName("go.q")
    public int[] field2967 = new int[16];

    @ObfuscatedName("go.r")
    public int[] field2966 = new int[16];

    @ObfuscatedName("go.s")
    public int[] field2960 = new int[16];

    @ObfuscatedName("go.g")
    public int[] field2968 = new int[16];

    @ObfuscatedName("go.f")
    public int[] field2969 = new int[16];

    @ObfuscatedName("go.c")
    public class187[][] field2962 = new class187[16][128];

    @ObfuscatedName("go.ae")
    public class187[][] field2970 = new class187[16][128];

    @ObfuscatedName("go.ao")
    public class182 field2972 = new class182();

    @ObfuscatedName("go.ak")
    public boolean field2973;

    @ObfuscatedName("go.ah")
    public int field2974;

    @ObfuscatedName("go.al")
    public int field2975;

    @ObfuscatedName("go.ax")
    public long field2955;

    @ObfuscatedName("go.az")
    public long field2977;

    @ObfuscatedName("go.ad")
    public class186 field2978 = new class186(this);

    public class184() {
        this.method3474();
    }

    @ObfuscatedName("go.d(II)V")
    public synchronized void method3435(int arg0) {
        this.field2953 = arg0;
    }

    @ObfuscatedName("go.p(S)I")
    public int method3436() {
        return this.field2953;
    }

    @ObfuscatedName("go.v(Lfq;Lfn;Lbm;II)Z")
    public synchronized boolean method3437(class180 arg0, class167 arg1, class60 arg2, int arg3) {
        arg0.method3346();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class197 var7 = (class197) arg0.field2915.method3591(); var7 != null; var7 = (class197) arg0.field2915.method3592()) {
            int var8 = (int) var7.field3107;
            class181 var9 = (class181) this.field2965.method3588((long) var8);
            if (var9 == null) {
                byte[] var10 = arg1.method3096(var8);
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
                this.field2965.method3596(var11, (long) var8);
            }
            if (!var9.method3358(arg2, var7.field3085, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method3351();
        }
        return var5;
    }

    @ObfuscatedName("go.l(B)V")
    public synchronized void method3438() {
        for (class181 var1 = (class181) this.field2965.method3591(); var1 != null; var1 = (class181) this.field2965.method3592()) {
            var1.method3356();
        }
    }

    @ObfuscatedName("go.y(B)V")
    public synchronized void method3458() {
        for (class181 var1 = (class181) this.field2965.method3591(); var1 != null; var1 = (class181) this.field2965.method3592()) {
            var1.method3715();
        }
    }

    @ObfuscatedName("go.b(Lfq;ZI)V")
    public synchronized void method3498(class180 arg0, boolean arg1) {
        this.method3516();
        this.field2972.method3362(arg0.field2916);
        this.field2973 = arg1;
        this.field2955 = 0L;
        int var3 = this.field2972.method3365();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2972.method3366(var4);
            this.field2972.method3415(var4);
            this.field2972.method3367(var4);
        }
        this.field2974 = this.field2972.method3373();
        this.field2975 = this.field2972.field2933[this.field2974];
        this.field2977 = this.field2972.method3372(this.field2975);
    }

    @ObfuscatedName("go.m(I)V")
    public synchronized void method3516() {
        this.field2972.method3363();
        this.method3474();
    }

    @ObfuscatedName("go.x(I)Z")
    public synchronized boolean method3441() {
        return this.field2972.method3388();
    }

    @ObfuscatedName("go.k(IIB)V")
    public synchronized void method3442(int arg0, int arg1) {
        this.method3443(arg0, arg1);
    }

    @ObfuscatedName("go.n(IIB)V")
    public void method3443(int arg0, int arg1) {
        this.field2958[arg0] = arg1;
        this.field2952[arg0] = arg1 & 0xFFFFFF80;
        this.method3444(arg0, arg1);
    }

    @ObfuscatedName("go.j(III)V")
    public void method3444(int arg0, int arg1) {
        if (this.field2959[arg0] != arg1) {
            this.field2959[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2970[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("go.t(IIIB)V")
    public void method3486(int arg0, int arg1, int arg2) {
        this.method3447(arg0, arg1, 64);
        if ((this.field2964[arg0] & 0x2) != 0) {
            for (class187 var4 = (class187) this.field2978.field2989.method3614(); var4 != null; var4 = (class187) this.field2978.field2989.method3641()) {
                if (var4.field2997 == arg0 && var4.field2994 < 0) {
                    this.field2962[arg0][var4.field3009] = null;
                    this.field2962[arg0][arg1] = var4;
                    int var5 = (var4.field3004 * var4.field3003 >> 12) + var4.field3002;
                    var4.field3002 += arg1 - var4.field3009 << 8;
                    var4.field3003 = var5 - var4.field3002;
                    var4.field3004 = 4096;
                    var4.field3009 = arg1;
                    return;
                }
            }
        }
        class181 var6 = (class181) this.field2965.method3588((long) this.field2959[arg0]);
        if (var6 == null) {
            return;
        }
        class63 var7 = var6.field2928[arg1];
        if (var7 == null) {
            return;
        }
        class187 var8 = new class187();
        var8.field2997 = arg0;
        var8.field3005 = var6;
        var8.field2996 = var7;
        var8.field2999 = var6.field2922[arg1];
        var8.field2998 = var6.field2923[arg1];
        var8.field3009 = arg1;
        var8.field3000 = var6.field2918 * arg2 * arg2 * var6.field2924[arg1] + 1024 >> 11;
        var8.field3001 = var6.field2921[arg1] & 0xFF;
        var8.field3002 = (arg1 << 8) - (var6.field2919[arg1] & 0x7FFF);
        var8.field3014 = 0;
        var8.field3008 = 0;
        var8.field3007 = 0;
        var8.field2994 = -1;
        var8.field2995 = 0;
        if (this.field2960[arg0] == 0) {
            var8.field3012 = class65.method1255(var7, this.method3459(var8), this.method3446(var8), this.method3461(var8));
        } else {
            var8.field3012 = class65.method1255(var7, this.method3459(var8), 0, this.method3461(var8));
            this.method3452(var8, var6.field2919[arg1] < 0);
        }
        if (var6.field2919[arg1] < 0) {
            var8.field3012.method1259(-1);
        }
        if (var8.field2998 >= 0) {
            class187 var9 = this.field2970[arg0][var8.field2998];
            if (var9 != null && var9.field2994 < 0) {
                this.field2962[arg0][var9.field3009] = null;
                var9.field2994 = 0;
            }
            this.field2970[arg0][var8.field2998] = var8;
        }
        this.field2978.field2989.method3633(var8);
        this.field2962[arg0][arg1] = var8;
    }

    @ObfuscatedName("go.z(Lgk;ZB)V")
    public void method3452(class187 arg0, boolean arg1) {
        int var3 = arg0.field2996.field1236.length;
        int var5;
        if (arg1 && arg0.field2996.field1232) {
            int var4 = var3 + var3 - arg0.field2996.field1234;
            var5 = (int) ((long) this.field2960[arg0.field2997] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field3012.method1266(true);
            }
        } else {
            var5 = (int) ((long) this.field2960[arg0.field2997] * (long) var3 >> 6);
        }
        arg0.field3012.method1265(var5);
    }

    @ObfuscatedName("go.h(IIII)V")
    public void method3447(int arg0, int arg1, int arg2) {
        class187 var4 = this.field2962[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2962[arg0][arg1] = null;
        if ((this.field2964[arg0] & 0x2) == 0) {
            var4.field2994 = 0;
            return;
        }
        for (class187 var5 = (class187) this.field2978.field2989.method3613(); var5 != null; var5 = (class187) this.field2978.field2989.method3615()) {
            if (var4.field2997 == var5.field2997 && var5.field2994 < 0 && var4 != var5) {
                var4.field2994 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("go.i(IIII)V")
    public void method3448(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("go.q(III)V")
    public void method3467(int arg0, int arg1) {
    }

    @ObfuscatedName("go.r(III)V")
    public void method3450(int arg0, int arg1) {
        this.field2961[arg0] = arg1;
    }

    @ObfuscatedName("go.s(II)V")
    public void method3451(int arg0) {
        for (class187 var2 = (class187) this.field2978.field2989.method3613(); var2 != null; var2 = (class187) this.field2978.field2989.method3615()) {
            if (arg0 < 0 || var2.field2997 == arg0) {
                if (var2.field3012 != null) {
                    var2.field3012.method1270(Statics.field1177 / 100);
                    if (var2.field3012.method1274()) {
                        this.field2978.field2990.method1115(var2.field3012);
                    }
                    var2.method3542();
                }
                if (var2.field2994 < 0) {
                    this.field2962[var2.field2997][var2.field3009] = null;
                }
                var2.method3715();
            }
        }
    }

    @ObfuscatedName("go.g(IB)V")
    public void method3434(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method3434(var2);
            }
            return;
        }
        this.field2971[arg0] = 12800;
        this.field2956[arg0] = 8192;
        this.field2957[arg0] = 16383;
        this.field2961[arg0] = 8192;
        this.field2963[arg0] = 0;
        this.field2976[arg0] = 8192;
        this.method3455(arg0);
        this.method3456(arg0);
        this.field2964[arg0] = 0;
        this.field2967[arg0] = 32767;
        this.field2966[arg0] = 256;
        this.field2960[arg0] = 0;
        this.method3493(arg0, 8192);
    }

    @ObfuscatedName("go.az(IS)V")
    public void method3473(int arg0) {
        for (class187 var2 = (class187) this.field2978.field2989.method3613(); var2 != null; var2 = (class187) this.field2978.field2989.method3615()) {
            if ((arg0 < 0 || var2.field2997 == arg0) && var2.field2994 < 0) {
                this.field2962[var2.field2997][var2.field3009] = null;
                var2.field2994 = 0;
            }
        }
    }

    @ObfuscatedName("go.ad(I)V")
    public void method3474() {
        this.method3451(-1);
        this.method3434(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2959[var1] = this.field2958[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2952[var2] = this.field2958[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("go.aw(II)V")
    public void method3455(int arg0) {
        if ((this.field2964[arg0] & 0x2) == 0) {
            return;
        }
        for (class187 var2 = (class187) this.field2978.field2989.method3613(); var2 != null; var2 = (class187) this.field2978.field2989.method3615()) {
            if (var2.field2997 == arg0 && this.field2962[arg0][var2.field3009] == null && var2.field2994 < 0) {
                var2.field2994 = 0;
            }
        }
    }

    @ObfuscatedName("go.as(IB)V")
    public void method3456(int arg0) {
        if ((this.field2964[arg0] & 0x4) == 0) {
            return;
        }
        for (class187 var2 = (class187) this.field2978.field2989.method3613(); var2 != null; var2 = (class187) this.field2978.field2989.method3615()) {
            if (var2.field2997 == arg0) {
                var2.field3006 = 0;
            }
        }
    }

    @ObfuscatedName("go.ar(II)V")
    public void method3457(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method3447(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method3486(var6, var7, var8);
            } else {
                this.method3447(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method3448(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2952[var12] = (var14 << 14) + (this.field2952[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2952[var12] = (var14 << 7) + (this.field2952[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2963[var12] = (var14 << 7) + (this.field2963[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2963[var12] = (this.field2963[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2976[var12] = (var14 << 7) + (this.field2976[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2976[var12] = (this.field2976[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2971[var12] = (var14 << 7) + (this.field2971[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2971[var12] = (this.field2971[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2956[var12] = (var14 << 7) + (this.field2956[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2956[var12] = (this.field2956[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2957[var12] = (var14 << 7) + (this.field2957[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2957[var12] = (this.field2957[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field2964[var12] |= 0x1;
                } else {
                    this.field2964[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2964[var12] |= 0x2;
                } else {
                    this.method3455(var12);
                    this.field2964[var12] &= 0xFFFFFFFD;
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
                this.method3451(var12);
            }
            if (var13 == 121) {
                this.method3434(var12);
            }
            if (var13 == 123) {
                this.method3473(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2967[var12];
                if (var15 == 16384) {
                    this.field2966[var12] = (var14 << 7) + (this.field2966[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2967[var12];
                if (var16 == 16384) {
                    this.field2966[var12] = (this.field2966[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2960[var12] = (var14 << 7) + (this.field2960[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2960[var12] = (this.field2960[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2964[var12] |= 0x4;
                } else {
                    this.method3456(var12);
                    this.field2964[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method3493(var12, (var14 << 7) + (this.field2968[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method3493(var12, (this.field2968[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method3444(var17, this.field2952[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method3467(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 9 & 0x3F80) + (arg0 >> 8 & 0x7F);
            this.method3450(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method3474();
            }
        }
    }

    @ObfuscatedName("go.ac(IIB)V")
    public void method3493(int arg0, int arg1) {
        this.field2968[arg0] = arg1;
        this.field2969[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("go.aq(Lgk;I)I")
    public int method3459(class187 arg0) {
        int var2 = (arg0.field3004 * arg0.field3003 >> 12) + arg0.field3002;
        int var3 = ((this.field2961[arg0.field2997] - 8192) * this.field2966[arg0.field2997] >> 12) + var2;
        class185 var4 = arg0.field2999;
        if (var4.field2988 > 0 && (var4.field2985 > 0 || this.field2963[arg0.field2997] > 0)) {
            int var5 = var4.field2985 << 2;
            int var6 = var4.field2987 << 1;
            if (arg0.field3010 < var6) {
                var5 = arg0.field3010 * var5 / var6;
            }
            int var7 = (this.field2963[arg0.field2997] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field3011 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field2996.field1235 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field1177 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("go.aa(Lgk;B)I")
    public int method3446(class187 arg0) {
        class185 var2 = arg0.field2999;
        int var3 = this.field2971[arg0.field2997] * this.field2957[arg0.field2997] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field3000 * var4 + 16384 >> 15;
        int var6 = this.field2953 * var5 + 128 >> 8;
        if (var2.field2981 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field3014 * 1.953125E-5D * (double) var2.field2981) + 0.5D);
        }
        if (var2.field2980 != null) {
            int var7 = arg0.field3008;
            int var8 = var2.field2980[arg0.field3007 + 1];
            if (arg0.field3007 < var2.field2980.length - 2) {
                int var9 = (var2.field2980[arg0.field3007] & 0xFF) << 8;
                int var10 = (var2.field2980[arg0.field3007 + 2] & 0xFF) << 8;
                var8 += (var2.field2980[arg0.field3007 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field2994 > 0 && var2.field2986 != null) {
            int var11 = arg0.field2994;
            int var12 = var2.field2986[arg0.field2995 + 1];
            if (arg0.field2995 < var2.field2986.length - 2) {
                int var13 = (var2.field2986[arg0.field2995] & 0xFF) << 8;
                int var14 = (var2.field2986[arg0.field2995 + 2] & 0xFF) << 8;
                var12 += (var2.field2986[arg0.field2995 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("go.ab(Lgk;I)I")
    public int method3461(class187 arg0) {
        int var2 = this.field2956[arg0.field2997];
        return var2 < 8192 ? arg0.field3001 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field3001) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("go.w()Lbz;")
    public synchronized class67 method1120() {
        return this.field2978;
    }

    @ObfuscatedName("go.u()Lbz;")
    public synchronized class67 method1121() {
        return null;
    }

    @ObfuscatedName("go.a()I")
    public synchronized int method1122() {
        return 0;
    }

    @ObfuscatedName("go.e([III)V")
    public synchronized void method1123(int[] arg0, int arg1, int arg2) {
        if (this.field2972.method3388()) {
            int var4 = this.field2954 * this.field2972.field2930 / Statics.field1177;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2955;
                if (this.field2977 - var5 >= 0L) {
                    this.field2955 = var5;
                    break;
                }
                int var7 = (int) ((this.field2977 - this.field2955 + (long) var4 - 1L) / (long) var4);
                this.field2955 += (long) var4 * (long) var7;
                this.field2978.method1123(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method3462();
            } while (this.field2972.method3388());
        }
        this.field2978.method1123(arg0, arg1, arg2);
    }

    @ObfuscatedName("go.o(I)V")
    public synchronized void method1125(int arg0) {
        if (this.field2972.method3388()) {
            int var2 = this.field2954 * this.field2972.field2930 / Statics.field1177;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2955;
                if (this.field2977 - var3 >= 0L) {
                    this.field2955 = var3;
                    break;
                }
                int var5 = (int) ((this.field2977 - this.field2955 + (long) var2 - 1L) / (long) var2);
                this.field2955 += (long) var2 * (long) var5;
                this.field2978.method1125(var5);
                arg0 -= var5;
                this.method3462();
            } while (this.field2972.method3388());
        }
        this.field2978.method1125(arg0);
    }

    @ObfuscatedName("go.av(I)V")
    public void method3462() {
        int var1 = this.field2974;
        int var2 = this.field2975;
        long var3 = this.field2977;
        while (this.field2975 == var2) {
            while (this.field2972.field2933[var1] == var2) {
                this.field2972.method3366(var1);
                int var5 = this.field2972.method3383(var1);
                if (var5 == 1) {
                    this.field2972.method3412();
                    this.field2972.method3367(var1);
                    if (this.field2972.method3376()) {
                        if (!this.field2973 || var2 == 0) {
                            this.method3474();
                            this.field2972.method3363();
                            return;
                        }
                        this.field2972.method3375(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method3457(var5);
                }
                this.field2972.method3415(var1);
                this.field2972.method3367(var1);
            }
            var1 = this.field2972.method3373();
            var2 = this.field2972.field2933[var1];
            var3 = this.field2972.method3372(var2);
        }
        this.field2974 = var1;
        this.field2975 = var2;
        this.field2977 = var3;
    }

    @ObfuscatedName("go.au(Lgk;I)Z")
    public boolean method3466(class187 arg0) {
        if (arg0.field3012 != null) {
            return false;
        }
        if (arg0.field2994 >= 0) {
            arg0.method3715();
            if (arg0.field2998 > 0 && this.field2970[arg0.field2997][arg0.field2998] == arg0) {
                this.field2970[arg0.field2997][arg0.field2998] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("go.ay(Lgk;[IIII)Z")
    public boolean method3464(class187 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field3013 = Statics.field1177 / 100;
        if (arg0.field2994 >= 0 && arg0.field3012 == null || arg0.field3012.method1273()) {
            arg0.method3542();
            arg0.method3715();
            if (arg0.field2998 > 0 && this.field2970[arg0.field2997][arg0.field2998] == arg0) {
                this.field2970[arg0.field2997][arg0.field2998] = null;
            }
            return true;
        }
        int var5 = arg0.field3004;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2976[arg0.field2997] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field3004 = var6;
        }
        arg0.field3012.method1271(this.method3459(arg0));
        class185 var7 = arg0.field2999;
        boolean var8 = false;
        arg0.field3010++;
        arg0.field3011 += var7.field2988;
        double var9 = (double) ((arg0.field3009 - 60 << 8) + (arg0.field3004 * arg0.field3003 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2981 > 0) {
            if (var7.field2984 > 0) {
                arg0.field3014 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2984 * var9) + 0.5D);
            } else {
                arg0.field3014 += 128;
            }
        }
        if (var7.field2980 != null) {
            if (var7.field2982 > 0) {
                arg0.field3008 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2982 * var9) + 0.5D);
            } else {
                arg0.field3008 += 128;
            }
            while (arg0.field3007 < var7.field2980.length - 2 && arg0.field3008 > (var7.field2980[arg0.field3007 + 2] & 0xFF) << 8) {
                arg0.field3007 += 2;
            }
            if (arg0.field3007 == var7.field2980.length - 2 && var7.field2980[arg0.field3007 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field2994 >= 0 && var7.field2986 != null && (this.field2964[arg0.field2997] & 0x1) == 0 && (arg0.field2998 < 0 || this.field2970[arg0.field2997][arg0.field2998] != arg0)) {
            if (var7.field2983 > 0) {
                arg0.field2994 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2983 * var9) + 0.5D);
            } else {
                arg0.field2994 += 128;
            }
            while (arg0.field2995 < var7.field2986.length - 2 && arg0.field2994 > (var7.field2986[arg0.field2995 + 2] & 0xFF) << 8) {
                arg0.field2995 += 2;
            }
            if (arg0.field2995 == var7.field2986.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field3012.method1296(arg0.field3013, this.method3446(arg0), this.method3461(arg0));
            return false;
        }
        arg0.field3012.method1270(arg0.field3013);
        if (arg1 == null) {
            arg0.field3012.method1125(arg3);
        } else {
            arg0.field3012.method1123(arg1, arg2, arg3);
        }
        if (arg0.field3012.method1274()) {
            this.field2978.field2990.method1115(arg0.field3012);
        }
        arg0.method3542();
        if (arg0.field2994 >= 0) {
            arg0.method3715();
            if (arg0.field2998 > 0 && this.field2970[arg0.field2997][arg0.field2998] == arg0) {
                this.field2970[arg0.field2997][arg0.field2998] = null;
            }
        }
        return true;
    }
}
