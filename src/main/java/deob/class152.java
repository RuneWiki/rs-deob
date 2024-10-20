package deob;

@ObfuscatedName("ey")
public class class152 extends class145 {

    // $FF: synthetic field
    public final class146 this$0;

    @ObfuscatedName("ey.o")
    public String field1729;

    @ObfuscatedName("ey.q")
    public byte field1726;

    @ObfuscatedName("ey.l")
    public byte field1728;

    public class152(class146 arg0) {
        this.this$0 = arg0;
    }

    @ObfuscatedName("ey.o(Lpx;I)V")
    public void method2673(class440 arg0) {
        this.field1729 = arg0.method6902();
        if (this.field1729 != null) {
            arg0.method7071();
            this.field1726 = arg0.method7034();
            this.field1728 = arg0.method7034();
        }
    }

    @ObfuscatedName("ey.q(Let;I)V")
    public void method2664(class149 arg0) {
        arg0.field1711 = this.field1729;
        if (this.field1729 != null) {
            arg0.field1712 = this.field1726;
            arg0.field1707 = this.field1728;
        }
    }
}
