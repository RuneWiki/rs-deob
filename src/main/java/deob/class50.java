package deob;

@ObfuscatedName("ao")
public class class50 extends class205 {

    @ObfuscatedName("ao.g")
    public static class194 field1062 = new class194(64);

    @ObfuscatedName("ao.j")
    public boolean field1063 = false;

    @ObfuscatedName("aq.b(Lfl;I)V")
    public static void method741(class168 arg0) {
        Statics.field1067 = arg0;
    }

    @ObfuscatedName("ao.g(Lds;I)V")
    public void method978(class120 arg0) {
        while (true) {
            int var2 = arg0.method2344();
            if (var2 == 0) {
                return;
            }
            this.method979(arg0, var2);
        }
    }

    @ObfuscatedName("ao.j(Lds;II)V")
    public void method979(class120 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1063 = true;
        }
    }
}
