package deob;

@ObfuscatedName("mv")
public class class345 {

    @ObfuscatedName("mv.f")
    public final int field4289;

    @ObfuscatedName("mv.w")
    public final long field4284;

    @ObfuscatedName("mv.v")
    public final class346 field4290;

    @ObfuscatedName("mv.s")
    public String field4286;

    @ObfuscatedName("mv.z")
    public String field4288;

    public class345(class474 arg0, byte arg1, int arg2) {
        this.field4286 = arg0.method7983();
        this.field4288 = arg0.method7983();
        this.field4289 = arg0.method8032();
        this.field4284 = arg0.method8151();
        int var4 = arg0.method7979();
        int var5 = arg0.method7979();
        this.field4290 = new class346();
        this.field4290.method6160(2);
        this.field4290.method6151(arg1);
        this.field4290.field4291 = var4;
        this.field4290.field4294 = var5;
        this.field4290.field4295 = 0;
        this.field4290.field4296 = 0;
        this.field4290.field4297 = arg2;
    }

    @ObfuscatedName("mv.f(I)Ljava/lang/String;")
    public String method6138() {
        return this.field4286;
    }

    @ObfuscatedName("mv.w(B)Ljava/lang/String;")
    public String method6139() {
        return this.field4288;
    }
}
