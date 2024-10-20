package deob;

@ObfuscatedName("hk")
public class class204 extends class501 {

    @ObfuscatedName("hk.ad")
    public static class313 field2120 = new class313(64);

    @ObfuscatedName("hk.ag")
    public class520 field2122;

    @ObfuscatedName("client.aq(II)Lhk;")
    public static class204 method1746(int arg0) {
        class204 var1 = (class204) field2120.method5495((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2121.method6539(34, arg0);
        class204 var3 = new class204();
        if (var2 != null) {
            var3.method3549(new class547(var2));
        }
        var3.method3548();
        field2120.method5498(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("hk.ad(I)V")
    public void method3548() {
    }

    @ObfuscatedName("hk.ag(Lvp;I)V")
    public void method3549(class547 arg0) {
        while (true) {
            int var2 = arg0.method8804();
            if (var2 == 0) {
                return;
            }
            this.method3550(arg0, var2);
        }
    }

    @ObfuscatedName("hk.ak(Lvp;II)V")
    public void method3550(class547 arg0, int arg1) {
        if (arg1 == 249) {
            this.field2122 = class186.method2650(arg0, this.field2122);
        }
    }

    @ObfuscatedName("hk.ap(IIB)I")
    public int method3551(int arg0, int arg1) {
        return class186.method4567(this.field2122, arg0, arg1);
    }

    @ObfuscatedName("hk.an(ILjava/lang/String;I)Ljava/lang/String;")
    public String method3552(int arg0, String arg1) {
        return class186.method2668(this.field2122, arg0, arg1);
    }
}
