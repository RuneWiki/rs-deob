package deob;

@ObfuscatedName("jf")
public class class271 extends class219 {

    @ObfuscatedName("jf.e")
    public static class213 field3477 = new class213(64);

    @ObfuscatedName("jf.b")
    public boolean field3474 = false;

    @ObfuscatedName("jf.b(Lgg;I)V")
    public void method4489(class195 arg0) {
        while (true) {
            int var2 = arg0.method3332();
            if (var2 == 0) {
                return;
            }
            this.method4486(arg0, var2);
        }
    }

    @ObfuscatedName("jf.z(Lgg;IB)V")
    public void method4486(class195 arg0, int arg1) {
        if (arg1 == 2) {
            this.field3474 = true;
        }
    }
}
