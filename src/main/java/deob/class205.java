package deob;

@ObfuscatedName("ht")
public class class205 extends class470 {

    @ObfuscatedName("ht.ay")
    public static class289 field2106 = new class289(64);

    @ObfuscatedName("ht.ar")
    public class489 field2105;

    @ObfuscatedName("ac.aw(Lnd;I)V")
    public static void method285(class360 arg0) {
        Statics.field2107 = arg0;
    }

    @ObfuscatedName("ib.ay(IB)Lht;")
    public static class205 method3910(int arg0) {
        class205 var1 = (class205) field2106.method5152((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2107.method6117(34, arg0);
        class205 var3 = new class205();
        if (var2 != null) {
            var3.method3519(new class514(var2));
        }
        var3.method3526();
        field2106.method5149(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ht.ar(I)V")
    public void method3526() {
    }

    @ObfuscatedName("ht.am(Lty;B)V")
    public void method3519(class514 arg0) {
        while (true) {
            int var2 = arg0.method8244();
            if (var2 == 0) {
                return;
            }
            this.method3517(arg0, var2);
        }
    }

    @ObfuscatedName("ht.as(Lty;II)V")
    public void method3517(class514 arg0, int arg1) {
        if (arg1 == 249) {
            this.field2105 = class192.method2956(arg0, this.field2105);
        }
    }

    @ObfuscatedName("ht.aj(III)I")
    public int method3521(int arg0, int arg1) {
        return class192.method3237(this.field2105, arg0, arg1);
    }

    @ObfuscatedName("ht.ag(ILjava/lang/String;B)Ljava/lang/String;")
    public String method3522(int arg0, String arg1) {
        class489 var3 = this.field2105;
        String var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class471 var5 = (class471) var3.method7961((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = (String) var5.field4815;
            }
        }
        return var4;
    }

    @ObfuscatedName("fy.az(I)V")
    public static void method2903() {
        field2106.method5146();
    }
}
