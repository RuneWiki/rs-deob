package deob;

@ObfuscatedName("ig")
public class class258 extends class209 {

    @ObfuscatedName("ig.j")
    public static class203 field3272 = new class203(256);

    @ObfuscatedName("ig.g")
    public final int field3273;

    @ObfuscatedName("ig.i")
    public int field3274 = -1;

    @ObfuscatedName("ig.h")
    public int field3277 = -1;

    @ObfuscatedName("ig.l")
    public String field3276;

    @ObfuscatedName("ig.d")
    public int field3279;

    @ObfuscatedName("ig.o")
    public int field3278 = 0;

    @ObfuscatedName("ig.k")
    public String[] field3280 = new String[5];

    @ObfuscatedName("ig.v")
    public String field3290;

    @ObfuscatedName("ig.p")
    public int[] field3281;

    @ObfuscatedName("ig.n")
    public int field3282 = Integer.MAX_VALUE;

    @ObfuscatedName("ig.t")
    public int field3283 = Integer.MAX_VALUE;

    @ObfuscatedName("ig.r")
    public int field3271 = Integer.MIN_VALUE;

    @ObfuscatedName("ig.x")
    public int field3285 = Integer.MIN_VALUE;

    @ObfuscatedName("ig.b")
    public class273 field3270 = class273.field3527;

    @ObfuscatedName("ig.w")
    public class255 field3287 = class255.field3256;

    @ObfuscatedName("ig.e")
    public int[] field3288;

    @ObfuscatedName("ig.a")
    public byte[] field3289;

    @ObfuscatedName("ig.z")
    public int field3292 = -1;

    public class258(int arg0) {
        this.field3273 = arg0;
    }

    @ObfuscatedName("dm.c(Lih;Lih;B)Z")
    public static boolean method2635(class250 arg0, class250 arg1) {
        Statics.field3286 = arg1;
        if (!arg0.method4215()) {
            return false;
        }
        Statics.field2341 = arg0.method4222(35);
        Statics.field3284 = new class258[Statics.field2341];
        for (int var2 = 0; var2 < Statics.field2341; var2++) {
            byte[] var3 = arg0.method4210(35, var2);
            Statics.field3284[var2] = new class258(var2);
            if (var3 != null) {
                Statics.field3284[var2].method4418(new class185(var3));
                Statics.field3284[var2].method4420();
            }
        }
        return true;
    }

    @ObfuscatedName("ey.q(II)Lig;")
    public static class258 method2830(int arg0) {
        return arg0 < 0 || arg0 >= Statics.field3284.length || Statics.field3284[arg0] == null ? new class258(arg0) : Statics.field3284[arg0];
    }

    @ObfuscatedName("ig.m(Lgg;B)V")
    public void method4418(class185 arg0) {
        while (true) {
            int var2 = arg0.method3243();
            if (var2 == 0) {
                return;
            }
            this.method4419(arg0, var2);
        }
    }

    @ObfuscatedName("ig.j(Lgg;II)V")
    public void method4419(class185 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3274 = arg0.method3338();
        } else if (arg1 == 2) {
            this.field3277 = arg0.method3338();
        } else if (arg1 == 3) {
            this.field3276 = arg0.method3251();
        } else if (arg1 == 4) {
            this.field3279 = arg0.method3247();
        } else if (arg1 == 5) {
            arg0.method3247();
        } else if (arg1 == 6) {
            this.field3278 = arg0.method3243();
        } else if (arg1 == 7) {
            int var3 = arg0.method3243();
            if ((var3 & 0x1) == 0) {
            }
            if ((var3 & 0x2) == 2) {
            }
        } else if (arg1 == 8) {
            arg0.method3243();
        } else if (arg1 >= 10 && arg1 <= 14) {
            this.field3280[arg1 - 10] = arg0.method3251();
        } else if (arg1 == 15) {
            int var4 = arg0.method3243();
            this.field3281 = new int[var4 * 2];
            for (int var5 = 0; var5 < var4 * 2; var5++) {
                this.field3281[var5] = arg0.method3369();
            }
            arg0.method3323();
            int var6 = arg0.method3243();
            this.field3288 = new int[var6];
            for (int var7 = 0; var7 < this.field3288.length; var7++) {
                this.field3288[var7] = arg0.method3323();
            }
            this.field3289 = new byte[var4];
            for (int var8 = 0; var8 < var4; var8++) {
                this.field3289[var8] = arg0.method3244();
            }
        } else if (arg1 != 16) {
            if (arg1 == 17) {
                this.field3290 = arg0.method3251();
            } else if (arg1 == 18) {
                arg0.method3338();
            } else if (arg1 == 19) {
                this.field3292 = arg0.method3245();
            } else if (arg1 == 21) {
                arg0.method3323();
            } else if (arg1 == 22) {
                arg0.method3323();
            } else if (arg1 == 23) {
                arg0.method3243();
                arg0.method3243();
                arg0.method3243();
            } else if (arg1 == 24) {
                arg0.method3369();
                arg0.method3369();
            } else if (arg1 == 25) {
                arg0.method3338();
            } else if (arg1 == 28) {
                arg0.method3243();
            } else if (arg1 == 29) {
                class273[] var9 = new class273[] { class273.field3527, class273.field3531, class273.field3528 };
                this.field3270 = (class273) class180.method3951(var9, arg0.method3243());
            } else if (arg1 == 30) {
                class255[] var10 = new class255[] { class255.field3256, class255.field3257, class255.field3258 };
                this.field3287 = (class255) class180.method3951(var10, arg0.method3243());
            }
        }
    }

    @ObfuscatedName("ig.g(I)V")
    public void method4420() {
        if (this.field3281 == null) {
            return;
        }
        for (int var1 = 0; var1 < this.field3281.length; var1 += 2) {
            if (this.field3281[var1] < this.field3282) {
                this.field3282 = this.field3281[var1];
            } else if (this.field3281[var1] > this.field3271) {
                this.field3271 = this.field3281[var1];
            }
            if (this.field3281[var1 + 1] < this.field3283) {
                this.field3283 = this.field3281[var1 + 1];
            } else if (this.field3281[var1 + 1] > this.field3285) {
                this.field3285 = this.field3281[var1 + 1];
            }
        }
    }

    @ObfuscatedName("ig.i(ZS)Llt;")
    public class324 method4432(boolean arg0) {
        int var2 = arg0 ? this.field3277 : this.field3274;
        return this.method4443(var2);
    }

    @ObfuscatedName("ig.h(II)Llt;")
    public class324 method4443(int arg0) {
        if (arg0 < 0) {
            return null;
        }
        class324 var2 = (class324) field3272.method3654((long) arg0);
        if (var2 != null) {
            return var2;
        }
        class324 var3 = class325.method4170(Statics.field3286, arg0, 0);
        if (var3 != null) {
            field3272.method3646(var3, (long) arg0);
        }
        return var3;
    }

    @ObfuscatedName("ig.l(B)I")
    public int method4437() {
        return this.field3273;
    }
}
