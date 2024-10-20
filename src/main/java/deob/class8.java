package deob;

@ObfuscatedName("o")
public class class8 {

    @ObfuscatedName("o.a")
    public final int field43;

    @ObfuscatedName("o.t")
    public final long field42;

    @ObfuscatedName("o.n")
    public final class10 field45;

    @ObfuscatedName("o.q")
    public String field44;

    @ObfuscatedName("o.v")
    public String field48;

    public class8(class300 arg0, byte arg1, int arg2) {
        this.field44 = arg0.method5132();
        this.field48 = arg0.method5132();
        this.field43 = arg0.method5166();
        this.field42 = arg0.method5129();
        int var4 = arg0.method5155();
        int var5 = arg0.method5155();
        this.field45 = new class10();
        this.field45.method107(2);
        this.field45.method120(arg1);
        this.field45.field59 = var4;
        this.field45.field60 = var5;
        this.field45.field61 = 0;
        this.field45.field65 = 0;
        this.field45.field58 = arg2;
    }

    @ObfuscatedName("o.a(I)Ljava/lang/String;")
    public String method83() {
        return this.field44;
    }

    @ObfuscatedName("o.t(S)Ljava/lang/String;")
    public String method84() {
        return this.field48;
    }
}
