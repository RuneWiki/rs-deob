package deob;

@ObfuscatedName("ek")
public class class144 extends class129 {

    // $FF: synthetic field
    public final class132 this$0;

    @ObfuscatedName("ek.c")
    public long field1669;

    @ObfuscatedName("ek.v")
    public String field1668;

    @ObfuscatedName("ek.q")
    public int field1670;

    public class144(class132 arg0) {
        this.this$0 = arg0;
        this.field1669 = -1L;
        this.field1668 = null;
        this.field1670 = 0;
    }

    @ObfuscatedName("ek.c(Lqt;B)V")
    public void method2682(class443 arg0) {
        if (arg0.method7047() != 255) {
            arg0.field4700--;
            this.field1669 = arg0.method7106();
        }
        this.field1668 = arg0.method7056();
        this.field1670 = arg0.method7049();
    }

    @ObfuscatedName("ek.v(Len;I)V")
    public void method2685(class140 arg0) {
        arg0.method2745(this.field1669, this.field1668, this.field1670);
    }
}
