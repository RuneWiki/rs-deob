package deob;

@ObfuscatedName("ht")
public class class218 {

    @ObfuscatedName("ht.m")
    public final int field3202;

    @ObfuscatedName("ht.w")
    public final long field3198;

    @ObfuscatedName("ht.e")
    public final class224 field3199;

    @ObfuscatedName("ht.o")
    public String field3203;

    @ObfuscatedName("ht.g")
    public String field3201;

    public class218(class123 arg0, byte arg1, int arg2) {
        this.field3203 = arg0.method2422();
        this.field3201 = arg0.method2422();
        this.field3202 = arg0.method2548();
        this.field3198 = arg0.method2420();
        int var4 = arg0.method2419();
        int var5 = arg0.method2419();
        this.field3199 = new class224();
        this.field3199.method3807(2);
        this.field3199.method3808(arg1);
        this.field3199.field3218 = var4;
        this.field3199.field3221 = var5;
        this.field3199.field3222 = 0;
        this.field3199.field3220 = 0;
        this.field3199.field3219 = arg2;
    }

    @ObfuscatedName("ht.m(I)Ljava/lang/String;")
    public String method3770() {
        return this.field3203;
    }

    @ObfuscatedName("ht.w(I)Ljava/lang/String;")
    public String method3766() {
        return this.field3201;
    }
}
