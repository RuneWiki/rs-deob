package deob;

@ObfuscatedName("ew")
public class class144 extends class129 {

    // $FF: synthetic field
    public final class132 this$0;

    @ObfuscatedName("ew.s")
    public long field1643;

    @ObfuscatedName("ew.h")
    public String field1641;

    @ObfuscatedName("ew.w")
    public int field1642;

    public class144(class132 arg0) {
        this.this$0 = arg0;
        this.field1643 = -1L;
        this.field1641 = null;
        this.field1642 = 0;
    }

    @ObfuscatedName("ew.s(Lqr;I)V")
    public void method2621(class444 arg0) {
        if (arg0.method6929() != 255) {
            arg0.field4708--;
            this.field1643 = arg0.method6935();
        }
        this.field1641 = arg0.method6938();
        this.field1642 = arg0.method7120();
    }

    @ObfuscatedName("ew.h(Leh;B)V")
    public void method2622(class140 arg0) {
        arg0.method2727(this.field1643, this.field1641, this.field1642);
    }
}
