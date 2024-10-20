package deob;

@ObfuscatedName("bo")
public class class55 extends class208 {

    @ObfuscatedName("bo.z")
    public static class197 field1129 = new class197(64);

    @ObfuscatedName("bo.t")
    public int field1128 = 0;

    @ObfuscatedName("x.s(Lfu;B)V")
    public static void method540(class171 arg0) {
        Statics.field1137 = arg0;
    }

    @ObfuscatedName("e.z(IB)Lbo;")
    public static class55 method575(int arg0) {
        class55 var1 = (class55) field1129.method3523((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1137.method3091(5, arg0);
        class55 var3 = new class55();
        if (var2 != null) {
            var3.method1059(new class123(var2));
        }
        field1129.method3521(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("bo.t(Ldy;B)V")
    public void method1059(class123 arg0) {
        while (true) {
            int var2 = arg0.method2363();
            if (var2 == 0) {
                return;
            }
            this.method1049(arg0, var2);
        }
    }

    @ObfuscatedName("bo.y(Ldy;IB)V")
    public void method1049(class123 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1128 = arg0.method2550();
        }
    }
}
