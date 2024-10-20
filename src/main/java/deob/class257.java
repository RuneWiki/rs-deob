package deob;

@ObfuscatedName("il")
public class class257 extends class176 {

    @ObfuscatedName("il.v")
    public static class146 field3451 = new class146(64);

    @ObfuscatedName("il.u")
    public static class146 field3452 = new class146(50);

    @ObfuscatedName("il.r")
    public int field3453;

    @ObfuscatedName("il.p")
    public String field3454 = class225.field2755;

    @ObfuscatedName("il.q")
    public int field3474 = 1;

    @ObfuscatedName("il.m")
    public int[] field3456;

    @ObfuscatedName("il.y")
    public int[] field3449;

    @ObfuscatedName("il.i")
    public int field3458 = -1;

    @ObfuscatedName("il.c")
    public int field3478 = -1;

    @ObfuscatedName("il.b")
    public int field3457 = -1;

    @ObfuscatedName("il.o")
    public int field3479 = -1;

    @ObfuscatedName("il.a")
    public int field3462 = -1;

    @ObfuscatedName("il.e")
    public int field3470 = -1;

    @ObfuscatedName("il.w")
    public int field3464 = -1;

    @ObfuscatedName("il.t")
    public short[] field3467;

    @ObfuscatedName("il.g")
    public short[] field3466;

    @ObfuscatedName("il.x")
    public short[] field3468;

    @ObfuscatedName("il.h")
    public short[] field3465;

    @ObfuscatedName("il.s")
    public String[] field3459 = new String[5];

    @ObfuscatedName("il.f")
    public boolean field3469 = true;

    @ObfuscatedName("il.j")
    public int field3471 = -1;

    @ObfuscatedName("il.d")
    public int field3472 = 128;

    @ObfuscatedName("il.l")
    public int field3473 = 128;

    @ObfuscatedName("il.k")
    public boolean field3460 = false;

    @ObfuscatedName("il.ac")
    public int field3475 = 0;

    @ObfuscatedName("il.az")
    public int field3476 = 0;

    @ObfuscatedName("il.aw")
    public int field3477 = -1;

    @ObfuscatedName("il.aa")
    public int field3486 = 32;

    @ObfuscatedName("il.ap")
    public int[] field3463;

    @ObfuscatedName("il.ar")
    public int field3480 = -1;

    @ObfuscatedName("il.ab")
    public int field3481 = -1;

    @ObfuscatedName("il.ax")
    public boolean field3482 = true;

    @ObfuscatedName("il.as")
    public boolean field3483 = true;

    @ObfuscatedName("il.ao")
    public boolean field3455 = false;

    @ObfuscatedName("il.al")
    public class316 field3485;

