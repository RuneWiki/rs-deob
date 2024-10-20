package deob;

@ObfuscatedName("jz")
public class class268 extends class181 {

    @ObfuscatedName("jz.q")
    public static class146 field3535 = new class146(64);

    @ObfuscatedName("jz.w")
    public static class146 field3543 = new class146(50);

    @ObfuscatedName("jz.o")
    public int field3537;

    @ObfuscatedName("jz.u")
    public String field3538 = class236.field2980;

    @ObfuscatedName("jz.g")
    public int field3539 = 1;

    @ObfuscatedName("jz.l")
    public int[] field3540;

    @ObfuscatedName("jz.e")
    public int[] field3536;

    @ObfuscatedName("jz.x")
    public int field3542 = -1;

    @ObfuscatedName("jz.d")
    public int field3569 = -1;

    @ObfuscatedName("jz.k")
    public int field3544 = -1;

    @ObfuscatedName("jz.n")
    public int field3545 = -1;

    @ObfuscatedName("jz.i")
    public int field3568 = -1;

    @ObfuscatedName("jz.a")
    public int field3547 = -1;

    @ObfuscatedName("jz.z")
    public int field3548 = -1;

    @ObfuscatedName("jz.j")
    public short[] field3562;

    @ObfuscatedName("jz.s")
    public short[] field3550;

    @ObfuscatedName("jz.t")
    public short[] field3551;

    @ObfuscatedName("jz.y")
    public short[] field3534;

    @ObfuscatedName("jz.h")
    public String[] field3553 = new String[5];

    @ObfuscatedName("jz.b")
    public boolean field3564 = true;

    @ObfuscatedName("jz.c")
    public int field3546 = -1;

    @ObfuscatedName("jz.r")
    public int field3556 = 128;

    @ObfuscatedName("jz.p")
    public int field3557 = 128;

    @ObfuscatedName("jz.v")
    public boolean field3558 = false;

    @ObfuscatedName("jz.ag")
    public int field3559 = 0;

    @ObfuscatedName("jz.aq")
    public int field3554 = 0;

    @ObfuscatedName("jz.aj")
    public int field3533 = -1;

    @ObfuscatedName("jz.av")
    public int field3561 = 32;

    @ObfuscatedName("jz.ar")
    public int[] field3563;

    @ObfuscatedName("jz.ac")
    public int field3552 = -1;

    @ObfuscatedName("jz.ay")
    public int field3565 = -1;

    @ObfuscatedName("jz.ah")
    public boolean field3566 = true;

    @ObfuscatedName("jz.ak")
    public boolean field3567 = true;

    @ObfuscatedName("jz.aw")
    public boolean field3541 = false;

    @ObfuscatedName("jz.al")
    public class317 field3555;

    @ObfuscatedName("hn.m(Lir;Lir;I)V")
    public static void method3724(class245 arg0, class245 arg1) {
        Statics.field3549 = arg0;
        Statics.field3560 = arg1;
    }

