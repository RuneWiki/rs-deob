package deob;

@ObfuscatedName("gm")
public class class157 extends class161 {

    // $FF: synthetic field
    public final class162 this$0;

    @ObfuscatedName("gm.at")
    public String field1727;

    @ObfuscatedName("gm.ah")
    public int field1725;

    @ObfuscatedName("gm.ar")
    public byte field1726;

    public class157(class162 arg0) {
        this.this$0 = arg0;
        this.field1727 = null;
    }

    @ObfuscatedName("gm.at(Luj;I)V")
    public void method3069(class527 arg0) {
        if (arg0.method8410() != 255) {
            arg0.field5137--;
            arg0.method8417();
        }
        this.field1727 = arg0.method8420();
        this.field1725 = arg0.method8412();
        this.field1726 = arg0.method8616();
        arg0.method8417();
    }

    @ObfuscatedName("gm.ah(Lgn;B)V")
    public void method3070(class165 arg0) {
        class147 var2 = new class147();
        var2.field1648 = new class550(this.field1727);
        var2.field1647 = this.field1725;
        var2.field1649 = this.field1726;
        arg0.method3176(var2);
    }
}
