package deob;

@ObfuscatedName("jt")
public class class261 {

    @ObfuscatedName("jt.f")
    public final int field3322;

    @ObfuscatedName("jt.o")
    public final long field3326;

    @ObfuscatedName("jt.u")
    public final class262 field3324;

    @ObfuscatedName("jt.p")
    public String field3325;

    @ObfuscatedName("jt.b")
    public String field3323;

    public class261(class382 arg0, byte arg1, int arg2) {
        this.field3325 = arg0.method5865();
        this.field3323 = arg0.method5865();
        this.field3322 = arg0.method5858();
        this.field3326 = arg0.method6069();
        int var4 = arg0.method5861();
        int var5 = arg0.method5861();
        this.field3324 = new class262();
        this.field3324.method4078(2);
        this.field3324.method4079(arg1);
        this.field3324.field3329 = var4;
        this.field3324.field3330 = var5;
        this.field3324.field3331 = 0;
        this.field3324.field3332 = 0;
        this.field3324.field3327 = arg2;
    }

    @ObfuscatedName("jt.f(B)Ljava/lang/String;")
    public String method4071() {
        return this.field3325;
    }

    @ObfuscatedName("jt.o(B)Ljava/lang/String;")
    public String method4064() {
        return this.field3323;
    }
}
