package deob;

@ObfuscatedName("jp")
public class class262 extends class206 {

    @ObfuscatedName("jp.g")
    public static class201 field3462 = new class201(64);

    @ObfuscatedName("jp.m")
    public int field3463;

    @ObfuscatedName("jp.h")
    public int field3464;

    @ObfuscatedName("jp.i")
    public int field3465;

    @ObfuscatedName("fu.s(II)Ljp;")
    public static class262 method3071(int arg0) {
        class262 var1 = (class262) field3462.method3673((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3461.method4231(14, arg0);
        class262 var3 = new class262();
        if (var2 != null) {
            var3.method4494(new class185(var2));
        }
        field3462.method3675(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jp.g(Lgy;I)V")
    public void method4494(class185 arg0) {
        while (true) {
            int var2 = arg0.method3239();
            if (var2 == 0) {
                return;
            }
            this.method4495(arg0, var2);
        }
    }

    @ObfuscatedName("jp.m(Lgy;IB)V")
    public void method4495(class185 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3463 = arg0.method3241();
            this.field3464 = arg0.method3239();
            this.field3465 = arg0.method3239();
        }
    }
}
