package deob;

@ObfuscatedName("ak")
public class class35 extends class174 {

    @ObfuscatedName("ak.a")
    public static class170 field892 = new class170(64);

    @ObfuscatedName("ak.t")
    public static class170 field893 = new class170(30);

    @ObfuscatedName("ak.f")
    public int field898;

    @ObfuscatedName("ak.c")
    public int field895;

    @ObfuscatedName("ak.p")
    public int field896 = -1;

    @ObfuscatedName("ak.s")
    public short[] field890;

    @ObfuscatedName("ak.k")
    public short[] field894;

    @ObfuscatedName("ak.m")
    public short[] field897;

    @ObfuscatedName("ak.y")
    public short[] field891;

    @ObfuscatedName("ak.b")
    public int field901 = 128;

    @ObfuscatedName("ak.l")
    public int field899 = 128;

    @ObfuscatedName("ak.x")
    public int field903 = 0;

    @ObfuscatedName("ak.z")
    public int field904 = 0;

    @ObfuscatedName("ak.r")
    public int field905 = 0;

    @ObfuscatedName("k.d(II)Lak;")
    public static class35 method102(int arg0) {
        class35 var1 = (class35) field892.method3210((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field902.method2958(13, arg0);
        class35 var3 = new class35();
        var3.field898 = arg0;
        if (var2 != null) {
            var3.method713(new class127(var2));
        }
        field892.method3221(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ak.g(Ldo;I)V")
    public void method713(class127 arg0) {
        while (true) {
            int var2 = arg0.method2509();
            if (var2 == 0) {
                return;
            }
            this.method714(arg0, var2);
        }
    }

    @ObfuscatedName("ak.a(Ldo;II)V")
    public void method714(class127 arg0, int arg1) {
        if (arg1 == 1) {
            this.field895 = arg0.method2512();
        } else if (arg1 == 2) {
            this.field896 = arg0.method2512();
        } else if (arg1 == 4) {
            this.field901 = arg0.method2512();
        } else if (arg1 == 5) {
            this.field899 = arg0.method2512();
        } else if (arg1 == 6) {
            this.field903 = arg0.method2512();
        } else if (arg1 == 7) {
            this.field904 = arg0.method2509();
        } else if (arg1 == 8) {
            this.field905 = arg0.method2509();
        } else if (arg1 == 40) {
            int var3 = arg0.method2509();
            this.field890 = new short[var3];
            this.field894 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field890[var4] = (short) arg0.method2512();
                this.field894[var4] = (short) arg0.method2512();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2509();
            this.field897 = new short[var5];
            this.field891 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field897[var6] = (short) arg0.method2512();
                this.field891[var6] = (short) arg0.method2512();
            }
        }
    }

    @ObfuscatedName("ak.t(II)Ldd;")
    public final class112 method715(int arg0) {
        class112 var2 = (class112) field893.method3210((long) this.field898);
        if (var2 == null) {
            class101 var3 = class101.method2016(Statics.field900, this.field895, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field890 != null) {
                for (int var4 = 0; var4 < this.field890.length; var4++) {
                    var3.method2035(this.field890[var4], this.field894[var4]);
                }
            }
            if (this.field897 != null) {
                for (int var5 = 0; var5 < this.field897.length; var5++) {
                    var3.method2017(this.field897[var5], this.field891[var5]);
                }
            }
            var2 = var3.method2013(this.field904 + 64, this.field905 + 850, -30, -50, -30);
            field893.method3221(var2, (long) this.field898);
        }
        class112 var6;
        if (this.field896 == -1 || arg0 == -1) {
            var6 = var2.method2188(true);
        } else {
            var6 = class34.method136(this.field896).method678(var2, arg0);
        }
        if (this.field901 != 128 || this.field899 != 128) {
            var6.method2201(this.field901, this.field899, this.field901);
        }
        if (this.field903 != 0) {
            if (this.field903 == 90) {
                var6.method2207();
            }
            if (this.field903 == 180) {
                var6.method2207();
                var6.method2207();
            }
            if (this.field903 == 270) {
                var6.method2207();
                var6.method2207();
                var6.method2207();
            }
        }
        return var6;
    }

    @ObfuscatedName("co.f(B)V")
    public static void method1633() {
        field892.method3209();
        field893.method3209();
    }
}
