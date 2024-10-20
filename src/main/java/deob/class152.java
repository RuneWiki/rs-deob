package deob;

@ObfuscatedName("fx")
public class class152 extends class151 {

    // $FF: synthetic field
    public final class154 this$0;

    @ObfuscatedName("fx.ac")
    public int field1709;

    @ObfuscatedName("fx.ae")
    public boolean field1708;

    public class152(class154 arg0) {
        this.this$0 = arg0;
        this.field1709 = -1;
    }

    @ObfuscatedName("fx.ac(Lvf;B)V")
    public void method3246(class551 arg0) {
        this.field1709 = arg0.method9119();
        this.field1708 = arg0.method8955() == 1;
    }

    @ObfuscatedName("fx.ae(Lgo;B)V")
    public void method3247(class162 arg0) {
        arg0.method3313(this.field1709, this.field1708);
    }
}
