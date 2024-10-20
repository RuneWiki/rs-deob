package deob;

@ObfuscatedName("io")
public class class249 extends class44 {

    @ObfuscatedName("io.i")
    public class380 field2948 = new class380(128);

    @ObfuscatedName("io.s")
    public int field2931 = 256;

    @ObfuscatedName("io.a")
    public int field2932 = 1000000;

    @ObfuscatedName("io.o")
    public int[] field2957 = new int[16];

    @ObfuscatedName("io.g")
    public int[] field2934 = new int[16];

    @ObfuscatedName("io.e")
    public int[] field2935 = new int[16];

    @ObfuscatedName("io.p")
    public int[] field2942 = new int[16];

    @ObfuscatedName("io.j")
    public int[] field2937 = new int[16];

    @ObfuscatedName("io.b")
    public int[] field2938 = new int[16];

    @ObfuscatedName("io.x")
    public int[] field2939 = new int[16];

    @ObfuscatedName("io.y")
    public int[] field2940 = new int[16];

    @ObfuscatedName("io.k")
    public int[] field2941 = new int[16];

    @ObfuscatedName("io.d")
    public int[] field2945 = new int[16];

    @ObfuscatedName("io.r")
    public int[] field2943 = new int[16];

    @ObfuscatedName("io.m")
    public int[] field2944 = new int[16];

    @ObfuscatedName("io.c")
    public int[] field2933 = new int[16];

    @ObfuscatedName("io.f")
    public int[] field2946 = new int[16];

    @ObfuscatedName("io.h")
    public int[] field2947 = new int[16];

    @ObfuscatedName("io.v")
    public class254[][] field2953 = new class254[16][128];

    @ObfuscatedName("io.ag")
    public class254[][] field2950 = new class254[16][128];

    @ObfuscatedName("io.ae")
    public class250 field2930 = new class250();

    @ObfuscatedName("io.aq")
    public boolean field2951;

    @ObfuscatedName("io.al")
    public int field2952;

    @ObfuscatedName("io.am")
    public int field2936;

    @ObfuscatedName("io.ai")
    public long field2954;

    @ObfuscatedName("io.ah")
    public long field2955;

    @ObfuscatedName("io.as")
    public class252 field2956 = new class252(this);

    public class249() {
        this.method4282();
    }

    @ObfuscatedName("io.i(II)V")
    public synchronized void method4353(int arg0) {
        this.field2931 = arg0;
    }

    @ObfuscatedName("io.w(B)I")
    public int method4264() {
        return this.field2931;
    }

    @ObfuscatedName("io.s(Liv;Lko;Lad;IB)Z")
    public synchronized boolean method4265(class253 arg0, class290 arg1, class41 arg2, int arg3) {
        arg0.method4451();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class367 var7 = (class367) arg0.field2985.method6028(); var7 != null; var7 = (class367) arg0.field2985.method6029()) {
            int var8 = (int) var7.field4075;
            class251 var9 = (class251) this.field2948.method6034((long) var8);
            if (var9 == null) {
                byte[] var10 = arg1.method4749(var8);
                class251 var11;
                if (var10 == null) {
                    var11 = null;
                } else {
                    var11 = new class251(var10);
                }
                var9 = var11;
                if (var11 == null) {
                    var5 = false;
                    continue;
                }
                this.field2948.method6027(var11, (long) var8);
            }
            if (!var9.method4435(arg2, var7.field4071, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method4458();
        }
        return var5;
    }

    @ObfuscatedName("io.a(B)V")
    public synchronized void method4352() {
        for (class251 var1 = (class251) this.field2948.method6028(); var1 != null; var1 = (class251) this.field2948.method6029()) {
            var1.method4433();
        }
    }

    @ObfuscatedName("io.o(B)V")
    public synchronized void method4272() {
        for (class251 var1 = (class251) this.field2948.method6028(); var1 != null; var1 = (class251) this.field2948.method6029()) {
            var1.method5752();
        }
    }

    @ObfuscatedName("io.b(Liv;ZI)V")
    public synchronized void method4320(class253 arg0, boolean arg1) {
        this.method4269();
        this.field2930.method4379(arg0.field2984);
        this.field2951 = arg1;
        this.field2954 = 0L;
        int var3 = this.field2930.method4382();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2930.method4383(var4);
            this.field2930.method4389(var4);
            this.field2930.method4378(var4);
        }
        this.field2952 = this.field2930.method4398();
        this.field2936 = this.field2930.field2962[this.field2952];
        this.field2955 = this.field2930.method4424(this.field2936);
    }

