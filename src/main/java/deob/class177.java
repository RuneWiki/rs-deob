package deob;

@ObfuscatedName("gf")
public class class177 extends class488 {

    @ObfuscatedName("gf.al")
    public static class304 field1859 = new class304(64);

    @ObfuscatedName("gf.ai")
    public int field1857 = 0;

    @ObfuscatedName("cf.aq(Lof;I)V")
    public static void method2098(class378 arg0) {
        Statics.field1861 = arg0;
        Statics.field1856 = Statics.field1861.method6429(16);
    }

    @ObfuscatedName("fg.aw(IB)Lgf;")
    public static class177 method3053(int arg0) {
        class177 var1 = (class177) field1859.method5414((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1861.method6489(16, arg0);
        class177 var3 = new class177();
        if (var2 != null) {
            var3.method3227(new class534(var2));
        }
        field1859.method5421(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gf.al(Luq;B)V")
    public void method3227(class534 arg0) {
        while (true) {
            int var2 = arg0.method8591();
            if (var2 == 0) {
                return;
            }
            this.method3236(arg0, var2);
        }
    }

    @ObfuscatedName("gf.ai(Luq;II)V")
    public void method3236(class534 arg0, int arg1) {
        if (arg1 == 5) {
            this.field1857 = arg0.method8593();
        }
    }
}
