package deob;

@ObfuscatedName("x")
public class class17 {

    @ObfuscatedName("x.n")
    public final int field87;

    @ObfuscatedName("x.v")
    public final long field79;

    @ObfuscatedName("x.d")
    public final class19 field84;

    @ObfuscatedName("x.c")
    public String field81;

    @ObfuscatedName("x.y")
    public String field82;

    public class17(class311 arg0, byte arg1, int arg2) {
        this.field81 = arg0.method5465();
        this.field82 = arg0.method5465();
        this.field87 = arg0.method5247();
        this.field79 = arg0.method5251();
        int var4 = arg0.method5455();
        int var5 = arg0.method5455();
        this.field84 = new class19();
        this.field84.method143(2);
        this.field84.method145(arg1);
        this.field84.field95 = var4;
        this.field84.field96 = var5;
        this.field84.field97 = 0;
        this.field84.field102 = 0;
        this.field84.field98 = arg2;
    }

    @ObfuscatedName("x.n(B)Ljava/lang/String;")
    public String method120() {
        return this.field81;
    }

    @ObfuscatedName("x.v(B)Ljava/lang/String;")
    public String method122() {
        return this.field82;
    }
}
