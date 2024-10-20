package deob;

@ObfuscatedName("bv")
public class class54 extends class208 {

    @ObfuscatedName("bv.h")
    public static class197 field1147 = new class197(64);

    @ObfuscatedName("bv.e")
    public boolean field1152 = false;

    @ObfuscatedName("cw.i(Lfu;B)V")
    public static void method1828(class171 arg0) {
        Statics.field1148 = arg0;
    }

    @ObfuscatedName("bv.h(Ldn;B)V")
    public void method1056(class123 arg0) {
        while (true) {
            int var2 = arg0.method2404();
            if (var2 == 0) {
                return;
            }
            this.method1053(arg0, var2);
        }
    }

    @ObfuscatedName("bv.e(Ldn;II)V")
    public void method1053(class123 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1152 = true;
        }
    }
}
