package deob;

@ObfuscatedName("ip")
public class class243 extends class176 {

    @ObfuscatedName("ip.j")
    public static class146 field3218 = new class146(64);

    @ObfuscatedName("ip.i")
    public boolean field3215 = false;

    @ObfuscatedName("fj.s(II)Lip;")
    public static class243 method3216(int arg0) {
        class243 var1 = (class243) field3218.method3065((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3216.method3790(19, arg0);
        class243 var3 = new class243();
        if (var2 != null) {
            var3.method4001(new class300(var2));
        }
        field3218.method3067(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ip.j(Lky;I)V")
    public void method4001(class300 arg0) {
        while (true) {
            int var2 = arg0.method5179();
            if (var2 == 0) {
                return;
            }
            this.method4002(arg0, var2);
        }
    }

    @ObfuscatedName("ip.i(Lky;II)V")
    public void method4002(class300 arg0, int arg1) {
        if (arg1 == 2) {
            this.field3215 = true;
        }
    }
}
