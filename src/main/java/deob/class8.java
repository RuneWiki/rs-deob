package deob;

@ObfuscatedName("y")
public class class8 {

    @ObfuscatedName("y.u")
    public final int field50;

    @ObfuscatedName("y.f")
    public final long field45;

    @ObfuscatedName("y.b")
    public final class10 field47;

    @ObfuscatedName("y.g")
    public String field46;

    @ObfuscatedName("y.z")
    public String field44;

    public class8(class300 arg0, byte arg1, int arg2) {
        this.field46 = arg0.method5147();
        this.field44 = arg0.method5147();
        this.field50 = arg0.method5337();
        this.field45 = arg0.method5144();
        int var4 = arg0.method5277();
        int var5 = arg0.method5277();
        this.field47 = new class10();
        this.field47.method89(2);
        this.field47.method90(arg1);
        this.field47.field63 = var4;
        this.field47.field64 = var5;
        this.field47.field61 = 0;
        this.field47.field66 = 0;
        this.field47.field62 = arg2;
    }

    @ObfuscatedName("y.u(B)Ljava/lang/String;")
    public String method65() {
        return this.field46;
    }

    @ObfuscatedName("y.f(I)Ljava/lang/String;")
    public String method64() {
        return this.field44;
    }
}
