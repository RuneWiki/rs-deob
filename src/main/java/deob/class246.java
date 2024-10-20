package deob;

@ObfuscatedName("ie")
public class class246 extends class176 {

    @ObfuscatedName("ie.g")
    public static class146 field3279 = new class146(64);

    @ObfuscatedName("ie.z")
    public int field3273 = -1;

    @ObfuscatedName("ie.p")
    public int[] field3281;

    @ObfuscatedName("ie.h")
    public short[] field3275;

    @ObfuscatedName("ie.y")
    public short[] field3276;

    @ObfuscatedName("ie.w")
    public short[] field3277;

    @ObfuscatedName("ie.i")
    public short[] field3272;

    @ObfuscatedName("ie.k")
    public int[] field3274 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("ie.x")
    public boolean field3270 = false;

    @ObfuscatedName("fh.u(Lhf;Lhf;I)V")
    public static void method3294(class234 arg0, class234 arg1) {
        Statics.field98 = arg0;
        Statics.field3278 = arg1;
        Statics.field3271 = Statics.field98.method3878(3);
    }

    @ObfuscatedName("cn.f(II)Lie;")
    public static class246 method1971(int arg0) {
        class246 var1 = (class246) field3279.method3076((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field98.method3928(3, arg0);
        class246 var3 = new class246();
        if (var2 != null) {
            var3.method4129(new class300(var2));
        }
        field3279.method3078(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ie.b(Lkg;I)V")
    public void method4129(class300 arg0) {
        while (true) {
            int var2 = arg0.method5138();
            if (var2 == 0) {
                return;
            }
            this.method4126(arg0, var2);
        }
    }

    @ObfuscatedName("ie.g(Lkg;II)V")
    public void method4126(class300 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3273 = arg0.method5138();
        } else if (arg1 == 2) {
            int var3 = arg0.method5138();
            this.field3281 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3281[var4] = arg0.method5337();
            }
        } else if (arg1 == 3) {
            this.field3270 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method5138();
            this.field3275 = new short[var5];
            this.field3276 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3275[var6] = (short) arg0.method5337();
                this.field3276[var6] = (short) arg0.method5337();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method5138();
            this.field3277 = new short[var7];
            this.field3272 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3277[var8] = (short) arg0.method5337();
                this.field3272[var8] = (short) arg0.method5337();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field3274[arg1 - 60] = arg0.method5337();
        }
    }

    @ObfuscatedName("ie.z(I)Z")
    public boolean method4128() {
        if (this.field3281 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3281.length; var2++) {
            if (!Statics.field3278.method3897(this.field3281[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("ie.p(B)Ldq;")
    public class122 method4148() {
        if (this.field3281 == null) {
            return null;
        }
        class122[] var1 = new class122[this.field3281.length];
        for (int var2 = 0; var2 < this.field3281.length; var2++) {
            var1[var2] = class122.method2548(Statics.field3278, this.field3281[var2], 0);
        }
        class122 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class122(var1, var1.length);
        }
        if (this.field3275 != null) {
            for (int var4 = 0; var4 < this.field3275.length; var4++) {
                var3.method2561(this.field3275[var4], this.field3276[var4]);
            }
        }
        if (this.field3277 != null) {
            for (int var5 = 0; var5 < this.field3277.length; var5++) {
                var3.method2617(this.field3277[var5], this.field3272[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("ie.h(B)Z")
    public boolean method4130() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field3274[var2] != -1 && !Statics.field3278.method3897(this.field3274[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("ie.y(B)Ldq;")
    public class122 method4131() {
        class122[] var1 = new class122[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field3274[var3] != -1) {
                var1[var2++] = class122.method2548(Statics.field3278, this.field3274[var3], 0);
            }
        }
        class122 var4 = new class122(var1, var2);
        if (this.field3275 != null) {
            for (int var5 = 0; var5 < this.field3275.length; var5++) {
                var4.method2561(this.field3275[var5], this.field3276[var5]);
            }
        }
        if (this.field3277 != null) {
            for (int var6 = 0; var6 < this.field3277.length; var6++) {
                var4.method2617(this.field3277[var6], this.field3272[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("cu.w(I)V")
    public static void method2055() {
        field3279.method3075();
    }
}
