package deob;

@ObfuscatedName("nv")
public class class348 {

    @ObfuscatedName("nv.aj")
    public final int field4258;

    @ObfuscatedName("nv.al")
    public final long field4257;

    @ObfuscatedName("nv.ac")
    public final class349 field4256;

    @ObfuscatedName("nv.ab")
    public String field4259;

    @ObfuscatedName("nv.an")
    public String field4260;

    public class348(class478 arg0, byte arg1, int arg2) {
        this.field4259 = arg0.method7950();
        this.field4260 = arg0.method7950();
        this.field4258 = arg0.method7905();
        this.field4257 = arg0.method7949();
        int var4 = arg0.method7908();
        int var5 = arg0.method7908();
        this.field4256 = new class349();
        this.field4256.method5995(2);
        this.field4256.method6003(arg1);
        this.field4256.field4263 = var4;
        this.field4256.field4264 = var5;
        this.field4256.field4262 = 0;
        this.field4256.field4266 = 0;
        this.field4256.field4265 = arg2;
    }

    @ObfuscatedName("nv.aj(I)Ljava/lang/String;")
    public String method5982() {
        return this.field4259;
    }

    @ObfuscatedName("nv.al(I)Ljava/lang/String;")
    public String method5983() {
        return this.field4260;
    }
}
