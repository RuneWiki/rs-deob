package deob;

@ObfuscatedName("gm")
public class class176 extends class485 {

    @ObfuscatedName("gm.af")
    public static class302 field1831 = new class302(64);

    @ObfuscatedName("gm.aj")
    public int field1830 = 0;

    @ObfuscatedName("dc.am(Low;I)V")
    public static void method2167(class375 arg0) {
        Statics.field1832 = arg0;
        Statics.field3857 = Statics.field1832.method6406(16);
    }

    @ObfuscatedName("ez.ap(IB)Lgm;")
    public static class176 method2945(int arg0) {
        class176 var1 = (class176) field1831.method5400((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1832.method6396(16, arg0);
        class176 var3 = new class176();
        if (var2 != null) {
            var3.method3260(new class531(var2));
        }
        field1831.method5402(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gm.af(Luk;B)V")
    public void method3260(class531 arg0) {
        while (true) {
            int var2 = arg0.method8561();
            if (var2 == 0) {
                return;
            }
            this.method3261(arg0, var2);
        }
    }

    @ObfuscatedName("gm.aj(Luk;II)V")
    public void method3261(class531 arg0, int arg1) {
        if (arg1 == 5) {
            this.field1830 = arg0.method8775();
        }
    }

    @ObfuscatedName("fq.aq(I)V")
    public static void method3102() {
        field1831.method5403();
    }
}
