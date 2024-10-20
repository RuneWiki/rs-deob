package deob;

@ObfuscatedName("p")
public class class15 {

    @ObfuscatedName("p.g")
    public final int field295;

    @ObfuscatedName("p.e")
    public final long field288;

    @ObfuscatedName("p.b")
    public final class17 field289;

    @ObfuscatedName("p.z")
    public String field291;

    @ObfuscatedName("p.n")
    public String field287;

    public class15(class195 arg0, byte arg1, int arg2) {
        this.field291 = arg0.method3429();
        this.field287 = arg0.method3429();
        this.field295 = arg0.method3310();
        this.field288 = arg0.method3381();
        int var4 = arg0.method3472();
        int var5 = arg0.method3472();
        this.field289 = new class17();
        this.field289.method103(2);
        this.field289.method102(arg1);
        this.field289.field302 = var4;
        this.field289.field303 = var5;
        this.field289.field308 = 0;
        this.field289.field305 = 0;
        this.field289.field301 = arg2;
    }

    @ObfuscatedName("p.g(I)Ljava/lang/String;")
    public String method75() {
        return this.field291;
    }

    @ObfuscatedName("p.e(I)Ljava/lang/String;")
    public String method74() {
        return this.field287;
    }
}
