package deob;

@ObfuscatedName("y")
public class class15 {

    @ObfuscatedName("y.n")
    public final int field293;

    @ObfuscatedName("y.p")
    public final long field288;

    @ObfuscatedName("y.i")
    public final class17 field289;

    @ObfuscatedName("y.j")
    public String field290;

    @ObfuscatedName("y.f")
    public String field294;

    public class15(class174 arg0, byte arg1, int arg2) {
        this.field290 = arg0.method3098();
        this.field294 = arg0.method3098();
        this.field293 = arg0.method3065();
        this.field288 = arg0.method2927();
        int var4 = arg0.method3058();
        int var5 = arg0.method3058();
        this.field289 = new class17();
        this.field289.method107(2);
        this.field289.method108(arg1);
        this.field289.field309 = var4;
        this.field289.field310 = var5;
        this.field289.field315 = 0;
        this.field289.field312 = 0;
        this.field289.field308 = arg2;
    }

    @ObfuscatedName("y.n(B)Ljava/lang/String;")
    public String method80() {
        return this.field290;
    }

    @ObfuscatedName("y.p(B)Ljava/lang/String;")
    public String method81() {
        return this.field294;
    }
}
