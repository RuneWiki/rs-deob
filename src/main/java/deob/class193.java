package deob;

@ObfuscatedName("ga")
public class class193 extends class130 {

    @ObfuscatedName("ga.t")
    public static class125 field2826 = new class125(64);

    @ObfuscatedName("ga.k")
    public int field2823 = -1;

    @ObfuscatedName("ga.h")
    public int[] field2824;

    @ObfuscatedName("ga.n")
    public short[] field2825;

    @ObfuscatedName("ga.f")
    public short[] field2827;

    @ObfuscatedName("ga.a")
    public short[] field2819;

    @ObfuscatedName("ga.r")
    public short[] field2828;

    @ObfuscatedName("ga.x")
    public int[] field2822 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("ga.z")
    public boolean field2830 = false;

    @ObfuscatedName("cm.b(II)Lga;")
    public static class193 method1523(int arg0) {
        class193 var1 = (class193) field2826.method2256((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2829.method3226(3, arg0);
        class193 var3 = new class193();
        if (var2 != null) {
            var3.method3389(new class154(var2));
        }
        field2826.method2258(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ga.l(Leg;I)V")
    public void method3389(class154 arg0) {
        while (true) {
            int var2 = arg0.method2678();
            if (var2 == 0) {
                return;
            }
            this.method3385(arg0, var2);
        }
    }

    @ObfuscatedName("ga.i(Leg;II)V")
    public void method3385(class154 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2823 = arg0.method2678();
        } else if (arg1 == 2) {
            int var3 = arg0.method2678();
            this.field2824 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2824[var4] = arg0.method2801();
            }
        } else if (arg1 == 3) {
            this.field2830 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method2678();
            this.field2825 = new short[var5];
            this.field2827 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field2825[var6] = (short) arg0.method2801();
                this.field2827[var6] = (short) arg0.method2801();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2678();
            this.field2819 = new short[var7];
            this.field2828 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2819[var8] = (short) arg0.method2801();
                this.field2828[var8] = (short) arg0.method2801();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field2822[arg1 - 60] = arg0.method2801();
        }
    }

    @ObfuscatedName("ga.t(B)Z")
    public boolean method3368() {
        if (this.field2824 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2824.length; var2++) {
            if (!Statics.field2820.method3215(this.field2824[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("ga.k(I)Lbh;")
    public class77 method3367() {
        if (this.field2824 == null) {
            return null;
        }
        class77[] var1 = new class77[this.field2824.length];
        for (int var2 = 0; var2 < this.field2824.length; var2++) {
            var1[var2] = class77.method1486(Statics.field2820, this.field2824[var2], 0);
        }
        class77 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class77(var1, var1.length);
        }
        if (this.field2825 != null) {
            for (int var4 = 0; var4 < this.field2825.length; var4++) {
                var3.method1502(this.field2825[var4], this.field2827[var4]);
            }
        }
        if (this.field2819 != null) {
            for (int var5 = 0; var5 < this.field2819.length; var5++) {
                var3.method1464(this.field2819[var5], this.field2828[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("ga.x(I)Z")
    public boolean method3369() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field2822[var2] != -1 && !Statics.field2820.method3215(this.field2822[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("ga.z(I)Lbh;")
    public class77 method3370() {
        class77[] var1 = new class77[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field2822[var3] != -1) {
                var1[var2++] = class77.method1486(Statics.field2820, this.field2822[var3], 0);
            }
        }
        class77 var4 = new class77(var1, var2);
        if (this.field2825 != null) {
            for (int var5 = 0; var5 < this.field2825.length; var5++) {
                var4.method1502(this.field2825[var5], this.field2827[var5]);
            }
        }
        if (this.field2819 != null) {
            for (int var6 = 0; var6 < this.field2819.length; var6++) {
                var4.method1464(this.field2819[var6], this.field2828[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("w.p(I)V")
    public static void method199() {
        field2826.method2257();
    }
}
