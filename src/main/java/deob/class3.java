package deob;

@ObfuscatedName("o")
public class class3 {

    @ObfuscatedName("o.k")
    public final int field24;

    @ObfuscatedName("o.y")
    public final long field22;

    @ObfuscatedName("o.o")
    public final class5 field23;

    @ObfuscatedName("o.r")
    public String field31;

    @ObfuscatedName("o.w")
    public String field29;

    public class3(class161 arg0, byte arg1, int arg2) {
        this.field31 = arg0.method2740();
        this.field29 = arg0.method2740();
        this.field24 = arg0.method2735();
        this.field22 = arg0.method2738();
        int var4 = arg0.method2868();
        int var5 = arg0.method2868();
        this.field23 = new class5();
        this.field23.method73(2);
        this.field23.method54(arg1);
        this.field23.field46 = var4;
        this.field23.field41 = var5;
        this.field23.field38 = 0;
        this.field23.field43 = 0;
        this.field23.field39 = arg2;
    }

    @ObfuscatedName("o.k(B)Ljava/lang/String;")
    public String method23() {
        return this.field31;
    }

    @ObfuscatedName("o.y(B)Ljava/lang/String;")
    public String method27() {
        return this.field29;
    }
}
