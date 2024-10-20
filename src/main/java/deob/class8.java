package deob;

@ObfuscatedName("l")
public class class8 {

    @ObfuscatedName("l.c")
    public final int field41;

    @ObfuscatedName("l.t")
    public final long field42;

    @ObfuscatedName("l.o")
    public final class10 field45;

    @ObfuscatedName("l.e")
    public String field40;

    @ObfuscatedName("l.i")
    public String field43;

    public class8(class301 arg0, byte arg1, int arg2) {
        this.field40 = arg0.method5138();
        this.field43 = arg0.method5138();
        this.field41 = arg0.method5124();
        this.field42 = arg0.method5311();
        int var4 = arg0.method5134();
        int var5 = arg0.method5134();
        this.field45 = new class10();
        this.field45.method100(2);
        this.field45.method92(arg1);
        this.field45.field56 = var4;
        this.field45.field58 = var5;
        this.field45.field57 = 0;
        this.field45.field60 = 0;
        this.field45.field59 = arg2;
    }

    @ObfuscatedName("l.c(I)Ljava/lang/String;")
    public String method75() {
        return this.field40;
    }

    @ObfuscatedName("l.t(I)Ljava/lang/String;")
    public String method69() {
        return this.field43;
    }
}
