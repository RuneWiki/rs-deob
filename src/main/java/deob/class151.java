package deob;

@ObfuscatedName("ev")
public class class151 extends class129 {

    // $FF: synthetic field
    public final class132 this$0;

    @ObfuscatedName("ev.c")
    public long field1708;

    @ObfuscatedName("ev.v")
    public String field1709;

    public class151(class132 arg0) {
        this.this$0 = arg0;
        this.field1708 = -1L;
        this.field1709 = null;
    }

    @ObfuscatedName("ev.c(Lqt;B)V")
    public void method2682(class443 arg0) {
        if (arg0.method7047() != 255) {
            arg0.field4700--;
            this.field1708 = arg0.method7106();
        }
        this.field1709 = arg0.method7056();
    }

    @ObfuscatedName("ev.v(Len;I)V")
    public void method2685(class140 arg0) {
        arg0.method2748(this.field1708, this.field1709);
    }
}
