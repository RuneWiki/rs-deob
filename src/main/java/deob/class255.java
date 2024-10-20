package deob;

@ObfuscatedName("ir")
public class class255 extends class202 {

    @ObfuscatedName("ir.j")
    public static class197 field3405 = new class197(64);

    @ObfuscatedName("ir.v")
    public int field3406 = -1;

    @ObfuscatedName("ir.x")
    public int[] field3407;

    @ObfuscatedName("ir.e")
    public short[] field3412;

    @ObfuscatedName("ir.l")
    public short[] field3409;

    @ObfuscatedName("ir.b")
    public short[] field3413;

    @ObfuscatedName("ir.n")
    public short[] field3402;

    @ObfuscatedName("ir.c")
    public int[] field3403 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("ir.a")
    public boolean field3415 = false;

    @ObfuscatedName("ge.m(II)Lir;")
    public static class255 method3270(int arg0) {
        class255 var1 = (class255) field3405.method3419((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3404.method3930(3, arg0);
        class255 var3 = new class255();
        if (var2 != null) {
            var3.method4179(new class181(var2));
        }
        field3405.method3418(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ir.p(Lfv;I)V")
    public void method4179(class181 arg0) {
        while (true) {
            int var2 = arg0.method3012();
            if (var2 == 0) {
                return;
            }
            this.method4180(arg0, var2);
        }
    }

    @ObfuscatedName("ir.i(Lfv;II)V")
    public void method4180(class181 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3406 = arg0.method3012();
        } else if (arg1 == 2) {
            int var3 = arg0.method3012();
            this.field3407 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3407[var4] = arg0.method3009();
            }
        } else if (arg1 == 3) {
            this.field3415 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method3012();
            this.field3412 = new short[var5];
            this.field3409 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3412[var6] = (short) arg0.method3009();
                this.field3409[var6] = (short) arg0.method3009();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method3012();
            this.field3413 = new short[var7];
            this.field3402 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3413[var8] = (short) arg0.method3009();
                this.field3402[var8] = (short) arg0.method3009();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field3403[arg1 - 60] = arg0.method3009();
        }
    }

    @ObfuscatedName("ir.j(B)Z")
    public boolean method4181() {
        if (this.field3407 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3407.length; var2++) {
            if (!Statics.field3410.method3932(this.field3407[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("ir.v(I)Ldv;")
    public class127 method4192() {
        if (this.field3407 == null) {
            return null;
        }
        class127[] var1 = new class127[this.field3407.length];
        for (int var2 = 0; var2 < this.field3407.length; var2++) {
            var1[var2] = class127.method2302(Statics.field3410, this.field3407[var2], 0);
        }
        class127 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class127(var1, var1.length);
        }
        if (this.field3412 != null) {
            for (int var4 = 0; var4 < this.field3412.length; var4++) {
                var3.method2360(this.field3412[var4], this.field3409[var4]);
            }
        }
        if (this.field3413 != null) {
            for (int var5 = 0; var5 < this.field3413.length; var5++) {
                var3.method2305(this.field3413[var5], this.field3402[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("ir.x(I)Z")
    public boolean method4183() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field3403[var2] != -1 && !Statics.field3410.method3932(this.field3403[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("ir.e(B)Ldv;")
    public class127 method4184() {
        class127[] var1 = new class127[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field3403[var3] != -1) {
                var1[var2++] = class127.method2302(Statics.field3410, this.field3403[var3], 0);
            }
        }
        class127 var4 = new class127(var1, var2);
        if (this.field3412 != null) {
            for (int var5 = 0; var5 < this.field3412.length; var5++) {
                var4.method2360(this.field3412[var5], this.field3409[var5]);
            }
        }
        if (this.field3413 != null) {
            for (int var6 = 0; var6 < this.field3413.length; var6++) {
                var4.method2305(this.field3413[var6], this.field3402[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("hj.l(I)V")
    public static void method3738() {
        field3405.method3423();
    }
}
