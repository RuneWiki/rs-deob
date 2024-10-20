package deob;

@ObfuscatedName("ep")
public class class139 extends class117 {

    // $FF: synthetic field
    public final class120 this$0;

    @ObfuscatedName("ep.i")
    public long field1526;

    @ObfuscatedName("ep.w")
    public String field1525;

    public class139(class120 arg0) {
        this.this$0 = arg0;
        this.field1526 = -1L;
        this.field1525 = null;
    }

    @ObfuscatedName("ep.i(Lop;I)V")
    public void method2385(class401 arg0) {
        if (arg0.method6240() != 255) {
            arg0.field4300--;
            this.field1526 = arg0.method6249();
        }
        this.field1525 = arg0.method6369();
    }

    @ObfuscatedName("ep.w(Ldm;I)V")
    public void method2386(class128 arg0) {
        arg0.method2440(this.field1526, this.field1525);
    }
}
