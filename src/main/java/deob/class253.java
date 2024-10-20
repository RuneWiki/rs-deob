package deob;

@ObfuscatedName("ie")
public class class253 extends class195 {

    @ObfuscatedName("ie.s")
    public static class190 field3395 = new class190(64);

    @ObfuscatedName("ie.q")
    public class187 field3396;

    @ObfuscatedName("ie.s(B)V")
    public void method4202() {
    }

    @ObfuscatedName("ie.q(Lfz;I)V")
    public void method4209(class174 arg0) {
        while (true) {
            int var2 = arg0.method2971();
            if (var2 == 0) {
                return;
            }
            this.method4207(arg0, var2);
        }
    }

    @ObfuscatedName("ie.o(Lfz;II)V")
    public void method4207(class174 arg0, int arg1) {
        if (arg1 == 249) {
            this.field3396 = class250.method2227(arg0, this.field3396);
        }
    }

    @ObfuscatedName("ie.g(III)I")
    public int method4206(int arg0, int arg1) {
        return class250.method3857(this.field3396, arg0, arg1);
    }

    @ObfuscatedName("ie.v(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4205(int arg0, String arg1) {
        return class250.method3625(this.field3396, arg0, arg1);
    }
}
