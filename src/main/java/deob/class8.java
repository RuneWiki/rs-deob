package deob;

@ObfuscatedName("v")
public class class8 {

    @ObfuscatedName("v.c")
    public final int field46;

    @ObfuscatedName("v.x")
    public final long field45;

    @ObfuscatedName("v.t")
    public final class10 field52;

    @ObfuscatedName("v.g")
    public String field47;

    @ObfuscatedName("v.l")
    public String field48;

    public class8(class300 arg0, byte arg1, int arg2) {
        this.field47 = arg0.method5112();
        this.field48 = arg0.method5112();
        this.field46 = arg0.method5304();
        this.field45 = arg0.method5143();
        int var4 = arg0.method5208();
        int var5 = arg0.method5208();
        this.field52 = new class10();
        this.field52.method84(2);
        this.field52.method78(arg1);
        this.field52.field59 = var4;
        this.field52.field60 = var5;
        this.field52.field58 = 0;
        this.field52.field62 = 0;
        this.field52.field57 = arg2;
    }

    @ObfuscatedName("v.c(B)Ljava/lang/String;")
    public String method57() {
        return this.field47;
    }

    @ObfuscatedName("v.x(B)Ljava/lang/String;")
    public String method58() {
        return this.field48;
    }
}
