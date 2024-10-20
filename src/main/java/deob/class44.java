package deob;

@ObfuscatedName("ad")
public class class44 extends class204 {

    @ObfuscatedName("ad.i")
    public static class193 field1001 = new class193(64);

    @ObfuscatedName("ad.h")
    public static class193 field1007 = new class193(30);

    @ObfuscatedName("ad.q")
    public int field999;

    @ObfuscatedName("ad.u")
    public int field1000;

    @ObfuscatedName("ad.m")
    public int field998 = -1;

    @ObfuscatedName("ad.y")
    public short[] field1002;

    @ObfuscatedName("ad.p")
    public short[] field1005;

    @ObfuscatedName("ad.t")
    public short[] field1004;

    @ObfuscatedName("ad.g")
    public short[] field1011;

    @ObfuscatedName("ad.v")
    public int field1006 = 128;

    @ObfuscatedName("ad.l")
    public int field995 = 128;

    @ObfuscatedName("ad.e")
    public int field1003 = 0;

    @ObfuscatedName("ad.a")
    public int field1009 = 0;

    @ObfuscatedName("ad.w")
    public int field997 = 0;

    @ObfuscatedName("bg.o(II)Lad;")
    public static class44 method1455(int arg0) {
        class44 var1 = (class44) field1001.method3456((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1008.method3030(13, arg0);
        class44 var3 = new class44();
        var3.field999 = arg0;
        if (var2 != null) {
            var3.method845(new class119(var2));
        }
        field1001.method3451(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ad.f(Ldc;I)V")
    public void method845(class119 arg0) {
        while (true) {
            int var2 = arg0.method2290();
            if (var2 == 0) {
                return;
            }
            this.method856(arg0, var2);
        }
    }

    @ObfuscatedName("ad.i(Ldc;II)V")
    public void method856(class119 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1000 = arg0.method2292();
        } else if (arg1 == 2) {
            this.field998 = arg0.method2292();
        } else if (arg1 == 4) {
            this.field1006 = arg0.method2292();
        } else if (arg1 == 5) {
            this.field995 = arg0.method2292();
        } else if (arg1 == 6) {
            this.field1003 = arg0.method2292();
        } else if (arg1 == 7) {
            this.field1009 = arg0.method2290();
        } else if (arg1 == 8) {
            this.field997 = arg0.method2290();
        } else if (arg1 == 40) {
            int var3 = arg0.method2290();
            this.field1002 = new short[var3];
            this.field1005 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1002[var4] = (short) arg0.method2292();
                this.field1005[var4] = (short) arg0.method2292();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2290();
            this.field1004 = new short[var5];
            this.field1011 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1004[var6] = (short) arg0.method2292();
                this.field1011[var6] = (short) arg0.method2292();
            }
        }
    }

    @ObfuscatedName("ad.h(II)Ldm;")
    public final class105 method847(int arg0) {
        class105 var2 = (class105) field1007.method3456((long) this.field999);
        if (var2 == null) {
            class100 var3 = class100.method2000(Statics.field996, this.field1000, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field1002 != null) {
                for (int var4 = 0; var4 < this.field1002.length; var4++) {
                    var3.method2013(this.field1002[var4], this.field1005[var4]);
                }
            }
            if (this.field1004 != null) {
                for (int var5 = 0; var5 < this.field1004.length; var5++) {
                    var3.method2014(this.field1004[var5], this.field1011[var5]);
                }
            }
            var2 = var3.method2036(this.field1009 + 64, this.field997 + 850, -30, -50, -30);
            field1007.method3451(var2, (long) this.field999);
        }
        class105 var6;
        if (this.field998 == -1 || arg0 == -1) {
            var6 = var2.method2091(true);
        } else {
            var6 = class43.method3081(this.field998).method811(var2, arg0);
        }
        if (this.field1006 != 128 || this.field995 != 128) {
            var6.method2161(this.field1006, this.field995, this.field1006);
        }
        if (this.field1003 != 0) {
            if (this.field1003 == 90) {
                var6.method2099();
            }
            if (this.field1003 == 180) {
                var6.method2099();
                var6.method2099();
            }
            if (this.field1003 == 270) {
                var6.method2099();
                var6.method2099();
                var6.method2099();
            }
        }
        return var6;
    }

    @ObfuscatedName("aa.q(I)V")
    public static void method712() {
        field1001.method3452();
        field1007.method3452();
    }
}
