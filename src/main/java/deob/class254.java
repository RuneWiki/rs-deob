package deob;

@ObfuscatedName("jr")
public class class254 extends class266 {

    @ObfuscatedName("jr.aq")
    public final int field2640;

    @ObfuscatedName("jr.ad")
    public final class261 field2635;

    @ObfuscatedName("jr.ag")
    public final int field2637;

    @ObfuscatedName("jr.ak")
    public final int field2638;

    public class254(class348 arg0, class348 arg1, int arg2, class261 arg3) {
        super(arg0, arg1);
        this.field2640 = arg2;
        this.field2635 = arg3;
        class182 var5 = class182.method3196(this.method4215());
        class561 var6 = var5.method3287(false);
        if (var6 == null) {
            this.field2637 = 0;
            this.field2638 = 0;
        } else {
            this.field2637 = var6.field5458;
            this.field2638 = var6.field5461;
        }
    }

    @ObfuscatedName("jr.ad(B)I")
    public int method4215() {
        return this.field2640;
    }

    @ObfuscatedName("jr.ag(I)Lkm;")
    public class261 method4216() {
        return this.field2635;
    }

    @ObfuscatedName("jr.ak(I)I")
    public int method4217() {
        return this.field2637;
    }

    @ObfuscatedName("jr.ap(I)I")
    public int method4230() {
        return this.field2638;
    }
}
