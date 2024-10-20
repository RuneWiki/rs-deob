package deob;

@ObfuscatedName("c")
public class class3 {

    @ObfuscatedName("c.x")
    public final int field27;

    @ObfuscatedName("c.j")
    public final long field25;

    @ObfuscatedName("c.c")
    public final class5 field26;

    @ObfuscatedName("c.d")
    public String field29;

    @ObfuscatedName("c.w")
    public String field24;

    public class3(class154 arg0, byte arg1, int arg2) {
        this.field29 = arg0.method2699();
        this.field24 = arg0.method2699();
        this.field27 = arg0.method2745();
        this.field25 = arg0.method2645();
        int var4 = arg0.method2644();
        int var5 = arg0.method2644();
        this.field26 = new class5();
        this.field26.method53(2);
        this.field26.method54(arg1);
        this.field26.field44 = var4;
        this.field26.field45 = var5;
        this.field26.field46 = 0;
        this.field26.field47 = 0;
        this.field26.field43 = arg2;
    }

    @ObfuscatedName("c.x(I)Ljava/lang/String;")
    public String method24() {
        return this.field29;
    }

    @ObfuscatedName("c.j(I)Ljava/lang/String;")
    public String method25() {
        return this.field24;
    }
}
