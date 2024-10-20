package deob;

@ObfuscatedName("ak")
public class class44 extends class205 {

    @ObfuscatedName("ak.t")
    public static class194 field1015 = new class194(64);

    @ObfuscatedName("ak.p")
    public static class194 field1016 = new class194(30);

    @ObfuscatedName("ak.e")
    public int field1013;

    @ObfuscatedName("ak.y")
    public int field1018;

    @ObfuscatedName("ak.m")
    public int field1019 = -1;

    @ObfuscatedName("ak.c")
    public short[] field1028;

    @ObfuscatedName("ak.v")
    public short[] field1025;

    @ObfuscatedName("ak.l")
    public short[] field1022;

    @ObfuscatedName("ak.z")
    public short[] field1023;

    @ObfuscatedName("ak.s")
    public int field1030 = 128;

    @ObfuscatedName("ak.j")
    public int field1024 = 128;

    @ObfuscatedName("ak.q")
    public int field1026 = 0;

    @ObfuscatedName("ak.a")
    public int field1027 = 0;

    @ObfuscatedName("ak.d")
    public int field1017 = 0;

    @ObfuscatedName("ay.w(II)Lak;")
    public static class44 method662(int arg0) {
        class44 var1 = (class44) field1015.method3520((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1021.method3127(13, arg0);
        class44 var3 = new class44();
        var3.field1013 = arg0;
        if (var2 != null) {
            var3.method929(new class120(var2));
        }
        field1015.method3522(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ak.x(Lde;S)V")
    public void method929(class120 arg0) {
        while (true) {
            int var2 = arg0.method2363();
            if (var2 == 0) {
                return;
            }
            this.method920(arg0, var2);
        }
    }

    @ObfuscatedName("ak.t(Lde;IB)V")
    public void method920(class120 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1018 = arg0.method2365();
        } else if (arg1 == 2) {
            this.field1019 = arg0.method2365();
        } else if (arg1 == 4) {
            this.field1030 = arg0.method2365();
        } else if (arg1 == 5) {
            this.field1024 = arg0.method2365();
        } else if (arg1 == 6) {
            this.field1026 = arg0.method2365();
        } else if (arg1 == 7) {
            this.field1027 = arg0.method2363();
        } else if (arg1 == 8) {
            this.field1017 = arg0.method2363();
        } else if (arg1 == 40) {
            int var3 = arg0.method2363();
            this.field1028 = new short[var3];
            this.field1025 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1028[var4] = (short) arg0.method2365();
                this.field1025[var4] = (short) arg0.method2365();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2363();
            this.field1022 = new short[var5];
            this.field1023 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1022[var6] = (short) arg0.method2365();
                this.field1023[var6] = (short) arg0.method2365();
            }
        }
    }

    @ObfuscatedName("ak.p(II)Ldp;")
    public final class106 method918(int arg0) {
        class106 var2 = (class106) field1016.method3520((long) this.field1013);
        if (var2 == null) {
            class101 var3 = class101.method2081(Statics.field1014, this.field1018, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field1028 != null) {
                for (int var4 = 0; var4 < this.field1028.length; var4++) {
                    var3.method2105(this.field1028[var4], this.field1025[var4]);
                }
            }
            if (this.field1022 != null) {
                for (int var5 = 0; var5 < this.field1022.length; var5++) {
                    var3.method2072(this.field1022[var5], this.field1023[var5]);
                }
            }
            var2 = var3.method2079(this.field1027 + 64, this.field1017 + 850, -30, -50, -30);
            field1016.method3522(var2, (long) this.field1013);
        }
        class106 var6;
        if (this.field1019 == -1 || arg0 == -1) {
            var6 = var2.method2169(true);
        } else {
            var6 = class43.method2054(this.field1019).method885(var2, arg0);
        }
        if (this.field1030 != 128 || this.field1024 != 128) {
            var6.method2182(this.field1030, this.field1024, this.field1030);
        }
        if (this.field1026 != 0) {
            if (this.field1026 == 90) {
                var6.method2177();
            }
            if (this.field1026 == 180) {
                var6.method2177();
                var6.method2177();
            }
            if (this.field1026 == 270) {
                var6.method2177();
                var6.method2177();
                var6.method2177();
            }
        }
        return var6;
    }
}
