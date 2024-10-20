package deob;

@ObfuscatedName("ib")
public class class259 extends class195 {

    @ObfuscatedName("ib.i")
    public static class190 field3562 = new class190(64);

    @ObfuscatedName("ib.u")
    public static class190 field3553 = new class190(50);

    @ObfuscatedName("ib.g")
    public int field3544;

    @ObfuscatedName("ib.m")
    public String field3532 = "null";

    @ObfuscatedName("ib.s")
    public int field3533 = 1;

    @ObfuscatedName("ib.x")
    public int[] field3531;

    @ObfuscatedName("ib.p")
    public int[] field3535;

    @ObfuscatedName("ib.k")
    public int field3548 = -1;

    @ObfuscatedName("ib.r")
    public int field3551 = -1;

    @ObfuscatedName("ib.w")
    public int field3538 = -1;

    @ObfuscatedName("ib.v")
    public int field3539 = -1;

    @ObfuscatedName("ib.h")
    public int field3540 = -1;

    @ObfuscatedName("ib.t")
    public int field3541 = -1;

    @ObfuscatedName("ib.a")
    public int field3542 = -1;

    @ObfuscatedName("ib.e")
    public short[] field3543;

    @ObfuscatedName("ib.y")
    public short[] field3536;

    @ObfuscatedName("ib.l")
    public short[] field3529;

    @ObfuscatedName("ib.q")
    public short[] field3546;

    @ObfuscatedName("ib.f")
    public String[] field3547 = new String[5];

    @ObfuscatedName("ib.j")
    public boolean field3549 = true;

    @ObfuscatedName("ib.n")
    public int field3528 = -1;

    @ObfuscatedName("ib.z")
    public int field3550 = 128;

    @ObfuscatedName("ib.b")
    public int field3554 = 128;

    @ObfuscatedName("ib.d")
    public boolean field3552 = false;

    @ObfuscatedName("ib.ap")
    public int field3537 = 0;

    @ObfuscatedName("ib.aj")
    public int field3530 = 0;

    @ObfuscatedName("ib.am")
    public int field3555 = -1;

    @ObfuscatedName("ib.ag")
    public int field3556 = 32;

    @ObfuscatedName("ib.av")
    public int[] field3557;

    @ObfuscatedName("ib.al")
    public int field3558 = -1;

    @ObfuscatedName("ib.ab")
    public int field3559 = -1;

    @ObfuscatedName("ib.af")
    public boolean field3560 = true;

    @ObfuscatedName("ib.ak")
    public boolean field3561 = true;

    @ObfuscatedName("ib.ar")
    public boolean field3534 = false;

    @ObfuscatedName("ib.an")
    public class187 field3563;

    @ObfuscatedName("ay.c(Lip;Lip;I)V")
    public static void method647(class236 arg0, class236 arg1) {
        Statics.field3545 = arg0;
        Statics.field2082 = arg1;
    }

