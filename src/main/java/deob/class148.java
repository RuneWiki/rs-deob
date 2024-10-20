package deob;

@ObfuscatedName("eg")
public class class148 extends class156 {

    // $FF: synthetic field
    public final class157 this$0;

    @ObfuscatedName("eg.f")
    public int field1699;

    public class148(class157 arg0) {
        this.this$0 = arg0;
        this.field1699 = -1;
    }

    @ObfuscatedName("eg.f(Lrd;B)V")
    public void method3007(class474 arg0) {
        this.field1699 = arg0.method8032();
        arg0.method7964();
        if (arg0.method7964() != 255) {
            arg0.field4939--;
            arg0.method8151();
        }
    }

    @ObfuscatedName("eg.w(Lfm;I)V")
    public void method3008(class160 arg0) {
        arg0.method3116(this.field1699);
    }
}
