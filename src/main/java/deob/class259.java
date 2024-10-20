package deob;

@ObfuscatedName("ir")
public class class259 extends class206 {

    @ObfuscatedName("ir.r")
    public static class201 field3443 = new class201(64);

    @ObfuscatedName("ir.h")
    public int field3444 = -1;

    @ObfuscatedName("ir.d")
    public int[] field3442;

    @ObfuscatedName("ir.s")
    public short[] field3446;

    @ObfuscatedName("ir.b")
    public short[] field3447;

    @ObfuscatedName("ir.e")
    public short[] field3450;

    @ObfuscatedName("ir.f")
    public short[] field3449;

    @ObfuscatedName("ir.z")
    public int[] field3440 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("ir.u")
    public boolean field3451 = false;

    @ObfuscatedName("fg.n(II)Lir;")
    public static class259 method2990(int arg0) {
        class259 var1 = (class259) field3443.method3407((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3445.method3931(3, arg0);
        class259 var3 = new class259();
        if (var2 != null) {
            var3.method4173(new class185(var2));
        }
        field3443.method3408(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ir.v(Lgv;I)V")
    public void method4173(class185 arg0) {
        while (true) {
            int var2 = arg0.method3021();
            if (var2 == 0) {
                return;
            }
            this.method4154(arg0, var2);
        }
    }

    @ObfuscatedName("ir.y(Lgv;II)V")
    public void method4154(class185 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3444 = arg0.method3021();
        } else if (arg1 == 2) {
            int var3 = arg0.method3021();
            this.field3442 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3442[var4] = arg0.method3015();
            }
        } else if (arg1 == 3) {
            this.field3451 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method3021();
            this.field3446 = new short[var5];
            this.field3447 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3446[var6] = (short) arg0.method3015();
                this.field3447[var6] = (short) arg0.method3015();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method3021();
            this.field3450 = new short[var7];
            this.field3449 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3450[var8] = (short) arg0.method3015();
                this.field3449[var8] = (short) arg0.method3015();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field3440[arg1 - 60] = arg0.method3015();
        }
    }

    @ObfuscatedName("ir.r(I)Z")
    public boolean method4155() {
        if (this.field3442 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3442.length; var2++) {
            if (!Statics.field3441.method3918(this.field3442[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("ir.h(I)Ldh;")
    public class127 method4176() {
        if (this.field3442 == null) {
            return null;
        }
        class127[] var1 = new class127[this.field3442.length];
        for (int var2 = 0; var2 < this.field3442.length; var2++) {
            var1[var2] = class127.method2257(Statics.field3441, this.field3442[var2], 0);
        }
        class127 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class127(var1, var1.length);
        }
        if (this.field3446 != null) {
            for (int var4 = 0; var4 < this.field3446.length; var4++) {
                var3.method2258(this.field3446[var4], this.field3447[var4]);
            }
        }
        if (this.field3450 != null) {
            for (int var5 = 0; var5 < this.field3450.length; var5++) {
                var3.method2260(this.field3450[var5], this.field3449[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("ir.d(I)Z")
    public boolean method4167() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field3440[var2] != -1 && !Statics.field3441.method3918(this.field3440[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("ir.s(I)Ldh;")
    public class127 method4153() {
        class127[] var1 = new class127[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field3440[var3] != -1) {
                var1[var2++] = class127.method2257(Statics.field3441, this.field3440[var3], 0);
            }
        }
        class127 var4 = new class127(var1, var2);
        if (this.field3446 != null) {
            for (int var5 = 0; var5 < this.field3446.length; var5++) {
                var4.method2258(this.field3446[var5], this.field3447[var5]);
            }
        }
        if (this.field3450 != null) {
            for (int var6 = 0; var6 < this.field3450.length; var6++) {
                var4.method2260(this.field3450[var6], this.field3449[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("bq.b(I)V")
    public static void method677() {
        field3443.method3409();
    }
}
