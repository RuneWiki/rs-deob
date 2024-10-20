package deob;

import java.awt.Component;

@ObfuscatedName("ae")
public class class185 {

    @ObfuscatedName("ae.g")
    public class183 field2833;

    @ObfuscatedName("ae.e")
    public long field2834 = class38.method2385();

    @ObfuscatedName("ae.a")
    public long field2842 = 0L;

    @ObfuscatedName("ae.n")
    public int field2826 = 0;

    @ObfuscatedName("ae.o")
    public int field2841 = 32;

    @ObfuscatedName("ae.i")
    public int field2837;

    @ObfuscatedName("ae.u")
    public int field2854 = 0;

    @ObfuscatedName("ae.r")
    public long field2838 = 0L;

    @ObfuscatedName("ae.q")
    public int field2835;

    @ObfuscatedName("ae.p")
    public boolean field2853 = true;

    @ObfuscatedName("ae.z")
    public int field2843;

    @ObfuscatedName("ae.y")
    public int field2839 = 0;

    @ObfuscatedName("ae.x")
    public int[] field2831;

    @ObfuscatedName("ae.aq")
    public class183[] field2847 = new class183[8];

    @ObfuscatedName("ae.aw")
    public int field2846 = 0;

    @ObfuscatedName("ae.ak")
    public class183[] field2848 = new class183[8];

    @ObfuscatedName("ae.m(Lag;I)V")
    public final synchronized void method3357(class183 arg0) {
        this.field2833 = arg0;
    }

