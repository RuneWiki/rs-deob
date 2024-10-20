package deob;

@ObfuscatedName("fy")
public class class152 extends class160 {

    // $FF: synthetic field
    public final class161 this$0;

    @ObfuscatedName("fy.am")
    public int field1680;

    public class152(class161 arg0) {
        this.this$0 = arg0;
        this.field1680 = -1;
    }

    @ObfuscatedName("fy.am(Luk;I)V")
    public void method3093(class531 arg0) {
        this.field1680 = arg0.method8775();
        arg0.method8561();
        if (arg0.method8561() != 255) {
            arg0.field5181--;
            arg0.method8567();
        }
    }

    @ObfuscatedName("fy.ap(Lgt;I)V")
    public void method3099(class164 arg0) {
        arg0.method3207(this.field1680);
    }
}
