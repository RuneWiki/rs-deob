package deob;

@ObfuscatedName("aj")
public class class48 extends class208 {

    @ObfuscatedName("aj.h")
    public static class197 field1064 = new class197(64);

    @ObfuscatedName("aj.e")
    public boolean field1066 = false;

    @ObfuscatedName("cf.i(Lfu;B)V")
    public static void method2022(class171 arg0) {
        Statics.field1065 = arg0;
    }

    @ObfuscatedName("aj.h(Ldn;I)V")
    public void method947(class123 arg0) {
        while (true) {
            int var2 = arg0.method2404();
            if (var2 == 0) {
                return;
            }
            this.method936(arg0, var2);
        }
    }

    @ObfuscatedName("aj.e(Ldn;IB)V")
    public void method936(class123 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1066 = true;
        }
    }
}
