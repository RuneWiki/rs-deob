package deob;

@ObfuscatedName("ge")
public class class160 extends class145 {

    // $FF: synthetic field
    public final class148 this$0;

    @ObfuscatedName("ge.at")
    public long field1744;

    @ObfuscatedName("ge.ah")
    public String field1747;

    @ObfuscatedName("ge.ar")
    public int field1745;

    public class160(class148 arg0) {
        this.this$0 = arg0;
        this.field1744 = -1L;
        this.field1747 = null;
        this.field1745 = 0;
    }

    @ObfuscatedName("ge.at(Luj;I)V")
    public void method3042(class527 arg0) {
        if (arg0.method8410() != 255) {
            arg0.field5137--;
            this.field1744 = arg0.method8417();
        }
        this.field1747 = arg0.method8420();
        this.field1745 = arg0.method8412();
    }

    @ObfuscatedName("ge.ah(Lfc;I)V")
    public void method3043(class156 arg0) {
        arg0.method3088(this.field1744, this.field1747, this.field1745);
    }
}