    @ObfuscatedName("ap.o(II)Lib;")
    public static class259 method200(int arg0) {
        class259 var1 = (class259) field3562.method3220((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3545.method3741(9, arg0);
        class259 var3 = new class259();
        var3.field3544 = arg0;
        if (var2 != null) {
            var3.method4228(new class174(var2));
        }
        var3.method4202();
        field3562.method3233(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ib.i(B)V")
    public void method4202() {
    }

    @ObfuscatedName("ib.u(Lfp;B)V")
    public void method4228(class174 arg0) {
        while (true) {
            int var2 = arg0.method2843();
            if (var2 == 0) {
                return;
            }
            this.method4204(arg0, var2);
        }
    }

    @ObfuscatedName("ib.g(Lfp;II)V")
    public void method4204(class174 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2843();
            this.field3531 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3531[var4] = arg0.method2861();
            }
        } else if (arg1 == 2) {
            this.field3532 = arg0.method2867();
        } else if (arg1 == 12) {
            this.field3533 = arg0.method2843();
        } else if (arg1 == 13) {
            this.field3548 = arg0.method2861();
        } else if (arg1 == 14) {
            this.field3539 = arg0.method2861();
        } else if (arg1 == 15) {
            this.field3551 = arg0.method2861();
        } else if (arg1 == 16) {
            this.field3538 = arg0.method2861();
        } else if (arg1 == 17) {
            this.field3539 = arg0.method2861();
            this.field3540 = arg0.method2861();
            this.field3541 = arg0.method2861();
            this.field3542 = arg0.method2861();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3547[arg1 - 30] = arg0.method2867();
            if (this.field3547[arg1 - 30].equalsIgnoreCase(class226.field2875)) {
                this.field3547[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method2843();
            this.field3543 = new short[var5];
            this.field3536 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3543[var6] = (short) arg0.method2861();
                this.field3536[var6] = (short) arg0.method2861();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2843();
            this.field3529 = new short[var7];
            this.field3546 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3529[var8] = (short) arg0.method2861();
                this.field3546[var8] = (short) arg0.method2861();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method2843();
            this.field3535 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3535[var10] = arg0.method2861();
            }
        } else if (arg1 == 93) {
            this.field3549 = false;
        } else if (arg1 == 95) {
            this.field3528 = arg0.method2861();
        } else if (arg1 == 97) {
            this.field3550 = arg0.method2861();
        } else if (arg1 == 98) {
            this.field3554 = arg0.method2861();
        } else if (arg1 == 99) {
            this.field3552 = true;
        } else if (arg1 == 100) {
            this.field3537 = arg0.method3014();
        } else if (arg1 == 101) {
            this.field3530 = arg0.method3014() * 5;
        } else if (arg1 == 102) {
            this.field3555 = arg0.method2861();
        } else if (arg1 == 103) {
            this.field3556 = arg0.method2861();
        } else if (arg1 == 106 || arg1 == 118) {
            this.field3558 = arg0.method2861();
            if (this.field3558 == 65535) {
                this.field3558 = -1;
            }
            this.field3559 = arg0.method2861();
            if (this.field3559 == 65535) {
                this.field3559 = -1;
            }
            int var11 = -1;
            if (arg1 == 118) {
                var11 = arg0.method2861();
                if (var11 == 65535) {
                    var11 = -1;
                }
            }
            int var12 = arg0.method2843();
            this.field3557 = new int[var12 + 2];
            for (int var13 = 0; var13 <= var12; var13++) {
                this.field3557[var13] = arg0.method2861();
                if (this.field3557[var13] == 65535) {
                    this.field3557[var13] = -1;
                }
            }
            this.field3557[var12 + 1] = var11;
        } else if (arg1 == 107) {
            this.field3560 = false;
        } else if (arg1 == 109) {
            this.field3561 = false;
        } else if (arg1 == 111) {
            this.field3534 = true;
        } else if (arg1 == 249) {
            this.field3563 = class250.method558(arg0, this.field3563);
        }
    }

    @ObfuscatedName("ib.m(Ljc;ILjc;II)Leo;")
    public final class134 method4205(class261 arg0, int arg1, class261 arg2, int arg3) {
        if (this.field3557 != null) {
            class259 var5 = this.method4231();
            return var5 == null ? null : var5.method4205(arg0, arg1, arg2, arg3);
        }
        class134 var6 = (class134) field3553.method3220((long) this.field3544);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field3531.length; var8++) {
                if (!Statics.field2082.method3716(this.field3531[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class128[] var9 = new class128[this.field3531.length];
            for (int var10 = 0; var10 < this.field3531.length; var10++) {
                var9[var10] = class128.method2138(Statics.field2082, this.field3531[var10], 0);
            }
            class128 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class128(var9, var9.length);
            }
            if (this.field3543 != null) {
                for (int var12 = 0; var12 < this.field3543.length; var12++) {
                    var11.method2153(this.field3543[var12], this.field3536[var12]);
                }
            }
            if (this.field3529 != null) {
                for (int var13 = 0; var13 < this.field3529.length; var13++) {
                    var11.method2154(this.field3529[var13], this.field3546[var13]);
                }
            }
            var6 = var11.method2142(this.field3537 + 64, this.field3530 + 850, -30, -50, -30);
            field3553.method3233(var6, (long) this.field3544);
        }
        class134 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method4273(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method4274(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method2236(true);
        } else {
            var14 = arg2.method4274(var6, arg3);
        }
        if (this.field3550 != 128 || this.field3554 != 128) {
            var14.method2294(this.field3550, this.field3554, this.field3550);
        }
        return var14;
    }

    @ObfuscatedName("ib.s(B)Ldj;")
    public final class128 method4206() {
        if (this.field3557 != null) {
            class259 var1 = this.method4231();
            return var1 == null ? null : var1.method4206();
        } else if (this.field3535 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field3535.length; var3++) {
                if (!Statics.field2082.method3716(this.field3535[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class128[] var4 = new class128[this.field3535.length];
            for (int var5 = 0; var5 < this.field3535.length; var5++) {
                var4[var5] = class128.method2138(Statics.field2082, this.field3535[var5], 0);
            }
            class128 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class128(var4, var4.length);
            }
            if (this.field3543 != null) {
                for (int var7 = 0; var7 < this.field3543.length; var7++) {
                    var6.method2153(this.field3543[var7], this.field3536[var7]);
                }
            }
            if (this.field3529 != null) {
                for (int var8 = 0; var8 < this.field3529.length; var8++) {
                    var6.method2154(this.field3529[var8], this.field3546[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("ib.x(B)Lib;")
    public final class259 method4231() {
        int var1 = -1;
        if (this.field3558 != -1) {
            var1 = class212.method117(this.field3558);
        } else if (this.field3559 != -1) {
            var1 = class212.field2573[this.field3559];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3557.length - 1) {
            var2 = this.field3557[var1];
        } else {
            var2 = this.field3557[this.field3557.length - 1];
        }
        return var2 == -1 ? null : method200(var2);
    }

    @ObfuscatedName("ib.p(I)Z")
    public boolean method4203() {
        if (this.field3557 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field3558 != -1) {
            var1 = class212.method117(this.field3558);
        } else if (this.field3559 != -1) {
            var1 = class212.field2573[this.field3559];
        }
        if (var1 >= 0 && var1 < this.field3557.length) {
            return this.field3557[var1] != -1;
        } else {
            return this.field3557[this.field3557.length - 1] != -1;
        }
    }

    @ObfuscatedName("ib.k(III)I")
    public int method4215(int arg0, int arg1) {
        return class250.method1861(this.field3563, arg0, arg1);
    }

    @ObfuscatedName("ib.r(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4210(int arg0, String arg1) {
        return class250.method3707(this.field3563, arg0, arg1);
    }

    @ObfuscatedName("ap.w(I)V")
    public static void method171() {
        field3562.method3223();
        field3553.method3223();
    }
}
