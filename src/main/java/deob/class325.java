package deob;

@ObfuscatedName("la")
public class class325 {

    @ObfuscatedName("la.c")
    public final int field4100;

    @ObfuscatedName("la.p")
    public final long field4105;

    @ObfuscatedName("la.f")
    public final class326 field4104;

    @ObfuscatedName("la.n")
    public String field4102;

    @ObfuscatedName("la.k")
    public String field4103;

    public class325(class445 arg0, byte arg1, int arg2) {
        this.field4102 = arg0.method7206();
        this.field4103 = arg0.method7206();
        this.field4100 = arg0.method7198();
        this.field4105 = arg0.method7319();
        int var4 = arg0.method7201();
        int var5 = arg0.method7201();
        this.field4104 = new class326();
        this.field4104.method5576(2);
        this.field4104.method5571(arg1);
        this.field4104.field4110 = var4;
        this.field4104.field4111 = var5;
        this.field4104.field4112 = 0;
        this.field4104.field4113 = 0;
        this.field4104.field4108 = arg2;
    }

    @ObfuscatedName("la.c(I)Ljava/lang/String;")
    public String method5566() {
        return this.field4102;
    }

    @ObfuscatedName("la.p(I)Ljava/lang/String;")
    public String method5565() {
        return this.field4103;
    }
}
