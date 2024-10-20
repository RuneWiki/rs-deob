package deob;

@ObfuscatedName("ff")
public class class150 extends class160 {

    // $FF: synthetic field
    public final class161 this$0;

    @ObfuscatedName("ff.aw")
    public int field1679;

    @ObfuscatedName("ff.ay")
    public byte field1683;

    @ObfuscatedName("ff.ar")
    public int field1681;

    @ObfuscatedName("ff.am")
    public String field1680;

    public class150(class161 arg0) {
        this.this$0 = arg0;
        this.field1679 = -1;
    }

    @ObfuscatedName("ff.aw(Lty;B)V")
    public void method2988(class514 arg0) {
        this.field1679 = arg0.method8246();
        this.field1683 = arg0.method8264();
        this.field1681 = arg0.method8246();
        arg0.method8251();
        this.field1680 = arg0.method8369();
    }

    @ObfuscatedName("ff.ay(Lgh;I)V")
    public void method2983(class164 arg0) {
        class146 var2 = (class146) arg0.field1775.get(this.field1679);
        var2.field1656 = this.field1683;
        var2.field1653 = this.field1681;
        var2.field1654 = new class538(this.field1680);
    }
}
