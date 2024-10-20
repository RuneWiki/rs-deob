package deob;

@ObfuscatedName("gj")
public class class185 extends class67 {

    @ObfuscatedName("gj.t")
    public class197 field2998 = new class197(128);

    @ObfuscatedName("gj.i")
    public int field2983 = 256;

    @ObfuscatedName("gj.g")
    public int field2997 = 1000000;

    @ObfuscatedName("gj.h")
    public int[] field2986 = new int[16];

    @ObfuscatedName("gj.z")
    public int[] field2987 = new int[16];

    @ObfuscatedName("gj.r")
    public int[] field2994 = new int[16];

    @ObfuscatedName("gj.f")
    public int[] field2989 = new int[16];

    @ObfuscatedName("gj.s")
    public int[] field2990 = new int[16];

    @ObfuscatedName("gj.d")
    public int[] field2991 = new int[16];

    @ObfuscatedName("gj.l")
    public int[] field3010 = new int[16];

    @ObfuscatedName("gj.y")
    public int[] field2996 = new int[16];

    @ObfuscatedName("gj.p")
    public int[] field2992 = new int[16];

    @ObfuscatedName("gj.n")
    public int[] field2995 = new int[16];

    @ObfuscatedName("gj.q")
    public int[] field2988 = new int[16];

    @ObfuscatedName("gj.x")
    public int[] field2984 = new int[16];

    @ObfuscatedName("gj.v")
    public int[] field3007 = new int[16];

    @ObfuscatedName("gj.m")
    public int[] field2999 = new int[16];

    @ObfuscatedName("gj.w")
    public int[] field3000 = new int[16];

    @ObfuscatedName("gj.e")
    public class188[][] field3001 = new class188[16][128];

    @ObfuscatedName("gj.ad")
    public class188[][] field3002 = new class188[16][128];

    @ObfuscatedName("gj.as")
    public class183 field3003 = new class183();

    @ObfuscatedName("gj.ag")
    public boolean field3004;

    @ObfuscatedName("gj.al")
    public int field3005;

    @ObfuscatedName("gj.av")
    public int field3006;

    @ObfuscatedName("gj.ar")
    public long field2993;

    @ObfuscatedName("gj.ay")
    public long field3008;

    @ObfuscatedName("gj.aq")
    public class187 field3009 = new class187(this);

    public class185() {
        this.method3340();
    }

    @ObfuscatedName("gj.t(IB)V")
    public synchronized void method3369(int arg0) {
        this.field2983 = arg0;
    }

    @ObfuscatedName("gj.i(B)I")
    public int method3321() {
        return this.field2983;
    }

    @ObfuscatedName("gj.g(Lfd;Lfp;Lbb;II)Z")
    public synchronized boolean method3322(class181 arg0, class168 arg1, class60 arg2, int arg3) {
        arg0.method3234();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class198 var7 = (class198) arg0.field2949.method3488(); var7 != null; var7 = (class198) arg0.field2949.method3489()) {
            int var8 = (int) var7.field3126;
            class182 var9 = (class182) this.field2998.method3485((long) var8);
            if (var9 == null) {
                byte[] var10 = arg1.method3056(var8);
                class182 var11;
                if (var10 == null) {
                    var11 = null;
                } else {
                    var11 = new class182(var10);
                }
                var9 = var11;
                if (var11 == null) {
                    var5 = false;
                    continue;
                }
                this.field2998.method3486(var11, (long) var8);
            }
            if (!var9.method3248(arg2, var7.field3105, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method3235();
        }
        return var5;
    }

    @ObfuscatedName("gj.h(B)V")
    public synchronized void method3411() {
        for (class182 var1 = (class182) this.field2998.method3488(); var1 != null; var1 = (class182) this.field2998.method3489()) {
            var1.method3242();
        }
    }

    @ObfuscatedName("gj.z(B)V")
    public synchronized void method3402() {
        for (class182 var1 = (class182) this.field2998.method3488(); var1 != null; var1 = (class182) this.field2998.method3489()) {
            var1.method3607();
        }
    }

    @ObfuscatedName("gj.l(Lfd;ZB)V")
    public synchronized void method3357(class181 arg0, boolean arg1) {
        this.method3347();
        this.field3003.method3251(arg0.field2950);
        this.field3004 = arg1;
        this.field2993 = 0L;
        int var3 = this.field3003.method3254();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field3003.method3279(var4);
            this.field3003.method3258(var4);
            this.field3003.method3259(var4);
        }
        this.field3005 = this.field3003.method3263();
        this.field3006 = this.field3003.field2965[this.field3005];
        this.field3008 = this.field3003.method3262(this.field3006);
    }

