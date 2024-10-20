package deob;

@ObfuscatedName("jq")
public class class272 extends class207 {

    @ObfuscatedName("jq.s")
    public static class201 field3489 = new class201(64);

    @ObfuscatedName("jq.l")
    public static class201 field3490 = new class201(50);

    @ObfuscatedName("jq.u")
    public int field3511;

    @ObfuscatedName("jq.q")
    public String field3492 = class238.field2798;

    @ObfuscatedName("jq.k")
    public int field3498 = 1;

    @ObfuscatedName("jq.i")
    public int[] field3494;

    @ObfuscatedName("jq.x")
    public int[] field3516;

    @ObfuscatedName("jq.e")
    public int field3520 = -1;

    @ObfuscatedName("jq.p")
    public int field3497 = -1;

    @ObfuscatedName("jq.b")
    public int field3487 = -1;

    @ObfuscatedName("jq.n")
    public int field3499 = -1;

    @ObfuscatedName("jq.f")
    public int field3496 = -1;

    @ObfuscatedName("jq.g")
    public int field3503 = -1;

    @ObfuscatedName("jq.m")
    public int field3502 = -1;

    @ObfuscatedName("jq.r")
    public short[] field3493;

    @ObfuscatedName("jq.t")
    public short[] field3504;

    @ObfuscatedName("jq.o")
    public short[] field3515;

    @ObfuscatedName("jq.y")
    public short[] field3506;

    @ObfuscatedName("jq.a")
    public String[] field3507 = new String[5];

    @ObfuscatedName("jq.j")
    public boolean field3508 = true;

    @ObfuscatedName("jq.d")
    public int field3509 = -1;

    @ObfuscatedName("jq.h")
    public int field3510 = 128;

    @ObfuscatedName("jq.c")
    public int field3522 = 128;

    @ObfuscatedName("jq.v")
    public boolean field3512 = false;

    @ObfuscatedName("jq.af")
    public int field3513 = 0;

    @ObfuscatedName("jq.ah")
    public int field3514 = 0;

    @ObfuscatedName("jq.ab")
    public int field3495 = -1;

    @ObfuscatedName("jq.aw")
    public int field3501 = 32;

    @ObfuscatedName("jq.ak")
    public int[] field3517;

    @ObfuscatedName("jq.as")
    public int field3500 = -1;

    @ObfuscatedName("jq.an")
    public int field3519 = -1;

    @ObfuscatedName("jq.ao")
    public boolean field3505 = true;

    @ObfuscatedName("jq.at")
    public boolean field3521 = true;

    @ObfuscatedName("jq.ai")
    public boolean field3518 = false;

    @ObfuscatedName("jq.ac")
    public class198 field3523;

