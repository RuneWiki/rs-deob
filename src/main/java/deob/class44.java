package deob;

@ObfuscatedName("aj")
public class class44 extends class205 {

    @ObfuscatedName("aj.d")
    public static class194 field1015 = new class194(64);

    @ObfuscatedName("aj.c")
    public static class194 field1017 = new class194(30);

    @ObfuscatedName("aj.y")
    public int field1031;

    @ObfuscatedName("aj.k")
    public int field1019;

    @ObfuscatedName("aj.r")
    public int field1022 = -1;

    @ObfuscatedName("aj.p")
    public short[] field1021;

    @ObfuscatedName("aj.q")
    public short[] field1029;

    @ObfuscatedName("aj.m")
    public short[] field1032;

    @ObfuscatedName("aj.e")
    public short[] field1024;

    @ObfuscatedName("aj.x")
    public int field1018 = 128;

    @ObfuscatedName("aj.z")
    public int field1026 = 128;

    @ObfuscatedName("aj.i")
    public int field1027 = 0;

    @ObfuscatedName("aj.t")
    public int field1028 = 0;

    @ObfuscatedName("aj.n")
    public int field1023 = 0;

    @ObfuscatedName("ag.a(Lft;Lft;I)V")
    public static void method1029(class168 arg0, class168 arg1) {
        Statics.field2919 = arg0;
        Statics.field1025 = arg1;
    }

    @ObfuscatedName("v.w(IB)Laj;")
    public static class44 method688(int arg0) {
        class44 var1 = (class44) field1015.method3579((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2919.method3188(13, arg0);
        class44 var3 = new class44();
        var3.field1031 = arg0;
        if (var2 != null) {
            var3.method971(new class120(var2));
        }
        field1015.method3581(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aj.d(Ldx;I)V")
    public void method971(class120 arg0) {
        while (true) {
            int var2 = arg0.method2462();
            if (var2 == 0) {
                return;
            }
            this.method977(arg0, var2);
        }
    }

    @ObfuscatedName("aj.c(Ldx;II)V")
    public void method977(class120 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1019 = arg0.method2464();
        } else if (arg1 == 2) {
            this.field1022 = arg0.method2464();
        } else if (arg1 == 4) {
            this.field1018 = arg0.method2464();
        } else if (arg1 == 5) {
            this.field1026 = arg0.method2464();
        } else if (arg1 == 6) {
            this.field1027 = arg0.method2464();
        } else if (arg1 == 7) {
            this.field1028 = arg0.method2462();
        } else if (arg1 == 8) {
            this.field1023 = arg0.method2462();
        } else if (arg1 == 40) {
            int var3 = arg0.method2462();
            this.field1021 = new short[var3];
            this.field1029 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1021[var4] = (short) arg0.method2464();
                this.field1029[var4] = (short) arg0.method2464();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2462();
            this.field1032 = new short[var5];
            this.field1024 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1032[var6] = (short) arg0.method2464();
                this.field1024[var6] = (short) arg0.method2464();
            }
        }
    }

    @ObfuscatedName("aj.y(II)Ldr;")
    public final class106 method972(int arg0) {
        class106 var2 = (class106) field1017.method3579((long) this.field1031);
        if (var2 == null) {
            class101 var3 = class101.method2165(Statics.field1025, this.field1019, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field1021 != null) {
                for (int var4 = 0; var4 < this.field1021.length; var4++) {
                    var3.method2161(this.field1021[var4], this.field1029[var4]);
                }
            }
            if (this.field1032 != null) {
                for (int var5 = 0; var5 < this.field1032.length; var5++) {
                    var3.method2162(this.field1032[var5], this.field1024[var5]);
                }
            }
            var2 = var3.method2226(this.field1028 + 64, this.field1023 + 850, -30, -50, -30);
            field1017.method3581(var2, (long) this.field1031);
        }
        class106 var6;
        if (this.field1022 == -1 || arg0 == -1) {
            var6 = var2.method2248(true);
        } else {
            var6 = class43.method2137(this.field1022).method934(var2, arg0);
        }
        if (this.field1018 != 128 || this.field1026 != 128) {
            var6.method2261(this.field1018, this.field1026, this.field1018);
        }
        if (this.field1027 != 0) {
            if (this.field1027 == 90) {
                var6.method2256();
            }
            if (this.field1027 == 180) {
                var6.method2256();
                var6.method2256();
            }
            if (this.field1027 == 270) {
                var6.method2256();
                var6.method2256();
                var6.method2256();
            }
        }
        return var6;
    }

    @ObfuscatedName("ax.k(I)V")
    public static void method819() {
        field1015.method3582();
        field1017.method3582();
    }
}
