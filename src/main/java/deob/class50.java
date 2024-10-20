package deob;

@ObfuscatedName("as")
public class class50 extends class204 {

    @ObfuscatedName("as.v")
    public static class193 field1095 = new class193(64);

    @ObfuscatedName("as.r")
    public boolean field1092 = false;

    @ObfuscatedName("as.i(Ldx;I)V")
    public void method994(class119 arg0) {
        while (true) {
            int var2 = arg0.method2380();
            if (var2 == 0) {
                return;
            }
            this.method995(arg0, var2);
        }
    }

    @ObfuscatedName("as.v(Ldx;II)V")
    public void method995(class119 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1092 = true;
        }
    }
}
