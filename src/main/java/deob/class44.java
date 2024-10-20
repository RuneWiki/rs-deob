package deob;

@ObfuscatedName("ae")
public class class44 extends class205 {

    @ObfuscatedName("ae.g")
    public static class194 field1006 = new class194(64);

    @ObfuscatedName("ae.h")
    public static class194 field1007 = new class194(30);

    @ObfuscatedName("ae.z")
    public int field1008;

    @ObfuscatedName("ae.r")
    public int field1009;

    @ObfuscatedName("ae.f")
    public int field1015 = -1;

    @ObfuscatedName("ae.s")
    public short[] field1011;

    @ObfuscatedName("ae.d")
    public short[] field1012;

    @ObfuscatedName("ae.l")
    public short[] field1013;

    @ObfuscatedName("ae.y")
    public short[] field1021;

    @ObfuscatedName("ae.p")
    public int field1022 = 128;

    @ObfuscatedName("ae.k")
    public int field1016 = 128;

    @ObfuscatedName("ae.o")
    public int field1005 = 0;

    @ObfuscatedName("ae.b")
    public int field1018 = 0;

    @ObfuscatedName("ae.j")
    public int field1010 = 0;

    @ObfuscatedName("do.t(Lfp;Lfp;I)V")
    public static void method2591(class168 arg0, class168 arg1) {
        Statics.field2929 = arg0;
        Statics.field1019 = arg1;
    }

    @ObfuscatedName("a.i(IB)Lae;")
    public static class44 method153(int arg0) {
        class44 var1 = (class44) field1006.method3453((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2929.method3002(13, arg0);
        class44 var3 = new class44();
        var3.field1008 = arg0;
        if (var2 != null) {
            var3.method854(new class120(var2));
        }
        field1006.method3461(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ae.g(Ldr;B)V")
    public void method854(class120 arg0) {
        while (true) {
            int var2 = arg0.method2334();
            if (var2 == 0) {
                return;
            }
            this.method850(arg0, var2);
        }
    }

    @ObfuscatedName("ae.h(Ldr;IB)V")
    public void method850(class120 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1009 = arg0.method2310();
        } else if (arg1 == 2) {
            this.field1015 = arg0.method2310();
        } else if (arg1 == 4) {
            this.field1022 = arg0.method2310();
        } else if (arg1 == 5) {
            this.field1016 = arg0.method2310();
        } else if (arg1 == 6) {
            this.field1005 = arg0.method2310();
        } else if (arg1 == 7) {
            this.field1018 = arg0.method2334();
        } else if (arg1 == 8) {
            this.field1010 = arg0.method2334();
        } else if (arg1 == 40) {
            int var3 = arg0.method2334();
            this.field1011 = new short[var3];
            this.field1012 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1011[var4] = (short) arg0.method2310();
                this.field1012[var4] = (short) arg0.method2310();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2334();
            this.field1013 = new short[var5];
            this.field1021 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1013[var6] = (short) arg0.method2310();
                this.field1021[var6] = (short) arg0.method2310();
            }
        }
    }

    @ObfuscatedName("ae.z(II)Ldk;")
    public final class106 method851(int arg0) {
        class106 var2 = (class106) field1007.method3453((long) this.field1008);
        if (var2 == null) {
            class101 var3 = class101.method2021(Statics.field1019, this.field1009, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field1011 != null) {
                for (int var4 = 0; var4 < this.field1011.length; var4++) {
                    var3.method2050(this.field1011[var4], this.field1012[var4]);
                }
            }
            if (this.field1013 != null) {
                for (int var5 = 0; var5 < this.field1013.length; var5++) {
                    var3.method2038(this.field1013[var5], this.field1021[var5]);
                }
            }
            var2 = var3.method2030(this.field1018 + 64, this.field1010 + 850, -30, -50, -30);
            field1007.method3461(var2, (long) this.field1008);
        }
        class106 var6;
        if (this.field1015 == -1 || arg0 == -1) {
            var6 = var2.method2144(true);
        } else {
            var6 = class43.method168(this.field1015).method822(var2, arg0);
        }
        if (this.field1022 != 128 || this.field1016 != 128) {
            var6.method2164(this.field1022, this.field1016, this.field1022);
        }
        if (this.field1005 != 0) {
            if (this.field1005 == 90) {
                var6.method2112();
            }
            if (this.field1005 == 180) {
                var6.method2112();
                var6.method2112();
            }
            if (this.field1005 == 270) {
                var6.method2112();
                var6.method2112();
                var6.method2112();
            }
        }
        return var6;
    }
}
