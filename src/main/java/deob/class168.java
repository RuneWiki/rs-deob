package deob;

@ObfuscatedName("gf")
public class class168 extends class161 {

    // $FF: synthetic field
    public final class162 this$0;

    @ObfuscatedName("gf.az")
    public String field1825;

    @ObfuscatedName("gf.ah")
    public byte field1819;

    @ObfuscatedName("gf.af")
    public byte field1820;

    public class168(class162 arg0) {
        this.this$0 = arg0;
    }

    @ObfuscatedName("gf.az(Lur;B)V")
    public void method3001(class535 arg0) {
        this.field1825 = arg0.method8622();
        if (this.field1825 != null) {
            arg0.method8462();
            this.field1819 = arg0.method8463();
            this.field1820 = arg0.method8463();
        }
    }

    @ObfuscatedName("gf.ah(Lgi;B)V")
    public void method3000(class165 arg0) {
        arg0.field1803 = this.field1825;
        if (this.field1825 != null) {
            arg0.field1802 = this.field1819;
            arg0.field1800 = this.field1820;
        }
    }
}
