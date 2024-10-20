package deob;

@ObfuscatedName("ij")
public class class251 extends class185 {

    @ObfuscatedName("ij.v")
    public static class155 field3238 = new class155(64);

    @ObfuscatedName("ij.d")
    public int field3240 = 0;

    @ObfuscatedName("hg.n(Lig;B)V")
    public static void method3789(class245 arg0) {
        Statics.field3239 = arg0;
    }

    @ObfuscatedName("cd.v(IB)Lij;")
    public static class251 method1712(int arg0) {
        class251 var1 = (class251) field3238.method3220((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3239.method4032(5, arg0);
        class251 var3 = new class251();
        if (var2 != null) {
            var3.method4143(new class311(var2));
        }
        field3238.method3217(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ij.d(Lkx;B)V")
    public void method4143(class311 arg0) {
        while (true) {
            int var2 = arg0.method5310();
            if (var2 == 0) {
                return;
            }
            this.method4150(arg0, var2);
        }
    }

    @ObfuscatedName("ij.c(Lkx;II)V")
    public void method4150(class311 arg0, int arg1) {
        if (arg1 == 2) {
            this.field3240 = arg0.method5247();
        }
    }
}
