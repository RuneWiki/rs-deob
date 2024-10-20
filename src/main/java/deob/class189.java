package deob;

@ObfuscatedName("gv")
public class class189 extends class130 {

    @ObfuscatedName("gv.x")
    public static class125 field2755 = new class125(64);

    @ObfuscatedName("gv.i")
    public boolean field2756 = false;

    @ObfuscatedName("s.u(Lgt;I)V")
    public static void method202(class183 arg0) {
        Statics.field2754 = arg0;
    }

    @ObfuscatedName("gv.x(Len;I)V")
    public void method3223(class154 arg0) {
        while (true) {
            int var2 = arg0.method2708();
            if (var2 == 0) {
                return;
            }
            this.method3224(arg0, var2);
        }
    }

    @ObfuscatedName("gv.i(Len;IB)V")
    public void method3224(class154 arg0, int arg1) {
        if (arg1 == 2) {
            this.field2756 = true;
        }
    }
}
