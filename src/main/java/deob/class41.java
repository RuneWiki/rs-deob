package deob;

@ObfuscatedName("ax")
public class class41 extends class195 {

    @ObfuscatedName("ax.g")
    public static class184 field956 = new class184(64);

    @ObfuscatedName("ax.u")
    public static class184 field947 = new class184(30);

    @ObfuscatedName("ax.q")
    public int field948;

    @ObfuscatedName("ax.r")
    public int field949;

    @ObfuscatedName("ax.v")
    public int field954 = -1;

    @ObfuscatedName("ax.y")
    public short[] field951;

    @ObfuscatedName("ax.k")
    public short[] field952;

    @ObfuscatedName("ax.c")
    public short[] field953;

    @ObfuscatedName("ax.j")
    public short[] field945;

    @ObfuscatedName("ax.m")
    public int field955 = 128;

    @ObfuscatedName("ax.a")
    public int field950 = 128;

    @ObfuscatedName("ax.f")
    public int field957 = 0;

    @ObfuscatedName("ax.i")
    public int field959 = 0;

    @ObfuscatedName("ax.n")
    public int field958 = 0;

    @ObfuscatedName("dv.o(II)Lax;")
    public static class41 method2537(int arg0) {
        class41 var1 = (class41) field956.method3401((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field946.method2940(13, arg0);
        class41 var3 = new class41();
        var3.field948 = arg0;
        if (var2 != null) {
            var3.method828(new class111(var2));
        }
        field956.method3403(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ax.l(Ldk;I)V")
    public void method828(class111 arg0) {
        while (true) {
            int var2 = arg0.method2219();
            if (var2 == 0) {
                return;
            }
            this.method821(arg0, var2);
        }
    }

    @ObfuscatedName("ax.g(Ldk;II)V")
    public void method821(class111 arg0, int arg1) {
        if (arg1 == 1) {
            this.field949 = arg0.method2397();
        } else if (arg1 == 2) {
            this.field954 = arg0.method2397();
        } else if (arg1 == 4) {
            this.field955 = arg0.method2397();
        } else if (arg1 == 5) {
            this.field950 = arg0.method2397();
        } else if (arg1 == 6) {
            this.field957 = arg0.method2397();
        } else if (arg1 == 7) {
            this.field959 = arg0.method2219();
        } else if (arg1 == 8) {
            this.field958 = arg0.method2219();
        } else if (arg1 == 40) {
            int var3 = arg0.method2219();
            this.field951 = new short[var3];
            this.field952 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field951[var4] = (short) arg0.method2397();
                this.field952[var4] = (short) arg0.method2397();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2219();
            this.field953 = new short[var5];
            this.field945 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field953[var6] = (short) arg0.method2397();
                this.field945[var6] = (short) arg0.method2397();
            }
        }
    }

    @ObfuscatedName("ax.u(II)Lcq;")
    public final class100 method819(int arg0) {
        class100 var2 = (class100) field947.method3401((long) this.field948);
        if (var2 == null) {
            class95 var3 = class95.method1967(Statics.field1830, this.field949, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field951 != null) {
                for (int var4 = 0; var4 < this.field951.length; var4++) {
                    var3.method1971(this.field951[var4], this.field952[var4]);
                }
            }
            if (this.field953 != null) {
                for (int var5 = 0; var5 < this.field953.length; var5++) {
                    var3.method1979(this.field953[var5], this.field945[var5]);
                }
            }
            var2 = var3.method1983(this.field959 + 64, this.field958 + 850, -30, -50, -30);
            field947.method3403(var2, (long) this.field948);
        }
        class100 var6;
        if (this.field954 == -1 || arg0 == -1) {
            var6 = var2.method2048(true);
        } else {
            var6 = class40.method567(this.field954).method781(var2, arg0);
        }
        if (this.field955 != 128 || this.field950 != 128) {
            var6.method2060(this.field955, this.field950, this.field955);
        }
        if (this.field957 != 0) {
            if (this.field957 == 90) {
                var6.method2116();
            }
            if (this.field957 == 180) {
                var6.method2116();
                var6.method2116();
            }
            if (this.field957 == 270) {
                var6.method2116();
                var6.method2116();
                var6.method2116();
            }
        }
        return var6;
    }
}
