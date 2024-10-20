package deob;

@ObfuscatedName("av")
public class class44 extends class204 {

    @ObfuscatedName("av.f")
    public static class193 field1009 = new class193(64);

    @ObfuscatedName("av.s")
    public static class193 field1021 = new class193(30);

    @ObfuscatedName("av.y")
    public int field1011;

    @ObfuscatedName("av.e")
    public int field1007;

    @ObfuscatedName("av.g")
    public int field1013 = -1;

    @ObfuscatedName("av.m")
    public short[] field1014;

    @ObfuscatedName("av.j")
    public short[] field1018;

    @ObfuscatedName("av.n")
    public short[] field1016;

    @ObfuscatedName("av.l")
    public short[] field1010;

    @ObfuscatedName("av.h")
    public int field1008 = 128;

    @ObfuscatedName("av.i")
    public int field1019 = 128;

    @ObfuscatedName("av.v")
    public int field1017 = 0;

    @ObfuscatedName("av.z")
    public int field1020 = 0;

    @ObfuscatedName("av.u")
    public int field1022 = 0;

    @ObfuscatedName("fa.a(Lfz;Lfz;B)V")
    public static void method3216(class167 arg0, class167 arg1) {
        Statics.field1012 = arg0;
        Statics.field1015 = arg1;
    }

    @ObfuscatedName("k.r(IB)Lav;")
    public static class44 method588(int arg0) {
        class44 var1 = (class44) field1009.method3507((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1012.method3025(13, arg0);
        class44 var3 = new class44();
        var3.field1011 = arg0;
        if (var2 != null) {
            var3.method882(new class119(var2));
        }
        field1009.method3509(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("av.f(Lds;I)V")
    public void method882(class119 arg0) {
        while (true) {
            int var2 = arg0.method2412();
            if (var2 == 0) {
                return;
            }
            this.method883(arg0, var2);
        }
    }

    @ObfuscatedName("av.s(Lds;II)V")
    public void method883(class119 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1007 = arg0.method2347();
        } else if (arg1 == 2) {
            this.field1013 = arg0.method2347();
        } else if (arg1 == 4) {
            this.field1008 = arg0.method2347();
        } else if (arg1 == 5) {
            this.field1019 = arg0.method2347();
        } else if (arg1 == 6) {
            this.field1017 = arg0.method2347();
        } else if (arg1 == 7) {
            this.field1020 = arg0.method2412();
        } else if (arg1 == 8) {
            this.field1022 = arg0.method2412();
        } else if (arg1 == 40) {
            int var3 = arg0.method2412();
            this.field1014 = new short[var3];
            this.field1018 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1014[var4] = (short) arg0.method2347();
                this.field1018[var4] = (short) arg0.method2347();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2412();
            this.field1016 = new short[var5];
            this.field1010 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1016[var6] = (short) arg0.method2347();
                this.field1010[var6] = (short) arg0.method2347();
            }
        }
    }

    @ObfuscatedName("av.y(IB)Ldn;")
    public final class105 method884(int arg0) {
        class105 var2 = (class105) field1021.method3507((long) this.field1011);
        if (var2 == null) {
            class100 var3 = class100.method2066(Statics.field1015, this.field1007, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field1014 != null) {
                for (int var4 = 0; var4 < this.field1014.length; var4++) {
                    var3.method2101(this.field1014[var4], this.field1018[var4]);
                }
            }
            if (this.field1016 != null) {
                for (int var5 = 0; var5 < this.field1016.length; var5++) {
                    var3.method2121(this.field1016[var5], this.field1010[var5]);
                }
            }
            var2 = var3.method2086(this.field1020 + 64, this.field1022 + 850, -30, -50, -30);
            field1021.method3509(var2, (long) this.field1011);
        }
        class105 var6;
        if (this.field1013 == -1 || arg0 == -1) {
            var6 = var2.method2155(true);
        } else {
            var6 = class43.method2701(this.field1013).method850(var2, arg0);
        }
        if (this.field1008 != 128 || this.field1019 != 128) {
            var6.method2167(this.field1008, this.field1019, this.field1008);
        }
        if (this.field1017 != 0) {
            if (this.field1017 == 90) {
                var6.method2162();
            }
            if (this.field1017 == 180) {
                var6.method2162();
                var6.method2162();
            }
            if (this.field1017 == 270) {
                var6.method2162();
                var6.method2162();
                var6.method2162();
            }
        }
        return var6;
    }
}
