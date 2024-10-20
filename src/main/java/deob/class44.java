package deob;

@ObfuscatedName("av")
public class class44 extends class204 {

    @ObfuscatedName("av.o")
    public static class193 field989 = new class193(64);

    @ObfuscatedName("av.z")
    public static class193 field990 = new class193(30);

    @ObfuscatedName("av.c")
    public int field991;

    @ObfuscatedName("av.d")
    public int field992;

    @ObfuscatedName("av.l")
    public int field993 = -1;

    @ObfuscatedName("av.b")
    public short[] field994;

    @ObfuscatedName("av.j")
    public short[] field995;

    @ObfuscatedName("av.f")
    public short[] field1008;

    @ObfuscatedName("av.i")
    public short[] field996;

    @ObfuscatedName("av.g")
    public int field987 = 128;

    @ObfuscatedName("av.t")
    public int field1000 = 128;

    @ObfuscatedName("av.e")
    public int field998 = 0;

    @ObfuscatedName("av.q")
    public int field1001 = 0;

    @ObfuscatedName("av.u")
    public int field1002 = 0;

    @ObfuscatedName("client.k(IS)Lav;")
    public static class44 method520(int arg0) {
        class44 var1 = (class44) field989.method3510((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1005.method3118(13, arg0);
        class44 var3 = new class44();
        var3.field991 = arg0;
        if (var2 != null) {
            var3.method851(new class119(var2));
        }
        field989.method3512(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("av.h(Ldk;I)V")
    public void method851(class119 arg0) {
        while (true) {
            int var2 = arg0.method2330();
            if (var2 == 0) {
                return;
            }
            this.method840(arg0, var2);
        }
    }

    @ObfuscatedName("av.o(Ldk;II)V")
    public void method840(class119 arg0, int arg1) {
        if (arg1 == 1) {
            this.field992 = arg0.method2332();
        } else if (arg1 == 2) {
            this.field993 = arg0.method2332();
        } else if (arg1 == 4) {
            this.field987 = arg0.method2332();
        } else if (arg1 == 5) {
            this.field1000 = arg0.method2332();
        } else if (arg1 == 6) {
            this.field998 = arg0.method2332();
        } else if (arg1 == 7) {
            this.field1001 = arg0.method2330();
        } else if (arg1 == 8) {
            this.field1002 = arg0.method2330();
        } else if (arg1 == 40) {
            int var3 = arg0.method2330();
            this.field994 = new short[var3];
            this.field995 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field994[var4] = (short) arg0.method2332();
                this.field995[var4] = (short) arg0.method2332();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2330();
            this.field1008 = new short[var5];
            this.field996 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1008[var6] = (short) arg0.method2332();
                this.field996[var6] = (short) arg0.method2332();
            }
        }
    }

    @ObfuscatedName("av.z(II)Ldl;")
    public final class105 method847(int arg0) {
        class105 var2 = (class105) field990.method3510((long) this.field991);
        if (var2 == null) {
            class100 var3 = class100.method2051(Statics.field988, this.field992, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field994 != null) {
                for (int var4 = 0; var4 < this.field994.length; var4++) {
                    var3.method2064(this.field994[var4], this.field995[var4]);
                }
            }
            if (this.field1008 != null) {
                for (int var5 = 0; var5 < this.field1008.length; var5++) {
                    var3.method2070(this.field1008[var5], this.field996[var5]);
                }
            }
            var2 = var3.method2089(this.field1001 + 64, this.field1002 + 850, -30, -50, -30);
            field990.method3512(var2, (long) this.field991);
        }
        class105 var6;
        if (this.field993 == -1 || arg0 == -1) {
            var6 = var2.method2182(true);
        } else {
            var6 = class43.method3491(this.field993).method807(var2, arg0);
        }
        if (this.field987 != 128 || this.field1000 != 128) {
            var6.method2152(this.field987, this.field1000, this.field987);
        }
        if (this.field998 != 0) {
            if (this.field998 == 90) {
                var6.method2147();
            }
            if (this.field998 == 180) {
                var6.method2147();
                var6.method2147();
            }
            if (this.field998 == 270) {
                var6.method2147();
                var6.method2147();
                var6.method2147();
            }
        }
        return var6;
    }
}
