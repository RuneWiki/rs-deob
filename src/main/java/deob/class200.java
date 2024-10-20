package deob;

@ObfuscatedName("hy")
public class class200 extends class481 {

    @ObfuscatedName("hy.ah")
    public static class299 field2043 = new class299(64);

    @ObfuscatedName("hy.ar")
    public class500 field2049;

    @ObfuscatedName("aq.at(Lol;I)V")
    public static void method282(class371 arg0) {
        Statics.field2048 = arg0;
    }

    @ObfuscatedName("rc.ah(IS)Lhy;")
    public static class200 method7510(int arg0) {
        class200 var1 = (class200) field2043.method5289((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2048.method6284(34, arg0);
        class200 var3 = new class200();
        if (var2 != null) {
            var3.method3535(new class527(var2));
        }
        var3.method3517();
        field2043.method5303(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("hy.ar(I)V")
    public void method3517() {
    }

    @ObfuscatedName("hy.ao(Luj;I)V")
    public void method3535(class527 arg0) {
        while (true) {
            int var2 = arg0.method8410();
            if (var2 == 0) {
                return;
            }
            this.method3519(arg0, var2);
        }
    }

    @ObfuscatedName("hy.ab(Luj;IB)V")
    public void method3519(class527 arg0, int arg1) {
        if (arg1 == 249) {
            this.field2049 = class182.method3052(arg0, this.field2049);
        }
    }

    @ObfuscatedName("hy.au(III)I")
    public int method3516(int arg0, int arg1) {
        return class182.method2319(this.field2049, arg0, arg1);
    }

    @ObfuscatedName("hy.aa(ILjava/lang/String;B)Ljava/lang/String;")
    public String method3523(int arg0, String arg1) {
        class500 var3 = this.field2049;
        String var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class482 var5 = (class482) var3.method8134((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = (String) var5.field4845;
            }
        }
        return var4;
    }
}
