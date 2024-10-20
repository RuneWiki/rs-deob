package deob;

@ObfuscatedName("au")
public class class48 extends class208 {

    @ObfuscatedName("au.g")
    public static class197 field1074 = new class197(64);

    @ObfuscatedName("au.r")
    public boolean field1072 = false;

    @ObfuscatedName("do.l(II)Lau;")
    public static class48 method2394(int arg0) {
        class48 var1 = (class48) field1074.method3653((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1077.method3210(19, arg0);
        class48 var3 = new class48();
        if (var2 != null) {
            var3.method974(new class123(var2));
        }
        field1074.method3655(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("au.g(Ldc;I)V")
    public void method974(class123 arg0) {
        while (true) {
            int var2 = arg0.method2490();
            if (var2 == 0) {
                return;
            }
            this.method975(arg0, var2);
        }
    }

    @ObfuscatedName("au.r(Ldc;II)V")
    public void method975(class123 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1072 = true;
        }
    }
}
