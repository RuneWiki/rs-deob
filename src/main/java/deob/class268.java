package deob;

@ObfuscatedName("jw")
public class class268 extends class219 {

    @ObfuscatedName("jw.e")
    public static class213 field3443 = new class213(64);

    @ObfuscatedName("jw.b")
    public int field3444 = 0;

    @ObfuscatedName("jw.g(Lgg;I)V")
    public void method4441(class195 arg0) {
        while (true) {
            int var2 = arg0.method3332();
            if (var2 == 0) {
                return;
            }
            this.method4442(arg0, var2);
        }
    }

    @ObfuscatedName("jw.e(Lgg;IB)V")
    public void method4442(class195 arg0, int arg1) {
        if (arg1 == 2) {
            this.field3444 = arg0.method3310();
        }
    }
}
