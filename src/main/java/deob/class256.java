package deob;

@ObfuscatedName("ir")
public class class256 extends class185 {

    @ObfuscatedName("ir.j")
    public static class155 field3299 = new class155(64);

    @ObfuscatedName("ir.p")
    public int field3300 = -1;

    @ObfuscatedName("ir.g")
    public int[] field3306;

    @ObfuscatedName("ir.n")
    public short[] field3302;

    @ObfuscatedName("ir.u")
    public short[] field3298;

    @ObfuscatedName("ir.a")
    public short[] field3296;

    @ObfuscatedName("ir.z")
    public short[] field3305;

    @ObfuscatedName("ir.w")
    public int[] field3303 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("ir.y")
    public boolean field3307 = false;

    @ObfuscatedName("e.m(Lic;Lic;B)V")
    public static void method166(class244 arg0, class244 arg1) {
        Statics.field3308 = arg0;
        Statics.field3297 = arg1;
        Statics.field3304 = Statics.field3308.method3903(3);
    }

    @ObfuscatedName("au.o(II)Lir;")
    public static class256 method693(int arg0) {
        class256 var1 = (class256) field3299.method3127((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3308.method3891(3, arg0);
        class256 var3 = new class256();
        if (var2 != null) {
            var3.method4186(new class310(var2));
        }
        field3299.method3137(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ir.q(Lkn;I)V")
    public void method4186(class310 arg0) {
        while (true) {
            int var2 = arg0.method5227();
            if (var2 == 0) {
                return;
            }
            this.method4187(arg0, var2);
        }
    }

    @ObfuscatedName("ir.j(Lkn;IB)V")
    public void method4187(class310 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3300 = arg0.method5227();
        } else if (arg1 == 2) {
            int var3 = arg0.method5227();
            this.field3306 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3306[var4] = arg0.method5283();
            }
        } else if (arg1 == 3) {
            this.field3307 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method5227();
            this.field3302 = new short[var5];
            this.field3298 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3302[var6] = (short) arg0.method5283();
                this.field3298[var6] = (short) arg0.method5283();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method5227();
            this.field3296 = new short[var7];
            this.field3305 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3296[var8] = (short) arg0.method5283();
                this.field3305[var8] = (short) arg0.method5283();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field3303[arg1 - 60] = arg0.method5283();
        }
    }

    @ObfuscatedName("ir.p(I)Z")
    public boolean method4188() {
        if (this.field3306 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3306.length; var2++) {
            if (!Statics.field3297.method3893(this.field3306[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("ir.g(I)Lek;")
    public class131 method4189() {
        if (this.field3306 == null) {
            return null;
        }
        class131[] var1 = new class131[this.field3306.length];
        for (int var2 = 0; var2 < this.field3306.length; var2++) {
            var1[var2] = class131.method2632(Statics.field3297, this.field3306[var2], 0);
        }
        class131 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class131(var1, var1.length);
        }
        if (this.field3302 != null) {
            for (int var4 = 0; var4 < this.field3302.length; var4++) {
                var3.method2639(this.field3302[var4], this.field3298[var4]);
            }
        }
        if (this.field3296 != null) {
            for (int var5 = 0; var5 < this.field3296.length; var5++) {
                var3.method2690(this.field3296[var5], this.field3305[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("ir.n(I)Z")
    public boolean method4205() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field3303[var2] != -1 && !Statics.field3297.method3893(this.field3303[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("ir.u(B)Lek;")
    public class131 method4185() {
        class131[] var1 = new class131[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field3303[var3] != -1) {
                var1[var2++] = class131.method2632(Statics.field3297, this.field3303[var3], 0);
            }
        }
        class131 var4 = new class131(var1, var2);
        if (this.field3302 != null) {
            for (int var5 = 0; var5 < this.field3302.length; var5++) {
                var4.method2639(this.field3302[var5], this.field3298[var5]);
            }
        }
        if (this.field3296 != null) {
            for (int var6 = 0; var6 < this.field3296.length; var6++) {
                var4.method2690(this.field3296[var6], this.field3305[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("el.a(B)V")
    public static void method3091() {
        field3299.method3130();
    }
}
