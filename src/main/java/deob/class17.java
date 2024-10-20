package deob;

@ObfuscatedName("f")
public class class17 {

    @ObfuscatedName("f.z")
    public final int field79;

    @ObfuscatedName("f.k")
    public final long field75;

    @ObfuscatedName("f.s")
    public final class19 field76;

    @ObfuscatedName("f.t")
    public String field74;

    @ObfuscatedName("f.i")
    public String field81;

    public class17(class310 arg0, byte arg1, int arg2) {
        this.field74 = arg0.method5202();
        this.field81 = arg0.method5202();
        this.field79 = arg0.method5195();
        this.field75 = arg0.method5285();
        int var4 = arg0.method5270();
        int var5 = arg0.method5270();
        this.field76 = new class19();
        this.field76.method155(2);
        this.field76.method150(arg1);
        this.field76.field91 = var4;
        this.field76.field99 = var5;
        this.field76.field93 = 0;
        this.field76.field94 = 0;
        this.field76.field90 = arg2;
    }

    @ObfuscatedName("f.z(I)Ljava/lang/String;")
    public String method120() {
        return this.field74;
    }

    @ObfuscatedName("f.k(I)Ljava/lang/String;")
    public String method121() {
        return this.field81;
    }
}
