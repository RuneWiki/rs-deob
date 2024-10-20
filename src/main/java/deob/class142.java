package deob;

@ObfuscatedName("eb")
public class class142 extends class127 {

    // $FF: synthetic field
    public final class130 this$0;

    @ObfuscatedName("eb.c")
    public long field1634;

    @ObfuscatedName("eb.l")
    public String field1635;

    @ObfuscatedName("eb.s")
    public int field1633;

    public class142(class130 arg0) {
        this.this$0 = arg0;
        this.field1634 = -1L;
        this.field1635 = null;
        this.field1633 = 0;
    }

    @ObfuscatedName("eb.c(Lpi;I)V")
    public void method2583(class421 arg0) {
        if (arg0.method6686() != 255) {
            arg0.field4512--;
            this.field1634 = arg0.method6670();
        }
        this.field1635 = arg0.method6721();
        this.field1633 = arg0.method6666();
    }

    @ObfuscatedName("eb.l(Ley;I)V")
    public void method2576(class138 arg0) {
        arg0.method2648(this.field1634, this.field1635, this.field1633);
    }
}
