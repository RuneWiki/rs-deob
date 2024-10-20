package deob;

@ObfuscatedName("av")
public class class42 extends class174 {

    @ObfuscatedName("av.a")
    public static class170 field1044 = new class170(64);

    @ObfuscatedName("av.l")
    public int field1045 = 0;

    @ObfuscatedName("cd.i(Lef;B)V")
    public static void method1787(class152 arg0) {
        Statics.field1047 = arg0;
        Statics.field1043 = Statics.field1047.method2945(16);
    }

    @ObfuscatedName("av.p(Ldn;I)V")
    public void method867(class127 arg0) {
        while (true) {
            int var2 = arg0.method2411();
            if (var2 == 0) {
                return;
            }
            this.method866(arg0, var2);
        }
    }

    @ObfuscatedName("av.a(Ldn;II)V")
    public void method866(class127 arg0, int arg1) {
        if (arg1 == 5) {
            this.field1045 = arg0.method2413();
        }
    }

    @ObfuscatedName("ah.l(B)V")
    public static void method811() {
        field1044.method3226();
    }
}
