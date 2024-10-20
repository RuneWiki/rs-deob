package deob;

@ObfuscatedName("ef")
public class class152 extends class137 {

    // $FF: synthetic field
    public final class140 this$0;

    @ObfuscatedName("ef.h")
    public long field1768;

    @ObfuscatedName("ef.e")
    public String field1761;

    @ObfuscatedName("ef.v")
    public int field1762;

    public class152(class140 arg0) {
        this.this$0 = arg0;
        this.field1768 = -1L;
        this.field1761 = null;
        this.field1762 = 0;
    }

    @ObfuscatedName("ef.h(Lqy;I)V")
    public void method2882(class467 arg0) {
        if (arg0.method7792() != 255) {
            arg0.field4915--;
            this.field1768 = arg0.method7958();
        }
        this.field1761 = arg0.method7800();
        this.field1762 = arg0.method7794();
    }

    @ObfuscatedName("ef.e(Lep;I)V")
    public void method2881(class148 arg0) {
        arg0.method2975(this.field1768, this.field1761, this.field1762);
    }
}
