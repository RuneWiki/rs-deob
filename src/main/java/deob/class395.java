package deob;

@ObfuscatedName("pm")
public class class395 {

    @ObfuscatedName("pm.ak")
    public final int field4568;

    @ObfuscatedName("pm.al")
    public final long field4565;

    @ObfuscatedName("pm.aj")
    public final class396 field4566;

    @ObfuscatedName("pm.az")
    public String field4567;

    @ObfuscatedName("pm.af")
    public String field4564;

    public class395(class546 arg0, byte arg1, int arg2) {
        this.field4567 = arg0.method8806();
        this.field4564 = arg0.method8806();
        this.field4568 = arg0.method8798();
        this.field4565 = arg0.method8802();
        int var4 = arg0.method8801();
        int var5 = arg0.method8801();
        this.field4566 = new class396();
        this.field4566.method6747(2);
        this.field4566.method6752(arg1);
        this.field4566.field4572 = var4;
        this.field4566.field4573 = var5;
        this.field4566.field4574 = 0;
        this.field4566.field4570 = 0;
        this.field4566.field4571 = arg2;
    }

    @ObfuscatedName("pm.ak(I)Ljava/lang/String;")
    public String method6742() {
        return this.field4567;
    }

    @ObfuscatedName("pm.al(I)Ljava/lang/String;")
    public String method6737() {
        return this.field4564;
    }
}
