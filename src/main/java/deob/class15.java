package deob;

@ObfuscatedName("g")
public class class15 {

    @ObfuscatedName("g.p")
    public final int field298;

    @ObfuscatedName("g.m")
    public final long field292;

    @ObfuscatedName("g.e")
    public final class17 field293;

    @ObfuscatedName("g.t")
    public String field294;

    @ObfuscatedName("g.w")
    public String field299;

    public class15(class174 arg0, byte arg1, int arg2) {
        this.field294 = arg0.method2818();
        this.field299 = arg0.method2818();
        this.field298 = arg0.method2824();
        this.field292 = arg0.method2813();
        int var4 = arg0.method2803();
        int var5 = arg0.method2803();
        this.field293 = new class17();
        this.field293.method106(2);
        this.field293.method107(arg1);
        this.field293.field308 = var4;
        this.field293.field315 = var5;
        this.field293.field310 = 0;
        this.field293.field316 = 0;
        this.field293.field307 = arg2;
    }

    @ObfuscatedName("g.p(I)Ljava/lang/String;")
    public String method72() {
        return this.field294;
    }

    @ObfuscatedName("g.m(I)Ljava/lang/String;")
    public String method71() {
        return this.field299;
    }
}
