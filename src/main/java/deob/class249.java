package deob;

@ObfuscatedName("ip")
public class class249 extends class202 {

    @ObfuscatedName("ip.r")
    public static class197 field3340 = new class197(64);

    @ObfuscatedName("ip.g")
    public int field3341 = 0;

    @ObfuscatedName("jv.b(II)Lip;")
    public static class249 method4573(int arg0) {
        class249 var1 = (class249) field3340.method3330((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3342.method3887(16, arg0);
        class249 var3 = new class249();
        if (var2 != null) {
            var3.method3956(new class181(var2));
        }
        field3340.method3332(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ip.s(Lfs;I)V")
    public void method3956(class181 arg0) {
        while (true) {
            int var2 = arg0.method2945();
            if (var2 == 0) {
                return;
            }
            this.method3953(arg0, var2);
        }
    }

    @ObfuscatedName("ip.r(Lfs;IB)V")
    public void method3953(class181 arg0, int arg1) {
        if (arg1 == 5) {
            this.field3341 = arg0.method3081();
        }
    }
}
