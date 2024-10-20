package deob;

@ObfuscatedName("jc")
public class class266 extends class202 {

    @ObfuscatedName("jc.i")
    public static class197 field3606 = new class197(64);

    @ObfuscatedName("jc.j")
    public static class197 field3607 = new class197(50);

    @ObfuscatedName("jc.v")
    public int field3623;

    @ObfuscatedName("jc.x")
    public String field3629 = "null";

    @ObfuscatedName("jc.e")
    public int field3626 = 1;

    @ObfuscatedName("jc.l")
    public int[] field3638;

    @ObfuscatedName("jc.b")
    public int[] field3612;

    @ObfuscatedName("jc.n")
    public int field3613 = -1;

    @ObfuscatedName("jc.c")
    public int field3636 = -1;

    @ObfuscatedName("jc.a")
    public int field3604 = -1;

    @ObfuscatedName("jc.y")
    public int field3608 = -1;

    @ObfuscatedName("jc.w")
    public int field3617 = -1;

    @ObfuscatedName("jc.k")
    public int field3618 = -1;

    @ObfuscatedName("jc.t")
    public int field3609 = -1;

    @ObfuscatedName("jc.h")
    public short[] field3620;

    @ObfuscatedName("jc.u")
    public short[] field3621;

    @ObfuscatedName("jc.r")
    public short[] field3622;

    @ObfuscatedName("jc.g")
    public short[] field3610;

    @ObfuscatedName("jc.z")
    public String[] field3624 = new String[5];

    @ObfuscatedName("jc.o")
    public boolean field3625 = true;

    @ObfuscatedName("jc.d")
    public int field3637 = -1;

    @ObfuscatedName("jc.s")
    public int field3614 = 128;

    @ObfuscatedName("jc.f")
    public int field3628 = 128;

    @ObfuscatedName("jc.q")
    public boolean field3627 = false;

    @ObfuscatedName("jc.al")
    public int field3630 = 0;

    @ObfuscatedName("jc.ao")
    public int field3631 = 0;

    @ObfuscatedName("jc.aq")
    public int field3632 = -1;

    @ObfuscatedName("jc.ab")
    public int field3633 = 32;

    @ObfuscatedName("jc.as")
    public int[] field3634;

    @ObfuscatedName("jc.ag")
    public int field3635 = -1;

    @ObfuscatedName("jc.ap")
    public int field3611 = -1;

    @ObfuscatedName("jc.av")
    public boolean field3615 = true;

    @ObfuscatedName("jc.ak")
    public boolean field3619 = true;

    @ObfuscatedName("jc.at")
    public boolean field3639 = false;

    @ObfuscatedName("jc.an")
    public class194 field3640;

