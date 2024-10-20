package deob;

@ObfuscatedName("fl")
public class class151 extends class161 {

    // $FF: synthetic field
    public final class162 this$0;

    @ObfuscatedName("fl.az")
    public int field1713;

    @ObfuscatedName("fl.ah")
    public byte field1709;

    @ObfuscatedName("fl.af")
    public int field1710;

    @ObfuscatedName("fl.at")
    public String field1712;

    public class151(class162 arg0) {
        this.this$0 = arg0;
        this.field1713 = -1;
    }

    @ObfuscatedName("fl.az(Lur;B)V")
    public void method3001(class535 arg0) {
        this.field1713 = arg0.method8670();
        this.field1709 = arg0.method8463();
        this.field1710 = arg0.method8670();
        arg0.method8469();
        this.field1712 = arg0.method8473();
    }

    @ObfuscatedName("fl.ah(Lgi;B)V")
    public void method3000(class165 arg0) {
        class147 var2 = (class147) arg0.field1798.get(this.field1713);
        var2.field1683 = this.field1709;
        var2.field1684 = this.field1710;
        var2.field1685 = new class558(this.field1712);
    }
}
