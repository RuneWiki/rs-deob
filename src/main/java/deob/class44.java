package deob;

@ObfuscatedName("ax")
public class class44 extends class204 {

    @ObfuscatedName("ax.c")
    public static class193 field1004 = new class193(64);

    @ObfuscatedName("ax.l")
    public static class193 field1010 = new class193(30);

    @ObfuscatedName("ax.r")
    public int field1006;

    @ObfuscatedName("ax.u")
    public int field1019;

    @ObfuscatedName("ax.j")
    public int field1008 = -1;

    @ObfuscatedName("ax.w")
    public short[] field1005;

    @ObfuscatedName("ax.y")
    public short[] field1007;

    @ObfuscatedName("ax.o")
    public short[] field1011;

    @ObfuscatedName("ax.h")
    public short[] field1012;

    @ObfuscatedName("ax.e")
    public int field1013 = 128;

    @ObfuscatedName("ax.v")
    public int field1014 = 128;

    @ObfuscatedName("ax.p")
    public int field1003 = 0;

    @ObfuscatedName("ax.m")
    public int field1016 = 0;

    @ObfuscatedName("ax.b")
    public int field1017 = 0;

    @ObfuscatedName("df.n(Lfm;Lfm;I)V")
    public static void method2281(class167 arg0, class167 arg1) {
        Statics.field1015 = arg0;
        Statics.field1018 = arg1;
    }

    @ObfuscatedName("f.q(II)Lax;")
    public static class44 method601(int arg0) {
        class44 var1 = (class44) field1004.method3475((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1015.method3094(13, arg0);
        class44 var3 = new class44();
        var3.field1006 = arg0;
        if (var2 != null) {
            var3.method893(new class119(var2));
        }
        field1004.method3488(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ax.c(Ldc;I)V")
    public void method893(class119 arg0) {
        while (true) {
            int var2 = arg0.method2360();
            if (var2 == 0) {
                return;
            }
            this.method894(arg0, var2);
        }
    }

    @ObfuscatedName("ax.l(Ldc;II)V")
    public void method894(class119 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1019 = arg0.method2430();
        } else if (arg1 == 2) {
            this.field1008 = arg0.method2430();
        } else if (arg1 == 4) {
            this.field1013 = arg0.method2430();
        } else if (arg1 == 5) {
            this.field1014 = arg0.method2430();
        } else if (arg1 == 6) {
            this.field1003 = arg0.method2430();
        } else if (arg1 == 7) {
            this.field1016 = arg0.method2360();
        } else if (arg1 == 8) {
            this.field1017 = arg0.method2360();
        } else if (arg1 == 40) {
            int var3 = arg0.method2360();
            this.field1005 = new short[var3];
            this.field1007 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1005[var4] = (short) arg0.method2430();
                this.field1007[var4] = (short) arg0.method2430();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2360();
            this.field1011 = new short[var5];
            this.field1012 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1011[var6] = (short) arg0.method2430();
                this.field1012[var6] = (short) arg0.method2430();
            }
        }
    }

    @ObfuscatedName("ax.r(II)Ldt;")
    public final class105 method895(int arg0) {
        class105 var2 = (class105) field1010.method3475((long) this.field1006);
        if (var2 == null) {
            class100 var3 = class100.method2075(Statics.field1018, this.field1019, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field1005 != null) {
                for (int var4 = 0; var4 < this.field1005.length; var4++) {
                    var3.method2085(this.field1005[var4], this.field1007[var4]);
                }
            }
            if (this.field1011 != null) {
                for (int var5 = 0; var5 < this.field1011.length; var5++) {
                    var3.method2124(this.field1011[var5], this.field1012[var5]);
                }
            }
            var2 = var3.method2079(this.field1016 + 64, this.field1017 + 850, -30, -50, -30);
            field1010.method3488(var2, (long) this.field1006);
        }
        class105 var6;
        if (this.field1008 == -1 || arg0 == -1) {
            var6 = var2.method2162(true);
        } else {
            var6 = class43.method788(this.field1008).method862(var2, arg0);
        }
        if (this.field1013 != 128 || this.field1014 != 128) {
            var6.method2174(this.field1013, this.field1014, this.field1013);
        }
        if (this.field1003 != 0) {
            if (this.field1003 == 90) {
                var6.method2169();
            }
            if (this.field1003 == 180) {
                var6.method2169();
                var6.method2169();
            }
            if (this.field1003 == 270) {
                var6.method2169();
                var6.method2169();
                var6.method2169();
            }
        }
        return var6;
    }

    @ObfuscatedName("eb.u(I)V")
    public static void method2679() {
        field1004.method3479();
        field1010.method3479();
    }
}
