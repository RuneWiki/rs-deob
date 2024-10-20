package deob;

@ObfuscatedName("ae")
public class class39 extends class180 {

    @ObfuscatedName("ae.a")
    public static class170 field926 = new class170(64);

    @ObfuscatedName("ae.g")
    public static class170 field915 = new class170(30);

    @ObfuscatedName("ae.u")
    public int field912;

    @ObfuscatedName("ae.k")
    public int field917;

    @ObfuscatedName("ae.m")
    public int field918 = -1;

    @ObfuscatedName("ae.t")
    public short[] field916;

    @ObfuscatedName("ae.l")
    public short[] field920;

    @ObfuscatedName("ae.f")
    public short[] field921;

    @ObfuscatedName("ae.c")
    public short[] field922;

    @ObfuscatedName("ae.i")
    public int field923 = 128;

    @ObfuscatedName("ae.o")
    public int field914 = 128;

    @ObfuscatedName("ae.d")
    public int field925 = 0;

    @ObfuscatedName("ae.b")
    public int field929 = 0;

    @ObfuscatedName("ae.v")
    public int field919 = 0;

    @ObfuscatedName("client.e(IB)Lae;")
    public static class39 method467(int arg0) {
        class39 var1 = (class39) field926.method3166((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field924.method2717(13, arg0);
        class39 var3 = new class39();
        var3.field912 = arg0;
        if (var2 != null) {
            var3.method763(new class107(var2));
        }
        field926.method3161(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ae.p(Ldp;I)V")
    public void method763(class107 arg0) {
        while (true) {
            int var2 = arg0.method2125();
            if (var2 == 0) {
                return;
            }
            this.method766(arg0, var2);
        }
    }

    @ObfuscatedName("ae.a(Ldp;IB)V")
    public void method766(class107 arg0, int arg1) {
        if (arg1 == 1) {
            this.field917 = arg0.method2182();
        } else if (arg1 == 2) {
            this.field918 = arg0.method2182();
        } else if (arg1 == 4) {
            this.field923 = arg0.method2182();
        } else if (arg1 == 5) {
            this.field914 = arg0.method2182();
        } else if (arg1 == 6) {
            this.field925 = arg0.method2182();
        } else if (arg1 == 7) {
            this.field929 = arg0.method2125();
        } else if (arg1 == 8) {
            this.field919 = arg0.method2125();
        } else if (arg1 == 40) {
            int var3 = arg0.method2125();
            this.field916 = new short[var3];
            this.field920 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field916[var4] = (short) arg0.method2182();
                this.field920[var4] = (short) arg0.method2182();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2125();
            this.field921 = new short[var5];
            this.field922 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field921[var6] = (short) arg0.method2182();
                this.field922[var6] = (short) arg0.method2182();
            }
        }
    }

    @ObfuscatedName("ae.g(II)Lcs;")
    public final class98 method771(int arg0) {
        class98 var2 = (class98) field915.method3166((long) this.field912);
        if (var2 == null) {
            class93 var3 = class93.method1960(Statics.field913, this.field917, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field916 != null) {
                for (int var4 = 0; var4 < this.field916.length; var4++) {
                    var3.method1892(this.field916[var4], this.field920[var4]);
                }
            }
            if (this.field921 != null) {
                for (int var5 = 0; var5 < this.field921.length; var5++) {
                    var3.method1904(this.field921[var5], this.field922[var5]);
                }
            }
            var2 = var3.method1911(this.field929 + 64, this.field919 + 850, -30, -50, -30);
            field915.method3161(var2, (long) this.field912);
        }
        class98 var6;
        if (this.field918 == -1 || arg0 == -1) {
            var6 = var2.method2010(true);
        } else {
            var6 = class38.method81(this.field918).method736(var2, arg0);
        }
        if (this.field923 != 128 || this.field914 != 128) {
            var6.method1999(this.field923, this.field914, this.field923);
        }
        if (this.field925 != 0) {
            if (this.field925 == 90) {
                var6.method2030();
            }
            if (this.field925 == 180) {
                var6.method2030();
                var6.method2030();
            }
            if (this.field925 == 270) {
                var6.method2030();
                var6.method2030();
                var6.method2030();
            }
        }
        return var6;
    }
}
