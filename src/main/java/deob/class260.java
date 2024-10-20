package deob;

@ObfuscatedName("im")
public class class260 extends class196 {

    @ObfuscatedName("im.f")
    public static class191 field3560 = new class191(64);

    @ObfuscatedName("im.p")
    public static class191 field3540 = new class191(50);

    @ObfuscatedName("im.x")
    public int field3542;

    @ObfuscatedName("im.g")
    public String field3543 = "null";

    @ObfuscatedName("im.c")
    public int field3544 = 1;

    @ObfuscatedName("im.l")
    public int[] field3545;

    @ObfuscatedName("im.w")
    public int[] field3546;

    @ObfuscatedName("im.b")
    public int field3554 = -1;

    @ObfuscatedName("im.o")
    public int field3564 = -1;

    @ObfuscatedName("im.m")
    public int field3549 = -1;

    @ObfuscatedName("im.i")
    public int field3550 = -1;

    @ObfuscatedName("im.s")
    public int field3551 = -1;

    @ObfuscatedName("im.r")
    public int field3552 = -1;

    @ObfuscatedName("im.e")
    public int field3547 = -1;

    @ObfuscatedName("im.a")
    public short[] field3553;

    @ObfuscatedName("im.v")
    public short[] field3574;

    @ObfuscatedName("im.t")
    public short[] field3556;

    @ObfuscatedName("im.y")
    public short[] field3559;

    @ObfuscatedName("im.z")
    public String[] field3555 = new String[5];

    @ObfuscatedName("im.u")
    public boolean field3539 = true;

    @ObfuscatedName("im.k")
    public int field3558 = -1;

    @ObfuscatedName("im.q")
    public int field3561 = 128;

    @ObfuscatedName("im.n")
    public int field3562 = 128;

    @ObfuscatedName("im.d")
    public boolean field3563 = false;

    @ObfuscatedName("im.ax")
    public int field3557 = 0;

    @ObfuscatedName("im.ao")
    public int field3565 = 0;

    @ObfuscatedName("im.an")
    public int field3541 = -1;

    @ObfuscatedName("im.ar")
    public int field3567 = 32;

    @ObfuscatedName("im.ag")
    public int[] field3568;

    @ObfuscatedName("im.av")
    public int field3569 = -1;

    @ObfuscatedName("im.ab")
    public int field3570 = -1;

    @ObfuscatedName("im.aj")
    public boolean field3571 = true;

    @ObfuscatedName("im.ae")
    public boolean field3572 = true;

    @ObfuscatedName("im.at")
    public boolean field3573 = false;

    @ObfuscatedName("im.as")
    public class188 field3548;