    @ObfuscatedName("gn.z(II)Lil;")
    public static class257 method3280(int arg0) {
        class257 var1 = (class257) field3451.method2992((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3484.method3726(9, arg0);
        class257 var3 = new class257();
        var3.field3453 = arg0;
        if (var2 != null) {
            var3.method4295(new class300(var2));
        }
        var3.method4268();
        field3451.method2994(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("il.n(B)V")
    public void method4268() {
    }

    @ObfuscatedName("il.v(Lkl;B)V")
    public void method4295(class300 arg0) {
        while (true) {
            int var2 = arg0.method4990();
            if (var2 == 0) {
                return;
            }
            this.method4290(arg0, var2);
        }
    }

    @ObfuscatedName("il.u(Lkl;II)V")
    public void method4290(class300 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method4990();
            this.field3456 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3456[var4] = arg0.method4992();
            }
        } else if (arg1 == 2) {
            this.field3454 = arg0.method4999();
        } else if (arg1 == 12) {
            this.field3474 = arg0.method4990();
        } else if (arg1 == 13) {
            this.field3458 = arg0.method4992();
        } else if (arg1 == 14) {
            this.field3479 = arg0.method4992();
        } else if (arg1 == 15) {
            this.field3478 = arg0.method4992();
        } else if (arg1 == 16) {
            this.field3457 = arg0.method4992();
        } else if (arg1 == 17) {
            this.field3479 = arg0.method4992();
            this.field3462 = arg0.method4992();
            this.field3470 = arg0.method4992();
            this.field3464 = arg0.method4992();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3459[arg1 - 30] = arg0.method4999();
            if (this.field3459[arg1 - 30].equalsIgnoreCase(class225.field2782)) {
                this.field3459[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method4990();
            this.field3467 = new short[var5];
            this.field3466 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3467[var6] = (short) arg0.method4992();
                this.field3466[var6] = (short) arg0.method4992();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method4990();
            this.field3468 = new short[var7];
            this.field3465 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3468[var8] = (short) arg0.method4992();
                this.field3465[var8] = (short) arg0.method4992();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method4990();
            this.field3449 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3449[var10] = arg0.method4992();
            }
        } else if (arg1 == 93) {
            this.field3469 = false;
        } else if (arg1 == 95) {
            this.field3471 = arg0.method4992();
        } else if (arg1 == 97) {
            this.field3472 = arg0.method4992();
        } else if (arg1 == 98) {
            this.field3473 = arg0.method4992();
        } else if (arg1 == 99) {
            this.field3460 = true;
        } else if (arg1 == 100) {
            this.field3475 = arg0.method5002();
        } else if (arg1 == 101) {
            this.field3476 = arg0.method5002() * 5;
        } else if (arg1 == 102) {
            this.field3477 = arg0.method4992();
        } else if (arg1 == 103) {
            this.field3486 = arg0.method4992();
        } else if (arg1 == 106 || arg1 == 118) {
            this.field3480 = arg0.method4992();
            if (this.field3480 == 65535) {
                this.field3480 = -1;
            }
            this.field3481 = arg0.method4992();
            if (this.field3481 == 65535) {
                this.field3481 = -1;
            }
            int var11 = -1;
            if (arg1 == 118) {
                var11 = arg0.method4992();
                if (var11 == 65535) {
                    var11 = -1;
                }
            }
            int var12 = arg0.method4990();
            this.field3463 = new int[var12 + 2];
            for (int var13 = 0; var13 <= var12; var13++) {
                this.field3463[var13] = arg0.method4992();
                if (this.field3463[var13] == 65535) {
                    this.field3463[var13] = -1;
                }
            }
            this.field3463[var12 + 1] = var11;
        } else if (arg1 == 107) {
            this.field3482 = false;
        } else if (arg1 == 109) {
            this.field3483 = false;
        } else if (arg1 == 111) {
            this.field3455 = true;
        } else if (arg1 == 249) {
            this.field3485 = class248.method3085(arg0, this.field3485);
        }
    }

    @ObfuscatedName("il.r(Lix;ILix;IS)Ldh;")
    public final class128 method4271(class259 arg0, int arg1, class259 arg2, int arg3) {
        if (this.field3463 != null) {
            class257 var5 = this.method4273();
            return var5 == null ? null : var5.method4271(arg0, arg1, arg2, arg3);
        }
        class128 var6 = (class128) field3452.method2992((long) this.field3453);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field3456.length; var8++) {
                if (!Statics.field3450.method3730(this.field3456[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class122[] var9 = new class122[this.field3456.length];
            for (int var10 = 0; var10 < this.field3456.length; var10++) {
                var9[var10] = class122.method2560(Statics.field3450, this.field3456[var10], 0);
            }
            class122 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class122(var9, var9.length);
            }
            if (this.field3467 != null) {
                for (int var12 = 0; var12 < this.field3467.length; var12++) {
                    var11.method2507(this.field3467[var12], this.field3466[var12]);
                }
            }
            if (this.field3468 != null) {
                for (int var13 = 0; var13 < this.field3468.length; var13++) {
                    var11.method2568(this.field3468[var13], this.field3465[var13]);
                }
            }
            var6 = var11.method2515(this.field3475 + 64, this.field3476 + 850, -30, -50, -30);
            field3452.method2994(var6, (long) this.field3453);
        }
        class128 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method4317(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method4318(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method2588(true);
        } else {
            var14 = arg2.method4318(var6, arg3);
        }
        if (this.field3472 != 128 || this.field3473 != 128) {
            var14.method2635(this.field3472, this.field3473, this.field3472);
        }
        return var14;
    }

    @ObfuscatedName("il.p(B)Ldw;")
    public final class122 method4272() {
        if (this.field3463 != null) {
            class257 var1 = this.method4273();
            return var1 == null ? null : var1.method4272();
        } else if (this.field3449 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field3449.length; var3++) {
                if (!Statics.field3450.method3730(this.field3449[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class122[] var4 = new class122[this.field3449.length];
            for (int var5 = 0; var5 < this.field3449.length; var5++) {
                var4[var5] = class122.method2560(Statics.field3450, this.field3449[var5], 0);
            }
            class122 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class122(var4, var4.length);
            }
            if (this.field3467 != null) {
                for (int var7 = 0; var7 < this.field3467.length; var7++) {
                    var6.method2507(this.field3467[var7], this.field3466[var7]);
                }
            }
            if (this.field3468 != null) {
                for (int var8 = 0; var8 < this.field3468.length; var8++) {
                    var6.method2568(this.field3468[var8], this.field3465[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("il.q(I)Lil;")
    public final class257 method4273() {
        int var1 = -1;
        if (this.field3480 != -1) {
            var1 = class213.method367(this.field3480);
        } else if (this.field3481 != -1) {
            var1 = class213.field2511[this.field3481];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3463.length - 1) {
            var2 = this.field3463[var1];
        } else {
            var2 = this.field3463[this.field3463.length - 1];
        }
        return var2 == -1 ? null : method3280(var2);
    }

    @ObfuscatedName("il.m(B)Z")
    public boolean method4274() {
        if (this.field3463 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field3480 != -1) {
            var1 = class213.method367(this.field3480);
        } else if (this.field3481 != -1) {
            var1 = class213.field2511[this.field3481];
        }
        if (var1 >= 0 && var1 < this.field3463.length) {
            return this.field3463[var1] != -1;
        } else {
            return this.field3463[this.field3463.length - 1] != -1;
        }
    }

    @ObfuscatedName("il.y(III)I")
    public int method4275(int arg0, int arg1) {
        return Statics.method1847(this.field3485, arg0, arg1);
    }

    @ObfuscatedName("il.i(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4276(int arg0, String arg1) {
        return class248.method2060(this.field3485, arg0, arg1);
    }
}
