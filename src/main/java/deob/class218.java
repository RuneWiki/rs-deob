package deob;

@ObfuscatedName("hu")
public class class218 {

    @ObfuscatedName("hu.x")
    public final int field3205;

    @ObfuscatedName("hu.r")
    public final long field3207;

    @ObfuscatedName("hu.j")
    public final class224 field3204;

    @ObfuscatedName("hu.z")
    public String field3206;

    @ObfuscatedName("hu.i")
    public String field3203;

    public class218(class123 arg0, byte arg1, int arg2) {
        this.field3206 = arg0.method2626();
        this.field3203 = arg0.method2626();
        this.field3205 = arg0.method2403();
        this.field3207 = arg0.method2414();
        int var4 = arg0.method2413();
        int var5 = arg0.method2413();
        this.field3204 = new class224();
        this.field3204.method3765(2);
        this.field3204.method3760(arg1);
        this.field3204.field3220 = var4;
        this.field3204.field3221 = var5;
        this.field3204.field3223 = 0;
        this.field3204.field3224 = 0;
        this.field3204.field3222 = arg2;
    }

    @ObfuscatedName("hu.x(S)Ljava/lang/String;")
    public String method3719() {
        return this.field3206;
    }

    @ObfuscatedName("hu.r(B)Ljava/lang/String;")
    public String method3717() {
        return this.field3203;
    }
}
