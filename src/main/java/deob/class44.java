package deob;

@ObfuscatedName("an")
public class class44 extends class204 {

    @ObfuscatedName("an.g")
    public static class193 field1004 = new class193(64);

    @ObfuscatedName("an.w")
    public static class193 field1007 = new class193(30);

    @ObfuscatedName("an.e")
    public int field1015;

    @ObfuscatedName("an.c")
    public int field1009;

    @ObfuscatedName("an.a")
    public int field1010 = -1;

    @ObfuscatedName("an.q")
    public short[] field1012;

    @ObfuscatedName("an.m")
    public short[] field1006;

    @ObfuscatedName("an.n")
    public short[] field1013;

    @ObfuscatedName("an.k")
    public short[] field1011;

    @ObfuscatedName("an.o")
    public int field1008 = 128;

    @ObfuscatedName("an.f")
    public int field1014 = 128;

    @ObfuscatedName("an.s")
    public int field1017 = 0;

    @ObfuscatedName("an.z")
    public int field1018 = 0;

    @ObfuscatedName("an.b")
    public int field1019 = 0;

    @ObfuscatedName("ho.d(II)Lan;")
    public static class44 method3639(int arg0) {
        class44 var1 = (class44) field1004.method3425((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1022.method3045(13, arg0);
        class44 var3 = new class44();
        var3.field1015 = arg0;
        if (var2 != null) {
            var3.method887(new class119(var2));
        }
        field1004.method3427(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("an.g(Ldd;I)V")
    public void method887(class119 arg0) {
        while (true) {
            int var2 = arg0.method2326();
            if (var2 == 0) {
                return;
            }
            this.method873(arg0, var2);
        }
    }

    @ObfuscatedName("an.w(Ldd;IB)V")
    public void method873(class119 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1009 = arg0.method2525();
        } else if (arg1 == 2) {
            this.field1010 = arg0.method2525();
        } else if (arg1 == 4) {
            this.field1008 = arg0.method2525();
        } else if (arg1 == 5) {
            this.field1014 = arg0.method2525();
        } else if (arg1 == 6) {
            this.field1017 = arg0.method2525();
        } else if (arg1 == 7) {
            this.field1018 = arg0.method2326();
        } else if (arg1 == 8) {
            this.field1019 = arg0.method2326();
        } else if (arg1 == 40) {
            int var3 = arg0.method2326();
            this.field1012 = new short[var3];
            this.field1006 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1012[var4] = (short) arg0.method2525();
                this.field1006[var4] = (short) arg0.method2525();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2326();
            this.field1013 = new short[var5];
            this.field1011 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1013[var6] = (short) arg0.method2525();
                this.field1011[var6] = (short) arg0.method2525();
            }
        }
    }

    @ObfuscatedName("an.e(II)Ldg;")
    public final class105 method874(int arg0) {
        class105 var2 = (class105) field1007.method3425((long) this.field1015);
        if (var2 == null) {
            class100 var3 = class100.method2031(Statics.field1005, this.field1009, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field1012 != null) {
                for (int var4 = 0; var4 < this.field1012.length; var4++) {
                    var3.method2089(this.field1012[var4], this.field1006[var4]);
                }
            }
            if (this.field1013 != null) {
                for (int var5 = 0; var5 < this.field1013.length; var5++) {
                    var3.method2044(this.field1013[var5], this.field1011[var5]);
                }
            }
            var2 = var3.method2051(this.field1018 + 64, this.field1019 + 850, -30, -50, -30);
            field1007.method3427(var2, (long) this.field1015);
        }
        class105 var6;
        if (this.field1010 == -1 || arg0 == -1) {
            var6 = var2.method2127(true);
        } else {
            var6 = class43.method750(this.field1010).method835(var2, arg0);
        }
        if (this.field1008 != 128 || this.field1014 != 128) {
            var6.method2139(this.field1008, this.field1014, this.field1008);
        }
        if (this.field1017 != 0) {
            if (this.field1017 == 90) {
                var6.method2135();
            }
            if (this.field1017 == 180) {
                var6.method2135();
                var6.method2135();
            }
            if (this.field1017 == 270) {
                var6.method2135();
                var6.method2135();
                var6.method2135();
            }
        }
        return var6;
    }
}
