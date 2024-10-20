package deob;

@ObfuscatedName("gu")
public class class167 extends class145 {

    // $FF: synthetic field
    public final class148 this$0;

    @ObfuscatedName("gu.at")
    public long field1781;

    @ObfuscatedName("gu.ah")
    public String field1779;

    public class167(class148 arg0) {
        this.this$0 = arg0;
        this.field1781 = -1L;
        this.field1779 = null;
    }

    @ObfuscatedName("gu.at(Luj;I)V")
    public void method3042(class527 arg0) {
        if (arg0.method8410() != 255) {
            arg0.field5137--;
            this.field1781 = arg0.method8417();
        }
        this.field1779 = arg0.method8420();
    }

    @ObfuscatedName("gu.ah(Lfc;I)V")
    public void method3043(class156 arg0) {
        arg0.method3119(this.field1781, this.field1779);
    }
}
