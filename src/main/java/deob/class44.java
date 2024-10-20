package deob;

@ObfuscatedName("ag")
public class class44 extends class204 {

    @ObfuscatedName("ag.f")
    public static class193 field994 = new class193(64);

    @ObfuscatedName("ag.l")
    public static class193 field995 = new class193(30);

    @ObfuscatedName("ag.u")
    public int field996;

    @ObfuscatedName("ag.a")
    public int field997;

    @ObfuscatedName("ag.h")
    public int field1006 = -1;

    @ObfuscatedName("ag.i")
    public short[] field999;

    @ObfuscatedName("ag.t")
    public short[] field1000;

    @ObfuscatedName("ag.k")
    public short[] field1004;

    @ObfuscatedName("ag.s")
    public short[] field1002;

    @ObfuscatedName("ag.w")
    public int field1003 = 128;

    @ObfuscatedName("ag.e")
    public int field998 = 128;

    @ObfuscatedName("ag.z")
    public int field1005 = 0;

    @ObfuscatedName("ag.p")
    public int field993 = 0;

    @ObfuscatedName("ag.r")
    public int field1007 = 0;

    @ObfuscatedName("s.j(IS)Lag;")
    public static class44 method152(int arg0) {
        class44 var1 = (class44) field994.method3543((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field992.method3124(13, arg0);
        class44 var3 = new class44();
        var3.field996 = arg0;
        if (var2 != null) {
            var3.method913(new class119(var2));
        }
        field994.method3540(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ag.m(Ldc;I)V")
    public void method913(class119 arg0) {
        while (true) {
            int var2 = arg0.method2372();
            if (var2 == 0) {
                return;
            }
            this.method919(arg0, var2);
        }
    }

    @ObfuscatedName("ag.f(Ldc;II)V")
    public void method919(class119 arg0, int arg1) {
        if (arg1 == 1) {
            this.field997 = arg0.method2374();
        } else if (arg1 == 2) {
            this.field1006 = arg0.method2374();
        } else if (arg1 == 4) {
            this.field1003 = arg0.method2374();
        } else if (arg1 == 5) {
            this.field998 = arg0.method2374();
        } else if (arg1 == 6) {
            this.field1005 = arg0.method2374();
        } else if (arg1 == 7) {
            this.field993 = arg0.method2372();
        } else if (arg1 == 8) {
            this.field1007 = arg0.method2372();
        } else if (arg1 == 40) {
            int var3 = arg0.method2372();
            this.field999 = new short[var3];
            this.field1000 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field999[var4] = (short) arg0.method2374();
                this.field1000[var4] = (short) arg0.method2374();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2372();
            this.field1004 = new short[var5];
            this.field1002 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1004[var6] = (short) arg0.method2374();
                this.field1002[var6] = (short) arg0.method2374();
            }
        }
    }

    @ObfuscatedName("ag.l(IB)Lda;")
    public final class105 method914(int arg0) {
        class105 var2 = (class105) field995.method3543((long) this.field996);
        if (var2 == null) {
            class100 var3 = class100.method2063(Statics.field1001, this.field997, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field999 != null) {
                for (int var4 = 0; var4 < this.field999.length; var4++) {
                    var3.method2143(this.field999[var4], this.field1000[var4]);
                }
            }
            if (this.field1004 != null) {
                for (int var5 = 0; var5 < this.field1004.length; var5++) {
                    var3.method2078(this.field1004[var5], this.field1002[var5]);
                }
            }
            var2 = var3.method2092(this.field993 + 64, this.field1007 + 850, -30, -50, -30);
            field995.method3540(var2, (long) this.field996);
        }
        class105 var6;
        if (this.field1006 == -1 || arg0 == -1) {
            var6 = var2.method2223(true);
        } else {
            var6 = class43.method575(this.field1006).method898(var2, arg0);
        }
        if (this.field1003 != 128 || this.field998 != 128) {
            var6.method2198(this.field1003, this.field998, this.field1003);
        }
        if (this.field1005 != 0) {
            if (this.field1005 == 90) {
                var6.method2185();
            }
            if (this.field1005 == 180) {
                var6.method2185();
                var6.method2185();
            }
            if (this.field1005 == 270) {
                var6.method2185();
                var6.method2185();
                var6.method2185();
            }
        }
        return var6;
    }
}
