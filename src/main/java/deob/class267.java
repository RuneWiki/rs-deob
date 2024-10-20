package deob;

@ObfuscatedName("jx")
public class class267 extends class209 {

    @ObfuscatedName("jx.l")
    public static class203 field3394 = new class203(64);

    @ObfuscatedName("jx.w")
    public char field3396;

    @ObfuscatedName("jx.s")
    public int field3397;

    @ObfuscatedName("jx.e")
    public String field3398;

    @ObfuscatedName("jx.a")
    public boolean field3395 = true;

    @ObfuscatedName("i.f(II)Ljx;")
    public static class267 method281(int arg0) {
        class267 var1 = (class267) field3394.method3737((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3399.method4289(11, arg0);
        class267 var3 = new class267();
        if (var2 != null) {
            var3.method4632(new class185(var2));
        }
        var3.method4636();
        field3394.method3744(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jx.l(B)V")
    public void method4636() {
    }

    @ObfuscatedName("jx.w(Lgm;I)V")
    public void method4632(class185 arg0) {
        while (true) {
            int var2 = arg0.method3344();
            if (var2 == 0) {
                return;
            }
            this.method4634(arg0, var2);
        }
    }

    @ObfuscatedName("jx.s(Lgm;IB)V")
    public void method4634(class185 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3396 = class304.method4941(arg0.method3345());
        } else if (arg1 == 2) {
            this.field3397 = arg0.method3432();
        } else if (arg1 == 4) {
            this.field3395 = false;
        } else if (arg1 == 5) {
            this.field3398 = arg0.method3353();
        }
    }

    @ObfuscatedName("jx.e(B)Z")
    public boolean method4645() {
        return this.field3396 == 's';
    }
}
