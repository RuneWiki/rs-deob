package deob;

@ObfuscatedName("af")
public class class47 extends class185 {

    @ObfuscatedName("af.z")
    public static class174 field1067 = new class174(64);

    @ObfuscatedName("af.b")
    public int field1068 = 0;

    @ObfuscatedName("aa.g(II)Laf;")
    public static class47 method756(int arg0) {
        class47 var1 = (class47) field1067.method3097((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1065.method2660(16, arg0);
        class47 var3 = new class47();
        if (var2 != null) {
            var3.method860(new class108(var2));
        }
        field1067.method3099(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("af.j(Ldf;B)V")
    public void method860(class108 arg0) {
        while (true) {
            int var2 = arg0.method2083();
            if (var2 == 0) {
                return;
            }
            this.method861(arg0, var2);
        }
    }

    @ObfuscatedName("af.z(Ldf;II)V")
    public void method861(class108 arg0, int arg1) {
        if (arg1 == 5) {
            this.field1068 = arg0.method2263();
        }
    }
}
