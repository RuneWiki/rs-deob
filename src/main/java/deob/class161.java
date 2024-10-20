package deob;

@ObfuscatedName("gr")
public class class161 extends class164 {

    // $FF: synthetic field
    public final class165 this$0;

    @ObfuscatedName("gr.aq")
    public int field1794;

    @ObfuscatedName("gr.ad")
    public byte field1792;

    @ObfuscatedName("gr.ag")
    public int field1791;

    @ObfuscatedName("gr.ak")
    public String field1793;

    public class161(class165 arg0) {
        this.this$0 = arg0;
        this.field1794 = -1;
    }

    @ObfuscatedName("gr.aq(Lvp;I)V")
    public void method3101(class547 arg0) {
        arg0.method8804();
        this.field1794 = arg0.method8899();
        this.field1792 = arg0.method8857();
        this.field1791 = arg0.method8899();
        arg0.method8735();
        this.field1793 = arg0.method8739();
        arg0.method8804();
    }

    @ObfuscatedName("gr.ad(Lgj;I)V")
    public void method3102(class168 arg0) {
        class150 var2 = (class150) arg0.field1820.get(this.field1794);
        var2.field1704 = this.field1792;
        var2.field1701 = this.field1791;
        var2.field1702 = new class569(this.field1793);
    }
}
