package deob;

@ObfuscatedName("ad")
public class class45 extends class185 {

    @ObfuscatedName("ad.j")
    public static class174 field1007 = new class174(64);

    @ObfuscatedName("ad.z")
    public int field1008 = 0;

    @ObfuscatedName("bo.g(Lei;I)V")
    public static void method1283(class149 arg0) {
        Statics.field1009 = arg0;
    }

    @ObfuscatedName("ad.j(Ldf;I)V")
    public void method795(class108 arg0) {
        while (true) {
            int var2 = arg0.method2083();
            if (var2 == 0) {
                return;
            }
            this.method802(arg0, var2);
        }
    }

    @ObfuscatedName("ad.z(Ldf;II)V")
    public void method802(class108 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1008 = arg0.method2263();
        }
    }
}
