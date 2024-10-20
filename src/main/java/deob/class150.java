package deob;

@ObfuscatedName("eo")
public class class150 extends class143 {

    // $FF: synthetic field
    public final class144 this$0;

    @ObfuscatedName("eo.c")
    public String field1678;

    @ObfuscatedName("eo.l")
    public byte field1676;

    @ObfuscatedName("eo.s")
    public byte field1677;

    public class150(class144 arg0) {
        this.this$0 = arg0;
    }

    @ObfuscatedName("eo.c(Lpi;B)V")
    public void method2616(class421 arg0) {
        this.field1678 = arg0.method6721();
        if (this.field1678 != null) {
            arg0.method6686();
            this.field1676 = arg0.method6664();
            this.field1677 = arg0.method6664();
        }
    }

    @ObfuscatedName("eo.l(Leg;B)V")
    public void method2621(class147 arg0) {
        arg0.field1662 = this.field1678;
        if (this.field1678 != null) {
            arg0.field1657 = this.field1676;
            arg0.field1659 = this.field1677;
        }
    }
}
