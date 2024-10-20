package deob;

@ObfuscatedName("gj")
public class class161 extends class164 {

    // $FF: synthetic field
    public final class165 this$0;

    @ObfuscatedName("gj.ak")
    public int field1792;

    @ObfuscatedName("gj.al")
    public byte field1793;

    @ObfuscatedName("gj.aj")
    public int field1796;

    @ObfuscatedName("gj.az")
    public String field1794;

    public class161(class165 arg0) {
        this.this$0 = arg0;
        this.field1792 = -1;
    }

    @ObfuscatedName("gj.ak(Lua;I)V")
    public void method3089(class546 arg0) {
        arg0.method8796();
        this.field1792 = arg0.method8798();
        this.field1793 = arg0.method8797();
        this.field1796 = arg0.method8798();
        arg0.method8802();
        this.field1794 = arg0.method8806();
        arg0.method8796();
    }

    @ObfuscatedName("gj.al(Lgo;I)V")
    public void method3091(class168 arg0) {
        class150 var2 = (class150) arg0.field1831.get(this.field1792);
        var2.field1699 = this.field1793;
        var2.field1704 = this.field1796;
        var2.field1698 = new class568(this.field1794);
    }
}
