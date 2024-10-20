package deob;

@ObfuscatedName("gx")
public class class160 extends class145 {

    // $FF: synthetic field
    public final class148 this$0;

    @ObfuscatedName("gx.az")
    public long field1779;

    @ObfuscatedName("gx.ah")
    public String field1775;

    @ObfuscatedName("gx.af")
    public int field1776;

    public class160(class148 arg0) {
        this.this$0 = arg0;
        this.field1779 = -1L;
        this.field1775 = null;
        this.field1776 = 0;
    }

    @ObfuscatedName("gx.az(Lur;I)V")
    public void method2978(class535 arg0) {
        if (arg0.method8462() != 255) {
            arg0.field5233--;
            this.field1779 = arg0.method8469();
        }
        this.field1775 = arg0.method8622();
        this.field1776 = arg0.method8670();
    }

    @ObfuscatedName("gx.ah(Lfp;B)V")
    public void method2980(class156 arg0) {
        arg0.method3026(this.field1779, this.field1775, this.field1776);
    }
}
