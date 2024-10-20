package deob;

@ObfuscatedName("af")
public class class51 extends class198 {

    @ObfuscatedName("af.z")
    public static class187 field1133 = new class187(64);

    @ObfuscatedName("af.l")
    public int field1134 = 0;

    @ObfuscatedName("ai.j(II)Laf;")
    public static class51 method810(int arg0) {
        class51 var1 = (class51) field1133.method3432((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1135.method2995(16, arg0);
        class51 var3 = new class51();
        if (var2 != null) {
            var3.method1091(new class114(var2));
        }
        field1133.method3434(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("af.y(Lde;I)V")
    public void method1091(class114 arg0) {
        while (true) {
            int var2 = arg0.method2322();
            if (var2 == 0) {
                return;
            }
            this.method1092(arg0, var2);
        }
    }

    @ObfuscatedName("af.z(Lde;II)V")
    public void method1092(class114 arg0, int arg1) {
        if (arg1 == 5) {
            this.field1134 = arg0.method2324();
        }
    }
}
