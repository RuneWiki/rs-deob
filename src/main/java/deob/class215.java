package deob;

@ObfuscatedName("hn")
public class class215 {

    @ObfuscatedName("hn.b")
    public final int field3148;

    @ObfuscatedName("hn.g")
    public final long field3152;

    @ObfuscatedName("hn.j")
    public final class221 field3149;

    @ObfuscatedName("hn.d")
    public String field3150;

    @ObfuscatedName("hn.x")
    public String field3151;

    public class215(class120 arg0, byte arg1, int arg2) {
        this.field3150 = arg0.method2352();
        this.field3151 = arg0.method2352();
        this.field3148 = arg0.method2346();
        this.field3152 = arg0.method2529();
        int var4 = arg0.method2349();
        int var5 = arg0.method2349();
        this.field3149 = new class221();
        this.field3149.method3730(2);
        this.field3149.method3731(arg1);
        this.field3149.field3173 = var4;
        this.field3149.field3176 = var5;
        this.field3149.field3175 = 0;
        this.field3149.field3178 = 0;
        this.field3149.field3174 = arg2;
    }

    @ObfuscatedName("hn.b(I)Ljava/lang/String;")
    public String method3677() {
        return this.field3150;
    }

    @ObfuscatedName("hn.g(B)Ljava/lang/String;")
    public String method3680() {
        return this.field3151;
    }
}
