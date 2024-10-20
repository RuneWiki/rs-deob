package deob;

@ObfuscatedName("bl")
public class class55 extends class208 {

    @ObfuscatedName("bl.l")
    public static class197 field1166 = new class197(64);

    @ObfuscatedName("bl.c")
    public int field1169 = 0;

    @ObfuscatedName("t.e(Lfe;I)V")
    public static void method156(class171 arg0) {
        Statics.field1170 = arg0;
    }

    @ObfuscatedName("bl.l(Ldd;B)V")
    public void method1127(class123 arg0) {
        while (true) {
            int var2 = arg0.method2464();
            if (var2 == 0) {
                return;
            }
            this.method1112(arg0, var2);
        }
    }

    @ObfuscatedName("bl.c(Ldd;II)V")
    public void method1112(class123 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1169 = arg0.method2466();
        }
    }
}
