package deob;

@ObfuscatedName("fs")
public class class150 extends class146 {

    // $FF: synthetic field
    public final class149 this$0;

    @ObfuscatedName("fs.aq")
    public int field1698;

    @ObfuscatedName("fs.aw")
    public byte field1696;

    public class150(class149 arg0) {
        this.this$0 = arg0;
        this.field1698 = -1;
    }

    @ObfuscatedName("fs.aq(Luq;I)V")
    public void method3033(class534 arg0) {
        this.field1698 = arg0.method8593();
        this.field1696 = arg0.method8592();
    }

    @ObfuscatedName("fs.aw(Lgt;I)V")
    public void method3030(class157 arg0) {
        arg0.method3112(this.field1698, this.field1696);
    }
}
