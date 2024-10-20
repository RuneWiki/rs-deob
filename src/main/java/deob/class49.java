package deob;

@ObfuscatedName("ao")
public class class49 extends class198 {

    @ObfuscatedName("ao.y")
    public static class187 field1071 = new class187(64);

    @ObfuscatedName("ao.z")
    public int field1075 = 0;

    @ObfuscatedName("ht.j(IS)Lao;")
    public static class49 method3605(int arg0) {
        class49 var1 = (class49) field1071.method3432((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1073.method2995(5, arg0);
        class49 var3 = new class49();
        if (var2 != null) {
            var3.method1022(new class114(var2));
        }
        field1071.method3434(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ao.y(Lde;B)V")
    public void method1022(class114 arg0) {
        while (true) {
            int var2 = arg0.method2322();
            if (var2 == 0) {
                return;
            }
            this.method1032(arg0, var2);
        }
    }

    @ObfuscatedName("ao.z(Lde;IB)V")
    public void method1032(class114 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1075 = arg0.method2324();
        }
    }
}
