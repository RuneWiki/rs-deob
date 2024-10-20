package deob;

@ObfuscatedName("in")
public class class260 extends class196 {

    @ObfuscatedName("in.g")
    public static class191 field3544 = new class191(64);

    @ObfuscatedName("in.y")
    public static class191 field3577 = new class191(50);

    @ObfuscatedName("in.w")
    public int field3546;

    @ObfuscatedName("in.k")
    public String field3542 = "null";

    @ObfuscatedName("in.v")
    public int field3548 = 1;

    @ObfuscatedName("in.z")
    public int[] field3563;

    @ObfuscatedName("in.r")
    public int[] field3556;

    @ObfuscatedName("in.u")
    public int field3551 = -1;

    @ObfuscatedName("in.d")
    public int field3552 = -1;

    @ObfuscatedName("in.o")
    public int field3547 = -1;

    @ObfuscatedName("in.l")
    public int field3554 = -1;

    @ObfuscatedName("in.h")
    public int field3555 = -1;

    @ObfuscatedName("in.s")
    public int field3549 = -1;

    @ObfuscatedName("in.c")
    public int field3557 = -1;

    @ObfuscatedName("in.m")
    public short[] field3558;

    @ObfuscatedName("in.a")
    public short[] field3559;

    @ObfuscatedName("in.t")
    public short[] field3550;

    @ObfuscatedName("in.p")
    public short[] field3561;

    @ObfuscatedName("in.f")
    public String[] field3562 = new String[5];

    @ObfuscatedName("in.b")
    public boolean field3567 = true;

    @ObfuscatedName("in.x")
    public int field3564 = -1;

    @ObfuscatedName("in.i")
    public int field3565 = 128;

    @ObfuscatedName("in.j")
    public int field3566 = 128;

    @ObfuscatedName("in.q")
    public boolean field3553 = false;

    @ObfuscatedName("in.ag")
    public int field3568 = 0;

    @ObfuscatedName("in.ay")
    public int field3569 = 0;

    @ObfuscatedName("in.au")
    public int field3570 = -1;

    @ObfuscatedName("in.ah")
    public int field3571 = 32;

    @ObfuscatedName("in.ao")
    public int[] field3572;

    @ObfuscatedName("in.al")
    public int field3573 = -1;

    @ObfuscatedName("in.ae")
    public int field3574 = -1;

    @ObfuscatedName("in.ax")
    public boolean field3575 = true;

    @ObfuscatedName("in.az")
    public boolean field3576 = true;

    @ObfuscatedName("in.aw")
    public boolean field3560 = false;

    @ObfuscatedName("in.av")
    public class188 field3578;

    @ObfuscatedName("dk.e(Lit;Lit;I)V")
    public static void method2191(class237 arg0, class237 arg1) {
        Statics.field3545 = arg0;
        Statics.field3543 = arg1;
    }

