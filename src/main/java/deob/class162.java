package deob;

@ObfuscatedName("fp")
public class class162 extends class142 {

    @ObfuscatedName("fp.j")
    public static class100 field2475 = new class100(64);

    @ObfuscatedName("fp.z")
    public int field2477 = 0;

    @ObfuscatedName("fp.z(Lev;I)V")
    public void method2569(class135 arg0) {
        while (true) {
            int var2 = arg0.method1600();
            if (var2 == 0) {
                return;
            }
            this.method2566(arg0, var2);
        }
    }

    @ObfuscatedName("fp.g(Lev;II)V")
    public void method2566(class135 arg0, int arg1) {
        if (arg1 == 2) {
            this.field2477 = arg0.method1602();
        }
    }
}
