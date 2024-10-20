package deob;

@ObfuscatedName("er")
public class class137 extends class145 {

    // $FF: synthetic field
    public final class146 this$0;

    @ObfuscatedName("er.o")
    public int field1625;

    public class137(class146 arg0) {
        this.this$0 = arg0;
        this.field1625 = -1;
    }

    @ObfuscatedName("er.o(Lpx;I)V")
    public void method2673(class440 arg0) {
        this.field1625 = arg0.method7082();
        arg0.method7071();
        if (arg0.method7071() != 255) {
            arg0.field4678--;
            arg0.method7014();
        }
    }

    @ObfuscatedName("er.q(Let;I)V")
    public void method2664(class149 arg0) {
        arg0.method2765(this.field1625);
    }
}
