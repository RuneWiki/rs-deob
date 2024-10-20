package deob;

@ObfuscatedName("ii")
public class class260 extends class185 {

    @ObfuscatedName("ii.o")
    public static class155 field3340 = new class155(64);

    @ObfuscatedName("ii.q")
    public char field3338;

    @ObfuscatedName("ii.j")
    public int field3341;

    @ObfuscatedName("ii.p")
    public String field3339;

    @ObfuscatedName("ii.g")
    public boolean field3337 = true;

    @ObfuscatedName("a.m(Lic;I)V")
    public static void method78(class244 arg0) {
        Statics.field2384 = arg0;
    }

    @ObfuscatedName("iv.o(II)Lii;")
    public static class260 method4255(int arg0) {
        class260 var1 = (class260) field3340.method3127((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2384.method3891(11, arg0);
        class260 var3 = new class260();
        if (var2 != null) {
            var3.method4283(new class310(var2));
        }
        var3.method4268();
        field3340.method3137(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ii.q(I)V")
    public void method4268() {
    }

    @ObfuscatedName("ii.j(Lkn;I)V")
    public void method4283(class310 arg0) {
        while (true) {
            int var2 = arg0.method5227();
            if (var2 == 0) {
                return;
            }
            this.method4269(arg0, var2);
        }
    }

    @ObfuscatedName("ii.p(Lkn;II)V")
    public void method4269(class310 arg0, int arg1) {
        if (arg1 == 1) {
            byte var3 = arg0.method5228();
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
            this.field3338 = var6;
        } else if (arg1 == 2) {
            this.field3341 = arg0.method5209();
        } else if (arg1 == 4) {
            this.field3337 = false;
        } else if (arg1 == 5) {
            this.field3339 = arg0.method5236();
        }
    }

    @ObfuscatedName("ii.g(I)Z")
    public boolean method4274() {
        return this.field3338 == 's';
    }
}
