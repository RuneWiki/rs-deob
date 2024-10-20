package deob;

@ObfuscatedName("iw")
public class class245 extends class195 {

    @ObfuscatedName("iw.s")
    public static class190 field3316 = new class190(64);

    @ObfuscatedName("iw.q")
    public boolean field3320 = false;

    @ObfuscatedName("cp.w(IB)Liw;")
    public static class245 method1491(int arg0) {
        class245 var1 = (class245) field3316.method3357((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3317.method3876(15, arg0);
        class245 var3 = new class245();
        if (var2 != null) {
            var3.method4060(new class174(var2));
        }
        field3316.method3371(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("iw.s(Lfz;I)V")
    public void method4060(class174 arg0) {
        while (true) {
            int var2 = arg0.method2971();
            if (var2 == 0) {
                return;
            }
            this.method4061(arg0, var2);
        }
    }

    @ObfuscatedName("iw.q(Lfz;IB)V")
    public void method4061(class174 arg0, int arg1) {
        if (arg1 == 2) {
            this.field3320 = true;
        }
    }
}
