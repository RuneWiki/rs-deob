package deob;

@ObfuscatedName("au")
public class class50 extends class204 {

    @ObfuscatedName("au.m")
    public static class193 field1103 = new class193(64);

    @ObfuscatedName("au.i")
    public boolean field1100 = false;

    @ObfuscatedName("au.h(Ldp;I)V")
    public void method953(class119 arg0) {
        while (true) {
            int var2 = arg0.method2320();
            if (var2 == 0) {
                return;
            }
            this.method954(arg0, var2);
        }
    }

    @ObfuscatedName("au.m(Ldp;II)V")
    public void method954(class119 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1100 = true;
        }
    }
}
