package deob;

@ObfuscatedName("bl")
public class class54 extends class208 {

    @ObfuscatedName("bl.q")
    public static class197 field1154 = new class197(64);

    @ObfuscatedName("bl.f")
    public boolean field1155 = false;

    @ObfuscatedName("r.k(Lfo;I)V")
    public static void method170(class171 arg0) {
        Statics.field1153 = arg0;
    }

    @ObfuscatedName("aa.q(II)Lbl;")
    public static class54 method720(int arg0) {
        class54 var1 = (class54) field1154.method3535((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1153.method3097(15, arg0);
        class54 var3 = new class54();
        if (var2 != null) {
            var3.method1050(new class123(var2));
        }
        field1154.method3537(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("bl.f(Lde;B)V")
    public void method1050(class123 arg0) {
        while (true) {
            int var2 = arg0.method2427();
            if (var2 == 0) {
                return;
            }
            this.method1052(arg0, var2);
        }
    }

    @ObfuscatedName("bl.c(Lde;II)V")
    public void method1052(class123 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1155 = true;
        }
    }
}
