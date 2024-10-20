package deob;

@ObfuscatedName("kz")
public class class283 extends class303 {

    @ObfuscatedName("kz.ap")
    public final int field3088;

    @ObfuscatedName("kz.aw")
    public final class286 field3089;

    @ObfuscatedName("kz.ak")
    public int field3093;

    @ObfuscatedName("kz.aj")
    public class298 field3090;

    @ObfuscatedName("kz.ai")
    public int field3092;

    @ObfuscatedName("kz.ay")
    public int field3091;

    public class283(class351 arg0, class351 arg1, int arg2, class286 arg3) {
        super(arg0, arg1);
        this.field3088 = arg2;
        this.field3089 = arg3;
        this.method5460();
    }

    @ObfuscatedName("kz.ap(B)V")
    public void method5460() {
        this.field3093 = class210.method3109(this.field3088).method3968().field2200;
        this.field3090 = this.field3089.method5592(class184.method174(this.field3093));
        class184 var1 = class184.method174(this.method5469());
        class572 var2 = var1.method3615(false);
        if (var2 == null) {
            this.field3092 = 0;
            this.field3091 = 0;
        } else {
            this.field3092 = var2.field5558;
            this.field3091 = var2.field5559;
        }
    }

    @ObfuscatedName("kz.aw(I)I")
    public int method5469() {
        return this.field3093;
    }

    @ObfuscatedName("kz.ak(S)Llp;")
    public class298 method5473() {
        return this.field3090;
    }

    @ObfuscatedName("kz.aj(I)I")
    public int method5463() {
        return this.field3092;
    }

    @ObfuscatedName("kz.ai(I)I")
    public int method5464() {
        return this.field3091;
    }
}
