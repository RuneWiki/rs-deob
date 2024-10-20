package deob;

@ObfuscatedName("fk")
public class class175 extends class62 {

    @ObfuscatedName("fk.n")
    public class187 field2882 = new class187(128);

    @ObfuscatedName("fk.i")
    public int field2865 = 256;

    @ObfuscatedName("fk.e")
    public int field2866 = 1000000;

    @ObfuscatedName("fk.h")
    public int[] field2871 = new int[16];

    @ObfuscatedName("fk.q")
    public int[] field2886 = new int[16];

    @ObfuscatedName("fk.l")
    public int[] field2869 = new int[16];

    @ObfuscatedName("fk.c")
    public int[] field2870 = new int[16];

    @ObfuscatedName("fk.f")
    public int[] field2889 = new int[16];

    @ObfuscatedName("fk.s")
    public int[] field2872 = new int[16];

    @ObfuscatedName("fk.m")
    public int[] field2873 = new int[16];

    @ObfuscatedName("fk.y")
    public int[] field2874 = new int[16];

    @ObfuscatedName("fk.b")
    public int[] field2875 = new int[16];

    @ObfuscatedName("fk.a")
    public int[] field2877 = new int[16];

    @ObfuscatedName("fk.p")
    public int[] field2891 = new int[16];

    @ObfuscatedName("fk.t")
    public int[] field2879 = new int[16];

    @ObfuscatedName("fk.x")
    public int[] field2880 = new int[16];

    @ObfuscatedName("fk.d")
    public int[] field2881 = new int[16];

    @ObfuscatedName("fk.j")
    public int[] field2883 = new int[16];

    @ObfuscatedName("fk.r")
    public class178[][] field2864 = new class178[16][128];

    @ObfuscatedName("fk.at")
    public class178[][] field2878 = new class178[16][128];

    @ObfuscatedName("fk.av")
    public class173 field2868 = new class173();

    @ObfuscatedName("fk.ar")
    public boolean field2876;

    @ObfuscatedName("fk.aq")
    public int field2887;

    @ObfuscatedName("fk.as")
    public int field2888;

    @ObfuscatedName("fk.ad")
    public long field2885;

    @ObfuscatedName("fk.ap")
    public long field2890;

    @ObfuscatedName("fk.an")
    public class177 field2867 = new class177(this);

    public class175() {
        this.method3208();
    }

    @ObfuscatedName("fk.n(IB)V")
    public synchronized void method3188(int arg0) {
        this.field2865 = arg0;
    }

    @ObfuscatedName("fk.w(B)I")
    public int method3189() {
        return this.field2865;
    }

    @ObfuscatedName("fk.i(Lfv;Lfd;Lbw;II)Z")
    public synchronized boolean method3190(class171 arg0, class158 arg1, class55 arg2, int arg3) {
        arg0.method3086();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class188 var7 = (class188) arg0.field2828.method3345(); var7 != null; var7 = (class188) arg0.field2828.method3358()) {
            int var8 = (int) var7.field3013;
            class172 var9 = (class172) this.field2882.method3354((long) var8);
            if (var9 == null) {
                var9 = class172.method2803(arg1, var8);
                if (var9 == null) {
                    var5 = false;
                    continue;
                }
                this.field2882.method3346(var9, (long) var8);
            }
            if (!var9.method3095(arg2, var7.field2992, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method3085();
        }
        return var5;
    }

    @ObfuscatedName("fk.e(I)V")
    public synchronized void method3271() {
        for (class172 var1 = (class172) this.field2882.method3345(); var1 != null; var1 = (class172) this.field2882.method3358()) {
            var1.method3100();
        }
    }

    @ObfuscatedName("fk.h(I)V")
    public synchronized void method3192() {
        for (class172 var1 = (class172) this.field2882.method3345(); var1 != null; var1 = (class172) this.field2882.method3358()) {
            var1.method3474();
        }
    }

    @ObfuscatedName("fk.s(Lfv;ZI)V")
    public synchronized void method3193(class171 arg0, boolean arg1) {
        this.method3243();
        this.field2868.method3154(arg0.field2829);
        this.field2876 = arg1;
        this.field2885 = 0L;
        int var3 = this.field2868.method3109();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2868.method3113(var4);
            this.field2868.method3116(var4);
            this.field2868.method3156(var4);
        }
        this.field2887 = this.field2868.method3140();
        this.field2888 = this.field2868.field2850[this.field2887];
        this.field2890 = this.field2868.method3132(this.field2888);
    }

    @ObfuscatedName("fk.y(I)V")
    public synchronized void method3243() {
        this.field2868.method3110();
        this.method3208();
    }

