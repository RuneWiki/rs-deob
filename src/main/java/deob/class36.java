package deob;

@ObfuscatedName("am")
public class class36 extends class174 {

    @ObfuscatedName("am.y")
    public static class167 field889 = new class167(64);

    @ObfuscatedName("am.g")
    public static class167 field900 = new class167(30);

    @ObfuscatedName("am.r")
    public int field901;

    @ObfuscatedName("am.i")
    public int field892;

    @ObfuscatedName("am.f")
    public int field893 = -1;

    @ObfuscatedName("am.a")
    public short[] field894;

    @ObfuscatedName("am.w")
    public short[] field895;

    @ObfuscatedName("am.u")
    public short[] field896;

    @ObfuscatedName("am.d")
    public short[] field899;

    @ObfuscatedName("am.t")
    public int field898 = 128;

    @ObfuscatedName("am.j")
    public int field890 = 128;

    @ObfuscatedName("am.q")
    public int field897 = 0;

    @ObfuscatedName("am.p")
    public int field903 = 0;

    @ObfuscatedName("am.v")
    public int field902 = 0;

    @ObfuscatedName("ee.m(II)Lam;")
    public static class36 method2678(int arg0) {
        class36 var1 = (class36) field889.method3137((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field907.method2725(13, arg0);
        class36 var3 = new class36();
        var3.field901 = arg0;
        if (var2 != null) {
            var3.method705(new class104(var2));
        }
        field889.method3130(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("am.k(Lcb;I)V")
    public void method705(class104 arg0) {
        while (true) {
            int var2 = arg0.method2190();
            if (var2 == 0) {
                return;
            }
            this.method720(arg0, var2);
        }
    }

    @ObfuscatedName("am.y(Lcb;IB)V")
    public void method720(class104 arg0, int arg1) {
        if (arg1 == 1) {
            this.field892 = arg0.method2132();
        } else if (arg1 == 2) {
            this.field893 = arg0.method2132();
        } else if (arg1 == 4) {
            this.field898 = arg0.method2132();
        } else if (arg1 == 5) {
            this.field890 = arg0.method2132();
        } else if (arg1 == 6) {
            this.field897 = arg0.method2132();
        } else if (arg1 == 7) {
            this.field903 = arg0.method2190();
        } else if (arg1 == 8) {
            this.field902 = arg0.method2190();
        } else if (arg1 == 40) {
            int var3 = arg0.method2190();
            this.field894 = new short[var3];
            this.field895 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field894[var4] = (short) arg0.method2132();
                this.field895[var4] = (short) arg0.method2132();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2190();
            this.field896 = new short[var5];
            this.field899 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field896[var6] = (short) arg0.method2132();
                this.field899[var6] = (short) arg0.method2132();
            }
        }
    }

    @ObfuscatedName("am.g(II)Lcl;")
    public final class95 method707(int arg0) {
        class95 var2 = (class95) field900.method3137((long) this.field901);
        if (var2 == null) {
            class90 var3 = class90.method1944(Statics.field888, this.field892, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field894 != null) {
                for (int var4 = 0; var4 < this.field894.length; var4++) {
                    var3.method1957(this.field894[var4], this.field895[var4]);
                }
            }
            if (this.field896 != null) {
                for (int var5 = 0; var5 < this.field896.length; var5++) {
                    var3.method1910(this.field896[var5], this.field899[var5]);
                }
            }
            var2 = var3.method1872(this.field903 + 64, this.field902 + 850, -30, -50, -30);
            field900.method3130(var2, (long) this.field901);
        }
        class95 var6;
        if (this.field893 == -1 || arg0 == -1) {
            var6 = var2.method2048(true);
        } else {
            var6 = class35.method162(this.field893).method682(var2, arg0);
        }
        if (this.field898 != 128 || this.field890 != 128) {
            var6.method2046(this.field898, this.field890, this.field898);
        }
        if (this.field897 != 0) {
            if (this.field897 == 90) {
                var6.method1981();
            }
            if (this.field897 == 180) {
                var6.method1981();
                var6.method1981();
            }
            if (this.field897 == 270) {
                var6.method1981();
                var6.method1981();
                var6.method1981();
            }
        }
        return var6;
    }
}
