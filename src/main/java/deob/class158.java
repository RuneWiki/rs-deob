package deob;

@ObfuscatedName("gw")
public class class158 extends class161 {

    // $FF: synthetic field
    public final class162 this$0;

    @ObfuscatedName("gw.at")
    public int field1734;

    @ObfuscatedName("gw.ah")
    public byte field1732;

    @ObfuscatedName("gw.ar")
    public int field1735;

    @ObfuscatedName("gw.ao")
    public String field1733;

    public class158(class162 arg0) {
        this.this$0 = arg0;
        this.field1734 = -1;
    }

    @ObfuscatedName("gw.at(Luj;I)V")
    public void method3069(class527 arg0) {
        arg0.method8410();
        this.field1734 = arg0.method8412();
        this.field1732 = arg0.method8616();
        this.field1735 = arg0.method8412();
        arg0.method8417();
        this.field1733 = arg0.method8535();
        arg0.method8410();
    }

    @ObfuscatedName("gw.ah(Lgn;B)V")
    public void method3070(class165 arg0) {
        class147 var2 = (class147) arg0.field1769.get(this.field1734);
        var2.field1649 = this.field1732;
        var2.field1647 = this.field1735;
        var2.field1648 = new class550(this.field1733);
    }
}
