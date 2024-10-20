package deob;

@ObfuscatedName("ad")
public class class35 extends class174 {

    @ObfuscatedName("ad.v")
    public static class170 field903 = new class170(64);

    @ObfuscatedName("ad.r")
    public static class170 field890 = new class170(30);

    @ObfuscatedName("ad.n")
    public int field891;

    @ObfuscatedName("ad.i")
    public int field892;

    @ObfuscatedName("ad.s")
    public int field893 = -1;

    @ObfuscatedName("ad.w")
    public short[] field889;

    @ObfuscatedName("ad.d")
    public short[] field888;

    @ObfuscatedName("ad.t")
    public short[] field896;

    @ObfuscatedName("ad.f")
    public short[] field899;

    @ObfuscatedName("ad.b")
    public int field897 = 128;

    @ObfuscatedName("ad.z")
    public int field895 = 128;

    @ObfuscatedName("ad.l")
    public int field900 = 0;

    @ObfuscatedName("ad.e")
    public int field901 = 0;

    @ObfuscatedName("ad.p")
    public int field898 = 0;

    @ObfuscatedName("ao.g(Leo;Leo;I)V")
    public static void method889(class152 arg0, class152 arg1) {
        Statics.field894 = arg0;
        Statics.field1370 = arg1;
    }

    @ObfuscatedName("ah.m(IB)Lad;")
    public static class35 method226(int arg0) {
        class35 var1 = (class35) field903.method3245((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field894.method2968(13, arg0);
        class35 var3 = new class35();
        var3.field891 = arg0;
        if (var2 != null) {
            var3.method736(new class127(var2));
        }
        field903.method3249(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ad.v(Ldr;B)V")
    public void method736(class127 arg0) {
        while (true) {
            int var2 = arg0.method2414();
            if (var2 == 0) {
                return;
            }
            this.method742(arg0, var2);
        }
    }

    @ObfuscatedName("ad.r(Ldr;II)V")
    public void method742(class127 arg0, int arg1) {
        if (arg1 == 1) {
            this.field892 = arg0.method2416();
        } else if (arg1 == 2) {
            this.field893 = arg0.method2416();
        } else if (arg1 == 4) {
            this.field897 = arg0.method2416();
        } else if (arg1 == 5) {
            this.field895 = arg0.method2416();
        } else if (arg1 == 6) {
            this.field900 = arg0.method2416();
        } else if (arg1 == 7) {
            this.field901 = arg0.method2414();
        } else if (arg1 == 8) {
            this.field898 = arg0.method2414();
        } else if (arg1 == 40) {
            int var3 = arg0.method2414();
            this.field889 = new short[var3];
            this.field888 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field889[var4] = (short) arg0.method2416();
                this.field888[var4] = (short) arg0.method2416();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2414();
            this.field896 = new short[var5];
            this.field899 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field896[var6] = (short) arg0.method2416();
                this.field899[var6] = (short) arg0.method2416();
            }
        }
    }

    @ObfuscatedName("ad.n(IB)Ldf;")
    public final class112 method738(int arg0) {
        class112 var2 = (class112) field890.method3245((long) this.field891);
        if (var2 == null) {
            class101 var3 = class101.method2086(Statics.field1370, this.field892, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field889 != null) {
                for (int var4 = 0; var4 < this.field889.length; var4++) {
                    var3.method2031(this.field889[var4], this.field888[var4]);
                }
            }
            if (this.field896 != null) {
                for (int var5 = 0; var5 < this.field896.length; var5++) {
                    var3.method2042(this.field896[var5], this.field899[var5]);
                }
            }
            var2 = var3.method2039(this.field901 + 64, this.field898 + 850, -30, -50, -30);
            field890.method3249(var2, (long) this.field891);
        }
        class112 var6;
        if (this.field893 == -1 || arg0 == -1) {
            var6 = var2.method2205(true);
        } else {
            var6 = class34.method1536(this.field893).method722(var2, arg0);
        }
        if (this.field897 != 128 || this.field895 != 128) {
            var6.method2217(this.field897, this.field895, this.field897);
        }
        if (this.field900 != 0) {
            if (this.field900 == 90) {
                var6.method2214();
            }
            if (this.field900 == 180) {
                var6.method2214();
                var6.method2214();
            }
            if (this.field900 == 270) {
                var6.method2214();
                var6.method2214();
                var6.method2214();
            }
        }
        return var6;
    }

    @ObfuscatedName("bi.i(B)V")
    public static void method1383() {
        field903.method3251();
        field890.method3251();
    }
}
