package deob;

@ObfuscatedName("ii")
public class class258 extends class209 {

    @ObfuscatedName("ii.q")
    public static class203 field3315 = new class203(256);

    @ObfuscatedName("ii.c")
    public final int field3314;

    @ObfuscatedName("ii.l")
    public int field3316 = -1;

    @ObfuscatedName("ii.b")
    public int field3312 = -1;

    @ObfuscatedName("ii.w")
    public String field3317;

    @ObfuscatedName("ii.n")
    public int field3328;

    @ObfuscatedName("ii.i")
    public int field3319 = 0;

    @ObfuscatedName("ii.m")
    public String[] field3321 = new String[5];

    @ObfuscatedName("ii.d")
    public String field3322;

    @ObfuscatedName("ii.j")
    public int[] field3323;

    @ObfuscatedName("ii.x")
    public int field3324 = Integer.MAX_VALUE;

    @ObfuscatedName("ii.v")
    public int field3327 = Integer.MAX_VALUE;

    @ObfuscatedName("ii.h")
    public int field3326 = Integer.MIN_VALUE;

    @ObfuscatedName("ii.f")
    public int field3333 = Integer.MIN_VALUE;

    @ObfuscatedName("ii.a")
    public class273 field3325 = class273.field3560;

    @ObfuscatedName("ii.t")
    public class255 field3329 = class255.field3292;

    @ObfuscatedName("ii.k")
    public int[] field3330;

    @ObfuscatedName("ii.z")
    public byte[] field3331;

    @ObfuscatedName("ii.s")
    public int field3318 = -1;

    public class258(int arg0) {
        this.field3314 = arg0;
    }

    @ObfuscatedName("fa.g(II)Lii;")
    public static class258 method3265(int arg0) {
        return arg0 < 0 || arg0 >= Statics.field3311.length || Statics.field3311[arg0] == null ? new class258(arg0) : Statics.field3311[arg0];
    }

    @ObfuscatedName("ii.r(Lgl;B)V")
    public void method4645(class185 arg0) {
        while (true) {
            int var2 = arg0.method3679();
            if (var2 == 0) {
                return;
            }
            this.method4636(arg0, var2);
        }
    }

    @ObfuscatedName("ii.e(Lgl;II)V")
    public void method4636(class185 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3316 = arg0.method3594();
        } else if (arg1 == 2) {
            this.field3312 = arg0.method3594();
        } else if (arg1 == 3) {
            this.field3317 = arg0.method3474();
        } else if (arg1 == 4) {
            this.field3328 = arg0.method3469();
        } else if (arg1 == 5) {
            arg0.method3469();
        } else if (arg1 == 6) {
            this.field3319 = arg0.method3679();
        } else if (arg1 == 7) {
            int var3 = arg0.method3679();
            if ((var3 & 0x1) == 0) {
            }
            if ((var3 & 0x2) == 2) {
            }
        } else if (arg1 == 8) {
            arg0.method3679();
        } else if (arg1 >= 10 && arg1 <= 14) {
            this.field3321[arg1 - 10] = arg0.method3474();
        } else if (arg1 == 15) {
            int var4 = arg0.method3679();
            this.field3323 = new int[var4 * 2];
            for (int var5 = 0; var5 < var4 * 2; var5++) {
                this.field3323[var5] = arg0.method3510();
            }
            arg0.method3588();
            int var6 = arg0.method3679();
            this.field3330 = new int[var6];
            for (int var7 = 0; var7 < this.field3330.length; var7++) {
                this.field3330[var7] = arg0.method3588();
            }
            this.field3331 = new byte[var4];
            for (int var8 = 0; var8 < var4; var8++) {
                this.field3331[var8] = arg0.method3627();
            }
        } else if (arg1 != 16) {
            if (arg1 == 17) {
                this.field3322 = arg0.method3474();
            } else if (arg1 == 18) {
                arg0.method3594();
            } else if (arg1 == 19) {
                this.field3318 = arg0.method3467();
            } else if (arg1 == 21) {
                arg0.method3588();
            } else if (arg1 == 22) {
                arg0.method3588();
            } else if (arg1 == 23) {
                arg0.method3679();
                arg0.method3679();
                arg0.method3679();
            } else if (arg1 == 24) {
                arg0.method3510();
                arg0.method3510();
            } else if (arg1 == 25) {
                arg0.method3594();
            } else if (arg1 == 28) {
                arg0.method3679();
            } else if (arg1 == 29) {
                this.field3325 = (class273) class180.method712(class273.method4416(), arg0.method3679());
            } else if (arg1 == 30) {
                class255[] var9 = new class255[] { class255.field3297, class255.field3292, class255.field3291 };
                this.field3329 = (class255) class180.method712(var9, arg0.method3679());
            }
        }
    }

    @ObfuscatedName("ii.q(B)V")
    public void method4635() {
        if (this.field3323 == null) {
            return;
        }
        for (int var1 = 0; var1 < this.field3323.length; var1 += 2) {
            if (this.field3323[var1] < this.field3324) {
                this.field3324 = this.field3323[var1];
            } else if (this.field3323[var1] > this.field3326) {
                this.field3326 = this.field3323[var1];
            }
            if (this.field3323[var1 + 1] < this.field3327) {
                this.field3327 = this.field3323[var1 + 1];
            } else if (this.field3323[var1 + 1] > this.field3333) {
                this.field3333 = this.field3323[var1 + 1];
            }
        }
    }

    @ObfuscatedName("ii.c(ZI)Lls;")
    public class324 method4656(boolean arg0) {
        int var2 = arg0 ? this.field3312 : this.field3316;
        return this.method4637(var2);
    }

    @ObfuscatedName("ii.i(II)Lls;")
    public class324 method4637(int arg0) {
        if (arg0 < 0) {
            return null;
        }
        class324 var2 = (class324) field3315.method3879((long) arg0);
        if (var2 != null) {
            return var2;
        }
        class324 var3 = class325.method3125(Statics.field3310, arg0, 0);
        if (var3 != null) {
            field3315.method3885(var3, (long) arg0);
        }
        return var3;
    }

    @ObfuscatedName("ii.p(B)I")
    public int method4638() {
        return this.field3314;
    }
}
