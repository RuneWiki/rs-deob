package deob;

@ObfuscatedName("eu")
public class class139 extends class143 {

    // $FF: synthetic field
    public final class144 this$0;

    @ObfuscatedName("eu.c")
    public String field1618;

    @ObfuscatedName("eu.l")
    public int field1617;

    @ObfuscatedName("eu.s")
    public byte field1616;

    public class139(class144 arg0) {
        this.this$0 = arg0;
        this.field1618 = null;
    }

    @ObfuscatedName("eu.c(Lpi;B)V")
    public void method2616(class421 arg0) {
        if (arg0.method6686() != 255) {
            arg0.field4512--;
            arg0.method6670();
        }
        this.field1618 = arg0.method6721();
        this.field1617 = arg0.method6666();
        this.field1616 = arg0.method6664();
        arg0.method6670();
    }

    @ObfuscatedName("eu.l(Leg;B)V")
    public void method2621(class147 arg0) {
        class129 var2 = new class129();
        var2.field1527 = new class442(this.field1618);
        var2.field1525 = this.field1617;
        var2.field1528 = this.field1616;
        arg0.method2728(var2);
    }
}
