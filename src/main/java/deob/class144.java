package deob;

@ObfuscatedName("el")
public class class144 extends class129 {

    // $FF: synthetic field
    public final class132 this$0;

    @ObfuscatedName("el.o")
    public long field1680;

    @ObfuscatedName("el.q")
    public String field1681;

    @ObfuscatedName("el.l")
    public int field1679;

    public class144(class132 arg0) {
        this.this$0 = arg0;
        this.field1680 = -1L;
        this.field1681 = null;
        this.field1679 = 0;
    }

    @ObfuscatedName("el.o(Lpx;I)V")
    public void method2639(class440 arg0) {
        if (arg0.method7071() != 255) {
            arg0.field4678--;
            this.field1680 = arg0.method7014();
        }
        this.field1681 = arg0.method6902();
        this.field1679 = arg0.method7082();
    }

    @ObfuscatedName("el.q(Lek;B)V")
    public void method2636(class140 arg0) {
        arg0.method2689(this.field1680, this.field1681, this.field1679);
    }
}
