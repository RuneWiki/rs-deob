package deob;

@ObfuscatedName("am")
public class class44 extends class204 {

    @ObfuscatedName("am.w")
    public static class193 field1013 = new class193(64);

    @ObfuscatedName("am.d")
    public static class193 field1014 = new class193(30);

    @ObfuscatedName("am.z")
    public int field1015;

    @ObfuscatedName("am.l")
    public int field1027;

    @ObfuscatedName("am.m")
    public int field1017 = -1;

    @ObfuscatedName("am.p")
    public short[] field1018;

    @ObfuscatedName("am.u")
    public short[] field1024;

    @ObfuscatedName("am.c")
    public short[] field1020;

    @ObfuscatedName("am.v")
    public short[] field1021;

    @ObfuscatedName("am.o")
    public int field1011 = 128;

    @ObfuscatedName("am.n")
    public int field1023 = 128;

    @ObfuscatedName("am.k")
    public int field1022 = 0;

    @ObfuscatedName("am.f")
    public int field1025 = 0;

    @ObfuscatedName("am.x")
    public int field1026 = 0;

    @ObfuscatedName("df.g(II)Lam;")
    public static class44 method2656(int arg0) {
        class44 var1 = (class44) field1013.method3529((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1019.method3112(13, arg0);
        class44 var3 = new class44();
        var3.field1015 = arg0;
        if (var2 != null) {
            var3.method911(new class119(var2));
        }
        field1013.method3528(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("am.b(Ldm;I)V")
    public void method911(class119 arg0) {
        while (true) {
            int var2 = arg0.method2362();
            if (var2 == 0) {
                return;
            }
            this.method906(arg0, var2);
        }
    }

    @ObfuscatedName("am.w(Ldm;IB)V")
    public void method906(class119 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1027 = arg0.method2376();
        } else if (arg1 == 2) {
            this.field1017 = arg0.method2376();
        } else if (arg1 == 4) {
            this.field1011 = arg0.method2376();
        } else if (arg1 == 5) {
            this.field1023 = arg0.method2376();
        } else if (arg1 == 6) {
            this.field1022 = arg0.method2376();
        } else if (arg1 == 7) {
            this.field1025 = arg0.method2362();
        } else if (arg1 == 8) {
            this.field1026 = arg0.method2362();
        } else if (arg1 == 40) {
            int var3 = arg0.method2362();
            this.field1018 = new short[var3];
            this.field1024 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1018[var4] = (short) arg0.method2376();
                this.field1024[var4] = (short) arg0.method2376();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2362();
            this.field1020 = new short[var5];
            this.field1021 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1020[var6] = (short) arg0.method2376();
                this.field1021[var6] = (short) arg0.method2376();
            }
        }
    }

    @ObfuscatedName("am.d(II)Ldd;")
    public final class105 method917(int arg0) {
        class105 var2 = (class105) field1014.method3529((long) this.field1015);
        if (var2 == null) {
            class100 var3 = class100.method2080(Statics.field1012, this.field1027, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field1018 != null) {
                for (int var4 = 0; var4 < this.field1018.length; var4++) {
                    var3.method2093(this.field1018[var4], this.field1024[var4]);
                }
            }
            if (this.field1020 != null) {
                for (int var5 = 0; var5 < this.field1020.length; var5++) {
                    var3.method2094(this.field1020[var5], this.field1021[var5]);
                }
            }
            var2 = var3.method2079(this.field1025 + 64, this.field1026 + 850, -30, -50, -30);
            field1014.method3528(var2, (long) this.field1015);
        }
        class105 var6;
        if (this.field1017 == -1 || arg0 == -1) {
            var6 = var2.method2195(true);
        } else {
            var6 = class43.method2054(this.field1017).method880(var2, arg0);
        }
        if (this.field1011 != 128 || this.field1023 != 128) {
            var6.method2190(this.field1011, this.field1023, this.field1011);
        }
        if (this.field1022 != 0) {
            if (this.field1022 == 90) {
                var6.method2185();
            }
            if (this.field1022 == 180) {
                var6.method2185();
                var6.method2185();
            }
            if (this.field1022 == 270) {
                var6.method2185();
                var6.method2185();
                var6.method2185();
            }
        }
        return var6;
    }
}
