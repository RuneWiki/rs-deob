package deob;

@ObfuscatedName("hm")
public class class201 extends class439 {

    @ObfuscatedName("hm.al")
    public static class276 field2097 = new class276(64);

    @ObfuscatedName("hm.ac")
    public class454 field2099;

    @ObfuscatedName("ff.aj(Lne;I)V")
    public static void method2937(class340 arg0) {
        Statics.field2096 = arg0;
    }

    @ObfuscatedName("kw.al(IB)Lhm;")
    public static class201 method4884(int arg0) {
        class201 var1 = (class201) field2097.method4921((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2096.method5860(34, arg0);
        class201 var3 = new class201();
        if (var2 != null) {
            var3.method3481(new class478(var2));
        }
        var3.method3480();
        field2097.method4923(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("hm.ac(B)V")
    public void method3480() {
    }

    @ObfuscatedName("hm.ab(Lsy;I)V")
    public void method3481(class478 arg0) {
        while (true) {
            int var2 = arg0.method7909();
            if (var2 == 0) {
                return;
            }
            this.method3483(arg0, var2);
        }
    }

    @ObfuscatedName("hm.an(Lsy;II)V")
    public void method3483(class478 arg0, int arg1) {
        if (arg1 == 249) {
            this.field2099 = class189.method4194(arg0, this.field2099);
        }
    }

    @ObfuscatedName("hm.ao(IIB)I")
    public int method3485(int arg0, int arg1) {
        return class189.method2941(this.field2099, arg0, arg1);
    }

    @ObfuscatedName("hm.av(ILjava/lang/String;I)Ljava/lang/String;")
    public String method3484(int arg0, String arg1) {
        return class189.method7298(this.field2099, arg0, arg1);
    }

    @ObfuscatedName("ev.aq(I)V")
    public static void method2707() {
        field2097.method4930();
    }
}
