package deob;

@ObfuscatedName("il")
public class class260 extends class185 {

    @ObfuscatedName("il.k")
    public static class155 field3326 = new class155(64);

    @ObfuscatedName("il.s")
    public char field3328;

    @ObfuscatedName("il.t")
    public int field3330;

    @ObfuscatedName("il.i")
    public String field3327;

    @ObfuscatedName("il.o")
    public boolean field3329 = true;

    @ObfuscatedName("ha.z(IB)Lil;")
    public static class260 method3743(int arg0) {
        class260 var1 = (class260) field3326.method3170((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3331.method3873(11, arg0);
        class260 var3 = new class260();
        if (var2 != null) {
            var3.method4215(new class310(var2));
        }
        var3.method4214();
        field3326.method3169(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("il.k(I)V")
    public void method4214() {
    }

    @ObfuscatedName("il.s(Lkf;B)V")
    public void method4215(class310 arg0) {
        while (true) {
            int var2 = arg0.method5193();
            if (var2 == 0) {
                return;
            }
            this.method4216(arg0, var2);
        }
    }

    @ObfuscatedName("il.t(Lkf;II)V")
    public void method4216(class310 arg0, int arg1) {
        if (arg1 == 1) {
            byte var3 = arg0.method5194();
            int var4 = var3 & 0xFF;
            if (var4 == 0) {
                throw new IllegalArgumentException("" + Integer.toString(var4, 16));
            }
            if (var4 >= 128 && var4 < 160) {
                char var5 = class298.field3670[var4 - 128];
                if (var5 == 0) {
                    var5 = '?';
                }
                var4 = var5;
            }
            char var6 = (char) var4;
            this.field3328 = var6;
        } else if (arg1 == 2) {
            this.field3330 = arg0.method5270();
        } else if (arg1 == 4) {
            this.field3329 = false;
        } else if (arg1 == 5) {
            this.field3327 = arg0.method5202();
        }
    }

    @ObfuscatedName("il.i(I)Z")
    public boolean method4230() {
        return this.field3328 == 's';
    }

    @ObfuscatedName("ft.o(I)V")
    public static void method3362() {
        field3326.method3172();
    }
}
