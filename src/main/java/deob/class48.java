package deob;

@ObfuscatedName("aw")
public class class48 extends class208 {

    @ObfuscatedName("aw.z")
    public static class197 field1020 = new class197(64);

    @ObfuscatedName("aw.t")
    public boolean field1021 = false;

    @ObfuscatedName("du.s(Lfu;S)V")
    public static void method2291(class171 arg0) {
        Statics.field1027 = arg0;
    }

    @ObfuscatedName("aw.z(Ldy;I)V")
    public void method928(class123 arg0) {
        while (true) {
            int var2 = arg0.method2363();
            if (var2 == 0) {
                return;
            }
            this.method929(arg0, var2);
        }
    }

    @ObfuscatedName("aw.t(Ldy;II)V")
    public void method929(class123 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1021 = true;
        }
    }
}
