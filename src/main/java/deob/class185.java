package deob;

@ObfuscatedName("gi")
public class class185 extends class405 {

    @ObfuscatedName("gi.v")
    public static class256 field2012 = new class256(64);

    @ObfuscatedName("gi.q")
    public class419 field2015;

    @ObfuscatedName("lw.c(Llh;I)V")
    public static void method5422(class315 arg0) {
        Statics.field2014 = arg0;
    }

    @ObfuscatedName("hp.v(II)Lgi;")
    public static class185 method4241(int arg0) {
        class185 var1 = (class185) field2012.method4691((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2014.method5305(34, arg0);
        class185 var3 = new class185();
        if (var2 != null) {
            var3.method3265(new class443(var2));
        }
        var3.method3287();
        field2012.method4693(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gi.q(I)V")
    public void method3287() {
    }

    @ObfuscatedName("gi.f(Lqt;B)V")
    public void method3265(class443 arg0) {
        while (true) {
            int var2 = arg0.method7047();
            if (var2 == 0) {
                return;
            }
            this.method3268(arg0, var2);
        }
    }

    @ObfuscatedName("gi.j(Lqt;II)V")
    public void method3268(class443 arg0, int arg1) {
        if (arg1 == 249) {
            this.field2015 = class175.method2132(arg0, this.field2015);
        }
    }

    @ObfuscatedName("gi.e(IIB)I")
    public int method3269(int arg0, int arg1) {
        return class175.method2678(this.field2015, arg0, arg1);
    }

    @ObfuscatedName("gi.g(ILjava/lang/String;I)Ljava/lang/String;")
    public String method3270(int arg0, String arg1) {
        class419 var3 = this.field2015;
        String var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class406 var5 = (class406) var3.method6756((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = (String) var5.field4458;
            }
        }
        return var4;
    }

    @ObfuscatedName("bt.w(I)V")
    public static void method1779() {
        field2012.method4695();
    }
}
