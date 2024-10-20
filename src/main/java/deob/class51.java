package deob;

@ObfuscatedName("as")
public class class51 extends class208 {

    @ObfuscatedName("as.q")
    public static class197 field1103 = new class197(64);

    @ObfuscatedName("as.f")
    public int field1104;

    @ObfuscatedName("as.c")
    public int field1102;

    @ObfuscatedName("as.v")
    public int field1106;

    @ObfuscatedName("hy.k(II)Las;")
    public static class51 method3717(int arg0) {
        class51 var1 = (class51) field1103.method3535((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1105.method3097(14, arg0);
        class51 var3 = new class51();
        if (var2 != null) {
            var3.method1004(new class123(var2));
        }
        field1103.method3537(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("as.q(Lde;I)V")
    public void method1004(class123 arg0) {
        while (true) {
            int var2 = arg0.method2427();
            if (var2 == 0) {
                return;
            }
            this.method999(arg0, var2);
        }
    }

    @ObfuscatedName("as.f(Lde;IB)V")
    public void method999(class123 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1104 = arg0.method2547();
            this.field1102 = arg0.method2427();
            this.field1106 = arg0.method2427();
        }
    }
}
