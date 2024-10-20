package deob;

@ObfuscatedName("gs")
public class class193 extends class130 {

    @ObfuscatedName("gs.v")
    public static class125 field2831 = new class125(64);

    @ObfuscatedName("gs.y")
    public int field2826 = -1;

    @ObfuscatedName("gs.p")
    public int[] field2827;

    @ObfuscatedName("gs.j")
    public short[] field2828;

    @ObfuscatedName("gs.m")
    public short[] field2829;

    @ObfuscatedName("gs.a")
    public short[] field2822;

    @ObfuscatedName("gs.i")
    public short[] field2824;

    @ObfuscatedName("gs.s")
    public int[] field2833 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("gs.k")
    public boolean field2825 = false;

    @ObfuscatedName("j.x(Lgo;Lgo;B)V")
    public static void method91(class183 arg0, class183 arg1) {
        Statics.field2830 = arg0;
        Statics.field2823 = arg1;
        Statics.field2832 = Statics.field2830.method3150(3);
    }

    @ObfuscatedName("fj.n(II)Lgs;")
    public static class193 method3035(int arg0) {
        class193 var1 = (class193) field2831.method2275((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2830.method3153(3, arg0);
        class193 var3 = new class193();
        if (var2 != null) {
            var3.method3350(new class154(var2));
        }
        field2831.method2282(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gs.g(Leq;S)V")
    public void method3350(class154 arg0) {
        while (true) {
            int var2 = arg0.method2878();
            if (var2 == 0) {
                return;
            }
            this.method3359(arg0, var2);
        }
    }

    @ObfuscatedName("gs.v(Leq;II)V")
    public void method3359(class154 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2826 = arg0.method2878();
        } else if (arg1 == 2) {
            int var3 = arg0.method2878();
            this.field2827 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2827[var4] = arg0.method2833();
            }
        } else if (arg1 == 3) {
            this.field2825 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method2878();
            this.field2828 = new short[var5];
            this.field2829 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field2828[var6] = (short) arg0.method2833();
                this.field2829[var6] = (short) arg0.method2833();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2878();
            this.field2822 = new short[var7];
            this.field2824 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2822[var8] = (short) arg0.method2833();
                this.field2824[var8] = (short) arg0.method2833();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field2833[arg1 - 60] = arg0.method2833();
        }
    }

    @ObfuscatedName("gs.y(I)Z")
    public boolean method3352() {
        if (this.field2827 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2827.length; var2++) {
            if (!Statics.field2823.method3154(this.field2827[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("gs.p(I)Lbc;")
    public class77 method3355() {
        if (this.field2827 == null) {
            return null;
        }
        class77[] var1 = new class77[this.field2827.length];
        for (int var2 = 0; var2 < this.field2827.length; var2++) {
            var1[var2] = class77.method1469(Statics.field2823, this.field2827[var2], 0);
        }
        class77 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class77(var1, var1.length);
        }
        if (this.field2828 != null) {
            for (int var4 = 0; var4 < this.field2828.length; var4++) {
                var3.method1539(this.field2828[var4], this.field2829[var4]);
            }
        }
        if (this.field2822 != null) {
            for (int var5 = 0; var5 < this.field2822.length; var5++) {
                var3.method1534(this.field2822[var5], this.field2824[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("gs.j(I)Z")
    public boolean method3354() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field2833[var2] != -1 && !Statics.field2823.method3154(this.field2833[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("gs.s(I)Lbc;")
    public class77 method3377() {
        class77[] var1 = new class77[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field2833[var3] != -1) {
                var1[var2++] = class77.method1469(Statics.field2823, this.field2833[var3], 0);
            }
        }
        class77 var4 = new class77(var1, var2);
        if (this.field2828 != null) {
            for (int var5 = 0; var5 < this.field2828.length; var5++) {
                var4.method1539(this.field2828[var5], this.field2829[var5]);
            }
        }
        if (this.field2822 != null) {
            for (int var6 = 0; var6 < this.field2822.length; var6++) {
                var4.method1534(this.field2822[var6], this.field2824[var6]);
            }
        }
        return var4;
    }
}
