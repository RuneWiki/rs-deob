package deob;

@ObfuscatedName("ih")
public class class243 extends class176 {

    @ObfuscatedName("ih.x")
    public static class146 field3209 = new class146(64);

    @ObfuscatedName("ih.t")
    public boolean field3210 = false;

    @ObfuscatedName("kj.c(Lhz;B)V")
    public static void method4941(class234 arg0) {
        Statics.field3212 = arg0;
    }

    @ObfuscatedName("gu.x(II)Lih;")
    public static class243 method3348(int arg0) {
        class243 var1 = (class243) field3209.method3061((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3212.method3825(19, arg0);
        class243 var3 = new class243();
        if (var2 != null) {
            var3.method4065(new class300(var2));
        }
        field3209.method3062(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ih.t(Lkz;B)V")
    public void method4065(class300 arg0) {
        while (true) {
            int var2 = arg0.method5103();
            if (var2 == 0) {
                return;
            }
            this.method4066(arg0, var2);
        }
    }

    @ObfuscatedName("ih.g(Lkz;IB)V")
    public void method4066(class300 arg0, int arg1) {
        if (arg1 == 2) {
            this.field3210 = true;
        }
    }
}
