package deob;

@ObfuscatedName("x")
public class class3 {

    @ObfuscatedName("x.p")
    public final int field25;

    @ObfuscatedName("x.g")
    public final long field18;

    @ObfuscatedName("x.x")
    public final class5 field19;

    @ObfuscatedName("x.q")
    public String field17;

    @ObfuscatedName("x.d")
    public String field21;

    public class3(class154 arg0, byte arg1, int arg2) {
        this.field17 = arg0.method2625();
        this.field21 = arg0.method2625();
        this.field25 = arg0.method2595();
        this.field18 = arg0.method2599();
        int var4 = arg0.method2598();
        int var5 = arg0.method2598();
        this.field19 = new class5();
        this.field19.method64(2);
        this.field19.method51(arg1);
        this.field19.field42 = var4;
        this.field19.field43 = var5;
        this.field19.field46 = 0;
        this.field19.field40 = 0;
        this.field19.field41 = arg2;
    }

    @ObfuscatedName("x.p(B)Ljava/lang/String;")
    public String method30() {
        return this.field17;
    }

    @ObfuscatedName("x.g(I)Ljava/lang/String;")
    public String method32() {
        return this.field21;
    }
}
