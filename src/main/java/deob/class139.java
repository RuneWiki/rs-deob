package deob;

@ObfuscatedName("er")
public class class139 extends class117 {

    // $FF: synthetic field
    public final class120 this$0;

    @ObfuscatedName("er.l")
    public long field1532;

    @ObfuscatedName("er.q")
    public String field1531;

    public class139(class120 arg0) {
        this.this$0 = arg0;
        this.field1532 = -1L;
        this.field1531 = null;
    }

    @ObfuscatedName("er.l(Lot;I)V")
    public void method2365(class401 arg0) {
        if (arg0.method6272() != 255) {
            arg0.field4292--;
            this.field1532 = arg0.method6275();
        }
        this.field1531 = arg0.method6280();
    }

    @ObfuscatedName("er.q(Ldk;I)V")
    public void method2366(class128 arg0) {
        arg0.method2466(this.field1532, this.field1531);
    }
}
