package deob;

@ObfuscatedName("ar")
public class class44 extends class204 {

    @ObfuscatedName("ar.u")
    public static class193 field1001 = new class193(64);

    @ObfuscatedName("ar.b")
    public static class193 field1002 = new class193(30);

    @ObfuscatedName("ar.p")
    public int field1000;

    @ObfuscatedName("ar.s")
    public int field1003;

    @ObfuscatedName("ar.y")
    public int field1004 = -1;

    @ObfuscatedName("ar.t")
    public short[] field1006;

    @ObfuscatedName("ar.w")
    public short[] field1007;

    @ObfuscatedName("ar.h")
    public short[] field1008;

    @ObfuscatedName("ar.d")
    public short[] field1017;

    @ObfuscatedName("ar.l")
    public int field1010 = 128;

    @ObfuscatedName("ar.n")
    public int field1011 = 128;

    @ObfuscatedName("ar.q")
    public int field1012 = 0;

    @ObfuscatedName("ar.f")
    public int field1005 = 0;

    @ObfuscatedName("ar.v")
    public int field1014 = 0;

    @ObfuscatedName("fz.o(IB)Lar;")
    public static class44 method3260(int arg0) {
        class44 var1 = (class44) field1001.method3510((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1018.method3057(13, arg0);
        class44 var3 = new class44();
        var3.field1000 = arg0;
        if (var2 != null) {
            var3.method881(new class119(var2));
        }
        field1001.method3512(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ar.e(Ldi;I)V")
    public void method881(class119 arg0) {
        while (true) {
            int var2 = arg0.method2427();
            if (var2 == 0) {
                return;
            }
            this.method882(arg0, var2);
        }
    }

    @ObfuscatedName("ar.u(Ldi;II)V")
    public void method882(class119 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1003 = arg0.method2339();
        } else if (arg1 == 2) {
            this.field1004 = arg0.method2339();
        } else if (arg1 == 4) {
            this.field1010 = arg0.method2339();
        } else if (arg1 == 5) {
            this.field1011 = arg0.method2339();
        } else if (arg1 == 6) {
            this.field1012 = arg0.method2339();
        } else if (arg1 == 7) {
            this.field1005 = arg0.method2427();
        } else if (arg1 == 8) {
            this.field1014 = arg0.method2427();
        } else if (arg1 == 40) {
            int var3 = arg0.method2427();
            this.field1006 = new short[var3];
            this.field1007 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1006[var4] = (short) arg0.method2339();
                this.field1007[var4] = (short) arg0.method2339();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2427();
            this.field1008 = new short[var5];
            this.field1017 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1008[var6] = (short) arg0.method2339();
                this.field1017[var6] = (short) arg0.method2339();
            }
        }
    }

    @ObfuscatedName("ar.b(II)Ldk;")
    public final class105 method883(int arg0) {
        class105 var2 = (class105) field1002.method3510((long) this.field1000);
        if (var2 == null) {
            class100 var3 = class100.method2040(Statics.field2910, this.field1003, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field1006 != null) {
                for (int var4 = 0; var4 < this.field1006.length; var4++) {
                    var3.method2062(this.field1006[var4], this.field1007[var4]);
                }
            }
            if (this.field1008 != null) {
                for (int var5 = 0; var5 < this.field1008.length; var5++) {
                    var3.method2052(this.field1008[var5], this.field1017[var5]);
                }
            }
            var2 = var3.method2059(this.field1005 + 64, this.field1014 + 850, -30, -50, -30);
            field1002.method3512(var2, (long) this.field1000);
        }
        class105 var6;
        if (this.field1004 == -1 || arg0 == -1) {
            var6 = var2.method2123(true);
        } else {
            var6 = class43.method774(this.field1004).method847(var2, arg0);
        }
        if (this.field1010 != 128 || this.field1011 != 128) {
            var6.method2136(this.field1010, this.field1011, this.field1010);
        }
        if (this.field1012 != 0) {
            if (this.field1012 == 90) {
                var6.method2175();
            }
            if (this.field1012 == 180) {
                var6.method2175();
                var6.method2175();
            }
            if (this.field1012 == 270) {
                var6.method2175();
                var6.method2175();
                var6.method2175();
            }
        }
        return var6;
    }
}
