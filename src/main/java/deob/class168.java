package deob;

@ObfuscatedName("ga")
public class class168 extends class161 {

    // $FF: synthetic field
    public final class162 this$0;

    @ObfuscatedName("ga.at")
    public String field1786;

    @ObfuscatedName("ga.ah")
    public byte field1782;

    @ObfuscatedName("ga.ar")
    public byte field1783;

    public class168(class162 arg0) {
        this.this$0 = arg0;
    }

    @ObfuscatedName("ga.at(Luj;I)V")
    public void method3069(class527 arg0) {
        this.field1786 = arg0.method8420();
        if (this.field1786 != null) {
            arg0.method8410();
            this.field1782 = arg0.method8616();
            this.field1783 = arg0.method8616();
        }
    }

    @ObfuscatedName("ga.ah(Lgn;B)V")
    public void method3070(class165 arg0) {
        arg0.field1770 = this.field1786;
        if (this.field1786 != null) {
            arg0.field1767 = this.field1782;
            arg0.field1772 = this.field1783;
        }
    }
}
