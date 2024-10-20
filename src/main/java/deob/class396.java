package deob;

@ObfuscatedName("pm")
public class class396 {

    @ObfuscatedName("pm.aq")
    public final int field4594;

    @ObfuscatedName("pm.ad")
    public final long field4592;

    @ObfuscatedName("pm.ag")
    public final class397 field4593;

    @ObfuscatedName("pm.ak")
    public String field4595;

    @ObfuscatedName("pm.ap")
    public String field4591;

    public class396(class547 arg0, byte arg1, int arg2) {
        this.field4595 = arg0.method8739();
        this.field4591 = arg0.method8739();
        this.field4594 = arg0.method8899();
        this.field4592 = arg0.method8735();
        int var4 = arg0.method8734();
        int var5 = arg0.method8734();
        this.field4593 = new class397();
        this.field4593.method6707(2);
        this.field4593.method6710(arg1);
        this.field4593.field4599 = var4;
        this.field4593.field4598 = var5;
        this.field4593.field4601 = 0;
        this.field4593.field4602 = 0;
        this.field4593.field4600 = arg2;
    }

    @ObfuscatedName("pm.aq(I)Ljava/lang/String;")
    public String method6698() {
        return this.field4595;
    }

    @ObfuscatedName("pm.ad(I)Ljava/lang/String;")
    public String method6699() {
        return this.field4591;
    }
}
