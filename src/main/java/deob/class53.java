package deob;

@ObfuscatedName("be")
public class class53 extends class204 {

    @ObfuscatedName("be.k")
    public static class193 field1157 = new class193(64);

    @ObfuscatedName("be.t")
    public int field1158 = 0;

    @ObfuscatedName("cf.c(Lfj;I)V")
    public static void method2081(class167 arg0) {
        Statics.field1163 = arg0;
        Statics.field1156 = Statics.field1163.method3046(16);
    }

    @ObfuscatedName("be.k(Ldf;B)V")
    public void method1039(class119 arg0) {
        while (true) {
            int var2 = arg0.method2291();
            if (var2 == 0) {
                return;
            }
            this.method1040(arg0, var2);
        }
    }

    @ObfuscatedName("be.t(Ldf;II)V")
    public void method1040(class119 arg0, int arg1) {
        if (arg1 == 5) {
            this.field1158 = arg0.method2293();
        }
    }
}