    @ObfuscatedName("gf.j(IB)Lim;")
    public static class260 method3178(int arg0) {
        class260 var1 = (class260) field3560.method3271((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2259.method3773(9, arg0);
        class260 var3 = new class260();
        var3.field3542 = arg0;
        if (var2 != null) {
            var3.method4307(new class175(var2));
        }
        var3.method4338();
        field3560.method3270(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("im.h(B)V")
    public void method4338() {
    }

    @ObfuscatedName("im.f(Lfb;I)V")
    public void method4307(class175 arg0) {
        while (true) {
            int var2 = arg0.method2903();
            if (var2 == 0) {
                return;
            }
            this.method4308(arg0, var2);
        }
    }

    @ObfuscatedName("im.p(Lfb;II)V")
    public void method4308(class175 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2903();
            this.field3545 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3545[var4] = arg0.method3023();
            }
        } else if (arg1 == 2) {
            this.field3543 = arg0.method2911();
        } else if (arg1 == 12) {
            this.field3544 = arg0.method2903();
        } else if (arg1 == 13) {
            this.field3554 = arg0.method3023();
        } else if (arg1 == 14) {
            this.field3550 = arg0.method3023();
        } else if (arg1 == 15) {
            this.field3564 = arg0.method3023();
        } else if (arg1 == 16) {
            this.field3549 = arg0.method3023();
        } else if (arg1 == 17) {
            this.field3550 = arg0.method3023();
            this.field3551 = arg0.method3023();
            this.field3552 = arg0.method3023();
            this.field3547 = arg0.method3023();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3555[arg1 - 30] = arg0.method2911();
            if (this.field3555[arg1 - 30].equalsIgnoreCase(class227.field2979)) {
                this.field3555[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method2903();
            this.field3553 = new short[var5];
            this.field3574 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3553[var6] = (short) arg0.method3023();
                this.field3574[var6] = (short) arg0.method3023();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2903();
            this.field3556 = new short[var7];
            this.field3559 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3556[var8] = (short) arg0.method3023();
                this.field3559[var8] = (short) arg0.method3023();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method2903();
            this.field3546 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3546[var10] = arg0.method3023();
            }
        } else if (arg1 == 93) {
            this.field3539 = false;
        } else if (arg1 == 95) {
            this.field3558 = arg0.method3023();
        } else if (arg1 == 97) {
            this.field3561 = arg0.method3023();
        } else if (arg1 == 98) {
            this.field3562 = arg0.method3023();
        } else if (arg1 == 99) {
            this.field3563 = true;
        } else if (arg1 == 100) {
            this.field3557 = arg0.method2980();
        } else if (arg1 == 101) {
            this.field3565 = arg0.method2980() * 5;
        } else if (arg1 == 102) {
            this.field3541 = arg0.method3023();
        } else if (arg1 == 103) {
            this.field3567 = arg0.method3023();
        } else if (arg1 == 106 || arg1 == 118) {
            this.field3569 = arg0.method3023();
            if (this.field3569 == 65535) {
                this.field3569 = -1;
            }
            this.field3570 = arg0.method3023();
            if (this.field3570 == 65535) {
                this.field3570 = -1;
            }
            int var11 = -1;
            if (arg1 == 118) {
                var11 = arg0.method3023();
                if (var11 == 65535) {
                    var11 = -1;
                }
            }
            int var12 = arg0.method2903();
            this.field3568 = new int[var12 + 2];
            for (int var13 = 0; var13 <= var12; var13++) {
                this.field3568[var13] = arg0.method3023();
                if (this.field3568[var13] == 65535) {
                    this.field3568[var13] = -1;
                }
            }
            this.field3568[var12 + 1] = var11;
        } else if (arg1 == 107) {
            this.field3571 = false;
        } else if (arg1 == 109) {
            this.field3572 = false;
        } else if (arg1 == 111) {
            this.field3573 = true;
        } else if (arg1 == 249) {
            this.field3548 = class251.method3769(arg0, this.field3548);
        }
    }

    @ObfuscatedName("im.x(Ljf;ILjf;II)Leo;")
    public final class135 method4309(class262 arg0, int arg1, class262 arg2, int arg3) {
        if (this.field3568 != null) {
            class260 var5 = this.method4331();
            return var5 == null ? null : var5.method4309(arg0, arg1, arg2, arg3);
        }
        class135 var6 = (class135) field3540.method3271((long) this.field3542);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field3545.length; var8++) {
                if (!Statics.field3566.method3775(this.field3545[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class129[] var9 = new class129[this.field3545.length];
            for (int var10 = 0; var10 < this.field3545.length; var10++) {
                var9[var10] = class129.method2208(Statics.field3566, this.field3545[var10], 0);
            }
            class129 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class129(var9, var9.length);
            }
            if (this.field3553 != null) {
                for (int var12 = 0; var12 < this.field3553.length; var12++) {
                    var11.method2241(this.field3553[var12], this.field3574[var12]);
                }
            }
            if (this.field3556 != null) {
                for (int var13 = 0; var13 < this.field3556.length; var13++) {
                    var11.method2223(this.field3556[var13], this.field3559[var13]);
                }
            }
            var6 = var11.method2229(this.field3557 + 64, this.field3565 + 850, -30, -50, -30);
            field3540.method3270(var6, (long) this.field3542);
        }
        class135 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method4374(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method4361(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method2302(true);
        } else {
            var14 = arg2.method4361(var6, arg3);
        }
        if (this.field3561 != 128 || this.field3562 != 128) {
            var14.method2316(this.field3561, this.field3562, this.field3561);
        }
        return var14;
    }

    @ObfuscatedName("im.g(B)Ldi;")
    public final class129 method4310() {
        if (this.field3568 != null) {
            class260 var1 = this.method4331();
            return var1 == null ? null : var1.method4310();
        } else if (this.field3546 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field3546.length; var3++) {
                if (!Statics.field3566.method3775(this.field3546[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class129[] var4 = new class129[this.field3546.length];
            for (int var5 = 0; var5 < this.field3546.length; var5++) {
                var4[var5] = class129.method2208(Statics.field3566, this.field3546[var5], 0);
            }
            class129 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class129(var4, var4.length);
            }
            if (this.field3553 != null) {
                for (int var7 = 0; var7 < this.field3553.length; var7++) {
                    var6.method2241(this.field3553[var7], this.field3574[var7]);
                }
            }
            if (this.field3556 != null) {
                for (int var8 = 0; var8 < this.field3556.length; var8++) {
                    var6.method2223(this.field3556[var8], this.field3559[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("im.c(I)Lim;")
    public final class260 method4331() {
        int var1 = -1;
        if (this.field3569 != -1) {
            var1 = class213.method13(this.field3569);
        } else if (this.field3570 != -1) {
            var1 = class213.field2604[this.field3570];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3568.length - 1) {
            var2 = this.field3568[var1];
        } else {
            var2 = this.field3568[this.field3568.length - 1];
        }
        return var2 == -1 ? null : method3178(var2);
    }

    @ObfuscatedName("im.l(B)Z")
    public boolean method4312() {
        if (this.field3568 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field3569 != -1) {
            var1 = class213.method13(this.field3569);
        } else if (this.field3570 != -1) {
            var1 = class213.field2604[this.field3570];
        }
        if (var1 >= 0 && var1 < this.field3568.length) {
            return this.field3568[var1] != -1;
        } else {
            return this.field3568[this.field3568.length - 1] != -1;
        }
    }

    @ObfuscatedName("im.w(III)I")
    public int method4313(int arg0, int arg1) {
        return class251.method1735(this.field3548, arg0, arg1);
    }

    @ObfuscatedName("im.b(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4314(int arg0, String arg1) {
        return class251.method246(this.field3548, arg0, arg1);
    }
}
