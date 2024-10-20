package deob;

@ObfuscatedName("an")
public class class39 extends class182 {

    @ObfuscatedName("an.f")
    public static class171 field910 = new class171(64);

    @ObfuscatedName("an.e")
    public static class171 field913 = new class171(30);

    @ObfuscatedName("an.d")
    public int field923;

    @ObfuscatedName("an.n")
    public int field914;

    @ObfuscatedName("an.v")
    public int field916 = -1;

    @ObfuscatedName("an.z")
    public short[] field919;

    @ObfuscatedName("an.j")
    public short[] field918;

    @ObfuscatedName("an.u")
    public short[] field924;

    @ObfuscatedName("an.g")
    public short[] field920;

    @ObfuscatedName("an.a")
    public int field921 = 128;

    @ObfuscatedName("an.c")
    public int field922 = 128;

    @ObfuscatedName("an.w")
    public int field926 = 0;

    @ObfuscatedName("an.l")
    public int field912 = 0;

    @ObfuscatedName("an.q")
    public int field925 = 0;

    @ObfuscatedName("ak.t(Leg;Leg;I)V")
    public static void method507(class146 arg0, class146 arg1) {
        Statics.field917 = arg0;
        Statics.field911 = arg1;
    }

    @ObfuscatedName("u.s(II)Lan;")
    public static class39 method123(int arg0) {
        class39 var1 = (class39) field910.method3170((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field917.method2709(13, arg0);
        class39 var3 = new class39();
        var3.field923 = arg0;
        if (var2 != null) {
            var3.method724(new class107(var2));
        }
        field910.method3168(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("an.f(Ldb;B)V")
    public void method724(class107 arg0) {
        while (true) {
            int var2 = arg0.method2101();
            if (var2 == 0) {
                return;
            }
            this.method732(arg0, var2);
        }
    }

    @ObfuscatedName("an.e(Ldb;IB)V")
    public void method732(class107 arg0, int arg1) {
        if (arg1 == 1) {
            this.field914 = arg0.method2103();
        } else if (arg1 == 2) {
            this.field916 = arg0.method2103();
        } else if (arg1 == 4) {
            this.field921 = arg0.method2103();
        } else if (arg1 == 5) {
            this.field922 = arg0.method2103();
        } else if (arg1 == 6) {
            this.field926 = arg0.method2103();
        } else if (arg1 == 7) {
            this.field912 = arg0.method2101();
        } else if (arg1 == 8) {
            this.field925 = arg0.method2101();
        } else if (arg1 == 40) {
            int var3 = arg0.method2101();
            this.field919 = new short[var3];
            this.field918 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field919[var4] = (short) arg0.method2103();
                this.field918[var4] = (short) arg0.method2103();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2101();
            this.field924 = new short[var5];
            this.field920 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field924[var6] = (short) arg0.method2103();
                this.field920[var6] = (short) arg0.method2103();
            }
        }
    }

    @ObfuscatedName("an.d(IB)Lcc;")
    public final class98 method717(int arg0) {
        class98 var2 = (class98) field913.method3170((long) this.field923);
        if (var2 == null) {
            class93 var3 = class93.method1872(Statics.field911, this.field914, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field919 != null) {
                for (int var4 = 0; var4 < this.field919.length; var4++) {
                    var3.method1864(this.field919[var4], this.field918[var4]);
                }
            }
            if (this.field924 != null) {
                for (int var5 = 0; var5 < this.field924.length; var5++) {
                    var3.method1865(this.field924[var5], this.field920[var5]);
                }
            }
            var2 = var3.method1871(this.field912 + 64, this.field925 + 850, -30, -50, -30);
            field913.method3168(var2, (long) this.field923);
        }
        class98 var6;
        if (this.field916 == -1 || arg0 == -1) {
            var6 = var2.method1955(true);
        } else {
            var6 = Statics.method448(this.field916).method708(var2, arg0);
        }
        if (this.field921 != 128 || this.field922 != 128) {
            var6.method1957(this.field921, this.field922, this.field921);
        }
        if (this.field926 != 0) {
            if (this.field926 == 90) {
                var6.method1967();
            }
            if (this.field926 == 180) {
                var6.method1967();
                var6.method1967();
            }
            if (this.field926 == 270) {
                var6.method1967();
                var6.method1967();
                var6.method1967();
            }
        }
        return var6;
    }

    @ObfuscatedName("v.n(B)V")
    public static void method94() {
        field910.method3171();
        field913.method3171();
    }
}
