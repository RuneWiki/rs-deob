package deob;

@ObfuscatedName("ag")
public class class40 extends class181 {

    @ObfuscatedName("ag.j")
    public static class171 field946 = new class171(64);

    @ObfuscatedName("ag.o")
    public int field947 = -1;

    @ObfuscatedName("ag.n")
    public int[] field948;

    @ObfuscatedName("ag.y")
    public short[] field944;

    @ObfuscatedName("ag.f")
    public short[] field950;

    @ObfuscatedName("ag.p")
    public short[] field951;

    @ObfuscatedName("ag.l")
    public short[] field952;

    @ObfuscatedName("ag.k")
    public int[] field953 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("ag.q")
    public boolean field954 = false;

    @ObfuscatedName("co.b(Leg;Leg;B)V")
    public static void method1887(class146 arg0, class146 arg1) {
        Statics.field945 = arg0;
        Statics.field958 = arg1;
        Statics.field943 = Statics.field945.method2702(3);
    }

    @ObfuscatedName("cz.u(II)Lag;")
    public static class40 method1870(int arg0) {
        class40 var1 = (class40) field946.method3114((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field945.method2692(3, arg0);
        class40 var3 = new class40();
        if (var2 != null) {
            var3.method747(new class107(var2));
        }
        field946.method3116(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ag.x(Ldh;I)V")
    public void method747(class107 arg0) {
        while (true) {
            int var2 = arg0.method2134();
            if (var2 == 0) {
                return;
            }
            this.method773(arg0, var2);
        }
    }

    @ObfuscatedName("ag.j(Ldh;IS)V")
    public void method773(class107 arg0, int arg1) {
        if (arg1 == 1) {
            this.field947 = arg0.method2134();
        } else if (arg1 == 2) {
            int var3 = arg0.method2134();
            this.field948 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field948[var4] = arg0.method2136();
            }
        } else if (arg1 == 3) {
            this.field954 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method2134();
            this.field944 = new short[var5];
            this.field950 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field944[var6] = (short) arg0.method2136();
                this.field950[var6] = (short) arg0.method2136();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2134();
            this.field951 = new short[var7];
            this.field952 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field951[var8] = (short) arg0.method2136();
                this.field952[var8] = (short) arg0.method2136();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field953[arg1 - 60] = arg0.method2136();
        }
    }

    @ObfuscatedName("ag.o(I)Z")
    public boolean method748() {
        if (this.field948 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field948.length; var2++) {
            if (!Statics.field958.method2694(this.field948[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("ag.n(B)Lct;")
    public class93 method750() {
        if (this.field948 == null) {
            return null;
        }
        class93[] var1 = new class93[this.field948.length];
        for (int var2 = 0; var2 < this.field948.length; var2++) {
            var1[var2] = class93.method1901(Statics.field958, this.field948[var2], 0);
        }
        class93 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class93(var1, var1.length);
        }
        if (this.field944 != null) {
            for (int var4 = 0; var4 < this.field944.length; var4++) {
                var3.method1903(this.field944[var4], this.field950[var4]);
            }
        }
        if (this.field951 != null) {
            for (int var5 = 0; var5 < this.field951.length; var5++) {
                var3.method1904(this.field951[var5], this.field952[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("ag.y(I)Z")
    public boolean method751() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field953[var2] != -1 && !Statics.field958.method2694(this.field953[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("ag.f(I)Lct;")
    public class93 method777() {
        class93[] var1 = new class93[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field953[var3] != -1) {
                var1[var2++] = class93.method1901(Statics.field958, this.field953[var3], 0);
            }
        }
        class93 var4 = new class93(var1, var2);
        if (this.field944 != null) {
            for (int var5 = 0; var5 < this.field944.length; var5++) {
                var4.method1903(this.field944[var5], this.field950[var5]);
            }
        }
        if (this.field951 != null) {
            for (int var6 = 0; var6 < this.field951.length; var6++) {
                var4.method1904(this.field951[var6], this.field952[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("aq.p(I)V")
    public static void method877() {
        field946.method3117();
    }
}
