package deob;

@ObfuscatedName("hn")
public class class214 {

    @ObfuscatedName("hn.n")
    public final int field3135;

    @ObfuscatedName("hn.d")
    public final long field3131;

    @ObfuscatedName("hn.s")
    public final class220 field3132;

    @ObfuscatedName("hn.q")
    public String field3133;

    @ObfuscatedName("hn.j")
    public String field3134;

    public class214(class119 arg0, byte arg1, int arg2) {
        this.field3133 = arg0.method2492();
        this.field3134 = arg0.method2492();
        this.field3135 = arg0.method2377();
        this.field3131 = arg0.method2344();
        int var4 = arg0.method2343();
        int var5 = arg0.method2343();
        this.field3132 = new class220();
        this.field3132.method3743(2);
        this.field3132.method3740(arg1);
        this.field3132.field3147 = var4;
        this.field3132.field3149 = var5;
        this.field3132.field3150 = 0;
        this.field3132.field3151 = 0;
        this.field3132.field3146 = arg2;
    }

    @ObfuscatedName("hn.n(S)Ljava/lang/String;")
    public String method3686() {
        return this.field3133;
    }

    @ObfuscatedName("hn.d(B)Ljava/lang/String;")
    public String method3687() {
        return this.field3134;
    }
}
