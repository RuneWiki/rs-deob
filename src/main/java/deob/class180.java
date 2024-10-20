package deob;

@ObfuscatedName("gt")
public class class180 extends class501 {

    @ObfuscatedName("gt.ag")
    public static class313 field1874 = new class313(64);

    @ObfuscatedName("gt.ak")
    public int field1877 = 0;

    @ObfuscatedName("ib.aq(IB)Lgt;")
    public static class180 method3920(int arg0) {
        class180 var1 = (class180) field1874.method5495((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1879.method6539(16, arg0);
        class180 var3 = new class180();
        if (var2 != null) {
            var3.method3272(new class547(var2));
        }
        field1874.method5498(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gt.ad(Lvp;I)V")
    public void method3272(class547 arg0) {
        while (true) {
            int var2 = arg0.method8804();
            if (var2 == 0) {
                return;
            }
            this.method3273(arg0, var2);
        }
    }

    @ObfuscatedName("gt.ag(Lvp;IB)V")
    public void method3273(class547 arg0, int arg1) {
        if (arg1 == 5) {
            this.field1877 = arg0.method8899();
        }
    }

    @ObfuscatedName("dt.ak(B)V")
    public static void method2287() {
        field1874.method5500();
    }
}
