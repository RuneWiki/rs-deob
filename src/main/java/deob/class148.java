package deob;

@ObfuscatedName("fq")
public class class148 extends class156 {

    // $FF: synthetic field
    public final class157 this$0;

    @ObfuscatedName("fq.af")
    public int field1694;

    public class148(class157 arg0) {
        this.this$0 = arg0;
        this.field1694 = -1;
    }

    @ObfuscatedName("fq.af(Lsg;I)V")
    public void method3061(class489 arg0) {
        this.field1694 = arg0.method8250();
        arg0.method8248();
        if (arg0.method8248() != 255) {
            arg0.field4989--;
            arg0.method8271();
        }
    }

    @ObfuscatedName("fq.an(Lgj;B)V")
    public void method3060(class160 arg0) {
        arg0.method3156(this.field1694);
    }
}
