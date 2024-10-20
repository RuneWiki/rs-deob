package deob;

@ObfuscatedName("gu")
public class class184 extends class67 {

    @ObfuscatedName("gu.y")
    public class196 field2951 = new class196(128);

    @ObfuscatedName("gu.d")
    public int field2945 = 256;

    @ObfuscatedName("gu.g")
    public int field2934 = 1000000;

    @ObfuscatedName("gu.e")
    public int[] field2937 = new int[16];

    @ObfuscatedName("gu.c")
    public int[] field2938 = new int[16];

    @ObfuscatedName("gu.a")
    public int[] field2939 = new int[16];

    @ObfuscatedName("gu.q")
    public int[] field2935 = new int[16];

    @ObfuscatedName("gu.m")
    public int[] field2941 = new int[16];

    @ObfuscatedName("gu.n")
    public int[] field2942 = new int[16];

    @ObfuscatedName("gu.k")
    public int[] field2943 = new int[16];

    @ObfuscatedName("gu.o")
    public int[] field2936 = new int[16];

    @ObfuscatedName("gu.f")
    public int[] field2956 = new int[16];

    @ObfuscatedName("gu.h")
    public int[] field2946 = new int[16];

    @ObfuscatedName("gu.j")
    public int[] field2949 = new int[16];

    @ObfuscatedName("gu.v")
    public int[] field2948 = new int[16];

    @ObfuscatedName("gu.l")
    public int[] field2947 = new int[16];

    @ObfuscatedName("gu.u")
    public int[] field2950 = new int[16];

    @ObfuscatedName("gu.t")
    public int[] field2944 = new int[16];

    @ObfuscatedName("gu.i")
    public class187[][] field2952 = new class187[16][128];

    @ObfuscatedName("gu.ah")
    public class187[][] field2953 = new class187[16][128];

    @ObfuscatedName("gu.aa")
    public class182 field2954 = new class182();

    @ObfuscatedName("gu.ao")
    public boolean field2940;

    @ObfuscatedName("gu.ai")
    public int field2955;

    @ObfuscatedName("gu.ab")
    public int field2957;

    @ObfuscatedName("gu.ae")
    public long field2958;

    @ObfuscatedName("gu.aw")
    public long field2959;

    @ObfuscatedName("gu.aj")
    public class186 field2960 = new class186(this);

    public class184() {
        this.method3380();
    }

    @ObfuscatedName("gu.y(II)V")
    public synchronized void method3308(int arg0) {
        this.field2945 = arg0;
    }

    @ObfuscatedName("gu.d(I)I")
    public int method3309() {
        return this.field2945;
    }

    @ObfuscatedName("gu.g(Lfs;Lfu;Lbi;II)Z")
    public synchronized boolean method3344(class180 arg0, class167 arg1, class60 arg2, int arg3) {
        arg0.method3228();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class197 var7 = (class197) arg0.field2897.method3461(); var7 != null; var7 = (class197) arg0.field2897.method3462()) {
            int var8 = (int) var7.field3091;
            class181 var9 = (class181) this.field2951.method3459((long) var8);
            if (var9 == null) {
                byte[] var10 = arg1.method3028(var8);
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
                this.field2951.method3460(var11, (long) var8);
            }
            if (!var9.method3239(arg2, var7.field3071, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method3231();
        }
        return var5;
    }

    @ObfuscatedName("gu.w(B)V")
    public synchronized void method3397() {
        for (class181 var1 = (class181) this.field2951.method3461(); var1 != null; var1 = (class181) this.field2951.method3462()) {
            var1.method3236();
        }
    }

    @ObfuscatedName("gu.e(I)V")
    public synchronized void method3389() {
        for (class181 var1 = (class181) this.field2951.method3461(); var1 != null; var1 = (class181) this.field2951.method3462()) {
            var1.method3588();
        }
    }

    @ObfuscatedName("gu.n(Lfs;ZB)V")
    public synchronized void method3312(class180 arg0, boolean arg1) {
        this.method3371();
        this.field2954.method3267(arg0.field2898);
        this.field2940 = arg1;
        this.field2958 = 0L;
        int var3 = this.field2954.method3266();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2954.method3249(var4);
            this.field2954.method3252(var4);
            this.field2954.method3277(var4);
        }
        this.field2955 = this.field2954.method3257();
        this.field2957 = this.field2954.field2914[this.field2955];
        this.field2959 = this.field2954.method3245(this.field2957);
    }

    @ObfuscatedName("gu.o(I)V")
    public synchronized void method3371() {
        this.field2954.method3246();
        this.method3380();
    }

