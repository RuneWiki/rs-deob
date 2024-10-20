package deob;

@ObfuscatedName("aw")
public class class44 extends class205 {

    @ObfuscatedName("aw.p")
    public static class194 field1020 = new class194(64);

    @ObfuscatedName("aw.x")
    public static class194 field1006 = new class194(30);

    @ObfuscatedName("aw.d")
    public int field1016;

    @ObfuscatedName("aw.u")
    public int field1008;

    @ObfuscatedName("aw.o")
    public int field1009 = -1;

    @ObfuscatedName("aw.b")
    public short[] field1010;

    @ObfuscatedName("aw.k")
    public short[] field1011;

    @ObfuscatedName("aw.c")
    public short[] field1012;

    @ObfuscatedName("aw.l")
    public short[] field1015;

    @ObfuscatedName("aw.t")
    public int field1014 = 128;

    @ObfuscatedName("aw.i")
    public int field1013 = 128;

    @ObfuscatedName("aw.r")
    public int field1018 = 0;

    @ObfuscatedName("aw.m")
    public int field1017 = 0;

    @ObfuscatedName("aw.e")
    public int field1007 = 0;

    @ObfuscatedName("fq.s(II)Law;")
    public static class44 method3263(int arg0) {
        class44 var1 = (class44) field1020.method3484((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1003.method3014(13, arg0);
        class44 var3 = new class44();
        var3.field1016 = arg0;
        if (var2 != null) {
            var3.method874(new class120(var2));
        }
        field1020.method3486(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aw.j(Lds;B)V")
    public void method874(class120 arg0) {
        while (true) {
            int var2 = arg0.method2338();
            if (var2 == 0) {
                return;
            }
            this.method858(arg0, var2);
        }
    }

    @ObfuscatedName("aw.p(Lds;IB)V")
    public void method858(class120 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1008 = arg0.method2430();
        } else if (arg1 == 2) {
            this.field1009 = arg0.method2430();
        } else if (arg1 == 4) {
            this.field1014 = arg0.method2430();
        } else if (arg1 == 5) {
            this.field1013 = arg0.method2430();
        } else if (arg1 == 6) {
            this.field1018 = arg0.method2430();
        } else if (arg1 == 7) {
            this.field1017 = arg0.method2338();
        } else if (arg1 == 8) {
            this.field1007 = arg0.method2338();
        } else if (arg1 == 40) {
            int var3 = arg0.method2338();
            this.field1010 = new short[var3];
            this.field1011 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1010[var4] = (short) arg0.method2430();
                this.field1011[var4] = (short) arg0.method2430();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2338();
            this.field1012 = new short[var5];
            this.field1015 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1012[var6] = (short) arg0.method2430();
                this.field1015[var6] = (short) arg0.method2430();
            }
        }
    }

    @ObfuscatedName("aw.x(II)Ldh;")
    public final class106 method859(int arg0) {
        class106 var2 = (class106) field1006.method3484((long) this.field1016);
        if (var2 == null) {
            class101 var3 = class101.method2040(Statics.field1004, this.field1008, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field1010 != null) {
                for (int var4 = 0; var4 < this.field1010.length; var4++) {
                    var3.method2053(this.field1010[var4], this.field1011[var4]);
                }
            }
            if (this.field1012 != null) {
                for (int var5 = 0; var5 < this.field1012.length; var5++) {
                    var3.method2054(this.field1012[var5], this.field1015[var5]);
                }
            }
            var2 = var3.method2061(this.field1017 + 64, this.field1007 + 850, -30, -50, -30);
            field1006.method3486(var2, (long) this.field1016);
        }
        class106 var6;
        if (this.field1009 == -1 || arg0 == -1) {
            var6 = var2.method2143(true);
        } else {
            var6 = class43.method43(this.field1009).method823(var2, arg0);
        }
        if (this.field1014 != 128 || this.field1013 != 128) {
            var6.method2159(this.field1014, this.field1013, this.field1014);
        }
        if (this.field1018 != 0) {
            if (this.field1018 == 90) {
                var6.method2151();
            }
            if (this.field1018 == 180) {
                var6.method2151();
                var6.method2151();
            }
            if (this.field1018 == 270) {
                var6.method2151();
                var6.method2151();
                var6.method2151();
            }
        }
        return var6;
    }

    @ObfuscatedName("x.d(I)V")
    public static void method38() {
        field1020.method3491();
        field1006.method3491();
    }
}
