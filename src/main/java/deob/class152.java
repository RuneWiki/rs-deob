package deob;

@ObfuscatedName("fg")
public class class152 extends class156 {

    // $FF: synthetic field
    public final class157 this$0;

    @ObfuscatedName("fg.af")
    public String field1740;

    @ObfuscatedName("fg.an")
    public int field1739;

    @ObfuscatedName("fg.aw")
    public byte field1738;

    public class152(class157 arg0) {
        this.this$0 = arg0;
        this.field1740 = null;
    }

    @ObfuscatedName("fg.af(Lsg;I)V")
    public void method3061(class489 arg0) {
        if (arg0.method8248() != 255) {
            arg0.field4989--;
            arg0.method8271();
        }
        this.field1740 = arg0.method8305();
        this.field1739 = arg0.method8250();
        this.field1738 = arg0.method8249();
        arg0.method8271();
    }

    @ObfuscatedName("fg.an(Lgj;B)V")
    public void method3060(class160 arg0) {
        class142 var2 = new class142();
        var2.field1652 = new class513(this.field1740);
        var2.field1655 = this.field1739;
        var2.field1650 = this.field1738;
        arg0.method3170(var2);
    }
}
