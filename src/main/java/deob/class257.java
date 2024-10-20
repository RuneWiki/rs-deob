package deob;

@ObfuscatedName("ih")
public class class257 extends class176 {

    @ObfuscatedName("ih.b")
    public static class146 field3468 = new class146(64);

    @ObfuscatedName("ih.g")
    public static class146 field3469 = new class146(50);

    @ObfuscatedName("ih.z")
    public int field3470;

    @ObfuscatedName("ih.p")
    public String field3481 = class225.field2777;

    @ObfuscatedName("ih.h")
    public int field3490 = 1;

    @ObfuscatedName("ih.y")
    public int[] field3488;

    @ObfuscatedName("ih.w")
    public int[] field3474;

    @ObfuscatedName("ih.i")
    public int field3475 = -1;

    @ObfuscatedName("ih.k")
    public int field3476 = -1;

    @ObfuscatedName("ih.x")
    public int field3500 = -1;

    @ObfuscatedName("ih.o")
    public int field3478 = -1;

    @ObfuscatedName("ih.e")
    public int field3466 = -1;

    @ObfuscatedName("ih.n")
    public int field3480 = -1;

    @ObfuscatedName("ih.r")
    public int field3487 = -1;

    @ObfuscatedName("ih.c")
    public short[] field3482;

    @ObfuscatedName("ih.a")
    public short[] field3483;

    @ObfuscatedName("ih.d")
    public short[] field3484;

    @ObfuscatedName("ih.s")
    public short[] field3485;

    @ObfuscatedName("ih.t")
    public String[] field3486 = new String[5];

    @ObfuscatedName("ih.m")
    public boolean field3477 = true;

    @ObfuscatedName("ih.v")
    public int field3479 = -1;

    @ObfuscatedName("ih.q")
    public int field3491 = 128;

    @ObfuscatedName("ih.l")
    public int field3471 = 128;

    @ObfuscatedName("ih.j")
    public boolean field3489 = false;

    @ObfuscatedName("ih.af")
    public int field3492 = 0;

    @ObfuscatedName("ih.ad")
    public int field3493 = 0;

    @ObfuscatedName("ih.am")
    public int field3494 = -1;

    @ObfuscatedName("ih.ai")
    public int field3495 = 32;

    @ObfuscatedName("ih.ag")
    public int[] field3496;

    @ObfuscatedName("ih.ao")
    public int field3497 = -1;

    @ObfuscatedName("ih.aw")
    public int field3498 = -1;

    @ObfuscatedName("ih.ak")
    public boolean field3499 = true;

    @ObfuscatedName("ih.aa")
    public boolean field3473 = true;

    @ObfuscatedName("ih.ab")
    public boolean field3501 = false;

    @ObfuscatedName("ih.ar")
    public class316 field3502;

