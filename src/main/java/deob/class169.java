package deob;

@ObfuscatedName("fz")
public class class169 extends class406 {

    @ObfuscatedName("fz.h")
    public static class256 field1798 = new class256(64);

    @ObfuscatedName("fz.w")
    public int field1799 = 0;

    @ObfuscatedName("fz.h(Lqr;B)V")
    public void method2939(class444 arg0) {
        while (true) {
            int var2 = arg0.method6929();
            if (var2 == 0) {
                return;
            }
            this.method2940(arg0, var2);
        }
    }

    @ObfuscatedName("fz.w(Lqr;II)V")
    public void method2940(class444 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1799 = arg0.method7120();
        }
    }
}
