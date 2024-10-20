package deob;

@ObfuscatedName("hc")
public class class204 extends class469 {

    @ObfuscatedName("hc.ae")
    public static class288 field2145 = new class288(64);

    @ObfuscatedName("hc.ao")
    public class488 field2143;

    @ObfuscatedName("ee.au(II)Lhc;")
    public static class204 method2578(int arg0) {
        class204 var1 = (class204) field2145.method5182((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2144.method6128(34, arg0);
        class204 var3 = new class204();
        if (var2 != null) {
            var3.method3539(new class515(var2));
        }
        var3.method3538();
        field2145.method5177(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("hc.ae(I)V")
    public void method3538() {
    }

    @ObfuscatedName("hc.ao(Ltm;B)V")
    public void method3539(class515 arg0) {
        while (true) {
            int var2 = arg0.method8300();
            if (var2 == 0) {
                return;
            }
            this.method3550(arg0, var2);
        }
    }

    @ObfuscatedName("hc.at(Ltm;II)V")
    public void method3550(class515 arg0, int arg1) {
        if (arg1 == 249) {
            this.field2143 = class192.method1074(arg0, this.field2143);
        }
    }

    @ObfuscatedName("hc.ac(III)I")
    public int method3541(int arg0, int arg1) {
        return class192.method157(this.field2143, arg0, arg1);
    }

    @ObfuscatedName("hc.ai(ILjava/lang/String;I)Ljava/lang/String;")
    public String method3542(int arg0, String arg1) {
        class488 var3 = this.field2143;
        String var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class470 var5 = (class470) var3.method8008((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = (String) var5.field4810;
            }
        }
        return var4;
    }
}
