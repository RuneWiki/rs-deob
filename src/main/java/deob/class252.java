package deob;

@ObfuscatedName("ij")
public class class252 extends class195 {

    @ObfuscatedName("ij.c")
    public static class190 field3385 = new class190(64);

    @ObfuscatedName("ij.e")
    public char field3390;

    @ObfuscatedName("ij.v")
    public int field3387;

    @ObfuscatedName("ij.b")
    public String field3388;

    @ObfuscatedName("ij.y")
    public boolean field3389 = true;

    @ObfuscatedName("as.i(II)Lij;")
    public static class252 method469(int arg0) {
        class252 var1 = (class252) field3385.method3220((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3384.method3769(11, arg0);
        class252 var3 = new class252();
        if (var2 != null) {
            var3.method4086(new class174(var2));
        }
        var3.method4085();
        field3385.method3222(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ij.c(I)V")
    public void method4085() {
    }

    @ObfuscatedName("ij.e(Lfx;B)V")
    public void method4086(class174 arg0) {
        while (true) {
            int var2 = arg0.method2870();
            if (var2 == 0) {
                return;
            }
            this.method4087(arg0, var2);
        }
    }

    @ObfuscatedName("ij.v(Lfx;II)V")
    public void method4087(class174 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3390 = class267.method452(arg0.method2938());
        } else if (arg1 == 2) {
            this.field3387 = arg0.method2875();
        } else if (arg1 == 4) {
            this.field3389 = false;
        } else if (arg1 == 5) {
            this.field3388 = arg0.method2878();
        }
    }

    @ObfuscatedName("ij.b(I)Z")
    public boolean method4088() {
        return this.field3390 == 's';
    }

    @ObfuscatedName("cd.y(I)V")
    public static void method1697() {
        field3385.method3221();
    }
}
