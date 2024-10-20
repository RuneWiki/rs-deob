package deob;

@ObfuscatedName("az")
public class class46 extends class208 {

    @ObfuscatedName("az.v")
    public static class197 field1048 = new class197(64);

    @ObfuscatedName("az.r")
    public static class197 field1033 = new class197(30);

    @ObfuscatedName("az.z")
    public int field1034;

    @ObfuscatedName("az.t")
    public int field1031;

    @ObfuscatedName("az.n")
    public int field1035 = -1;

    @ObfuscatedName("az.i")
    public short[] field1037;

    @ObfuscatedName("az.g")
    public short[] field1038;

    @ObfuscatedName("az.m")
    public short[] field1039;

    @ObfuscatedName("az.k")
    public short[] field1046;

    @ObfuscatedName("az.x")
    public int field1040 = 128;

    @ObfuscatedName("az.u")
    public int field1042 = 128;

    @ObfuscatedName("az.j")
    public int field1043 = 0;

    @ObfuscatedName("az.q")
    public int field1044 = 0;

    @ObfuscatedName("az.w")
    public int field1045 = 0;

    @ObfuscatedName("dr.a(Lfu;Lfu;I)V")
    public static void method2332(class171 arg0, class171 arg1) {
        Statics.field1032 = arg0;
        Statics.field3217 = arg1;
    }

    @ObfuscatedName("ae.d(II)Laz;")
    public static class46 method1007(int arg0) {
        class46 var1 = (class46) field1048.method3544((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1032.method3117(13, arg0);
        class46 var3 = new class46();
        var3.field1034 = arg0;
        if (var2 != null) {
            var3.method914(new class123(var2));
        }
        field1048.method3546(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("az.v(Ldb;S)V")
    public void method914(class123 arg0) {
        while (true) {
            int var2 = arg0.method2395();
            if (var2 == 0) {
                return;
            }
            this.method913(arg0, var2);
        }
    }

    @ObfuscatedName("az.r(Ldb;IB)V")
    public void method913(class123 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1031 = arg0.method2584();
        } else if (arg1 == 2) {
            this.field1035 = arg0.method2584();
        } else if (arg1 == 4) {
            this.field1040 = arg0.method2584();
        } else if (arg1 == 5) {
            this.field1042 = arg0.method2584();
        } else if (arg1 == 6) {
            this.field1043 = arg0.method2584();
        } else if (arg1 == 7) {
            this.field1044 = arg0.method2395();
        } else if (arg1 == 8) {
            this.field1045 = arg0.method2395();
        } else if (arg1 == 40) {
            int var3 = arg0.method2395();
            this.field1037 = new short[var3];
            this.field1038 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1037[var4] = (short) arg0.method2584();
                this.field1038[var4] = (short) arg0.method2584();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2395();
            this.field1039 = new short[var5];
            this.field1046 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1039[var6] = (short) arg0.method2584();
                this.field1046[var6] = (short) arg0.method2584();
            }
        }
    }

    @ObfuscatedName("az.z(II)Ldp;")
    public final class109 method918(int arg0) {
        class109 var2 = (class109) field1033.method3544((long) this.field1034);
        if (var2 == null) {
            class104 var3 = class104.method2159(Statics.field3217, this.field1031, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field1037 != null) {
                for (int var4 = 0; var4 < this.field1037.length; var4++) {
                    var3.method2114(this.field1037[var4], this.field1038[var4]);
                }
            }
            if (this.field1039 != null) {
                for (int var5 = 0; var5 < this.field1039.length; var5++) {
                    var3.method2115(this.field1039[var5], this.field1046[var5]);
                }
            }
            var2 = var3.method2122(this.field1044 + 64, this.field1045 + 850, -30, -50, -30);
            field1033.method3546(var2, (long) this.field1034);
        }
        class109 var6;
        if (this.field1035 == -1 || arg0 == -1) {
            var6 = var2.method2226(true);
        } else {
            var6 = class45.method185(this.field1035).method891(var2, arg0);
        }
        if (this.field1040 != 128 || this.field1042 != 128) {
            var6.method2210(this.field1040, this.field1042, this.field1040);
        }
        if (this.field1043 != 0) {
            if (this.field1043 == 90) {
                var6.method2205();
            }
            if (this.field1043 == 180) {
                var6.method2205();
                var6.method2205();
            }
            if (this.field1043 == 270) {
                var6.method2205();
                var6.method2205();
                var6.method2205();
            }
        }
        return var6;
    }
}
