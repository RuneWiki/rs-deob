package deob;

@ObfuscatedName("gk")
public class class167 extends class145 {

    // $FF: synthetic field
    public final class148 this$0;

    @ObfuscatedName("gk.az")
    public long field1812;

    @ObfuscatedName("gk.ah")
    public String field1818;

    public class167(class148 arg0) {
        this.this$0 = arg0;
        this.field1812 = -1L;
        this.field1818 = null;
    }

    @ObfuscatedName("gk.az(Lur;I)V")
    public void method2978(class535 arg0) {
        if (arg0.method8462() != 255) {
            arg0.field5233--;
            this.field1812 = arg0.method8469();
        }
        this.field1818 = arg0.method8622();
    }

    @ObfuscatedName("gk.ah(Lfp;B)V")
    public void method2980(class156 arg0) {
        arg0.method3077(this.field1812, this.field1818);
    }
}
