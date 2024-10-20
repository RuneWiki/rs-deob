package deob;

@ObfuscatedName("it")
public class class254 extends class207 {

    @ObfuscatedName("it.m")
    public static class201 field3249 = new class201(64);

    @ObfuscatedName("it.q")
    public int field3250 = 0;

    @ObfuscatedName("il.w(II)Lit;")
    public static class254 method4246(int arg0) {
        class254 var1 = (class254) field3249.method3707((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3248.method4250(5, arg0);
        class254 var3 = new class254();
        if (var2 != null) {
            var3.method4431(new class183(var2));
        }
        field3249.method3712(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("it.m(Lgy;I)V")
    public void method4431(class183 arg0) {
        while (true) {
            int var2 = arg0.method3436();
            if (var2 == 0) {
                return;
            }
            this.method4426(arg0, var2);
        }
    }

    @ObfuscatedName("it.q(Lgy;II)V")
    public void method4426(class183 arg0, int arg1) {
        if (arg1 == 2) {
            this.field3250 = arg0.method3268();
        }
    }
}
