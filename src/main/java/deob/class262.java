package deob;

@ObfuscatedName("jo")
public class class262 extends class185 {

    @ObfuscatedName("jo.b")
    public static class155 field3336 = new class155(64);

    @ObfuscatedName("jo.l")
    public class327 field3337;

    @ObfuscatedName("aj.f(Liw;I)V")
    public static void method659(class245 arg0) {
        Statics.field3335 = arg0;
    }

    @ObfuscatedName("gz.b(IS)Ljo;")
    public static class262 method3420(int arg0) {
        class262 var1 = (class262) field3336.method3155((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3335.method3905(34, arg0);
        class262 var3 = new class262();
        if (var2 != null) {
            var3.method4279(new class311(var2));
        }
        var3.method4278();
        field3336.method3157(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jo.l(I)V")
    public void method4278() {
    }

    @ObfuscatedName("jo.m(Lkb;I)V")
    public void method4279(class311 arg0) {
        while (true) {
            int var2 = arg0.method5276();
            if (var2 == 0) {
                return;
            }
            this.method4301(arg0, var2);
        }
    }

    @ObfuscatedName("jo.z(Lkb;II)V")
    public void method4301(class311 arg0, int arg1) {
        if (arg1 == 249) {
            this.field3337 = class259.method4092(arg0, this.field3337);
        }
    }

    @ObfuscatedName("jo.q(III)I")
    public int method4289(int arg0, int arg1) {
        class327 var3 = this.field3337;
        int var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class189 var5 = (class189) var3.method5561((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = var5.field2139;
            }
        }
        return var4;
    }

    @ObfuscatedName("jo.k(ILjava/lang/String;S)Ljava/lang/String;")
    public String method4294(int arg0, String arg1) {
        return class259.method275(this.field3337, arg0, arg1);
    }

    @ObfuscatedName("jo.c(I)V")
    public static void method4290() {
        field3336.method3158();
    }
}
