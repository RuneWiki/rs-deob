package deob;

@ObfuscatedName("an")
public class class50 extends class205 {

    @ObfuscatedName("an.x")
    public static class194 field1102 = new class194(64);

    @ObfuscatedName("an.t")
    public boolean field1103 = false;

    @ObfuscatedName("f.w(II)Lan;")
    public static class50 method586(int arg0) {
        class50 var1 = (class50) field1102.method3520((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1105.method3127(15, arg0);
        class50 var3 = new class50();
        if (var2 != null) {
            var3.method1021(new class120(var2));
        }
        field1102.method3522(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("an.x(Lde;B)V")
    public void method1021(class120 arg0) {
        while (true) {
            int var2 = arg0.method2363();
            if (var2 == 0) {
                return;
            }
            this.method1018(arg0, var2);
        }
    }

    @ObfuscatedName("an.t(Lde;II)V")
    public void method1018(class120 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1103 = true;
        }
    }
}
