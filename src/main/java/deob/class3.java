package deob;

@ObfuscatedName("n")
public class class3 {

    @ObfuscatedName("n.d")
    public final int field23;

    @ObfuscatedName("n.c")
    public final long field26;

    @ObfuscatedName("n.n")
    public final class5 field22;

    @ObfuscatedName("n.q")
    public String field20;

    @ObfuscatedName("n.t")
    public String field24;

    public class3(class130 arg0, byte arg1, int arg2) {
        this.field20 = arg0.method2314();
        this.field24 = arg0.method2314();
        this.field23 = arg0.method2232();
        this.field26 = arg0.method2320();
        int var4 = arg0.method2246();
        int var5 = arg0.method2246();
        this.field22 = new class5();
        this.field22.method47(2);
        this.field22.method48(arg1);
        this.field22.field39 = var4;
        this.field22.field42 = var5;
        this.field22.field43 = 0;
        this.field22.field44 = 0;
        this.field22.field40 = arg2;
    }

    @ObfuscatedName("n.d(I)Ljava/lang/String;")
    public String method26() {
        return this.field20;
    }

    @ObfuscatedName("n.c(I)Ljava/lang/String;")
    public String method21() {
        return this.field24;
    }
}
