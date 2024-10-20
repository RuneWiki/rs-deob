package deob;

@ObfuscatedName("fj")
public class class143 extends class145 {

    // $FF: synthetic field
    public final class148 this$0;

    @ObfuscatedName("fj.az")
    public long field1671;

    @ObfuscatedName("fj.ah")
    public String field1673;

    public class143(class148 arg0) {
        this.this$0 = arg0;
        this.field1671 = -1L;
        this.field1673 = null;
    }

    @ObfuscatedName("fj.az(Lur;I)V")
    public void method2978(class535 arg0) {
        if (arg0.method8462() != 255) {
            arg0.field5233--;
            this.field1671 = arg0.method8469();
        }
        this.field1673 = arg0.method8622();
    }

    @ObfuscatedName("fj.ah(Lfp;B)V")
    public void method2980(class156 arg0) {
        arg0.method3026(this.field1671, this.field1673, 0);
    }
}
