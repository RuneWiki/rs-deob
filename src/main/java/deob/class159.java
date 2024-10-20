package deob;

@ObfuscatedName("gb")
public class class159 extends class167 {

    // $FF: synthetic field
    public final class168 this$0;

    @ObfuscatedName("gb.ap")
    public int field1751;

    public class159(class168 arg0) {
        this.this$0 = arg0;
        this.field1751 = -1;
    }

    @ObfuscatedName("gb.ap(Lvl;I)V")
    public void method3436(class558 arg0) {
        this.field1751 = arg0.method9260();
        arg0.method9258();
        if (arg0.method9258() != 255) {
            arg0.field5462--;
            arg0.method9265();
        }
    }

    @ObfuscatedName("gb.aw(Lgw;I)V")
    public void method3434(class171 arg0) {
        arg0.method3543(this.field1751);
    }
}
