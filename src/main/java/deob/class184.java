package deob;

@ObfuscatedName("gw")
public class class184 extends class406 {

    @ObfuscatedName("gw.h")
    public static class256 field2000 = new class256(64);

    @ObfuscatedName("gw.w")
    public char field2001;

    @ObfuscatedName("gw.v")
    public int field1999;

    @ObfuscatedName("gw.c")
    public String field1997;

    @ObfuscatedName("gw.q")
    public boolean field1996 = true;

    @ObfuscatedName("og.s(II)Lgw;")
    public static class184 method6425(int arg0) {
        class184 var1 = (class184) field2000.method4599((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1998.method5179(11, arg0);
        class184 var3 = new class184();
        if (var2 != null) {
            var3.method3168(new class444(var2));
        }
        var3.method3167();
        field2000.method4600(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gw.h(B)V")
    public void method3167() {
    }

    @ObfuscatedName("gw.w(Lqr;I)V")
    public void method3168(class444 arg0) {
        while (true) {
            int var2 = arg0.method6929();
            if (var2 == 0) {
                return;
            }
            this.method3169(arg0, var2);
        }
    }

    @ObfuscatedName("gw.v(Lqr;II)V")
    public void method3169(class444 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2001 = class342.method2395(arg0.method6930());
        } else if (arg1 == 2) {
            this.field1999 = arg0.method6934();
        } else if (arg1 == 4) {
            this.field1996 = false;
        } else if (arg1 == 5) {
            this.field1997 = arg0.method6975();
        }
    }

    @ObfuscatedName("gw.c(I)Z")
    public boolean method3170() {
        return this.field2001 == 's';
    }
}
