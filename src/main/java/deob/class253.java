package deob;

@ObfuscatedName("iv")
public class class253 extends class195 {

    @ObfuscatedName("iv.o")
    public static class190 field3369 = new class190(64);

    @ObfuscatedName("iv.i")
    public class187 field3368;

    @ObfuscatedName("iv.c(S)V")
    public void method4027() {
    }

    @ObfuscatedName("iv.o(Lfp;I)V")
    public void method4031(class174 arg0) {
        while (true) {
            int var2 = arg0.method2843();
            if (var2 == 0) {
                return;
            }
            this.method4029(arg0, var2);
        }
    }

    @ObfuscatedName("iv.i(Lfp;II)V")
    public void method4029(class174 arg0, int arg1) {
        if (arg1 == 249) {
            this.field3368 = class250.method558(arg0, this.field3368);
        }
    }

    @ObfuscatedName("iv.u(III)I")
    public int method4030(int arg0, int arg1) {
        return class250.method1861(this.field3368, arg0, arg1);
    }

    @ObfuscatedName("iv.g(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4041(int arg0, String arg1) {
        return class250.method3707(this.field3368, arg0, arg1);
    }
}
