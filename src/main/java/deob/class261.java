package deob;

@ObfuscatedName("jk")
public class class261 extends class207 {

    @ObfuscatedName("jk.l")
    public static class201 field3292 = new class201(64);

    @ObfuscatedName("jk.u")
    public int field3294 = -1;

    @ObfuscatedName("jk.q")
    public int[] field3300;

    @ObfuscatedName("jk.k")
    public short[] field3303;

    @ObfuscatedName("jk.i")
    public short[] field3297;

    @ObfuscatedName("jk.x")
    public short[] field3298;

    @ObfuscatedName("jk.e")
    public short[] field3299;

    @ObfuscatedName("jk.p")
    public int[] field3290 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("jk.b")
    public boolean field3296 = false;

    @ObfuscatedName("ii.z(Lir;Lir;I)V")
    public static void method4460(class248 arg0, class248 arg1) {
        Statics.field3293 = arg0;
        Statics.field3291 = arg1;
        Statics.field3295 = Statics.field3293.method4258(3);
    }

    @ObfuscatedName("s.w(II)Ljk;")
    public static class261 method24(int arg0) {
        class261 var1 = (class261) field3292.method3681((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3293.method4247(3, arg0);
        class261 var3 = new class261();
        if (var2 != null) {
            var3.method4503(new class183(var2));
        }
        field3292.method3675(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jk.s(Lgk;I)V")
    public void method4503(class183 arg0) {
        while (true) {
            int var2 = arg0.method3247();
            if (var2 == 0) {
                return;
            }
            this.method4518(arg0, var2);
        }
    }

    @ObfuscatedName("jk.l(Lgk;II)V")
    public void method4518(class183 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3294 = arg0.method3247();
        } else if (arg1 == 2) {
            int var3 = arg0.method3247();
            this.field3300 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3300[var4] = arg0.method3253();
            }
        } else if (arg1 == 3) {
            this.field3296 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method3247();
            this.field3303 = new short[var5];
            this.field3297 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3303[var6] = (short) arg0.method3253();
                this.field3297[var6] = (short) arg0.method3253();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method3247();
            this.field3298 = new short[var7];
            this.field3299 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3298[var8] = (short) arg0.method3253();
                this.field3299[var8] = (short) arg0.method3253();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field3290[arg1 - 60] = arg0.method3253();
        }
    }

    @ObfuscatedName("jk.u(B)Z")
    public boolean method4505() {
        if (this.field3300 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3300.length; var2++) {
            if (!Statics.field3291.method4318(this.field3300[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("jk.q(I)Ldb;")
    public class114 method4506() {
        if (this.field3300 == null) {
            return null;
        }
        class114[] var1 = new class114[this.field3300.length];
        for (int var2 = 0; var2 < this.field3300.length; var2++) {
            var1[var2] = class114.method2364(Statics.field3291, this.field3300[var2], 0);
        }
        class114 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class114(var1, var1.length);
        }
        if (this.field3303 != null) {
            for (int var4 = 0; var4 < this.field3303.length; var4++) {
                var3.method2377(this.field3303[var4], this.field3297[var4]);
            }
        }
        if (this.field3298 != null) {
            for (int var5 = 0; var5 < this.field3298.length; var5++) {
                var3.method2378(this.field3298[var5], this.field3299[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("jk.i(I)Z")
    public boolean method4514() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field3290[var2] != -1 && !Statics.field3291.method4318(this.field3290[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("jk.x(I)Ldb;")
    public class114 method4508() {
        class114[] var1 = new class114[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field3290[var3] != -1) {
                var1[var2++] = class114.method2364(Statics.field3291, this.field3290[var3], 0);
            }
        }
        class114 var4 = new class114(var1, var2);
        if (this.field3303 != null) {
            for (int var5 = 0; var5 < this.field3303.length; var5++) {
                var4.method2377(this.field3303[var5], this.field3297[var5]);
            }
        }
        if (this.field3298 != null) {
            for (int var6 = 0; var6 < this.field3298.length; var6++) {
                var4.method2378(this.field3298[var6], this.field3299[var6]);
            }
        }
        return var4;
    }
}
