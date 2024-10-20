package deob;

@ObfuscatedName("gz")
public class class184 extends class67 {

    @ObfuscatedName("gz.m")
    public class196 field2964 = new class196(128);

    @ObfuscatedName("gz.l")
    public int field2939 = 256;

    @ObfuscatedName("gz.y")
    public int field2940 = 1000000;

    @ObfuscatedName("gz.u")
    public int[] field2941 = new int[16];

    @ObfuscatedName("gz.k")
    public int[] field2942 = new int[16];

    @ObfuscatedName("gz.j")
    public int[] field2943 = new int[16];

    @ObfuscatedName("gz.i")
    public int[] field2963 = new int[16];

    @ObfuscatedName("gz.x")
    public int[] field2945 = new int[16];

    @ObfuscatedName("gz.g")
    public int[] field2946 = new int[16];

    @ObfuscatedName("gz.e")
    public int[] field2958 = new int[16];

    @ObfuscatedName("gz.p")
    public int[] field2944 = new int[16];

    @ObfuscatedName("gz.a")
    public int[] field2949 = new int[16];

    @ObfuscatedName("gz.f")
    public int[] field2954 = new int[16];

    @ObfuscatedName("gz.d")
    public int[] field2938 = new int[16];

    @ObfuscatedName("gz.q")
    public int[] field2953 = new int[16];

    @ObfuscatedName("gz.o")
    public int[] field2950 = new int[16];

    @ObfuscatedName("gz.w")
    public int[] field2955 = new int[16];

    @ObfuscatedName("gz.z")
    public int[] field2956 = new int[16];

    @ObfuscatedName("gz.t")
    public class187[][] field2957 = new class187[16][128];

    @ObfuscatedName("gz.aq")
    public class187[][] field2952 = new class187[16][128];

    @ObfuscatedName("gz.an")
    public class182 field2959 = new class182();

    @ObfuscatedName("gz.av")
    public boolean field2960;

    @ObfuscatedName("gz.ac")
    public int field2951;

    @ObfuscatedName("gz.ar")
    public int field2962;

    @ObfuscatedName("gz.ah")
    public long field2965;

    @ObfuscatedName("gz.ab")
    public long field2947;

    @ObfuscatedName("gz.au")
    public class186 field2948 = new class186(this);

    public class184() {
        this.method3441();
    }

    @ObfuscatedName("gz.m(II)V")
    public synchronized void method3423(int arg0) {
        this.field2939 = arg0;
    }

    @ObfuscatedName("gz.l(I)I")
    public int method3443() {
        return this.field2939;
    }

    @ObfuscatedName("gz.y(Lfn;Lfx;Lbr;IB)Z")
    public synchronized boolean method3425(class180 arg0, class167 arg1, class60 arg2, int arg3) {
        arg0.method3341();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class197 var7 = (class197) arg0.field2903.method3574(); var7 != null; var7 = (class197) arg0.field2903.method3573()) {
            int var8 = (int) var7.field3095;
            class181 var9 = (class181) this.field2964.method3571((long) var8);
            if (var9 == null) {
                byte[] var10 = arg1.method3094(var8);
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
                this.field2964.method3572(var11, (long) var8);
            }
            if (!var9.method3343(arg2, var7.field3073, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method3334();
        }
        return var5;
    }

    @ObfuscatedName("gz.u(I)V")
    public synchronized void method3426() {
        for (class181 var1 = (class181) this.field2964.method3574(); var1 != null; var1 = (class181) this.field2964.method3573()) {
            var1.method3346();
        }
    }

    @ObfuscatedName("gz.k(I)V")
    public synchronized void method3427() {
        for (class181 var1 = (class181) this.field2964.method3574(); var1 != null; var1 = (class181) this.field2964.method3573()) {
            var1.method3702();
        }
    }

    @ObfuscatedName("gz.e(Lfn;ZI)V")
    public synchronized void method3454(class180 arg0, boolean arg1) {
        this.method3514();
        this.field2959.method3349(arg0.field2904);
        this.field2960 = arg1;
        this.field2965 = 0L;
        int var3 = this.field2959.method3352();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2959.method3353(var4);
            this.field2959.method3356(var4);
            this.field2959.method3354(var4);
        }
        this.field2951 = this.field2959.method3380();
        this.field2962 = this.field2959.field2918[this.field2951];
        this.field2947 = this.field2959.method3360(this.field2962);
    }

    @ObfuscatedName("gz.a(I)V")
    public synchronized void method3514() {
        this.field2959.method3386();
        this.method3441();
    }

