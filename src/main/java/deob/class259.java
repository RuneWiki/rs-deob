package deob;

@ObfuscatedName("iq")
public class class259 extends class202 {

    @ObfuscatedName("iq.p")
    public static class197 field3441 = new class197(64);

    @ObfuscatedName("iq.i")
    public char field3442;

    @ObfuscatedName("iq.j")
    public int field3444;

    @ObfuscatedName("iq.v")
    public String field3443;

    @ObfuscatedName("iq.x")
    public boolean field3446 = true;

    @ObfuscatedName("gi.m(II)Liq;")
    public static class259 method3309(int arg0) {
        class259 var1 = (class259) field3441.method3419((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3447.method3930(11, arg0);
        class259 var3 = new class259();
        if (var2 != null) {
            var3.method4246(new class181(var2));
        }
        var3.method4249();
        field3441.method3418(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("iq.p(I)V")
    public void method4249() {
    }

    @ObfuscatedName("iq.i(Lfv;I)V")
    public void method4246(class181 arg0) {
        while (true) {
            int var2 = arg0.method3012();
            if (var2 == 0) {
                return;
            }
            this.method4248(arg0, var2);
        }
    }

    @ObfuscatedName("iq.j(Lfv;IB)V")
    public void method4248(class181 arg0, int arg1) {
        if (arg1 == 1) {
            byte var3 = arg0.method3013();
            int var4 = var3 & 0xFF;
            if (var4 == 0) {
                throw new IllegalArgumentException("");
            }
            if (var4 >= 128 && var4 < 160) {
                char var5 = class274.field3720[var4 - 128];
                if (var5 == 0) {
                    var5 = '?';
                }
                var4 = var5;
            }
            char var6 = (char) var4;
            this.field3442 = var6;
        } else if (arg1 == 2) {
            this.field3444 = arg0.method3017();
        } else if (arg1 == 4) {
            this.field3446 = false;
        } else if (arg1 == 5) {
            this.field3443 = arg0.method3021();
        }
    }

    @ObfuscatedName("iq.v(S)Z")
    public boolean method4245() {
        return this.field3442 == 's';
    }
}