    @ObfuscatedName("p.n(IB)Lin;")
    public static class260 method137(int arg0) {
        class260 var1 = (class260) field3544.method3288((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3545.method3817(9, arg0);
        class260 var3 = new class260();
        var3.field3546 = arg0;
        if (var2 != null) {
            var3.method4342(new class175(var2));
        }
        var3.method4366();
        field3544.method3278(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("in.g(I)V")
    public void method4366() {
    }

    @ObfuscatedName("in.y(Lfh;I)V")
    public void method4342(class175 arg0) {
        while (true) {
            int var2 = arg0.method2928();
            if (var2 == 0) {
                return;
            }
            this.method4343(arg0, var2);
        }
    }

    @ObfuscatedName("in.w(Lfh;II)V")
    public void method4343(class175 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2928();
            this.field3563 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3563[var4] = arg0.method3091();
            }
        } else if (arg1 == 2) {
            this.field3542 = arg0.method3113();
        } else if (arg1 == 12) {
            this.field3548 = arg0.method2928();
        } else if (arg1 == 13) {
            this.field3551 = arg0.method3091();
        } else if (arg1 == 14) {
            this.field3554 = arg0.method3091();
        } else if (arg1 == 15) {
            this.field3552 = arg0.method3091();
        } else if (arg1 == 16) {
            this.field3547 = arg0.method3091();
        } else if (arg1 == 17) {
            this.field3554 = arg0.method3091();
            this.field3555 = arg0.method3091();
            this.field3549 = arg0.method3091();
            this.field3557 = arg0.method3091();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3562[arg1 - 30] = arg0.method3113();
            if (this.field3562[arg1 - 30].equalsIgnoreCase(class227.field2829)) {
                this.field3562[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method2928();
            this.field3558 = new short[var5];
            this.field3559 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3558[var6] = (short) arg0.method3091();
                this.field3559[var6] = (short) arg0.method3091();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2928();
            this.field3550 = new short[var7];
            this.field3561 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3550[var8] = (short) arg0.method3091();
                this.field3561[var8] = (short) arg0.method3091();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method2928();
            this.field3556 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3556[var10] = arg0.method3091();
            }
        } else if (arg1 == 93) {
            this.field3567 = false;
        } else if (arg1 == 95) {
            this.field3564 = arg0.method3091();
        } else if (arg1 == 97) {
            this.field3565 = arg0.method3091();
        } else if (arg1 == 98) {
            this.field3566 = arg0.method3091();
        } else if (arg1 == 99) {
            this.field3553 = true;
        } else if (arg1 == 100) {
            this.field3568 = arg0.method2998();
        } else if (arg1 == 101) {
            this.field3569 = arg0.method2998() * 5;
        } else if (arg1 == 102) {
            this.field3570 = arg0.method3091();
        } else if (arg1 == 103) {
            this.field3571 = arg0.method3091();
        } else if (arg1 == 106 || arg1 == 118) {
            this.field3573 = arg0.method3091();
            if (this.field3573 == 65535) {
                this.field3573 = -1;
            }
            this.field3574 = arg0.method3091();
            if (this.field3574 == 65535) {
                this.field3574 = -1;
            }
            int var11 = -1;
            if (arg1 == 118) {
                var11 = arg0.method3091();
                if (var11 == 65535) {
                    var11 = -1;
                }
            }
            int var12 = arg0.method2928();
            this.field3572 = new int[var12 + 2];
            for (int var13 = 0; var13 <= var12; var13++) {
                this.field3572[var13] = arg0.method3091();
                if (this.field3572[var13] == 65535) {
                    this.field3572[var13] = -1;
                }
            }
            this.field3572[var12 + 1] = var11;
        } else if (arg1 == 107) {
            this.field3575 = false;
        } else if (arg1 == 109) {
            this.field3576 = false;
        } else if (arg1 == 111) {
            this.field3560 = true;
        } else if (arg1 == 249) {
            this.field3578 = class251.method990(arg0, this.field3578);
        }
    }

    @ObfuscatedName("in.k(Ljd;ILjd;II)Lew;")
    public final class135 method4344(class262 arg0, int arg1, class262 arg2, int arg3) {
        if (this.field3572 != null) {
            class260 var5 = this.method4372();
            return var5 == null ? null : var5.method4344(arg0, arg1, arg2, arg3);
        }
        class135 var6 = (class135) field3577.method3288((long) this.field3546);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field3563.length; var8++) {
                if (!Statics.field3543.method3819(this.field3563[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class129[] var9 = new class129[this.field3563.length];
            for (int var10 = 0; var10 < this.field3563.length; var10++) {
                var9[var10] = class129.method2235(Statics.field3543, this.field3563[var10], 0);
            }
            class129 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class129(var9, var9.length);
            }
            if (this.field3558 != null) {
                for (int var12 = 0; var12 < this.field3558.length; var12++) {
                    var11.method2234(this.field3558[var12], this.field3559[var12]);
                }
            }
            if (this.field3550 != null) {
                for (int var13 = 0; var13 < this.field3550.length; var13++) {
                    var11.method2248(this.field3550[var13], this.field3561[var13]);
                }
            }
            var6 = var11.method2242(this.field3568 + 64, this.field3569 + 850, -30, -50, -30);
            field3577.method3278(var6, (long) this.field3546);
        }
        class135 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method4402(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method4399(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method2409(true);
        } else {
            var14 = arg2.method4399(var6, arg3);
        }
        if (this.field3565 != 128 || this.field3566 != 128) {
            var14.method2332(this.field3565, this.field3566, this.field3565);
        }
        return var14;
    }

    @ObfuscatedName("in.v(I)Ldn;")
    public final class129 method4345() {
        if (this.field3572 != null) {
            class260 var1 = this.method4372();
            return var1 == null ? null : var1.method4345();
        } else if (this.field3556 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field3556.length; var3++) {
                if (!Statics.field3543.method3819(this.field3556[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class129[] var4 = new class129[this.field3556.length];
            for (int var5 = 0; var5 < this.field3556.length; var5++) {
                var4[var5] = class129.method2235(Statics.field3543, this.field3556[var5], 0);
            }
            class129 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class129(var4, var4.length);
            }
            if (this.field3558 != null) {
                for (int var7 = 0; var7 < this.field3558.length; var7++) {
                    var6.method2234(this.field3558[var7], this.field3559[var7]);
                }
            }
            if (this.field3550 != null) {
                for (int var8 = 0; var8 < this.field3550.length; var8++) {
                    var6.method2248(this.field3550[var8], this.field3561[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("in.z(B)Lin;")
    public final class260 method4372() {
        int var1 = -1;
        if (this.field3573 != -1) {
            var1 = class213.method3619(this.field3573);
        } else if (this.field3574 != -1) {
            var1 = class213.field2585[this.field3574];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3572.length - 1) {
            var2 = this.field3572[var1];
        } else {
            var2 = this.field3572[this.field3572.length - 1];
        }
        return var2 == -1 ? null : method137(var2);
    }

    @ObfuscatedName("in.r(I)Z")
    public boolean method4376() {
        if (this.field3572 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field3573 != -1) {
            var1 = class213.method3619(this.field3573);
        } else if (this.field3574 != -1) {
            var1 = class213.field2585[this.field3574];
        }
        if (var1 >= 0 && var1 < this.field3572.length) {
            return this.field3572[var1] != -1;
        } else {
            return this.field3572[this.field3572.length - 1] != -1;
        }
    }

    @ObfuscatedName("in.u(III)I")
    public int method4348(int arg0, int arg1) {
        return class251.method464(this.field3578, arg0, arg1);
    }

    @ObfuscatedName("in.d(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4365(int arg0, String arg1) {
        return class251.method2901(this.field3578, arg0, arg1);
    }
}
