package deob;

@ObfuscatedName("eq")
public class class139 extends class117 {

    // $FF: synthetic field
    public final class120 this$0;

    @ObfuscatedName("eq.n")
    public long field1525;

    @ObfuscatedName("eq.c")
    public String field1526;

    public class139(class120 arg0) {
        this.this$0 = arg0;
        this.field1525 = -1L;
        this.field1526 = null;
    }

    @ObfuscatedName("eq.n(Lot;I)V")
    public void method2345(class400 arg0) {
        if (arg0.method6217() != 255) {
            arg0.field4272--;
            this.field1525 = arg0.method6223();
        }
        this.field1526 = arg0.method6198();
    }

    @ObfuscatedName("eq.c(Ldi;I)V")
    public void method2348(class128 arg0) {
        arg0.method2392(this.field1525, this.field1526);
    }
}
