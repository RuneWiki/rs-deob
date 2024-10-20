package deob;

@ObfuscatedName("fz")
public class class151 extends class161 {

    // $FF: synthetic field
    public final class162 this$0;

    @ObfuscatedName("fz.at")
    public int field1675;

    @ObfuscatedName("fz.ah")
    public byte field1676;

    @ObfuscatedName("fz.ar")
    public int field1673;

    @ObfuscatedName("fz.ao")
    public String field1674;

    public class151(class162 arg0) {
        this.this$0 = arg0;
        this.field1675 = -1;
    }

    @ObfuscatedName("fz.at(Luj;I)V")
    public void method3069(class527 arg0) {
        this.field1675 = arg0.method8412();
        this.field1676 = arg0.method8616();
        this.field1673 = arg0.method8412();
        arg0.method8417();
        this.field1674 = arg0.method8535();
    }

    @ObfuscatedName("fz.ah(Lgn;B)V")
    public void method3070(class165 arg0) {
        class147 var2 = (class147) arg0.field1769.get(this.field1675);
        var2.field1649 = this.field1676;
        var2.field1647 = this.field1673;
        var2.field1648 = new class550(this.field1674);
    }
}
