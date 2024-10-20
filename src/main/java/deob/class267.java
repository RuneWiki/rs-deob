package deob;

@ObfuscatedName("jn")
public class class267 extends class209 {

    @ObfuscatedName("jn.c")
    public static class203 field3376 = new class203(64);

    @ObfuscatedName("jn.n")
    public char field3375;

    @ObfuscatedName("jn.u")
    public int field3378;

    @ObfuscatedName("jn.i")
    public String field3379;

    @ObfuscatedName("jn.r")
    public boolean field3380 = true;

    @ObfuscatedName("dq.y(Liu;I)V")
    public static void method2376(class250 arg0) {
        Statics.field3377 = arg0;
    }

    @ObfuscatedName("di.c(II)Ljn;")
    public static class267 method2458(int arg0) {
        class267 var1 = (class267) field3376.method3685((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3377.method4263(11, arg0);
        class267 var3 = new class267();
        if (var2 != null) {
            var3.method4588(new class185(var2));
        }
        var3.method4586();
        field3376.method3687(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jn.n(I)V")
    public void method4586() {
    }

    @ObfuscatedName("jn.u(Lge;B)V")
    public void method4588(class185 arg0) {
        while (true) {
            int var2 = arg0.method3299();
            if (var2 == 0) {
                return;
            }
            this.method4598(arg0, var2);
        }
    }

    @ObfuscatedName("jn.i(Lge;IB)V")
    public void method4598(class185 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3375 = class304.method455(arg0.method3319());
        } else if (arg1 == 2) {
            this.field3378 = arg0.method3374();
        } else if (arg1 == 4) {
            this.field3380 = false;
        } else if (arg1 == 5) {
            this.field3379 = arg0.method3277();
        }
    }

    @ObfuscatedName("jn.p(I)Z")
    public boolean method4589() {
        return this.field3375 == 's';
    }

    @ObfuscatedName("ci.e(B)V")
    public static void method1839() {
        field3376.method3695();
    }
}
