package deob;

@ObfuscatedName("aj")
public class class39 extends class182 {

    @ObfuscatedName("aj.i")
    public static class171 field915 = new class171(64);

    @ObfuscatedName("aj.g")
    public static class171 field916 = new class171(30);

    @ObfuscatedName("aj.x")
    public int field917;

    @ObfuscatedName("aj.b")
    public int field918;

    @ObfuscatedName("aj.q")
    public int field925 = -1;

    @ObfuscatedName("aj.l")
    public short[] field923;

    @ObfuscatedName("aj.m")
    public short[] field926;

    @ObfuscatedName("aj.u")
    public short[] field922;

    @ObfuscatedName("aj.s")
    public short[] field914;

    @ObfuscatedName("aj.f")
    public int field924 = 128;

    @ObfuscatedName("aj.p")
    public int field930 = 128;

    @ObfuscatedName("aj.w")
    public int field928 = 0;

    @ObfuscatedName("aj.y")
    public int field921 = 0;

    @ObfuscatedName("aj.h")
    public int field927 = 0;

    @ObfuscatedName("aj.v(Ldk;B)V")
    public void method734(class107 arg0) {
        while (true) {
            int var2 = arg0.method2226();
            if (var2 == 0) {
                return;
            }
            this.method739(arg0, var2);
        }
    }

    @ObfuscatedName("aj.i(Ldk;IB)V")
    public void method739(class107 arg0, int arg1) {
        if (arg1 == 1) {
            this.field918 = arg0.method2152();
        } else if (arg1 == 2) {
            this.field925 = arg0.method2152();
        } else if (arg1 == 4) {
            this.field924 = arg0.method2152();
        } else if (arg1 == 5) {
            this.field930 = arg0.method2152();
        } else if (arg1 == 6) {
            this.field928 = arg0.method2152();
        } else if (arg1 == 7) {
            this.field921 = arg0.method2226();
        } else if (arg1 == 8) {
            this.field927 = arg0.method2226();
        } else if (arg1 == 40) {
            int var3 = arg0.method2226();
            this.field923 = new short[var3];
            this.field926 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field923[var4] = (short) arg0.method2152();
                this.field926[var4] = (short) arg0.method2152();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2226();
            this.field922 = new short[var5];
            this.field914 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field922[var6] = (short) arg0.method2152();
                this.field914[var6] = (short) arg0.method2152();
            }
        }
    }

    @ObfuscatedName("aj.g(II)Lcz;")
    public final class98 method736(int arg0) {
        class98 var2 = (class98) field916.method3136((long) this.field917);
        if (var2 == null) {
            class93 var3 = class93.method1877(Statics.field1452, this.field918, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field923 != null) {
                for (int var4 = 0; var4 < this.field923.length; var4++) {
                    var3.method1890(this.field923[var4], this.field926[var4]);
                }
            }
            if (this.field922 != null) {
                for (int var5 = 0; var5 < this.field922.length; var5++) {
                    var3.method1883(this.field922[var5], this.field914[var5]);
                }
            }
            var2 = var3.method1897(this.field921 + 64, this.field927 + 850, -30, -50, -30);
            field916.method3127(var2, (long) this.field917);
        }
        class98 var6;
        if (this.field925 == -1 || arg0 == -1) {
            var6 = var2.method1967(true);
        } else {
            var6 = class38.method730(this.field925).method699(var2, arg0);
        }
        if (this.field924 != 128 || this.field930 != 128) {
            var6.method1980(this.field924, this.field930, this.field924);
        }
        if (this.field928 != 0) {
            if (this.field928 == 90) {
                var6.method2017();
            }
            if (this.field928 == 180) {
                var6.method2017();
                var6.method2017();
            }
            if (this.field928 == 270) {
                var6.method2017();
                var6.method2017();
                var6.method2017();
            }
        }
        return var6;
    }
}
