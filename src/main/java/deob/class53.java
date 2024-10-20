package deob;

@ObfuscatedName("bo")
public class class53 extends class204 {

    @ObfuscatedName("bo.k")
    public static class193 field1155 = new class193(64);

    @ObfuscatedName("bo.f")
    public int field1153 = 0;

    @ObfuscatedName("aw.z(Lfl;I)V")
    public static void method599(class167 arg0) {
        Statics.field1154 = arg0;
        Statics.field1156 = Statics.field1154.method2996(16);
    }

    @ObfuscatedName("bo.k(Lda;B)V")
    public void method1051(class119 arg0) {
        while (true) {
            int var2 = arg0.method2457();
            if (var2 == 0) {
                return;
            }
            this.method1041(arg0, var2);
        }
    }

    @ObfuscatedName("bo.f(Lda;II)V")
    public void method1041(class119 arg0, int arg1) {
        if (arg1 == 5) {
            this.field1153 = arg0.method2415();
        }
    }
}
