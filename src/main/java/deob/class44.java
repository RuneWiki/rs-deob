package deob;

@ObfuscatedName("ah")
public class class44 extends class204 {

    @ObfuscatedName("ah.f")
    public static class193 field1023 = new class193(64);

    @ObfuscatedName("ah.h")
    public static class193 field1024 = new class193(30);

    @ObfuscatedName("ah.a")
    public int field1025;

    @ObfuscatedName("ah.s")
    public int field1026;

    @ObfuscatedName("ah.p")
    public int field1027 = -1;

    @ObfuscatedName("ah.r")
    public short[] field1028;

    @ObfuscatedName("ah.k")
    public short[] field1021;

    @ObfuscatedName("ah.d")
    public short[] field1030;

    @ObfuscatedName("ah.n")
    public short[] field1031;

    @ObfuscatedName("ah.z")
    public int field1035 = 128;

    @ObfuscatedName("ah.c")
    public int field1033 = 128;

    @ObfuscatedName("ah.b")
    public int field1034 = 0;

    @ObfuscatedName("ah.w")
    public int field1029 = 0;

    @ObfuscatedName("ah.g")
    public int field1036 = 0;

    @ObfuscatedName("af.i(IB)Lah;")
    public static class44 method769(int arg0) {
        class44 var1 = (class44) field1023.method3467((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1037.method3080(13, arg0);
        class44 var3 = new class44();
        var3.field1025 = arg0;
        if (var2 != null) {
            var3.method838(new class119(var2));
        }
        field1023.method3466(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ah.v(Ldj;I)V")
    public void method838(class119 arg0) {
        while (true) {
            int var2 = arg0.method2310();
            if (var2 == 0) {
                return;
            }
            this.method841(arg0, var2);
        }
    }

    @ObfuscatedName("ah.f(Ldj;II)V")
    public void method841(class119 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1026 = arg0.method2312();
        } else if (arg1 == 2) {
            this.field1027 = arg0.method2312();
        } else if (arg1 == 4) {
            this.field1035 = arg0.method2312();
        } else if (arg1 == 5) {
            this.field1033 = arg0.method2312();
        } else if (arg1 == 6) {
            this.field1034 = arg0.method2312();
        } else if (arg1 == 7) {
            this.field1029 = arg0.method2310();
        } else if (arg1 == 8) {
            this.field1036 = arg0.method2310();
        } else if (arg1 == 40) {
            int var3 = arg0.method2310();
            this.field1028 = new short[var3];
            this.field1021 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1028[var4] = (short) arg0.method2312();
                this.field1021[var4] = (short) arg0.method2312();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2310();
            this.field1030 = new short[var5];
            this.field1031 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1030[var6] = (short) arg0.method2312();
                this.field1031[var6] = (short) arg0.method2312();
            }
        }
    }

    @ObfuscatedName("ah.h(IB)Ldo;")
    public final class105 method840(int arg0) {
        class105 var2 = (class105) field1024.method3467((long) this.field1025);
        if (var2 == null) {
            class100 var3 = class100.method2014(Statics.field1022, this.field1026, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field1028 != null) {
                for (int var4 = 0; var4 < this.field1028.length; var4++) {
                    var3.method2019(this.field1028[var4], this.field1021[var4]);
                }
            }
            if (this.field1030 != null) {
                for (int var5 = 0; var5 < this.field1030.length; var5++) {
                    var3.method2029(this.field1030[var5], this.field1031[var5]);
                }
            }
            var2 = var3.method2036(this.field1029 + 64, this.field1036 + 850, -30, -50, -30);
            field1024.method3466(var2, (long) this.field1025);
        }
        class105 var6;
        if (this.field1027 == -1 || arg0 == -1) {
            var6 = var2.method2175(true);
        } else {
            var6 = class43.method3831(this.field1027).method818(var2, arg0);
        }
        if (this.field1035 != 128 || this.field1033 != 128) {
            var6.method2115(this.field1035, this.field1033, this.field1035);
        }
        if (this.field1034 != 0) {
            if (this.field1034 == 90) {
                var6.method2107();
            }
            if (this.field1034 == 180) {
                var6.method2107();
                var6.method2107();
            }
            if (this.field1034 == 270) {
                var6.method2107();
                var6.method2107();
                var6.method2107();
            }
        }
        return var6;
    }
}
