package deob;

@ObfuscatedName("as")
public class class44 extends class204 {

    @ObfuscatedName("as.k")
    public static class193 field1007 = new class193(64);

    @ObfuscatedName("as.t")
    public static class193 field1008 = new class193(30);

    @ObfuscatedName("as.g")
    public int field1009;

    @ObfuscatedName("as.o")
    public int field1022;

    @ObfuscatedName("as.i")
    public int field1016 = -1;

    @ObfuscatedName("as.w")
    public short[] field1019;

    @ObfuscatedName("as.m")
    public short[] field1013;

    @ObfuscatedName("as.r")
    public short[] field1014;

    @ObfuscatedName("as.y")
    public short[] field1005;

    @ObfuscatedName("as.q")
    public int field1015 = 128;

    @ObfuscatedName("as.f")
    public int field1017 = 128;

    @ObfuscatedName("as.x")
    public int field1018 = 0;

    @ObfuscatedName("as.d")
    public int field1021 = 0;

    @ObfuscatedName("as.e")
    public int field1020 = 0;

    @ObfuscatedName("ah.c(II)Las;")
    public static class44 method1037(int arg0) {
        class44 var1 = (class44) field1007.method3485((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1010.method2994(13, arg0);
        class44 var3 = new class44();
        var3.field1009 = arg0;
        if (var2 != null) {
            var3.method865(new class119(var2));
        }
        field1007.method3487(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("as.h(Ldf;I)V")
    public void method865(class119 arg0) {
        while (true) {
            int var2 = arg0.method2291();
            if (var2 == 0) {
                return;
            }
            this.method866(arg0, var2);
        }
    }

    @ObfuscatedName("as.k(Ldf;II)V")
    public void method866(class119 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1022 = arg0.method2293();
        } else if (arg1 == 2) {
            this.field1016 = arg0.method2293();
        } else if (arg1 == 4) {
            this.field1015 = arg0.method2293();
        } else if (arg1 == 5) {
            this.field1017 = arg0.method2293();
        } else if (arg1 == 6) {
            this.field1018 = arg0.method2293();
        } else if (arg1 == 7) {
            this.field1021 = arg0.method2291();
        } else if (arg1 == 8) {
            this.field1020 = arg0.method2291();
        } else if (arg1 == 40) {
            int var3 = arg0.method2291();
            this.field1019 = new short[var3];
            this.field1013 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1019[var4] = (short) arg0.method2293();
                this.field1013[var4] = (short) arg0.method2293();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2291();
            this.field1014 = new short[var5];
            this.field1005 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1014[var6] = (short) arg0.method2293();
                this.field1005[var6] = (short) arg0.method2293();
            }
        }
    }

    @ObfuscatedName("as.t(IB)Ldt;")
    public final class105 method876(int arg0) {
        class105 var2 = (class105) field1008.method3485((long) this.field1009);
        if (var2 == null) {
            class100 var3 = class100.method2063(Statics.field1006, this.field1022, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field1019 != null) {
                for (int var4 = 0; var4 < this.field1019.length; var4++) {
                    var3.method2019(this.field1019[var4], this.field1013[var4]);
                }
            }
            if (this.field1014 != null) {
                for (int var5 = 0; var5 < this.field1014.length; var5++) {
                    var3.method2020(this.field1014[var5], this.field1005[var5]);
                }
            }
            var2 = var3.method2027(this.field1021 + 64, this.field1020 + 850, -30, -50, -30);
            field1008.method3487(var2, (long) this.field1009);
        }
        class105 var6;
        if (this.field1016 == -1 || arg0 == -1) {
            var6 = var2.method2093(true);
        } else {
            var6 = class43.method2648(this.field1016).method828(var2, arg0);
        }
        if (this.field1015 != 128 || this.field1017 != 128) {
            var6.method2128(this.field1015, this.field1017, this.field1015);
        }
        if (this.field1018 != 0) {
            if (this.field1018 == 90) {
                var6.method2101();
            }
            if (this.field1018 == 180) {
                var6.method2101();
                var6.method2101();
            }
            if (this.field1018 == 270) {
                var6.method2101();
                var6.method2101();
                var6.method2101();
            }
        }
        return var6;
    }
}
