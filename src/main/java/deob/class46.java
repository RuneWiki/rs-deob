package deob;

@ObfuscatedName("au")
public class class46 extends class208 {

    @ObfuscatedName("au.f")
    public static class197 field1030 = new class197(64);

    @ObfuscatedName("au.c")
    public static class197 field1033 = new class197(30);

    @ObfuscatedName("au.v")
    public int field1034;

    @ObfuscatedName("au.j")
    public int field1035;

    @ObfuscatedName("au.m")
    public int field1036 = -1;

    @ObfuscatedName("au.y")
    public short[] field1037;

    @ObfuscatedName("au.u")
    public short[] field1045;

    @ObfuscatedName("au.h")
    public short[] field1039;

    @ObfuscatedName("au.l")
    public short[] field1047;

    @ObfuscatedName("au.b")
    public int field1041 = 128;

    @ObfuscatedName("au.g")
    public int field1042 = 128;

    @ObfuscatedName("au.e")
    public int field1043 = 0;

    @ObfuscatedName("au.p")
    public int field1040 = 0;

    @ObfuscatedName("au.s")
    public int field1044 = 0;

    @ObfuscatedName("ap.k(Lfo;Lfo;I)V")
    public static void method757(class171 arg0, class171 arg1) {
        Statics.field1032 = arg0;
        Statics.field1031 = arg1;
    }

    @ObfuscatedName("fm.q(II)Lau;")
    public static class46 method2984(int arg0) {
        class46 var1 = (class46) field1030.method3535((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1032.method3097(13, arg0);
        class46 var3 = new class46();
        var3.field1034 = arg0;
        if (var2 != null) {
            var3.method902(new class123(var2));
        }
        field1030.method3537(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("au.f(Lde;I)V")
    public void method902(class123 arg0) {
        while (true) {
            int var2 = arg0.method2427();
            if (var2 == 0) {
                return;
            }
            this.method903(arg0, var2);
        }
    }

    @ObfuscatedName("au.c(Lde;II)V")
    public void method903(class123 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1035 = arg0.method2547();
        } else if (arg1 == 2) {
            this.field1036 = arg0.method2547();
        } else if (arg1 == 4) {
            this.field1041 = arg0.method2547();
        } else if (arg1 == 5) {
            this.field1042 = arg0.method2547();
        } else if (arg1 == 6) {
            this.field1043 = arg0.method2547();
        } else if (arg1 == 7) {
            this.field1040 = arg0.method2427();
        } else if (arg1 == 8) {
            this.field1044 = arg0.method2427();
        } else if (arg1 == 40) {
            int var3 = arg0.method2427();
            this.field1037 = new short[var3];
            this.field1045 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1037[var4] = (short) arg0.method2547();
                this.field1045[var4] = (short) arg0.method2547();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2427();
            this.field1039 = new short[var5];
            this.field1047 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1039[var6] = (short) arg0.method2547();
                this.field1047[var6] = (short) arg0.method2547();
            }
        }
    }

    @ObfuscatedName("au.v(II)Ldj;")
    public final class109 method904(int arg0) {
        class109 var2 = (class109) field1033.method3535((long) this.field1034);
        if (var2 == null) {
            class104 var3 = class104.method2141(Statics.field1031, this.field1035, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field1037 != null) {
                for (int var4 = 0; var4 < this.field1037.length; var4++) {
                    var3.method2152(this.field1037[var4], this.field1045[var4]);
                }
            }
            if (this.field1039 != null) {
                for (int var5 = 0; var5 < this.field1039.length; var5++) {
                    var3.method2153(this.field1039[var5], this.field1047[var5]);
                }
            }
            var2 = var3.method2160(this.field1040 + 64, this.field1044 + 850, -30, -50, -30);
            field1033.method3537(var2, (long) this.field1034);
        }
        class109 var6;
        if (this.field1036 == -1 || arg0 == -1) {
            var6 = var2.method2231(true);
        } else {
            var6 = class45.method726(this.field1036).method866(var2, arg0);
        }
        if (this.field1041 != 128 || this.field1042 != 128) {
            var6.method2243(this.field1041, this.field1042, this.field1041);
        }
        if (this.field1043 != 0) {
            if (this.field1043 == 90) {
                var6.method2238();
            }
            if (this.field1043 == 180) {
                var6.method2238();
                var6.method2238();
            }
            if (this.field1043 == 270) {
                var6.method2238();
                var6.method2238();
                var6.method2238();
            }
        }
        return var6;
    }

    @ObfuscatedName("dw.j(I)V")
    public static void method2372() {
        field1030.method3538();
        field1033.method3538();
    }
}
