package deob;

@ObfuscatedName("ar")
public class class40 extends class185 {

    @ObfuscatedName("ar.z")
    public static class174 field940 = new class174(64);

    @ObfuscatedName("ar.b")
    public static class174 field941 = new class174(30);

    @ObfuscatedName("ar.k")
    public int field938;

    @ObfuscatedName("ar.c")
    public int field949;

    @ObfuscatedName("ar.w")
    public int field953 = -1;

    @ObfuscatedName("ar.l")
    public short[] field945;

    @ObfuscatedName("ar.n")
    public short[] field946;

    @ObfuscatedName("ar.d")
    public short[] field947;

    @ObfuscatedName("ar.h")
    public short[] field948;

    @ObfuscatedName("ar.y")
    public int field943 = 128;

    @ObfuscatedName("ar.p")
    public int field950 = 128;

    @ObfuscatedName("ar.i")
    public int field951 = 0;

    @ObfuscatedName("ar.s")
    public int field939 = 0;

    @ObfuscatedName("ar.f")
    public int field954 = 0;

    @ObfuscatedName("cn.g(Lei;Lei;I)V")
    public static void method1739(class149 arg0, class149 arg1) {
        Statics.field944 = arg0;
        Statics.field942 = arg1;
    }

    @ObfuscatedName("dm.j(II)Lar;")
    public static class40 method2523(int arg0) {
        class40 var1 = (class40) field940.method3097((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field944.method2660(13, arg0);
        class40 var3 = new class40();
        var3.field938 = arg0;
        if (var2 != null) {
            var3.method709(new class108(var2));
        }
        field940.method3099(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ar.z(Ldf;I)V")
    public void method709(class108 arg0) {
        while (true) {
            int var2 = arg0.method2083();
            if (var2 == 0) {
                return;
            }
            this.method707(arg0, var2);
        }
    }

    @ObfuscatedName("ar.b(Ldf;II)V")
    public void method707(class108 arg0, int arg1) {
        if (arg1 == 1) {
            this.field949 = arg0.method2263();
        } else if (arg1 == 2) {
            this.field953 = arg0.method2263();
        } else if (arg1 == 4) {
            this.field943 = arg0.method2263();
        } else if (arg1 == 5) {
            this.field950 = arg0.method2263();
        } else if (arg1 == 6) {
            this.field951 = arg0.method2263();
        } else if (arg1 == 7) {
            this.field939 = arg0.method2083();
        } else if (arg1 == 8) {
            this.field954 = arg0.method2083();
        } else if (arg1 == 40) {
            int var3 = arg0.method2083();
            this.field945 = new short[var3];
            this.field946 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field945[var4] = (short) arg0.method2263();
                this.field946[var4] = (short) arg0.method2263();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2083();
            this.field947 = new short[var5];
            this.field948 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field947[var6] = (short) arg0.method2263();
                this.field948[var6] = (short) arg0.method2263();
            }
        }
    }

    @ObfuscatedName("ar.k(II)Lcx;")
    public final class99 method720(int arg0) {
        class99 var2 = (class99) field941.method3097((long) this.field938);
        if (var2 == null) {
            class94 var3 = class94.method1848(Statics.field942, this.field949, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field945 != null) {
                for (int var4 = 0; var4 < this.field945.length; var4++) {
                    var3.method1847(this.field945[var4], this.field946[var4]);
                }
            }
            if (this.field947 != null) {
                for (int var5 = 0; var5 < this.field947.length; var5++) {
                    var3.method1861(this.field947[var5], this.field948[var5]);
                }
            }
            var2 = var3.method1917(this.field939 + 64, this.field954 + 850, -30, -50, -30);
            field941.method3099(var2, (long) this.field938);
        }
        class99 var6;
        if (this.field953 == -1 || arg0 == -1) {
            var6 = var2.method1944(true);
        } else {
            var6 = class39.method2627(this.field953).method697(var2, arg0);
        }
        if (this.field943 != 128 || this.field950 != 128) {
            var6.method1950(this.field943, this.field950, this.field943);
        }
        if (this.field951 != 0) {
            if (this.field951 == 90) {
                var6.method1936();
            }
            if (this.field951 == 180) {
                var6.method1936();
                var6.method1936();
            }
            if (this.field951 == 270) {
                var6.method1936();
                var6.method1936();
                var6.method1936();
            }
        }
        return var6;
    }
}
