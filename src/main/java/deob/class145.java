package deob;

@ObfuscatedName("eb")
public class class145 extends class153 {

    // $FF: synthetic field
    public final class154 this$0;

    @ObfuscatedName("eb.h")
    public int field1704;

    public class145(class154 arg0) {
        this.this$0 = arg0;
        this.field1704 = -1;
    }

    @ObfuscatedName("eb.h(Lqy;I)V")
    public void method2911(class467 arg0) {
        this.field1704 = arg0.method7794();
        arg0.method7792();
        if (arg0.method7792() != 255) {
            arg0.field4915--;
            arg0.method7958();
        }
    }

    @ObfuscatedName("eb.e(Lfn;I)V")
    public void method2916(class157 arg0) {
        arg0.method3021(this.field1704);
    }
}
