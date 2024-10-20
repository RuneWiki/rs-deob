package deob;

@ObfuscatedName("ay")
public class class44 extends class205 {

    @ObfuscatedName("ay.x")
    public static class194 field1026 = new class194(64);

    @ObfuscatedName("ay.b")
    public static class194 field1027 = new class194(30);

    @ObfuscatedName("ay.l")
    public int field1025;

    @ObfuscatedName("ay.d")
    public int field1024;

    @ObfuscatedName("ay.n")
    public int field1021 = -1;

    @ObfuscatedName("ay.m")
    public short[] field1033;

    @ObfuscatedName("ay.g")
    public short[] field1029;

    @ObfuscatedName("ay.s")
    public short[] field1023;

    @ObfuscatedName("ay.r")
    public short[] field1031;

    @ObfuscatedName("ay.k")
    public int field1030 = 128;

    @ObfuscatedName("ay.o")
    public int field1028 = 128;

    @ObfuscatedName("ay.q")
    public int field1034 = 0;

    @ObfuscatedName("ay.p")
    public int field1035 = 0;

    @ObfuscatedName("ay.h")
    public int field1036 = 0;

    @ObfuscatedName("u.f(IB)Lay;")
    public static class44 method13(int arg0) {
        class44 var1 = (class44) field1026.method3530((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1039.method3061(13, arg0);
        class44 var3 = new class44();
        var3.field1025 = arg0;
        if (var2 != null) {
            var3.method913(new class120(var2));
        }
        field1026.method3521(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ay.u(Ldj;I)V")
    public void method913(class120 arg0) {
        while (true) {
            int var2 = arg0.method2385();
            if (var2 == 0) {
                return;
            }
            this.method926(arg0, var2);
        }
    }

    @ObfuscatedName("ay.x(Ldj;IB)V")
    public void method926(class120 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1024 = arg0.method2387();
        } else if (arg1 == 2) {
            this.field1021 = arg0.method2387();
        } else if (arg1 == 4) {
            this.field1030 = arg0.method2387();
        } else if (arg1 == 5) {
            this.field1028 = arg0.method2387();
        } else if (arg1 == 6) {
            this.field1034 = arg0.method2387();
        } else if (arg1 == 7) {
            this.field1035 = arg0.method2385();
        } else if (arg1 == 8) {
            this.field1036 = arg0.method2385();
        } else if (arg1 == 40) {
            int var3 = arg0.method2385();
            this.field1033 = new short[var3];
            this.field1029 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1033[var4] = (short) arg0.method2387();
                this.field1029[var4] = (short) arg0.method2387();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2385();
            this.field1023 = new short[var5];
            this.field1031 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1023[var6] = (short) arg0.method2387();
                this.field1031[var6] = (short) arg0.method2387();
            }
        }
    }

    @ObfuscatedName("ay.b(II)Ldr;")
    public final class106 method925(int arg0) {
        class106 var2 = (class106) field1027.method3530((long) this.field1025);
        if (var2 == null) {
            class101 var3 = class101.method2118(Statics.field1022, this.field1024, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field1033 != null) {
                for (int var4 = 0; var4 < this.field1033.length; var4++) {
                    var3.method2179(this.field1033[var4], this.field1029[var4]);
                }
            }
            if (this.field1023 != null) {
                for (int var5 = 0; var5 < this.field1023.length; var5++) {
                    var3.method2138(this.field1023[var5], this.field1031[var5]);
                }
            }
            var2 = var3.method2128(this.field1035 + 64, this.field1036 + 850, -30, -50, -30);
            field1027.method3521(var2, (long) this.field1025);
        }
        class106 var6;
        if (this.field1021 == -1 || arg0 == -1) {
            var6 = var2.method2193(true);
        } else {
            var6 = class43.method745(this.field1021).method900(var2, arg0);
        }
        if (this.field1030 != 128 || this.field1028 != 128) {
            var6.method2191(this.field1030, this.field1028, this.field1030);
        }
        if (this.field1034 != 0) {
            if (this.field1034 == 90) {
                var6.method2221();
            }
            if (this.field1034 == 180) {
                var6.method2221();
                var6.method2221();
            }
            if (this.field1034 == 270) {
                var6.method2221();
                var6.method2221();
                var6.method2221();
            }
        }
        return var6;
    }

    @ObfuscatedName("ah.l(I)V")
    public static void method808() {
        field1026.method3529();
        field1027.method3529();
    }
}
