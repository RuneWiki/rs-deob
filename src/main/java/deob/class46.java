package deob;

@ObfuscatedName("au")
public class class46 extends class208 {

    @ObfuscatedName("au.n")
    public static class197 field1030 = new class197(64);

    @ObfuscatedName("au.t")
    public static class197 field1025 = new class197(30);

    @ObfuscatedName("au.v")
    public int field1018;

    @ObfuscatedName("au.b")
    public int field1014;

    @ObfuscatedName("au.m")
    public int field1024 = -1;

    @ObfuscatedName("au.k")
    public short[] field1021;

    @ObfuscatedName("au.c")
    public short[] field1029;

    @ObfuscatedName("au.w")
    public short[] field1023;

    @ObfuscatedName("au.l")
    public short[] field1019;

    @ObfuscatedName("au.h")
    public int field1016 = 128;

    @ObfuscatedName("au.i")
    public int field1026 = 128;

    @ObfuscatedName("au.u")
    public int field1027 = 0;

    @ObfuscatedName("au.x")
    public int field1028 = 0;

    @ObfuscatedName("au.d")
    public int field1020 = 0;

    @ObfuscatedName("ex.f(II)Lau;")
    public static class46 method2917(int arg0) {
        class46 var1 = (class46) field1030.method3569((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1017.method3107(13, arg0);
        class46 var3 = new class46();
        var3.field1018 = arg0;
        if (var2 != null) {
            var3.method904(new class123(var2));
        }
        field1030.method3571(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("au.e(Ldx;I)V")
    public void method904(class123 arg0) {
        while (true) {
            int var2 = arg0.method2522();
            if (var2 == 0) {
                return;
            }
            this.method903(arg0, var2);
        }
    }

    @ObfuscatedName("au.n(Ldx;IB)V")
    public void method903(class123 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1014 = arg0.method2401();
        } else if (arg1 == 2) {
            this.field1024 = arg0.method2401();
        } else if (arg1 == 4) {
            this.field1016 = arg0.method2401();
        } else if (arg1 == 5) {
            this.field1026 = arg0.method2401();
        } else if (arg1 == 6) {
            this.field1027 = arg0.method2401();
        } else if (arg1 == 7) {
            this.field1028 = arg0.method2522();
        } else if (arg1 == 8) {
            this.field1020 = arg0.method2522();
        } else if (arg1 == 40) {
            int var3 = arg0.method2522();
            this.field1021 = new short[var3];
            this.field1029 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1021[var4] = (short) arg0.method2401();
                this.field1029[var4] = (short) arg0.method2401();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2522();
            this.field1023 = new short[var5];
            this.field1019 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1023[var6] = (short) arg0.method2401();
                this.field1019[var6] = (short) arg0.method2401();
            }
        }
    }

    @ObfuscatedName("au.t(II)Ldg;")
    public final class109 method901(int arg0) {
        class109 var2 = (class109) field1025.method3569((long) this.field1018);
        if (var2 == null) {
            class104 var3 = class104.method2114(Statics.field1015, this.field1014, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field1021 != null) {
                for (int var4 = 0; var4 < this.field1021.length; var4++) {
                    var3.method2126(this.field1021[var4], this.field1029[var4]);
                }
            }
            if (this.field1023 != null) {
                for (int var5 = 0; var5 < this.field1023.length; var5++) {
                    var3.method2127(this.field1023[var5], this.field1019[var5]);
                }
            }
            var2 = var3.method2134(this.field1028 + 64, this.field1020 + 850, -30, -50, -30);
            field1025.method3571(var2, (long) this.field1018);
        }
        class109 var6;
        if (this.field1024 == -1 || arg0 == -1) {
            var6 = var2.method2195(true);
        } else {
            var6 = class45.method1289(this.field1024).method864(var2, arg0);
        }
        if (this.field1016 != 128 || this.field1026 != 128) {
            var6.method2211(this.field1016, this.field1026, this.field1016);
        }
        if (this.field1027 != 0) {
            if (this.field1027 == 90) {
                var6.method2206();
            }
            if (this.field1027 == 180) {
                var6.method2206();
                var6.method2206();
            }
            if (this.field1027 == 270) {
                var6.method2206();
                var6.method2206();
                var6.method2206();
            }
        }
        return var6;
    }

    @ObfuscatedName("fe.v(B)V")
    public static void method3289() {
        field1030.method3572();
        field1025.method3572();
    }
}
