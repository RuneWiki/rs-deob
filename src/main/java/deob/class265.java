package deob;

@ObfuscatedName("jb")
public class class265 extends class207 {

    @ObfuscatedName("jb.m")
    public static class201 field3346 = new class201(64);

    @ObfuscatedName("jb.q")
    public char field3345;

    @ObfuscatedName("jb.b")
    public int field3349;

    @ObfuscatedName("jb.f")
    public String field3348;

    @ObfuscatedName("jb.n")
    public boolean field3350 = true;

    @ObfuscatedName("iy.w(Liv;I)V")
    public static void method4465(class248 arg0) {
        Statics.field3347 = arg0;
    }

    @ObfuscatedName("gy.m(II)Ljb;")
    public static class265 method3505(int arg0) {
        class265 var1 = (class265) field3346.method3707((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3347.method4250(11, arg0);
        class265 var3 = new class265();
        if (var2 != null) {
            var3.method4572(new class183(var2));
        }
        var3.method4567();
        field3346.method3712(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jb.q(B)V")
    public void method4567() {
    }

    @ObfuscatedName("jb.x(Lgy;I)V")
    public void method4572(class183 arg0) {
        while (true) {
            int var2 = arg0.method3436();
            if (var2 == 0) {
                return;
            }
            this.method4570(arg0, var2);
        }
    }

    @ObfuscatedName("jb.j(Lgy;IB)V")
    public void method4570(class183 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3345 = class302.method977(arg0.method3263());
        } else if (arg1 == 2) {
            this.field3349 = arg0.method3267();
        } else if (arg1 == 4) {
            this.field3350 = false;
        } else if (arg1 == 5) {
            this.field3348 = arg0.method3271();
        }
    }

    @ObfuscatedName("jb.a(B)Z")
    public boolean method4569() {
        return this.field3345 == 's';
    }
}
