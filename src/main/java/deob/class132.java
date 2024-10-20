package deob;

@ObfuscatedName("ej")
public class class132 extends class117 {

    // $FF: synthetic field
    public final class120 this$0;

    @ObfuscatedName("ej.i")
    public long field1488;

    @ObfuscatedName("ej.w")
    public String field1487;

    @ObfuscatedName("ej.s")
    public int field1490;

    public class132(class120 arg0) {
        this.this$0 = arg0;
        this.field1488 = -1L;
        this.field1487 = null;
        this.field1490 = 0;
    }

    @ObfuscatedName("ej.i(Lop;I)V")
    public void method2385(class401 arg0) {
        if (arg0.method6240() != 255) {
            arg0.field4300--;
            this.field1488 = arg0.method6249();
        }
        this.field1487 = arg0.method6369();
        this.field1490 = arg0.method6242();
    }

    @ObfuscatedName("ej.w(Ldm;I)V")
    public void method2386(class128 arg0) {
        arg0.method2437(this.field1488, this.field1487, this.field1490);
    }
}
