package deob;

@ObfuscatedName("ao")
public class class46 extends class208 {

    @ObfuscatedName("ao.e")
    public static class197 field1028 = new class197(64);

    @ObfuscatedName("ao.o")
    public static class197 field1033 = new class197(30);

    @ObfuscatedName("ao.g")
    public int field1030;

    @ObfuscatedName("ao.l")
    public int field1031;

    @ObfuscatedName("ao.j")
    public int field1029 = -1;

    @ObfuscatedName("ao.r")
    public short[] field1038;

    @ObfuscatedName("ao.x")
    public short[] field1034;

    @ObfuscatedName("ao.k")
    public short[] field1035;

    @ObfuscatedName("ao.v")
    public short[] field1032;

    @ObfuscatedName("ao.h")
    public int field1044 = 128;

    @ObfuscatedName("ao.u")
    public int field1026 = 128;

    @ObfuscatedName("ao.y")
    public int field1039 = 0;

    @ObfuscatedName("ao.p")
    public int field1040 = 0;

    @ObfuscatedName("ao.s")
    public int field1036 = 0;

    @ObfuscatedName("eo.m(Lfa;Lfa;I)V")
    public static void method2768(class171 arg0, class171 arg1) {
        Statics.field1041 = arg0;
        Statics.field1027 = arg1;
    }

    @ObfuscatedName("ff.w(II)Lao;")
    public static class46 method3219(int arg0) {
        class46 var1 = (class46) field1028.method3556((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1041.method3086(13, arg0);
        class46 var3 = new class46();
        var3.field1030 = arg0;
        if (var2 != null) {
            var3.method906(new class123(var2));
        }
        field1028.method3562(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ao.e(Ldj;B)V")
    public void method906(class123 arg0) {
        while (true) {
            int var2 = arg0.method2398();
            if (var2 == 0) {
                return;
            }
            this.method907(arg0, var2);
        }
    }

    @ObfuscatedName("ao.o(Ldj;II)V")
    public void method907(class123 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1031 = arg0.method2548();
        } else if (arg1 == 2) {
            this.field1029 = arg0.method2548();
        } else if (arg1 == 4) {
            this.field1044 = arg0.method2548();
        } else if (arg1 == 5) {
            this.field1026 = arg0.method2548();
        } else if (arg1 == 6) {
            this.field1039 = arg0.method2548();
        } else if (arg1 == 7) {
            this.field1040 = arg0.method2398();
        } else if (arg1 == 8) {
            this.field1036 = arg0.method2398();
        } else if (arg1 == 40) {
            int var3 = arg0.method2398();
            this.field1038 = new short[var3];
            this.field1034 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1038[var4] = (short) arg0.method2548();
                this.field1034[var4] = (short) arg0.method2548();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2398();
            this.field1035 = new short[var5];
            this.field1032 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1035[var6] = (short) arg0.method2548();
                this.field1032[var6] = (short) arg0.method2548();
            }
        }
    }

    @ObfuscatedName("ao.g(IB)Ldg;")
    public final class109 method908(int arg0) {
        class109 var2 = (class109) field1033.method3556((long) this.field1030);
        if (var2 == null) {
            class104 var3 = class104.method2177(Statics.field1027, this.field1031, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field1038 != null) {
                for (int var4 = 0; var4 < this.field1038.length; var4++) {
                    var3.method2171(this.field1038[var4], this.field1034[var4]);
                }
            }
            if (this.field1035 != null) {
                for (int var5 = 0; var5 < this.field1035.length; var5++) {
                    var3.method2152(this.field1035[var5], this.field1032[var5]);
                }
            }
            var2 = var3.method2159(this.field1040 + 64, this.field1036 + 850, -30, -50, -30);
            field1033.method3562(var2, (long) this.field1030);
        }
        class109 var6;
        if (this.field1029 == -1 || arg0 == -1) {
            var6 = var2.method2223(true);
        } else {
            var6 = class45.method637(this.field1029).method878(var2, arg0);
        }
        if (this.field1044 != 128 || this.field1026 != 128) {
            var6.method2245(this.field1044, this.field1026, this.field1044);
        }
        if (this.field1039 != 0) {
            if (this.field1039 == 90) {
                var6.method2230();
            }
            if (this.field1039 == 180) {
                var6.method2230();
                var6.method2230();
            }
            if (this.field1039 == 270) {
                var6.method2230();
                var6.method2230();
                var6.method2230();
            }
        }
        return var6;
    }
}
