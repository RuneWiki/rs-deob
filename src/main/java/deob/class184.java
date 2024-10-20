package deob;

@ObfuscatedName("gt")
public class class184 extends class67 {

    @ObfuscatedName("gt.h")
    public class196 field2953 = new class196(128);

    @ObfuscatedName("gt.m")
    public int field2949 = 256;

    @ObfuscatedName("gt.i")
    public int field2950 = 1000000;

    @ObfuscatedName("gt.q")
    public int[] field2951 = new int[16];

    @ObfuscatedName("gt.p")
    public int[] field2952 = new int[16];

    @ObfuscatedName("gt.c")
    public int[] field2959 = new int[16];

    @ObfuscatedName("gt.f")
    public int[] field2954 = new int[16];

    @ObfuscatedName("gt.y")
    public int[] field2955 = new int[16];

    @ObfuscatedName("gt.l")
    public int[] field2956 = new int[16];

    @ObfuscatedName("gt.v")
    public int[] field2957 = new int[16];

    @ObfuscatedName("gt.k")
    public int[] field2958 = new int[16];

    @ObfuscatedName("gt.o")
    public int[] field2968 = new int[16];

    @ObfuscatedName("gt.z")
    public int[] field2960 = new int[16];

    @ObfuscatedName("gt.r")
    public int[] field2961 = new int[16];

    @ObfuscatedName("gt.d")
    public int[] field2974 = new int[16];

    @ObfuscatedName("gt.n")
    public int[] field2963 = new int[16];

    @ObfuscatedName("gt.j")
    public int[] field2973 = new int[16];

    @ObfuscatedName("gt.b")
    public int[] field2965 = new int[16];

    @ObfuscatedName("gt.e")
    public class187[][] field2966 = new class187[16][128];

    @ObfuscatedName("gt.ai")
    public class187[][] field2971 = new class187[16][128];

    @ObfuscatedName("gt.ao")
    public class182 field2948 = new class182();

    @ObfuscatedName("gt.af")
    public boolean field2969;

    @ObfuscatedName("gt.ab")
    public int field2970;

    @ObfuscatedName("gt.ax")
    public int field2972;

    @ObfuscatedName("gt.ap")
    public long field2967;

    @ObfuscatedName("gt.as")
    public long field2962;

    @ObfuscatedName("gt.av")
    public class186 field2964 = new class186(this);

    public class184() {
        this.method3413();
    }

    @ObfuscatedName("gt.h(IB)V")
    public synchronized void method3342(int arg0) {
        this.field2949 = arg0;
    }

    @ObfuscatedName("gt.m(B)I")
    public int method3384() {
        return this.field2949;
    }

    @ObfuscatedName("gt.i(Lff;Lfv;Lbe;II)Z")
    public synchronized boolean method3344(class180 arg0, class167 arg1, class60 arg2, int arg3) {
        arg0.method3259();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class197 var7 = (class197) arg0.field2915.method3515(); var7 != null; var7 = (class197) arg0.field2915.method3516()) {
            int var8 = (int) var7.field3100;
            class181 var9 = (class181) this.field2953.method3519((long) var8);
            if (var9 == null) {
                byte[] var10 = arg1.method3012(var8);
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
                this.field2953.method3513(var11, (long) var8);
            }
            if (!var9.method3268(arg2, var7.field3080, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method3257();
        }
        return var5;
    }

    @ObfuscatedName("gt.q(I)V")
    public synchronized void method3345() {
        for (class181 var1 = (class181) this.field2953.method3515(); var1 != null; var1 = (class181) this.field2953.method3516()) {
            var1.method3269();
        }
    }

    @ObfuscatedName("gt.p(B)V")
    public synchronized void method3418() {
        for (class181 var1 = (class181) this.field2953.method3515(); var1 != null; var1 = (class181) this.field2953.method3516()) {
            var1.method3625();
        }
    }

    @ObfuscatedName("gt.l(Lff;ZB)V")
    public synchronized void method3421(class180 arg0, boolean arg1) {
        this.method3348();
        this.field2948.method3274(arg0.field2914);
        this.field2969 = arg1;
        this.field2967 = 0L;
        int var3 = this.field2948.method3277();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2948.method3278(var4);
            this.field2948.method3279(var4);
            this.field2948.method3294(var4);
        }
        this.field2970 = this.field2948.method3326();
        this.field2972 = this.field2948.field2932[this.field2970];
        this.field2962 = this.field2948.method3284(this.field2972);
    }

    @ObfuscatedName("gt.k(B)V")
    public synchronized void method3348() {
        this.field2948.method3275();
        this.method3413();
    }

