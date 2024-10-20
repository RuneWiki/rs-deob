package deob;

@ObfuscatedName("fq")
public class class177 extends class428 {

    @ObfuscatedName("fq.e")
    public static class269 field1917 = new class269(64);

    @ObfuscatedName("fq.v")
    public int field1916 = 0;

    @ObfuscatedName("da.h(Lly;B)V")
    public static void method2578(class333 arg0) {
        Statics.field1918 = arg0;
    }

    @ObfuscatedName("lj.e(IB)Lfq;")
    public static class177 method5784(int arg0) {
        class177 var1 = (class177) field1917.method4917((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1918.method5909(5, arg0);
        class177 var3 = new class177();
        if (var2 != null) {
            var3.method3185(new class467(var2));
        }
        field1917.method4925(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("fq.v(Lqy;I)V")
    public void method3185(class467 arg0) {
        while (true) {
            int var2 = arg0.method7792();
            if (var2 == 0) {
                return;
            }
            this.method3192(arg0, var2);
        }
    }

    @ObfuscatedName("fq.x(Lqy;IB)V")
    public void method3192(class467 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1916 = arg0.method7794();
        }
    }
}
