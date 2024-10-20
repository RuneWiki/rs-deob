package deob;

@ObfuscatedName("au")
public class class46 extends class205 {

    @ObfuscatedName("au.i")
    public static class194 field1043 = new class194(64);

    @ObfuscatedName("au.g")
    public boolean field1045 = false;

    @ObfuscatedName("au.t(Ldr;I)V")
    public void method890(class120 arg0) {
        while (true) {
            int var2 = arg0.method2334();
            if (var2 == 0) {
                return;
            }
            this.method891(arg0, var2);
        }
    }

    @ObfuscatedName("au.i(Ldr;II)V")
    public void method891(class120 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1045 = true;
        }
    }
}