    @ObfuscatedName("ae.c(I)V")
    public final synchronized void method3358() {
        if (this.field2831 == null) {
            return;
        }
        long var1 = class38.method2385();
        try {
            if (this.field2838 != 0L) {
                if (var1 < this.field2838) {
                    return;
                }
                this.method2758(this.field2835);
                this.field2838 = 0L;
                this.field2853 = true;
            }
            int var3 = this.method2761();
            if (this.field2839 - var3 > this.field2826) {
                this.field2826 = this.field2839 - var3;
            }
            int var4 = this.field2843 + this.field2837;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field2835) {
                this.field2835 += 1024;
                if (this.field2835 > 16384) {
                    this.field2835 = 16384;
                }
                this.method2759();
                this.method2758(this.field2835);
                var3 = 0;
                this.field2853 = true;
                if (var4 + 256 > this.field2835) {
                    var4 = this.field2835 - 256;
                    this.field2837 = var4 - this.field2843;
                }
            }
            while (var3 < var4) {
                this.method3362(this.field2831, 256);
                this.method2756();
                var3 += 256;
            }
            if (var1 > this.field2842) {
                if (this.field2853) {
                    this.field2853 = false;
                } else if (this.field2826 == 0 && this.field2854 == 0) {
                    this.method2759();
                    this.field2838 = var1 + 2000L;
                    return;
                } else {
                    this.field2837 = Math.min(this.field2854, this.field2826);
                    this.field2854 = this.field2826;
                }
                this.field2826 = 0;
                this.field2842 = var1 + 2000L;
            }
            this.field2839 = var3;
        } catch (Exception var8) {
            this.method2759();
            this.field2838 = var1 + 2000L;
        }
        try {
            if (var1 > this.field2834 + 500000L) {
                var1 = this.field2834;
            }
            while (var1 > this.field2834 + 5000L) {
                this.method3361(256);
                this.field2834 += (long) (256000 / Statics.field2840);
            }
        } catch (Exception var7) {
            this.field2834 = var1;
        }
    }

    @ObfuscatedName("ae.ac(I)V")
    public final synchronized void method3359() {
        this.field2853 = true;
        try {
            this.method2769();
        } catch (Exception var2) {
            this.method2759();
            this.field2838 = class38.method2385() + 2000L;
        }
    }

    @ObfuscatedName("ae.ax(B)V")
    public final synchronized void method3360() {
        if (Statics.field2828 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field2828.field1909[var2] == this) {
                    Statics.field2828.field1909[var2] = null;
                }
                if (Statics.field2828.field1909[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field2828.field1908 = true;
                while (Statics.field2828.field1911) {
                    class134.method600(50L);
                }
                Statics.field2828 = null;
            }
        }
        this.method2759();
        this.field2831 = null;
    }

    @ObfuscatedName("ae.aw(II)V")
    public final void method3361(int arg0) {
        this.field2846 -= arg0;
        if (this.field2846 < 0) {
            this.field2846 = 0;
        }
        if (this.field2833 != null) {
            this.field2833.method995(arg0);
        }
    }

    @ObfuscatedName("ae.aq([II)V")
    public final void method3362(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field2825) {
            var3 = arg1 << 1;
        }
        class47.method616(arg0, 0, var3);
        this.field2846 -= arg1;
        if (this.field2833 != null && this.field2846 <= 0) {
            this.field2846 += Statics.field2840 >> 4;
            method1200(this.field2833);
            this.method3366(this.field2833, this.field2833.method3263());
            int var4 = 0;
            int var5 = 255;
            int var6 = 7;
            label105: while (var5 != 0) {
                int var7;
                int var8;
                if (var6 < 0) {
                    var7 = var6 & 0x3;
                    var8 = -(var6 >> 2);
                } else {
                    var7 = var6;
                    var8 = 0;
                }
                for (int var9 = var5 >>> var7 & 0x11111111; var9 != 0; var9 >>>= 0x4) {
                    if ((var9 & 0x1) != 0) {
                        var5 &= ~(0x1 << var7);
                        class183 var10 = null;
                        class183 var11 = this.field2847[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class161 var12 = var11.field2806;
                                if (var12 == null || var12.field2417 <= var8) {
                                    var11.field2807 = true;
                                    int var13 = var11.method976();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field2417 += var13;
                                    }
                                    if (var4 >= this.field2841) {
                                        break label105;
                                    }
                                    class183 var14 = var11.method1027();
                                    if (var14 != null) {
                                        int var15 = var11.field2804;
                                        while (var14 != null) {
                                            this.method3366(var14, var15 * var14.method3263() >> 8);
                                            var14 = var11.method992();
                                        }
                                    }
                                    class183 var16 = var11.field2805;
                                    var11.field2805 = null;
                                    if (var10 == null) {
                                        this.field2847[var7] = var16;
                                    } else {
                                        var10.field2805 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field2848[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field2805;
                                }
                            }
                        }
                    }
                    var7 += 4;
                    var8++;
                }
                var6--;
            }
            for (int var17 = 0; var17 < 8; var17++) {
                class183 var18 = this.field2847[var17];
                class183[] var19 = this.field2847;
                this.field2848[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class183 var21 = var18.field2805;
                    var18.field2805 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field2846 < 0) {
            this.field2846 = 0;
        }
        if (this.field2833 != null) {
            this.field2833.method1018(arg0, 0, arg1);
        }
        this.field2834 = class38.method2385();
    }

    @ObfuscatedName("ae.h(I)V")
    public void method2758(int arg0) throws Exception {
    }

    @ObfuscatedName("ae.k()I")
    public int method2761() throws Exception {
        return this.field2835;
    }

    @ObfuscatedName("ae.w()V")
    public void method2756() throws Exception {
    }

    @ObfuscatedName("ae.t()V")
    public void method2759() {
    }

    @ObfuscatedName("ae.v(I)V")
    public final void method3365() {
        this.field2853 = true;
    }

    @ObfuscatedName("ae.ab(Lag;II)V")
    public final void method3366(class183 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class183 var4 = this.field2848[var3];
        if (var4 == null) {
            this.field2847[var3] = arg0;
        } else {
            var4.field2805 = arg0;
        }
        this.field2848[var3] = arg0;
        arg0.field2804 = arg1;
    }

    @ObfuscatedName("ae.b(Ljava/awt/Component;)V")
    public void method2762(Component arg0) throws Exception {
    }

    @ObfuscatedName("ae.d()V")
    public void method2769() throws Exception {
    }

    @ObfuscatedName("a.a(IZII)V")
    public static final void method1109(int arg0, boolean arg1, int arg2) {
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        Statics.field2840 = arg0;
        Statics.field2825 = arg1;
        Statics.field2827 = arg2;
    }

    @ObfuscatedName("w.ak(Lag;B)V")
    public static final void method1200(class183 arg0) {
        arg0.field2807 = false;
        if (arg0.field2806 != null) {
            arg0.field2806.field2417 = 0;
        }
        for (class183 var1 = arg0.method1027(); var1 != null; var1 = arg0.method992()) {
            method1200(var1);
        }
    }

    @ObfuscatedName("z.p(Lbt;Ljava/awt/Component;III)Lae;")
    public static final class185 method1412(class116 arg0, Component arg1, int arg2, int arg3) {
        if (Statics.field2840 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class160 var4 = new class160();
                var4.field2831 = new int[256 * (Statics.field2825 ? 2 : 1)];
                var4.field2843 = arg3;
                var4.method2762(arg1);
                var4.field2835 = (arg3 & 0xFFFFFC00) + 1024;
                if (var4.field2835 > 16384) {
                    var4.field2835 = 16384;
                }
                var4.method2758(var4.field2835);
                if (Statics.field2827 > 0 && Statics.field2828 == null) {
                    Statics.field2828 = new class115();
                    Statics.field2828.field1913 = arg0;
                    arg0.method2077(Statics.field2828, Statics.field2827);
                }
                if (Statics.field2828 != null) {
                    if (Statics.field2828.field1909[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field2828.field1909[arg2] = var4;
                }
                return var4;
            } catch (Throwable var9) {
                try {
                    class178 var6 = new class178(arg0, arg2);
                    var6.field2831 = new int[(Statics.field2825 ? 2 : 1) * 256];
                    var6.field2843 = arg3;
                    var6.method2762(arg1);
                    var6.field2835 = 16384;
                    var6.method2758(var6.field2835);
                    if (Statics.field2827 > 0 && Statics.field2828 == null) {
                        Statics.field2828 = new class115();
                        Statics.field2828.field1913 = arg0;
                        arg0.method2077(Statics.field2828, Statics.field2827);
                    }
                    if (Statics.field2828 != null) {
                        if (Statics.field2828.field1909[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        Statics.field2828.field1909[arg2] = var6;
                    }
                    return var6;
                } catch (Throwable var8) {
                    return new class185();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
