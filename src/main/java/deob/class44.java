package deob;

@ObfuscatedName("ai")
public class class44 extends class204 {

    @ObfuscatedName("ai.q")
    public static class193 field1008 = new class193(64);

    @ObfuscatedName("ai.o")
    public static class193 field1010 = new class193(30);

    @ObfuscatedName("ai.g")
    public int field1002;

    @ObfuscatedName("ai.m")
    public int field1007;

    @ObfuscatedName("ai.b")
    public int field1004 = -1;

    @ObfuscatedName("ai.p")
    public short[] field1009;

    @ObfuscatedName("ai.t")
    public short[] field1015;

    @ObfuscatedName("ai.w")
    public short[] field1011;

    @ObfuscatedName("ai.x")
    public short[] field1013;

    @ObfuscatedName("ai.k")
    public int field1005 = 128;

    @ObfuscatedName("ai.z")
    public int field1014 = 128;

    @ObfuscatedName("ai.v")
    public int field1006 = 0;

    @ObfuscatedName("ai.j")
    public int field1016 = 0;

    @ObfuscatedName("ai.f")
    public int field1017 = 0;

    @ObfuscatedName("hq.e(IB)Lai;")
    public static class44 method3632(int arg0) {
        class44 var1 = (class44) field1008.method3478((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1012.method3050(13, arg0);
        class44 var3 = new class44();
        var3.field1002 = arg0;
        if (var2 != null) {
            var3.method897(new class119(var2));
        }
        field1008.method3479(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ai.q(Ldl;I)V")
    public void method897(class119 arg0) {
        while (true) {
            int var2 = arg0.method2388();
            if (var2 == 0) {
                return;
            }
            this.method898(arg0, var2);
        }
    }

    @ObfuscatedName("ai.o(Ldl;II)V")
    public void method898(class119 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1007 = arg0.method2440();
        } else if (arg1 == 2) {
            this.field1004 = arg0.method2440();
        } else if (arg1 == 4) {
            this.field1005 = arg0.method2440();
        } else if (arg1 == 5) {
            this.field1014 = arg0.method2440();
        } else if (arg1 == 6) {
            this.field1006 = arg0.method2440();
        } else if (arg1 == 7) {
            this.field1016 = arg0.method2388();
        } else if (arg1 == 8) {
            this.field1017 = arg0.method2388();
        } else if (arg1 == 40) {
            int var3 = arg0.method2388();
            this.field1009 = new short[var3];
            this.field1015 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1009[var4] = (short) arg0.method2440();
                this.field1015[var4] = (short) arg0.method2440();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2388();
            this.field1011 = new short[var5];
            this.field1013 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1011[var6] = (short) arg0.method2440();
                this.field1013[var6] = (short) arg0.method2440();
            }
        }
    }

    @ObfuscatedName("ai.g(II)Ldt;")
    public final class105 method902(int arg0) {
        class105 var2 = (class105) field1010.method3478((long) this.field1002);
        if (var2 == null) {
            class100 var3 = class100.method2077(Statics.field1003, this.field1007, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field1009 != null) {
                for (int var4 = 0; var4 < this.field1009.length; var4++) {
                    var3.method2090(this.field1009[var4], this.field1015[var4]);
                }
            }
            if (this.field1011 != null) {
                for (int var5 = 0; var5 < this.field1011.length; var5++) {
                    var3.method2091(this.field1011[var5], this.field1013[var5]);
                }
            }
            var2 = var3.method2085(this.field1016 + 64, this.field1017 + 850, -30, -50, -30);
            field1010.method3479(var2, (long) this.field1002);
        }
        class105 var6;
        if (this.field1004 == -1 || arg0 == -1) {
            var6 = var2.method2175(true);
        } else {
            var6 = class43.method2304(this.field1004).method866(var2, arg0);
        }
        if (this.field1005 != 128 || this.field1014 != 128) {
            var6.method2205(this.field1005, this.field1014, this.field1005);
        }
        if (this.field1006 != 0) {
            if (this.field1006 == 90) {
                var6.method2199();
            }
            if (this.field1006 == 180) {
                var6.method2199();
                var6.method2199();
            }
            if (this.field1006 == 270) {
                var6.method2199();
                var6.method2199();
                var6.method2199();
            }
        }
        return var6;
    }

    @ObfuscatedName("t.m(I)V")
    public static void method112() {
        field1008.method3481();
        field1010.method3481();
    }
}
