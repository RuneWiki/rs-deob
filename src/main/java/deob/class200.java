package deob;

@ObfuscatedName("hi")
public class class200 extends class485 {

    @ObfuscatedName("hi.ap")
    public static class302 field2066 = new class302(64);

    @ObfuscatedName("hi.af")
    public class504 field2067;

    @ObfuscatedName("dd.am(IB)Lhi;")
    public static class200 method2164(int arg0) {
        class200 var1 = (class200) field2066.method5400((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2065.method6396(34, arg0);
        class200 var3 = new class200();
        if (var2 != null) {
            var3.method3564(new class531(var2));
        }
        var3.method3556();
        field2066.method5402(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("hi.ap(I)V")
    public void method3556() {
    }

    @ObfuscatedName("hi.af(Luk;I)V")
    public void method3564(class531 arg0) {
        while (true) {
            int var2 = arg0.method8561();
            if (var2 == 0) {
                return;
            }
            this.method3559(arg0, var2);
        }
    }

    @ObfuscatedName("hi.aj(Luk;IB)V")
    public void method3559(class531 arg0, int arg1) {
        if (arg1 == 249) {
            this.field2067 = class182.method4263(arg0, this.field2067);
        }
    }

    @ObfuscatedName("hi.aq(III)I")
    public int method3560(int arg0, int arg1) {
        return class182.method5355(this.field2067, arg0, arg1);
    }

    @ObfuscatedName("hi.ar(ILjava/lang/String;I)Ljava/lang/String;")
    public String method3561(int arg0, String arg1) {
        class504 var3 = this.field2067;
        String var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class486 var5 = (class486) var3.method8286((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = (String) var5.field4885;
            }
        }
        return var4;
    }

    @ObfuscatedName("fn.ag(I)V")
    public static void method3130() {
        field2066.method5403();
    }
}
