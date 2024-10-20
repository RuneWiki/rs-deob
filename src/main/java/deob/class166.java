package deob;

@ObfuscatedName("gv")
public class class166 extends class151 {

    // $FF: synthetic field
    public final class154 this$0;

    @ObfuscatedName("gv.ap")
    public long field1809;

    @ObfuscatedName("gv.aw")
    public String field1815;

    @ObfuscatedName("gv.ak")
    public int field1810;

    public class166(class154 arg0) {
        this.this$0 = arg0;
        this.field1809 = -1L;
        this.field1815 = null;
        this.field1810 = 0;
    }

    @ObfuscatedName("gv.ap(Lvl;I)V")
    public void method3401(class558 arg0) {
        if (arg0.method9258() != 255) {
            arg0.field5462--;
            this.field1809 = arg0.method9265();
        }
        this.field1815 = arg0.method9268();
        this.field1810 = arg0.method9260();
    }

    @ObfuscatedName("gv.aw(Lgy;I)V")
    public void method3402(class162 arg0) {
        arg0.method3453(this.field1809, this.field1815, this.field1810);
    }
}
