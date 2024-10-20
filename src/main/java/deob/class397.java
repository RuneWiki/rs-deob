package deob;

@ObfuscatedName("px")
public class class397 {

    @ObfuscatedName("px.ab")
    public final int field4564;

    @ObfuscatedName("px.ay")
    public final long field4560;

    @ObfuscatedName("px.an")
    public final class398 field4561;

    @ObfuscatedName("px.au")
    public String field4562;

    @ObfuscatedName("px.ax")
    public String field4559;

    public class397(class549 arg0, byte arg1, int arg2) {
        this.field4562 = arg0.method8808();
        this.field4559 = arg0.method8808();
        this.field4564 = arg0.method8968();
        this.field4560 = arg0.method8804();
        int var4 = arg0.method8803();
        int var5 = arg0.method8803();
        this.field4561 = new class398();
        this.field4561.method6813(2);
        this.field4561.method6815(arg1);
        this.field4561.field4567 = var4;
        this.field4561.field4568 = var5;
        this.field4561.field4565 = 0;
        this.field4561.field4570 = 0;
        this.field4561.field4566 = arg2;
    }

    @ObfuscatedName("px.ab(B)Ljava/lang/String;")
    public String method6806() {
        return this.field4562;
    }

    @ObfuscatedName("px.ay(B)Ljava/lang/String;")
    public String method6808() {
        return this.field4559;
    }
}
