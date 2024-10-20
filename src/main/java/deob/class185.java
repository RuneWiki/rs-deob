package deob;

@ObfuscatedName("gw")
public class class185 extends class67 {

    @ObfuscatedName("gw.s")
    public class197 field2988 = new class197(128);

    @ObfuscatedName("gw.j")
    public int field2983 = 256;

    @ObfuscatedName("gw.p")
    public int field2984 = 1000000;

    @ObfuscatedName("gw.x")
    public int[] field3000 = new int[16];

    @ObfuscatedName("gw.d")
    public int[] field2986 = new int[16];

    @ObfuscatedName("gw.u")
    public int[] field3007 = new int[16];

    @ObfuscatedName("gw.o")
    public int[] field3005 = new int[16];

    @ObfuscatedName("gw.b")
    public int[] field2989 = new int[16];

    @ObfuscatedName("gw.k")
    public int[] field2990 = new int[16];

    @ObfuscatedName("gw.c")
    public int[] field3010 = new int[16];

    @ObfuscatedName("gw.l")
    public int[] field2992 = new int[16];

    @ObfuscatedName("gw.t")
    public int[] field2982 = new int[16];

    @ObfuscatedName("gw.w")
    public int[] field2985 = new int[16];

    @ObfuscatedName("gw.g")
    public int[] field2995 = new int[16];

    @ObfuscatedName("gw.y")
    public int[] field2996 = new int[16];

    @ObfuscatedName("gw.f")
    public int[] field2987 = new int[16];

    @ObfuscatedName("gw.q")
    public int[] field2998 = new int[16];

    @ObfuscatedName("gw.n")
    public int[] field2999 = new int[16];

    @ObfuscatedName("gw.v")
    public class188[][] field3009 = new class188[16][128];

    @ObfuscatedName("gw.ab")
    public class188[][] field3001 = new class188[16][128];

    @ObfuscatedName("gw.ad")
    public class183 field3002 = new class183();

    @ObfuscatedName("gw.an")
    public boolean field3003;

    @ObfuscatedName("gw.au")
    public int field3004;

    @ObfuscatedName("gw.ap")
    public int field2991;

    @ObfuscatedName("gw.am")
    public long field3006;

    @ObfuscatedName("gw.ae")
    public long field2997;

    @ObfuscatedName("gw.ao")
    public class187 field3008 = new class187(this);

    public class185() {
        this.method3368();
    }

    @ObfuscatedName("gw.s(IS)V")
    public synchronized void method3349(int arg0) {
        this.field2983 = arg0;
    }

    @ObfuscatedName("gw.j(B)I")
    public int method3350() {
        return this.field2983;
    }

    @ObfuscatedName("gw.p(Lff;Lfa;Lbh;II)Z")
    public synchronized boolean method3351(class181 arg0, class168 arg1, class60 arg2, int arg3) {
        arg0.method3273();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class198 var7 = (class198) arg0.field2944.method3521(); var7 != null; var7 = (class198) arg0.field2944.method3522()) {
            int var8 = (int) var7.field3126;
            class182 var9 = (class182) this.field2988.method3518((long) var8);
            if (var9 == null) {
                byte[] var10 = arg1.method3019(var8);
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
                this.field2988.method3519(var11, (long) var8);
            }
            if (!var9.method3277(arg2, var7.field3105, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method3266();
        }
        return var5;
    }

    @ObfuscatedName("gw.x(B)V")
    public synchronized void method3389() {
        for (class182 var1 = (class182) this.field2988.method3521(); var1 != null; var1 = (class182) this.field2988.method3522()) {
            var1.method3279();
        }
    }

    @ObfuscatedName("gw.d(B)V")
    public synchronized void method3446() {
        for (class182 var1 = (class182) this.field2988.method3521(); var1 != null; var1 = (class182) this.field2988.method3522()) {
            var1.method3639();
        }
    }

    @ObfuscatedName("gw.c(Lff;ZI)V")
    public synchronized void method3353(class181 arg0, boolean arg1) {
        this.method3354();
        this.field3002.method3304(arg0.field2945);
        this.field3003 = arg1;
        this.field3006 = 0L;
        int var3 = this.field3002.method3332();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field3002.method3288(var4);
            this.field3002.method3291(var4);
            this.field3002.method3328(var4);
        }
        this.field3004 = this.field3002.method3296();
        this.field2991 = this.field3002.field2961[this.field3004];
        this.field2997 = this.field3002.method3295(this.field2991);
    }

