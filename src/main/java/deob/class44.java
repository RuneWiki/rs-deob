package deob;

@ObfuscatedName("ay")
public class class44 extends class204 {

    @ObfuscatedName("ay.q")
    public static class193 field1013 = new class193(64);

    @ObfuscatedName("ay.g")
    public static class193 field1014 = new class193(30);

    @ObfuscatedName("ay.m")
    public int field1015;

    @ObfuscatedName("ay.t")
    public int field1016;

    @ObfuscatedName("ay.j")
    public int field1017 = -1;

    @ObfuscatedName("ay.n")
    public short[] field1024;

    @ObfuscatedName("ay.l")
    public short[] field1018;

    @ObfuscatedName("ay.i")
    public short[] field1020;

    @ObfuscatedName("ay.w")
    public short[] field1028;

    @ObfuscatedName("ay.v")
    public int field1021 = 128;

    @ObfuscatedName("ay.o")
    public int field1023 = 128;

    @ObfuscatedName("ay.p")
    public int field1030 = 0;

    @ObfuscatedName("ay.b")
    public int field1025 = 0;

    @ObfuscatedName("ay.z")
    public int field1026 = 0;

    @ObfuscatedName("an.f(IS)Lay;")
    public static class44 method732(int arg0) {
        class44 var1 = (class44) field1013.method3497((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1019.method3038(13, arg0);
        class44 var3 = new class44();
        var3.field1015 = arg0;
        if (var2 != null) {
            var3.method884(new class119(var2));
        }
        field1013.method3508(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ay.s(Ldn;I)V")
    public void method884(class119 arg0) {
        while (true) {
            int var2 = arg0.method2363();
            if (var2 == 0) {
                return;
            }
            this.method885(arg0, var2);
        }
    }

    @ObfuscatedName("ay.q(Ldn;IB)V")
    public void method885(class119 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1016 = arg0.method2353();
        } else if (arg1 == 2) {
            this.field1017 = arg0.method2353();
        } else if (arg1 == 4) {
            this.field1021 = arg0.method2353();
        } else if (arg1 == 5) {
            this.field1023 = arg0.method2353();
        } else if (arg1 == 6) {
            this.field1030 = arg0.method2353();
        } else if (arg1 == 7) {
            this.field1025 = arg0.method2363();
        } else if (arg1 == 8) {
            this.field1026 = arg0.method2363();
        } else if (arg1 == 40) {
            int var3 = arg0.method2363();
            this.field1024 = new short[var3];
            this.field1018 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1024[var4] = (short) arg0.method2353();
                this.field1018[var4] = (short) arg0.method2353();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2363();
            this.field1020 = new short[var5];
            this.field1028 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1020[var6] = (short) arg0.method2353();
                this.field1028[var6] = (short) arg0.method2353();
            }
        }
    }

    @ObfuscatedName("ay.g(IB)Ldu;")
    public final class105 method886(int arg0) {
        class105 var2 = (class105) field1014.method3497((long) this.field1015);
        if (var2 == null) {
            class100 var3 = class100.method2068(Statics.field1012, this.field1016, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field1024 != null) {
                for (int var4 = 0; var4 < this.field1024.length; var4++) {
                    var3.method2082(this.field1024[var4], this.field1018[var4]);
                }
            }
            if (this.field1020 != null) {
                for (int var5 = 0; var5 < this.field1020.length; var5++) {
                    var3.method2083(this.field1020[var5], this.field1028[var5]);
                }
            }
            var2 = var3.method2090(this.field1025 + 64, this.field1026 + 850, -30, -50, -30);
            field1014.method3508(var2, (long) this.field1015);
        }
        class105 var6;
        if (this.field1017 == -1 || arg0 == -1) {
            var6 = var2.method2210(true);
        } else {
            var6 = Statics.method653(this.field1017).method851(var2, arg0);
        }
        if (this.field1021 != 128 || this.field1023 != 128) {
            var6.method2222(this.field1021, this.field1023, this.field1021);
        }
        if (this.field1030 != 0) {
            if (this.field1030 == 90) {
                var6.method2173();
            }
            if (this.field1030 == 180) {
                var6.method2173();
                var6.method2173();
            }
            if (this.field1030 == 270) {
                var6.method2173();
                var6.method2173();
                var6.method2173();
            }
        }
        return var6;
    }

    @ObfuscatedName("y.m(B)V")
    public static void method576() {
        field1013.method3499();
        field1014.method3499();
    }
}
