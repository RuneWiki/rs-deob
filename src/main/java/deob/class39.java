package deob;

@ObfuscatedName("au")
public class class39 extends class182 {

    @ObfuscatedName("au.y")
    public static class171 field937 = new class171(64);

    @ObfuscatedName("au.b")
    public static class171 field941 = new class171(30);

    @ObfuscatedName("au.w")
    public int field935;

    @ObfuscatedName("au.r")
    public int field938;

    @ObfuscatedName("au.l")
    public int field940 = -1;

    @ObfuscatedName("au.s")
    public short[] field951;

    @ObfuscatedName("au.f")
    public short[] field942;

    @ObfuscatedName("au.x")
    public short[] field943;

    @ObfuscatedName("au.h")
    public short[] field944;

    @ObfuscatedName("au.a")
    public int field939 = 128;

    @ObfuscatedName("au.u")
    public int field946 = 128;

    @ObfuscatedName("au.v")
    public int field947 = 0;

    @ObfuscatedName("au.i")
    public int field948 = 0;

    @ObfuscatedName("au.n")
    public int field934 = 0;

    @ObfuscatedName("i.e(II)Lau;")
    public static class39 method147(int arg0) {
        class39 var1 = (class39) field937.method3058((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field945.method2709(13, arg0);
        class39 var3 = new class39();
        var3.field935 = arg0;
        if (var2 != null) {
            var3.method738(new class107(var2));
        }
        field937.method3057(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("au.o(Ldl;I)V")
    public void method738(class107 arg0) {
        while (true) {
            int var2 = arg0.method2123();
            if (var2 == 0) {
                return;
            }
            this.method744(arg0, var2);
        }
    }

    @ObfuscatedName("au.y(Ldl;IB)V")
    public void method744(class107 arg0, int arg1) {
        if (arg1 == 1) {
            this.field938 = arg0.method2232();
        } else if (arg1 == 2) {
            this.field940 = arg0.method2232();
        } else if (arg1 == 4) {
            this.field939 = arg0.method2232();
        } else if (arg1 == 5) {
            this.field946 = arg0.method2232();
        } else if (arg1 == 6) {
            this.field947 = arg0.method2232();
        } else if (arg1 == 7) {
            this.field948 = arg0.method2123();
        } else if (arg1 == 8) {
            this.field934 = arg0.method2123();
        } else if (arg1 == 40) {
            int var3 = arg0.method2123();
            this.field951 = new short[var3];
            this.field942 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field951[var4] = (short) arg0.method2232();
                this.field942[var4] = (short) arg0.method2232();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2123();
            this.field943 = new short[var5];
            this.field944 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field943[var6] = (short) arg0.method2232();
                this.field944[var6] = (short) arg0.method2232();
            }
        }
    }

    @ObfuscatedName("au.b(II)Lcd;")
    public final class98 method740(int arg0) {
        class98 var2 = (class98) field941.method3058((long) this.field935);
        if (var2 == null) {
            class93 var3 = class93.method1831(Statics.field936, this.field938, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field951 != null) {
                for (int var4 = 0; var4 < this.field951.length; var4++) {
                    var3.method1868(this.field951[var4], this.field942[var4]);
                }
            }
            if (this.field943 != null) {
                for (int var5 = 0; var5 < this.field943.length; var5++) {
                    var3.method1844(this.field943[var5], this.field944[var5]);
                }
            }
            var2 = var3.method1900(this.field948 + 64, this.field934 + 850, -30, -50, -30);
            field941.method3057(var2, (long) this.field935);
        }
        class98 var6;
        if (this.field940 == -1 || arg0 == -1) {
            var6 = var2.method1925(true);
        } else {
            var6 = class38.method131(this.field940).method705(var2, arg0);
        }
        if (this.field939 != 128 || this.field946 != 128) {
            var6.method1989(this.field939, this.field946, this.field939);
        }
        if (this.field947 != 0) {
            if (this.field947 == 90) {
                var6.method1933();
            }
            if (this.field947 == 180) {
                var6.method1933();
                var6.method1933();
            }
            if (this.field947 == 270) {
                var6.method1933();
                var6.method1933();
                var6.method1933();
            }
        }
        return var6;
    }

    @ObfuscatedName("d.w(B)V")
    public static void method157() {
        field937.method3065();
        field941.method3065();
    }
}
