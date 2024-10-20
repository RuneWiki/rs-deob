package deob;

@ObfuscatedName("gc")
public class class200 extends class151 {

    @ObfuscatedName("gc.c")
    public static class146 field2879 = new class146(64);

    @ObfuscatedName("gc.n")
    public class143 field2880;

    @ObfuscatedName("da.d(II)Lgc;")
    public static class200 method2144(int arg0) {
        class200 var1 = (class200) field2879.method2598((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2884.method3129(34, arg0);
        class200 var3 = new class200();
        if (var2 != null) {
            var3.method3389(new class130(var2));
        }
        var3.method3388();
        field2879.method2607(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gc.c(S)V")
    public void method3388() {
    }

    @ObfuscatedName("gc.n(Ldu;B)V")
    public void method3389(class130 arg0) {
        while (true) {
            int var2 = arg0.method2379();
            if (var2 == 0) {
                return;
            }
            this.method3399(arg0, var2);
        }
    }

    @ObfuscatedName("gc.q(Ldu;II)V")
    public void method3399(class130 arg0, int arg1) {
        if (arg1 == 249) {
            this.field2880 = class197.method3079(arg0, this.field2880);
        }
    }

    @ObfuscatedName("gc.t(III)I")
    public int method3391(int arg0, int arg1) {
        return class197.method3195(this.field2880, arg0, arg1);
    }

    @ObfuscatedName("gc.p(ILjava/lang/String;I)Ljava/lang/String;")
    public String method3392(int arg0, String arg1) {
        return Statics.method2910(this.field2880, arg0, arg1);
    }
}