    @ObfuscatedName("jd.z(II)Ljq;")
    public static class272 method4763(int arg0) {
        class272 var1 = (class272) field3489.method3681((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3491.method4247(9, arg0);
        class272 var3 = new class272();
        var3.field3511 = arg0;
        if (var2 != null) {
            var3.method4792(new class183(var2));
        }
        var3.method4765();
        field3489.method3675(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jq.w(S)V")
    public void method4765() {
    }

    @ObfuscatedName("jq.s(Lgk;I)V")
    public void method4792(class183 arg0) {
        while (true) {
            int var2 = arg0.method3247();
            if (var2 == 0) {
                return;
            }
            this.method4766(arg0, var2);
        }
    }

    @ObfuscatedName("jq.l(Lgk;II)V")
    public void method4766(class183 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method3247();
            this.field3494 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3494[var4] = arg0.method3253();
            }
        } else if (arg1 == 2) {
            this.field3492 = arg0.method3441();
        } else if (arg1 == 12) {
            this.field3498 = arg0.method3247();
        } else if (arg1 == 13) {
            this.field3520 = arg0.method3253();
        } else if (arg1 == 14) {
            this.field3499 = arg0.method3253();
        } else if (arg1 == 15) {
            this.field3497 = arg0.method3253();
        } else if (arg1 == 16) {
            this.field3487 = arg0.method3253();
        } else if (arg1 == 17) {
            this.field3499 = arg0.method3253();
            this.field3496 = arg0.method3253();
            this.field3503 = arg0.method3253();
            this.field3502 = arg0.method3253();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3507[arg1 - 30] = arg0.method3441();
            if (this.field3507[arg1 - 30].equalsIgnoreCase(class238.field2960)) {
                this.field3507[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method3247();
            this.field3493 = new short[var5];
            this.field3504 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3493[var6] = (short) arg0.method3253();
                this.field3504[var6] = (short) arg0.method3253();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method3247();
            this.field3515 = new short[var7];
            this.field3506 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3515[var8] = (short) arg0.method3253();
                this.field3506[var8] = (short) arg0.method3253();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method3247();
            this.field3516 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3516[var10] = arg0.method3253();
            }
        } else if (arg1 == 93) {
            this.field3508 = false;
        } else if (arg1 == 95) {
            this.field3509 = arg0.method3253();
        } else if (arg1 == 97) {
            this.field3510 = arg0.method3253();
        } else if (arg1 == 98) {
            this.field3522 = arg0.method3253();
        } else if (arg1 == 99) {
            this.field3512 = true;
        } else if (arg1 == 100) {
            this.field3513 = arg0.method3384();
        } else if (arg1 == 101) {
            this.field3514 = arg0.method3384() * 5;
        } else if (arg1 == 102) {
            this.field3495 = arg0.method3253();
        } else if (arg1 == 103) {
            this.field3501 = arg0.method3253();
        } else if (arg1 == 106 || arg1 == 118) {
            this.field3500 = arg0.method3253();
            if (this.field3500 == 65535) {
                this.field3500 = -1;
            }
            this.field3519 = arg0.method3253();
            if (this.field3519 == 65535) {
                this.field3519 = -1;
            }
            int var11 = -1;
            if (arg1 == 118) {
                var11 = arg0.method3253();
                if (var11 == 65535) {
                    var11 = -1;
                }
            }
            int var12 = arg0.method3247();
            this.field3517 = new int[var12 + 2];
            for (int var13 = 0; var13 <= var12; var13++) {
                this.field3517[var13] = arg0.method3253();
                if (this.field3517[var13] == 65535) {
                    this.field3517[var13] = -1;
                }
            }
            this.field3517[var12 + 1] = var11;
        } else if (arg1 == 107) {
            this.field3505 = false;
        } else if (arg1 == 109) {
            this.field3521 = false;
        } else if (arg1 == 111) {
            this.field3518 = true;
        } else if (arg1 == 249) {
            this.field3523 = class263.method612(arg0, this.field3523);
        }
    }

    @ObfuscatedName("jq.u(Ljn;ILjn;II)Ldc;")
    public final class120 method4768(class274 arg0, int arg1, class274 arg2, int arg3) {
        if (this.field3517 != null) {
            class272 var5 = this.method4795();
            return var5 == null ? null : var5.method4768(arg0, arg1, arg2, arg3);
        }
        class120 var6 = (class120) field3490.method3681((long) this.field3511);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field3494.length; var8++) {
                if (!Statics.field3488.method4318(this.field3494[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class114[] var9 = new class114[this.field3494.length];
            for (int var10 = 0; var10 < this.field3494.length; var10++) {
                var9[var10] = class114.method2364(Statics.field3488, this.field3494[var10], 0);
            }
            class114 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class114(var9, var9.length);
            }
            if (this.field3493 != null) {
                for (int var12 = 0; var12 < this.field3493.length; var12++) {
                    var11.method2377(this.field3493[var12], this.field3504[var12]);
                }
            }
            if (this.field3515 != null) {
                for (int var13 = 0; var13 < this.field3515.length; var13++) {
                    var11.method2378(this.field3515[var13], this.field3506[var13]);
                }
            }
            var6 = var11.method2385(this.field3513 + 64, this.field3514 + 850, -30, -50, -30);
            field3490.method3675(var6, (long) this.field3511);
        }
        class120 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method4827(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method4821(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method2462(true);
        } else {
            var14 = arg2.method4821(var6, arg3);
        }
        if (this.field3510 != 128 || this.field3522 != 128) {
            var14.method2477(this.field3510, this.field3522, this.field3510);
        }
        return var14;
    }

    @ObfuscatedName("jq.q(B)Ldb;")
    public final class114 method4764() {
        if (this.field3517 != null) {
            class272 var1 = this.method4795();
            return var1 == null ? null : var1.method4764();
        } else if (this.field3516 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field3516.length; var3++) {
                if (!Statics.field3488.method4318(this.field3516[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class114[] var4 = new class114[this.field3516.length];
            for (int var5 = 0; var5 < this.field3516.length; var5++) {
                var4[var5] = class114.method2364(Statics.field3488, this.field3516[var5], 0);
            }
            class114 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class114(var4, var4.length);
            }
            if (this.field3493 != null) {
                for (int var7 = 0; var7 < this.field3493.length; var7++) {
                    var6.method2377(this.field3493[var7], this.field3504[var7]);
                }
            }
            if (this.field3515 != null) {
                for (int var8 = 0; var8 < this.field3515.length; var8++) {
                    var6.method2378(this.field3515[var8], this.field3506[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("jq.i(I)Ljq;")
    public final class272 method4795() {
        int var1 = -1;
        if (this.field3500 != -1) {
            var1 = class226.method3095(this.field3500);
        } else if (this.field3519 != -1) {
            var1 = class226.field2559[this.field3519];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3517.length - 1) {
            var2 = this.field3517[var1];
        } else {
            var2 = this.field3517[this.field3517.length - 1];
        }
        return var2 == -1 ? null : method4763(var2);
    }

    @ObfuscatedName("jq.x(I)Z")
    public boolean method4771() {
        if (this.field3517 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field3500 != -1) {
            var1 = class226.method3095(this.field3500);
        } else if (this.field3519 != -1) {
            var1 = class226.field2559[this.field3519];
        }
        if (var1 >= 0 && var1 < this.field3517.length) {
            return this.field3517[var1] != -1;
        } else {
            return this.field3517[this.field3517.length - 1] != -1;
        }
    }

    @ObfuscatedName("jq.e(III)I")
    public int method4772(int arg0, int arg1) {
        return class263.method1561(this.field3523, arg0, arg1);
    }

    @ObfuscatedName("jq.p(ILjava/lang/String;B)Ljava/lang/String;")
    public String method4773(int arg0, String arg1) {
        return class263.method172(this.field3523, arg0, arg1);
    }
}
