package deob;

@ObfuscatedName("i")
public class class8 {

    @ObfuscatedName("i.q")
    public final int field52;

    @ObfuscatedName("i.w")
    public final long field43;

    @ObfuscatedName("i.e")
    public final class10 field54;

    @ObfuscatedName("i.p")
    public String field45;

    @ObfuscatedName("i.k")
    public String field46;

    public class8(class301 arg0, byte arg1, int arg2) {
        this.field45 = arg0.method5076();
        this.field46 = arg0.method5076();
        this.field52 = arg0.method5069();
        this.field43 = arg0.method5104();
        int var4 = arg0.method5072();
        int var5 = arg0.method5072();
        this.field54 = new class10();
        this.field54.method101(2);
        this.field54.method86(arg1);
        this.field54.field61 = var4;
        this.field54.field62 = var5;
        this.field54.field59 = 0;
        this.field54.field64 = 0;
        this.field54.field60 = arg2;
    }

    @ObfuscatedName("i.q(B)Ljava/lang/String;")
    public String method60() {
        return this.field45;
    }

    @ObfuscatedName("i.w(S)Ljava/lang/String;")
    public String method63() {
        return this.field46;
    }
}
