package deob;

@ObfuscatedName("aw")
public class class44 extends class204 {

    @ObfuscatedName("aw.v")
    public static class193 field1020 = new class193(64);

    @ObfuscatedName("aw.n")
    public static class193 field1013 = new class193(30);

    @ObfuscatedName("aw.f")
    public int field1014;

    @ObfuscatedName("aw.g")
    public int field1018;

    @ObfuscatedName("aw.o")
    public int field1019 = -1;

    @ObfuscatedName("aw.s")
    public short[] field1017;

    @ObfuscatedName("aw.k")
    public short[] field1021;

    @ObfuscatedName("aw.b")
    public short[] field1022;

    @ObfuscatedName("aw.c")
    public short[] field1023;

    @ObfuscatedName("aw.l")
    public int field1024 = 128;

    @ObfuscatedName("aw.p")
    public int field1015 = 128;

    @ObfuscatedName("aw.d")
    public int field1026 = 0;

    @ObfuscatedName("aw.i")
    public int field1027 = 0;

    @ObfuscatedName("aw.x")
    public int field1028 = 0;

    @ObfuscatedName("ek.h(IB)Law;")
    public static class44 method2821(int arg0) {
        class44 var1 = (class44) field1020.method3538((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1016.method3073(13, arg0);
        class44 var3 = new class44();
        var3.field1014 = arg0;
        if (var2 != null) {
            var3.method875(new class119(var2));
        }
        field1020.method3540(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aw.q(Ldm;I)V")
    public void method875(class119 arg0) {
        while (true) {
            int var2 = arg0.method2383();
            if (var2 == 0) {
                return;
            }
            this.method880(arg0, var2);
        }
    }

    @ObfuscatedName("aw.v(Ldm;II)V")
    public void method880(class119 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1018 = arg0.method2385();
        } else if (arg1 == 2) {
            this.field1019 = arg0.method2385();
        } else if (arg1 == 4) {
            this.field1024 = arg0.method2385();
        } else if (arg1 == 5) {
            this.field1015 = arg0.method2385();
        } else if (arg1 == 6) {
            this.field1026 = arg0.method2385();
        } else if (arg1 == 7) {
            this.field1027 = arg0.method2383();
        } else if (arg1 == 8) {
            this.field1028 = arg0.method2383();
        } else if (arg1 == 40) {
            int var3 = arg0.method2383();
            this.field1017 = new short[var3];
            this.field1021 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1017[var4] = (short) arg0.method2385();
                this.field1021[var4] = (short) arg0.method2385();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2383();
            this.field1022 = new short[var5];
            this.field1023 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1022[var6] = (short) arg0.method2385();
                this.field1023[var6] = (short) arg0.method2385();
            }
        }
    }

    @ObfuscatedName("aw.n(II)Ldg;")
    public final class105 method886(int arg0) {
        class105 var2 = (class105) field1013.method3538((long) this.field1014);
        if (var2 == null) {
            class100 var3 = class100.method2084(Statics.field1025, this.field1018, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field1017 != null) {
                for (int var4 = 0; var4 < this.field1017.length; var4++) {
                    var3.method2097(this.field1017[var4], this.field1021[var4]);
                }
            }
            if (this.field1022 != null) {
                for (int var5 = 0; var5 < this.field1022.length; var5++) {
                    var3.method2149(this.field1022[var5], this.field1023[var5]);
                }
            }
            var2 = var3.method2112(this.field1027 + 64, this.field1028 + 850, -30, -50, -30);
            field1013.method3540(var2, (long) this.field1014);
        }
        class105 var6;
        if (this.field1019 == -1 || arg0 == -1) {
            var6 = var2.method2175(true);
        } else {
            var6 = class43.method733(this.field1019).method839(var2, arg0);
        }
        if (this.field1024 != 128 || this.field1015 != 128) {
            var6.method2192(this.field1024, this.field1015, this.field1024);
        }
        if (this.field1026 != 0) {
            if (this.field1026 == 90) {
                var6.method2182();
            }
            if (this.field1026 == 180) {
                var6.method2182();
                var6.method2182();
            }
            if (this.field1026 == 270) {
                var6.method2182();
                var6.method2182();
                var6.method2182();
            }
        }
        return var6;
    }

    @ObfuscatedName("cx.f(I)V")
    public static void method2080() {
        field1020.method3541();
        field1013.method3541();
    }
}
