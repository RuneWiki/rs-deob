package deob;

@ObfuscatedName("iy")
public class class246 extends class176 {

    @ObfuscatedName("iy.u")
    public static class146 field3243 = new class146(64);

    @ObfuscatedName("iy.r")
    public int field3251 = -1;

    @ObfuscatedName("iy.p")
    public int[] field3245;

    @ObfuscatedName("iy.q")
    public short[] field3242;

    @ObfuscatedName("iy.m")
    public short[] field3246;

    @ObfuscatedName("iy.y")
    public short[] field3247;

    @ObfuscatedName("iy.i")
    public short[] field3244;

    @ObfuscatedName("iy.c")
    public int[] field3250 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("iy.b")
    public boolean field3248 = false;

    @ObfuscatedName("hq.z(II)Liy;")
    public static class246 method3638(int arg0) {
        class246 var1 = (class246) field3243.method2992((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3252.method3726(3, arg0);
        class246 var3 = new class246();
        if (var2 != null) {
            var3.method4020(new class300(var2));
        }
        field3243.method2994(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("iy.n(Lkl;I)V")
    public void method4020(class300 arg0) {
        while (true) {
            int var2 = arg0.method4990();
            if (var2 == 0) {
                return;
            }
            this.method4006(arg0, var2);
        }
    }

    @ObfuscatedName("iy.v(Lkl;II)V")
    public void method4006(class300 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3251 = arg0.method4990();
        } else if (arg1 == 2) {
            int var3 = arg0.method4990();
            this.field3245 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3245[var4] = arg0.method4992();
            }
        } else if (arg1 == 3) {
            this.field3248 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method4990();
            this.field3242 = new short[var5];
            this.field3246 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3242[var6] = (short) arg0.method4992();
                this.field3246[var6] = (short) arg0.method4992();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method4990();
            this.field3247 = new short[var7];
            this.field3244 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3247[var8] = (short) arg0.method4992();
                this.field3244[var8] = (short) arg0.method4992();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field3250[arg1 - 60] = arg0.method4992();
        }
    }

    @ObfuscatedName("iy.u(I)Z")
    public boolean method4023() {
        if (this.field3245 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3245.length; var2++) {
            if (!Statics.field631.method3730(this.field3245[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("iy.r(I)Ldw;")
    public class122 method4008() {
        if (this.field3245 == null) {
            return null;
        }
        class122[] var1 = new class122[this.field3245.length];
        for (int var2 = 0; var2 < this.field3245.length; var2++) {
            var1[var2] = class122.method2560(Statics.field631, this.field3245[var2], 0);
        }
        class122 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class122(var1, var1.length);
        }
        if (this.field3242 != null) {
            for (int var4 = 0; var4 < this.field3242.length; var4++) {
                var3.method2507(this.field3242[var4], this.field3246[var4]);
            }
        }
        if (this.field3247 != null) {
            for (int var5 = 0; var5 < this.field3247.length; var5++) {
                var3.method2568(this.field3247[var5], this.field3244[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("iy.p(I)Z")
    public boolean method4019() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field3250[var2] != -1 && !Statics.field631.method3730(this.field3250[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("iy.q(B)Ldw;")
    public class122 method4021() {
        class122[] var1 = new class122[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field3250[var3] != -1) {
                var1[var2++] = class122.method2560(Statics.field631, this.field3250[var3], 0);
            }
        }
        class122 var4 = new class122(var1, var2);
        if (this.field3242 != null) {
            for (int var5 = 0; var5 < this.field3242.length; var5++) {
                var4.method2507(this.field3242[var5], this.field3246[var5]);
            }
        }
        if (this.field3247 != null) {
            for (int var6 = 0; var6 < this.field3247.length; var6++) {
                var4.method2568(this.field3247[var6], this.field3244[var6]);
            }
        }
        return var4;
    }
}
