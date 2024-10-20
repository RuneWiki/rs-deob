package deob;

@ObfuscatedName("s")
public class class15 {

    @ObfuscatedName("s.e")
    public final int field294;

    @ObfuscatedName("s.n")
    public final long field288;

    @ObfuscatedName("s.g")
    public final class17 field289;

    @ObfuscatedName("s.y")
    public String field295;

    @ObfuscatedName("s.w")
    public String field287;

    public class15(class175 arg0, byte arg1, int arg2) {
        this.field295 = arg0.method3113();
        this.field287 = arg0.method3113();
        this.field294 = arg0.method3091();
        this.field288 = arg0.method2934();
        int var4 = arg0.method2933();
        int var5 = arg0.method2933();
        this.field289 = new class17();
        this.field289.method93(2);
        this.field289.method98(arg1);
        this.field289.field305 = var4;
        this.field289.field306 = var5;
        this.field289.field303 = 0;
        this.field289.field308 = 0;
        this.field289.field304 = arg2;
    }

    @ObfuscatedName("s.e(I)Ljava/lang/String;")
    public String method65() {
        return this.field295;
    }

    @ObfuscatedName("s.n(I)Ljava/lang/String;")
    public String method69() {
        return this.field287;
    }
}
