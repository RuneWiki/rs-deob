package deob;

@ObfuscatedName("ej")
public class class140 extends class143 {

    // $FF: synthetic field
    public final class144 this$0;

    @ObfuscatedName("ej.c")
    public int field1619;

    @ObfuscatedName("ej.l")
    public byte field1621;

    @ObfuscatedName("ej.s")
    public int field1624;

    @ObfuscatedName("ej.e")
    public String field1622;

    public class140(class144 arg0) {
        this.this$0 = arg0;
        this.field1619 = -1;
    }

    @ObfuscatedName("ej.c(Lpi;B)V")
    public void method2616(class421 arg0) {
        arg0.method6686();
        this.field1619 = arg0.method6666();
        this.field1621 = arg0.method6664();
        this.field1624 = arg0.method6666();
        arg0.method6670();
        this.field1622 = arg0.method6674();
        arg0.method6686();
    }

    @ObfuscatedName("ej.l(Leg;B)V")
    public void method2621(class147 arg0) {
        class129 var2 = (class129) arg0.field1660.get(this.field1619);
        var2.field1528 = this.field1621;
        var2.field1525 = this.field1624;
        var2.field1527 = new class442(this.field1622);
    }
}
