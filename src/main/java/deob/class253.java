package deob;

@ObfuscatedName("il")
public class class253 extends class195 {

    @ObfuscatedName("il.o")
    public static class190 field3375 = new class190(64);

    @ObfuscatedName("il.m")
    public class187 field3372;

    @ObfuscatedName("l.e(Lin;B)V")
    public static void method121(class236 arg0) {
        Statics.field3371 = arg0;
    }

    @ObfuscatedName("il.o(I)V")
    public void method4078() {
    }

    @ObfuscatedName("il.m(Lfw;I)V")
    public void method4075(class174 arg0) {
        while (true) {
            int var2 = arg0.method2891();
            if (var2 == 0) {
                return;
            }
            this.method4076(arg0, var2);
        }
    }

    @ObfuscatedName("il.g(Lfw;II)V")
    public void method4076(class174 arg0, int arg1) {
        if (arg1 == 249) {
            this.field3372 = class250.method925(arg0, this.field3372);
        }
    }

    @ObfuscatedName("il.d(III)I")
    public int method4082(int arg0, int arg1) {
        return class250.method2858(this.field3372, arg0, arg1);
    }

    @ObfuscatedName("il.b(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4084(int arg0, String arg1) {
        return class250.method1539(this.field3372, arg0, arg1);
    }
}
