package deob;

@ObfuscatedName("lc")
public class class324 {

    @ObfuscatedName("lc.v")
    public final int field4022;

    @ObfuscatedName("lc.c")
    public final long field4025;

    @ObfuscatedName("lc.i")
    public final class325 field4023;

    @ObfuscatedName("lc.f")
    public String field4024;

    @ObfuscatedName("lc.b")
    public String field4021;

    public class324(class438 arg0, byte arg1, int arg2) {
        this.field4024 = arg0.method6981();
        this.field4021 = arg0.method6981();
        this.field4022 = arg0.method7148();
        this.field4025 = arg0.method7003();
        int var4 = arg0.method6976();
        int var5 = arg0.method6976();
        this.field4023 = new class325();
        this.field4023.method5441(2);
        this.field4023.method5448(arg1);
        this.field4023.field4027 = var4;
        this.field4023.field4033 = var5;
        this.field4023.field4029 = 0;
        this.field4023.field4031 = 0;
        this.field4023.field4028 = arg2;
    }

    @ObfuscatedName("lc.v(I)Ljava/lang/String;")
    public String method5432() {
        return this.field4024;
    }

    @ObfuscatedName("lc.c(I)Ljava/lang/String;")
    public String method5433() {
        return this.field4021;
    }
}