    @ObfuscatedName("gj.p(I)V")
    public synchronized void method3347() {
        this.field3003.method3252();
        this.method3340();
    }

    @ObfuscatedName("gj.k(B)Z")
    public synchronized boolean method3327() {
        return this.field3003.method3253();
    }

    @ObfuscatedName("gj.o(IIB)V")
    public synchronized void method3394(int arg0, int arg1) {
        this.method3329(arg0, arg1);
    }

    @ObfuscatedName("gj.b(III)V")
    public void method3329(int arg0, int arg1) {
        this.field2989[arg0] = arg1;
        this.field2991[arg0] = arg1 & 0xFFFFFF80;
        this.method3330(arg0, arg1);
    }

    @ObfuscatedName("gj.j(IIB)V")
    public void method3330(int arg0, int arg1) {
        if (this.field2990[arg0] != arg1) {
            this.field2990[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field3002[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("gj.a(IIIB)V")
    public void method3359(int arg0, int arg1, int arg2) {
        this.method3386(arg0, arg1, 64);
        if ((this.field2995[arg0] & 0x2) != 0) {
            for (class188 var4 = (class188) this.field3009.field3024.method3514(); var4 != null; var4 = (class188) this.field3009.field3024.method3517()) {
                if (var4.field3044 == arg0 && var4.field3042 < 0) {
                    this.field3001[arg0][var4.field3033] = null;
                    this.field3001[arg0][arg1] = var4;
                    int var5 = (var4.field3038 * var4.field3031 >> 12) + var4.field3036;
                    var4.field3036 += arg1 - var4.field3033 << 8;
                    var4.field3031 = var5 - var4.field3036;
                    var4.field3038 = 4096;
                    var4.field3033 = arg1;
                    return;
                }
            }
        }
        class182 var6 = (class182) this.field2998.method3485((long) this.field2990[arg0]);
        if (var6 == null) {
            return;
        }
        class63 var7 = var6.field2952[arg1];
        if (var7 == null) {
            return;
        }
        class188 var8 = new class188();
        var8.field3044 = arg0;
        var8.field3029 = var6;
        var8.field3030 = var7;
        var8.field3045 = var6.field2960[arg1];
        var8.field3032 = var6.field2951[arg1];
        var8.field3033 = arg1;
        var8.field3047 = var6.field2955 * arg2 * arg2 * var6.field2954[arg1] + 1024 >> 11;
        var8.field3035 = var6.field2956[arg1] & 0xFF;
        var8.field3036 = (arg1 << 8) - (var6.field2953[arg1] & 0x7FFF);
        var8.field3039 = 0;
        var8.field3040 = 0;
        var8.field3041 = 0;
        var8.field3042 = -1;
        var8.field3028 = 0;
        if (this.field3007[arg0] == 0) {
            var8.field3046 = class65.method1275(var7, this.method3383(var8), this.method3346(var8), this.method3418(var8));
        } else {
            var8.field3046 = class65.method1275(var7, this.method3383(var8), 0, this.method3418(var8));
            this.method3332(var8, var6.field2953[arg1] < 0);
        }
        if (var6.field2953[arg1] < 0) {
            var8.field3046.method1214(-1);
        }
        if (var8.field3032 >= 0) {
            class188 var9 = this.field3002[arg0][var8.field3032];
            if (var9 != null && var9.field3042 < 0) {
                this.field3001[arg0][var9.field3033] = null;
                var9.field3042 = 0;
            }
            this.field3002[arg0][var8.field3032] = var8;
        }
        this.field3009.field3024.method3508(var8);
        this.field3001[arg0][arg1] = var8;
    }

    @ObfuscatedName("gj.u(Lgw;ZI)V")
    public void method3332(class188 arg0, boolean arg1) {
        int var3 = arg0.field3030.field1236.length;
        int var5;
        if (arg1 && arg0.field3030.field1237) {
            int var4 = var3 + var3 - arg0.field3030.field1239;
            var5 = (int) ((long) this.field3007[arg0.field3044] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field3046.method1221(true);
            }
        } else {
            var5 = (int) ((long) this.field3007[arg0.field3044] * (long) var3 >> 6);
        }
        arg0.field3046.method1284(var5);
    }

    @ObfuscatedName("gj.c(IIII)V")
    public void method3386(int arg0, int arg1, int arg2) {
        class188 var4 = this.field3001[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field3001[arg0][arg1] = null;
        if ((this.field2995[arg0] & 0x2) == 0) {
            var4.field3042 = 0;
            return;
        }
        for (class188 var5 = (class188) this.field3009.field3024.method3534(); var5 != null; var5 = (class188) this.field3009.field3024.method3516()) {
            if (var4.field3044 == var5.field3044 && var5.field3042 < 0 && var4 != var5) {
                var4.field3042 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("gj.n(IIIB)V")
    public void method3334(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("gj.q(III)V")
    public void method3335(int arg0, int arg1) {
    }

    @ObfuscatedName("gj.x(IIB)V")
    public void method3336(int arg0, int arg1) {
        this.field3010[arg0] = arg1;
    }

    @ObfuscatedName("gj.v(II)V")
    public void method3425(int arg0) {
        for (class188 var2 = (class188) this.field3009.field3024.method3534(); var2 != null; var2 = (class188) this.field3009.field3024.method3516()) {
            if (arg0 < 0 || var2.field3044 == arg0) {
                if (var2.field3046 != null) {
                    var2.field3046.method1225(Statics.field1195 / 100);
                    if (var2.field3046.method1228()) {
                        this.field3009.field3026.method1062(var2.field3046);
                    }
                    var2.method3438();
                }
                if (var2.field3042 < 0) {
                    this.field3001[var2.field3044][var2.field3033] = null;
                }
                var2.method3607();
            }
        }
    }

    @ObfuscatedName("gj.m(II)V")
    public void method3338(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method3338(var2);
            }
            return;
        }
        this.field2986[arg0] = 12800;
        this.field2987[arg0] = 8192;
        this.field2994[arg0] = 16383;
        this.field3010[arg0] = 8192;
        this.field2996[arg0] = 0;
        this.field2992[arg0] = 8192;
        this.method3341(arg0);
        this.method3342(arg0);
        this.field2995[arg0] = 0;
        this.field2988[arg0] = 32767;
        this.field2984[arg0] = 256;
        this.field3007[arg0] = 0;
        this.method3344(arg0, 8192);
    }

    @ObfuscatedName("gj.w(II)V")
    public void method3339(int arg0) {
        for (class188 var2 = (class188) this.field3009.field3024.method3534(); var2 != null; var2 = (class188) this.field3009.field3024.method3516()) {
            if ((arg0 < 0 || var2.field3044 == arg0) && var2.field3042 < 0) {
                this.field3001[var2.field3044][var2.field3033] = null;
                var2.field3042 = 0;
            }
        }
    }

    @ObfuscatedName("gj.aq(I)V")
    public void method3340() {
        this.method3425(-1);
        this.method3338(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2990[var1] = this.field2989[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2991[var2] = this.field2989[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("gj.ai(II)V")
    public void method3341(int arg0) {
        if ((this.field2995[arg0] & 0x2) == 0) {
            return;
        }
        for (class188 var2 = (class188) this.field3009.field3024.method3534(); var2 != null; var2 = (class188) this.field3009.field3024.method3516()) {
            if (var2.field3044 == arg0 && this.field3001[arg0][var2.field3033] == null && var2.field3042 < 0) {
                var2.field3042 = 0;
            }
        }
    }

    @ObfuscatedName("gj.aw(II)V")
    public void method3342(int arg0) {
        if ((this.field2995[arg0] & 0x4) == 0) {
            return;
        }
        for (class188 var2 = (class188) this.field3009.field3024.method3534(); var2 != null; var2 = (class188) this.field3009.field3024.method3516()) {
            if (var2.field3044 == arg0) {
                var2.field3048 = 0;
            }
        }
    }

    @ObfuscatedName("gj.ap(IB)V")
    public void method3343(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method3386(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method3359(var6, var7, var8);
            } else {
                this.method3386(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method3334(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2991[var12] = (var14 << 14) + (this.field2991[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2991[var12] = (var14 << 7) + (this.field2991[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2996[var12] = (var14 << 7) + (this.field2996[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2996[var12] = (this.field2996[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2992[var12] = (var14 << 7) + (this.field2992[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2992[var12] = (this.field2992[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2986[var12] = (var14 << 7) + (this.field2986[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2986[var12] = (this.field2986[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2987[var12] = (var14 << 7) + (this.field2987[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2987[var12] = (this.field2987[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2994[var12] = (var14 << 7) + (this.field2994[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2994[var12] = (this.field2994[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field2995[var12] |= 0x1;
                } else {
                    this.field2995[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2995[var12] |= 0x2;
                } else {
                    this.method3341(var12);
                    this.field2995[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2988[var12] = (var14 << 7) + (this.field2988[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2988[var12] = (this.field2988[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2988[var12] = (var14 << 7) + (this.field2988[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2988[var12] = (this.field2988[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method3425(var12);
            }
            if (var13 == 121) {
                this.method3338(var12);
            }
            if (var13 == 123) {
                this.method3339(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2988[var12];
                if (var15 == 16384) {
                    this.field2984[var12] = (var14 << 7) + (this.field2984[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2988[var12];
                if (var16 == 16384) {
                    this.field2984[var12] = (this.field2984[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field3007[var12] = (var14 << 7) + (this.field3007[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field3007[var12] = (this.field3007[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2995[var12] |= 0x4;
                } else {
                    this.method3342(var12);
                    this.field2995[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method3344(var12, (var14 << 7) + (this.field2999[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method3344(var12, (this.field2999[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method3330(var17, this.field2991[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method3335(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 9 & 0x3F80) + (arg0 >> 8 & 0x7F);
            this.method3336(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method3340();
            }
        }
    }

    @ObfuscatedName("gj.ae(III)V")
    public void method3344(int arg0, int arg1) {
        this.field2999[arg0] = arg1;
        this.field3000[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("gj.aa(Lgw;B)I")
    public int method3383(class188 arg0) {
        int var2 = (arg0.field3038 * arg0.field3031 >> 12) + arg0.field3036;
        int var3 = ((this.field3010[arg0.field3044] - 8192) * this.field2984[arg0.field3044] >> 12) + var2;
        class186 var4 = arg0.field3045;
        if (var4.field3019 > 0 && (var4.field3013 > 0 || this.field2996[arg0.field3044] > 0)) {
            int var5 = var4.field3013 << 2;
            int var6 = var4.field3020 << 1;
            if (arg0.field3043 < var6) {
                var5 = arg0.field3043 * var5 / var6;
            }
            int var7 = (this.field2996[arg0.field3044] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field3037 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field3030.field1235 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field1195 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("gj.au(Lgw;I)I")
    public int method3346(class188 arg0) {
        class186 var2 = arg0.field3045;
        int var3 = this.field2994[arg0.field3044] * this.field2986[arg0.field3044] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field3047 * var4 + 16384 >> 15;
        int var6 = this.field2983 * var5 + 128 >> 8;
        if (var2.field3018 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field3039 * 1.953125E-5D * (double) var2.field3018) + 0.5D);
        }
        if (var2.field3012 != null) {
            int var7 = arg0.field3040;
            int var8 = var2.field3012[arg0.field3041 + 1];
            if (arg0.field3041 < var2.field3012.length - 2) {
                int var9 = (var2.field3012[arg0.field3041] & 0xFF) << 8;
                int var10 = (var2.field3012[arg0.field3041 + 2] & 0xFF) << 8;
                var8 += (var2.field3012[arg0.field3041 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field3042 > 0 && var2.field3014 != null) {
            int var11 = arg0.field3042;
            int var12 = var2.field3014[arg0.field3028 + 1];
            if (arg0.field3028 < var2.field3014.length - 2) {
                int var13 = (var2.field3014[arg0.field3028] & 0xFF) << 8;
                int var14 = (var2.field3014[arg0.field3028 + 2] & 0xFF) << 8;
                var12 += (var2.field3014[arg0.field3028 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("gj.ab(Lgw;B)I")
    public int method3418(class188 arg0) {
        int var2 = this.field2987[arg0.field3044];
        return var2 < 8192 ? arg0.field3035 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field3035) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("gj.r()Lby;")
    public synchronized class67 method1059() {
        return this.field3009;
    }

    @ObfuscatedName("gj.f()Lby;")
    public synchronized class67 method1065() {
        return null;
    }

    @ObfuscatedName("gj.s()I")
    public synchronized int method1066() {
        return 0;
    }

    @ObfuscatedName("gj.d([III)V")
    public synchronized void method1067(int[] arg0, int arg1, int arg2) {
        if (this.field3003.method3253()) {
            int var4 = this.field2997 * this.field3003.field2962 / Statics.field1195;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2993;
                if (this.field3008 - var5 >= 0L) {
                    this.field2993 = var5;
                    break;
                }
                int var7 = (int) ((this.field3008 - this.field2993 + (long) var4 - 1L) / (long) var4);
                this.field2993 += (long) var4 * (long) var7;
                this.field3009.method1067(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method3320();
            } while (this.field3003.method3253());
        }
        this.field3009.method1067(arg0, arg1, arg2);
    }

    @ObfuscatedName("gj.y(I)V")
    public synchronized void method1069(int arg0) {
        if (this.field3003.method3253()) {
            int var2 = this.field2997 * this.field3003.field2962 / Statics.field1195;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2993;
                if (this.field3008 - var3 >= 0L) {
                    this.field2993 = var3;
                    break;
                }
                int var5 = (int) ((this.field3008 - this.field2993 + (long) var2 - 1L) / (long) var2);
                this.field2993 += (long) var2 * (long) var5;
                this.field3009.method1069(var5);
                arg0 -= var5;
                this.method3320();
            } while (this.field3003.method3253());
        }
        this.field3009.method1069(arg0);
    }

    @ObfuscatedName("gj.am(I)V")
    public void method3320() {
        int var1 = this.field3005;
        int var2 = this.field3006;
        long var3 = this.field3008;
        while (this.field3006 == var2) {
            while (this.field3003.field2965[var1] == var2) {
                this.field3003.method3279(var1);
                int var5 = this.field3003.method3261(var1);
                if (var5 == 1) {
                    this.field3003.method3257();
                    this.field3003.method3259(var1);
                    if (this.field3003.method3264()) {
                        if (!this.field3004 || var2 == 0) {
                            this.method3340();
                            this.field3003.method3252();
                            return;
                        }
                        this.field3003.method3286(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method3343(var5);
                }
                this.field3003.method3258(var1);
                this.field3003.method3259(var1);
            }
            var1 = this.field3003.method3263();
            var2 = this.field3003.field2965[var1];
            var3 = this.field3003.method3262(var2);
        }
        this.field3005 = var1;
        this.field3006 = var2;
        this.field3008 = var3;
    }

    @ObfuscatedName("gj.at(Lgw;B)Z")
    public boolean method3350(class188 arg0) {
        if (arg0.field3046 != null) {
            return false;
        }
        if (arg0.field3042 >= 0) {
            arg0.method3607();
            if (arg0.field3032 > 0 && this.field3002[arg0.field3044][arg0.field3032] == arg0) {
                this.field3002[arg0.field3044][arg0.field3032] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("gj.az(Lgw;[IIIB)Z")
    public boolean method3351(class188 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field3049 = Statics.field1195 / 100;
        if (arg0.field3042 >= 0 && arg0.field3046 == null || arg0.field3046.method1212()) {
            arg0.method3438();
            arg0.method3607();
            if (arg0.field3032 > 0 && this.field3002[arg0.field3044][arg0.field3032] == arg0) {
                this.field3002[arg0.field3044][arg0.field3032] = null;
            }
            return true;
        }
        int var5 = arg0.field3038;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2992[arg0.field3044] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field3038 = var6;
        }
        arg0.field3046.method1226(this.method3383(arg0));
        class186 var7 = arg0.field3045;
        boolean var8 = false;
        arg0.field3043++;
        arg0.field3037 += var7.field3019;
        double var9 = (double) ((arg0.field3033 - 60 << 8) + (arg0.field3038 * arg0.field3031 >> 12)) * 5.086263020833333E-6D;
        if (var7.field3018 > 0) {
            if (var7.field3017 > 0) {
                arg0.field3039 += (int) (128.0D * Math.pow(2.0D, (double) var7.field3017 * var9) + 0.5D);
            } else {
                arg0.field3039 += 128;
            }
        }
        if (var7.field3012 != null) {
            if (var7.field3015 > 0) {
                arg0.field3040 += (int) (128.0D * Math.pow(2.0D, (double) var7.field3015 * var9) + 0.5D);
            } else {
                arg0.field3040 += 128;
            }
            while (arg0.field3041 < var7.field3012.length - 2 && arg0.field3040 > (var7.field3012[arg0.field3041 + 2] & 0xFF) << 8) {
                arg0.field3041 += 2;
            }
            if (arg0.field3041 == var7.field3012.length - 2 && var7.field3012[arg0.field3041 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field3042 >= 0 && var7.field3014 != null && (this.field2995[arg0.field3044] & 0x1) == 0 && (arg0.field3032 < 0 || this.field3002[arg0.field3044][arg0.field3032] != arg0)) {
            if (var7.field3016 > 0) {
                arg0.field3042 += (int) (128.0D * Math.pow(2.0D, (double) var7.field3016 * var9) + 0.5D);
            } else {
                arg0.field3042 += 128;
            }
            while (arg0.field3028 < var7.field3014.length - 2 && arg0.field3042 > (var7.field3014[arg0.field3028 + 2] & 0xFF) << 8) {
                arg0.field3028 += 2;
            }
            if (arg0.field3028 == var7.field3014.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field3046.method1235(arg0.field3049, this.method3346(arg0), this.method3418(arg0));
            return false;
        }
        arg0.field3046.method1225(arg0.field3049);
        if (arg1 == null) {
            arg0.field3046.method1069(arg3);
        } else {
            arg0.field3046.method1067(arg1, arg2, arg3);
        }
        if (arg0.field3046.method1228()) {
            this.field3009.field3026.method1062(arg0.field3046);
        }
        arg0.method3438();
        if (arg0.field3042 >= 0) {
            arg0.method3607();
            if (arg0.field3032 > 0 && this.field3002[arg0.field3044][arg0.field3032] == arg0) {
                this.field3002[arg0.field3044][arg0.field3032] = null;
            }
        }
        return true;
    }
}
