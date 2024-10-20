package deob;

@ObfuscatedName("ij")
public class class250 extends class176 {

    @ObfuscatedName("ij.x")
    public static class146 field3281 = new class146(64);

    @ObfuscatedName("ij.t")
    public char field3280;

    @ObfuscatedName("ij.g")
    public int field3278;

    @ObfuscatedName("ij.l")
    public String field3279;

    @ObfuscatedName("ij.u")
    public boolean field3282 = true;

    @ObfuscatedName("ih.c(Lhz;I)V")
    public static void method4078(class234 arg0) {
        Statics.field3283 = arg0;
    }

    @ObfuscatedName("d.x(II)Lij;")
    public static class250 method69(int arg0) {
        class250 var1 = (class250) field3281.method3061((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3283.method3825(11, arg0);
        class250 var3 = new class250();
        if (var2 != null) {
            var3.method4171(new class300(var2));
        }
        var3.method4172();
        field3281.method3062(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ij.t(B)V")
    public void method4172() {
    }

    @ObfuscatedName("ij.g(Lkz;B)V")
    public void method4171(class300 arg0) {
        while (true) {
            int var2 = arg0.method5103();
            if (var2 == 0) {
                return;
            }
            this.method4174(arg0, var2);
        }
    }

    @ObfuscatedName("ij.l(Lkz;IB)V")
    public void method4174(class300 arg0, int arg1) {
        if (arg1 == 1) {
            byte var3 = arg0.method5168();
            int var4 = var3 & 0xFF;
            if (var4 == 0) {
                throw new IllegalArgumentException("" + Integer.toString(var4, 16));
            }
            if (var4 >= 128 && var4 < 160) {
                char var5 = class288.field3618[var4 - 128];
                if (var5 == 0) {
                    var5 = '?';
                }
                var4 = var5;
            }
            char var6 = (char) var4;
            this.field3280 = var6;
        } else if (arg1 == 2) {
            this.field3278 = arg0.method5208();
        } else if (arg1 == 4) {
            this.field3282 = false;
        } else if (arg1 == 5) {
            this.field3279 = arg0.method5112();
        }
    }

    @ObfuscatedName("ij.u(I)Z")
    public boolean method4175() {
        return this.field3280 == 's';
    }
}
