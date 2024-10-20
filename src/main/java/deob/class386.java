package deob;

@ObfuscatedName("oj")
public class class386 {

    @ObfuscatedName("oj.aq")
    public final int field4453;

    @ObfuscatedName("oj.aw")
    public final long field4452;

    @ObfuscatedName("oj.al")
    public final class387 field4454;

    @ObfuscatedName("oj.ai")
    public String field4455;

    @ObfuscatedName("oj.ar")
    public String field4456;

    public class386(class534 arg0, byte arg1, int arg2) {
        this.field4455 = arg0.method8741();
        this.field4456 = arg0.method8741();
        this.field4453 = arg0.method8593();
        this.field4452 = arg0.method8598();
        int var4 = arg0.method8597();
        int var5 = arg0.method8597();
        this.field4454 = new class387();
        this.field4454.method6600(2);
        this.field4454.method6601(arg1);
        this.field4454.field4463 = var4;
        this.field4454.field4461 = var5;
        this.field4454.field4460 = 0;
        this.field4454.field4458 = 0;
        this.field4454.field4459 = arg2;
    }

    @ObfuscatedName("oj.aq(S)Ljava/lang/String;")
    public String method6588() {
        return this.field4455;
    }

    @ObfuscatedName("oj.aw(I)Ljava/lang/String;")
    public String method6589() {
        return this.field4456;
    }
}
