package deob;

@ObfuscatedName("ff")
public class class149 extends class151 {

    // $FF: synthetic field
    public final class154 this$0;

    @ObfuscatedName("ff.ap")
    public long field1696;

    @ObfuscatedName("ff.aw")
    public String field1693;

    public class149(class154 arg0) {
        this.this$0 = arg0;
        this.field1696 = -1L;
        this.field1693 = null;
    }

    @ObfuscatedName("ff.ap(Lvl;I)V")
    public void method3401(class558 arg0) {
        if (arg0.method9258() != 255) {
            arg0.field5462--;
            this.field1696 = arg0.method9265();
        }
        this.field1693 = arg0.method9268();
    }

    @ObfuscatedName("ff.aw(Lgy;I)V")
    public void method3402(class162 arg0) {
        arg0.method3453(this.field1696, this.field1693, 0);
    }
}
