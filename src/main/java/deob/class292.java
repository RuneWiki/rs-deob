package deob;

@ObfuscatedName("kz")
public class class292 extends class346 {

    @ObfuscatedName("kz.o")
    public static class199 field3554 = new class199(64);

    @ObfuscatedName("kz.u")
    public char field3557;

    @ObfuscatedName("kz.p")
    public int field3553;

    @ObfuscatedName("kz.b")
    public String field3556;

    @ObfuscatedName("kz.e")
    public boolean field3558 = true;

    @ObfuscatedName("k.f(Lir;I)V")
    public static void method68(class253 arg0) {
        Statics.field3555 = arg0;
    }

    @ObfuscatedName("di.o(IB)Lkz;")
    public static class292 method2171(int arg0) {
        class292 var1 = (class292) field3554.method3398((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3555.method3933(11, arg0);
        class292 var3 = new class292();
        if (var2 != null) {
            var3.method4518(new class382(var2));
        }
        var3.method4517();
        field3554.method3400(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("kz.u(I)V")
    public void method4517() {
    }

    @ObfuscatedName("kz.p(Lnu;B)V")
    public void method4518(class382 arg0) {
        while (true) {
            int var2 = arg0.method5856();
            if (var2 == 0) {
                return;
            }
            this.method4529(arg0, var2);
        }
    }

    @ObfuscatedName("kz.b(Lnu;II)V")
    public void method4529(class382 arg0, int arg1) {
        if (arg1 == 1) {
            byte var3 = arg0.method6045();
            int var4 = var3 & 0xFF;
            if (var4 == 0) {
                throw new IllegalArgumentException("" + Integer.toString(var4, 16));
            }
            if (var4 >= 128 && var4 < 160) {
                char var5 = class301.field3750[var4 - 128];
                if (var5 == 0) {
                    var5 = '?';
                }
                var4 = var5;
            }
            char var6 = (char) var4;
            this.field3557 = var6;
        } else if (arg1 == 2) {
            this.field3553 = arg0.method5861();
        } else if (arg1 == 4) {
            this.field3558 = false;
        } else if (arg1 == 5) {
            this.field3556 = arg0.method5865();
        }
    }

    @ObfuscatedName("kz.e(I)Z")
    public boolean method4520() {
        return this.field3557 == 's';
    }
}
