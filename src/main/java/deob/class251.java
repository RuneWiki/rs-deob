package deob;

@ObfuscatedName("id")
public class class251 extends class198 {

    @ObfuscatedName("id.k")
    public static class193 field3365 = new class193(64);

    @ObfuscatedName("id.f")
    public int field3361 = -1;

    @ObfuscatedName("id.i")
    public int[] field3359;

    @ObfuscatedName("id.j")
    public short[] field3360;

    @ObfuscatedName("id.m")
    public short[] field3357;

    @ObfuscatedName("id.u")
    public short[] field3362;

    @ObfuscatedName("id.r")
    public short[] field3358;

    @ObfuscatedName("id.v")
    public int[] field3364 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("id.h")
    public boolean field3356 = false;

    @ObfuscatedName("hq.w(Liq;Liq;B)V")
    public static void method3561(class239 arg0, class239 arg1) {
        Statics.field21 = arg0;
        Statics.field3367 = arg1;
        Statics.field366 = Statics.field21.method3798(3);
    }

    @ObfuscatedName("al.o(IB)Lid;")
    public static class251 method622(int arg0) {
        class251 var1 = (class251) field3365.method3239((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field21.method3754(3, arg0);
        class251 var3 = new class251();
        if (var2 != null) {
            var3.method3987(new class177(var2));
        }
        field3365.method3241(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("id.x(Lfi;I)V")
    public void method3987(class177 arg0) {
        while (true) {
            int var2 = arg0.method2931();
            if (var2 == 0) {
                return;
            }
            this.method3973(arg0, var2);
        }
    }

    @ObfuscatedName("id.k(Lfi;IB)V")
    public void method3973(class177 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3361 = arg0.method2931();
        } else if (arg1 == 2) {
            int var3 = arg0.method2931();
            this.field3359 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3359[var4] = arg0.method2886();
            }
        } else if (arg1 == 3) {
            this.field3356 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method2931();
            this.field3360 = new short[var5];
            this.field3357 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3360[var6] = (short) arg0.method2886();
                this.field3357[var6] = (short) arg0.method2886();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2931();
            this.field3362 = new short[var7];
            this.field3358 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3362[var8] = (short) arg0.method2886();
                this.field3358[var8] = (short) arg0.method2886();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field3364[arg1 - 60] = arg0.method2886();
        }
    }

    @ObfuscatedName("id.f(I)Z")
    public boolean method3974() {
        if (this.field3359 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3359.length; var2++) {
            if (!Statics.field3367.method3801(this.field3359[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("id.i(B)Ldb;")
    public class128 method3975() {
        if (this.field3359 == null) {
            return null;
        }
        class128[] var1 = new class128[this.field3359.length];
        for (int var2 = 0; var2 < this.field3359.length; var2++) {
            var1[var2] = class128.method2163(Statics.field3367, this.field3359[var2], 0);
        }
        class128 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class128(var1, var1.length);
        }
        if (this.field3360 != null) {
            for (int var4 = 0; var4 < this.field3360.length; var4++) {
                var3.method2177(this.field3360[var4], this.field3357[var4]);
            }
        }
        if (this.field3362 != null) {
            for (int var5 = 0; var5 < this.field3362.length; var5++) {
                var3.method2178(this.field3362[var5], this.field3358[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("id.j(B)Z")
    public boolean method3976() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field3364[var2] != -1 && !Statics.field3367.method3801(this.field3364[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("id.m(I)Ldb;")
    public class128 method3999() {
        class128[] var1 = new class128[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field3364[var3] != -1) {
                var1[var2++] = class128.method2163(Statics.field3367, this.field3364[var3], 0);
            }
        }
        class128 var4 = new class128(var1, var2);
        if (this.field3360 != null) {
            for (int var5 = 0; var5 < this.field3360.length; var5++) {
                var4.method2177(this.field3360[var5], this.field3357[var5]);
            }
        }
        if (this.field3362 != null) {
            for (int var6 = 0; var6 < this.field3362.length; var6++) {
                var4.method2178(this.field3362[var6], this.field3358[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("av.u(B)V")
    public static void method591() {
        field3365.method3242();
    }
}
