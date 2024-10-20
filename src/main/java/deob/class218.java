package deob;

@ObfuscatedName("ht")
public class class218 {

    @ObfuscatedName("ht.e")
    public final int field3198;

    @ObfuscatedName("ht.l")
    public final long field3193;

    @ObfuscatedName("ht.c")
    public final class224 field3195;

    @ObfuscatedName("ht.h")
    public String field3196;

    @ObfuscatedName("ht.r")
    public String field3197;

    public class218(class123 arg0, byte arg1, int arg2) {
        this.field3196 = arg0.method2471();
        this.field3197 = arg0.method2471();
        this.field3198 = arg0.method2466();
        this.field3193 = arg0.method2469();
        int var4 = arg0.method2468();
        int var5 = arg0.method2468();
        this.field3195 = new class224();
        this.field3195.method3839(2);
        this.field3195.method3845(arg1);
        this.field3195.field3216 = var4;
        this.field3195.field3214 = var5;
        this.field3195.field3218 = 0;
        this.field3195.field3219 = 0;
        this.field3195.field3215 = arg2;
    }

    @ObfuscatedName("ht.e(I)Ljava/lang/String;")
    public String method3790() {
        return this.field3196;
    }

    @ObfuscatedName("ht.l(I)Ljava/lang/String;")
    public String method3792() {
        return this.field3197;
    }
}