    @ObfuscatedName("gw.t(I)V")
    public synchronized void method3354() {
        this.field3002.method3285();
        this.method3368();
    }

    @ObfuscatedName("gw.i(I)Z")
    public synchronized boolean method3355() {
        return this.field3002.method3286();
    }

    @ObfuscatedName("gw.r(III)V")
    public synchronized void method3356(int arg0, int arg1) {
        this.method3393(arg0, arg1);
    }

    @ObfuscatedName("gw.m(III)V")
    public void method3393(int arg0, int arg1) {
        this.field3005[arg0] = arg1;
        this.field2990[arg0] = arg1 & 0xFFFFFF80;
        this.method3358(arg0, arg1);
    }

    @ObfuscatedName("gw.e(III)V")
    public void method3358(int arg0, int arg1) {
        if (this.field2989[arg0] != arg1) {
            this.field2989[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field3001[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("gw.h(IIIB)V")
    public void method3413(int arg0, int arg1, int arg2) {
        this.method3376(arg0, arg1, 64);
        if ((this.field2985[arg0] & 0x2) != 0) {
            for (class188 var4 = (class188) this.field3008.field3025.method3572(); var4 != null; var4 = (class188) this.field3008.field3025.method3555()) {
                if (var4.field3047 == arg0 && var4.field3028 < 0) {
                    this.field3009[arg0][var4.field3032] = null;
                    this.field3009[arg0][arg1] = var4;
                    int var5 = (var4.field3037 * var4.field3036 >> 12) + var4.field3029;
                    var4.field3029 += arg1 - var4.field3032 << 8;
                    var4.field3036 = var5 - var4.field3029;
                    var4.field3037 = 4096;
                    var4.field3032 = arg1;
                    return;
                }
            }
        }
        class182 var6 = (class182) this.field2988.method3518((long) this.field2989[arg0]);
        if (var6 == null) {
            return;
        }
        class63 var7 = var6.field2954[arg1];
        if (var7 == null) {
            return;
        }
        class188 var8 = new class188();
        var8.field3047 = arg0;
        var8.field3039 = var6;
        var8.field3042 = var7;
        var8.field3030 = var6.field2953[arg1];
        var8.field3035 = var6.field2952[arg1];
        var8.field3032 = arg1;
        var8.field3033 = var6.field2951 * arg2 * arg2 * var6.field2947[arg1] + 1024 >> 11;
        var8.field3034 = var6.field2950[arg1] & 0xFF;
        var8.field3029 = (arg1 << 8) - (var6.field2948[arg1] & 0x7FFF);
        var8.field3038 = 0;
        var8.field3045 = 0;
        var8.field3040 = 0;
        var8.field3028 = -1;
        var8.field3027 = 0;
        if (this.field2987[arg0] == 0) {
            var8.field3046 = class65.method1240(var7, this.method3373(var8), this.method3417(var8), this.method3375(var8));
        } else {
            var8.field3046 = class65.method1240(var7, this.method3373(var8), 0, this.method3375(var8));
            this.method3360(var8, var6.field2948[arg1] < 0);
        }
        if (var6.field2948[arg1] < 0) {
            var8.field3046.method1372(-1);
        }
        if (var8.field3035 >= 0) {
            class188 var9 = this.field3001[arg0][var8.field3035];
            if (var9 != null && var9.field3028 < 0) {
                this.field3009[arg0][var9.field3032] = null;
                var9.field3028 = 0;
            }
            this.field3001[arg0][var8.field3035] = var8;
        }
        this.field3008.field3025.method3548(var8);
        this.field3009[arg0][arg1] = var8;
    }

    @ObfuscatedName("gw.z(Lgz;ZB)V")
    public void method3360(class188 arg0, boolean arg1) {
        int var3 = arg0.field3042.field1238.length;
        int var5;
        if (arg1 && arg0.field3042.field1239) {
            int var4 = var3 + var3 - arg0.field3042.field1237;
            var5 = (int) ((long) this.field2987[arg0.field3047] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field3046.method1249(true);
            }
        } else {
            var5 = (int) ((long) this.field2987[arg0.field3047] * (long) var3 >> 6);
        }
        arg0.field3046.method1248(var5);
    }

    @ObfuscatedName("gw.a(IIII)V")
    public void method3376(int arg0, int arg1, int arg2) {
        class188 var4 = this.field3009[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field3009[arg0][arg1] = null;
        if ((this.field2985[arg0] & 0x2) == 0) {
            var4.field3028 = 0;
            return;
        }
        for (class188 var5 = (class188) this.field3008.field3025.method3553(); var5 != null; var5 = (class188) this.field3008.field3025.method3558()) {
            if (var4.field3047 == var5.field3047 && var5.field3028 < 0 && var4 != var5) {
                var4.field3028 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("gw.ad(IIII)V")
    public void method3362(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("gw.ap(III)V")
    public void method3384(int arg0, int arg1) {
    }

    @ObfuscatedName("gw.am(III)V")
    public void method3374(int arg0, int arg1) {
        this.field3010[arg0] = arg1;
    }

    @ObfuscatedName("gw.ae(IB)V")
    public void method3390(int arg0) {
        for (class188 var2 = (class188) this.field3008.field3025.method3553(); var2 != null; var2 = (class188) this.field3008.field3025.method3558()) {
            if (arg0 < 0 || var2.field3047 == arg0) {
                if (var2.field3046 != null) {
                    var2.field3046.method1383(Statics.field1187 / 100);
                    if (var2.field3046.method1280()) {
                        this.field3008.field3023.method1107(var2.field3046);
                    }
                    var2.method3465();
                }
                if (var2.field3028 < 0) {
                    this.field3009[var2.field3047][var2.field3032] = null;
                }
                var2.method3639();
            }
        }
    }

    @ObfuscatedName("gw.as(IB)V")
    public void method3380(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method3380(var2);
            }
            return;
        }
        this.field3000[arg0] = 12800;
        this.field2986[arg0] = 8192;
        this.field3007[arg0] = 16383;
        this.field3010[arg0] = 8192;
        this.field2992[arg0] = 0;
        this.field2982[arg0] = 8192;
        this.method3352(arg0);
        this.method3419(arg0);
        this.field2985[arg0] = 0;
        this.field2995[arg0] = 32767;
        this.field2996[arg0] = 256;
        this.field2987[arg0] = 0;
        this.method3372(arg0, 8192);
    }

    @ObfuscatedName("gw.ai(II)V")
    public void method3367(int arg0) {
        for (class188 var2 = (class188) this.field3008.field3025.method3553(); var2 != null; var2 = (class188) this.field3008.field3025.method3558()) {
            if ((arg0 < 0 || var2.field3047 == arg0) && var2.field3028 < 0) {
                this.field3009[var2.field3047][var2.field3032] = null;
                var2.field3028 = 0;
            }
        }
    }

    @ObfuscatedName("gw.ah(I)V")
    public void method3368() {
        this.method3390(-1);
        this.method3380(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2989[var1] = this.field3005[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2990[var2] = this.field3005[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("gw.ax(II)V")
    public void method3352(int arg0) {
        if ((this.field2985[arg0] & 0x2) == 0) {
            return;
        }
        for (class188 var2 = (class188) this.field3008.field3025.method3553(); var2 != null; var2 = (class188) this.field3008.field3025.method3558()) {
            if (var2.field3047 == arg0 && this.field3009[arg0][var2.field3032] == null && var2.field3028 < 0) {
                var2.field3028 = 0;
            }
        }
    }

    @ObfuscatedName("gw.aa(II)V")
    public void method3419(int arg0) {
        if ((this.field2985[arg0] & 0x4) == 0) {
            return;
        }
        for (class188 var2 = (class188) this.field3008.field3025.method3553(); var2 != null; var2 = (class188) this.field3008.field3025.method3558()) {
            if (var2.field3047 == arg0) {
                var2.field3048 = 0;
            }
        }
    }

    @ObfuscatedName("gw.aq(II)V")
    public void method3371(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method3376(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method3413(var6, var7, var8);
            } else {
                this.method3376(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method3362(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2990[var12] = (var14 << 14) + (this.field2990[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2990[var12] = (var14 << 7) + (this.field2990[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2992[var12] = (var14 << 7) + (this.field2992[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2992[var12] = (this.field2992[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2982[var12] = (var14 << 7) + (this.field2982[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2982[var12] = (this.field2982[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field3000[var12] = (var14 << 7) + (this.field3000[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field3000[var12] = (this.field3000[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2986[var12] = (var14 << 7) + (this.field2986[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2986[var12] = (this.field2986[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field3007[var12] = (var14 << 7) + (this.field3007[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field3007[var12] = (this.field3007[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field2985[var12] |= 0x1;
                } else {
                    this.field2985[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2985[var12] |= 0x2;
                } else {
                    this.method3352(var12);
                    this.field2985[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2995[var12] = (var14 << 7) + (this.field2995[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2995[var12] = (this.field2995[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2995[var12] = (var14 << 7) + (this.field2995[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2995[var12] = (this.field2995[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method3390(var12);
            }
            if (var13 == 121) {
                this.method3380(var12);
            }
            if (var13 == 123) {
                this.method3367(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2995[var12];
                if (var15 == 16384) {
                    this.field2996[var12] = (var14 << 7) + (this.field2996[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2995[var12];
                if (var16 == 16384) {
                    this.field2996[var12] = (this.field2996[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2987[var12] = (var14 << 7) + (this.field2987[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2987[var12] = (this.field2987[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2985[var12] |= 0x4;
                } else {
                    this.method3419(var12);
                    this.field2985[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method3372(var12, (var14 << 7) + (this.field2998[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method3372(var12, (this.field2998[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method3358(var17, this.field2990[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method3384(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 9 & 0x3F80) + (arg0 >> 8 & 0x7F);
            this.method3374(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method3368();
            }
        }
    }

    @ObfuscatedName("gw.ay(III)V")
    public void method3372(int arg0, int arg1) {
        this.field2998[arg0] = arg1;
        this.field2999[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("gw.aj(Lgz;I)I")
    public int method3373(class188 arg0) {
        int var2 = (arg0.field3037 * arg0.field3036 >> 12) + arg0.field3029;
        int var3 = ((this.field3010[arg0.field3047] - 8192) * this.field2996[arg0.field3047] >> 12) + var2;
        class186 var4 = arg0.field3030;
        if (var4.field3016 > 0 && (var4.field3017 > 0 || this.field2992[arg0.field3047] > 0)) {
            int var5 = var4.field3017 << 2;
            int var6 = var4.field3020 << 1;
            if (arg0.field3043 < var6) {
                var5 = arg0.field3043 * var5 / var6;
            }
            int var7 = (this.field2992[arg0.field3047] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field3044 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field3042.field1241 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field1187 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("gw.ar(Lgz;B)I")
    public int method3417(class188 arg0) {
        class186 var2 = arg0.field3030;
        int var3 = this.field3007[arg0.field3047] * this.field3000[arg0.field3047] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field3033 * var4 + 16384 >> 15;
        int var6 = this.field2983 * var5 + 128 >> 8;
        if (var2.field3013 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field3038 * 1.953125E-5D * (double) var2.field3013) + 0.5D);
        }
        if (var2.field3019 != null) {
            int var7 = arg0.field3045;
            int var8 = var2.field3019[arg0.field3040 + 1];
            if (arg0.field3040 < var2.field3019.length - 2) {
                int var9 = (var2.field3019[arg0.field3040] & 0xFF) << 8;
                int var10 = (var2.field3019[arg0.field3040 + 2] & 0xFF) << 8;
                var8 += (var2.field3019[arg0.field3040 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field3028 > 0 && var2.field3012 != null) {
            int var11 = arg0.field3028;
            int var12 = var2.field3012[arg0.field3027 + 1];
            if (arg0.field3027 < var2.field3012.length - 2) {
                int var13 = (var2.field3012[arg0.field3027] & 0xFF) << 8;
                int var14 = (var2.field3012[arg0.field3027 + 2] & 0xFF) << 8;
                var12 += (var2.field3012[arg0.field3027 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("gw.aw(Lgz;B)I")
    public int method3375(class188 arg0) {
        int var2 = this.field2986[arg0.field3047];
        return var2 < 8192 ? arg0.field3034 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field3034) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("gw.u()Lbe;")
    public synchronized class67 method1100() {
        return this.field3008;
    }

    @ObfuscatedName("gw.o()Lbe;")
    public synchronized class67 method1113() {
        return null;
    }

    @ObfuscatedName("gw.b()I")
    public synchronized int method1102() {
        return 0;
    }

    @ObfuscatedName("gw.k([III)V")
    public synchronized void method1103(int[] arg0, int arg1, int arg2) {
        if (this.field3002.method3286()) {
            int var4 = this.field2984 * this.field3002.field2958 / Statics.field1187;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field3006;
                if (this.field2997 - var5 >= 0L) {
                    this.field3006 = var5;
                    break;
                }
                int var7 = (int) ((this.field2997 - this.field3006 + (long) var4 - 1L) / (long) var4);
                this.field3006 += (long) var4 * (long) var7;
                this.field3008.method1103(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method3377();
            } while (this.field3002.method3286());
        }
        this.field3008.method1103(arg0, arg1, arg2);
    }

    @ObfuscatedName("gw.l(I)V")
    public synchronized void method1105(int arg0) {
        if (this.field3002.method3286()) {
            int var2 = this.field2984 * this.field3002.field2958 / Statics.field1187;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field3006;
                if (this.field2997 - var3 >= 0L) {
                    this.field3006 = var3;
                    break;
                }
                int var5 = (int) ((this.field2997 - this.field3006 + (long) var2 - 1L) / (long) var2);
                this.field3006 += (long) var2 * (long) var5;
                this.field3008.method1105(var5);
                arg0 -= var5;
                this.method3377();
            } while (this.field3002.method3286());
        }
        this.field3008.method1105(arg0);
    }

    @ObfuscatedName("gw.at(B)V")
    public void method3377() {
        int var1 = this.field3004;
        int var2 = this.field2991;
        long var3 = this.field2997;
        while (this.field2991 == var2) {
            while (this.field3002.field2961[var1] == var2) {
                this.field3002.method3288(var1);
                int var5 = this.field3002.method3292(var1);
                if (var5 == 1) {
                    this.field3002.method3290();
                    this.field3002.method3328(var1);
                    if (this.field3002.method3297()) {
                        if (!this.field3003 || var2 == 0) {
                            this.method3368();
                            this.field3002.method3285();
                            return;
                        }
                        this.field3002.method3298(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method3371(var5);
                }
                this.field3002.method3291(var1);
                this.field3002.method3328(var1);
            }
            var1 = this.field3002.method3296();
            var2 = this.field3002.field2961[var1];
            var3 = this.field3002.method3295(var2);
        }
        this.field3004 = var1;
        this.field2991 = var2;
        this.field2997 = var3;
    }

    @ObfuscatedName("gw.af(Lgz;I)Z")
    public boolean method3378(class188 arg0) {
        if (arg0.field3046 != null) {
            return false;
        }
        if (arg0.field3028 >= 0) {
            arg0.method3639();
            if (arg0.field3035 > 0 && this.field3001[arg0.field3047][arg0.field3035] == arg0) {
                this.field3001[arg0.field3047][arg0.field3035] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("gw.al(Lgz;[IIII)Z")
    public boolean method3398(class188 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field3031 = Statics.field1187 / 100;
        if (arg0.field3028 >= 0 && arg0.field3046 == null || arg0.field3046.method1246()) {
            arg0.method3465();
            arg0.method3639();
            if (arg0.field3035 > 0 && this.field3001[arg0.field3047][arg0.field3035] == arg0) {
                this.field3001[arg0.field3047][arg0.field3035] = null;
            }
            return true;
        }
        int var5 = arg0.field3037;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2982[arg0.field3047] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field3037 = var6;
        }
        arg0.field3046.method1253(this.method3373(arg0));
        class186 var7 = arg0.field3030;
        boolean var8 = false;
        arg0.field3043++;
        arg0.field3044 += var7.field3016;
        double var9 = (double) ((arg0.field3032 - 60 << 8) + (arg0.field3037 * arg0.field3036 >> 12)) * 5.086263020833333E-6D;
        if (var7.field3013 > 0) {
            if (var7.field3011 > 0) {
                arg0.field3038 += (int) (128.0D * Math.pow(2.0D, (double) var7.field3011 * var9) + 0.5D);
            } else {
                arg0.field3038 += 128;
            }
        }
        if (var7.field3019 != null) {
            if (var7.field3014 > 0) {
                arg0.field3045 += (int) (128.0D * Math.pow(2.0D, (double) var7.field3014 * var9) + 0.5D);
            } else {
                arg0.field3045 += 128;
            }
            while (arg0.field3040 < var7.field3019.length - 2 && arg0.field3045 > (var7.field3019[arg0.field3040 + 2] & 0xFF) << 8) {
                arg0.field3040 += 2;
            }
            if (arg0.field3040 == var7.field3019.length - 2 && var7.field3019[arg0.field3040 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field3028 >= 0 && var7.field3012 != null && (this.field2985[arg0.field3047] & 0x1) == 0 && (arg0.field3035 < 0 || this.field3001[arg0.field3047][arg0.field3035] != arg0)) {
            if (var7.field3015 > 0) {
                arg0.field3028 += (int) (128.0D * Math.pow(2.0D, (double) var7.field3015 * var9) + 0.5D);
            } else {
                arg0.field3028 += 128;
            }
            while (arg0.field3027 < var7.field3012.length - 2 && arg0.field3028 > (var7.field3012[arg0.field3027 + 2] & 0xFF) << 8) {
                arg0.field3027 += 2;
            }
            if (arg0.field3027 == var7.field3012.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field3046.method1341(arg0.field3031, this.method3417(arg0), this.method3375(arg0));
            return false;
        }
        arg0.field3046.method1383(arg0.field3031);
        if (arg1 == null) {
            arg0.field3046.method1105(arg3);
        } else {
            arg0.field3046.method1103(arg1, arg2, arg3);
        }
        if (arg0.field3046.method1280()) {
            this.field3008.field3023.method1107(arg0.field3046);
        }
        arg0.method3465();
        if (arg0.field3028 >= 0) {
            arg0.method3639();
            if (arg0.field3035 > 0 && this.field3001[arg0.field3047][arg0.field3035] == arg0) {
                this.field3001[arg0.field3047][arg0.field3035] = null;
            }
        }
        return true;
    }
}