    @ObfuscatedName("gt.o(I)Z")
    public synchronized boolean method3349() {
        return this.field2948.method3303();
    }

    @ObfuscatedName("gt.u(III)V")
    public synchronized void method3399(int arg0, int arg1) {
        this.method3351(arg0, arg1);
    }

    @ObfuscatedName("gt.s(III)V")
    public void method3351(int arg0, int arg1) {
        this.field2954[arg0] = arg1;
        this.field2956[arg0] = arg1 & 0xFFFFFF80;
        this.method3352(arg0, arg1);
    }

    @ObfuscatedName("gt.g(III)V")
    public void method3352(int arg0, int arg1) {
        if (this.field2955[arg0] != arg1) {
            this.field2955[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2971[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("gt.x(IIIB)V")
    public void method3343(int arg0, int arg1, int arg2) {
        this.method3405(arg0, arg1, 64);
        if ((this.field2960[arg0] & 0x2) != 0) {
            for (class187 var4 = (class187) this.field2964.field2987.method3547(); var4 != null; var4 = (class187) this.field2964.field2987.method3549()) {
                if (var4.field3006 == arg0 && var4.field3004 < 0) {
                    this.field2966[arg0][var4.field2998] = null;
                    this.field2966[arg0][arg1] = var4;
                    int var5 = (var4.field3000 * var4.field2999 >> 12) + var4.field3008;
                    var4.field3008 += arg1 - var4.field2998 << 8;
                    var4.field2999 = var5 - var4.field3008;
                    var4.field3000 = 4096;
                    var4.field2998 = arg1;
                    return;
                }
            }
        }
        class181 var6 = (class181) this.field2953.method3519((long) this.field2955[arg0]);
        if (var6 == null) {
            return;
        }
        class63 var7 = var6.field2917[arg1];
        if (var7 == null) {
            return;
        }
        class187 var8 = new class187();
        var8.field3006 = arg0;
        var8.field3003 = var6;
        var8.field2992 = var7;
        var8.field2993 = var6.field2921[arg1];
        var8.field2994 = var6.field2919[arg1];
        var8.field2998 = arg1;
        var8.field2991 = var6.field2916 * arg2 * arg2 * var6.field2920[arg1] + 1024 >> 11;
        var8.field2997 = var6.field2922[arg1] & 0xFF;
        var8.field3008 = (arg1 << 8) - (var6.field2918[arg1] & 0x7FFF);
        var8.field3001 = 0;
        var8.field3002 = 0;
        var8.field2990 = 0;
        var8.field3004 = -1;
        var8.field2995 = 0;
        if (this.field2963[arg0] == 0) {
            var8.field3009 = class65.method1301(var7, this.method3365(var8), this.method3354(var8), this.method3369(var8));
        } else {
            var8.field3009 = class65.method1301(var7, this.method3365(var8), 0, this.method3369(var8));
            this.method3425(var8, var6.field2918[arg1] < 0);
        }
        if (var6.field2918[arg1] < 0) {
            var8.field3009.method1294(-1);
        }
        if (var8.field2994 >= 0) {
            class187 var9 = this.field2971[arg0][var8.field2994];
            if (var9 != null && var9.field3004 < 0) {
                this.field2966[arg0][var9.field2998] = null;
                var9.field3004 = 0;
            }
            this.field2971[arg0][var8.field2994] = var8;
        }
        this.field2964.field2987.method3541(var8);
        this.field2966[arg0][arg1] = var8;
    }

    @ObfuscatedName("gt.a(Lgi;ZB)V")
    public void method3425(class187 arg0, boolean arg1) {
        int var3 = arg0.field2992.field1241.length;
        int var5;
        if (arg1 && arg0.field2992.field1245) {
            int var4 = var3 + var3 - arg0.field2992.field1244;
            var5 = (int) ((long) this.field2963[arg0.field3006] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field3009.method1368(true);
            }
        } else {
            var5 = (int) ((long) this.field2963[arg0.field3006] * (long) var3 >> 6);
        }
        arg0.field3009.method1263(var5);
    }

    @ObfuscatedName("gt.t(IIII)V")
    public void method3405(int arg0, int arg1, int arg2) {
        class187 var4 = this.field2966[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2966[arg0][arg1] = null;
        if ((this.field2960[arg0] & 0x2) == 0) {
            var4.field3004 = 0;
            return;
        }
        for (class187 var5 = (class187) this.field2964.field2987.method3546(); var5 != null; var5 = (class187) this.field2964.field2987.method3548()) {
            if (var4.field3006 == var5.field3006 && var5.field3004 < 0 && var4 != var5) {
                var4.field3004 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("gt.z(IIII)V")
    public void method3355(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("gt.r(III)V")
    public void method3356(int arg0, int arg1) {
    }

    @ObfuscatedName("gt.d(III)V")
    public void method3357(int arg0, int arg1) {
        this.field2957[arg0] = arg1;
    }

    @ObfuscatedName("gt.n(II)V")
    public void method3358(int arg0) {
        for (class187 var2 = (class187) this.field2964.field2987.method3546(); var2 != null; var2 = (class187) this.field2964.field2987.method3548()) {
            if (arg0 < 0 || var2.field3006 == arg0) {
                if (var2.field3009 != null) {
                    var2.field3009.method1307(Statics.field1199 / 100);
                    if (var2.field3009.method1272()) {
                        this.field2964.field2986.method1122(var2.field3009);
                    }
                    var2.method3462();
                }
                if (var2.field3004 < 0) {
                    this.field2966[var2.field3006][var2.field2998] = null;
                }
                var2.method3625();
            }
        }
    }

    @ObfuscatedName("gt.j(II)V")
    public void method3359(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method3359(var2);
            }
            return;
        }
        this.field2951[arg0] = 12800;
        this.field2952[arg0] = 8192;
        this.field2959[arg0] = 16383;
        this.field2957[arg0] = 8192;
        this.field2958[arg0] = 0;
        this.field2968[arg0] = 8192;
        this.method3442(arg0);
        this.method3362(arg0);
        this.field2960[arg0] = 0;
        this.field2961[arg0] = 32767;
        this.field2974[arg0] = 256;
        this.field2963[arg0] = 0;
        this.method3364(arg0, 8192);
    }

    @ObfuscatedName("gt.b(II)V")
    public void method3360(int arg0) {
        for (class187 var2 = (class187) this.field2964.field2987.method3546(); var2 != null; var2 = (class187) this.field2964.field2987.method3548()) {
            if ((arg0 < 0 || var2.field3006 == arg0) && var2.field3004 < 0) {
                this.field2966[var2.field3006][var2.field2998] = null;
                var2.field3004 = 0;
            }
        }
    }

    @ObfuscatedName("gt.e(B)V")
    public void method3413() {
        this.method3358(-1);
        this.method3359(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2955[var1] = this.field2954[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2956[var2] = this.field2954[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("gt.aa(II)V")
    public void method3442(int arg0) {
        if ((this.field2960[arg0] & 0x2) == 0) {
            return;
        }
        for (class187 var2 = (class187) this.field2964.field2987.method3546(); var2 != null; var2 = (class187) this.field2964.field2987.method3548()) {
            if (var2.field3006 == arg0 && this.field2966[arg0][var2.field2998] == null && var2.field3004 < 0) {
                var2.field3004 = 0;
            }
        }
    }

    @ObfuscatedName("gt.aq(II)V")
    public void method3362(int arg0) {
        if ((this.field2960[arg0] & 0x4) == 0) {
            return;
        }
        for (class187 var2 = (class187) this.field2964.field2987.method3546(); var2 != null; var2 = (class187) this.field2964.field2987.method3548()) {
            if (var2.field3006 == arg0) {
                var2.field3010 = 0;
            }
        }
    }

    @ObfuscatedName("gt.ad(IB)V")
    public void method3401(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method3405(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method3343(var6, var7, var8);
            } else {
                this.method3405(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method3355(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2956[var12] = (var14 << 14) + (this.field2956[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2956[var12] = (var14 << 7) + (this.field2956[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2958[var12] = (var14 << 7) + (this.field2958[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2958[var12] = (this.field2958[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2968[var12] = (var14 << 7) + (this.field2968[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2968[var12] = (this.field2968[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2951[var12] = (var14 << 7) + (this.field2951[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2951[var12] = (this.field2951[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2952[var12] = (var14 << 7) + (this.field2952[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2952[var12] = (this.field2952[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2959[var12] = (var14 << 7) + (this.field2959[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2959[var12] = (this.field2959[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field2960[var12] |= 0x1;
                } else {
                    this.field2960[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2960[var12] |= 0x2;
                } else {
                    this.method3442(var12);
                    this.field2960[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2961[var12] = (var14 << 7) + (this.field2961[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2961[var12] = (this.field2961[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2961[var12] = (var14 << 7) + (this.field2961[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2961[var12] = (this.field2961[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method3358(var12);
            }
            if (var13 == 121) {
                this.method3359(var12);
            }
            if (var13 == 123) {
                this.method3360(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2961[var12];
                if (var15 == 16384) {
                    this.field2974[var12] = (var14 << 7) + (this.field2974[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2961[var12];
                if (var16 == 16384) {
                    this.field2974[var12] = (this.field2974[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2963[var12] = (var14 << 7) + (this.field2963[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2963[var12] = (this.field2963[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2960[var12] |= 0x4;
                } else {
                    this.method3362(var12);
                    this.field2960[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method3364(var12, (var14 << 7) + (this.field2973[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method3364(var12, (this.field2973[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method3352(var17, this.field2956[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method3356(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 9 & 0x3F80) + (arg0 >> 8 & 0x7F);
            this.method3357(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method3413();
            }
        }
    }

    @ObfuscatedName("gt.ak(IIB)V")
    public void method3364(int arg0, int arg1) {
        this.field2973[arg0] = arg1;
        this.field2965[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("gt.az(Lgi;I)I")
    public int method3365(class187 arg0) {
        int var2 = (arg0.field3000 * arg0.field2999 >> 12) + arg0.field3008;
        int var3 = ((this.field2957[arg0.field3006] - 8192) * this.field2974[arg0.field3006] >> 12) + var2;
        class185 var4 = arg0.field2993;
        if (var4.field2983 > 0 && (var4.field2976 > 0 || this.field2958[arg0.field3006] > 0)) {
            int var5 = var4.field2976 << 2;
            int var6 = var4.field2984 << 1;
            if (arg0.field2996 < var6) {
                var5 = arg0.field2996 * var5 / var6;
            }
            int var7 = (this.field2958[arg0.field3006] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field3007 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field2992.field1243 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field1199 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("gt.ac(Lgi;B)I")
    public int method3354(class187 arg0) {
        class185 var2 = arg0.field2993;
        int var3 = this.field2959[arg0.field3006] * this.field2951[arg0.field3006] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field2991 * var4 + 16384 >> 15;
        int var6 = this.field2949 * var5 + 128 >> 8;
        if (var2.field2982 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field3001 * 1.953125E-5D * (double) var2.field2982) + 0.5D);
        }
        if (var2.field2978 != null) {
            int var7 = arg0.field3002;
            int var8 = var2.field2978[arg0.field2990 + 1];
            if (arg0.field2990 < var2.field2978.length - 2) {
                int var9 = (var2.field2978[arg0.field2990] & 0xFF) << 8;
                int var10 = (var2.field2978[arg0.field2990 + 2] & 0xFF) << 8;
                var8 += (var2.field2978[arg0.field2990 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field3004 > 0 && var2.field2977 != null) {
            int var11 = arg0.field3004;
            int var12 = var2.field2977[arg0.field2995 + 1];
            if (arg0.field2995 < var2.field2977.length - 2) {
                int var13 = (var2.field2977[arg0.field2995] & 0xFF) << 8;
                int var14 = (var2.field2977[arg0.field2995 + 2] & 0xFF) << 8;
                var12 += (var2.field2977[arg0.field2995 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("gt.au(Lgi;I)I")
    public int method3369(class187 arg0) {
        int var2 = this.field2952[arg0.field3006];
        return var2 < 8192 ? arg0.field2997 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field2997) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("gt.c()Lbc;")
    public synchronized class67 method1108() {
        return this.field2964;
    }

    @ObfuscatedName("gt.f()Lbc;")
    public synchronized class67 method1097() {
        return null;
    }

    @ObfuscatedName("gt.y()I")
    public synchronized int method1098() {
        return 0;
    }

    @ObfuscatedName("gt.w([III)V")
    public synchronized void method1109(int[] arg0, int arg1, int arg2) {
        if (this.field2948.method3303()) {
            int var4 = this.field2950 * this.field2948.field2926 / Statics.field1199;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2967;
                if (this.field2962 - var5 >= 0L) {
                    this.field2967 = var5;
                    break;
                }
                int var7 = (int) ((this.field2962 - this.field2967 + (long) var4 - 1L) / (long) var4);
                this.field2967 += (long) var4 * (long) var7;
                this.field2964.method1109(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method3395();
            } while (this.field2948.method3303());
        }
        this.field2964.method1109(arg0, arg1, arg2);
    }

    @ObfuscatedName("gt.v(I)V")
    public synchronized void method1101(int arg0) {
        if (this.field2948.method3303()) {
            int var2 = this.field2950 * this.field2948.field2926 / Statics.field1199;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2967;
                if (this.field2962 - var3 >= 0L) {
                    this.field2967 = var3;
                    break;
                }
                int var5 = (int) ((this.field2962 - this.field2967 + (long) var2 - 1L) / (long) var2);
                this.field2967 += (long) var2 * (long) var5;
                this.field2964.method1101(var5);
                arg0 -= var5;
                this.method3395();
            } while (this.field2948.method3303());
        }
        this.field2964.method1101(arg0);
    }

    @ObfuscatedName("gt.ah(B)V")
    public void method3395() {
        int var1 = this.field2970;
        int var2 = this.field2972;
        long var3 = this.field2962;
        while (this.field2972 == var2) {
            while (this.field2948.field2932[var1] == var2) {
                this.field2948.method3278(var1);
                int var5 = this.field2948.method3281(var1);
                if (var5 == 1) {
                    this.field2948.method3280();
                    this.field2948.method3294(var1);
                    if (this.field2948.method3286()) {
                        if (!this.field2969 || var2 == 0) {
                            this.method3413();
                            this.field2948.method3275();
                            return;
                        }
                        this.field2948.method3287(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method3401(var5);
                }
                this.field2948.method3279(var1);
                this.field2948.method3294(var1);
            }
            var1 = this.field2948.method3326();
            var2 = this.field2948.field2932[var1];
            var3 = this.field2948.method3284(var2);
        }
        this.field2970 = var1;
        this.field2972 = var2;
        this.field2962 = var3;
    }

    @ObfuscatedName("gt.an(Lgi;B)Z")
    public boolean method3445(class187 arg0) {
        if (arg0.field3009 != null) {
            return false;
        }
        if (arg0.field3004 >= 0) {
            arg0.method3625();
            if (arg0.field2994 > 0 && this.field2971[arg0.field3006][arg0.field2994] == arg0) {
                this.field2971[arg0.field3006][arg0.field2994] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("gt.bm(Lgi;[IIIB)Z")
    public boolean method3371(class187 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field3005 = Statics.field1199 / 100;
        if (arg0.field3004 >= 0 && arg0.field3009 == null || arg0.field3009.method1314()) {
            arg0.method3462();
            arg0.method3625();
            if (arg0.field2994 > 0 && this.field2971[arg0.field3006][arg0.field2994] == arg0) {
                this.field2971[arg0.field3006][arg0.field2994] = null;
            }
            return true;
        }
        int var5 = arg0.field3000;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2968[arg0.field3006] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field3000 = var6;
        }
        arg0.field3009.method1269(this.method3365(arg0));
        class185 var7 = arg0.field2993;
        boolean var8 = false;
        arg0.field2996++;
        arg0.field3007 += var7.field2983;
        double var9 = (double) ((arg0.field2998 - 60 << 8) + (arg0.field3000 * arg0.field2999 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2982 > 0) {
            if (var7.field2981 > 0) {
                arg0.field3001 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2981 * var9) + 0.5D);
            } else {
                arg0.field3001 += 128;
            }
        }
        if (var7.field2978 != null) {
            if (var7.field2979 > 0) {
                arg0.field3002 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2979 * var9) + 0.5D);
            } else {
                arg0.field3002 += 128;
            }
            while (arg0.field2990 < var7.field2978.length - 2 && arg0.field3002 > (var7.field2978[arg0.field2990 + 2] & 0xFF) << 8) {
                arg0.field2990 += 2;
            }
            if (arg0.field2990 == var7.field2978.length - 2 && var7.field2978[arg0.field2990 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field3004 >= 0 && var7.field2977 != null && (this.field2960[arg0.field3006] & 0x1) == 0 && (arg0.field2994 < 0 || this.field2971[arg0.field3006][arg0.field2994] != arg0)) {
            if (var7.field2980 > 0) {
                arg0.field3004 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2980 * var9) + 0.5D);
            } else {
                arg0.field3004 += 128;
            }
            while (arg0.field2995 < var7.field2977.length - 2 && arg0.field3004 > (var7.field2977[arg0.field2995 + 2] & 0xFF) << 8) {
                arg0.field2995 += 2;
            }
            if (arg0.field2995 == var7.field2977.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field3009.method1267(arg0.field3005, this.method3354(arg0), this.method3369(arg0));
            return false;
        }
        arg0.field3009.method1307(arg0.field3005);
        if (arg1 == null) {
            arg0.field3009.method1101(arg3);
        } else {
            arg0.field3009.method1109(arg1, arg2, arg3);
        }
        if (arg0.field3009.method1272()) {
            this.field2964.field2986.method1122(arg0.field3009);
        }
        arg0.method3462();
        if (arg0.field3004 >= 0) {
            arg0.method3625();
            if (arg0.field2994 > 0 && this.field2971[arg0.field3006][arg0.field2994] == arg0) {
                this.field2971[arg0.field3006][arg0.field2994] = null;
            }
        }
        return true;
    }
}
