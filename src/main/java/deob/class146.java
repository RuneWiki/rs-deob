package deob;

@ObfuscatedName("fs")
public class class146 extends class145 {

    // $FF: synthetic field
    public final class148 this$0;

    @ObfuscatedName("fs.at")
    public int field1640;

    @ObfuscatedName("fs.ah")
    public boolean field1645;

    public class146(class148 arg0) {
        this.this$0 = arg0;
        this.field1640 = -1;
    }

    @ObfuscatedName("fs.at(Luj;I)V")
    public void method3042(class527 arg0) {
        this.field1640 = arg0.method8412();
        this.field1645 = arg0.method8410() == 1;
    }

    @ObfuscatedName("fs.ah(Lfc;I)V")
    public void method3043(class156 arg0) {
        arg0.method3095(this.field1640, this.field1645);
    }
}
