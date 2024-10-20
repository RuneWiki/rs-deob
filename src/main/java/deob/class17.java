package deob;

@ObfuscatedName("i")
public class class17 {

    @ObfuscatedName("i.x")
    public final int field82;

    @ObfuscatedName("i.m")
    public final long field77;

    @ObfuscatedName("i.k")
    public final class19 field86;

    @ObfuscatedName("i.d")
    public String field79;

    @ObfuscatedName("i.w")
    public String field87;

    public class17(class310 arg0, byte arg1, int arg2) {
        this.field79 = arg0.method5257();
        this.field87 = arg0.method5257();
        this.field82 = arg0.method5139();
        this.field77 = arg0.method5143();
        int var4 = arg0.method5142();
        int var5 = arg0.method5142();
        this.field86 = new class19();
        this.field86.method181(2);
        this.field86.method157(arg1);
        this.field86.field98 = var4;
        this.field86.field101 = var5;
        this.field86.field97 = 0;
        this.field86.field100 = 0;
        this.field86.field96 = arg2;
    }

    @ObfuscatedName("i.x(I)Ljava/lang/String;")
    public String method127() {
        return this.field79;
    }

    @ObfuscatedName("i.m(B)Ljava/lang/String;")
    public String method128() {
        return this.field87;
    }
}
