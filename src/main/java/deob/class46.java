package deob;

@ObfuscatedName("av")
public class class46 extends class208 {

    @ObfuscatedName("av.r")
    public static class197 field1036 = new class197(64);

    @ObfuscatedName("av.e")
    public static class197 field1037 = new class197(30);

    @ObfuscatedName("av.h")
    public int field1038;

    @ObfuscatedName("av.s")
    public int field1039;

    @ObfuscatedName("av.k")
    public int field1043 = -1;

    @ObfuscatedName("av.u")
    public short[] field1041;

    @ObfuscatedName("av.n")
    public short[] field1046;

    @ObfuscatedName("av.b")
    public short[] field1048;

    @ObfuscatedName("av.m")
    public short[] field1044;

    @ObfuscatedName("av.q")
    public int field1045 = 128;

    @ObfuscatedName("av.p")
    public int field1042 = 128;

    @ObfuscatedName("av.w")
    public int field1047 = 0;

    @ObfuscatedName("av.o")
    public int field1049 = 0;

    @ObfuscatedName("av.d")
    public int field1034 = 0;

    @ObfuscatedName("ay.l(Lfp;Lfp;I)V")
    public static void method777(class171 arg0, class171 arg1) {
        Statics.field1035 = arg0;
        Statics.field1040 = arg1;
    }

    @ObfuscatedName("dn.g(II)Lav;")
    public static class46 method2351(int arg0) {
        class46 var1 = (class46) field1036.method3653((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1035.method3210(13, arg0);
        class46 var3 = new class46();
        var3.field1038 = arg0;
        if (var2 != null) {
            var3.method926(new class123(var2));
        }
        field1036.method3655(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("av.r(Ldc;I)V")
    public void method926(class123 arg0) {
        while (true) {
            int var2 = arg0.method2490();
            if (var2 == 0) {
                return;
            }
            this.method935(arg0, var2);
        }
    }

    @ObfuscatedName("av.e(Ldc;IB)V")
    public void method935(class123 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1039 = arg0.method2492();
        } else if (arg1 == 2) {
            this.field1043 = arg0.method2492();
        } else if (arg1 == 4) {
            this.field1045 = arg0.method2492();
        } else if (arg1 == 5) {
            this.field1042 = arg0.method2492();
        } else if (arg1 == 6) {
            this.field1047 = arg0.method2492();
        } else if (arg1 == 7) {
            this.field1049 = arg0.method2490();
        } else if (arg1 == 8) {
            this.field1034 = arg0.method2490();
        } else if (arg1 == 40) {
            int var3 = arg0.method2490();
            this.field1041 = new short[var3];
            this.field1046 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1041[var4] = (short) arg0.method2492();
                this.field1046[var4] = (short) arg0.method2492();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2490();
            this.field1048 = new short[var5];
            this.field1044 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1048[var6] = (short) arg0.method2492();
                this.field1044[var6] = (short) arg0.method2492();
            }
        }
    }

    @ObfuscatedName("av.h(II)Ldv;")
    public final class109 method927(int arg0) {
        class109 var2 = (class109) field1037.method3653((long) this.field1038);
        if (var2 == null) {
            class104 var3 = class104.method2237(Statics.field1040, this.field1039, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field1041 != null) {
                for (int var4 = 0; var4 < this.field1041.length; var4++) {
                    var3.method2173(this.field1041[var4], this.field1046[var4]);
                }
            }
            if (this.field1048 != null) {
                for (int var5 = 0; var5 < this.field1048.length; var5++) {
                    var3.method2174(this.field1048[var5], this.field1044[var5]);
                }
            }
            var2 = var3.method2189(this.field1049 + 64, this.field1034 + 850, -30, -50, -30);
            field1037.method3655(var2, (long) this.field1038);
        }
        class109 var6;
        if (this.field1043 == -1 || arg0 == -1) {
            var6 = var2.method2268(true);
        } else {
            var6 = class45.method578(this.field1043).method882(var2, arg0);
        }
        if (this.field1045 != 128 || this.field1042 != 128) {
            var6.method2272(this.field1045, this.field1042, this.field1045);
        }
        if (this.field1047 != 0) {
            if (this.field1047 == 90) {
                var6.method2320();
            }
            if (this.field1047 == 180) {
                var6.method2320();
                var6.method2320();
            }
            if (this.field1047 == 270) {
                var6.method2320();
                var6.method2320();
                var6.method2320();
            }
        }
        return var6;
    }
}
