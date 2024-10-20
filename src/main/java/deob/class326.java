package deob;

@ObfuscatedName("mq")
public class class326 extends class508 {

    @ObfuscatedName("mq.ac")
    public class324 field3424;

    @ObfuscatedName("mq.ae")
    public int field3425;

    @ObfuscatedName("mq.ag")
    public class550 field3426;

    @ObfuscatedName("mq.am")
    public int field3432;

    @ObfuscatedName("mq.ax")
    public static class326[] field3428 = new class326[300];

    @ObfuscatedName("mq.aq")
    public static int field3429 = 0;

    @ObfuscatedName("fs.ac(Lmz;Lvd;B)Lmq;")
    public static class326 method3199(class324 arg0, class568 arg1) {
        class326 var2;
        if (field3429 == 0) {
            var2 = new class326();
        } else {
            var2 = field3428[--field3429];
        }
        var2.field3424 = arg0;
        var2.field3425 = arg0.field3409;
        if (var2.field3425 == -1) {
            var2.field3426 = new class550(260);
        } else if (var2.field3425 == -2) {
            var2.field3426 = new class550(10000);
        } else if (var2.field3425 <= 18) {
            var2.field3426 = new class550(20);
        } else if (var2.field3425 <= 98) {
            var2.field3426 = new class550(100);
        } else {
            var2.field3426 = new class550(260);
        }
        var2.field3426.method8916(arg1);
        var2.field3426.method8917(var2.field3424.field3408);
        var2.field3432 = 0;
        return var2;
    }

    @ObfuscatedName("mq.ae(I)V")
    public void method5750() {
        if (field3429 < field3428.length) {
            field3428[++field3429 - 1] = this;
        }
    }
}
