package deob;

@ObfuscatedName("is")
public class class243 extends class196 {

    @ObfuscatedName("is.g")
    public static class191 field3272 = new class191(64);

    @ObfuscatedName("is.y")
    public int field3273 = 0;

    @ObfuscatedName("ag.e(Lit;I)V")
    public static void method207(class237 arg0) {
        Statics.field3275 = arg0;
        Statics.field3271 = Statics.field3275.method3828(16);
    }

    @ObfuscatedName("av.n(II)Lis;")
    public static class243 method467(int arg0) {
        class243 var1 = (class243) field3272.method3288((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3275.method3817(16, arg0);
        class243 var3 = new class243();
        if (var2 != null) {
            var3.method3961(new class175(var2));
        }
        field3272.method3278(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("is.g(Lfh;B)V")
    public void method3961(class175 arg0) {
        while (true) {
            int var2 = arg0.method2928();
            if (var2 == 0) {
                return;
            }
            this.method3962(arg0, var2);
        }
    }

    @ObfuscatedName("is.y(Lfh;IB)V")
    public void method3962(class175 arg0, int arg1) {
        if (arg1 == 5) {
            this.field3273 = arg0.method3091();
        }
    }

    @ObfuscatedName("hi.w(B)V")
    public static void method3773() {
        field3272.method3282();
    }
}
