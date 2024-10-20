package deob;

@ObfuscatedName("ix")
public class class259 extends class206 {

    @ObfuscatedName("ix.s")
    public static class201 field3410 = new class201(64);

    @ObfuscatedName("ix.j")
    public int field3411 = -1;

    @ObfuscatedName("ix.a")
    public int[] field3412;

    @ObfuscatedName("ix.t")
    public short[] field3416;

    @ObfuscatedName("ix.r")
    public short[] field3408;

    @ObfuscatedName("ix.m")
    public short[] field3415;

    @ObfuscatedName("ix.h")
    public short[] field3417;

    @ObfuscatedName("ix.o")
    public int[] field3414 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("ix.x")
    public boolean field3418 = false;

    @ObfuscatedName("fs.p(Lik;Lik;I)V")
    public static void method2919(class247 arg0, class247 arg1) {
        Statics.field3409 = arg0;
        Statics.field3413 = arg1;
        Statics.field3407 = Statics.field3409.method4044(3);
    }

    @ObfuscatedName("ab.i(II)Lix;")
    public static class259 method548(int arg0) {
        class259 var1 = (class259) field3410.method3504((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3409.method4032(3, arg0);
        class259 var3 = new class259();
        if (var2 != null) {
            var3.method4279(new class185(var2));
        }
        field3410.method3506(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ix.w(Lgj;I)V")
    public void method4279(class185 arg0) {
        while (true) {
            int var2 = arg0.method3197();
            if (var2 == 0) {
                return;
            }
            this.method4293(arg0, var2);
        }
    }

    @ObfuscatedName("ix.s(Lgj;II)V")
    public void method4293(class185 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3411 = arg0.method3197();
        } else if (arg1 == 2) {
            int var3 = arg0.method3197();
            this.field3412 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3412[var4] = arg0.method3124();
            }
        } else if (arg1 == 3) {
            this.field3418 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method3197();
            this.field3416 = new short[var5];
            this.field3408 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3416[var6] = (short) arg0.method3124();
                this.field3408[var6] = (short) arg0.method3124();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method3197();
            this.field3415 = new short[var7];
            this.field3417 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3415[var8] = (short) arg0.method3124();
                this.field3417[var8] = (short) arg0.method3124();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field3414[arg1 - 60] = arg0.method3124();
        }
    }

    @ObfuscatedName("ix.j(I)Z")
    public boolean method4281() {
        if (this.field3412 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3412.length; var2++) {
            if (!Statics.field3413.method4034(this.field3412[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("ix.a(I)Ldy;")
    public class125 method4282() {
        if (this.field3412 == null) {
            return null;
        }
        class125[] var1 = new class125[this.field3412.length];
        for (int var2 = 0; var2 < this.field3412.length; var2++) {
            var1[var2] = class125.method2372(Statics.field3413, this.field3412[var2], 0);
        }
        class125 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class125(var1, var1.length);
        }
        if (this.field3416 != null) {
            for (int var4 = 0; var4 < this.field3416.length; var4++) {
                var3.method2383(this.field3416[var4], this.field3408[var4]);
            }
        }
        if (this.field3415 != null) {
            for (int var5 = 0; var5 < this.field3415.length; var5++) {
                var3.method2384(this.field3415[var5], this.field3417[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("ix.t(I)Z")
    public boolean method4283() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field3414[var2] != -1 && !Statics.field3413.method4034(this.field3414[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("ix.r(S)Ldy;")
    public class125 method4294() {
        class125[] var1 = new class125[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field3414[var3] != -1) {
                var1[var2++] = class125.method2372(Statics.field3413, this.field3414[var3], 0);
            }
        }
        class125 var4 = new class125(var1, var2);
        if (this.field3416 != null) {
            for (int var5 = 0; var5 < this.field3416.length; var5++) {
                var4.method2383(this.field3416[var5], this.field3408[var5]);
            }
        }
        if (this.field3415 != null) {
            for (int var6 = 0; var6 < this.field3415.length; var6++) {
                var4.method2384(this.field3415[var6], this.field3417[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("bb.m(I)V")
    public static void method919() {
        field3410.method3513();
    }
}
