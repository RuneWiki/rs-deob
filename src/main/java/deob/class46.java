package deob;

@ObfuscatedName("ay")
public class class46 extends class208 {

    @ObfuscatedName("ay.e")
    public static class197 field1030 = new class197(64);

    @ObfuscatedName("ay.g")
    public static class197 field1031 = new class197(30);

    @ObfuscatedName("ay.n")
    public int field1028;

    @ObfuscatedName("ay.u")
    public int field1033;

    @ObfuscatedName("ay.d")
    public int field1034 = -1;

    @ObfuscatedName("ay.l")
    public short[] field1045;

    @ObfuscatedName("ay.m")
    public short[] field1042;

    @ObfuscatedName("ay.j")
    public short[] field1037;

    @ObfuscatedName("ay.y")
    public short[] field1038;

    @ObfuscatedName("ay.s")
    public int field1043 = 128;

    @ObfuscatedName("ay.p")
    public int field1040 = 128;

    @ObfuscatedName("ay.v")
    public int field1041 = 0;

    @ObfuscatedName("ay.r")
    public int field1035 = 0;

    @ObfuscatedName("ay.c")
    public int field1036 = 0;

    @ObfuscatedName("aa.i(II)Lay;")
    public static class46 method895(int arg0) {
        class46 var1 = (class46) field1030.method3541((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1039.method3086(13, arg0);
        class46 var3 = new class46();
        var3.field1028 = arg0;
        if (var2 != null) {
            var3.method899(new class123(var2));
        }
        field1030.method3532(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ay.h(Ldn;B)V")
    public void method899(class123 arg0) {
        while (true) {
            int var2 = arg0.method2404();
            if (var2 == 0) {
                return;
            }
            this.method900(arg0, var2);
        }
    }

    @ObfuscatedName("ay.e(Ldn;II)V")
    public void method900(class123 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1033 = arg0.method2406();
        } else if (arg1 == 2) {
            this.field1034 = arg0.method2406();
        } else if (arg1 == 4) {
            this.field1043 = arg0.method2406();
        } else if (arg1 == 5) {
            this.field1040 = arg0.method2406();
        } else if (arg1 == 6) {
            this.field1041 = arg0.method2406();
        } else if (arg1 == 7) {
            this.field1035 = arg0.method2404();
        } else if (arg1 == 8) {
            this.field1036 = arg0.method2404();
        } else if (arg1 == 40) {
            int var3 = arg0.method2404();
            this.field1045 = new short[var3];
            this.field1042 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1045[var4] = (short) arg0.method2406();
                this.field1042[var4] = (short) arg0.method2406();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2404();
            this.field1037 = new short[var5];
            this.field1038 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1037[var6] = (short) arg0.method2406();
                this.field1038[var6] = (short) arg0.method2406();
            }
        }
    }

    @ObfuscatedName("ay.g(II)Ldo;")
    public final class109 method901(int arg0) {
        class109 var2 = (class109) field1031.method3541((long) this.field1028);
        if (var2 == null) {
            class104 var3 = class104.method2115(Statics.field1032, this.field1033, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field1045 != null) {
                for (int var4 = 0; var4 < this.field1045.length; var4++) {
                    var3.method2185(this.field1045[var4], this.field1042[var4]);
                }
            }
            if (this.field1037 != null) {
                for (int var5 = 0; var5 < this.field1037.length; var5++) {
                    var3.method2128(this.field1037[var5], this.field1038[var5]);
                }
            }
            var2 = var3.method2135(this.field1035 + 64, this.field1036 + 850, -30, -50, -30);
            field1031.method3532(var2, (long) this.field1028);
        }
        class109 var6;
        if (this.field1034 == -1 || arg0 == -1) {
            var6 = var2.method2252(true);
        } else {
            var6 = class45.method3523(this.field1034).method882(var2, arg0);
        }
        if (this.field1043 != 128 || this.field1040 != 128) {
            var6.method2215(this.field1043, this.field1040, this.field1043);
        }
        if (this.field1041 != 0) {
            if (this.field1041 == 90) {
                var6.method2210();
            }
            if (this.field1041 == 180) {
                var6.method2210();
                var6.method2210();
            }
            if (this.field1041 == 270) {
                var6.method2210();
                var6.method2210();
                var6.method2210();
            }
        }
        return var6;
    }
}
