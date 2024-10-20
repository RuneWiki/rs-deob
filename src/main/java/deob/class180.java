package deob;

@ObfuscatedName("gu")
public class class180 extends class488 {

    @ObfuscatedName("gu.aw")
    public static class304 field1891 = new class304(64);

    @ObfuscatedName("gu.al")
    public boolean field1892 = false;

    @ObfuscatedName("ek.aq(Lof;I)V")
    public static void method2754(class378 arg0) {
        Statics.field5158 = arg0;
    }

    @ObfuscatedName("fu.aw(IB)Lgu;")
    public static class180 method3042(int arg0) {
        class180 var1 = (class180) field1891.method5414((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field5158.method6489(19, arg0);
        class180 var3 = new class180();
        if (var2 != null) {
            var3.method3268(new class534(var2));
        }
        field1891.method5421(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gu.al(Luq;I)V")
    public void method3268(class534 arg0) {
        while (true) {
            int var2 = arg0.method8591();
            if (var2 == 0) {
                return;
            }
            this.method3267(arg0, var2);
        }
    }

    @ObfuscatedName("gu.ai(Luq;IS)V")
    public void method3267(class534 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1892 = true;
        }
    }
}
