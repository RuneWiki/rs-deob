package deob;

@ObfuscatedName("az")
public class class50 extends class205 {

    @ObfuscatedName("az.i")
    public static class194 field1099 = new class194(64);

    @ObfuscatedName("az.g")
    public boolean field1098 = false;

    @ObfuscatedName("ag.t(Lfp;I)V")
    public static void method624(class168 arg0) {
        Statics.field1100 = arg0;
    }

    @ObfuscatedName("az.i(Ldr;B)V")
    public void method942(class120 arg0) {
        while (true) {
            int var2 = arg0.method2334();
            if (var2 == 0) {
                return;
            }
            this.method949(arg0, var2);
        }
    }

    @ObfuscatedName("az.g(Ldr;II)V")
    public void method949(class120 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1098 = true;
        }
    }
}
