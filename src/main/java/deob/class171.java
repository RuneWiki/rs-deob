package deob;

@ObfuscatedName("gl")
public class class171 extends class164 {

    // $FF: synthetic field
    public final class165 this$0;

    @ObfuscatedName("gl.aq")
    public String field1836;

    @ObfuscatedName("gl.ad")
    public byte field1839;

    @ObfuscatedName("gl.ag")
    public byte field1837;

    public class171(class165 arg0) {
        this.this$0 = arg0;
    }

    @ObfuscatedName("gl.aq(Lvp;I)V")
    public void method3101(class547 arg0) {
        this.field1836 = arg0.method8738();
        if (this.field1836 != null) {
            arg0.method8804();
            this.field1839 = arg0.method8857();
            this.field1837 = arg0.method8857();
        }
    }

    @ObfuscatedName("gl.ad(Lgj;I)V")
    public void method3102(class168 arg0) {
        arg0.field1825 = this.field1836;
        if (this.field1836 != null) {
            arg0.field1824 = this.field1839;
            arg0.field1818 = this.field1837;
        }
    }
}
