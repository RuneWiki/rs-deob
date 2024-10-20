package deob;

@ObfuscatedName("gk")
public class class172 extends class488 {

    @ObfuscatedName("gk.aw")
    public static class304 field1839 = new class304(64);

    @ObfuscatedName("gk.al")
    public int field1840 = 0;

    @ObfuscatedName("tu.aq(Lof;B)V")
    public static void method8272(class378 arg0) {
        Statics.field1841 = arg0;
    }

    @ObfuscatedName("dh.aw(II)Lgk;")
    public static class172 method2268(int arg0) {
        class172 var1 = (class172) field1839.method5414((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1841.method6489(5, arg0);
        class172 var3 = new class172();
        if (var2 != null) {
            var3.method3199(new class534(var2));
        }
        field1839.method5421(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gk.al(Luq;B)V")
    public void method3199(class534 arg0) {
        while (true) {
            int var2 = arg0.method8591();
            if (var2 == 0) {
                return;
            }
            this.method3212(arg0, var2);
        }
    }

    @ObfuscatedName("gk.ai(Luq;II)V")
    public void method3212(class534 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1840 = arg0.method8593();
        }
    }

    @ObfuscatedName("lt.ar(B)V")
    public static void method5426() {
        field1839.method5418();
    }
}
