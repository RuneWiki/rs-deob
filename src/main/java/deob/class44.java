package deob;

@ObfuscatedName("ae")
public class class44 extends class204 {

    @ObfuscatedName("ae.r")
    public static class193 field1019 = new class193(64);

    @ObfuscatedName("ae.n")
    public static class193 field1003 = new class193(30);

    @ObfuscatedName("ae.x")
    public int field1007;

    @ObfuscatedName("ae.q")
    public int field1011;

    @ObfuscatedName("ae.h")
    public int field1009 = -1;

    @ObfuscatedName("ae.d")
    public short[] field1010;

    @ObfuscatedName("ae.c")
    public short[] field1008;

    @ObfuscatedName("ae.y")
    public short[] field1012;

    @ObfuscatedName("ae.m")
    public short[] field1013;

    @ObfuscatedName("ae.e")
    public int field1005 = 128;

    @ObfuscatedName("ae.z")
    public int field1015 = 128;

    @ObfuscatedName("ae.t")
    public int field1016 = 0;

    @ObfuscatedName("ae.b")
    public int field1017 = 0;

    @ObfuscatedName("ae.l")
    public int field1018 = 0;

    @ObfuscatedName("eq.i(Lfe;Lfe;B)V")
    public static void method2947(class167 arg0, class167 arg1) {
        Statics.field1014 = arg0;
        Statics.field1004 = arg1;
    }

    @ObfuscatedName("dh.v(II)Lae;")
    public static class44 method2267(int arg0) {
        class44 var1 = (class44) field1019.method3464((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1014.method3035(13, arg0);
        class44 var3 = new class44();
        var3.field1007 = arg0;
        if (var2 != null) {
            var3.method899(new class119(var2));
        }
        field1019.method3466(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ae.r(Ldx;S)V")
    public void method899(class119 arg0) {
        while (true) {
            int var2 = arg0.method2380();
            if (var2 == 0) {
                return;
            }
            this.method898(arg0, var2);
        }
    }

    @ObfuscatedName("ae.n(Ldx;II)V")
    public void method898(class119 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1011 = arg0.method2347();
        } else if (arg1 == 2) {
            this.field1009 = arg0.method2347();
        } else if (arg1 == 4) {
            this.field1005 = arg0.method2347();
        } else if (arg1 == 5) {
            this.field1015 = arg0.method2347();
        } else if (arg1 == 6) {
            this.field1016 = arg0.method2347();
        } else if (arg1 == 7) {
            this.field1017 = arg0.method2380();
        } else if (arg1 == 8) {
            this.field1018 = arg0.method2380();
        } else if (arg1 == 40) {
            int var3 = arg0.method2380();
            this.field1010 = new short[var3];
            this.field1008 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1010[var4] = (short) arg0.method2347();
                this.field1008[var4] = (short) arg0.method2347();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2380();
            this.field1012 = new short[var5];
            this.field1013 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1012[var6] = (short) arg0.method2347();
                this.field1013[var6] = (short) arg0.method2347();
            }
        }
    }

    @ObfuscatedName("ae.x(II)Ldj;")
    public final class105 method900(int arg0) {
        class105 var2 = (class105) field1003.method3464((long) this.field1007);
        if (var2 == null) {
            class100 var3 = class100.method2042(Statics.field1004, this.field1011, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field1010 != null) {
                for (int var4 = 0; var4 < this.field1010.length; var4++) {
                    var3.method2054(this.field1010[var4], this.field1008[var4]);
                }
            }
            if (this.field1012 != null) {
                for (int var5 = 0; var5 < this.field1012.length; var5++) {
                    var3.method2055(this.field1012[var5], this.field1013[var5]);
                }
            }
            var2 = var3.method2062(this.field1017 + 64, this.field1018 + 850, -30, -50, -30);
            field1003.method3466(var2, (long) this.field1007);
        }
        class105 var6;
        if (this.field1009 == -1 || arg0 == -1) {
            var6 = var2.method2151(true);
        } else {
            var6 = class43.method2299(this.field1009).method890(var2, arg0);
        }
        if (this.field1005 != 128 || this.field1015 != 128) {
            var6.method2174(this.field1005, this.field1015, this.field1005);
        }
        if (this.field1016 != 0) {
            if (this.field1016 == 90) {
                var6.method2158();
            }
            if (this.field1016 == 180) {
                var6.method2158();
                var6.method2158();
            }
            if (this.field1016 == 270) {
                var6.method2158();
                var6.method2158();
                var6.method2158();
            }
        }
        return var6;
    }
}
