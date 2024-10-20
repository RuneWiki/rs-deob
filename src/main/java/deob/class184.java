package deob;

@ObfuscatedName("gf")
public class class184 extends class405 {

    @ObfuscatedName("gf.v")
    public static class256 field2008 = new class256(64);

    @ObfuscatedName("gf.q")
    public char field2006;

    @ObfuscatedName("gf.f")
    public int field2007;

    @ObfuscatedName("gf.j")
    public String field2009;

    @ObfuscatedName("gf.e")
    public boolean field2004 = true;

    @ObfuscatedName("fu.c(IB)Lgf;")
    public static class184 method3143(int arg0) {
        class184 var1 = (class184) field2008.method4691((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2010.method5305(11, arg0);
        class184 var3 = new class184();
        if (var2 != null) {
            var3.method3251(new class443(var2));
        }
        var3.method3263();
        field2008.method4693(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gf.v(B)V")
    public void method3263() {
    }

    @ObfuscatedName("gf.q(Lqt;B)V")
    public void method3251(class443 arg0) {
        while (true) {
            int var2 = arg0.method7047();
            if (var2 == 0) {
                return;
            }
            this.method3253(arg0, var2);
        }
    }

    @ObfuscatedName("gf.f(Lqt;II)V")
    public void method3253(class443 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2006 = Statics.method5030(arg0.method7048());
        } else if (arg1 == 2) {
            this.field2007 = arg0.method7052();
        } else if (arg1 == 4) {
            this.field2004 = false;
        } else if (arg1 == 5) {
            this.field2009 = arg0.method7057();
        }
    }

    @ObfuscatedName("gf.j(B)Z")
    public boolean method3262() {
        return this.field2006 == 's';
    }

    @ObfuscatedName("bb.e(I)V")
    public static void method1797() {
        field2008.method4695();
    }
}
