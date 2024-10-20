package deob;

@ObfuscatedName("i")
public class class3 {

    @ObfuscatedName("i.b")
    public final int field25;

    @ObfuscatedName("i.l")
    public final long field28;

    @ObfuscatedName("i.i")
    public final class5 field18;

    @ObfuscatedName("i.t")
    public String field19;

    @ObfuscatedName("i.k")
    public String field16;

    public class3(class154 arg0, byte arg1, int arg2) {
        this.field19 = arg0.method2686();
        this.field16 = arg0.method2686();
        this.field25 = arg0.method2801();
        this.field28 = arg0.method2769();
        int var4 = arg0.method2683();
        int var5 = arg0.method2683();
        this.field18 = new class5();
        this.field18.method49(2);
        this.field18.method70(arg1);
        this.field18.field38 = var4;
        this.field18.field39 = var5;
        this.field18.field40 = 0;
        this.field18.field41 = 0;
        this.field18.field45 = arg2;
    }

    @ObfuscatedName("i.b(I)Ljava/lang/String;")
    public String method23() {
        return this.field19;
    }

    @ObfuscatedName("i.l(I)Ljava/lang/String;")
    public String method30() {
        return this.field16;
    }
}
