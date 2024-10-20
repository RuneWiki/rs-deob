package deob;

@ObfuscatedName("am")
public class class46 extends class205 {

    @ObfuscatedName("am.g")
    public static class194 field1026 = new class194(64);

    @ObfuscatedName("am.j")
    public boolean field1025 = false;

    @ObfuscatedName("cc.b(Lfl;I)V")
    public static void method1752(class168 arg0) {
        Statics.field585 = arg0;
    }

    @ObfuscatedName("am.g(Lds;I)V")
    public void method930(class120 arg0) {
        while (true) {
            int var2 = arg0.method2344();
            if (var2 == 0) {
                return;
            }
            this.method931(arg0, var2);
        }
    }

    @ObfuscatedName("am.j(Lds;II)V")
    public void method931(class120 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1025 = true;
        }
    }
}
