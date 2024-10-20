package deob;

@ObfuscatedName("au")
public class class35 extends class174 {

    @ObfuscatedName("au.m")
    public static class170 field924 = new class170(64);

    @ObfuscatedName("au.j")
    public static class170 field916 = new class170(30);

    @ObfuscatedName("au.o")
    public int field927;

    @ObfuscatedName("au.l")
    public int field918;

    @ObfuscatedName("au.g")
    public int field919 = -1;

    @ObfuscatedName("au.w")
    public short[] field928;

    @ObfuscatedName("au.c")
    public short[] field920;

    @ObfuscatedName("au.z")
    public short[] field922;

    @ObfuscatedName("au.f")
    public short[] field923;

    @ObfuscatedName("au.a")
    public int field926 = 128;

    @ObfuscatedName("au.d")
    public int field925 = 128;

    @ObfuscatedName("au.e")
    public int field921 = 0;

    @ObfuscatedName("au.y")
    public int field913 = 0;

    @ObfuscatedName("au.k")
    public int field915 = 0;

    @ObfuscatedName("am.i(II)Lau;")
    public static class35 method713(int arg0) {
        class35 var1 = (class35) field924.method3308((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field917.method3032(13, arg0);
        class35 var3 = new class35();
        var3.field927 = arg0;
        if (var2 != null) {
            var3.method756(new class127(var2));
        }
        field924.method3307(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("au.v(Lda;I)V")
    public void method756(class127 arg0) {
        while (true) {
            int var2 = arg0.method2491();
            if (var2 == 0) {
                return;
            }
            this.method755(arg0, var2);
        }
    }

    @ObfuscatedName("au.m(Lda;II)V")
    public void method755(class127 arg0, int arg1) {
        if (arg1 == 1) {
            this.field918 = arg0.method2493();
        } else if (arg1 == 2) {
            this.field919 = arg0.method2493();
        } else if (arg1 == 4) {
            this.field926 = arg0.method2493();
        } else if (arg1 == 5) {
            this.field925 = arg0.method2493();
        } else if (arg1 == 6) {
            this.field921 = arg0.method2493();
        } else if (arg1 == 7) {
            this.field913 = arg0.method2491();
        } else if (arg1 == 8) {
            this.field915 = arg0.method2491();
        } else if (arg1 == 40) {
            int var3 = arg0.method2491();
            this.field928 = new short[var3];
            this.field920 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field928[var4] = (short) arg0.method2493();
                this.field920[var4] = (short) arg0.method2493();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2491();
            this.field922 = new short[var5];
            this.field923 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field922[var6] = (short) arg0.method2493();
                this.field923[var6] = (short) arg0.method2493();
            }
        }
    }

    @ObfuscatedName("au.j(II)Ldl;")
    public final class112 method766(int arg0) {
        class112 var2 = (class112) field916.method3308((long) this.field927);
        if (var2 == null) {
            class101 var3 = class101.method2081(Statics.field914, this.field918, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field928 != null) {
                for (int var4 = 0; var4 < this.field928.length; var4++) {
                    var3.method2095(this.field928[var4], this.field920[var4]);
                }
            }
            if (this.field922 != null) {
                for (int var5 = 0; var5 < this.field922.length; var5++) {
                    var3.method2152(this.field922[var5], this.field923[var5]);
                }
            }
            var2 = var3.method2102(this.field913 + 64, this.field915 + 850, -30, -50, -30);
            field916.method3307(var2, (long) this.field927);
        }
        class112 var6;
        if (this.field919 == -1 || arg0 == -1) {
            var6 = var2.method2271(true);
        } else {
            var6 = class34.method1443(this.field919).method722(var2, arg0);
        }
        if (this.field926 != 128 || this.field925 != 128) {
            var6.method2288(this.field926, this.field925, this.field926);
        }
        if (this.field921 != 0) {
            if (this.field921 == 90) {
                var6.method2320();
            }
            if (this.field921 == 180) {
                var6.method2320();
                var6.method2320();
            }
            if (this.field921 == 270) {
                var6.method2320();
                var6.method2320();
                var6.method2320();
            }
        }
        return var6;
    }

    @ObfuscatedName("ag.o(B)V")
    public static void method632() {
        field924.method3311();
        field916.method3311();
    }
}
