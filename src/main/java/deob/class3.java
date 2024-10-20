package deob;

@ObfuscatedName("h")
public class class3 {

    @ObfuscatedName("h.q")
    public final int field31;

    @ObfuscatedName("h.d")
    public final long field26;

    @ObfuscatedName("h.h")
    public final class5 field27;

    @ObfuscatedName("h.p")
    public String field33;

    @ObfuscatedName("h.j")
    public String field28;

    public class3(class154 arg0, byte arg1, int arg2) {
        this.field33 = arg0.method2701();
        this.field28 = arg0.method2701();
        this.field31 = arg0.method2668();
        this.field26 = arg0.method2652();
        int var4 = arg0.method2798();
        int var5 = arg0.method2798();
        this.field27 = new class5();
        this.field27.method45(2);
        this.field27.method46(arg1);
        this.field27.field55 = var4;
        this.field27.field48 = var5;
        this.field27.field49 = 0;
        this.field27.field50 = 0;
        this.field27.field45 = arg2;
    }

    @ObfuscatedName("h.q(B)Ljava/lang/String;")
    public String method21() {
        return this.field33;
    }

    @ObfuscatedName("h.d(I)Ljava/lang/String;")
    public String method30() {
        return this.field28;
    }
}
