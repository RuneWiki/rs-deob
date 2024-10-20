package deob;

@ObfuscatedName("ft")
public class class152 extends class160 {

    // $FF: synthetic field
    public final class161 this$0;

    @ObfuscatedName("ft.aw")
    public int field1692;

    public class152(class161 arg0) {
        this.this$0 = arg0;
        this.field1692 = -1;
    }

    @ObfuscatedName("ft.aw(Lty;B)V")
    public void method2988(class514 arg0) {
        this.field1692 = arg0.method8246();
        arg0.method8244();
        if (arg0.method8244() != 255) {
            arg0.field5072--;
            arg0.method8251();
        }
    }

    @ObfuscatedName("ft.ay(Lgh;I)V")
    public void method2983(class164 arg0) {
        arg0.method3087(this.field1692);
    }
}
