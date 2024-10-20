package deob;

@ObfuscatedName("je")
public class class267 extends class209 {

    @ObfuscatedName("je.r")
    public static class203 field3407 = new class203(64);

    @ObfuscatedName("je.e")
    public char field3404;

    @ObfuscatedName("je.q")
    public int field3403;

    @ObfuscatedName("je.c")
    public String field3406;

    @ObfuscatedName("je.l")
    public boolean field3405 = true;

    @ObfuscatedName("o.g(IB)Lje;")
    public static class267 method460(int arg0) {
        class267 var1 = (class267) field3407.method3879((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field50.method4438(11, arg0);
        class267 var3 = new class267();
        if (var2 != null) {
            var3.method4768(new class185(var2));
        }
        var3.method4778();
        field3407.method3885(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("je.r(I)V")
    public void method4778() {
    }

    @ObfuscatedName("je.e(Lgl;I)V")
    public void method4768(class185 arg0) {
        while (true) {
            int var2 = arg0.method3679();
            if (var2 == 0) {
                return;
            }
            this.method4771(arg0, var2);
        }
    }

    @ObfuscatedName("je.q(Lgl;IB)V")
    public void method4771(class185 arg0, int arg1) {
        if (arg1 == 1) {
            byte var3 = arg0.method3627();
            int var4 = var3 & 0xFF;
            if (var4 == 0) {
                throw new IllegalArgumentException("");
            }
            if (var4 >= 128 && var4 < 160) {
                char var5 = class304.field3786[var4 - 128];
                if (var5 == 0) {
                    var5 = '?';
                }
                var4 = var5;
            }
            char var6 = (char) var4;
            this.field3404 = var6;
        } else if (arg1 == 2) {
            this.field3403 = arg0.method3588();
        } else if (arg1 == 4) {
            this.field3405 = false;
        } else if (arg1 == 5) {
            this.field3406 = arg0.method3474();
        }
    }

    @ObfuscatedName("je.c(B)Z")
    public boolean method4772() {
        return this.field3404 == 's';
    }

    @ObfuscatedName("il.i(I)V")
    public static void method4414() {
        field3407.method3880();
    }
}