    @ObfuscatedName("gz.v(I)Z")
    public synchronized boolean method3429() {
        return this.field2959.method3370();
    }

    @ObfuscatedName("gz.c(III)V")
    public synchronized void method3430(int arg0, int arg1) {
        this.method3431(arg0, arg1);
    }

    @ObfuscatedName("gz.s(III)V")
    public void method3431(int arg0, int arg1) {
        this.field2963[arg0] = arg1;
        this.field2946[arg0] = arg1 & 0xFFFFFF80;
        this.method3432(arg0, arg1);
    }

    @ObfuscatedName("gz.r(III)V")
    public void method3432(int arg0, int arg1) {
        if (this.field2945[arg0] != arg1) {
            this.field2945[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2952[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("gz.h(IIII)V")
    public void method3433(int arg0, int arg1, int arg2) {
        this.method3510(arg0, arg1, 64);
        if ((this.field2954[arg0] & 0x2) != 0) {
            for (class187 var4 = (class187) this.field2948.field2982.method3612(); var4 != null; var4 = (class187) this.field2948.field2982.method3614()) {
                if (var4.field2987 == arg0 && var4.field2991 < 0) {
                    this.field2957[arg0][var4.field3001] = null;
                    this.field2957[arg0][arg1] = var4;
                    int var5 = (var4.field2996 * var4.field2992 >> 12) + var4.field2993;
                    var4.field2993 += arg1 - var4.field3001 << 8;
                    var4.field2996 = var5 - var4.field2993;
                    var4.field2992 = 4096;
                    var4.field3001 = arg1;
                    return;
                }
            }
        }
        class181 var6 = (class181) this.field2964.method3571((long) this.field2945[arg0]);
        if (var6 == null) {
            return;
        }
        class63 var7 = var6.field2906[arg1];
        if (var7 == null) {
            return;
        }
        class187 var8 = new class187();
        var8.field2987 = arg0;
        var8.field2988 = var6;
        var8.field2989 = var7;
        var8.field2990 = var6.field2910[arg1];
        var8.field2997 = var6.field2911[arg1];
        var8.field3001 = arg1;
        var8.field3008 = var6.field2907 * arg2 * arg2 * var6.field2908[arg1] + 1024 >> 11;
        var8.field2994 = var6.field2909[arg1] & 0xFF;
        var8.field2993 = (arg1 << 8) - (var6.field2913[arg1] & 0x7FFF);
        var8.field2998 = 0;
        var8.field2999 = 0;
        var8.field3000 = 0;
        var8.field2991 = -1;
        var8.field3002 = 0;
        if (this.field2950[arg0] == 0) {
            var8.field3005 = class65.method1305(var7, this.method3447(var8), this.method3448(var8), this.method3449(var8));
        } else {
            var8.field3005 = class65.method1305(var7, this.method3447(var8), 0, this.method3449(var8));
            this.method3463(var8, var6.field2913[arg1] < 0);
        }
        if (var6.field2913[arg1] < 0) {
            var8.field3005.method1344(-1);
        }
        if (var8.field2997 >= 0) {
            class187 var9 = this.field2952[arg0][var8.field2997];
            if (var9 != null && var9.field2991 < 0) {
                this.field2957[arg0][var9.field3001] = null;
                var9.field2991 = 0;
            }
            this.field2952[arg0][var8.field2997] = var8;
        }
        this.field2948.field2982.method3606(var8);
        this.field2957[arg0][arg1] = var8;
    }

    @ObfuscatedName("gz.n(Lgr;ZI)V")
    public void method3463(class187 arg0, boolean arg1) {
        int var3 = arg0.field2989.field1188.length;
        int var5;
        if (arg1 && arg0.field2989.field1191) {
            int var4 = var3 + var3 - arg0.field2989.field1187;
            var5 = (int) ((long) this.field2950[arg0.field2987] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field3005.method1312(true);
            }
        } else {
            var5 = (int) ((long) this.field2950[arg0.field2987] * (long) var3 >> 6);
        }
        arg0.field3005.method1311(var5);
    }

    @ObfuscatedName("gz.b(IIII)V")
    public void method3510(int arg0, int arg1, int arg2) {
        class187 var4 = this.field2957[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2957[arg0][arg1] = null;
        if ((this.field2954[arg0] & 0x2) == 0) {
            var4.field2991 = 0;
            return;
        }
        for (class187 var5 = (class187) this.field2948.field2982.method3611(); var5 != null; var5 = (class187) this.field2948.field2982.method3613()) {
            if (var4.field2987 == var5.field2987 && var5.field2991 < 0 && var4 != var5) {
                var4.field2991 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("gz.f(IIII)V")
    public void method3436(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("gz.ah(III)V")
    public void method3424(int arg0, int arg1) {
    }

    @ObfuscatedName("gz.ab(III)V")
    public void method3438(int arg0, int arg1) {
        this.field2958[arg0] = arg1;
    }

    @ObfuscatedName("gz.au(IB)V")
    public void method3439(int arg0) {
        for (class187 var2 = (class187) this.field2948.field2982.method3611(); var2 != null; var2 = (class187) this.field2948.field2982.method3613()) {
            if (arg0 < 0 || var2.field2987 == arg0) {
                if (var2.field3005 != null) {
                    var2.field3005.method1315(Statics.field1139 / 100);
                    if (var2.field3005.method1319()) {
                        this.field2948.field2986.method1150(var2.field3005);
                    }
                    var2.method3527();
                }
                if (var2.field2991 < 0) {
                    this.field2957[var2.field2987][var2.field3001] = null;
                }
                var2.method3702();
            }
        }
    }

    @ObfuscatedName("gz.ap(II)V")
    public void method3440(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method3440(var2);
            }
            return;
        }
        this.field2941[arg0] = 12800;
        this.field2942[arg0] = 8192;
        this.field2943[arg0] = 16383;
        this.field2958[arg0] = 8192;
        this.field2944[arg0] = 0;
        this.field2949[arg0] = 8192;
        this.method3498(arg0);
        this.method3444(arg0);
        this.field2954[arg0] = 0;
        this.field2938[arg0] = 32767;
        this.field2953[arg0] = 256;
        this.field2950[arg0] = 0;
        this.method3446(arg0, 8192);
    }

    @ObfuscatedName("gz.at(II)V")
    public void method3471(int arg0) {
        for (class187 var2 = (class187) this.field2948.field2982.method3611(); var2 != null; var2 = (class187) this.field2948.field2982.method3613()) {
            if ((arg0 < 0 || var2.field2987 == arg0) && var2.field2991 < 0) {
                this.field2957[var2.field2987][var2.field3001] = null;
                var2.field2991 = 0;
            }
        }
    }

    @ObfuscatedName("gz.az(B)V")
    public void method3441() {
        this.method3439(-1);
        this.method3440(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2945[var1] = this.field2963[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2946[var2] = this.field2963[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("gz.af(IB)V")
    public void method3498(int arg0) {
        if ((this.field2954[arg0] & 0x2) == 0) {
            return;
        }
        for (class187 var2 = (class187) this.field2948.field2982.method3611(); var2 != null; var2 = (class187) this.field2948.field2982.method3613()) {
            if (var2.field2987 == arg0 && this.field2957[arg0][var2.field3001] == null && var2.field2991 < 0) {
                var2.field2991 = 0;
            }
        }
    }

    @ObfuscatedName("gz.aw(IB)V")
    public void method3444(int arg0) {
        if ((this.field2954[arg0] & 0x4) == 0) {
            return;
        }
        for (class187 var2 = (class187) this.field2948.field2982.method3611(); var2 != null; var2 = (class187) this.field2948.field2982.method3613()) {
            if (var2.field2987 == arg0) {
                var2.field3006 = 0;
            }
        }
    }

    @ObfuscatedName("gz.al(IB)V")
    public void method3497(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method3510(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method3433(var6, var7, var8);
            } else {
                this.method3510(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method3436(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2946[var12] = (var14 << 14) + (this.field2946[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2946[var12] = (var14 << 7) + (this.field2946[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2944[var12] = (var14 << 7) + (this.field2944[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2944[var12] = (this.field2944[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2949[var12] = (var14 << 7) + (this.field2949[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2949[var12] = (this.field2949[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2941[var12] = (var14 << 7) + (this.field2941[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2941[var12] = (this.field2941[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2942[var12] = (var14 << 7) + (this.field2942[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2942[var12] = (this.field2942[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2943[var12] = (var14 << 7) + (this.field2943[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2943[var12] = (this.field2943[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field2954[var12] |= 0x1;
                } else {
                    this.field2954[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2954[var12] |= 0x2;
                } else {
                    this.method3498(var12);
                    this.field2954[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2938[var12] = (var14 << 7) + (this.field2938[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2938[var12] = (this.field2938[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2938[var12] = (var14 << 7) + (this.field2938[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2938[var12] = (this.field2938[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method3439(var12);
            }
            if (var13 == 121) {
                this.method3440(var12);
            }
            if (var13 == 123) {
                this.method3471(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2938[var12];
                if (var15 == 16384) {
                    this.field2953[var12] = (var14 << 7) + (this.field2953[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2938[var12];
                if (var16 == 16384) {
                    this.field2953[var12] = (this.field2953[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2950[var12] = (var14 << 7) + (this.field2950[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2950[var12] = (this.field2950[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2954[var12] |= 0x4;
                } else {
                    this.method3444(var12);
                    this.field2954[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method3446(var12, (var14 << 7) + (this.field2955[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method3446(var12, (this.field2955[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method3432(var17, this.field2946[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method3424(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
            this.method3438(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method3441();
            }
        }
    }

    @ObfuscatedName("gz.ax(IIB)V")
    public void method3446(int arg0, int arg1) {
        this.field2955[arg0] = arg1;
        this.field2956[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("gz.ag(Lgr;I)I")
    public int method3447(class187 arg0) {
        int var2 = (arg0.field2996 * arg0.field2992 >> 12) + arg0.field2993;
        int var3 = ((this.field2958[arg0.field2987] - 8192) * this.field2953[arg0.field2987] >> 12) + var2;
        class185 var4 = arg0.field2990;
        if (var4.field2976 > 0 && (var4.field2975 > 0 || this.field2944[arg0.field2987] > 0)) {
            int var5 = var4.field2975 << 2;
            int var6 = var4.field2977 << 1;
            if (arg0.field3003 < var6) {
                var5 = arg0.field3003 * var5 / var6;
            }
            int var7 = (this.field2944[arg0.field2987] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field3004 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field2989.field1189 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field1139 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("gz.ak(Lgr;B)I")
    public int method3448(class187 arg0) {
        class185 var2 = arg0.field2990;
        int var3 = this.field2943[arg0.field2987] * this.field2941[arg0.field2987] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field3008 * var4 + 16384 >> 15;
        int var6 = this.field2939 * var5 + 128 >> 8;
        if (var2.field2978 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field2998 * 1.953125E-5D * (double) var2.field2978) + 0.5D);
        }
        if (var2.field2969 != null) {
            int var7 = arg0.field2999;
            int var8 = var2.field2969[arg0.field3000 + 1];
            if (arg0.field3000 < var2.field2969.length - 2) {
                int var9 = (var2.field2969[arg0.field3000] & 0xFF) << 8;
                int var10 = (var2.field2969[arg0.field3000 + 2] & 0xFF) << 8;
                var8 += (var2.field2969[arg0.field3000 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field2991 > 0 && var2.field2971 != null) {
            int var11 = arg0.field2991;
            int var12 = var2.field2971[arg0.field3002 + 1];
            if (arg0.field3002 < var2.field2971.length - 2) {
                int var13 = (var2.field2971[arg0.field3002] & 0xFF) << 8;
                int var14 = (var2.field2971[arg0.field3002 + 2] & 0xFF) << 8;
                var12 += (var2.field2971[arg0.field3002 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("gz.ad(Lgr;I)I")
    public int method3449(class187 arg0) {
        int var2 = this.field2942[arg0.field2987];
        return var2 < 8192 ? arg0.field2994 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field2994) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("gz.j()Lby;")
    public synchronized class67 method1155() {
        return this.field2948;
    }

    @ObfuscatedName("gz.i()Lby;")
    public synchronized class67 method1156() {
        return null;
    }

    @ObfuscatedName("gz.x()I")
    public synchronized int method1157() {
        return 0;
    }

    @ObfuscatedName("gz.g([III)V")
    public synchronized void method1183(int[] arg0, int arg1, int arg2) {
        if (this.field2959.method3370()) {
            int var4 = this.field2940 * this.field2959.field2922 / Statics.field1139;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2965;
                if (this.field2947 - var5 >= 0L) {
                    this.field2965 = var5;
                    break;
                }
                int var7 = (int) ((this.field2947 - this.field2965 + (long) var4 - 1L) / (long) var4);
                this.field2965 += (long) var4 * (long) var7;
                this.field2948.method1183(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method3451();
            } while (this.field2959.method3370());
        }
        this.field2948.method1183(arg0, arg1, arg2);
    }

    @ObfuscatedName("gz.p(I)V")
    public synchronized void method1160(int arg0) {
        if (this.field2959.method3370()) {
            int var2 = this.field2940 * this.field2959.field2922 / Statics.field1139;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2965;
                if (this.field2947 - var3 >= 0L) {
                    this.field2965 = var3;
                    break;
                }
                int var5 = (int) ((this.field2947 - this.field2965 + (long) var2 - 1L) / (long) var2);
                this.field2965 += (long) var2 * (long) var5;
                this.field2948.method1160(var5);
                arg0 -= var5;
                this.method3451();
            } while (this.field2959.method3370());
        }
        this.field2948.method1160(arg0);
    }

    @ObfuscatedName("gz.ae(I)V")
    public void method3451() {
        int var1 = this.field2951;
        int var2 = this.field2962;
        long var3 = this.field2947;
        while (this.field2962 == var2) {
            while (this.field2959.field2918[var1] == var2) {
                this.field2959.method3353(var1);
                int var5 = this.field2959.method3357(var1);
                if (var5 == 1) {
                    this.field2959.method3355();
                    this.field2959.method3354(var1);
                    if (this.field2959.method3362()) {
                        if (!this.field2960 || var2 == 0) {
                            this.method3441();
                            this.field2959.method3386();
                            return;
                        }
                        this.field2959.method3363(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method3497(var5);
                }
                this.field2959.method3356(var1);
                this.field2959.method3354(var1);
            }
            var1 = this.field2959.method3380();
            var2 = this.field2959.field2918[var1];
            var3 = this.field2959.method3360(var2);
        }
        this.field2951 = var1;
        this.field2962 = var2;
        this.field2947 = var3;
    }

    @ObfuscatedName("gz.as(Lgr;B)Z")
    public boolean method3452(class187 arg0) {
        if (arg0.field3005 != null) {
            return false;
        }
        if (arg0.field2991 >= 0) {
            arg0.method3702();
            if (arg0.field2997 > 0 && this.field2952[arg0.field2987][arg0.field2997] == arg0) {
                this.field2952[arg0.field2987][arg0.field2997] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("gz.ay(Lgr;[IIII)Z")
    public boolean method3470(class187 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field2995 = Statics.field1139 / 100;
        if (arg0.field2991 >= 0 && arg0.field3005 == null || arg0.field3005.method1406()) {
            arg0.method3527();
            arg0.method3702();
            if (arg0.field2997 > 0 && this.field2952[arg0.field2987][arg0.field2997] == arg0) {
                this.field2952[arg0.field2987][arg0.field2997] = null;
            }
            return true;
        }
        int var5 = arg0.field2992;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2949[arg0.field2987] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field2992 = var6;
        }
        arg0.field3005.method1343(this.method3447(arg0));
        class185 var7 = arg0.field2990;
        boolean var8 = false;
        arg0.field3003++;
        arg0.field3004 += var7.field2976;
        double var9 = (double) ((arg0.field3001 - 60 << 8) + (arg0.field2996 * arg0.field2992 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2978 > 0) {
            if (var7.field2979 > 0) {
                arg0.field2998 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2979 * var9) + 0.5D);
            } else {
                arg0.field2998 += 128;
            }
        }
        if (var7.field2969 != null) {
            if (var7.field2972 > 0) {
                arg0.field2999 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2972 * var9) + 0.5D);
            } else {
                arg0.field2999 += 128;
            }
            while (arg0.field3000 < var7.field2969.length - 2 && arg0.field2999 > (var7.field2969[arg0.field3000 + 2] & 0xFF) << 8) {
                arg0.field3000 += 2;
            }
            if (arg0.field3000 == var7.field2969.length - 2 && var7.field2969[arg0.field3000 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field2991 >= 0 && var7.field2971 != null && (this.field2954[arg0.field2987] & 0x1) == 0 && (arg0.field2997 < 0 || this.field2952[arg0.field2987][arg0.field2997] != arg0)) {
            if (var7.field2973 > 0) {
                arg0.field2991 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2973 * var9) + 0.5D);
            } else {
                arg0.field2991 += 128;
            }
            while (arg0.field3002 < var7.field2971.length - 2 && arg0.field2991 > (var7.field2971[arg0.field3002 + 2] & 0xFF) << 8) {
                arg0.field3002 += 2;
            }
            if (arg0.field3002 == var7.field2971.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field3005.method1330(arg0.field2995, this.method3448(arg0), this.method3449(arg0));
            return false;
        }
        arg0.field3005.method1315(arg0.field2995);
        if (arg1 == null) {
            arg0.field3005.method1160(arg3);
        } else {
            arg0.field3005.method1183(arg1, arg2, arg3);
        }
        if (arg0.field3005.method1319()) {
            this.field2948.field2986.method1150(arg0.field3005);
        }
        arg0.method3527();
        if (arg0.field2991 >= 0) {
            arg0.method3702();
            if (arg0.field2997 > 0 && this.field2952[arg0.field2987][arg0.field2997] == arg0) {
                this.field2952[arg0.field2987][arg0.field2997] = null;
            }
        }
        return true;
    }
}
