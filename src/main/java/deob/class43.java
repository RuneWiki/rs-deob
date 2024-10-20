package deob;

@ObfuscatedName("ag")
public class class43 extends class185 {

    @ObfuscatedName("ag.k")
    public static class174 field991 = new class174(64);

    @ObfuscatedName("ag.y")
    public int field992;

    @ObfuscatedName("ag.e")
    public int field1000;

    @ObfuscatedName("ag.r")
    public int field994;

    @ObfuscatedName("i.f(Lev;I)V")
    public static void method551(class149 arg0) {
        Statics.field1001 = arg0;
    }

    @ObfuscatedName("ag.k(Ldu;I)V")
    public void method860(class108 arg0) {
        while (true) {
            int var2 = arg0.method2158();
            if (var2 == 0) {
                return;
            }
            this.method851(arg0, var2);
        }
    }

    @ObfuscatedName("ag.y(Ldu;II)V")
    public void method851(class108 arg0, int arg1) {
        if (arg1 == 1) {
            this.field992 = arg0.method2160();
            this.field1000 = arg0.method2158();
            this.field994 = arg0.method2158();
        }
    }

    @ObfuscatedName("v.e(S)V")
    public static void method150() {
        field991.method3223();
    }
}
