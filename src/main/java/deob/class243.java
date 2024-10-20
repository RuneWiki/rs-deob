package deob;

@ObfuscatedName("ie")
public class class243 extends class195 {

    @ObfuscatedName("ie.r")
    public static class190 field3290 = new class190(256);

    @ObfuscatedName("ie.v")
    public final int field3291;

    @ObfuscatedName("ie.e")
    public int field3298 = -1;

    @ObfuscatedName("ie.l")
    public int field3293 = -1;

    @ObfuscatedName("ie.s")
    public String field3289;

    @ObfuscatedName("ie.w")
    public int field3306;

    @ObfuscatedName("ie.p")
    public int field3301 = 0;

    @ObfuscatedName("ie.u")
    public String[] field3297 = new String[5];

    @ObfuscatedName("ie.g")
    public String field3296;

    @ObfuscatedName("ie.k")
    public int[] field3299;

    @ObfuscatedName("ie.t")
    public int field3300 = Integer.MAX_VALUE;

    @ObfuscatedName("ie.c")
    public int field3288 = Integer.MAX_VALUE;

    @ObfuscatedName("ie.o")
    public int field3302 = Integer.MIN_VALUE;

    @ObfuscatedName("ie.x")
    public int field3303 = Integer.MIN_VALUE;

    @ObfuscatedName("ie.f")
    public class258 field3304 = class258.field3547;

    @ObfuscatedName("ie.h")
    public class240 field3305 = class240.field3275;

    @ObfuscatedName("ie.z")
    public int[] field3294;

    @ObfuscatedName("ie.i")
    public byte[] field3307;

    @ObfuscatedName("ie.d")
    public int field3308 = -1;

    public class243(int arg0) {
        this.field3291 = arg0;
    }

    @ObfuscatedName("ie.a(Lfe;I)V")
    public void method3918(class174 arg0) {
        while (true) {
            int var2 = arg0.method2871();
            if (var2 == 0) {
                return;
            }
            this.method3927(arg0, var2);
        }
    }

    @ObfuscatedName("ie.j(Lfe;II)V")
    public void method3927(class174 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3298 = arg0.method2954();
        } else if (arg1 == 2) {
            this.field3293 = arg0.method2954();
        } else if (arg1 == 3) {
            this.field3289 = arg0.method2879();
        } else if (arg1 == 4) {
            this.field3306 = arg0.method2875();
        } else if (arg1 == 5) {
            arg0.method2875();
        } else if (arg1 == 6) {
            this.field3301 = arg0.method2871();
        } else if (arg1 == 7) {
            int var3 = arg0.method2871();
            if ((var3 & 0x1) == 0) {
            }
            if ((var3 & 0x2) == 2) {
            }
        } else if (arg1 == 8) {
            arg0.method2871();
        } else if (arg1 >= 10 && arg1 <= 14) {
            this.field3297[arg1 - 10] = arg0.method2879();
        } else if (arg1 == 15) {
            int var4 = arg0.method2871();
            this.field3299 = new int[var4 * 2];
            for (int var5 = 0; var5 < var4 * 2; var5++) {
                this.field3299[var5] = arg0.method2906();
            }
            arg0.method2876();
            int var6 = arg0.method2871();
            this.field3294 = new int[var6];
            for (int var7 = 0; var7 < this.field3294.length; var7++) {
                this.field3294[var7] = arg0.method2876();
            }
            this.field3307 = new byte[var4];
            for (int var8 = 0; var8 < var4; var8++) {
                this.field3307[var8] = arg0.method2872();
            }
        } else if (arg1 != 16) {
            if (arg1 == 17) {
                this.field3296 = arg0.method2879();
            } else if (arg1 == 18) {
                arg0.method2954();
            } else if (arg1 == 19) {
                this.field3308 = arg0.method2873();
            } else if (arg1 == 21) {
                arg0.method2876();
            } else if (arg1 == 22) {
                arg0.method2876();
            } else if (arg1 == 23) {
                arg0.method2871();
                arg0.method2871();
                arg0.method2871();
            } else if (arg1 == 24) {
                arg0.method2906();
                arg0.method2906();
            } else if (arg1 == 25) {
                arg0.method2954();
            } else if (arg1 == 28) {
                arg0.method2871();
            } else if (arg1 == 29) {
                class258[] var9 = new class258[] { class258.field3546, class258.field3547, class258.field3548 };
                this.field3304 = (class258) class169.method1334(var9, arg0.method2871());
            } else if (arg1 == 30) {
                this.field3305 = (class240) class169.method1334(class240.method65(), arg0.method2871());
            }
        }
    }

    @ObfuscatedName("ie.n(I)V")
    public void method3923() {
        if (this.field3299 == null) {
            return;
        }
        for (int var1 = 0; var1 < this.field3299.length; var1 += 2) {
            if (this.field3299[var1] < this.field3300) {
                this.field3300 = this.field3299[var1];
            } else if (this.field3299[var1] > this.field3302) {
                this.field3302 = this.field3299[var1];
            }
            if (this.field3299[var1 + 1] < this.field3288) {
                this.field3288 = this.field3299[var1 + 1];
            } else if (this.field3299[var1 + 1] > this.field3303) {
                this.field3303 = this.field3299[var1 + 1];
            }
        }
    }

    @ObfuscatedName("ie.r(ZI)Ljt;")
    public class286 method3920(boolean arg0) {
        int var2 = arg0 ? this.field3293 : this.field3298;
        return this.method3921(var2);
    }

    @ObfuscatedName("ie.v(II)Ljt;")
    public class286 method3921(int arg0) {
        if (arg0 < 0) {
            return null;
        }
        class286 var2 = (class286) field3290.method3245((long) arg0);
        if (var2 != null) {
            return var2;
        }
        class286 var3 = class287.method208(Statics.field3295, arg0, 0);
        if (var3 != null) {
            field3290.method3247(var3, (long) arg0);
        }
        return var3;
    }

    @ObfuscatedName("ie.e(I)I")
    public int method3924() {
        return this.field3291;
    }
}
