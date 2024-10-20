package deob;

@ObfuscatedName("aa")
public class class44 extends class204 {

    @ObfuscatedName("aa.v")
    public static class193 field1020 = new class193(64);

    @ObfuscatedName("aa.l")
    public static class193 field1017 = new class193(30);

    @ObfuscatedName("aa.y")
    public int field1018;

    @ObfuscatedName("aa.w")
    public int field1019;

    @ObfuscatedName("aa.u")
    public int field1016 = -1;

    @ObfuscatedName("aa.a")
    public short[] field1029;

    @ObfuscatedName("aa.e")
    public short[] field1026;

    @ObfuscatedName("aa.b")
    public short[] field1023;

    @ObfuscatedName("aa.o")
    public short[] field1024;

    @ObfuscatedName("aa.m")
    public int field1025 = 128;

    @ObfuscatedName("aa.x")
    public int field1031 = 128;

    @ObfuscatedName("aa.k")
    public int field1027 = 0;

    @ObfuscatedName("aa.n")
    public int field1028 = 0;

    @ObfuscatedName("aa.j")
    public int field1022 = 0;

    @ObfuscatedName("ap.d(IB)Laa;")
    public static class44 method723(int arg0) {
        class44 var1 = (class44) field1020.method3553((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1033.method3134(13, arg0);
        class44 var3 = new class44();
        var3.field1018 = arg0;
        if (var2 != null) {
            var3.method876(new class119(var2));
        }
        field1020.method3554(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aa.p(Ldf;I)V")
    public void method876(class119 arg0) {
        while (true) {
            int var2 = arg0.method2357();
            if (var2 == 0) {
                return;
            }
            this.method880(arg0, var2);
        }
    }

    @ObfuscatedName("aa.v(Ldf;II)V")
    public void method880(class119 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1019 = arg0.method2359();
        } else if (arg1 == 2) {
            this.field1016 = arg0.method2359();
        } else if (arg1 == 4) {
            this.field1025 = arg0.method2359();
        } else if (arg1 == 5) {
            this.field1031 = arg0.method2359();
        } else if (arg1 == 6) {
            this.field1027 = arg0.method2359();
        } else if (arg1 == 7) {
            this.field1028 = arg0.method2357();
        } else if (arg1 == 8) {
            this.field1022 = arg0.method2357();
        } else if (arg1 == 40) {
            int var3 = arg0.method2357();
            this.field1029 = new short[var3];
            this.field1026 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1029[var4] = (short) arg0.method2359();
                this.field1026[var4] = (short) arg0.method2359();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2357();
            this.field1023 = new short[var5];
            this.field1024 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1023[var6] = (short) arg0.method2359();
                this.field1024[var6] = (short) arg0.method2359();
            }
        }
    }

    @ObfuscatedName("aa.l(II)Ldn;")
    public final class105 method878(int arg0) {
        class105 var2 = (class105) field1017.method3553((long) this.field1018);
        if (var2 == null) {
            class100 var3 = class100.method2064(Statics.field1015, this.field1019, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field1029 != null) {
                for (int var4 = 0; var4 < this.field1029.length; var4++) {
                    var3.method2075(this.field1029[var4], this.field1026[var4]);
                }
            }
            if (this.field1023 != null) {
                for (int var5 = 0; var5 < this.field1023.length; var5++) {
                    var3.method2076(this.field1023[var5], this.field1024[var5]);
                }
            }
            var2 = var3.method2083(this.field1028 + 64, this.field1022 + 850, -30, -50, -30);
            field1017.method3554(var2, (long) this.field1018);
        }
        class105 var6;
        if (this.field1016 == -1 || arg0 == -1) {
            var6 = var2.method2155(true);
        } else {
            var6 = class43.method578(this.field1016).method845(var2, arg0);
        }
        if (this.field1025 != 128 || this.field1031 != 128) {
            var6.method2168(this.field1025, this.field1031, this.field1025);
        }
        if (this.field1027 != 0) {
            if (this.field1027 == 90) {
                var6.method2186();
            }
            if (this.field1027 == 180) {
                var6.method2186();
                var6.method2186();
            }
            if (this.field1027 == 270) {
                var6.method2186();
                var6.method2186();
                var6.method2186();
            }
        }
        return var6;
    }

    @ObfuscatedName("ag.y(I)V")
    public static void method986() {
        field1020.method3556();
        field1017.method3556();
    }
}