    @ObfuscatedName("jr.f(II)Ljz;")
    public static class268 method4643(int arg0) {
        class268 var1 = (class268) field3535.method3011((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3549.method4156(9, arg0);
        class268 var3 = new class268();
        var3.field3537 = arg0;
        if (var2 != null) {
            var3.method4712(new class202(var2));
        }
        var3.method4714();
        field3535.method3009(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jz.q(I)V")
    public void method4714() {
    }

    @ObfuscatedName("jz.w(Lgr;I)V")
    public void method4712(class202 arg0) {
        while (true) {
            int var2 = arg0.method3551();
            if (var2 == 0) {
                return;
            }
            this.method4707(arg0, var2);
        }
    }

    @ObfuscatedName("jz.o(Lgr;IB)V")
    public void method4707(class202 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method3551();
            this.field3540 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3540[var4] = arg0.method3530();
            }
        } else if (arg1 == 2) {
            this.field3538 = arg0.method3426();
        } else if (arg1 == 12) {
            this.field3539 = arg0.method3551();
        } else if (arg1 == 13) {
            this.field3542 = arg0.method3530();
        } else if (arg1 == 14) {
            this.field3545 = arg0.method3530();
        } else if (arg1 == 15) {
            this.field3569 = arg0.method3530();
        } else if (arg1 == 16) {
            this.field3544 = arg0.method3530();
        } else if (arg1 == 17) {
            this.field3545 = arg0.method3530();
            this.field3568 = arg0.method3530();
            this.field3547 = arg0.method3530();
            this.field3548 = arg0.method3530();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3553[arg1 - 30] = arg0.method3426();
            if (this.field3553[arg1 - 30].equalsIgnoreCase(class236.field2844)) {
                this.field3553[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method3551();
            this.field3562 = new short[var5];
            this.field3550 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3562[var6] = (short) arg0.method3530();
                this.field3550[var6] = (short) arg0.method3530();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method3551();
            this.field3551 = new short[var7];
            this.field3534 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3551[var8] = (short) arg0.method3530();
                this.field3534[var8] = (short) arg0.method3530();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method3551();
            this.field3536 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3536[var10] = arg0.method3530();
            }
        } else if (arg1 == 93) {
            this.field3564 = false;
        } else if (arg1 == 95) {
            this.field3546 = arg0.method3530();
        } else if (arg1 == 97) {
            this.field3556 = arg0.method3530();
        } else if (arg1 == 98) {
            this.field3557 = arg0.method3530();
        } else if (arg1 == 99) {
            this.field3558 = true;
        } else if (arg1 == 100) {
            this.field3559 = arg0.method3537();
        } else if (arg1 == 101) {
            this.field3554 = arg0.method3537() * 5;
        } else if (arg1 == 102) {
            this.field3533 = arg0.method3530();
        } else if (arg1 == 103) {
            this.field3561 = arg0.method3530();
        } else if (arg1 == 106 || arg1 == 118) {
            this.field3552 = arg0.method3530();
            if (this.field3552 == 65535) {
                this.field3552 = -1;
            }
            this.field3565 = arg0.method3530();
            if (this.field3565 == 65535) {
                this.field3565 = -1;
            }
            int var11 = -1;
            if (arg1 == 118) {
                var11 = arg0.method3530();
                if (var11 == 65535) {
                    var11 = -1;
                }
            }
            int var12 = arg0.method3551();
            this.field3563 = new int[var12 + 2];
            for (int var13 = 0; var13 <= var12; var13++) {
                this.field3563[var13] = arg0.method3530();
                if (this.field3563[var13] == 65535) {
                    this.field3563[var13] = -1;
                }
            }
            this.field3563[var12 + 1] = var11;
        } else if (arg1 == 107) {
            this.field3566 = false;
        } else if (arg1 == 109) {
            this.field3567 = false;
        } else if (arg1 == 111) {
            this.field3541 = true;
        } else if (arg1 == 249) {
            this.field3555 = Statics.method4176(arg0, this.field3555);
        }
    }

    @ObfuscatedName("jz.u(Ljh;ILjh;II)Ldu;")
    public final class128 method4705(class270 arg0, int arg1, class270 arg2, int arg3) {
        if (this.field3563 != null) {
            class268 var5 = this.method4713();
            return var5 == null ? null : var5.method4705(arg0, arg1, arg2, arg3);
        }
        class128 var6 = (class128) field3543.method3011((long) this.field3537);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field3540.length; var8++) {
                if (!Statics.field3560.method4158(this.field3540[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class122[] var9 = new class122[this.field3540.length];
            for (int var10 = 0; var10 < this.field3540.length; var10++) {
                var9[var10] = class122.method2537(Statics.field3560, this.field3540[var10], 0);
            }
            class122 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class122(var9, var9.length);
            }
            if (this.field3562 != null) {
                for (int var12 = 0; var12 < this.field3562.length; var12++) {
                    var11.method2538(this.field3562[var12], this.field3550[var12]);
                }
            }
            if (this.field3551 != null) {
                for (int var13 = 0; var13 < this.field3551.length; var13++) {
                    var11.method2543(this.field3551[var13], this.field3534[var13]);
                }
            }
            var6 = var11.method2572(this.field3559 + 64, this.field3554 + 850, -30, -50, -30);
            field3543.method3009(var6, (long) this.field3537);
        }
        class128 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method4787(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method4768(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method2647(true);
        } else {
            var14 = arg2.method4768(var6, arg3);
        }
        if (this.field3556 != 128 || this.field3557 != 128) {
            var14.method2635(this.field3556, this.field3557, this.field3556);
        }
        return var14;
    }

    @ObfuscatedName("jz.g(I)Ldw;")
    public final class122 method4709() {
        if (this.field3563 != null) {
            class268 var1 = this.method4713();
            return var1 == null ? null : var1.method4709();
        } else if (this.field3536 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field3536.length; var3++) {
                if (!Statics.field3560.method4158(this.field3536[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class122[] var4 = new class122[this.field3536.length];
            for (int var5 = 0; var5 < this.field3536.length; var5++) {
                var4[var5] = class122.method2537(Statics.field3560, this.field3536[var5], 0);
            }
            class122 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class122(var4, var4.length);
            }
            if (this.field3562 != null) {
                for (int var7 = 0; var7 < this.field3562.length; var7++) {
                    var6.method2538(this.field3562[var7], this.field3550[var7]);
                }
            }
            if (this.field3551 != null) {
                for (int var8 = 0; var8 < this.field3551.length; var8++) {
                    var6.method2543(this.field3551[var8], this.field3534[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("jz.l(B)Ljz;")
    public final class268 method4713() {
        int var1 = -1;
        if (this.field3552 != -1) {
            var1 = class224.method529(this.field3552);
        } else if (this.field3565 != -1) {
            var1 = class224.field2601[this.field3565];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3563.length - 1) {
            var2 = this.field3563[var1];
        } else {
            var2 = this.field3563[this.field3563.length - 1];
        }
        return var2 == -1 ? null : method4643(var2);
    }

    @ObfuscatedName("jz.e(I)Z")
    public boolean method4740() {
        if (this.field3563 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field3552 != -1) {
            var1 = class224.method529(this.field3552);
        } else if (this.field3565 != -1) {
            var1 = class224.field2601[this.field3565];
        }
        if (var1 >= 0 && var1 < this.field3563.length) {
            return this.field3563[var1] != -1;
        } else {
            return this.field3563[this.field3563.length - 1] != -1;
        }
    }

    @ObfuscatedName("jz.x(III)I")
    public int method4730(int arg0, int arg1) {
        class317 var3 = this.field3555;
        int var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class185 var5 = (class185) var3.method5382((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = var5.field2138;
            }
        }
        return var4;
    }

    @ObfuscatedName("jz.d(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4704(int arg0, String arg1) {
        return class259.method2980(this.field3555, arg0, arg1);
    }

    @ObfuscatedName("aj.a(B)V")
    public static void method383() {
        field3535.method3010();
        field3543.method3010();
    }
}
