package deob;

@ObfuscatedName("ad")
public class class35 extends class174 {

    @ObfuscatedName("ad.v")
    public static class170 field896 = new class170(64);

    @ObfuscatedName("ad.p")
    public static class170 field897 = new class170(30);

    @ObfuscatedName("ad.e")
    public int field894;

    @ObfuscatedName("ad.d")
    public int field899;

    @ObfuscatedName("ad.y")
    public int field900 = -1;

    @ObfuscatedName("ad.x")
    public short[] field916;

    @ObfuscatedName("ad.t")
    public short[] field910;

    @ObfuscatedName("ad.i")
    public short[] field903;

    @ObfuscatedName("ad.z")
    public short[] field911;

    @ObfuscatedName("ad.o")
    public int field905 = 128;

    @ObfuscatedName("ad.u")
    public int field906 = 128;

    @ObfuscatedName("ad.f")
    public int field907 = 0;

    @ObfuscatedName("ad.k")
    public int field908 = 0;

    @ObfuscatedName("ad.q")
    public int field902 = 0;

    @ObfuscatedName("as.j(Lez;Lez;I)V")
    public static void method639(class152 arg0, class152 arg1) {
        Statics.field898 = arg0;
        Statics.field904 = arg1;
    }

    @ObfuscatedName("n.r(II)Lad;")
    public static class35 method233(int arg0) {
        class35 var1 = (class35) field896.method3264((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field898.method3016(13, arg0);
        class35 var3 = new class35();
        var3.field894 = arg0;
        if (var2 != null) {
            var3.method734(new class127(var2));
        }
        field896.method3257(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ad.v(Ldn;B)V")
    public void method734(class127 arg0) {
        while (true) {
            int var2 = arg0.method2441();
            if (var2 == 0) {
                return;
            }
            this.method735(arg0, var2);
        }
    }

    @ObfuscatedName("ad.p(Ldn;II)V")
    public void method735(class127 arg0, int arg1) {
        if (arg1 == 1) {
            this.field899 = arg0.method2609();
        } else if (arg1 == 2) {
            this.field900 = arg0.method2609();
        } else if (arg1 == 4) {
            this.field905 = arg0.method2609();
        } else if (arg1 == 5) {
            this.field906 = arg0.method2609();
        } else if (arg1 == 6) {
            this.field907 = arg0.method2609();
        } else if (arg1 == 7) {
            this.field908 = arg0.method2441();
        } else if (arg1 == 8) {
            this.field902 = arg0.method2441();
        } else if (arg1 == 40) {
            int var3 = arg0.method2441();
            this.field916 = new short[var3];
            this.field910 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field916[var4] = (short) arg0.method2609();
                this.field910[var4] = (short) arg0.method2609();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2441();
            this.field903 = new short[var5];
            this.field911 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field903[var6] = (short) arg0.method2609();
                this.field911[var6] = (short) arg0.method2609();
            }
        }
    }

    @ObfuscatedName("ad.e(II)Ldt;")
    public final class112 method736(int arg0) {
        class112 var2 = (class112) field897.method3264((long) this.field894);
        if (var2 == null) {
            class101 var3 = class101.method2115(Statics.field904, this.field899, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field916 != null) {
                for (int var4 = 0; var4 < this.field916.length; var4++) {
                    var3.method2062(this.field916[var4], this.field910[var4]);
                }
            }
            if (this.field903 != null) {
                for (int var5 = 0; var5 < this.field903.length; var5++) {
                    var3.method2063(this.field903[var5], this.field911[var5]);
                }
            }
            var2 = var3.method2073(this.field908 + 64, this.field902 + 850, -30, -50, -30);
            field897.method3257(var2, (long) this.field894);
        }
        class112 var6;
        if (this.field900 == -1 || arg0 == -1) {
            var6 = var2.method2233(true);
        } else {
            var6 = class34.method2349(this.field900).method702(var2, arg0);
        }
        if (this.field905 != 128 || this.field906 != 128) {
            var6.method2241(this.field905, this.field906, this.field905);
        }
        if (this.field907 != 0) {
            if (this.field907 == 90) {
                var6.method2239();
            }
            if (this.field907 == 180) {
                var6.method2239();
                var6.method2239();
            }
            if (this.field907 == 270) {
                var6.method2239();
                var6.method2239();
                var6.method2239();
            }
        }
        return var6;
    }
}
