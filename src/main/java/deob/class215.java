package deob;

@ObfuscatedName("hn")
public class class215 {

    @ObfuscatedName("hn.w")
    public final int field3161;

    @ObfuscatedName("hn.x")
    public final long field3155;

    @ObfuscatedName("hn.t")
    public final class221 field3157;

    @ObfuscatedName("hn.p")
    public String field3158;

    @ObfuscatedName("hn.e")
    public String field3159;

    public class215(class120 arg0, byte arg1, int arg2) {
        this.field3158 = arg0.method2540();
        this.field3159 = arg0.method2540();
        this.field3161 = arg0.method2365();
        this.field3155 = arg0.method2369();
        int var4 = arg0.method2368();
        int var5 = arg0.method2368();
        this.field3157 = new class221();
        this.field3157.method3751(2);
        this.field3157.method3747(arg1);
        this.field3157.field3174 = var4;
        this.field3157.field3175 = var5;
        this.field3157.field3172 = 0;
        this.field3157.field3177 = 0;
        this.field3157.field3173 = arg2;
    }

    @ObfuscatedName("hn.w(I)Ljava/lang/String;")
    public String method3713() {
        return this.field3158;
    }

    @ObfuscatedName("hn.x(B)Ljava/lang/String;")
    public String method3712() {
        return this.field3159;
    }
}
