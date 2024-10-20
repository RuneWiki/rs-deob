package deob;

@ObfuscatedName("ge")
public class class160 extends class164 {

    // $FF: synthetic field
    public final class165 this$0;

    @ObfuscatedName("ge.aq")
    public String field1788;

    @ObfuscatedName("ge.ad")
    public int field1789;

    @ObfuscatedName("ge.ag")
    public byte field1787;

    public class160(class165 arg0) {
        this.this$0 = arg0;
        this.field1788 = null;
    }

    @ObfuscatedName("ge.aq(Lvp;I)V")
    public void method3101(class547 arg0) {
        if (arg0.method8804() != 255) {
            arg0.field5363--;
            arg0.method8735();
        }
        this.field1788 = arg0.method8738();
        this.field1789 = arg0.method8899();
        this.field1787 = arg0.method8857();
        arg0.method8735();
    }

    @ObfuscatedName("ge.ad(Lgj;I)V")
    public void method3102(class168 arg0) {
        class150 var2 = new class150();
        var2.field1702 = new class569(this.field1788);
        var2.field1701 = this.field1789;
        var2.field1704 = this.field1787;
        arg0.method3203(var2);
    }
}
