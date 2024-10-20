package deob;

@ObfuscatedName("ik")
public class class258 extends class209 {

    @ObfuscatedName("ik.u")
    public static class203 field3288 = new class203(256);

    @ObfuscatedName("ik.i")
    public final int field3289;

    @ObfuscatedName("ik.r")
    public int field3290 = -1;

    @ObfuscatedName("ik.j")
    public int field3291 = -1;

    @ObfuscatedName("ik.p")
    public String field3303;

    @ObfuscatedName("ik.e")
    public int field3305;

    @ObfuscatedName("ik.s")
    public int field3286 = 0;

    @ObfuscatedName("ik.k")
    public String[] field3295 = new String[5];

    @ObfuscatedName("ik.o")
    public String field3294;

    @ObfuscatedName("ik.q")
    public int[] field3297;

    @ObfuscatedName("ik.l")
    public int field3293 = Integer.MAX_VALUE;

    @ObfuscatedName("ik.f")
    public int field3299 = Integer.MAX_VALUE;

    @ObfuscatedName("ik.z")
    public int field3300 = Integer.MIN_VALUE;

    @ObfuscatedName("ik.a")
    public int field3301 = Integer.MIN_VALUE;

    @ObfuscatedName("ik.x")
    public class273 field3302 = class273.field3529;

    @ObfuscatedName("ik.b")
    public class255 field3306 = class255.field3269;

    @ObfuscatedName("ik.w")
    public int[] field3304;

    @ObfuscatedName("ik.g")
    public byte[] field3292;

    @ObfuscatedName("ik.d")
    public int field3285 = -1;

    public class258(int arg0) {
        this.field3289 = arg0;
    }

    @ObfuscatedName("ik.y(II)Lik;")
    public static class258 method4467(int arg0) {
        return arg0 < 0 || arg0 >= Statics.field3298.length || Statics.field3298[arg0] == null ? new class258(arg0) : Statics.field3298[arg0];
    }

    @ObfuscatedName("ik.c(Lge;I)V")
    public void method4453(class185 arg0) {
        while (true) {
            int var2 = arg0.method3299();
            if (var2 == 0) {
                return;
            }
            this.method4454(arg0, var2);
        }
    }

    @ObfuscatedName("ik.n(Lge;II)V")
    public void method4454(class185 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3290 = arg0.method3284();
        } else if (arg1 == 2) {
            this.field3291 = arg0.method3284();
        } else if (arg1 == 3) {
            this.field3303 = arg0.method3277();
        } else if (arg1 == 4) {
            this.field3305 = arg0.method3272();
        } else if (arg1 == 5) {
            arg0.method3272();
        } else if (arg1 == 6) {
            this.field3286 = arg0.method3299();
        } else if (arg1 == 7) {
            int var3 = arg0.method3299();
            if ((var3 & 0x1) == 0) {
            }
            if ((var3 & 0x2) == 2) {
            }
        } else if (arg1 == 8) {
            arg0.method3299();
        } else if (arg1 >= 10 && arg1 <= 14) {
            this.field3295[arg1 - 10] = arg0.method3277();
        } else if (arg1 == 15) {
            int var4 = arg0.method3299();
            this.field3297 = new int[var4 * 2];
            for (int var5 = 0; var5 < var4 * 2; var5++) {
                this.field3297[var5] = arg0.method3337();
            }
            arg0.method3374();
            int var6 = arg0.method3299();
            this.field3304 = new int[var6];
            for (int var7 = 0; var7 < this.field3304.length; var7++) {
                this.field3304[var7] = arg0.method3374();
            }
            this.field3292 = new byte[var4];
            for (int var8 = 0; var8 < var4; var8++) {
                this.field3292[var8] = arg0.method3319();
            }
        } else if (arg1 != 16) {
            if (arg1 == 17) {
                this.field3294 = arg0.method3277();
            } else if (arg1 == 18) {
                arg0.method3284();
            } else if (arg1 == 19) {
                this.field3285 = arg0.method3280();
            } else if (arg1 == 21) {
                arg0.method3374();
            } else if (arg1 == 22) {
                arg0.method3374();
            } else if (arg1 == 23) {
                arg0.method3299();
                arg0.method3299();
                arg0.method3299();
            } else if (arg1 == 24) {
                arg0.method3337();
                arg0.method3337();
            } else if (arg1 == 25) {
                arg0.method3284();
            } else if (arg1 == 28) {
                arg0.method3299();
            } else if (arg1 == 29) {
                class273[] var9 = new class273[] { class273.field3534, class273.field3529, class273.field3530 };
                this.field3302 = (class273) class180.method3179(var9, arg0.method3299());
            } else if (arg1 == 30) {
                class255[] var10 = new class255[] { class255.field3269, class255.field3270, class255.field3272 };
                this.field3306 = (class255) class180.method3179(var10, arg0.method3299());
            }
        }
    }

    @ObfuscatedName("ik.u(I)V")
    public void method4455() {
        if (this.field3297 == null) {
            return;
        }
        for (int var1 = 0; var1 < this.field3297.length; var1 += 2) {
            if (this.field3297[var1] < this.field3293) {
                this.field3293 = this.field3297[var1];
            } else if (this.field3297[var1] > this.field3300) {
                this.field3300 = this.field3297[var1];
            }
            if (this.field3297[var1 + 1] < this.field3299) {
                this.field3299 = this.field3297[var1 + 1];
            } else if (this.field3297[var1 + 1] > this.field3301) {
                this.field3301 = this.field3297[var1 + 1];
            }
        }
    }

    @ObfuscatedName("ik.i(ZB)Llu;")
    public class324 method4464(boolean arg0) {
        int var2 = arg0 ? this.field3291 : this.field3290;
        return this.method4456(var2);
    }

    @ObfuscatedName("ik.p(II)Llu;")
    public class324 method4456(int arg0) {
        if (arg0 < 0) {
            return null;
        }
        class324 var2 = (class324) field3288.method3685((long) arg0);
        if (var2 != null) {
            return var2;
        }
        class324 var3 = class325.method4906(Statics.field3296, arg0, 0);
        if (var3 != null) {
            field3288.method3687(var3, (long) arg0);
        }
        return var3;
    }

    @ObfuscatedName("ik.e(B)I")
    public int method4458() {
        return this.field3289;
    }
}
