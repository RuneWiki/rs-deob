package deob;

@ObfuscatedName("y")
public class class17 {

    @ObfuscatedName("y.f")
    public final int field77;

    @ObfuscatedName("y.b")
    public final long field72;

    @ObfuscatedName("y.l")
    public final class19 field80;

    @ObfuscatedName("y.m")
    public String field74;

    @ObfuscatedName("y.z")
    public String field71;

    public class17(class311 arg0, byte arg1, int arg2) {
        this.field74 = arg0.method5189();
        this.field71 = arg0.method5189();
        this.field77 = arg0.method5163();
        this.field72 = arg0.method5186();
        int var4 = arg0.method5330();
        int var5 = arg0.method5330();
        this.field80 = new class19();
        this.field80.method157(2);
        this.field80.method174(arg1);
        this.field80.field84 = var4;
        this.field80.field87 = var5;
        this.field80.field90 = 0;
        this.field80.field89 = 0;
        this.field80.field85 = arg2;
    }

    @ObfuscatedName("y.f(B)Ljava/lang/String;")
    public String method141() {
        return this.field74;
    }

    @ObfuscatedName("y.b(I)Ljava/lang/String;")
    public String method135() {
        return this.field71;
    }
}
