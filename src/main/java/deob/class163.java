package deob;

@ObfuscatedName("gc")
public class class163 extends class167 {

    // $FF: synthetic field
    public final class168 this$0;

    @ObfuscatedName("gc.ap")
    public String field1793;

    @ObfuscatedName("gc.aw")
    public int field1792;

    @ObfuscatedName("gc.ak")
    public byte field1794;

    public class163(class168 arg0) {
        this.this$0 = arg0;
        this.field1793 = null;
    }

    @ObfuscatedName("gc.ap(Lvl;I)V")
    public void method3436(class558 arg0) {
        if (arg0.method9258() != 255) {
            arg0.field5462--;
            arg0.method9265();
        }
        this.field1793 = arg0.method9268();
        this.field1792 = arg0.method9260();
        this.field1794 = arg0.method9259();
        arg0.method9265();
    }

    @ObfuscatedName("gc.aw(Lgw;I)V")
    public void method3434(class171 arg0) {
        class153 var2 = new class153();
        var2.field1712 = new class581(this.field1793);
        var2.field1711 = this.field1792;
        var2.field1714 = this.field1794;
        arg0.method3558(var2);
    }
}
