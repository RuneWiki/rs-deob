package deob;

@ObfuscatedName("eo")
public class class135 extends class137 {

    // $FF: synthetic field
    public final class140 this$0;

    @ObfuscatedName("eo.h")
    public long field1643;

    @ObfuscatedName("eo.e")
    public String field1642;

    public class135(class140 arg0) {
        this.this$0 = arg0;
        this.field1643 = -1L;
        this.field1642 = null;
    }

    @ObfuscatedName("eo.h(Lqy;I)V")
    public void method2882(class467 arg0) {
        if (arg0.method7792() != 255) {
            arg0.field4915--;
            this.field1643 = arg0.method7958();
        }
        this.field1642 = arg0.method7800();
    }

    @ObfuscatedName("eo.e(Lep;I)V")
    public void method2881(class148 arg0) {
        arg0.method2975(this.field1643, this.field1642, 0);
    }
}
