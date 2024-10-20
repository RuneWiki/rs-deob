package deob;

@ObfuscatedName("im")
public class class248 extends class195 {

    @ObfuscatedName("im.v")
    public static class190 field3355 = new class190(64);

    @ObfuscatedName("im.b")
    public int field3356 = -1;

    @ObfuscatedName("im.y")
    public int[] field3352;

    @ObfuscatedName("im.h")
    public short[] field3353;

    @ObfuscatedName("im.x")
    public short[] field3354;

    @ObfuscatedName("im.f")
    public short[] field3350;

    @ObfuscatedName("im.n")
    public short[] field3348;

    @ObfuscatedName("im.a")
    public int[] field3357 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("im.o")
    public boolean field3358 = false;

    @ObfuscatedName("ii.i(Liw;Liw;I)V")
    public static void method3929(class236 arg0, class236 arg1) {
        Statics.field310 = arg0;
        Statics.field3349 = arg1;
        Statics.field3351 = Statics.field310.method3847(3);
    }

    @ObfuscatedName("eq.c(II)Lim;")
    public static class248 method2678(int arg0) {
        class248 var1 = (class248) field3355.method3220((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field310.method3769(3, arg0);
        class248 var3 = new class248();
        if (var2 != null) {
            var3.method4020(new class174(var2));
        }
        field3355.method3222(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("im.e(Lfx;I)V")
    public void method4020(class174 arg0) {
        while (true) {
            int var2 = arg0.method2870();
            if (var2 == 0) {
                return;
            }
            this.method4033(arg0, var2);
        }
    }

    @ObfuscatedName("im.v(Lfx;IS)V")
    public void method4033(class174 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3356 = arg0.method2870();
        } else if (arg1 == 2) {
            int var3 = arg0.method2870();
            this.field3352 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3352[var4] = arg0.method2872();
            }
        } else if (arg1 == 3) {
            this.field3358 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method2870();
            this.field3353 = new short[var5];
            this.field3354 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3353[var6] = (short) arg0.method2872();
                this.field3354[var6] = (short) arg0.method2872();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2870();
            this.field3350 = new short[var7];
            this.field3348 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3350[var8] = (short) arg0.method2872();
                this.field3348[var8] = (short) arg0.method2872();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field3357[arg1 - 60] = arg0.method2872();
        }
    }

    @ObfuscatedName("im.b(B)Z")
    public boolean method4021() {
        if (this.field3352 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3352.length; var2++) {
            if (!Statics.field3349.method3771(this.field3352[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("im.y(B)Ldw;")
    public class128 method4022() {
        if (this.field3352 == null) {
            return null;
        }
        class128[] var1 = new class128[this.field3352.length];
        for (int var2 = 0; var2 < this.field3352.length; var2++) {
            var1[var2] = class128.method2208(Statics.field3349, this.field3352[var2], 0);
        }
        class128 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class128(var1, var1.length);
        }
        if (this.field3353 != null) {
            for (int var4 = 0; var4 < this.field3353.length; var4++) {
                var3.method2190(this.field3353[var4], this.field3354[var4]);
            }
        }
        if (this.field3350 != null) {
            for (int var5 = 0; var5 < this.field3350.length; var5++) {
                var3.method2231(this.field3350[var5], this.field3348[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("im.h(I)Z")
    public boolean method4023() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field3357[var2] != -1 && !Statics.field3349.method3771(this.field3357[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("im.x(I)Ldw;")
    public class128 method4030() {
        class128[] var1 = new class128[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field3357[var3] != -1) {
                var1[var2++] = class128.method2208(Statics.field3349, this.field3357[var3], 0);
            }
        }
        class128 var4 = new class128(var1, var2);
        if (this.field3353 != null) {
            for (int var5 = 0; var5 < this.field3353.length; var5++) {
                var4.method2190(this.field3353[var5], this.field3354[var5]);
            }
        }
        if (this.field3350 != null) {
            for (int var6 = 0; var6 < this.field3350.length; var6++) {
                var4.method2231(this.field3350[var6], this.field3348[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("he.f(B)V")
    public static void method3576() {
        field3355.method3221();
    }
}
