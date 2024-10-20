package deob;

@ObfuscatedName("gg")
public class class157 extends class161 {

    // $FF: synthetic field
    public final class162 this$0;

    @ObfuscatedName("gg.az")
    public String field1759;

    @ObfuscatedName("gg.ah")
    public int field1760;

    @ObfuscatedName("gg.af")
    public byte field1761;

    public class157(class162 arg0) {
        this.this$0 = arg0;
        this.field1759 = null;
    }

    @ObfuscatedName("gg.az(Lur;B)V")
    public void method3001(class535 arg0) {
        if (arg0.method8462() != 255) {
            arg0.field5233--;
            arg0.method8469();
        }
        this.field1759 = arg0.method8622();
        this.field1760 = arg0.method8670();
        this.field1761 = arg0.method8463();
        arg0.method8469();
    }

    @ObfuscatedName("gg.ah(Lgi;B)V")
    public void method3000(class165 arg0) {
        class147 var2 = new class147();
        var2.field1685 = new class558(this.field1759);
        var2.field1684 = this.field1760;
        var2.field1683 = this.field1761;
        arg0.method3108(var2);
    }
}
