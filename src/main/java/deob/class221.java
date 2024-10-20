package deob;

@ObfuscatedName("iz")
public class class221 extends class500 {

    @ObfuscatedName("iz.al")
    public static class312 field2242 = new class312(64);

    @ObfuscatedName("iz.aj")
    public class519 field2243;

    @ObfuscatedName("ot.ak(Lor;B)V")
    public static void method6570(class387 arg0) {
        Statics.field2245 = arg0;
    }

    @ObfuscatedName("dw.al(II)Liz;")
    public static class221 method2234(int arg0) {
        class221 var1 = (class221) field2242.method5570((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2245.method6573(34, arg0);
        class221 var3 = new class221();
        if (var2 != null) {
            var3.method3806(new class546(var2));
        }
        var3.method3805();
        field2242.method5564(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("iz.aj(I)V")
    public void method3805() {
    }

    @ObfuscatedName("iz.az(Lua;I)V")
    public void method3806(class546 arg0) {
        while (true) {
            int var2 = arg0.method8796();
            if (var2 == 0) {
                return;
            }
            this.method3807(arg0, var2);
        }
    }

    @ObfuscatedName("iz.af(Lua;IB)V")
    public void method3807(class546 arg0, int arg1) {
        if (arg1 == 249) {
            this.field2243 = class203.method2113(arg0, this.field2243);
        }
    }

    @ObfuscatedName("iz.aa(III)I")
    public int method3808(int arg0, int arg1) {
        class519 var3 = this.field2243;
        int var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class503 var5 = (class503) var3.method8506((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = var5.field5047;
            }
        }
        return var4;
    }

    @ObfuscatedName("iz.at(ILjava/lang/String;I)Ljava/lang/String;")
    public String method3809(int arg0, String arg1) {
        return class203.method2600(this.field2243, arg0, arg1);
    }
}
