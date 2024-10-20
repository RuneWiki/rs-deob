package deob;

@ObfuscatedName("m")
public class class8 {

    @ObfuscatedName("m.a")
    public final int field56;

    @ObfuscatedName("m.s")
    public final long field50;

    @ObfuscatedName("m.g")
    public final class10 field51;

    @ObfuscatedName("m.x")
    public String field52;

    @ObfuscatedName("m.h")
    public String field53;

    public class8(class190 arg0, byte arg1, int arg2) {
        this.field52 = arg0.method3647();
        this.field53 = arg0.method3647();
        this.field56 = arg0.method3610();
        this.field50 = arg0.method3668();
        int var4 = arg0.method3460();
        int var5 = arg0.method3460();
        this.field51 = new class10();
        this.field51.method102(2);
        this.field51.method109(arg1);
        this.field51.field74 = var4;
        this.field51.field66 = var5;
        this.field51.field67 = 0;
        this.field51.field68 = 0;
        this.field51.field63 = arg2;
    }

    @ObfuscatedName("m.a(B)Ljava/lang/String;")
    public String method76() {
        return this.field52;
    }

    @ObfuscatedName("m.s(I)Ljava/lang/String;")
    public String method77() {
        return this.field53;
    }
}
