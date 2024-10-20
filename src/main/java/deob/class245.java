package deob;

@ObfuscatedName("ih")
public class class245 extends class196 {

    @ObfuscatedName("ih.j")
    public static class191 field3316 = new class191(64);

    @ObfuscatedName("ih.a")
    public boolean field3317 = false;

    @ObfuscatedName("ih.i(Lfp;I)V")
    public void method3994(class175 arg0) {
        while (true) {
            int var2 = arg0.method2999();
            if (var2 == 0) {
                return;
            }
            this.method3996(arg0, var2);
        }
    }

    @ObfuscatedName("ih.j(Lfp;II)V")
    public void method3996(class175 arg0, int arg1) {
        if (arg1 == 2) {
            this.field3317 = true;
        }
    }
}
