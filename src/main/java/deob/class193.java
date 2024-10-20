package deob;

@ObfuscatedName("ha")
public class class193 extends class484 {

    @ObfuscatedName("ha.ak")
    public static class302 field1924 = new class302(64);

    @ObfuscatedName("ha.ax")
    public int field1927 = 0;

    @ObfuscatedName("fc.ac(IB)Lha;")
    public static class193 method2997(int arg0) {
        class193 var1 = (class193) field1924.method5286((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1928.method6342(16, arg0);
        class193 var3 = new class193();
        if (var2 != null) {
            var3.method3336(new class530(var2));
        }
        field1924.method5289(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ha.al(Lul;I)V")
    public void method3336(class530 arg0) {
        while (true) {
            int var2 = arg0.method8365();
            if (var2 == 0) {
                return;
            }
            this.method3326(arg0, var2);
        }
    }

    @ObfuscatedName("ha.ak(Lul;IS)V")
    public void method3326(class530 arg0, int arg1) {
        if (arg1 == 5) {
            this.field1927 = arg0.method8598();
        }
    }

    @ObfuscatedName("ea.ax(B)V")
    public static void method2790() {
        field1924.method5288();
    }
}
