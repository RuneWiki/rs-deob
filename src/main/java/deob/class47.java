package deob;

@ObfuscatedName("ak")
public class class47 extends class187 {

    @ObfuscatedName("ak.d")
    public static class176 field1045 = new class176(64);

    @ObfuscatedName("ak.c")
    public int field1046 = 0;

    @ObfuscatedName("ac.p(IB)Lak;")
    public static class47 method639(int arg0) {
        class47 var1 = (class47) field1045.method3198((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1049.method2811(16, arg0);
        class47 var3 = new class47();
        if (var2 != null) {
            var3.method919(new class110(var2));
        }
        field1045.method3193(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ak.y(Ldg;B)V")
    public void method919(class110 arg0) {
        while (true) {
            int var2 = arg0.method2309();
            if (var2 == 0) {
                return;
            }
            this.method920(arg0, var2);
        }
    }

    @ObfuscatedName("ak.d(Ldg;II)V")
    public void method920(class110 arg0, int arg1) {
        if (arg1 == 5) {
            this.field1046 = arg0.method2243();
        }
    }
}
