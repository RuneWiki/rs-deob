package deob;

@ObfuscatedName("hr")
public class class199 extends class481 {

    @ObfuscatedName("hr.ah")
    public static class299 field2039 = new class299(64);

    @ObfuscatedName("hr.ar")
    public char field2036;

    @ObfuscatedName("hr.ao")
    public int field2037;

    @ObfuscatedName("hr.ab")
    public String field2035;

    @ObfuscatedName("hr.au")
    public boolean field2040 = true;

    @ObfuscatedName("ky.at(Lol;B)V")
    public static void method5164(class371 arg0) {
        Statics.field2038 = arg0;
    }

    @ObfuscatedName("ko.ah(II)Lhr;")
    public static class199 method4984(int arg0) {
        class199 var1 = (class199) field2039.method5289((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2038.method6284(11, arg0);
        class199 var3 = new class199();
        if (var2 != null) {
            var3.method3499(new class527(var2));
        }
        var3.method3514();
        field2039.method5303(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("hr.ar(B)V")
    public void method3514() {
    }

    @ObfuscatedName("hr.ao(Luj;I)V")
    public void method3499(class527 arg0) {
        while (true) {
            int var2 = arg0.method8410();
            if (var2 == 0) {
                return;
            }
            this.method3500(arg0, var2);
        }
    }

    @ObfuscatedName("hr.ab(Luj;IB)V")
    public void method3500(class527 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2036 = class397.method256(arg0.method8616());
        } else if (arg1 == 2) {
            this.field2037 = arg0.method8416();
        } else if (arg1 == 4) {
            this.field2040 = false;
        } else if (arg1 == 5) {
            this.field2035 = arg0.method8535();
        }
    }

    @ObfuscatedName("hr.au(I)Z")
    public boolean method3497() {
        return this.field2036 == 's';
    }

    @ObfuscatedName("ok.aa(I)V")
    public static void method6527() {
        field2039.method5292();
    }
}
