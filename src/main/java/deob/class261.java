package deob;

@ObfuscatedName("jb")
public class class261 extends class181 {

    @ObfuscatedName("jb.f")
    public static class146 field3377 = new class146(64);

    @ObfuscatedName("jb.q")
    public char field3381;

    @ObfuscatedName("jb.w")
    public int field3379;

    @ObfuscatedName("jb.o")
    public String field3380;

    @ObfuscatedName("jb.u")
    public boolean field3382 = true;

    @ObfuscatedName("hz.m(IB)Ljb;")
    public static class261 method4106(int arg0) {
        class261 var1 = (class261) field3377.method3011((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3378.method4156(11, arg0);
        class261 var3 = new class261();
        if (var2 != null) {
            var3.method4499(new class202(var2));
        }
        var3.method4498();
        field3377.method3009(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jb.f(B)V")
    public void method4498() {
    }

    @ObfuscatedName("jb.q(Lgr;I)V")
    public void method4499(class202 arg0) {
        while (true) {
            int var2 = arg0.method3551();
            if (var2 == 0) {
                return;
            }
            this.method4500(arg0, var2);
        }
    }

    @ObfuscatedName("jb.w(Lgr;II)V")
    public void method4500(class202 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3381 = class305.method154(arg0.method3537());
        } else if (arg1 == 2) {
            this.field3379 = arg0.method3620();
        } else if (arg1 == 4) {
            this.field3382 = false;
        } else if (arg1 == 5) {
            this.field3380 = arg0.method3426();
        }
    }

    @ObfuscatedName("jb.o(I)Z")
    public boolean method4504() {
        return this.field3381 == 's';
    }

    @ObfuscatedName("ib.u(I)V")
    public static void method4340() {
        field3377.method3010();
    }
}
