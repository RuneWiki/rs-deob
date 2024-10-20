package deob;

@ObfuscatedName("ai")
public class class51 extends class208 {

    @ObfuscatedName("ai.r")
    public static class197 field1090 = new class197(64);

    @ObfuscatedName("ai.j")
    public int field1091;

    @ObfuscatedName("ai.z")
    public int field1094;

    @ObfuscatedName("ai.i")
    public int field1093;

    @ObfuscatedName("dg.x(Lfp;I)V")
    public static void method2683(class171 arg0) {
        Statics.field1092 = arg0;
    }

    @ObfuscatedName("aq.r(IB)Lai;")
    public static class51 method643(int arg0) {
        class51 var1 = (class51) field1090.method3533((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1092.method3079(14, arg0);
        class51 var3 = new class51();
        if (var2 != null) {
            var3.method986(new class123(var2));
        }
        field1090.method3535(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ai.j(Ldp;B)V")
    public void method986(class123 arg0) {
        while (true) {
            int var2 = arg0.method2408();
            if (var2 == 0) {
                return;
            }
            this.method983(arg0, var2);
        }
    }

    @ObfuscatedName("ai.z(Ldp;IB)V")
    public void method983(class123 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1091 = arg0.method2403();
            this.field1094 = arg0.method2408();
            this.field1093 = arg0.method2408();
        }
    }
}
