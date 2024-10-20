package deob;

@ObfuscatedName("ih")
public class class253 extends class195 {

    @ObfuscatedName("ih.m")
    public static class190 field3401 = new class190(64);

    @ObfuscatedName("ih.e")
    public class187 field3402;

    @ObfuscatedName("cz.p(Lil;I)V")
    public static void method1468(class236 arg0) {
        Statics.field2794 = arg0;
    }

    @ObfuscatedName("ih.m(B)V")
    public void method4011() {
    }

    @ObfuscatedName("ih.e(Lfr;B)V")
    public void method4012(class174 arg0) {
        while (true) {
            int var2 = arg0.method2810();
            if (var2 == 0) {
                return;
            }
            this.method4013(arg0, var2);
        }
    }

    @ObfuscatedName("ih.t(Lfr;II)V")
    public void method4013(class174 arg0, int arg1) {
        if (arg1 == 249) {
            this.field3402 = class250.method2793(arg0, this.field3402);
        }
    }

    @ObfuscatedName("ih.w(IIB)I")
    public int method4014(int arg0, int arg1) {
        return class250.method1645(this.field3402, arg0, arg1);
    }

    @ObfuscatedName("ih.z(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4019(int arg0, String arg1) {
        return class250.method2742(this.field3402, arg0, arg1);
    }

    @ObfuscatedName("bz.j(B)V")
    public static void method701() {
        field3401.method3180();
    }
}
