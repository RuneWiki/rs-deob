package deob;

@ObfuscatedName("ac")
public class class44 extends class204 {

    @ObfuscatedName("ac.i")
    public static class193 field1013 = new class193(64);

    @ObfuscatedName("ac.q")
    public static class193 field1023 = new class193(30);

    @ObfuscatedName("ac.p")
    public int field1015;

    @ObfuscatedName("ac.c")
    public int field1019;

    @ObfuscatedName("ac.f")
    public int field1017 = -1;

    @ObfuscatedName("ac.y")
    public short[] field1025;

    @ObfuscatedName("ac.w")
    public short[] field1016;

    @ObfuscatedName("ac.l")
    public short[] field1020;

    @ObfuscatedName("ac.v")
    public short[] field1021;

    @ObfuscatedName("ac.k")
    public int field1022 = 128;

    @ObfuscatedName("ac.o")
    public int field1011 = 128;

    @ObfuscatedName("ac.u")
    public int field1024 = 0;

    @ObfuscatedName("ac.s")
    public int field1027 = 0;

    @ObfuscatedName("ac.g")
    public int field1026 = 0;

    @ObfuscatedName("ax.h(Lfv;Lfv;B)V")
    public static void method628(class167 arg0, class167 arg1) {
        Statics.field1018 = arg0;
        Statics.field1012 = arg1;
    }

    @ObfuscatedName("dh.m(IB)Lac;")
    public static class44 method2239(int arg0) {
        class44 var1 = (class44) field1013.method3472((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1018.method3051(13, arg0);
        class44 var3 = new class44();
        var3.field1015 = arg0;
        if (var2 != null) {
            var3.method856(new class119(var2));
        }
        field1013.method3474(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ac.i(Ldp;I)V")
    public void method856(class119 arg0) {
        while (true) {
            int var2 = arg0.method2320();
            if (var2 == 0) {
                return;
            }
            this.method857(arg0, var2);
        }
    }

    @ObfuscatedName("ac.q(Ldp;II)V")
    public void method857(class119 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1019 = arg0.method2322();
        } else if (arg1 == 2) {
            this.field1017 = arg0.method2322();
        } else if (arg1 == 4) {
            this.field1022 = arg0.method2322();
        } else if (arg1 == 5) {
            this.field1011 = arg0.method2322();
        } else if (arg1 == 6) {
            this.field1024 = arg0.method2322();
        } else if (arg1 == 7) {
            this.field1027 = arg0.method2320();
        } else if (arg1 == 8) {
            this.field1026 = arg0.method2320();
        } else if (arg1 == 40) {
            int var3 = arg0.method2320();
            this.field1025 = new short[var3];
            this.field1016 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1025[var4] = (short) arg0.method2322();
                this.field1016[var4] = (short) arg0.method2322();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2320();
            this.field1020 = new short[var5];
            this.field1021 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1020[var6] = (short) arg0.method2322();
                this.field1021[var6] = (short) arg0.method2322();
            }
        }
    }

    @ObfuscatedName("ac.p(II)Ldb;")
    public final class105 method870(int arg0) {
        class105 var2 = (class105) field1023.method3472((long) this.field1015);
        if (var2 == null) {
            class100 var3 = class100.method2081(Statics.field1012, this.field1019, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field1025 != null) {
                for (int var4 = 0; var4 < this.field1025.length; var4++) {
                    var3.method2098(this.field1025[var4], this.field1016[var4]);
                }
            }
            if (this.field1020 != null) {
                for (int var5 = 0; var5 < this.field1020.length; var5++) {
                    var3.method2038(this.field1020[var5], this.field1021[var5]);
                }
            }
            var2 = var3.method2067(this.field1027 + 64, this.field1026 + 850, -30, -50, -30);
            field1023.method3474(var2, (long) this.field1015);
        }
        class105 var6;
        if (this.field1017 == -1 || arg0 == -1) {
            var6 = var2.method2119(true);
        } else {
            var6 = class43.method2257(this.field1017).method828(var2, arg0);
        }
        if (this.field1022 != 128 || this.field1011 != 128) {
            var6.method2131(this.field1022, this.field1011, this.field1022);
        }
        if (this.field1024 != 0) {
            if (this.field1024 == 90) {
                var6.method2127();
            }
            if (this.field1024 == 180) {
                var6.method2127();
                var6.method2127();
            }
            if (this.field1024 == 270) {
                var6.method2127();
                var6.method2127();
                var6.method2127();
            }
        }
        return var6;
    }

    @ObfuscatedName("dt.c(I)V")
    public static void method2200() {
        field1013.method3483();
        field1023.method3483();
    }
}
