package deob;

@ObfuscatedName("id")
public class class246 extends class195 {

    @ObfuscatedName("id.e")
    public static class190 field3332 = new class190(64);

    @ObfuscatedName("id.t")
    public static class190 field3335 = new class190(30);

    @ObfuscatedName("id.w")
    public int field3340;

    @ObfuscatedName("id.z")
    public int field3334;

    @ObfuscatedName("id.j")
    public int field3336 = -1;

    @ObfuscatedName("id.i")
    public short[] field3337;

    @ObfuscatedName("id.f")
    public short[] field3338;

    @ObfuscatedName("id.c")
    public short[] field3347;

    @ObfuscatedName("id.o")
    public short[] field3331;

    @ObfuscatedName("id.q")
    public int field3341 = 128;

    @ObfuscatedName("id.n")
    public int field3342 = 128;

    @ObfuscatedName("id.a")
    public int field3343 = 0;

    @ObfuscatedName("id.g")
    public int field3344 = 0;

    @ObfuscatedName("id.v")
    public int field3339 = 0;

    @ObfuscatedName("ip.p(II)Lid;")
    public static class246 method3873(int arg0) {
        class246 var1 = (class246) field3332.method3182((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3345.method3720(13, arg0);
        class246 var3 = new class246();
        var3.field3340 = arg0;
        if (var2 != null) {
            var3.method3907(new class174(var2));
        }
        field3332.method3179(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("id.m(Lfr;B)V")
    public void method3907(class174 arg0) {
        while (true) {
            int var2 = arg0.method2810();
            if (var2 == 0) {
                return;
            }
            this.method3908(arg0, var2);
        }
    }

    @ObfuscatedName("id.e(Lfr;II)V")
    public void method3908(class174 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3334 = arg0.method2824();
        } else if (arg1 == 2) {
            this.field3336 = arg0.method2824();
        } else if (arg1 == 4) {
            this.field3341 = arg0.method2824();
        } else if (arg1 == 5) {
            this.field3342 = arg0.method2824();
        } else if (arg1 == 6) {
            this.field3343 = arg0.method2824();
        } else if (arg1 == 7) {
            this.field3344 = arg0.method2810();
        } else if (arg1 == 8) {
            this.field3339 = arg0.method2810();
        } else if (arg1 == 40) {
            int var3 = arg0.method2810();
            this.field3337 = new short[var3];
            this.field3338 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3337[var4] = (short) arg0.method2824();
                this.field3338[var4] = (short) arg0.method2824();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2810();
            this.field3347 = new short[var5];
            this.field3331 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3347[var6] = (short) arg0.method2824();
                this.field3331[var6] = (short) arg0.method2824();
            }
        }
    }

    @ObfuscatedName("id.t(IS)Les;")
    public final class134 method3910(int arg0) {
        class134 var2 = (class134) field3335.method3182((long) this.field3340);
        if (var2 == null) {
            class128 var3 = class128.method2137(Statics.field2793, this.field3334, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field3337 != null) {
                for (int var4 = 0; var4 < this.field3337.length; var4++) {
                    var3.method2149(this.field3337[var4], this.field3338[var4]);
                }
            }
            if (this.field3347 != null) {
                for (int var5 = 0; var5 < this.field3347.length; var5++) {
                    var3.method2147(this.field3347[var5], this.field3331[var5]);
                }
            }
            var2 = var3.method2148(this.field3344 + 64, this.field3339 + 850, -30, -50, -30);
            field3335.method3179(var2, (long) this.field3340);
        }
        class134 var6;
        if (this.field3336 == -1 || arg0 == -1) {
            var6 = var2.method2221(true);
        } else {
            var6 = class261.method790(this.field3336).method4273(var2, arg0);
        }
        if (this.field3341 != 128 || this.field3342 != 128) {
            var6.method2236(this.field3341, this.field3342, this.field3341);
        }
        if (this.field3343 != 0) {
            if (this.field3343 == 90) {
                var6.method2254();
            }
            if (this.field3343 == 180) {
                var6.method2254();
                var6.method2254();
            }
            if (this.field3343 == 270) {
                var6.method2254();
                var6.method2254();
                var6.method2254();
            }
        }
        return var6;
    }
}
