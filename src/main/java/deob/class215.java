package deob;

@ObfuscatedName("hc")
public class class215 {

    @ObfuscatedName("hc.s")
    public final int field3162;

    @ObfuscatedName("hc.j")
    public final long field3161;

    @ObfuscatedName("hc.p")
    public final class221 field3160;

    @ObfuscatedName("hc.x")
    public String field3163;

    @ObfuscatedName("hc.d")
    public String field3164;

    public class215(class120 arg0, byte arg1, int arg2) {
        this.field3163 = arg0.method2346();
        this.field3164 = arg0.method2346();
        this.field3162 = arg0.method2430();
        this.field3161 = arg0.method2344();
        int var4 = arg0.method2343();
        int var5 = arg0.method2343();
        this.field3160 = new class221();
        this.field3160.method3710(2);
        this.field3160.method3711(arg1);
        this.field3160.field3177 = var4;
        this.field3160.field3178 = var5;
        this.field3160.field3175 = 0;
        this.field3160.field3180 = 0;
        this.field3160.field3179 = arg2;
    }

    @ObfuscatedName("hc.s(I)Ljava/lang/String;")
    public String method3665() {
        return this.field3163;
    }

    @ObfuscatedName("hc.j(I)Ljava/lang/String;")
    public String method3666() {
        return this.field3164;
    }
}
