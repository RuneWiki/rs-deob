package deob;

@ObfuscatedName("od")
public class class365 {

    @ObfuscatedName("od.at")
    public final int field4309;

    @ObfuscatedName("od.an")
    public final long field4311;

    @ObfuscatedName("od.av")
    public final class366 field4310;

    @ObfuscatedName("od.as")
    public String field4308;

    @ObfuscatedName("od.ax")
    public String field4312;

    public class365(class501 arg0, byte arg1, int arg2) {
        this.field4308 = arg0.method8253();
        this.field4312 = arg0.method8253();
        this.field4309 = arg0.method8195();
        this.field4311 = arg0.method8135();
        int var4 = arg0.method8134();
        int var5 = arg0.method8134();
        this.field4310 = new class366();
        this.field4310.method6219(2);
        this.field4310.method6229(arg1);
        this.field4310.field4315 = var4;
        this.field4310.field4317 = var5;
        this.field4310.field4318 = 0;
        this.field4310.field4319 = 0;
        this.field4310.field4321 = arg2;
    }

    @ObfuscatedName("od.at(I)Ljava/lang/String;")
    public String method6215() {
        return this.field4308;
    }

    @ObfuscatedName("od.an(B)Ljava/lang/String;")
    public String method6216() {
        return this.field4312;
    }
}
