package deob;

@ObfuscatedName("gl")
public class class186 extends class407 {

    @ObfuscatedName("gl.p")
    public static class257 field2041 = new class257(64);

    @ObfuscatedName("gl.f")
    public class421 field2040;

    @ObfuscatedName("dc.c(Llv;I)V")
    public static void method2829(class317 arg0) {
        Statics.field2038 = arg0;
    }

    @ObfuscatedName("gq.p(IB)Lgl;")
    public static class186 method3334(int arg0) {
        class186 var1 = (class186) field2041.method4789((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2038.method5499(34, arg0);
        class186 var3 = new class186();
        if (var2 != null) {
            var3.method3363(new class445(var2));
        }
        var3.method3362();
        field2041.method4781(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gl.f(I)V")
    public void method3362() {
    }

    @ObfuscatedName("gl.n(Lqq;B)V")
    public void method3363(class445 arg0) {
        while (true) {
            int var2 = arg0.method7196();
            if (var2 == 0) {
                return;
            }
            this.method3364(arg0, var2);
        }
    }

    @ObfuscatedName("gl.k(Lqq;II)V")
    public void method3364(class445 arg0, int arg1) {
        if (arg1 == 249) {
            this.field2040 = class176.method643(arg0, this.field2040);
        }
    }

    @ObfuscatedName("gl.w(IIB)I")
    public int method3374(int arg0, int arg1) {
        return class176.method3147(this.field2040, arg0, arg1);
    }

    @ObfuscatedName("gl.s(ILjava/lang/String;I)Ljava/lang/String;")
    public String method3366(int arg0, String arg1) {
        class421 var3 = this.field2040;
        String var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class408 var5 = (class408) var3.method6917((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = (String) var5.field4500;
            }
        }
        return var4;
    }

    @ObfuscatedName("cq.q(I)V")
    public static void method2441() {
        field2041.method4782();
    }
}
