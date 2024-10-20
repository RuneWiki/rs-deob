package deob;

@ObfuscatedName("af")
public class class47 extends class185 {

    @ObfuscatedName("af.y")
    public static class174 field1074 = new class174(64);

    @ObfuscatedName("af.e")
    public int field1073 = 0;

    @ObfuscatedName("ej.f(II)Laf;")
    public static class47 method2889(int arg0) {
        class47 var1 = (class47) field1074.method3207((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1077.method2763(16, arg0);
        class47 var3 = new class47();
        if (var2 != null) {
            var3.method950(new class108(var2));
        }
        field1074.method3209(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("af.k(Ldu;I)V")
    public void method950(class108 arg0) {
        while (true) {
            int var2 = arg0.method2158();
            if (var2 == 0) {
                return;
            }
            this.method943(arg0, var2);
        }
    }

    @ObfuscatedName("af.y(Ldu;II)V")
    public void method943(class108 arg0, int arg1) {
        if (arg1 == 5) {
            this.field1073 = arg0.method2160();
        }
    }
}
