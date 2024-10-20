package deob;

@ObfuscatedName("eg")
public class class151 extends class129 {

    // $FF: synthetic field
    public final class132 this$0;

    @ObfuscatedName("eg.v")
    public long field1676;

    @ObfuscatedName("eg.c")
    public String field1671;

    public class151(class132 arg0) {
        this.this$0 = arg0;
        this.field1676 = -1L;
        this.field1671 = null;
    }

    @ObfuscatedName("eg.v(Lpi;I)V")
    public void method2678(class438 arg0) {
        if (arg0.method6971() != 255) {
            arg0.field4621--;
            this.field1676 = arg0.method7003();
        }
        this.field1671 = arg0.method6980();
    }

    @ObfuscatedName("eg.c(Lex;S)V")
    public void method2679(class140 arg0) {
        arg0.method2771(this.field1676, this.field1671);
    }
}
