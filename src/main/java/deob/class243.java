package deob;

@ObfuscatedName("ib")
public class class243 extends class195 {

    @ObfuscatedName("ib.q")
    public static class190 field3279 = new class190(256);

    @ObfuscatedName("ib.g")
    public final int field3280;

    @ObfuscatedName("ib.v")
    public int field3281 = -1;

    @ObfuscatedName("ib.t")
    public int field3284 = -1;

    @ObfuscatedName("ib.p")
    public String field3283;

    @ObfuscatedName("ib.l")
    public int field3276;

    @ObfuscatedName("ib.a")
    public int field3285 = 0;

    @ObfuscatedName("ib.r")
    public String[] field3286 = new String[5];

    @ObfuscatedName("ib.b")
    public String field3287;

    @ObfuscatedName("ib.x")
    public int[] field3299;

    @ObfuscatedName("ib.o")
    public int field3295 = Integer.MAX_VALUE;

    @ObfuscatedName("ib.j")
    public int field3290 = Integer.MAX_VALUE;

    @ObfuscatedName("ib.m")
    public int field3289 = Integer.MIN_VALUE;

    @ObfuscatedName("ib.d")
    public int field3292 = Integer.MIN_VALUE;

    @ObfuscatedName("ib.e")
    public class258 field3293 = class258.field3538;

    @ObfuscatedName("ib.s")
    public class240 field3288 = class240.field3262;

    @ObfuscatedName("ib.n")
    public int[] field3298;

    @ObfuscatedName("ib.y")
    public byte[] field3296;

    @ObfuscatedName("ib.w")
    public int field3297 = -1;

    public class243(int arg0) {
        this.field3280 = arg0;
    }

    @ObfuscatedName("z.i(Liy;Liy;I)Z")
    public static boolean method171(class236 arg0, class236 arg1) {
        Statics.field3282 = arg1;
        if (!arg0.method3840()) {
            return false;
        }
        Statics.field3294 = arg0.method3846(35);
        Statics.field3277 = new class243[Statics.field3294];
        for (int var2 = 0; var2 < Statics.field3294; var2++) {
            byte[] var3 = arg0.method3836(35, var2);
            if (var3 != null) {
                Statics.field3277[var2] = new class243(var2);
                Statics.field3277[var2].method4009(new class174(var3));
                Statics.field3277[var2].method4011();
            }
        }
        return true;
    }

    @ObfuscatedName("ib.h(Lfv;I)V")
    public void method4009(class174 arg0) {
        while (true) {
            int var2 = arg0.method2930();
            if (var2 == 0) {
                return;
            }
            this.method4010(arg0, var2);
        }
    }

    @ObfuscatedName("ib.u(Lfv;IB)V")
    public void method4010(class174 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3281 = arg0.method2945();
        } else if (arg1 == 2) {
            this.field3284 = arg0.method2945();
        } else if (arg1 == 3) {
            this.field3283 = arg0.method2938();
        } else if (arg1 == 4) {
            this.field3276 = arg0.method3033();
        } else if (arg1 == 5) {
            arg0.method3033();
        } else if (arg1 == 6) {
            this.field3285 = arg0.method2930();
        } else if (arg1 == 7) {
            int var3 = arg0.method2930();
            if ((var3 & 0x1) == 0) {
            }
            if ((var3 & 0x2) == 2) {
            }
        } else if (arg1 == 8) {
            arg0.method2930();
        } else if (arg1 >= 10 && arg1 <= 14) {
            this.field3286[arg1 - 10] = arg0.method2938();
        } else if (arg1 == 15) {
            int var4 = arg0.method2930();
            this.field3299 = new int[var4 * 2];
            for (int var5 = 0; var5 < var4 * 2; var5++) {
                this.field3299[var5] = arg0.method2933();
            }
            arg0.method2927();
            int var6 = arg0.method2930();
            this.field3298 = new int[var6];
            for (int var7 = 0; var7 < this.field3298.length; var7++) {
                this.field3298[var7] = arg0.method2927();
            }
            this.field3296 = new byte[var4];
            for (int var8 = 0; var8 < var4; var8++) {
                this.field3296[var8] = arg0.method2931();
            }
        } else if (arg1 != 16) {
            if (arg1 == 17) {
                this.field3287 = arg0.method2938();
            } else if (arg1 == 18) {
                arg0.method2945();
            } else if (arg1 == 19) {
                this.field3297 = arg0.method2932();
            } else if (arg1 == 21) {
                arg0.method2927();
            } else if (arg1 == 22) {
                arg0.method2927();
            } else if (arg1 == 23) {
                arg0.method2930();
                arg0.method2930();
                arg0.method2930();
            } else if (arg1 == 24) {
                arg0.method2933();
                arg0.method2933();
            } else if (arg1 == 25) {
                arg0.method2945();
            } else if (arg1 == 28) {
                arg0.method2930();
            } else if (arg1 == 29) {
                class258[] var9 = new class258[] { class258.field3539, class258.field3537, class258.field3538 };
                this.field3293 = (class258) class169.method1267(var9, arg0.method2930());
            } else if (arg1 == 30) {
                this.field3288 = (class240) class169.method1267(class240.method1487(), arg0.method2930());
            }
        }
    }

    @ObfuscatedName("ib.q(I)V")
    public void method4011() {
        if (this.field3299 == null) {
            return;
        }
        for (int var1 = 0; var1 < this.field3299.length; var1 += 2) {
            if (this.field3299[var1] < this.field3295) {
                this.field3295 = this.field3299[var1];
            } else if (this.field3299[var1] > this.field3289) {
                this.field3289 = this.field3299[var1];
            }
            if (this.field3299[var1 + 1] < this.field3290) {
                this.field3290 = this.field3299[var1 + 1];
            } else if (this.field3299[var1 + 1] > this.field3292) {
                this.field3292 = this.field3299[var1 + 1];
            }
        }
    }

    @ObfuscatedName("ib.g(ZB)Ljk;")
    public class286 method4014(boolean arg0) {
        int var2 = arg0 ? this.field3284 : this.field3281;
        return this.method4008(var2);
    }

    @ObfuscatedName("ib.v(II)Ljk;")
    public class286 method4008(int arg0) {
        if (arg0 < 0) {
            return null;
        }
        class286 var2 = (class286) field3279.method3308((long) arg0);
        if (var2 != null) {
            return var2;
        }
        class286 var3 = class287.method2165(Statics.field3282, arg0, 0);
        if (var3 != null) {
            field3279.method3316(var3, (long) arg0);
        }
        return var3;
    }

    @ObfuscatedName("ib.t(I)I")
    public int method4018() {
        return this.field3280;
    }
}
