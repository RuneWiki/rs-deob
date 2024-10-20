package deob;

@ObfuscatedName("ax")
public class class35 extends class174 {

    @ObfuscatedName("ax.f")
    public static class170 field924 = new class170(64);

    @ObfuscatedName("ax.e")
    public static class170 field909 = new class170(30);

    @ObfuscatedName("ax.t")
    public int field910;

    @ObfuscatedName("ax.d")
    public int field908;

    @ObfuscatedName("ax.p")
    public int field912 = -1;

    @ObfuscatedName("ax.k")
    public short[] field913;

    @ObfuscatedName("ax.r")
    public short[] field906;

    @ObfuscatedName("ax.l")
    public short[] field915;

    @ObfuscatedName("ax.a")
    public short[] field916;

    @ObfuscatedName("ax.z")
    public int field917 = 128;

    @ObfuscatedName("ax.s")
    public int field925 = 128;

    @ObfuscatedName("ax.m")
    public int field918 = 0;

    @ObfuscatedName("ax.u")
    public int field920 = 0;

    @ObfuscatedName("ax.g")
    public int field921 = 0;

    @ObfuscatedName("aa.i(Leg;Leg;I)V")
    public static void method553(class152 arg0, class152 arg1) {
        Statics.field911 = arg0;
        Statics.field919 = arg1;
    }

    @ObfuscatedName("aw.w(IS)Lax;")
    public static class35 method633(int arg0) {
        class35 var1 = (class35) field924.method3235((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field911.method2970(13, arg0);
        class35 var3 = new class35();
        var3.field910 = arg0;
        if (var2 != null) {
            var3.method741(new class127(var2));
        }
        field924.method3234(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ax.f(Ldz;B)V")
    public void method741(class127 arg0) {
        while (true) {
            int var2 = arg0.method2472();
            if (var2 == 0) {
                return;
            }
            this.method742(arg0, var2);
        }
    }

    @ObfuscatedName("ax.e(Ldz;II)V")
    public void method742(class127 arg0, int arg1) {
        if (arg1 == 1) {
            this.field908 = arg0.method2615();
        } else if (arg1 == 2) {
            this.field912 = arg0.method2615();
        } else if (arg1 == 4) {
            this.field917 = arg0.method2615();
        } else if (arg1 == 5) {
            this.field925 = arg0.method2615();
        } else if (arg1 == 6) {
            this.field918 = arg0.method2615();
        } else if (arg1 == 7) {
            this.field920 = arg0.method2472();
        } else if (arg1 == 8) {
            this.field921 = arg0.method2472();
        } else if (arg1 == 40) {
            int var3 = arg0.method2472();
            this.field913 = new short[var3];
            this.field906 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field913[var4] = (short) arg0.method2615();
                this.field906[var4] = (short) arg0.method2615();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2472();
            this.field915 = new short[var5];
            this.field916 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field915[var6] = (short) arg0.method2615();
                this.field916[var6] = (short) arg0.method2615();
            }
        }
    }

    @ObfuscatedName("ax.t(II)Ldb;")
    public final class112 method743(int arg0) {
        class112 var2 = (class112) field909.method3235((long) this.field910);
        if (var2 == null) {
            class101 var3 = class101.method2052(Statics.field919, this.field908, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field913 != null) {
                for (int var4 = 0; var4 < this.field913.length; var4++) {
                    var3.method2064(this.field913[var4], this.field906[var4]);
                }
            }
            if (this.field915 != null) {
                for (int var5 = 0; var5 < this.field915.length; var5++) {
                    var3.method2066(this.field915[var5], this.field916[var5]);
                }
            }
            var2 = var3.method2112(this.field920 + 64, this.field921 + 850, -30, -50, -30);
            field909.method3234(var2, (long) this.field910);
        }
        class112 var6;
        if (this.field912 == -1 || arg0 == -1) {
            var6 = var2.method2308(true);
        } else {
            var6 = class34.method235(this.field912).method704(var2, arg0);
        }
        if (this.field917 != 128 || this.field925 != 128) {
            var6.method2255(this.field917, this.field925, this.field917);
        }
        if (this.field918 != 0) {
            if (this.field918 == 90) {
                var6.method2301();
            }
            if (this.field918 == 180) {
                var6.method2301();
                var6.method2301();
            }
            if (this.field918 == 270) {
                var6.method2301();
                var6.method2301();
                var6.method2301();
            }
        }
        return var6;
    }
}
