package deob;

@ObfuscatedName("gg")
public class class193 extends class435 {

    @ObfuscatedName("gg.v")
    public static class273 field2094 = new class273(64);

    @ObfuscatedName("gg.s")
    public static class273 field2084 = new class273(30);

    @ObfuscatedName("gg.z")
    public int field2086;

    @ObfuscatedName("gg.j")
    public int field2085;

    @ObfuscatedName("gg.i")
    public int field2097 = -1;

    @ObfuscatedName("gg.n")
    public short[] field2088;

    @ObfuscatedName("gg.l")
    public short[] field2089;

    @ObfuscatedName("gg.k")
    public short[] field2090;

    @ObfuscatedName("gg.c")
    public short[] field2091;

    @ObfuscatedName("gg.r")
    public int field2092 = 128;

    @ObfuscatedName("gg.b")
    public int field2093 = 128;

    @ObfuscatedName("gg.m")
    public int field2083 = 0;

    @ObfuscatedName("gg.t")
    public int field2095 = 0;

    @ObfuscatedName("gg.h")
    public int field2096 = 0;

    @ObfuscatedName("cc.f(II)Lgg;")
    public static class193 method2221(int arg0) {
        class193 var1 = (class193) field2094.method5028((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2081.method5990(13, arg0);
        class193 var3 = new class193();
        var3.field2086 = arg0;
        if (var2 != null) {
            var3.method3476(new class474(var2));
        }
        field2094.method5027(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gg.w(Lrd;I)V")
    public void method3476(class474 arg0) {
        while (true) {
            int var2 = arg0.method7964();
            if (var2 == 0) {
                return;
            }
            this.method3479(arg0, var2);
        }
    }

    @ObfuscatedName("gg.v(Lrd;II)V")
    public void method3479(class474 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2085 = arg0.method8032();
        } else if (arg1 == 2) {
            this.field2097 = arg0.method8032();
        } else if (arg1 == 4) {
            this.field2092 = arg0.method8032();
        } else if (arg1 == 5) {
            this.field2093 = arg0.method8032();
        } else if (arg1 == 6) {
            this.field2083 = arg0.method8032();
        } else if (arg1 == 7) {
            this.field2095 = arg0.method7964();
        } else if (arg1 == 8) {
            this.field2096 = arg0.method7964();
        } else if (arg1 == 40) {
            int var3 = arg0.method7964();
            this.field2088 = new short[var3];
            this.field2089 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2088[var4] = (short) arg0.method8032();
                this.field2089[var4] = (short) arg0.method8032();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method7964();
            this.field2090 = new short[var5];
            this.field2091 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field2090[var6] = (short) arg0.method8032();
                this.field2091[var6] = (short) arg0.method8032();
            }
        }
    }

    @ObfuscatedName("gg.s(II)Lhs;")
    public final class228 method3483(int arg0) {
        class228 var2 = (class228) field2084.method5028((long) this.field2086);
        if (var2 == null) {
            class212 var3 = class212.method3915(Statics.field2082, this.field2085, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field2088 != null) {
                for (int var4 = 0; var4 < this.field2088.length; var4++) {
                    var3.method3902(this.field2088[var4], this.field2089[var4]);
                }
            }
            if (this.field2090 != null) {
                for (int var5 = 0; var5 < this.field2090.length; var5++) {
                    var3.method3943(this.field2090[var5], this.field2091[var5]);
                }
            }
            var2 = var3.method3888(this.field2095 + 64, this.field2096 + 850, -30, -50, -30);
            field2084.method5027(var2, (long) this.field2086);
        }
        class228 var6;
        if (this.field2097 == -1 || arg0 == -1) {
            var6 = var2.method4335(true);
        } else {
            var6 = class203.method2227(this.field2097).method3775(var2, arg0);
        }
        if (this.field2092 != 128 || this.field2093 != 128) {
            var6.method4354(this.field2092, this.field2093, this.field2092);
        }
        if (this.field2083 != 0) {
            if (this.field2083 == 90) {
                var6.method4350();
            }
            if (this.field2083 == 180) {
                var6.method4350();
                var6.method4350();
            }
            if (this.field2083 == 270) {
                var6.method4350();
                var6.method4350();
                var6.method4350();
            }
        }
        return var6;
    }
}
