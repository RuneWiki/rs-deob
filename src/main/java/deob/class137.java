package deob;

@ObfuscatedName("ed")
public class class137 extends class145 {

    // $FF: synthetic field
    public final class146 this$0;

    @ObfuscatedName("ed.c")
    public int field1616;

    public class137(class146 arg0) {
        this.this$0 = arg0;
        this.field1616 = -1;
    }

    @ObfuscatedName("ed.c(Lqt;I)V")
    public void method2716(class443 arg0) {
        this.field1616 = arg0.method7049();
        arg0.method7047();
        if (arg0.method7047() != 255) {
            arg0.field4700--;
            arg0.method7106();
        }
    }

    @ObfuscatedName("ed.v(Lex;I)V")
    public void method2719(class149 arg0) {
        arg0.method2837(this.field1616);
    }
}
