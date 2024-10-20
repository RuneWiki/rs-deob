package deob;

@ObfuscatedName("gm")
public class class173 extends class151 {

    // $FF: synthetic field
    public final class154 this$0;

    @ObfuscatedName("gm.ap")
    public long field1855;

    @ObfuscatedName("gm.aw")
    public String field1854;

    public class173(class154 arg0) {
        this.this$0 = arg0;
        this.field1855 = -1L;
        this.field1854 = null;
    }

    @ObfuscatedName("gm.ap(Lvl;I)V")
    public void method3401(class558 arg0) {
        if (arg0.method9258() != 255) {
            arg0.field5462--;
            this.field1855 = arg0.method9265();
        }
        this.field1854 = arg0.method9268();
    }

    @ObfuscatedName("gm.aw(Lgy;I)V")
    public void method3402(class162 arg0) {
        arg0.method3520(this.field1855, this.field1854);
    }
}
