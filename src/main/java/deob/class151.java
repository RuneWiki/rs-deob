package deob;

@ObfuscatedName("fk")
public class class151 extends class144 {

    // $FF: synthetic field
    public final class147 this$0;

    @ObfuscatedName("fk.au")
    public boolean field1710;

    @ObfuscatedName("fk.ae")
    public byte field1707;

    @ObfuscatedName("fk.ao")
    public byte field1708;

    @ObfuscatedName("fk.at")
    public byte field1706;

    @ObfuscatedName("fk.ac")
    public byte field1709;

    public class151(class147 arg0) {
        this.this$0 = arg0;
    }

    @ObfuscatedName("fk.au(Ltm;I)V")
    public void method2950(class515 arg0) {
        this.field1710 = arg0.method8300() == 1;
        this.field1707 = arg0.method8301();
        this.field1708 = arg0.method8301();
        this.field1706 = arg0.method8301();
        this.field1709 = arg0.method8301();
    }

    @ObfuscatedName("fk.ae(Lfi;B)V")
    public void method2949(class155 arg0) {
        arg0.field1733 = this.field1710;
        arg0.field1747 = this.field1707;
        arg0.field1735 = this.field1708;
        arg0.field1736 = this.field1706;
        arg0.field1737 = this.field1709;
    }
}