    @ObfuscatedName("io.y(B)V")
    public synchronized void method4269() {
        this.field2930.method4384();
        this.method4282();
    }

    @ObfuscatedName("io.k(I)Z")
    public synchronized boolean method4270() {
        return this.field2930.method4427();
    }

    @ObfuscatedName("io.t(III)V")
    public synchronized void method4271(int arg0, int arg1) {
        this.method4318(arg0, arg1);
    }

    @ObfuscatedName("io.l(IIB)V")
    public void method4318(int arg0, int arg1) {
        this.field2942[arg0] = arg1;
        this.field2938[arg0] = arg1 & 0xFFFFFF80;
        this.method4355(arg0, arg1);
    }

    @ObfuscatedName("io.u(IIB)V")
    public void method4355(int arg0, int arg1) {
        if (this.field2937[arg0] != arg1) {
            this.field2937[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2950[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("io.n(IIIB)V")
    public void method4274(int arg0, int arg1, int arg2) {
        this.method4339(arg0, arg1, 64);
        if ((this.field2945[arg0] & 0x2) != 0) {
            for (class254 var4 = (class254) this.field2956.field2980.method5004(); var4 != null; var4 = (class254) this.field2956.field2980.method4988()) {
                if (var4.field2997 == arg0 && var4.field3000 < 0) {
                    this.field2953[arg0][var4.field2991] = null;
                    this.field2953[arg0][arg1] = var4;
                    int var5 = (var4.field2999 * var4.field2998 >> 12) + var4.field2994;
                    var4.field2994 += arg1 - var4.field2991 << 8;
                    var4.field2998 = var5 - var4.field2994;
                    var4.field2999 = 4096;
                    var4.field2991 = arg1;
                    return;
                }
            }
        }
        class251 var6 = (class251) this.field2948.method6034((long) this.field2937[arg0]);
        if (var6 == null) {
            return;
        }
        class36 var7 = var6.field2979[arg1];
        if (var7 == null) {
            return;
        }
        class254 var8 = new class254();
        var8.field2997 = arg0;
        var8.field3006 = var6;
        var8.field2988 = var7;
        var8.field2989 = var6.field2977[arg1];
        var8.field2990 = var6.field2978[arg1];
        var8.field2991 = arg1;
        var8.field2992 = var6.field2974 * arg2 * arg2 * var6.field2975[arg1] + 1024 >> 11;
        var8.field2993 = var6.field2972[arg1] & 0xFF;
        var8.field2994 = (arg1 << 8) - (var6.field2973[arg1] & 0x7FFF);
        var8.field2987 = 0;
        var8.field3005 = 0;
        var8.field2995 = 0;
        var8.field3000 = -1;
        var8.field3001 = 0;
        if (this.field2933[arg0] == 0) {
            var8.field2986 = class43.method790(var7, this.method4287(var8), this.method4288(var8), this.method4289(var8));
        } else {
            var8.field2986 = class43.method790(var7, this.method4287(var8), 0, this.method4289(var8));
            this.method4275(var8, var6.field2973[arg1] < 0);
        }
        if (var6.field2973[arg1] < 0) {
            var8.field2986.method800(-1);
        }
        if (var8.field2990 >= 0) {
            class254 var9 = this.field2950[arg0][var8.field2990];
            if (var9 != null && var9.field3000 < 0) {
                this.field2953[arg0][var9.field2991] = null;
                var9.field3000 = 0;
            }
            this.field2950[arg0][var8.field2990] = var8;
        }
        this.field2956.field2980.method4980(var8);
        this.field2953[arg0][arg1] = var8;
    }

    @ObfuscatedName("io.z(Liu;ZI)V")
    public void method4275(class254 arg0, boolean arg1) {
        int var3 = arg0.field2988.field235.length;
        int var5;
        if (arg1 && arg0.field2988.field239) {
            int var4 = var3 + var3 - arg0.field2988.field237;
            var5 = (int) ((long) this.field2933[arg0.field2997] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field2986.method877(true);
            }
        } else {
            var5 = (int) ((long) this.field2933[arg0.field2997] * (long) var3 >> 6);
        }
        arg0.field2986.method797(var5);
    }

    @ObfuscatedName("io.q(IIII)V")
    public void method4339(int arg0, int arg1, int arg2) {
        class254 var4 = this.field2953[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2953[arg0][arg1] = null;
        if ((this.field2945[arg0] & 0x2) == 0) {
            var4.field3000 = 0;
            return;
        }
        for (class254 var5 = (class254) this.field2956.field2980.method4981(); var5 != null; var5 = (class254) this.field2956.field2980.method4987()) {
            if (var4.field2997 == var5.field2997 && var5.field3000 < 0 && var4 != var5) {
                var4.field3000 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("io.d(IIII)V")
    public void method4345(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("io.r(III)V")
    public void method4277(int arg0, int arg1) {
    }

    @ObfuscatedName("io.m(IIB)V")
    public void method4278(int arg0, int arg1) {
        this.field2939[arg0] = arg1;
    }

    @ObfuscatedName("io.c(II)V")
    public void method4279(int arg0) {
        for (class254 var2 = (class254) this.field2956.field2980.method4981(); var2 != null; var2 = (class254) this.field2956.field2980.method4987()) {
            if (arg0 < 0 || var2.field2997 == arg0) {
                if (var2.field2986 != null) {
                    var2.field2986.method802(Statics.field4360 / 100);
                    if (var2.field2986.method806()) {
                        this.field2956.field2982.method622(var2.field2986);
                    }
                    var2.method4462();
                }
                if (var2.field3000 < 0) {
                    this.field2953[var2.field2997][var2.field2991] = null;
                }
                var2.method5752();
            }
        }
    }

    @ObfuscatedName("io.f(IB)V")
    public void method4280(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method4280(var2);
            }
            return;
        }
        this.field2957[arg0] = 12800;
        this.field2934[arg0] = 8192;
        this.field2935[arg0] = 16383;
        this.field2939[arg0] = 8192;
        this.field2940[arg0] = 0;
        this.field2941[arg0] = 8192;
        this.method4283(arg0);
        this.method4284(arg0);
        this.field2945[arg0] = 0;
        this.field2943[arg0] = 32767;
        this.field2944[arg0] = 256;
        this.field2933[arg0] = 0;
        this.method4286(arg0, 8192);
    }

    @ObfuscatedName("io.h(IB)V")
    public void method4281(int arg0) {
        for (class254 var2 = (class254) this.field2956.field2980.method4981(); var2 != null; var2 = (class254) this.field2956.field2980.method4987()) {
            if ((arg0 < 0 || var2.field2997 == arg0) && var2.field3000 < 0) {
                this.field2953[var2.field2997][var2.field2991] = null;
                var2.field3000 = 0;
            }
        }
    }

    @ObfuscatedName("io.v(I)V")
    public void method4282() {
        this.method4279(-1);
        this.method4280(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2937[var1] = this.field2942[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2938[var2] = this.field2942[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("io.ab(II)V")
    public void method4283(int arg0) {
        if ((this.field2945[arg0] & 0x2) == 0) {
            return;
        }
        for (class254 var2 = (class254) this.field2956.field2980.method4981(); var2 != null; var2 = (class254) this.field2956.field2980.method4987()) {
            if (var2.field2997 == arg0 && this.field2953[arg0][var2.field2991] == null && var2.field3000 < 0) {
                var2.field3000 = 0;
            }
        }
    }

    @ObfuscatedName("io.ar(II)V")
    public void method4284(int arg0) {
        if ((this.field2945[arg0] & 0x4) == 0) {
            return;
        }
        for (class254 var2 = (class254) this.field2956.field2980.method4981(); var2 != null; var2 = (class254) this.field2956.field2980.method4987()) {
            if (var2.field2997 == arg0) {
                var2.field3004 = 0;
            }
        }
    }

    @ObfuscatedName("io.ad(IB)V")
    public void method4285(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method4339(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method4274(var6, var7, var8);
            } else {
                this.method4339(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method4345(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2938[var12] = (var14 << 14) + (this.field2938[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2938[var12] = (var14 << 7) + (this.field2938[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2940[var12] = (var14 << 7) + (this.field2940[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2940[var12] = (this.field2940[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2941[var12] = (var14 << 7) + (this.field2941[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2941[var12] = (this.field2941[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2957[var12] = (var14 << 7) + (this.field2957[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2957[var12] = (this.field2957[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2934[var12] = (var14 << 7) + (this.field2934[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2934[var12] = (this.field2934[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2935[var12] = (var14 << 7) + (this.field2935[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2935[var12] = (this.field2935[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field2945[var12] |= 0x1;
                } else {
                    this.field2945[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2945[var12] |= 0x2;
                } else {
                    this.method4283(var12);
                    this.field2945[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2943[var12] = (var14 << 7) + (this.field2943[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2943[var12] = (this.field2943[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2943[var12] = (var14 << 7) + (this.field2943[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2943[var12] = (this.field2943[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method4279(var12);
            }
            if (var13 == 121) {
                this.method4280(var12);
            }
            if (var13 == 123) {
                this.method4281(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2943[var12];
                if (var15 == 16384) {
                    this.field2944[var12] = (var14 << 7) + (this.field2944[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2943[var12];
                if (var16 == 16384) {
                    this.field2944[var12] = (this.field2944[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2933[var12] = (var14 << 7) + (this.field2933[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2933[var12] = (this.field2933[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2945[var12] |= 0x4;
                } else {
                    this.method4284(var12);
                    this.field2945[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method4286(var12, (var14 << 7) + (this.field2946[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method4286(var12, (this.field2946[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method4355(var17, this.field2938[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method4277(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
            this.method4278(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method4282();
            }
        }
    }

    @ObfuscatedName("io.an(III)V")
    public void method4286(int arg0, int arg1) {
        this.field2946[arg0] = arg1;
        this.field2947[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("io.aj(Liu;B)I")
    public int method4287(class254 arg0) {
        int var2 = (arg0.field2999 * arg0.field2998 >> 12) + arg0.field2994;
        int var3 = ((this.field2939[arg0.field2997] - 8192) * this.field2944[arg0.field2997] >> 12) + var2;
        class247 var4 = arg0.field2989;
        if (var4.field2912 > 0 && (var4.field2918 > 0 || this.field2940[arg0.field2997] > 0)) {
            int var5 = var4.field2918 << 2;
            int var6 = var4.field2920 << 1;
            if (arg0.field3002 < var6) {
                var5 = arg0.field3002 * var5 / var6;
            }
            int var7 = (this.field2940[arg0.field2997] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field3003 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field2988.field238 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field4360 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("io.af(Liu;B)I")
    public int method4288(class254 arg0) {
        class247 var2 = arg0.field2989;
        int var3 = this.field2935[arg0.field2997] * this.field2957[arg0.field2997] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field2992 * var4 + 16384 >> 15;
        int var6 = this.field2931 * var5 + 128 >> 8;
        if (var2.field2914 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field2987 * 1.953125E-5D * (double) var2.field2914) + 0.5D);
        }
        if (var2.field2917 != null) {
            int var7 = arg0.field3005;
            int var8 = var2.field2917[arg0.field2995 + 1];
            if (arg0.field2995 < var2.field2917.length - 2) {
                int var9 = (var2.field2917[arg0.field2995] & 0xFF) << 8;
                int var10 = (var2.field2917[arg0.field2995 + 2] & 0xFF) << 8;
                var8 += (var2.field2917[arg0.field2995 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field3000 > 0 && var2.field2915 != null) {
            int var11 = arg0.field3000;
            int var12 = var2.field2915[arg0.field3001 + 1];
            if (arg0.field3001 < var2.field2915.length - 2) {
                int var13 = (var2.field2915[arg0.field3001] & 0xFF) << 8;
                int var14 = (var2.field2915[arg0.field3001 + 2] & 0xFF) << 8;
                var12 += (var2.field2915[arg0.field3001 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("io.aw(Liu;I)I")
    public int method4289(class254 arg0) {
        int var2 = this.field2934[arg0.field2997];
        return var2 < 8192 ? arg0.field2993 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field2993) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("io.g()Lav;")
    public synchronized class44 method626() {
        return this.field2956;
    }

    @ObfuscatedName("io.e()Lav;")
    public synchronized class44 method627() {
        return null;
    }

    @ObfuscatedName("io.p()I")
    public synchronized int method628() {
        return 0;
    }

    @ObfuscatedName("io.j([III)V")
    public synchronized void method640(int[] arg0, int arg1, int arg2) {
        if (this.field2930.method4427()) {
            int var4 = this.field2932 * this.field2930.field2959 / Statics.field4360;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2954;
                if (this.field2955 - var5 >= 0L) {
                    this.field2954 = var5;
                    break;
                }
                int var7 = (int) ((this.field2955 - this.field2954 + (long) var4 - 1L) / (long) var4);
                this.field2954 += (long) var4 * (long) var7;
                this.field2956.method640(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method4268();
            } while (this.field2930.method4427());
        }
        this.field2956.method640(arg0, arg1, arg2);
    }

    @ObfuscatedName("io.x(I)V")
    public synchronized void method631(int arg0) {
        if (this.field2930.method4427()) {
            int var2 = this.field2932 * this.field2930.field2959 / Statics.field4360;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2954;
                if (this.field2955 - var3 >= 0L) {
                    this.field2954 = var3;
                    break;
                }
                int var5 = (int) ((this.field2955 - this.field2954 + (long) var2 - 1L) / (long) var2);
                this.field2954 += (long) var2 * (long) var5;
                this.field2956.method631(var5);
                arg0 -= var5;
                this.method4268();
            } while (this.field2930.method4427());
        }
        this.field2956.method631(arg0);
    }

    @ObfuscatedName("io.ao(B)V")
    public void method4268() {
        int var1 = this.field2952;
        int var2 = this.field2936;
        long var3 = this.field2955;
        while (this.field2936 == var2) {
            while (this.field2930.field2962[var1] == var2) {
                this.field2930.method4383(var1);
                int var5 = this.field2930.method4387(var1);
                if (var5 == 1) {
                    this.field2930.method4385();
                    this.field2930.method4378(var1);
                    if (this.field2930.method4391()) {
                        if (!this.field2951 || var2 == 0) {
                            this.method4282();
                            this.field2930.method4384();
                            return;
                        }
                        this.field2930.method4392(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method4285(var5);
                }
                this.field2930.method4389(var1);
                this.field2930.method4378(var1);
            }
            var1 = this.field2930.method4398();
            var2 = this.field2930.field2962[var1];
            var3 = this.field2930.method4424(var2);
        }
        this.field2952 = var1;
        this.field2936 = var2;
        this.field2955 = var3;
    }

    @ObfuscatedName("io.aa(Liu;I)Z")
    public boolean method4294(class254 arg0) {
        if (arg0.field2986 != null) {
            return false;
        }
        if (arg0.field3000 >= 0) {
            arg0.method5752();
            if (arg0.field2990 > 0 && this.field2950[arg0.field2997][arg0.field2990] == arg0) {
                this.field2950[arg0.field2997][arg0.field2990] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("io.ay(Liu;[IIII)Z")
    public boolean method4295(class254 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field2996 = Statics.field4360 / 100;
        if (arg0.field3000 >= 0 && arg0.field2986 == null || arg0.field2986.method805()) {
            arg0.method4462();
            arg0.method5752();
            if (arg0.field2990 > 0 && this.field2950[arg0.field2997][arg0.field2990] == arg0) {
                this.field2950[arg0.field2997][arg0.field2990] = null;
            }
            return true;
        }
        int var5 = arg0.field2999;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2941[arg0.field2997] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field2999 = var6;
        }
        arg0.field2986.method868(this.method4287(arg0));
        class247 var7 = arg0.field2989;
        boolean var8 = false;
        arg0.field3002++;
        arg0.field3003 += var7.field2912;
        double var9 = (double) ((arg0.field2991 - 60 << 8) + (arg0.field2999 * arg0.field2998 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2914 > 0) {
            if (var7.field2913 > 0) {
                arg0.field2987 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2913 * var9) + 0.5D);
            } else {
                arg0.field2987 += 128;
            }
        }
        if (var7.field2917 != null) {
            if (var7.field2919 > 0) {
                arg0.field3005 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2919 * var9) + 0.5D);
            } else {
                arg0.field3005 += 128;
            }
            while (arg0.field2995 < var7.field2917.length - 2 && arg0.field3005 > (var7.field2917[arg0.field2995 + 2] & 0xFF) << 8) {
                arg0.field2995 += 2;
            }
            if (arg0.field2995 == var7.field2917.length - 2 && var7.field2917[arg0.field2995 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field3000 >= 0 && var7.field2915 != null && (this.field2945[arg0.field2997] & 0x1) == 0 && (arg0.field2990 < 0 || this.field2950[arg0.field2997][arg0.field2990] != arg0)) {
            if (var7.field2916 > 0) {
                arg0.field3000 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2916 * var9) + 0.5D);
            } else {
                arg0.field3000 += 128;
            }
            while (arg0.field3001 < var7.field2915.length - 2 && arg0.field3000 > (var7.field2915[arg0.field3001 + 2] & 0xFF) << 8) {
                arg0.field3001 += 2;
            }
            if (arg0.field3001 == var7.field2915.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field2986.method801(arg0.field2996, this.method4288(arg0), this.method4289(arg0));
            return false;
        }
        arg0.field2986.method802(arg0.field2996);
        if (arg1 == null) {
            arg0.field2986.method631(arg3);
        } else {
            arg0.field2986.method640(arg1, arg2, arg3);
        }
        if (arg0.field2986.method806()) {
            this.field2956.field2982.method622(arg0.field2986);
        }
        arg0.method4462();
        if (arg0.field3000 >= 0) {
            arg0.method5752();
            if (arg0.field2990 > 0 && this.field2950[arg0.field2997][arg0.field2990] == arg0) {
                this.field2950[arg0.field2997][arg0.field2990] = null;
            }
        }
        return true;
    }
}
