package deob;

import java.awt.Component;

@ObfuscatedName("af")
public class class186 {

    @ObfuscatedName("af.b")
    public long field2858 = 0L;

    @ObfuscatedName("af.c")
    public int field2844 = 0;

    @ObfuscatedName("af.l")
    public int field2849 = 32;

    @ObfuscatedName("af.m")
    public int field2853;

    @ObfuscatedName("af.k")
    public boolean field2859 = true;

    @ObfuscatedName("af.i")
    public int field2865;

    @ObfuscatedName("af.w")
    public long field2850 = Statics.method1882();

    @ObfuscatedName("af.v")
    public long field2854 = 0L;

    @ObfuscatedName("af.u")
    public int field2848 = 0;

    @ObfuscatedName("af.s")
    public int field2843;

    @ObfuscatedName("af.z")
    public class177 field2855;

    @ObfuscatedName("af.y")
    public int field2857 = 0;

    @ObfuscatedName("af.x")
    public int[] field2847;

    @ObfuscatedName("af.ax")
    public class177[] field2862 = new class177[8];

    @ObfuscatedName("af.au")
    public int field2861 = 0;

    @ObfuscatedName("af.ag")
    public class177[] field2863 = new class177[8];

    @ObfuscatedName("af.q(I)V")
    public final synchronized void method3541() {
        if (this.field2847 == null) {
            return;
        }
        long var1 = Statics.method1882();
        try {
            if (this.field2854 != 0L) {
                if (var1 < this.field2854) {
                    return;
                }
                this.method3314(this.field2865);
                this.field2854 = 0L;
                this.field2859 = true;
            }
            int var3 = this.method3315();
            if (this.field2857 - var3 > this.field2844) {
                this.field2844 = this.field2857 - var3;
            }
            int var4 = this.field2853 + this.field2843;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field2865) {
                this.field2865 += 1024;
                if (this.field2865 > 16384) {
                    this.field2865 = 16384;
                }
                this.method3317();
                this.method3314(this.field2865);
                var3 = 0;
                this.field2859 = true;
                if (var4 + 256 > this.field2865) {
                    var4 = this.field2865 - 256;
                    this.field2853 = var4 - this.field2843;
                }
            }
            while (var3 < var4) {
                this.method3545(this.field2847, 256);
                this.method3316();
                var3 += 256;
            }
            if (var1 > this.field2858) {
                if (this.field2859) {
                    this.field2859 = false;
                } else if (this.field2844 == 0 && this.field2848 == 0) {
                    this.method3317();
                    this.field2854 = var1 + 2000L;
                    return;
                } else {
                    this.field2853 = Math.min(this.field2848, this.field2844);
                    this.field2848 = this.field2844;
                }
                this.field2844 = 0;
                this.field2858 = var1 + 2000L;
            }
            this.field2857 = var3;
        } catch (Exception var8) {
            this.method3317();
            this.field2854 = var1 + 2000L;
        }
        try {
            if (var1 > this.field2850 + 500000L) {
                var1 = this.field2850;
            }
            while (var1 > this.field2850 + 5000L) {
                this.method3552(256);
                this.field2850 += (long) (256000 / Statics.field2851);
            }
        } catch (Exception var7) {
            this.field2850 = var1;
        }
    }

    @ObfuscatedName("af.a(I)V")
    public final synchronized void method3543() {
        this.field2859 = true;
        try {
            this.method3318();
        } catch (Exception var2) {
            this.method3317();
            this.field2854 = Statics.method1882() + 2000L;
        }
    }

    @ObfuscatedName("af.aa(I)V")
    public final synchronized void method3544() {
        if (Statics.field564 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field564.field1837[var2] == this) {
                    Statics.field564.field1837[var2] = null;
                }
                if (Statics.field564.field1837[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field564.field1838 = true;
                while (Statics.field564.field1839) {
                    class30.method1166(50L);
                }
                Statics.field564 = null;
            }
        }
        this.method3317();
        this.field2847 = null;
    }

    @ObfuscatedName("af.r()V")
    public void method3318() throws Exception {
    }

    @ObfuscatedName("af.au([II)V")
    public final void method3545(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field2866) {
            var3 = arg1 << 1;
        }
        class29.method333(arg0, 0, var3);
        this.field2861 -= arg1;
        if (this.field2855 != null && this.field2861 <= 0) {
            this.field2861 += Statics.field2851 >> 4;
            method2134(this.field2855);
            this.method3546(this.field2855, this.field2855.method2896());
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
                        class177 var10 = null;
                        class177 var11 = this.field2862[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class185 var12 = var11.field2649;
                                if (var12 == null || var12.field2842 <= var8) {
                                    var11.field2652 = true;
                                    int var13 = var11.method1220();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field2842 += var13;
                                    }
                                    if (var4 >= this.field2849) {
                                        break label105;
                                    }
                                    class177 var14 = var11.method1218();
                                    if (var14 != null) {
                                        int var15 = var11.field2651;
                                        while (var14 != null) {
                                            this.method3546(var14, var15 * var14.method2896() >> 8);
                                            var14 = var11.method1289();
                                        }
                                    }
                                    class177 var16 = var11.field2650;
                                    var11.field2650 = null;
                                    if (var10 == null) {
                                        this.field2862[var7] = var16;
                                    } else {
                                        var10.field2650 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field2863[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field2650;
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
                class177 var18 = this.field2862[var17];
                class177[] var19 = this.field2862;
                this.field2863[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class177 var21 = var18.field2650;
                    var18.field2650 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field2861 < 0) {
            this.field2861 = 0;
        }
        if (this.field2855 != null) {
            this.field2855.method1274(arg0, 0, arg1);
        }
        this.field2850 = Statics.method1882();
    }

    @ObfuscatedName("af.ag(Lam;II)V")
    public final void method3546(class177 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class177 var4 = this.field2863[var3];
        if (var4 == null) {
            this.field2862[var3] = arg0;
        } else {
            var4.field2650 = arg0;
        }
        this.field2863[var3] = arg0;
        arg0.field2651 = arg1;
    }

    @ObfuscatedName("af.k(Lam;S)V")
    public final synchronized void method3547(class177 arg0) {
        this.field2855 = arg0;
    }

    @ObfuscatedName("af.p(I)V")
    public void method3314(int arg0) throws Exception {
    }

    @ObfuscatedName("af.o()I")
    public int method3315() throws Exception {
        return this.field2865;
    }

    @ObfuscatedName("af.j(Ljava/awt/Component;)V")
    public void method3330(Component arg0) throws Exception {
    }

    @ObfuscatedName("af.h()V")
    public void method3317() {
    }

    @ObfuscatedName("af.at(IS)V")
    public final void method3552(int arg0) {
        this.field2861 -= arg0;
        if (this.field2861 < 0) {
            this.field2861 = 0;
        }
        if (this.field2855 != null) {
            this.field2855.method1221(arg0);
        }
    }

    @ObfuscatedName("af.t()V")
    public void method3316() throws Exception {
    }

    @ObfuscatedName("af.d(I)V")
    public final void method3561() {
        this.field2859 = true;
    }

    @ObfuscatedName("bq.b(Lbv;Ljava/awt/Component;III)Laf;")
    public static final class186 method2006(class110 arg0, Component arg1, int arg2, int arg3) {
        if (Statics.field2851 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class175 var4 = new class175();
                var4.field2847 = new int[256 * (Statics.field2866 ? 2 : 1)];
                var4.field2843 = arg3;
                var4.method3330(arg1);
                var4.field2865 = (arg3 & 0xFFFFFC00) + 1024;
                if (var4.field2865 > 16384) {
                    var4.field2865 = 16384;
                }
                var4.method3314(var4.field2865);
                if (Statics.field2845 > 0 && Statics.field564 == null) {
                    Statics.field564 = new class120();
                    Statics.field564.field1836 = arg0;
                    arg0.method1905(Statics.field564, Statics.field2845);
                }
                if (Statics.field564 != null) {
                    if (Statics.field564.field1837[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field564.field1837[arg2] = var4;
                }
                return var4;
            } catch (Throwable var9) {
                try {
                    class172 var6 = new class172(arg0, arg2);
                    var6.field2847 = new int[256 * (Statics.field2866 ? 2 : 1)];
                    var6.field2843 = arg3;
                    var6.method3330(arg1);
                    var6.field2865 = 16384;
                    var6.method3314(var6.field2865);
                    if (Statics.field2845 > 0 && Statics.field564 == null) {
                        Statics.field564 = new class120();
                        Statics.field564.field1836 = arg0;
                        arg0.method1905(Statics.field564, Statics.field2845);
                    }
                    if (Statics.field564 != null) {
                        if (Statics.field564.field1837[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        Statics.field564.field1837[arg2] = var6;
                    }
                    return var6;
                } catch (Throwable var8) {
                    return new class186();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("bg.ax(Lam;I)V")
    public static final void method2134(class177 arg0) {
        arg0.field2652 = false;
        if (arg0.field2649 != null) {
            arg0.field2649.field2842 = 0;
        }
        for (class177 var1 = arg0.method1218(); var1 != null; var1 = arg0.method1289()) {
            method2134(var1);
        }
    }

    @ObfuscatedName("aj.y(IZIB)V")
    public static final void method3360(int arg0, boolean arg1, int arg2) {
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        Statics.field2851 = arg0;
        Statics.field2866 = arg1;
        Statics.field2845 = arg2;
    }
}
