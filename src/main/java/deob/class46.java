package deob;

@ObfuscatedName("ar")
public class class46 extends class208 {

    @ObfuscatedName("ar.j")
    public static class197 field1016 = new class197(64);

    @ObfuscatedName("ar.z")
    public static class197 field1030 = new class197(30);

    @ObfuscatedName("ar.i")
    public int field1024;

    @ObfuscatedName("ar.b")
    public int field1019;

    @ObfuscatedName("ar.l")
    public int field1018 = -1;

    @ObfuscatedName("ar.m")
    public short[] field1021;

    @ObfuscatedName("ar.p")
    public short[] field1022;

    @ObfuscatedName("ar.f")
    public short[] field1025;

    @ObfuscatedName("ar.d")
    public short[] field1015;

    @ObfuscatedName("ar.v")
    public int field1017 = 128;

    @ObfuscatedName("ar.q")
    public int field1026 = 128;

    @ObfuscatedName("ar.t")
    public int field1027 = 0;

    @ObfuscatedName("ar.g")
    public int field1023 = 0;

    @ObfuscatedName("ar.s")
    public int field1029 = 0;

    @ObfuscatedName("bm.x(Lfp;Lfp;I)V")
    public static void method1514(class171 arg0, class171 arg1) {
        Statics.field1020 = arg0;
        Statics.field1014 = arg1;
    }

    @ObfuscatedName("cl.r(II)Lar;")
    public static class46 method1823(int arg0) {
        class46 var1 = (class46) field1016.method3533((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1020.method3079(13, arg0);
        class46 var3 = new class46();
        var3.field1024 = arg0;
        if (var2 != null) {
            var3.method873(new class123(var2));
        }
        field1016.method3535(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ar.j(Ldp;I)V")
    public void method873(class123 arg0) {
        while (true) {
            int var2 = arg0.method2408();
            if (var2 == 0) {
                return;
            }
            this.method874(arg0, var2);
        }
    }

    @ObfuscatedName("ar.z(Ldp;II)V")
    public void method874(class123 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1019 = arg0.method2403();
        } else if (arg1 == 2) {
            this.field1018 = arg0.method2403();
        } else if (arg1 == 4) {
            this.field1017 = arg0.method2403();
        } else if (arg1 == 5) {
            this.field1026 = arg0.method2403();
        } else if (arg1 == 6) {
            this.field1027 = arg0.method2403();
        } else if (arg1 == 7) {
            this.field1023 = arg0.method2408();
        } else if (arg1 == 8) {
            this.field1029 = arg0.method2408();
        } else if (arg1 == 40) {
            int var3 = arg0.method2408();
            this.field1021 = new short[var3];
            this.field1022 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1021[var4] = (short) arg0.method2403();
                this.field1022[var4] = (short) arg0.method2403();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2408();
            this.field1025 = new short[var5];
            this.field1015 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1025[var6] = (short) arg0.method2403();
                this.field1015[var6] = (short) arg0.method2403();
            }
        }
    }

    @ObfuscatedName("ar.i(II)Ldj;")
    public final class109 method875(int arg0) {
        class109 var2 = (class109) field1030.method3533((long) this.field1024);
        if (var2 == null) {
            class104 var3 = class104.method2122(Statics.field1014, this.field1019, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field1021 != null) {
                for (int var4 = 0; var4 < this.field1021.length; var4++) {
                    var3.method2197(this.field1021[var4], this.field1022[var4]);
                }
            }
            if (this.field1025 != null) {
                for (int var5 = 0; var5 < this.field1025.length; var5++) {
                    var3.method2136(this.field1025[var5], this.field1015[var5]);
                }
            }
            var2 = var3.method2150(this.field1023 + 64, this.field1029 + 850, -30, -50, -30);
            field1030.method3535(var2, (long) this.field1024);
        }
        class109 var6;
        if (this.field1018 == -1 || arg0 == -1) {
            var6 = var2.method2218(true);
        } else {
            var6 = class45.method2337(this.field1018).method835(var2, arg0);
        }
        if (this.field1017 != 128 || this.field1026 != 128) {
            var6.method2234(this.field1017, this.field1026, this.field1017);
        }
        if (this.field1027 != 0) {
            if (this.field1027 == 90) {
                var6.method2288();
            }
            if (this.field1027 == 180) {
                var6.method2288();
                var6.method2288();
            }
            if (this.field1027 == 270) {
                var6.method2288();
                var6.method2288();
                var6.method2288();
            }
        }
        return var6;
    }
}
