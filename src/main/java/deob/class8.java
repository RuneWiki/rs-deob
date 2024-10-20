package deob;

@ObfuscatedName("m")
public class class8 {

    @ObfuscatedName("m.z")
    public final int field48;

    @ObfuscatedName("m.n")
    public final long field51;

    @ObfuscatedName("m.v")
    public final class10 field45;

    @ObfuscatedName("m.u")
    public String field47;

    @ObfuscatedName("m.r")
    public String field44;

    public class8(class300 arg0, byte arg1, int arg2) {
        this.field47 = arg0.method4999();
        this.field44 = arg0.method4999();
        this.field48 = arg0.method4992();
        this.field51 = arg0.method4996();
        int var4 = arg0.method5085();
        int var5 = arg0.method5085();
        this.field45 = new class10();
        this.field45.method96(2);
        this.field45.method103(arg1);
        this.field45.field57 = var4;
        this.field45.field58 = var5;
        this.field45.field59 = 0;
        this.field45.field56 = 0;
        this.field45.field61 = arg2;
    }

    @ObfuscatedName("m.z(I)Ljava/lang/String;")
    public String method76() {
        return this.field47;
    }

    @ObfuscatedName("m.n(I)Ljava/lang/String;")
    public String method75() {
        return this.field44;
    }
}
