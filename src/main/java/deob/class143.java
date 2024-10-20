package deob;

@ObfuscatedName("fh")
public class class143 extends class145 {

    // $FF: synthetic field
    public final class148 this$0;

    @ObfuscatedName("fh.at")
    public long field1630;

    @ObfuscatedName("fh.ah")
    public String field1631;

    public class143(class148 arg0) {
        this.this$0 = arg0;
        this.field1630 = -1L;
        this.field1631 = null;
    }

    @ObfuscatedName("fh.at(Luj;I)V")
    public void method3042(class527 arg0) {
        if (arg0.method8410() != 255) {
            arg0.field5137--;
            this.field1630 = arg0.method8417();
        }
        this.field1631 = arg0.method8420();
    }

    @ObfuscatedName("fh.ah(Lfc;I)V")
    public void method3043(class156 arg0) {
        arg0.method3088(this.field1630, this.field1631, 0);
    }
}