    @ObfuscatedName("gu.f(I)Z")
    public synchronized boolean method3313() {
        return this.field2954.method3273();
    }

    @ObfuscatedName("gu.s(III)V")
    public synchronized void method3314(int arg0, int arg1) {
        this.method3352(arg0, arg1);
    }

    @ObfuscatedName("gu.z(III)V")
    public void method3352(int arg0, int arg1) {
        this.field2935[arg0] = arg1;
        this.field2942[arg0] = arg1 & 0xFFFFFF80;
        this.method3329(arg0, arg1);
    }

    @ObfuscatedName("gu.b(III)V")
    public void method3329(int arg0, int arg1) {
        if (this.field2941[arg0] != arg1) {
            this.field2941[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2953[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("gu.p(IIII)V")
    public void method3317(int arg0, int arg1, int arg2) {
        this.method3319(arg0, arg1, 64);
        if ((this.field2946[arg0] & 0x2) != 0) {
            for (class187 var4 = (class187) this.field2960.field2978.method3494(); var4 != null; var4 = (class187) this.field2960.field2978.method3501()) {
                if (var4.field2980 == arg0 && var4.field3001 < 0) {
                    this.field2952[arg0][var4.field2984] = null;
                    this.field2952[arg0][arg1] = var4;
                    int var5 = (var4.field2989 * var4.field2988 >> 12) + var4.field2987;
                    var4.field2987 += arg1 - var4.field2984 << 8;
                    var4.field2988 = var5 - var4.field2987;
                    var4.field2989 = 4096;
                    var4.field2984 = arg1;
                    return;
                }
            }
        }
        class181 var6 = (class181) this.field2951.method3459((long) this.field2941[arg0]);
        if (var6 == null) {
            return;
        }
        class63 var7 = var6.field2900[arg1];
        if (var7 == null) {
            return;
        }
        class187 var8 = new class187();
        var8.field2980 = arg0;
        var8.field2979 = var6;
        var8.field2997 = var7;
        var8.field2982 = var6.field2906[arg1];
        var8.field2981 = var6.field2905[arg1];
        var8.field2984 = arg1;
        var8.field2985 = var6.field2903 * arg2 * arg2 * var6.field2904[arg1] + 1024 >> 11;
        var8.field2992 = var6.field2902[arg1] & 0xFF;
        var8.field2987 = (arg1 << 8) - (var6.field2901[arg1] & 0x7FFF);
        var8.field2990 = 0;
        var8.field2991 = 0;
        var8.field2983 = 0;
        var8.field3001 = -1;
        var8.field2995 = 0;
        if (this.field2947[arg0] == 0) {
            var8.field2986 = class65.method1271(var7, this.method3331(var8), this.method3384(var8), this.method3333(var8));
        } else {
            var8.field2986 = class65.method1271(var7, this.method3331(var8), 0, this.method3333(var8));
            this.method3318(var8, var6.field2901[arg1] < 0);
        }
        if (var6.field2901[arg1] < 0) {
            var8.field2986.method1277(-1);
        }
        if (var8.field2981 >= 0) {
            class187 var9 = this.field2953[arg0][var8.field2981];
            if (var9 != null && var9.field3001 < 0) {
                this.field2952[arg0][var9.field2984] = null;
                var9.field3001 = 0;
            }
            this.field2953[arg0][var8.field2981] = var8;
        }
        this.field2960.field2978.method3488(var8);
        this.field2952[arg0][arg1] = var8;
    }

    @ObfuscatedName("gu.r(Lgl;ZI)V")
    public void method3318(class187 arg0, boolean arg1) {
        int var3 = arg0.field2997.field1235.length;
        int var5;
        if (arg1 && arg0.field2997.field1231) {
            int var4 = var3 + var3 - arg0.field2997.field1233;
            var5 = (int) ((long) this.field2947[arg0.field2980] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field2986.method1280(true);
            }
        } else {
            var5 = (int) ((long) this.field2947[arg0.field2980] * (long) var3 >> 6);
        }
        arg0.field2986.method1279(var5);
    }

    @ObfuscatedName("gu.x(IIIS)V")
    public void method3319(int arg0, int arg1, int arg2) {
        class187 var4 = this.field2952[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2952[arg0][arg1] = null;
        if ((this.field2946[arg0] & 0x2) == 0) {
            var4.field3001 = 0;
            return;
        }
        for (class187 var5 = (class187) this.field2960.field2978.method3493(); var5 != null; var5 = (class187) this.field2960.field2978.method3495()) {
            if (var4.field2980 == var5.field2980 && var5.field3001 < 0 && var4 != var5) {
                var4.field3001 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("gu.h(IIII)V")
    public void method3320(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("gu.j(III)V")
    public void method3321(int arg0, int arg1) {
    }

    @ObfuscatedName("gu.v(IIB)V")
    public void method3346(int arg0, int arg1) {
        this.field2943[arg0] = arg1;
    }

    @ObfuscatedName("gu.l(IB)V")
    public void method3323(int arg0) {
        for (class187 var2 = (class187) this.field2960.field2978.method3493(); var2 != null; var2 = (class187) this.field2960.field2978.method3495()) {
            if (arg0 < 0 || var2.field2980 == arg0) {
                if (var2.field2986 != null) {
                    var2.field2986.method1308(Statics.field2644 / 100);
                    if (var2.field2986.method1287()) {
                        this.field2960.field2976.method1112(var2.field2986);
                    }
                    var2.method3414();
                }
                if (var2.field3001 < 0) {
                    this.field2952[var2.field2980][var2.field2984] = null;
                }
                var2.method3588();
            }
        }
    }

    @ObfuscatedName("gu.u(II)V")
    public void method3341(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method3341(var2);
            }
            return;
        }
        this.field2937[arg0] = 12800;
        this.field2938[arg0] = 8192;
        this.field2939[arg0] = 16383;
        this.field2943[arg0] = 8192;
        this.field2936[arg0] = 0;
        this.field2956[arg0] = 8192;
        this.method3327(arg0);
        this.method3328(arg0);
        this.field2946[arg0] = 0;
        this.field2949[arg0] = 32767;
        this.field2948[arg0] = 256;
        this.field2947[arg0] = 0;
        this.method3330(arg0, 8192);
    }

    @ObfuscatedName("gu.t(IB)V")
    public void method3325(int arg0) {
        for (class187 var2 = (class187) this.field2960.field2978.method3493(); var2 != null; var2 = (class187) this.field2960.field2978.method3495()) {
            if ((arg0 < 0 || var2.field2980 == arg0) && var2.field3001 < 0) {
                this.field2952[var2.field2980][var2.field2984] = null;
                var2.field3001 = 0;
            }
        }
    }

    @ObfuscatedName("gu.aj(I)V")
    public void method3380() {
        this.method3323(-1);
        this.method3341(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2941[var1] = this.field2935[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2942[var2] = this.field2935[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("gu.ay(II)V")
    public void method3327(int arg0) {
        if ((this.field2946[arg0] & 0x2) == 0) {
            return;
        }
        for (class187 var2 = (class187) this.field2960.field2978.method3493(); var2 != null; var2 = (class187) this.field2960.field2978.method3495()) {
            if (var2.field2980 == arg0 && this.field2952[arg0][var2.field2984] == null && var2.field3001 < 0) {
                var2.field3001 = 0;
            }
        }
    }

    @ObfuscatedName("gu.af(IB)V")
    public void method3328(int arg0) {
        if ((this.field2946[arg0] & 0x4) == 0) {
            return;
        }
        for (class187 var2 = (class187) this.field2960.field2978.method3493(); var2 != null; var2 = (class187) this.field2960.field2978.method3495()) {
            if (var2.field2980 == arg0) {
                var2.field3000 = 0;
            }
        }
    }

    @ObfuscatedName("gu.al(II)V")
    public void method3358(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method3319(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method3317(var6, var7, var8);
            } else {
                this.method3319(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method3320(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2942[var12] = (var14 << 14) + (this.field2942[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2942[var12] = (var14 << 7) + (this.field2942[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2936[var12] = (var14 << 7) + (this.field2936[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2936[var12] = (this.field2936[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2956[var12] = (var14 << 7) + (this.field2956[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2956[var12] = (this.field2956[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2937[var12] = (var14 << 7) + (this.field2937[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2937[var12] = (this.field2937[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2938[var12] = (var14 << 7) + (this.field2938[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2938[var12] = (this.field2938[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2939[var12] = (var14 << 7) + (this.field2939[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2939[var12] = (this.field2939[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field2946[var12] |= 0x1;
                } else {
                    this.field2946[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2946[var12] |= 0x2;
                } else {
                    this.method3327(var12);
                    this.field2946[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2949[var12] = (var14 << 7) + (this.field2949[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2949[var12] = (this.field2949[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2949[var12] = (var14 << 7) + (this.field2949[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2949[var12] = (this.field2949[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method3323(var12);
            }
            if (var13 == 121) {
                this.method3341(var12);
            }
            if (var13 == 123) {
                this.method3325(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2949[var12];
                if (var15 == 16384) {
                    this.field2948[var12] = (var14 << 7) + (this.field2948[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2949[var12];
                if (var16 == 16384) {
                    this.field2948[var12] = (this.field2948[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2947[var12] = (var14 << 7) + (this.field2947[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2947[var12] = (this.field2947[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2946[var12] |= 0x4;
                } else {
                    this.method3328(var12);
                    this.field2946[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method3330(var12, (var14 << 7) + (this.field2950[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method3330(var12, (this.field2950[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method3329(var17, this.field2942[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method3321(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
            this.method3346(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method3380();
            }
        }
    }

    @ObfuscatedName("gu.az(III)V")
    public void method3330(int arg0, int arg1) {
        this.field2950[arg0] = arg1;
        this.field2944[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("gu.ar(Lgl;I)I")
    public int method3331(class187 arg0) {
        int var2 = (arg0.field2989 * arg0.field2988 >> 12) + arg0.field2987;
        int var3 = ((this.field2943[arg0.field2980] - 8192) * this.field2948[arg0.field2980] >> 12) + var2;
        class185 var4 = arg0.field2982;
        if (var4.field2969 > 0 && (var4.field2966 > 0 || this.field2936[arg0.field2980] > 0)) {
            int var5 = var4.field2966 << 2;
            int var6 = var4.field2970 << 1;
            if (arg0.field2993 < var6) {
                var5 = arg0.field2993 * var5 / var6;
            }
            int var7 = (this.field2936[arg0.field2980] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field2996 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field2997.field1232 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field2644 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("gu.as(Lgl;B)I")
    public int method3384(class187 arg0) {
        class185 var2 = arg0.field2982;
        int var3 = this.field2937[arg0.field2980] * this.field2939[arg0.field2980] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field2985 * var4 + 16384 >> 15;
        int var6 = this.field2945 * var5 + 128 >> 8;
        if (var2.field2964 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field2990 * 1.953125E-5D * (double) var2.field2964) + 0.5D);
        }
        if (var2.field2967 != null) {
            int var7 = arg0.field2991;
            int var8 = var2.field2967[arg0.field2983 + 1];
            if (arg0.field2983 < var2.field2967.length - 2) {
                int var9 = (var2.field2967[arg0.field2983] & 0xFF) << 8;
                int var10 = (var2.field2967[arg0.field2983 + 2] & 0xFF) << 8;
                var8 += (var2.field2967[arg0.field2983 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field3001 > 0 && var2.field2963 != null) {
            int var11 = arg0.field3001;
            int var12 = var2.field2963[arg0.field2995 + 1];
            if (arg0.field2995 < var2.field2963.length - 2) {
                int var13 = (var2.field2963[arg0.field2995] & 0xFF) << 8;
                int var14 = (var2.field2963[arg0.field2995 + 2] & 0xFF) << 8;
                var12 += (var2.field2963[arg0.field2995 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("gu.an(Lgl;I)I")
    public int method3333(class187 arg0) {
        int var2 = this.field2938[arg0.field2980];
        return var2 < 8192 ? arg0.field2992 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field2992) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("gu.c()Lbs;")
    public synchronized class67 method1123() {
        return this.field2960;
    }

    @ObfuscatedName("gu.a()Lbs;")
    public synchronized class67 method1118() {
        return null;
    }

    @ObfuscatedName("gu.q()I")
    public synchronized int method1145() {
        return 0;
    }

    @ObfuscatedName("gu.m([III)V")
    public synchronized void method1119(int[] arg0, int arg1, int arg2) {
        if (this.field2954.method3273()) {
            int var4 = this.field2934 * this.field2954.field2911 / Statics.field2644;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2958;
                if (this.field2959 - var5 >= 0L) {
                    this.field2958 = var5;
                    break;
                }
                int var7 = (int) ((this.field2959 - this.field2958 + (long) var4 - 1L) / (long) var4);
                this.field2958 += (long) var4 * (long) var7;
                this.field2960.method1119(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method3336();
            } while (this.field2954.method3273());
        }
        this.field2960.method1119(arg0, arg1, arg2);
    }

    @ObfuscatedName("gu.k(I)V")
    public synchronized void method1134(int arg0) {
        if (this.field2954.method3273()) {
            int var2 = this.field2934 * this.field2954.field2911 / Statics.field2644;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2958;
                if (this.field2959 - var3 >= 0L) {
                    this.field2958 = var3;
                    break;
                }
                int var5 = (int) ((this.field2959 - this.field2958 + (long) var2 - 1L) / (long) var2);
                this.field2958 += (long) var2 * (long) var5;
                this.field2960.method1134(var5);
                arg0 -= var5;
                this.method3336();
            } while (this.field2954.method3273());
        }
        this.field2960.method1134(arg0);
    }

    @ObfuscatedName("gu.au(I)V")
    public void method3336() {
        int var1 = this.field2955;
        int var2 = this.field2957;
        long var3 = this.field2959;
        while (this.field2957 == var2) {
            while (this.field2954.field2914[var1] == var2) {
                this.field2954.method3249(var1);
                int var5 = this.field2954.method3253(var1);
                if (var5 == 1) {
                    this.field2954.method3251();
                    this.field2954.method3277(var1);
                    if (this.field2954.method3254()) {
                        if (!this.field2940 || var2 == 0) {
                            this.method3380();
                            this.field2954.method3246();
                            return;
                        }
                        this.field2954.method3259(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method3358(var5);
                }
                this.field2954.method3252(var1);
                this.field2954.method3277(var1);
            }
            var1 = this.field2954.method3257();
            var2 = this.field2954.field2914[var1];
            var3 = this.field2954.method3245(var2);
        }
        this.field2955 = var1;
        this.field2957 = var2;
        this.field2959 = var3;
    }

    @ObfuscatedName("gu.av(Lgl;I)Z")
    public boolean method3337(class187 arg0) {
        if (arg0.field2986 != null) {
            return false;
        }
        if (arg0.field3001 >= 0) {
            arg0.method3588();
            if (arg0.field2981 > 0 && this.field2953[arg0.field2980][arg0.field2981] == arg0) {
                this.field2953[arg0.field2980][arg0.field2981] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("gu.ac(Lgl;[IIII)Z")
    public boolean method3338(class187 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field2998 = Statics.field2644 / 100;
        if (arg0.field3001 >= 0 && arg0.field2986 == null || arg0.field2986.method1286()) {
            arg0.method3414();
            arg0.method3588();
            if (arg0.field2981 > 0 && this.field2953[arg0.field2980][arg0.field2981] == arg0) {
                this.field2953[arg0.field2980][arg0.field2981] = null;
            }
            return true;
        }
        int var5 = arg0.field2989;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2956[arg0.field2980] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field2989 = var6;
        }
        arg0.field2986.method1337(this.method3331(arg0));
        class185 var7 = arg0.field2982;
        boolean var8 = false;
        arg0.field2993++;
        arg0.field2996 += var7.field2969;
        double var9 = (double) ((arg0.field2984 - 60 << 8) + (arg0.field2989 * arg0.field2988 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2964 > 0) {
            if (var7.field2965 > 0) {
                arg0.field2990 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2965 * var9) + 0.5D);
            } else {
                arg0.field2990 += 128;
            }
        }
        if (var7.field2967 != null) {
            if (var7.field2968 > 0) {
                arg0.field2991 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2968 * var9) + 0.5D);
            } else {
                arg0.field2991 += 128;
            }
            while (arg0.field2983 < var7.field2967.length - 2 && arg0.field2991 > (var7.field2967[arg0.field2983 + 2] & 0xFF) << 8) {
                arg0.field2983 += 2;
            }
            if (arg0.field2983 == var7.field2967.length - 2 && var7.field2967[arg0.field2983 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field3001 >= 0 && var7.field2963 != null && (this.field2946[arg0.field2980] & 0x1) == 0 && (arg0.field2981 < 0 || this.field2953[arg0.field2980][arg0.field2981] != arg0)) {
            if (var7.field2962 > 0) {
                arg0.field3001 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2962 * var9) + 0.5D);
            } else {
                arg0.field3001 += 128;
            }
            while (arg0.field2995 < var7.field2963.length - 2 && arg0.field3001 > (var7.field2963[arg0.field2995 + 2] & 0xFF) << 8) {
                arg0.field2995 += 2;
            }
            if (arg0.field2995 == var7.field2963.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field2986.method1395(arg0.field2998, this.method3384(arg0), this.method3333(arg0));
            return false;
        }
        arg0.field2986.method1308(arg0.field2998);
        if (arg1 == null) {
            arg0.field2986.method1134(arg3);
        } else {
            arg0.field2986.method1119(arg1, arg2, arg3);
        }
        if (arg0.field2986.method1287()) {
            this.field2960.field2976.method1112(arg0.field2986);
        }
        arg0.method3414();
        if (arg0.field3001 >= 0) {
            arg0.method3588();
            if (arg0.field2981 > 0 && this.field2953[arg0.field2980][arg0.field2981] == arg0) {
                this.field2953[arg0.field2980][arg0.field2981] = null;
            }
        }
        return true;
    }
}
