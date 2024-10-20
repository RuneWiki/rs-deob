package deob;

@ObfuscatedName("ha")
public class class218 {

    @ObfuscatedName("ha.l")
    public final int field3209;

    @ObfuscatedName("ha.g")
    public final long field3210;

    @ObfuscatedName("ha.r")
    public final class224 field3207;

    @ObfuscatedName("ha.e")
    public String field3205;

    @ObfuscatedName("ha.h")
    public String field3206;

    public class218(class123 arg0, byte arg1, int arg2) {
        this.field3205 = arg0.method2520();
        this.field3206 = arg0.method2520();
        this.field3209 = arg0.method2492();
        this.field3210 = arg0.method2506();
        int var4 = arg0.method2477();
        int var5 = arg0.method2477();
        this.field3207 = new class224();
        this.field3207.method3897(2);
        this.field3207.method3898(arg1);
        this.field3207.field3217 = var4;
        this.field3207.field3215 = var5;
        this.field3207.field3219 = 0;
        this.field3207.field3218 = 0;
        this.field3207.field3216 = arg2;
    }

    @ObfuscatedName("ha.l(I)Ljava/lang/String;")
    public String method3850() {
        return this.field3205;
    }

    @ObfuscatedName("ha.g(I)Ljava/lang/String;")
    public String method3849() {
        return this.field3206;
    }
}
