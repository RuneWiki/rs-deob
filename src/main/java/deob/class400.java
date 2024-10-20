package deob;

@ObfuscatedName("pv")
public class class400 {

    @ObfuscatedName("pv.ap")
    public final int field4664;

    @ObfuscatedName("pv.aw")
    public final long field4661;

    @ObfuscatedName("pv.ak")
    public final class401 field4662;

    @ObfuscatedName("pv.aj")
    public String field4666;

    @ObfuscatedName("pv.ai")
    public String field4663;

    public class400(class558 arg0, byte arg1, int arg2) {
        this.field4666 = arg0.method9269();
        this.field4663 = arg0.method9269();
        this.field4664 = arg0.method9260();
        this.field4661 = arg0.method9265();
        int var4 = arg0.method9264();
        int var5 = arg0.method9264();
        this.field4662 = new class401();
        this.field4662.method7161(2);
        this.field4662.method7162(arg1);
        this.field4662.field4667 = var4;
        this.field4662.field4670 = var5;
        this.field4662.field4669 = 0;
        this.field4662.field4672 = 0;
        this.field4662.field4668 = arg2;
    }

    @ObfuscatedName("pv.ap(I)Ljava/lang/String;")
    public String method7152() {
        return this.field4666;
    }

    @ObfuscatedName("pv.aw(I)Ljava/lang/String;")
    public String method7151() {
        return this.field4663;
    }
}
