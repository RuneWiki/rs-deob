package deob;

@ObfuscatedName("af")
public class class46 extends class205 {

    @ObfuscatedName("af.j")
    public static class194 field1043 = new class194(64);

    @ObfuscatedName("af.p")
    public boolean field1042 = false;

    @ObfuscatedName("ee.s(Lfa;I)V")
    public static void method2925(class168 arg0) {
        Statics.field1045 = arg0;
    }

    @ObfuscatedName("af.j(Lds;I)V")
    public void method903(class120 arg0) {
        while (true) {
            int var2 = arg0.method2338();
            if (var2 == 0) {
                return;
            }
            this.method902(arg0, var2);
        }
    }

    @ObfuscatedName("af.p(Lds;II)V")
    public void method902(class120 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1042 = true;
        }
    }
}
