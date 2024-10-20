package deob;

@ObfuscatedName("id")
public class class253 extends class195 {

    @ObfuscatedName("id.j")
    public static class190 field3395 = new class190(64);

    @ObfuscatedName("id.n")
    public class187 field3393;

    @ObfuscatedName("id.a(B)V")
    public void method4091() {
    }

    @ObfuscatedName("id.j(Lfe;I)V")
    public void method4068(class174 arg0) {
        while (true) {
            int var2 = arg0.method2871();
            if (var2 == 0) {
                return;
            }
            this.method4069(arg0, var2);
        }
    }

    @ObfuscatedName("id.n(Lfe;II)V")
    public void method4069(class174 arg0, int arg1) {
        if (arg1 == 249) {
            this.field3393 = class250.method1405(arg0, this.field3393);
        }
    }

    @ObfuscatedName("id.r(IIB)I")
    public int method4070(int arg0, int arg1) {
        return class250.method2715(this.field3393, arg0, arg1);
    }

    @ObfuscatedName("id.v(ILjava/lang/String;B)Ljava/lang/String;")
    public String method4085(int arg0, String arg1) {
        return class250.method2741(this.field3393, arg0, arg1);
    }

    @ObfuscatedName("gv.e(I)V")
    public static void method3405() {
        field3395.method3244();
    }
}
