package deob;

@ObfuscatedName("is")
public class class260 extends class185 {

    @ObfuscatedName("is.m")
    public static class155 field3296 = new class155(64);

    @ObfuscatedName("is.k")
    public char field3303;

    @ObfuscatedName("is.d")
    public int field3299;

    @ObfuscatedName("is.w")
    public String field3300;

    @ObfuscatedName("is.v")
    public boolean field3301 = true;

    @ObfuscatedName("jb.x(IB)Lis;")
    public static class260 method4738(int arg0) {
        class260 var1 = (class260) field3296.method3146((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3298.method3869(11, arg0);
        class260 var3 = new class260();
        if (var2 != null) {
            var3.method4189(new class310(var2));
        }
        var3.method4179();
        field3296.method3152(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("is.m(B)V")
    public void method4179() {
    }

    @ObfuscatedName("is.k(Lkb;I)V")
    public void method4189(class310 arg0) {
        while (true) {
            int var2 = arg0.method5137();
            if (var2 == 0) {
                return;
            }
            this.method4181(arg0, var2);
        }
    }

    @ObfuscatedName("is.d(Lkb;II)V")
    public void method4181(class310 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3303 = class298.method3852(arg0.method5138());
        } else if (arg1 == 2) {
            this.field3299 = arg0.method5142();
        } else if (arg1 == 4) {
            this.field3301 = false;
        } else if (arg1 == 5) {
            this.field3300 = arg0.method5257();
        }
    }

    @ObfuscatedName("is.w(I)Z")
    public boolean method4182() {
        return this.field3303 == 's';
    }
}
