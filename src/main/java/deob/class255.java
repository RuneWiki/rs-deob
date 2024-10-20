package deob;

@ObfuscatedName("jz")
public class class255 extends class275 {

    @ObfuscatedName("jz.au")
    public final int field2889;

    @ObfuscatedName("jz.ae")
    public final class258 field2890;

    @ObfuscatedName("jz.ao")
    public int field2888;

    @ObfuscatedName("jz.at")
    public class270 field2891;

    @ObfuscatedName("jz.ac")
    public int field2892;

    @ObfuscatedName("jz.ai")
    public int field2893;

    public class255(class323 arg0, class323 arg1, int arg2, class258 arg3) {
        super(arg0, arg1);
        this.field2889 = arg2;
        this.field2890 = arg3;
        this.method4704();
    }

    @ObfuscatedName("jz.au(B)V")
    public void method4704() {
        this.field2888 = class206.method3321(this.field2889).method3610().field2205;
        this.field2891 = this.field2890.method4830(class188.method2945(this.field2888));
        class188 var1 = class188.method2945(this.method4685());
        class529 var2 = var1.method3300(false);
        if (var2 == null) {
            this.field2892 = 0;
            this.field2893 = 0;
        } else {
            this.field2892 = var2.field5218;
            this.field2893 = var2.field5209;
        }
    }

    @ObfuscatedName("jz.ae(I)I")
    public int method4685() {
        return this.field2888;
    }

    @ObfuscatedName("jz.ao(I)Lkq;")
    public class270 method4686() {
        return this.field2891;
    }

    @ObfuscatedName("jz.at(I)I")
    public int method4687() {
        return this.field2892;
    }

    @ObfuscatedName("jz.ac(I)I")
    public int method4698() {
        return this.field2893;
    }
}
