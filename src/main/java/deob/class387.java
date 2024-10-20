package deob;

@ObfuscatedName("og")
public class class387 {

    @ObfuscatedName("og.az")
    public final int field4482;

    @ObfuscatedName("og.ah")
    public final long field4483;

    @ObfuscatedName("og.af")
    public final class388 field4481;

    @ObfuscatedName("og.at")
    public String field4484;

    @ObfuscatedName("og.an")
    public String field4485;

    public class387(class535 arg0, byte arg1, int arg2) {
        this.field4484 = arg0.method8473();
        this.field4485 = arg0.method8473();
        this.field4482 = arg0.method8670();
        this.field4483 = arg0.method8469();
        int var4 = arg0.method8682();
        int var5 = arg0.method8682();
        this.field4481 = new class388();
        this.field4481.method6513(2);
        this.field4481.method6500(arg1);
        this.field4481.field4489 = var4;
        this.field4481.field4491 = var5;
        this.field4481.field4487 = 0;
        this.field4481.field4492 = 0;
        this.field4481.field4488 = arg2;
    }

    @ObfuscatedName("og.az(I)Ljava/lang/String;")
    public String method6491() {
        return this.field4484;
    }

    @ObfuscatedName("og.ah(B)Ljava/lang/String;")
    public String method6490() {
        return this.field4485;
    }
}
