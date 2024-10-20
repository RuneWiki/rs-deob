package deob;

@ObfuscatedName("ht")
public class class199 extends class444 {

    @ObfuscatedName("ht.an")
    public static class280 field2129 = new class280(64);

    @ObfuscatedName("ht.aw")
    public class464 field2128;

    @ObfuscatedName("dk.af(Lnm;I)V")
    public static void method2167(class344 arg0) {
        Statics.field2127 = arg0;
    }

    @ObfuscatedName("hc.an(II)Lht;")
    public static class199 method3557(int arg0) {
        class199 var1 = (class199) field2129.method5119((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2127.method6090(34, arg0);
        class199 var3 = new class199();
        if (var2 != null) {
            var3.method3601(new class489(var2));
        }
        var3.method3612();
        field2129.method5121(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ht.aw(I)V")
    public void method3612() {
    }

    @ObfuscatedName("ht.ac(Lsg;I)V")
    public void method3601(class489 arg0) {
        while (true) {
            int var2 = arg0.method8248();
            if (var2 == 0) {
                return;
            }
            this.method3599(arg0, var2);
        }
    }

    @ObfuscatedName("ht.au(Lsg;II)V")
    public void method3599(class489 arg0, int arg1) {
        if (arg1 == 249) {
            this.field2128 = class187.method2057(arg0, this.field2128);
        }
    }

    @ObfuscatedName("ht.ab(IIB)I")
    public int method3603(int arg0, int arg1) {
        class464 var3 = this.field2128;
        int var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class448 var5 = (class448) var3.method7945((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = var5.field4744;
            }
        }
        return var4;
    }

    @ObfuscatedName("ht.aq(ILjava/lang/String;I)Ljava/lang/String;")
    public String method3604(int arg0, String arg1) {
        return class187.method3440(this.field2128, arg0, arg1);
    }

    @ObfuscatedName("di.al(I)V")
    public static void method2146() {
        field2129.method5125();
    }
}
