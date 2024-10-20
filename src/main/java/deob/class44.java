package deob;

@ObfuscatedName("ao")
public class class44 extends class204 {

    @ObfuscatedName("ao.k")
    public static class193 field1011 = new class193(64);

    @ObfuscatedName("ao.f")
    public static class193 field1001 = new class193(30);

    @ObfuscatedName("ao.d")
    public int field1002;

    @ObfuscatedName("ao.l")
    public int field1008;

    @ObfuscatedName("ao.r")
    public int field1004 = -1;

    @ObfuscatedName("ao.g")
    public short[] field1014;

    @ObfuscatedName("ao.h")
    public short[] field1013;

    @ObfuscatedName("ao.n")
    public short[] field1007;

    @ObfuscatedName("ao.j")
    public short[] field998;

    @ObfuscatedName("ao.a")
    public int field1000 = 128;

    @ObfuscatedName("ao.b")
    public int field1010 = 128;

    @ObfuscatedName("ao.c")
    public int field1015 = 0;

    @ObfuscatedName("ao.v")
    public int field1012 = 0;

    @ObfuscatedName("ao.p")
    public int field1003 = 0;

    @ObfuscatedName("e.z(II)Lao;")
    public static class44 method216(int arg0) {
        class44 var1 = (class44) field1011.method3439((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1005.method2986(13, arg0);
        class44 var3 = new class44();
        var3.field1002 = arg0;
        if (var2 != null) {
            var3.method858(new class119(var2));
        }
        field1011.method3429(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ao.q(Lda;S)V")
    public void method858(class119 arg0) {
        while (true) {
            int var2 = arg0.method2457();
            if (var2 == 0) {
                return;
            }
            this.method859(arg0, var2);
        }
    }

    @ObfuscatedName("ao.k(Lda;II)V")
    public void method859(class119 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1008 = arg0.method2415();
        } else if (arg1 == 2) {
            this.field1004 = arg0.method2415();
        } else if (arg1 == 4) {
            this.field1000 = arg0.method2415();
        } else if (arg1 == 5) {
            this.field1010 = arg0.method2415();
        } else if (arg1 == 6) {
            this.field1015 = arg0.method2415();
        } else if (arg1 == 7) {
            this.field1012 = arg0.method2457();
        } else if (arg1 == 8) {
            this.field1003 = arg0.method2457();
        } else if (arg1 == 40) {
            int var3 = arg0.method2457();
            this.field1014 = new short[var3];
            this.field1013 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1014[var4] = (short) arg0.method2415();
                this.field1013[var4] = (short) arg0.method2415();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2457();
            this.field1007 = new short[var5];
            this.field998 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1007[var6] = (short) arg0.method2415();
                this.field998[var6] = (short) arg0.method2415();
            }
        }
    }

    @ObfuscatedName("ao.f(II)Ldb;")
    public final class105 method860(int arg0) {
        class105 var2 = (class105) field1001.method3439((long) this.field1002);
        if (var2 == null) {
            class100 var3 = class100.method2071(Statics.field999, this.field1008, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field1014 != null) {
                for (int var4 = 0; var4 < this.field1014.length; var4++) {
                    var3.method2010(this.field1014[var4], this.field1013[var4]);
                }
            }
            if (this.field1007 != null) {
                for (int var5 = 0; var5 < this.field1007.length; var5++) {
                    var3.method2011(this.field1007[var5], this.field998[var5]);
                }
            }
            var2 = var3.method2019(this.field1012 + 64, this.field1003 + 850, -30, -50, -30);
            field1001.method3429(var2, (long) this.field1002);
        }
        class105 var6;
        if (this.field1004 == -1 || arg0 == -1) {
            var6 = var2.method2171(true);
        } else {
            var6 = class43.method72(this.field1004).method831(var2, arg0);
        }
        if (this.field1000 != 128 || this.field1010 != 128) {
            var6.method2156(this.field1000, this.field1010, this.field1000);
        }
        if (this.field1015 != 0) {
            if (this.field1015 == 90) {
                var6.method2112();
            }
            if (this.field1015 == 180) {
                var6.method2112();
                var6.method2112();
            }
            if (this.field1015 == 270) {
                var6.method2112();
                var6.method2112();
                var6.method2112();
            }
        }
        return var6;
    }

    @ObfuscatedName("ac.d(I)V")
    public static void method682() {
        field1011.method3430();
        field1001.method3430();
    }
}
