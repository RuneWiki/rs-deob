package deob;

@ObfuscatedName("au")
public class class45 extends class187 {

    @ObfuscatedName("au.v")
    public static class176 field1005 = new class176(64);

    @ObfuscatedName("au.i")
    public int field1003 = 0;

    @ObfuscatedName("ey.a(Lek;B)V")
    public static void method2703(class151 arg0) {
        Statics.field1004 = arg0;
    }

    @ObfuscatedName("au.v(Ldi;I)V")
    public void method854(class110 arg0) {
        while (true) {
            int var2 = arg0.method2199();
            if (var2 == 0) {
                return;
            }
            this.method857(arg0, var2);
        }
    }

    @ObfuscatedName("au.i(Ldi;II)V")
    public void method857(class110 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1003 = arg0.method2282();
        }
    }
}
