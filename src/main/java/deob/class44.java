package deob;

@ObfuscatedName("am")
public class class44 extends class204 {

    @ObfuscatedName("am.i")
    public static class193 field1007 = new class193(64);

    @ObfuscatedName("am.d")
    public static class193 field1000 = new class193(30);

    @ObfuscatedName("am.o")
    public int field1013;

    @ObfuscatedName("am.c")
    public int field1003;

    @ObfuscatedName("am.p")
    public int field1008 = -1;

    @ObfuscatedName("am.j")
    public short[] field1005;

    @ObfuscatedName("am.a")
    public short[] field1006;

    @ObfuscatedName("am.y")
    public short[] field998;

    @ObfuscatedName("am.h")
    public short[] field1002;

    @ObfuscatedName("am.z")
    public int field1009 = 128;

    @ObfuscatedName("am.w")
    public int field1010 = 128;

    @ObfuscatedName("am.l")
    public int field1011 = 0;

    @ObfuscatedName("am.q")
    public int field1012 = 0;

    @ObfuscatedName("am.x")
    public int field1016 = 0;

    @ObfuscatedName("ej.v(Lfh;Lfh;B)V")
    public static void method2682(class167 arg0, class167 arg1) {
        Statics.field1001 = arg0;
        Statics.field999 = arg1;
    }

    @ObfuscatedName("be.f(II)Lam;")
    public static class44 method1502(int arg0) {
        class44 var1 = (class44) field1007.method3490((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1001.method3082(13, arg0);
        class44 var3 = new class44();
        var3.field1013 = arg0;
        if (var2 != null) {
            var3.method872(new class119(var2));
        }
        field1007.method3502(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("am.i(Ldx;I)V")
    public void method872(class119 arg0) {
        while (true) {
            int var2 = arg0.method2400();
            if (var2 == 0) {
                return;
            }
            this.method873(arg0, var2);
        }
    }

    @ObfuscatedName("am.d(Ldx;II)V")
    public void method873(class119 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1003 = arg0.method2334();
        } else if (arg1 == 2) {
            this.field1008 = arg0.method2334();
        } else if (arg1 == 4) {
            this.field1009 = arg0.method2334();
        } else if (arg1 == 5) {
            this.field1010 = arg0.method2334();
        } else if (arg1 == 6) {
            this.field1011 = arg0.method2334();
        } else if (arg1 == 7) {
            this.field1012 = arg0.method2400();
        } else if (arg1 == 8) {
            this.field1016 = arg0.method2400();
        } else if (arg1 == 40) {
            int var3 = arg0.method2400();
            this.field1005 = new short[var3];
            this.field1006 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1005[var4] = (short) arg0.method2334();
                this.field1006[var4] = (short) arg0.method2334();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2400();
            this.field998 = new short[var5];
            this.field1002 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field998[var6] = (short) arg0.method2334();
                this.field1002[var6] = (short) arg0.method2334();
            }
        }
    }

    @ObfuscatedName("am.o(II)Ldq;")
    public final class105 method874(int arg0) {
        class105 var2 = (class105) field1000.method3490((long) this.field1013);
        if (var2 == null) {
            class100 var3 = class100.method2053(Statics.field999, this.field1003, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field1005 != null) {
                for (int var4 = 0; var4 < this.field1005.length; var4++) {
                    var3.method2123(this.field1005[var4], this.field1006[var4]);
                }
            }
            if (this.field998 != null) {
                for (int var5 = 0; var5 < this.field998.length; var5++) {
                    var3.method2067(this.field998[var5], this.field1002[var5]);
                }
            }
            var2 = var3.method2074(this.field1012 + 64, this.field1016 + 850, -30, -50, -30);
            field1000.method3502(var2, (long) this.field1013);
        }
        class105 var6;
        if (this.field1008 == -1 || arg0 == -1) {
            var6 = var2.method2157(true);
        } else {
            var6 = class43.method616(this.field1008).method848(var2, arg0);
        }
        if (this.field1009 != 128 || this.field1010 != 128) {
            var6.method2170(this.field1009, this.field1010, this.field1009);
        }
        if (this.field1011 != 0) {
            if (this.field1011 == 90) {
                var6.method2165();
            }
            if (this.field1011 == 180) {
                var6.method2165();
                var6.method2165();
            }
            if (this.field1011 == 270) {
                var6.method2165();
                var6.method2165();
                var6.method2165();
            }
        }
        return var6;
    }

    @ObfuscatedName("z.c(B)V")
    public static void method134() {
        field1007.method3496();
        field1000.method3496();
    }
}
