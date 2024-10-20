package deob;

@ObfuscatedName("v")
public class class15 {

    @ObfuscatedName("v.i")
    public final int field299;

    @ObfuscatedName("v.j")
    public final long field296;

    @ObfuscatedName("v.a")
    public final class17 field297;

    @ObfuscatedName("v.r")
    public String field298;

    @ObfuscatedName("v.o")
    public String field295;

    public class15(class175 arg0, byte arg1, int arg2) {
        this.field298 = arg0.method3002();
        this.field295 = arg0.method3002();
        this.field299 = arg0.method2995();
        this.field296 = arg0.method2981();
        int var4 = arg0.method2998();
        int var5 = arg0.method2998();
        this.field297 = new class17();
        this.field297.method114(2);
        this.field297.method102(arg1);
        this.field297.field309 = var4;
        this.field297.field310 = var5;
        this.field297.field314 = 0;
        this.field297.field312 = 0;
        this.field297.field311 = arg2;
    }

    @ObfuscatedName("v.i(I)Ljava/lang/String;")
    public String method75() {
        return this.field298;
    }

    @ObfuscatedName("v.j(I)Ljava/lang/String;")
    public String method78() {
        return this.field295;
    }
}
