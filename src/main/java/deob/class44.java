package deob;

@ObfuscatedName("ak")
public class class44 extends class204 {

    @ObfuscatedName("ak.s")
    public static class193 field988 = new class193(64);

    @ObfuscatedName("ak.q")
    public static class193 field989 = new class193(30);

    @ObfuscatedName("ak.j")
    public int field990;

    @ObfuscatedName("ak.k")
    public int field1001;

    @ObfuscatedName("ak.i")
    public int field1004 = -1;

    @ObfuscatedName("ak.m")
    public short[] field993;

    @ObfuscatedName("ak.p")
    public short[] field995;

    @ObfuscatedName("ak.h")
    public short[] field1002;

    @ObfuscatedName("ak.e")
    public short[] field996;

    @ObfuscatedName("ak.g")
    public int field997 = 128;

    @ObfuscatedName("ak.b")
    public int field998 = 128;

    @ObfuscatedName("ak.f")
    public int field999 = 0;

    @ObfuscatedName("ak.y")
    public int field1000 = 0;

    @ObfuscatedName("ak.z")
    public int field991 = 0;

    @ObfuscatedName("s.n(II)Lak;")
    public static class44 method17(int arg0) {
        class44 var1 = (class44) field988.method3478((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field994.method3010(13, arg0);
        class44 var3 = new class44();
        var3.field990 = arg0;
        if (var2 != null) {
            var3.method861(new class119(var2));
        }
        field988.method3481(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ak.d(Ldq;I)V")
    public void method861(class119 arg0) {
        while (true) {
            int var2 = arg0.method2338();
            if (var2 == 0) {
                return;
            }
            this.method858(arg0, var2);
        }
    }

    @ObfuscatedName("ak.s(Ldq;II)V")
    public void method858(class119 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1001 = arg0.method2377();
        } else if (arg1 == 2) {
            this.field1004 = arg0.method2377();
        } else if (arg1 == 4) {
            this.field997 = arg0.method2377();
        } else if (arg1 == 5) {
            this.field998 = arg0.method2377();
        } else if (arg1 == 6) {
            this.field999 = arg0.method2377();
        } else if (arg1 == 7) {
            this.field1000 = arg0.method2338();
        } else if (arg1 == 8) {
            this.field991 = arg0.method2338();
        } else if (arg1 == 40) {
            int var3 = arg0.method2338();
            this.field993 = new short[var3];
            this.field995 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field993[var4] = (short) arg0.method2377();
                this.field995[var4] = (short) arg0.method2377();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2338();
            this.field1002 = new short[var5];
            this.field996 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1002[var6] = (short) arg0.method2377();
                this.field996[var6] = (short) arg0.method2377();
            }
        }
    }

    @ObfuscatedName("ak.q(II)Ldb;")
    public final class105 method866(int arg0) {
        class105 var2 = (class105) field989.method3478((long) this.field990);
        if (var2 == null) {
            class100 var3 = class100.method2024(Statics.field3115, this.field1001, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field993 != null) {
                for (int var4 = 0; var4 < this.field993.length; var4++) {
                    var3.method2060(this.field993[var4], this.field995[var4]);
                }
            }
            if (this.field1002 != null) {
                for (int var5 = 0; var5 < this.field1002.length; var5++) {
                    var3.method2076(this.field1002[var5], this.field996[var5]);
                }
            }
            var2 = var3.method2093(this.field1000 + 64, this.field991 + 850, -30, -50, -30);
            field989.method3481(var2, (long) this.field990);
        }
        class105 var6;
        if (this.field1004 == -1 || arg0 == -1) {
            var6 = var2.method2125(true);
        } else {
            var6 = class43.method2827(this.field1004).method850(var2, arg0);
        }
        if (this.field997 != 128 || this.field998 != 128) {
            var6.method2138(this.field997, this.field998, this.field997);
        }
        if (this.field999 != 0) {
            if (this.field999 == 90) {
                var6.method2133();
            }
            if (this.field999 == 180) {
                var6.method2133();
                var6.method2133();
            }
            if (this.field999 == 270) {
                var6.method2133();
                var6.method2133();
                var6.method2133();
            }
        }
        return var6;
    }

    @ObfuscatedName("ec.j(B)V")
    public static void method2944() {
        field988.method3480();
        field989.method3480();
    }
}
