package deob;

@ObfuscatedName("ic")
public class class253 extends class181 {

    @ObfuscatedName("ic.w")
    public static class146 field3287 = new class146(256);

    @ObfuscatedName("ic.o")
    public final int field3297;

    @ObfuscatedName("ic.u")
    public int field3289 = -1;

    @ObfuscatedName("ic.g")
    public int field3286 = -1;

    @ObfuscatedName("ic.l")
    public String field3291;

    @ObfuscatedName("ic.e")
    public int field3292;

    @ObfuscatedName("ic.x")
    public int field3290 = 0;

    @ObfuscatedName("ic.k")
    public String[] field3294 = new String[5];

    @ObfuscatedName("ic.n")
    public String field3295;

    @ObfuscatedName("ic.i")
    public int[] field3300;

    @ObfuscatedName("ic.a")
    public int field3299 = Integer.MAX_VALUE;

    @ObfuscatedName("ic.z")
    public int field3298 = Integer.MAX_VALUE;

    @ObfuscatedName("ic.j")
    public int field3293 = Integer.MIN_VALUE;

    @ObfuscatedName("ic.s")
    public int field3296 = Integer.MIN_VALUE;

    @ObfuscatedName("ic.t")
    public class267 field3288 = class267.field3528;

    @ObfuscatedName("ic.y")
    public class250 field3302 = class250.field3274;

    @ObfuscatedName("ic.h")
    public int[] field3303;

    @ObfuscatedName("ic.b")
    public byte[] field3304;

    @ObfuscatedName("ic.c")
    public int field3305 = -1;

    public class253(int arg0) {
        this.field3297 = arg0;
    }

    @ObfuscatedName("dm.m(IB)Lic;")
    public static class253 method2731(int arg0) {
        return arg0 < 0 || arg0 >= Statics.field2787.length || Statics.field2787[arg0] == null ? new class253(arg0) : Statics.field2787[arg0];
    }

    @ObfuscatedName("ic.f(Lgr;B)V")
    public void method4360(class202 arg0) {
        while (true) {
            int var2 = arg0.method3551();
            if (var2 == 0) {
                return;
            }
            this.method4361(arg0, var2);
        }
    }

    @ObfuscatedName("ic.q(Lgr;II)V")
    public void method4361(class202 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3289 = arg0.method3434();
        } else if (arg1 == 2) {
            this.field3286 = arg0.method3434();
        } else if (arg1 == 3) {
            this.field3291 = arg0.method3426();
        } else if (arg1 == 4) {
            this.field3292 = arg0.method3421();
        } else if (arg1 == 5) {
            arg0.method3421();
        } else if (arg1 == 6) {
            this.field3290 = arg0.method3551();
        } else if (arg1 == 7) {
            int var3 = arg0.method3551();
            if ((var3 & 0x1) == 0) {
            }
            if ((var3 & 0x2) == 2) {
            }
        } else if (arg1 == 8) {
            arg0.method3551();
        } else if (arg1 >= 10 && arg1 <= 14) {
            this.field3294[arg1 - 10] = arg0.method3426();
        } else if (arg1 == 15) {
            int var4 = arg0.method3551();
            this.field3300 = new int[var4 * 2];
            for (int var5 = 0; var5 < var4 * 2; var5++) {
                this.field3300[var5] = arg0.method3420();
            }
            arg0.method3620();
            int var6 = arg0.method3551();
            this.field3303 = new int[var6];
            for (int var7 = 0; var7 < this.field3303.length; var7++) {
                this.field3303[var7] = arg0.method3620();
            }
            this.field3304 = new byte[var4];
            for (int var8 = 0; var8 < var4; var8++) {
                this.field3304[var8] = arg0.method3537();
            }
        } else if (arg1 != 16) {
            if (arg1 == 17) {
                this.field3295 = arg0.method3426();
            } else if (arg1 == 18) {
                arg0.method3434();
            } else if (arg1 == 19) {
                this.field3305 = arg0.method3530();
            } else if (arg1 == 21) {
                arg0.method3620();
            } else if (arg1 == 22) {
                arg0.method3620();
            } else if (arg1 == 23) {
                arg0.method3551();
                arg0.method3551();
                arg0.method3551();
            } else if (arg1 == 24) {
                arg0.method3420();
                arg0.method3420();
            } else if (arg1 == 25) {
                arg0.method3434();
            } else if (arg1 == 28) {
                arg0.method3551();
            } else if (arg1 == 29) {
                class267[] var9 = new class267[] { class267.field3528, class267.field3527, class267.field3530 };
                this.field3288 = (class267) class197.method999(var9, arg0.method3551());
            } else if (arg1 == 30) {
                this.field3302 = (class250) class197.method999(class250.method4425(), arg0.method3551());
            }
        }
    }

    @ObfuscatedName("ic.w(I)V")
    public void method4362() {
        if (this.field3300 == null) {
            return;
        }
        for (int var1 = 0; var1 < this.field3300.length; var1 += 2) {
            if (this.field3300[var1] < this.field3299) {
                this.field3299 = this.field3300[var1];
            } else if (this.field3300[var1] > this.field3293) {
                this.field3293 = this.field3300[var1];
            }
            if (this.field3300[var1 + 1] < this.field3298) {
                this.field3298 = this.field3300[var1 + 1];
            } else if (this.field3300[var1 + 1] > this.field3296) {
                this.field3296 = this.field3300[var1 + 1];
            }
        }
    }

    @ObfuscatedName("ic.o(ZI)Lln;")
    public class328 method4376(boolean arg0) {
        int var2 = arg0 ? this.field3286 : this.field3289;
        return this.method4364(var2);
    }

    @ObfuscatedName("ic.u(IB)Lln;")
    public class328 method4364(int arg0) {
        if (arg0 < 0) {
            return null;
        }
        class328 var2 = (class328) field3287.method3011((long) arg0);
        if (var2 != null) {
            return var2;
        }
        class328 var3 = class329.method5456(Statics.field3301, arg0, 0);
        if (var3 != null) {
            field3287.method3009(var3, (long) arg0);
        }
        return var3;
    }

    @ObfuscatedName("ic.g(I)I")
    public int method4365() {
        return this.field3297;
    }

    @ObfuscatedName("cb.l(I)V")
    public static void method1908() {
        field3287.method3010();
    }
}
