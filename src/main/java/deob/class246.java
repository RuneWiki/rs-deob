package deob;

@ObfuscatedName("it")
public class class246 extends class198 {

    @ObfuscatedName("it.k")
    public static class193 field3295 = new class193(256);

    @ObfuscatedName("it.f")
    public final int field3296;

    @ObfuscatedName("it.i")
    public int field3292 = -1;

    @ObfuscatedName("it.j")
    public int field3298 = -1;

    @ObfuscatedName("it.m")
    public String field3299;

    @ObfuscatedName("it.u")
    public int field3293;

    @ObfuscatedName("it.r")
    public int field3308 = 0;

    @ObfuscatedName("it.h")
    public String[] field3302 = new String[5];

    @ObfuscatedName("it.a")
    public String field3303;

    @ObfuscatedName("it.p")
    public int[] field3297;

    @ObfuscatedName("it.q")
    public int field3305 = Integer.MAX_VALUE;

    @ObfuscatedName("it.l")
    public int field3306 = Integer.MAX_VALUE;

    @ObfuscatedName("it.c")
    public int field3304 = Integer.MIN_VALUE;

    @ObfuscatedName("it.n")
    public int field3309 = Integer.MIN_VALUE;

    @ObfuscatedName("it.z")
    public class261 field3300 = class261.field3560;

    @ObfuscatedName("it.e")
    public class243 field3310 = class243.field3269;

    @ObfuscatedName("it.g")
    public int[] field3311;

    @ObfuscatedName("it.d")
    public byte[] field3307;

    @ObfuscatedName("it.y")
    public int field3313 = -1;

    public class246(int arg0) {
        this.field3296 = arg0;
    }

    @ObfuscatedName("it.w(Lfi;B)V")
    public void method3892(class177 arg0) {
        while (true) {
            int var2 = arg0.method2931();
            if (var2 == 0) {
                return;
            }
            this.method3894(arg0, var2);
        }
    }

    @ObfuscatedName("it.o(Lfi;II)V")
    public void method3894(class177 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3292 = arg0.method2899();
        } else if (arg1 == 2) {
            this.field3298 = arg0.method2899();
        } else if (arg1 == 3) {
            this.field3299 = arg0.method2892();
        } else if (arg1 == 4) {
            this.field3293 = arg0.method2888();
        } else if (arg1 == 5) {
            arg0.method2888();
        } else if (arg1 == 6) {
            this.field3308 = arg0.method2931();
        } else if (arg1 == 7) {
            int var3 = arg0.method2931();
            if ((var3 & 0x1) == 0) {
            }
            if ((var3 & 0x2) == 2) {
            }
        } else if (arg1 == 8) {
            arg0.method2931();
        } else if (arg1 >= 10 && arg1 <= 14) {
            this.field3302[arg1 - 10] = arg0.method2892();
        } else if (arg1 == 15) {
            int var4 = arg0.method2931();
            this.field3297 = new int[var4 * 2];
            for (int var5 = 0; var5 < var4 * 2; var5++) {
                this.field3297[var5] = arg0.method2887();
            }
            arg0.method2904();
            int var6 = arg0.method2931();
            this.field3311 = new int[var6];
            for (int var7 = 0; var7 < this.field3311.length; var7++) {
                this.field3311[var7] = arg0.method2904();
            }
            this.field3307 = new byte[var4];
            for (int var8 = 0; var8 < var4; var8++) {
                this.field3307[var8] = arg0.method2885();
            }
        } else if (arg1 != 16) {
            if (arg1 == 17) {
                this.field3303 = arg0.method2892();
            } else if (arg1 == 18) {
                arg0.method2899();
            } else if (arg1 == 19) {
                this.field3313 = arg0.method2886();
            } else if (arg1 == 21) {
                arg0.method2904();
            } else if (arg1 == 22) {
                arg0.method2904();
            } else if (arg1 == 23) {
                arg0.method2931();
                arg0.method2931();
                arg0.method2931();
            } else if (arg1 == 24) {
                arg0.method2887();
                arg0.method2887();
            } else if (arg1 == 25) {
                arg0.method2899();
            } else if (arg1 == 28) {
                arg0.method2931();
            } else if (arg1 == 29) {
                this.field3300 = (class261) class172.method1461(class261.method4386(), arg0.method2931());
            } else if (arg1 == 30) {
                class243[] var9 = new class243[] { class243.field3270, class243.field3268, class243.field3269 };
                this.field3310 = (class243) class172.method1461(var9, arg0.method2931());
            }
        }
    }

    @ObfuscatedName("it.x(I)V")
    public void method3906() {
        if (this.field3297 == null) {
            return;
        }
        for (int var1 = 0; var1 < this.field3297.length; var1 += 2) {
            if (this.field3297[var1] < this.field3305) {
                this.field3305 = this.field3297[var1];
            } else if (this.field3297[var1] > this.field3304) {
                this.field3304 = this.field3297[var1];
            }
            if (this.field3297[var1 + 1] < this.field3306) {
                this.field3306 = this.field3297[var1 + 1];
            } else if (this.field3297[var1 + 1] > this.field3309) {
                this.field3309 = this.field3297[var1 + 1];
            }
        }
    }

    @ObfuscatedName("it.k(ZB)Lkh;")
    public class289 method3896(boolean arg0) {
        int var2 = arg0 ? this.field3298 : this.field3292;
        return this.method3897(var2);
    }

    @ObfuscatedName("it.f(II)Lkh;")
    public class289 method3897(int arg0) {
        if (arg0 < 0) {
            return null;
        }
        class289 var2 = (class289) field3295.method3239((long) arg0);
        if (var2 != null) {
            return var2;
        }
        class289 var3 = class290.method3390(Statics.field3312, arg0, 0);
        if (var3 != null) {
            field3295.method3241(var3, (long) arg0);
        }
        return var3;
    }

    @ObfuscatedName("it.i(B)I")
    public int method3898() {
        return this.field3296;
    }
}