    @ObfuscatedName("fk.b(I)Z")
    public synchronized boolean method3195() {
        return this.field2868.method3112();
    }

    @ObfuscatedName("fk.v(IIB)V")
    public synchronized void method3252(int arg0, int arg1) {
        this.method3220(arg0, arg1);
    }

    @ObfuscatedName("fk.z(IIB)V")
    public void method3220(int arg0, int arg1) {
        this.field2870[arg0] = arg1;
        this.field2872[arg0] = arg1 & 0xFFFFFF80;
        this.method3253(arg0, arg1);
    }

    @ObfuscatedName("fk.u(III)V")
    public void method3253(int arg0, int arg1) {
        if (this.field2889[arg0] != arg1) {
            this.field2889[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2878[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("fk.g(IIIB)V")
    public void method3199(int arg0, int arg1, int arg2) {
        this.method3258(arg0, arg1, 64);
        if ((this.field2877[arg0] & 0x2) != 0) {
            for (class178 var4 = (class178) this.field2867.field2904.method3383(); var4 != null; var4 = (class178) this.field2867.field2904.method3390()) {
                if (var4.field2927 == arg0 && var4.field2922 < 0) {
                    this.field2864[arg0][var4.field2913] = null;
                    this.field2864[arg0][arg1] = var4;
                    int var5 = (var4.field2918 * var4.field2909 >> 12) + var4.field2928;
                    var4.field2928 += arg1 - var4.field2913 << 8;
                    var4.field2909 = var5 - var4.field2928;
                    var4.field2918 = 4096;
                    var4.field2913 = arg1;
                    return;
                }
            }
        }
        class172 var6 = (class172) this.field2882.method3354((long) this.field2889[arg0]);
        if (var6 == null) {
            return;
        }
        class58 var7 = var6.field2831[arg1];
        if (var7 == null) {
            return;
        }
        class178 var8 = new class178();
        var8.field2927 = arg0;
        var8.field2923 = var6;
        var8.field2910 = var7;
        var8.field2925 = var6.field2835[arg1];
        var8.field2912 = var6.field2836[arg1];
        var8.field2913 = arg1;
        var8.field2914 = var6.field2834 * arg2 * arg2 * var6.field2839[arg1] + 1024 >> 11;
        var8.field2916 = var6.field2838[arg1] & 0xFF;
        var8.field2928 = (arg1 << 8) - (var6.field2832[arg1] & 0x7FFF);
        var8.field2919 = 0;
        var8.field2920 = 0;
        var8.field2917 = 0;
        var8.field2922 = -1;
        var8.field2908 = 0;
        if (this.field2880[arg0] == 0) {
            var8.field2911 = class60.method1139(var7, this.method3207(var8), this.method3214(var8), this.method3213(var8));
        } else {
            var8.field2911 = class60.method1139(var7, this.method3207(var8), 0, this.method3213(var8));
            this.method3200(var8, var6.field2832[arg1] < 0);
        }
        if (var6.field2832[arg1] < 0) {
            var8.field2911.method1176(-1);
        }
        if (var8.field2912 >= 0) {
            class178 var9 = this.field2878[arg0][var8.field2912];
            if (var9 != null && var9.field2922 < 0) {
                this.field2864[arg0][var9.field2913] = null;
                var9.field2922 = 0;
            }
            this.field2878[arg0][var8.field2912] = var8;
        }
        this.field2867.field2904.method3377(var8);
        this.field2864[arg0][arg1] = var8;
    }

    @ObfuscatedName("fk.k(Lfo;ZI)V")
    public void method3200(class178 arg0, boolean arg1) {
        int var3 = arg0.field2910.field1162.length;
        int var5;
        if (arg1 && arg0.field2910.field1161) {
            int var4 = var3 + var3 - arg0.field2910.field1163;
            var5 = (int) ((long) this.field2880[arg0.field2927] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field2911.method1148(true);
            }
        } else {
            var5 = (int) ((long) this.field2880[arg0.field2927] * (long) var3 >> 6);
        }
        arg0.field2911.method1147(var5);
    }

    @ObfuscatedName("fk.o(IIII)V")
    public void method3258(int arg0, int arg1, int arg2) {
        class178 var4 = this.field2864[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2864[arg0][arg1] = null;
        if ((this.field2877[arg0] & 0x2) == 0) {
            var4.field2922 = 0;
            return;
        }
        for (class178 var5 = (class178) this.field2867.field2904.method3382(); var5 != null; var5 = (class178) this.field2867.field2904.method3384()) {
            if (var4.field2927 == var5.field2927 && var5.field2922 < 0 && var4 != var5) {
                var4.field2922 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("fk.a(IIII)V")
    public void method3202(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("fk.p(III)V")
    public void method3203(int arg0, int arg1) {
    }

    @ObfuscatedName("fk.t(IIB)V")
    public void method3204(int arg0, int arg1) {
        this.field2873[arg0] = arg1;
    }

    @ObfuscatedName("fk.ad(II)V")
    public void method3205(int arg0) {
        for (class178 var2 = (class178) this.field2867.field2904.method3382(); var2 != null; var2 = (class178) this.field2867.field2904.method3384()) {
            if (arg0 < 0 || var2.field2927 == arg0) {
                if (var2.field2911 != null) {
                    var2.field2911.method1152(Statics.field1118 / 100);
                    if (var2.field2911.method1156()) {
                        this.field2867.field2905.method1000(var2.field2911);
                    }
                    var2.method3300();
                }
                if (var2.field2922 < 0) {
                    this.field2864[var2.field2927][var2.field2913] = null;
                }
                var2.method3474();
            }
        }
    }

    @ObfuscatedName("fk.aw(IB)V")
    public void method3198(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method3198(var2);
            }
            return;
        }
        this.field2871[arg0] = 12800;
        this.field2886[arg0] = 8192;
        this.field2869[arg0] = 16383;
        this.field2873[arg0] = 8192;
        this.field2874[arg0] = 0;
        this.field2875[arg0] = 8192;
        this.method3209(arg0);
        this.method3210(arg0);
        this.field2877[arg0] = 0;
        this.field2891[arg0] = 32767;
        this.field2879[arg0] = 256;
        this.field2880[arg0] = 0;
        this.method3212(arg0, 8192);
    }

    @ObfuscatedName("fk.ag(II)V")
    public void method3279(int arg0) {
        for (class178 var2 = (class178) this.field2867.field2904.method3382(); var2 != null; var2 = (class178) this.field2867.field2904.method3384()) {
            if ((arg0 < 0 || var2.field2927 == arg0) && var2.field2922 < 0) {
                this.field2864[var2.field2927][var2.field2913] = null;
                var2.field2922 = 0;
            }
        }
    }

    @ObfuscatedName("fk.ao(I)V")
    public void method3208() {
        this.method3205(-1);
        this.method3198(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2889[var1] = this.field2870[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2872[var2] = this.field2870[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("fk.ac(IB)V")
    public void method3209(int arg0) {
        if ((this.field2877[arg0] & 0x2) == 0) {
            return;
        }
        for (class178 var2 = (class178) this.field2867.field2904.method3382(); var2 != null; var2 = (class178) this.field2867.field2904.method3384()) {
            if (var2.field2927 == arg0 && this.field2864[arg0][var2.field2913] == null && var2.field2922 < 0) {
                var2.field2922 = 0;
            }
        }
    }

    @ObfuscatedName("fk.af(II)V")
    public void method3210(int arg0) {
        if ((this.field2877[arg0] & 0x4) == 0) {
            return;
        }
        for (class178 var2 = (class178) this.field2867.field2904.method3382(); var2 != null; var2 = (class178) this.field2867.field2904.method3384()) {
            if (var2.field2927 == arg0) {
                var2.field2921 = 0;
            }
        }
    }

    @ObfuscatedName("fk.ab(II)V")
    public void method3211(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method3258(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method3199(var6, var7, var8);
            } else {
                this.method3258(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method3202(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2872[var12] = (var14 << 14) + (this.field2872[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2872[var12] = (var14 << 7) + (this.field2872[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2874[var12] = (var14 << 7) + (this.field2874[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2874[var12] = (this.field2874[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2875[var12] = (var14 << 7) + (this.field2875[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2875[var12] = (this.field2875[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2871[var12] = (var14 << 7) + (this.field2871[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2871[var12] = (this.field2871[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2886[var12] = (var14 << 7) + (this.field2886[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2886[var12] = (this.field2886[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2869[var12] = (var14 << 7) + (this.field2869[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2869[var12] = (this.field2869[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field2877[var12] |= 0x1;
                } else {
                    this.field2877[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2877[var12] |= 0x2;
                } else {
                    this.method3209(var12);
                    this.field2877[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2891[var12] = (var14 << 7) + (this.field2891[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2891[var12] = (this.field2891[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2891[var12] = (var14 << 7) + (this.field2891[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2891[var12] = (this.field2891[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method3205(var12);
            }
            if (var13 == 121) {
                this.method3198(var12);
            }
            if (var13 == 123) {
                this.method3279(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2891[var12];
                if (var15 == 16384) {
                    this.field2879[var12] = (var14 << 7) + (this.field2879[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2891[var12];
                if (var16 == 16384) {
                    this.field2879[var12] = (this.field2879[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2880[var12] = (var14 << 7) + (this.field2880[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2880[var12] = (this.field2880[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2877[var12] |= 0x4;
                } else {
                    this.method3210(var12);
                    this.field2877[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method3212(var12, (var14 << 7) + (this.field2881[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method3212(var12, (this.field2881[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method3253(var17, this.field2872[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method3203(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
            this.method3204(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method3208();
            }
        }
    }

    @ObfuscatedName("fk.ai(III)V")
    public void method3212(int arg0, int arg1) {
        this.field2881[arg0] = arg1;
        this.field2883[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("fk.ay(Lfo;B)I")
    public int method3207(class178 arg0) {
        int var2 = (arg0.field2918 * arg0.field2909 >> 12) + arg0.field2928;
        int var3 = ((this.field2873[arg0.field2927] - 8192) * this.field2879[arg0.field2927] >> 12) + var2;
        class176 var4 = arg0.field2925;
        if (var4.field2899 > 0 && (var4.field2900 > 0 || this.field2874[arg0.field2927] > 0)) {
            int var5 = var4.field2900 << 2;
            int var6 = var4.field2902 << 1;
            if (arg0.field2924 < var6) {
                var5 = arg0.field2924 * var5 / var6;
            }
            int var7 = (this.field2874[arg0.field2927] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field2926 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field2910.field1165 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field1118 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("fk.ak(Lfo;I)I")
    public int method3214(class178 arg0) {
        class176 var2 = arg0.field2925;
        int var3 = this.field2871[arg0.field2927] * this.field2869[arg0.field2927] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field2914 * var4 + 16384 >> 15;
        int var6 = this.field2865 * var5 + 128 >> 8;
        if (var2.field2894 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field2919 * 1.953125E-5D * (double) var2.field2894) + 0.5D);
        }
        if (var2.field2892 != null) {
            int var7 = arg0.field2920;
            int var8 = var2.field2892[arg0.field2917 + 1];
            if (arg0.field2917 < var2.field2892.length - 2) {
                int var9 = (var2.field2892[arg0.field2917] & 0xFF) << 8;
                int var10 = (var2.field2892[arg0.field2917 + 2] & 0xFF) << 8;
                var8 += (var2.field2892[arg0.field2917 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field2922 > 0 && var2.field2898 != null) {
            int var11 = arg0.field2922;
            int var12 = var2.field2898[arg0.field2908 + 1];
            if (arg0.field2908 < var2.field2898.length - 2) {
                int var13 = (var2.field2898[arg0.field2908] & 0xFF) << 8;
                int var14 = (var2.field2898[arg0.field2908 + 2] & 0xFF) << 8;
                var12 += (var2.field2898[arg0.field2908 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("fk.aj(Lfo;I)I")
    public int method3213(class178 arg0) {
        int var2 = this.field2886[arg0.field2927];
        return var2 < 8192 ? arg0.field2916 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field2916) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("fk.q()Lba;")
    public synchronized class62 method1005() {
        return this.field2867;
    }

    @ObfuscatedName("fk.l()Lba;")
    public synchronized class62 method1006() {
        return null;
    }

    @ObfuscatedName("fk.c()I")
    public synchronized int method1007() {
        return 0;
    }

    @ObfuscatedName("fk.f([III)V")
    public synchronized void method1008(int[] arg0, int arg1, int arg2) {
        if (this.field2868.method3112()) {
            int var4 = this.field2866 * this.field2868.field2854 / Statics.field1118;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2885;
                if (this.field2890 - var5 >= 0L) {
                    this.field2885 = var5;
                    break;
                }
                int var7 = (int) ((this.field2890 - this.field2885 + (long) var4 - 1L) / (long) var4);
                this.field2885 += (long) var4 * (long) var7;
                this.field2867.method1008(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method3216();
            } while (this.field2868.method3112());
        }
        this.field2867.method1008(arg0, arg1, arg2);
    }

    @ObfuscatedName("fk.m(I)V")
    public synchronized void method1010(int arg0) {
        if (this.field2868.method3112()) {
            int var2 = this.field2866 * this.field2868.field2854 / Statics.field1118;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2885;
                if (this.field2890 - var3 >= 0L) {
                    this.field2885 = var3;
                    break;
                }
                int var5 = (int) ((this.field2890 - this.field2885 + (long) var2 - 1L) / (long) var2);
                this.field2885 += (long) var2 * (long) var5;
                this.field2867.method1010(var5);
                arg0 -= var5;
                this.method3216();
            } while (this.field2868.method3112());
        }
        this.field2867.method1010(arg0);
    }

    @ObfuscatedName("fk.az(I)V")
    public void method3216() {
        int var1 = this.field2887;
        int var2 = this.field2888;
        long var3 = this.field2890;
        while (this.field2888 == var2) {
            while (this.field2868.field2850[var1] == var2) {
                this.field2868.method3113(var1);
                int var5 = this.field2868.method3111(var1);
                if (var5 == 1) {
                    this.field2868.method3120();
                    this.field2868.method3156(var1);
                    if (this.field2868.method3122()) {
                        if (!this.field2876 || var2 == 0) {
                            this.method3208();
                            this.field2868.method3110();
                            return;
                        }
                        this.field2868.method3123(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method3211(var5);
                }
                this.field2868.method3116(var1);
                this.field2868.method3156(var1);
            }
            var1 = this.field2868.method3140();
            var2 = this.field2868.field2850[var1];
            var3 = this.field2868.method3132(var2);
        }
        this.field2887 = var1;
        this.field2888 = var2;
        this.field2890 = var3;
    }

    @ObfuscatedName("fk.am(Lfo;I)Z")
    public boolean method3282(class178 arg0) {
        if (arg0.field2911 != null) {
            return false;
        }
        if (arg0.field2922 >= 0) {
            arg0.method3474();
            if (arg0.field2912 > 0 && this.field2878[arg0.field2927][arg0.field2912] == arg0) {
                this.field2878[arg0.field2927][arg0.field2912] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("fk.ax(Lfo;[IIII)Z")
    public boolean method3217(class178 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field2915 = Statics.field1118 / 100;
        if (arg0.field2922 >= 0 && arg0.field2911 == null || arg0.field2911.method1220()) {
            arg0.method3300();
            arg0.method3474();
            if (arg0.field2912 > 0 && this.field2878[arg0.field2927][arg0.field2912] == arg0) {
                this.field2878[arg0.field2927][arg0.field2912] = null;
            }
            return true;
        }
        int var5 = arg0.field2918;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2875[arg0.field2927] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field2918 = var6;
        }
        arg0.field2911.method1153(this.method3207(arg0));
        class176 var7 = arg0.field2925;
        boolean var8 = false;
        arg0.field2924++;
        arg0.field2926 += var7.field2899;
        double var9 = (double) ((arg0.field2913 - 60 << 8) + (arg0.field2918 * arg0.field2909 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2894 > 0) {
            if (var7.field2897 > 0) {
                arg0.field2919 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2897 * var9) + 0.5D);
            } else {
                arg0.field2919 += 128;
            }
        }
        if (var7.field2892 != null) {
            if (var7.field2893 > 0) {
                arg0.field2920 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2893 * var9) + 0.5D);
            } else {
                arg0.field2920 += 128;
            }
            while (arg0.field2917 < var7.field2892.length - 2 && arg0.field2920 > (var7.field2892[arg0.field2917 + 2] & 0xFF) << 8) {
                arg0.field2917 += 2;
            }
            if (arg0.field2917 == var7.field2892.length - 2 && var7.field2892[arg0.field2917 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field2922 >= 0 && var7.field2898 != null && (this.field2877[arg0.field2927] & 0x1) == 0 && (arg0.field2912 < 0 || this.field2878[arg0.field2927][arg0.field2912] != arg0)) {
            if (var7.field2896 > 0) {
                arg0.field2922 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2896 * var9) + 0.5D);
            } else {
                arg0.field2922 += 128;
            }
            while (arg0.field2908 < var7.field2898.length - 2 && arg0.field2922 > (var7.field2898[arg0.field2908 + 2] & 0xFF) << 8) {
                arg0.field2908 += 2;
            }
            if (arg0.field2908 == var7.field2898.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field2911.method1151(arg0.field2915, this.method3214(arg0), this.method3213(arg0));
            return false;
        }
        arg0.field2911.method1152(arg0.field2915);
        if (arg1 == null) {
            arg0.field2911.method1010(arg3);
        } else {
            arg0.field2911.method1008(arg1, arg2, arg3);
        }
        if (arg0.field2911.method1156()) {
            this.field2867.field2905.method1000(arg0.field2911);
        }
        arg0.method3300();
        if (arg0.field2922 >= 0) {
            arg0.method3474();
            if (arg0.field2912 > 0 && this.field2878[arg0.field2927][arg0.field2912] == arg0) {
                this.field2878[arg0.field2927][arg0.field2912] = null;
            }
        }
        return true;
    }
}
