package deob;

@ObfuscatedName("at")
public class class40 extends class185 {

    @ObfuscatedName("at.m")
    public static class174 field936 = new class174(64);

    @ObfuscatedName("at.e")
    public static class174 field937 = new class174(30);

    @ObfuscatedName("at.h")
    public int field938;

    @ObfuscatedName("at.p")
    public int field939;

    @ObfuscatedName("at.j")
    public int field940 = -1;

    @ObfuscatedName("at.i")
    public short[] field943;

    @ObfuscatedName("at.u")
    public short[] field942;

    @ObfuscatedName("at.l")
    public short[] field950;

    @ObfuscatedName("at.k")
    public short[] field944;

    @ObfuscatedName("at.q")
    public int field945 = 128;

    @ObfuscatedName("at.b")
    public int field946 = 128;

    @ObfuscatedName("at.w")
    public int field947 = 0;

    @ObfuscatedName("at.g")
    public int field948 = 0;

    @ObfuscatedName("at.s")
    public int field949 = 0;

    @ObfuscatedName("ce.x(Ley;Ley;I)V")
    public static void method1887(class149 arg0, class149 arg1) {
        Statics.field941 = arg0;
        Statics.field935 = arg1;
    }

    @ObfuscatedName("y.v(II)Lat;")
    public static class40 method517(int arg0) {
        class40 var1 = (class40) field936.method3186((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field941.method2751(13, arg0);
        class40 var3 = new class40();
        var3.field938 = arg0;
        if (var2 != null) {
            var3.method769(new class108(var2));
        }
        field936.method3183(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("at.m(Ldm;I)V")
    public void method769(class108 arg0) {
        while (true) {
            int var2 = arg0.method2299();
            if (var2 == 0) {
                return;
            }
            this.method770(arg0, var2);
        }
    }

    @ObfuscatedName("at.e(Ldm;IB)V")
    public void method770(class108 arg0, int arg1) {
        if (arg1 == 1) {
            this.field939 = arg0.method2129();
        } else if (arg1 == 2) {
            this.field940 = arg0.method2129();
        } else if (arg1 == 4) {
            this.field945 = arg0.method2129();
        } else if (arg1 == 5) {
            this.field946 = arg0.method2129();
        } else if (arg1 == 6) {
            this.field947 = arg0.method2129();
        } else if (arg1 == 7) {
            this.field948 = arg0.method2299();
        } else if (arg1 == 8) {
            this.field949 = arg0.method2299();
        } else if (arg1 == 40) {
            int var3 = arg0.method2299();
            this.field943 = new short[var3];
            this.field942 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field943[var4] = (short) arg0.method2129();
                this.field942[var4] = (short) arg0.method2129();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2299();
            this.field950 = new short[var5];
            this.field944 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field950[var6] = (short) arg0.method2129();
                this.field944[var6] = (short) arg0.method2129();
            }
        }
    }

    @ObfuscatedName("at.h(IB)Lck;")
    public final class99 method771(int arg0) {
        class99 var2 = (class99) field937.method3186((long) this.field938);
        if (var2 == null) {
            class94 var3 = class94.method1892(Statics.field935, this.field939, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field943 != null) {
                for (int var4 = 0; var4 < this.field943.length; var4++) {
                    var3.method1948(this.field943[var4], this.field942[var4]);
                }
            }
            if (this.field950 != null) {
                for (int var5 = 0; var5 < this.field950.length; var5++) {
                    var3.method1906(this.field950[var5], this.field944[var5]);
                }
            }
            var2 = var3.method1941(this.field948 + 64, this.field949 + 850, -30, -50, -30);
            field937.method3183(var2, (long) this.field938);
        }
        class99 var6;
        if (this.field940 == -1 || arg0 == -1) {
            var6 = var2.method2007(true);
        } else {
            var6 = class39.method633(this.field940).method738(var2, arg0);
        }
        if (this.field945 != 128 || this.field946 != 128) {
            var6.method1997(this.field945, this.field946, this.field945);
        }
        if (this.field947 != 0) {
            if (this.field947 == 90) {
                var6.method2001();
            }
            if (this.field947 == 180) {
                var6.method2001();
                var6.method2001();
            }
            if (this.field947 == 270) {
                var6.method2001();
                var6.method2001();
                var6.method2001();
            }
        }
        return var6;
    }

    @ObfuscatedName("v.p(I)V")
    public static void method3() {
        field936.method3181();
        field937.method3181();
    }
}
