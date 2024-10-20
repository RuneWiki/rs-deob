package deob;

@ObfuscatedName("ki")
public class class263 extends class275 {

    @ObfuscatedName("ki.au")
    public final int field2970;

    @ObfuscatedName("ki.ae")
    public final class270 field2973;

    @ObfuscatedName("ki.ao")
    public final int field2972;

    @ObfuscatedName("ki.at")
    public final int field2971;

    public class263(class323 arg0, class323 arg1, int arg2, class270 arg3) {
        super(arg0, arg1);
        this.field2970 = arg2;
        this.field2973 = arg3;
        class188 var5 = class188.method2945(this.method4685());
        class529 var6 = var5.method3300(false);
        if (var6 == null) {
            this.field2972 = 0;
            this.field2971 = 0;
        } else {
            this.field2972 = var6.field5218;
            this.field2971 = var6.field5209;
        }
    }

    @ObfuscatedName("ki.ae(I)I")
    public int method4685() {
        return this.field2970;
    }

    @ObfuscatedName("ki.ao(I)Lkq;")
    public class270 method4686() {
        return this.field2973;
    }

    @ObfuscatedName("ki.at(I)I")
    public int method4687() {
        return this.field2972;
    }

    @ObfuscatedName("ki.ac(I)I")
    public int method4698() {
        return this.field2971;
    }
}
