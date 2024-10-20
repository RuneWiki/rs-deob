package deob;

@ObfuscatedName("an")
public class class37 extends class172 {

    @ObfuscatedName("an.h")
    public static class168 field954 = new class168(64);

    @ObfuscatedName("an.c")
    public int field952;

    @ObfuscatedName("an.p")
    public int field953;

    @ObfuscatedName("an.i")
    public int field950;

    @ObfuscatedName("client.z(Len;I)V")
    public static void method466(class150 arg0) {
        Statics.field961 = arg0;
    }

    @ObfuscatedName("an.h(Ldq;B)V")
    public void method808(class126 arg0) {
        while (true) {
            int var2 = arg0.method2450();
            if (var2 == 0) {
                return;
            }
            this.method806(arg0, var2);
        }
    }

    @ObfuscatedName("an.c(Ldq;II)V")
    public void method806(class126 arg0, int arg1) {
        if (arg1 == 1) {
            this.field952 = arg0.method2627();
            this.field953 = arg0.method2450();
            this.field950 = arg0.method2450();
        }
    }
}
