package deob;

@ObfuscatedName("gb")
public class class157 extends class165 {

    // $FF: synthetic field
    public final class166 this$0;

    @ObfuscatedName("gb.ab")
    public int field1723;

    public class157(class166 arg0) {
        this.this$0 = arg0;
        this.field1723 = -1;
    }

    @ObfuscatedName("gb.ab(Lvg;B)V")
    public void method3203(class549 arg0) {
        this.field1723 = arg0.method8968();
        arg0.method9025();
        if (arg0.method9025() != 255) {
            arg0.field5378--;
            arg0.method8804();
        }
    }

    @ObfuscatedName("gb.ay(Lgx;I)V")
    public void method3207(class169 arg0) {
        arg0.method3307(this.field1723);
    }
}
