package deob;

@ObfuscatedName("ad")
public class class51 extends class205 {

    @ObfuscatedName("ad.h")
    public static class194 field1078 = new class194(64);

    @ObfuscatedName("ad.m")
    public int field1080 = 0;

    @ObfuscatedName("ad.j(Ldx;I)V")
    public void method1003(class120 arg0) {
        while (true) {
            int var2 = arg0.method2361();
            if (var2 == 0) {
                return;
            }
            this.method998(arg0, var2);
        }
    }

    @ObfuscatedName("ad.h(Ldx;II)V")
    public void method998(class120 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1080 = arg0.method2363();
        }
    }
}