    @ObfuscatedName("ia.u(II)Lih;")
    public static class257 method4083(int arg0) {
        class257 var1 = (class257) field3468.method3076((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3472.method3928(9, arg0);
        class257 var3 = new class257();
        var3.field3470 = arg0;
        if (var2 != null) {
            var3.method4396(new class300(var2));
        }
        var3.method4395();
        field3468.method3078(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ih.f(I)V")
    public void method4395() {
    }

    @ObfuscatedName("ih.b(Lkg;I)V")
    public void method4396(class300 arg0) {
        while (true) {
            int var2 = arg0.method5138();
            if (var2 == 0) {
                return;
            }
            this.method4425(arg0, var2);
        }
    }

    @ObfuscatedName("ih.g(Lkg;II)V")
    public void method4425(class300 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method5138();
            this.field3488 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3488[var4] = arg0.method5337();
            }
        } else if (arg1 == 2) {
            this.field3481 = arg0.method5147();
        } else if (arg1 == 12) {
            this.field3490 = arg0.method5138();
        } else if (arg1 == 13) {
            this.field3475 = arg0.method5337();
        } else if (arg1 == 14) {
            this.field3478 = arg0.method5337();
        } else if (arg1 == 15) {
            this.field3476 = arg0.method5337();
        } else if (arg1 == 16) {
            this.field3500 = arg0.method5337();
        } else if (arg1 == 17) {
            this.field3478 = arg0.method5337();
            this.field3466 = arg0.method5337();
            this.field3480 = arg0.method5337();
            this.field3487 = arg0.method5337();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3486[arg1 - 30] = arg0.method5147();
            if (this.field3486[arg1 - 30].equalsIgnoreCase(class225.field3037)) {
                this.field3486[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method5138();
            this.field3482 = new short[var5];
            this.field3483 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3482[var6] = (short) arg0.method5337();
                this.field3483[var6] = (short) arg0.method5337();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method5138();
            this.field3484 = new short[var7];
            this.field3485 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3484[var8] = (short) arg0.method5337();
                this.field3485[var8] = (short) arg0.method5337();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method5138();
            this.field3474 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3474[var10] = arg0.method5337();
            }
        } else if (arg1 == 93) {
            this.field3477 = false;
        } else if (arg1 == 95) {
            this.field3479 = arg0.method5337();
        } else if (arg1 == 97) {
            this.field3491 = arg0.method5337();
        } else if (arg1 == 98) {
            this.field3471 = arg0.method5337();
        } else if (arg1 == 99) {
            this.field3489 = true;
        } else if (arg1 == 100) {
            this.field3492 = arg0.method5139();
        } else if (arg1 == 101) {
            this.field3493 = arg0.method5139();
        } else if (arg1 == 102) {
            this.field3494 = arg0.method5337();
        } else if (arg1 == 103) {
            this.field3495 = arg0.method5337();
        } else if (arg1 == 106 || arg1 == 118) {
            this.field3497 = arg0.method5337();
            if (this.field3497 == 65535) {
                this.field3497 = -1;
            }
            this.field3498 = arg0.method5337();
            if (this.field3498 == 65535) {
                this.field3498 = -1;
            }
            int var11 = -1;
            if (arg1 == 118) {
                var11 = arg0.method5337();
                if (var11 == 65535) {
                    var11 = -1;
                }
            }
            int var12 = arg0.method5138();
            this.field3496 = new int[var12 + 2];
            for (int var13 = 0; var13 <= var12; var13++) {
                this.field3496[var13] = arg0.method5337();
                if (this.field3496[var13] == 65535) {
                    this.field3496[var13] = -1;
                }
            }
            this.field3496[var12 + 1] = var11;
        } else if (arg1 == 107) {
            this.field3499 = false;
        } else if (arg1 == 109) {
            this.field3473 = false;
        } else if (arg1 == 111) {
            this.field3501 = true;
        } else if (arg1 == 249) {
            this.field3502 = class248.method3036(arg0, this.field3502);
        }
    }

    @ObfuscatedName("ih.z(Liy;ILiy;II)Ldf;")
    public final class128 method4398(class259 arg0, int arg1, class259 arg2, int arg3) {
        if (this.field3496 != null) {
            class257 var5 = this.method4426();
            return var5 == null ? null : var5.method4398(arg0, arg1, arg2, arg3);
        }
        class128 var6 = (class128) field3469.method3076((long) this.field3470);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field3488.length; var8++) {
                if (!Statics.field3467.method3897(this.field3488[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class122[] var9 = new class122[this.field3488.length];
            for (int var10 = 0; var10 < this.field3488.length; var10++) {
                var9[var10] = class122.method2548(Statics.field3467, this.field3488[var10], 0);
            }
            class122 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class122(var9, var9.length);
            }
            if (this.field3482 != null) {
                for (int var12 = 0; var12 < this.field3482.length; var12++) {
                    var11.method2561(this.field3482[var12], this.field3483[var12]);
                }
            }
            if (this.field3484 != null) {
                for (int var13 = 0; var13 < this.field3484.length; var13++) {
                    var11.method2617(this.field3484[var13], this.field3485[var13]);
                }
            }
            var6 = var11.method2568(this.field3492 + 64, this.field3493 * 5 + 850, -30, -50, -30);
            field3469.method3078(var6, (long) this.field3470);
        }
        class128 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method4449(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method4448(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method2636(true);
        } else {
            var14 = arg2.method4448(var6, arg3);
        }
        if (this.field3491 != 128 || this.field3471 != 128) {
            var14.method2652(this.field3491, this.field3471, this.field3491);
        }
        return var14;
    }

    @ObfuscatedName("ih.p(B)Ldq;")
    public final class122 method4399() {
        if (this.field3496 != null) {
            class257 var1 = this.method4426();
            return var1 == null ? null : var1.method4399();
        } else if (this.field3474 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field3474.length; var3++) {
                if (!Statics.field3467.method3897(this.field3474[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class122[] var4 = new class122[this.field3474.length];
            for (int var5 = 0; var5 < this.field3474.length; var5++) {
                var4[var5] = class122.method2548(Statics.field3467, this.field3474[var5], 0);
            }
            class122 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class122(var4, var4.length);
            }
            if (this.field3482 != null) {
                for (int var7 = 0; var7 < this.field3482.length; var7++) {
                    var6.method2561(this.field3482[var7], this.field3483[var7]);
                }
            }
            if (this.field3484 != null) {
                for (int var8 = 0; var8 < this.field3484.length; var8++) {
                    var6.method2617(this.field3484[var8], this.field3485[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("ih.h(I)Lih;")
    public final class257 method4426() {
        int var1 = -1;
        if (this.field3497 != -1) {
            var1 = class213.method3238(this.field3497);
        } else if (this.field3498 != -1) {
            var1 = class213.field2531[this.field3498];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3496.length - 1) {
            var2 = this.field3496[var1];
        } else {
            var2 = this.field3496[this.field3496.length - 1];
        }
        return var2 == -1 ? null : method4083(var2);
    }

    @ObfuscatedName("ih.y(I)Z")
    public boolean method4400() {
        if (this.field3496 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field3497 != -1) {
            var1 = class213.method3238(this.field3497);
        } else if (this.field3498 != -1) {
            var1 = class213.field2531[this.field3498];
        }
        if (var1 >= 0 && var1 < this.field3496.length) {
            return this.field3496[var1] != -1;
        } else {
            return this.field3496[this.field3496.length - 1] != -1;
        }
    }

    @ObfuscatedName("ih.w(III)I")
    public int method4401(int arg0, int arg1) {
        class316 var3 = this.field3502;
        int var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class180 var5 = (class180) var3.method5521((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = var5.field2125;
            }
        }
        return var4;
    }

    @ObfuscatedName("ih.i(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4402(int arg0, String arg1) {
        return class248.method3828(this.field3502, arg0, arg1);
    }

    @ObfuscatedName("ht.k(B)V")
    public static void method3814() {
        field3468.method3075();
        field3469.method3075();
    }
}
