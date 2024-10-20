package deob;

@ObfuscatedName("aq")
public class class44 extends class204 {

    @ObfuscatedName("aq.a")
    public static class193 field1009 = new class193(64);

    @ObfuscatedName("aq.i")
    public static class193 field1007 = new class193(30);

    @ObfuscatedName("aq.f")
    public int field1023;

    @ObfuscatedName("aq.m")
    public int field1012;

    @ObfuscatedName("aq.o")
    public int field1013 = -1;

    @ObfuscatedName("aq.h")
    public short[] field1011;

    @ObfuscatedName("aq.n")
    public short[] field1015;

    @ObfuscatedName("aq.k")
    public short[] field1016;

    @ObfuscatedName("aq.r")
    public short[] field1022;

    @ObfuscatedName("aq.b")
    public int field1014 = 128;

    @ObfuscatedName("aq.q")
    public int field1019 = 128;

    @ObfuscatedName("aq.u")
    public int field1020 = 0;

    @ObfuscatedName("aq.g")
    public int field1021 = 0;

    @ObfuscatedName("aq.y")
    public int field1018 = 0;

    @ObfuscatedName("ab.j(II)Laq;")
    public static class44 method632(int arg0) {
        class44 var1 = (class44) field1009.method3466((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1017.method3005(13, arg0);
        class44 var3 = new class44();
        var3.field1023 = arg0;
        if (var2 != null) {
            var3.method889(new class119(var2));
        }
        field1009.method3468(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aq.l(Ldc;I)V")
    public void method889(class119 arg0) {
        while (true) {
            int var2 = arg0.method2316();
            if (var2 == 0) {
                return;
            }
            this.method885(arg0, var2);
        }
    }

    @ObfuscatedName("aq.a(Ldc;II)V")
    public void method885(class119 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1012 = arg0.method2318();
        } else if (arg1 == 2) {
            this.field1013 = arg0.method2318();
        } else if (arg1 == 4) {
            this.field1014 = arg0.method2318();
        } else if (arg1 == 5) {
            this.field1019 = arg0.method2318();
        } else if (arg1 == 6) {
            this.field1020 = arg0.method2318();
        } else if (arg1 == 7) {
            this.field1021 = arg0.method2316();
        } else if (arg1 == 8) {
            this.field1018 = arg0.method2316();
        } else if (arg1 == 40) {
            int var3 = arg0.method2316();
            this.field1011 = new short[var3];
            this.field1015 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1011[var4] = (short) arg0.method2318();
                this.field1015[var4] = (short) arg0.method2318();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2316();
            this.field1016 = new short[var5];
            this.field1022 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1016[var6] = (short) arg0.method2318();
                this.field1022[var6] = (short) arg0.method2318();
            }
        }
    }

    @ObfuscatedName("aq.i(II)Ldd;")
    public final class105 method884(int arg0) {
        class105 var2 = (class105) field1007.method3466((long) this.field1023);
        if (var2 == null) {
            class100 var3 = class100.method2109(Statics.field1008, this.field1012, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field1011 != null) {
                for (int var4 = 0; var4 < this.field1011.length; var4++) {
                    var3.method2061(this.field1011[var4], this.field1015[var4]);
                }
            }
            if (this.field1016 != null) {
                for (int var5 = 0; var5 < this.field1016.length; var5++) {
                    var3.method2055(this.field1016[var5], this.field1022[var5]);
                }
            }
            var2 = var3.method2041(this.field1021 + 64, this.field1018 + 850, -30, -50, -30);
            field1007.method3468(var2, (long) this.field1023);
        }
        class105 var6;
        if (this.field1013 == -1 || arg0 == -1) {
            var6 = var2.method2166(true);
        } else {
            var6 = class43.method729(this.field1013).method865(var2, arg0);
        }
        if (this.field1014 != 128 || this.field1019 != 128) {
            var6.method2180(this.field1014, this.field1019, this.field1014);
        }
        if (this.field1020 != 0) {
            if (this.field1020 == 90) {
                var6.method2138();
            }
            if (this.field1020 == 180) {
                var6.method2138();
                var6.method2138();
            }
            if (this.field1020 == 270) {
                var6.method2138();
                var6.method2138();
                var6.method2138();
            }
        }
        return var6;
    }

    @ObfuscatedName("cj.f(B)V")
    public static void method2022() {
        field1009.method3475();
        field1007.method3475();
    }
}
