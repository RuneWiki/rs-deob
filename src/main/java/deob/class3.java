package deob;

@ObfuscatedName("u")
public class class3 {

    @ObfuscatedName("u.f")
    public final int field23;

    @ObfuscatedName("u.i")
    public final long field19;

    @ObfuscatedName("u.u")
    public final class5 field20;

    @ObfuscatedName("u.h")
    public String field27;

    @ObfuscatedName("u.r")
    public String field22;

    public class3(class154 arg0, byte arg1, int arg2) {
        this.field27 = arg0.method2674();
        this.field22 = arg0.method2674();
        this.field23 = arg0.method2668();
        this.field19 = arg0.method2726();
        int var4 = arg0.method2695();
        int var5 = arg0.method2695();
        this.field20 = new class5();
        this.field20.method34(2);
        this.field20.method35(arg1);
        this.field20.field36 = var4;
        this.field20.field38 = var5;
        this.field20.field45 = 0;
        this.field20.field37 = 0;
        this.field20.field39 = arg2;
    }

    @ObfuscatedName("u.f(I)Ljava/lang/String;")
    public String method11() {
        return this.field27;
    }

    @ObfuscatedName("u.i(S)Ljava/lang/String;")
    public String method16() {
        return this.field22;
    }
}
