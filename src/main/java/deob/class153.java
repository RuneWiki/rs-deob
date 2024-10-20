package deob;

@ObfuscatedName("ez")
public class class153 extends class349 {

    @ObfuscatedName("ez.t")
    public static class223 field1697 = new class223(64);

    @ObfuscatedName("ez.v")
    public char field1700;

    @ObfuscatedName("ez.j")
    public int field1696;

    @ObfuscatedName("ez.l")
    public String field1701;

    @ObfuscatedName("ez.n")
    public boolean field1699 = true;

    @ObfuscatedName("lx.s(Ljy;B)V")
    public static void method5309(class277 arg0) {
        Statics.field1698 = arg0;
    }

    @ObfuscatedName("nu.t(II)Lez;")
    public static class153 method5938(int arg0) {
        class153 var1 = (class153) field1697.method3927((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1698.method4459(11, arg0);
        class153 var3 = new class153();
        if (var2 != null) {
            var3.method2588(new class385(var2));
        }
        var3.method2590();
        field1697.method3929(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ez.v(I)V")
    public void method2590() {
    }

    @ObfuscatedName("ez.j(Lnv;B)V")
    public void method2588(class385 arg0) {
        while (true) {
            int var2 = arg0.method5958();
            if (var2 == 0) {
                return;
            }
            this.method2596(arg0, var2);
        }
    }

    @ObfuscatedName("ez.l(Lnv;II)V")
    public void method2596(class385 arg0, int arg1) {
        if (arg1 == 1) {
            byte var3 = arg0.method5959();
            int var4 = var3 & 0xFF;
            if (var4 == 0) {
                throw new IllegalArgumentException("" + Integer.toString(var4, 16));
            }
            if (var4 >= 128 && var4 < 160) {
                char var5 = class304.field3755[var4 - 128];
                if (var5 == 0) {
                    var5 = '?';
                }
                var4 = var5;
            }
            char var6 = (char) var4;
            this.field1700 = var6;
        } else if (arg1 == 2) {
            this.field1696 = arg0.method6182();
        } else if (arg1 == 4) {
            this.field1699 = false;
        } else if (arg1 == 5) {
            this.field1701 = arg0.method5967();
        }
    }

    @ObfuscatedName("ez.n(I)Z")
    public boolean method2591() {
        return this.field1700 == 's';
    }
}