    @ObfuscatedName("cg.m(II)Ljc;")
    public static class266 method1704(int arg0) {
        class266 var1 = (class266) field3606.method3419((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3616.method3930(9, arg0);
        class266 var3 = new class266();
        var3.field3623 = arg0;
        if (var2 != null) {
            var3.method4473(new class181(var2));
        }
        var3.method4479();
        field3606.method3418(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jc.p(I)V")
    public void method4479() {
    }

    @ObfuscatedName("jc.i(Lfv;B)V")
    public void method4473(class181 arg0) {
        while (true) {
            int var2 = arg0.method3012();
            if (var2 == 0) {
                return;
            }
            this.method4454(arg0, var2);
        }
    }

    @ObfuscatedName("jc.j(Lfv;IB)V")
    public void method4454(class181 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method3012();
            this.field3638 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3638[var4] = arg0.method3009();
            }
        } else if (arg1 == 2) {
            this.field3629 = arg0.method3021();
        } else if (arg1 == 12) {
            this.field3626 = arg0.method3012();
        } else if (arg1 == 13) {
            this.field3613 = arg0.method3009();
        } else if (arg1 == 14) {
            this.field3608 = arg0.method3009();
        } else if (arg1 == 15) {
            this.field3636 = arg0.method3009();
        } else if (arg1 == 16) {
            this.field3604 = arg0.method3009();
        } else if (arg1 == 17) {
            this.field3608 = arg0.method3009();
            this.field3617 = arg0.method3009();
            this.field3618 = arg0.method3009();
            this.field3609 = arg0.method3009();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3624[arg1 - 30] = arg0.method3021();
            if (this.field3624[arg1 - 30].equalsIgnoreCase(class233.field3100)) {
                this.field3624[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method3012();
            this.field3620 = new short[var5];
            this.field3621 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3620[var6] = (short) arg0.method3009();
                this.field3621[var6] = (short) arg0.method3009();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method3012();
            this.field3622 = new short[var7];
            this.field3610 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3622[var8] = (short) arg0.method3009();
                this.field3610[var8] = (short) arg0.method3009();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method3012();
            this.field3612 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3612[var10] = arg0.method3009();
            }
        } else if (arg1 == 93) {
            this.field3625 = false;
        } else if (arg1 == 95) {
            this.field3637 = arg0.method3009();
        } else if (arg1 == 97) {
            this.field3614 = arg0.method3009();
        } else if (arg1 == 98) {
            this.field3628 = arg0.method3009();
        } else if (arg1 == 99) {
            this.field3627 = true;
        } else if (arg1 == 100) {
            this.field3630 = arg0.method3013();
        } else if (arg1 == 101) {
            this.field3631 = arg0.method3013() * 5;
        } else if (arg1 == 102) {
            this.field3632 = arg0.method3009();
        } else if (arg1 == 103) {
            this.field3633 = arg0.method3009();
        } else if (arg1 == 106 || arg1 == 118) {
            this.field3635 = arg0.method3009();
            if (this.field3635 == 65535) {
                this.field3635 = -1;
            }
            this.field3611 = arg0.method3009();
            if (this.field3611 == 65535) {
                this.field3611 = -1;
            }
            int var11 = -1;
            if (arg1 == 118) {
                var11 = arg0.method3009();
                if (var11 == 65535) {
                    var11 = -1;
                }
            }
            int var12 = arg0.method3012();
            this.field3634 = new int[var12 + 2];
            for (int var13 = 0; var13 <= var12; var13++) {
                this.field3634[var13] = arg0.method3009();
                if (this.field3634[var13] == 65535) {
                    this.field3634[var13] = -1;
                }
            }
            this.field3634[var12 + 1] = var11;
        } else if (arg1 == 107) {
            this.field3615 = false;
        } else if (arg1 == 109) {
            this.field3619 = false;
        } else if (arg1 == 111) {
            this.field3639 = true;
        } else if (arg1 == 249) {
            this.field3640 = class257.method2376(arg0, this.field3640);
        }
    }

    @ObfuscatedName("jc.v(Ljf;ILjf;II)Len;")
    public final class133 method4455(class268 arg0, int arg1, class268 arg2, int arg3) {
        if (this.field3634 != null) {
            class266 var5 = this.method4481();
            return var5 == null ? null : var5.method4455(arg0, arg1, arg2, arg3);
        }
        class133 var6 = (class133) field3607.method3419((long) this.field3623);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field3638.length; var8++) {
                if (!Statics.field3605.method3932(this.field3638[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class127[] var9 = new class127[this.field3638.length];
            for (int var10 = 0; var10 < this.field3638.length; var10++) {
                var9[var10] = class127.method2302(Statics.field3605, this.field3638[var10], 0);
            }
            class127 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class127(var9, var9.length);
            }
            if (this.field3620 != null) {
                for (int var12 = 0; var12 < this.field3620.length; var12++) {
                    var11.method2360(this.field3620[var12], this.field3621[var12]);
                }
            }
            if (this.field3622 != null) {
                for (int var13 = 0; var13 < this.field3622.length; var13++) {
                    var11.method2305(this.field3622[var13], this.field3610[var13]);
                }
            }
            var6 = var11.method2335(this.field3630 + 64, this.field3631 + 850, -30, -50, -30);
            field3607.method3418(var6, (long) this.field3623);
        }
        class133 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method4509(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method4506(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method2409(true);
        } else {
            var14 = arg2.method4506(var6, arg3);
        }
        if (this.field3614 != 128 || this.field3628 != 128) {
            var14.method2397(this.field3614, this.field3628, this.field3614);
        }
        return var14;
    }

    @ObfuscatedName("jc.x(I)Ldv;")
    public final class127 method4476() {
        if (this.field3634 != null) {
            class266 var1 = this.method4481();
            return var1 == null ? null : var1.method4476();
        } else if (this.field3612 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field3612.length; var3++) {
                if (!Statics.field3605.method3932(this.field3612[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class127[] var4 = new class127[this.field3612.length];
            for (int var5 = 0; var5 < this.field3612.length; var5++) {
                var4[var5] = class127.method2302(Statics.field3605, this.field3612[var5], 0);
            }
            class127 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class127(var4, var4.length);
            }
            if (this.field3620 != null) {
                for (int var7 = 0; var7 < this.field3620.length; var7++) {
                    var6.method2360(this.field3620[var7], this.field3621[var7]);
                }
            }
            if (this.field3622 != null) {
                for (int var8 = 0; var8 < this.field3622.length; var8++) {
                    var6.method2305(this.field3622[var8], this.field3610[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("jc.e(B)Ljc;")
    public final class266 method4481() {
        int var1 = -1;
        if (this.field3635 != -1) {
            var1 = class219.method1684(this.field3635);
        } else if (this.field3611 != -1) {
            var1 = class219.field2689[this.field3611];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3634.length - 1) {
            var2 = this.field3634[var1];
        } else {
            var2 = this.field3634[this.field3634.length - 1];
        }
        return var2 == -1 ? null : method1704(var2);
    }

    @ObfuscatedName("jc.l(I)Z")
    public boolean method4460() {
        if (this.field3634 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field3635 != -1) {
            var1 = class219.method1684(this.field3635);
        } else if (this.field3611 != -1) {
            var1 = class219.field2689[this.field3611];
        }
        if (var1 >= 0 && var1 < this.field3634.length) {
            return this.field3634[var1] != -1;
        } else {
            return this.field3634[this.field3634.length - 1] != -1;
        }
    }

    @ObfuscatedName("jc.b(IIB)I")
    public int method4459(int arg0, int arg1) {
        return class257.method2750(this.field3640, arg0, arg1);
    }

    @ObfuscatedName("jc.n(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4457(int arg0, String arg1) {
        return class257.method2471(this.field3640, arg0, arg1);
    }
}
