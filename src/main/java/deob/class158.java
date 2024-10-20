package deob;

@ObfuscatedName("gw")
public class class158 extends class161 {

    // $FF: synthetic field
    public final class162 this$0;

    @ObfuscatedName("gw.az")
    public int field1766;

    @ObfuscatedName("gw.ah")
    public byte field1763;

    @ObfuscatedName("gw.af")
    public int field1762;

    @ObfuscatedName("gw.at")
    public String field1765;

    public class158(class162 arg0) {
        this.this$0 = arg0;
        this.field1766 = -1;
    }

    @ObfuscatedName("gw.az(Lur;B)V")
    public void method3001(class535 arg0) {
        arg0.method8462();
        this.field1766 = arg0.method8670();
        this.field1763 = arg0.method8463();
        this.field1762 = arg0.method8670();
        arg0.method8469();
        this.field1765 = arg0.method8473();
        arg0.method8462();
    }

    @ObfuscatedName("gw.ah(Lgi;B)V")
    public void method3000(class165 arg0) {
        class147 var2 = (class147) arg0.field1798.get(this.field1766);
        var2.field1683 = this.field1763;
        var2.field1684 = this.field1762;
        var2.field1685 = new class558(this.field1765);
    }
}
