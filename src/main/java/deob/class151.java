package deob;

@ObfuscatedName("ei")
public class class151 extends class129 {

    // $FF: synthetic field
    public final class132 this$0;

    @ObfuscatedName("ei.o")
    public long field1723;

    @ObfuscatedName("ei.q")
    public String field1721;

    public class151(class132 arg0) {
        this.this$0 = arg0;
        this.field1723 = -1L;
        this.field1721 = null;
    }

    @ObfuscatedName("ei.o(Lpx;I)V")
    public void method2639(class440 arg0) {
        if (arg0.method7071() != 255) {
            arg0.field4678--;
            this.field1723 = arg0.method7014();
        }
        this.field1721 = arg0.method6902();
    }

    @ObfuscatedName("ei.q(Lek;B)V")
    public void method2636(class140 arg0) {
        arg0.method2692(this.field1723, this.field1721);
    }
}
