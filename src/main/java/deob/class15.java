package deob;

@ObfuscatedName("a")
public class class15 {

    @ObfuscatedName("a.w")
    public final int field297;

    @ObfuscatedName("a.s")
    public final long field294;

    @ObfuscatedName("a.q")
    public final class17 field295;

    @ObfuscatedName("a.o")
    public String field296;

    @ObfuscatedName("a.g")
    public String field305;

    public class15(class174 arg0, byte arg1, int arg2) {
        this.field296 = arg0.method3111();
        this.field305 = arg0.method3111();
        this.field297 = arg0.method3178();
        this.field294 = arg0.method2977();
        int var4 = arg0.method3131();
        int var5 = arg0.method3131();
        this.field295 = new class17();
        this.field295.method90(2);
        this.field295.method91(arg1);
        this.field295.field320 = var4;
        this.field295.field315 = var5;
        this.field295.field314 = 0;
        this.field295.field317 = 0;
        this.field295.field318 = arg2;
    }

    @ObfuscatedName("a.w(I)Ljava/lang/String;")
    public String method73() {
        return this.field296;
    }

    @ObfuscatedName("a.s(I)Ljava/lang/String;")
    public String method71() {
        return this.field305;
    }
}
