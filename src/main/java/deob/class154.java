package deob;

@ObfuscatedName("ff")
public class class154 extends class164 {

    // $FF: synthetic field
    public final class165 this$0;

    @ObfuscatedName("ff.ak")
    public int field1729;

    @ObfuscatedName("ff.al")
    public byte field1730;

    @ObfuscatedName("ff.aj")
    public int field1731;

    @ObfuscatedName("ff.az")
    public String field1732;

    public class154(class165 arg0) {
        this.this$0 = arg0;
        this.field1729 = -1;
    }

    @ObfuscatedName("ff.ak(Lua;I)V")
    public void method3089(class546 arg0) {
        this.field1729 = arg0.method8798();
        this.field1730 = arg0.method8797();
        this.field1731 = arg0.method8798();
        arg0.method8802();
        this.field1732 = arg0.method8806();
    }

    @ObfuscatedName("ff.al(Lgo;I)V")
    public void method3091(class168 arg0) {
        class150 var2 = (class150) arg0.field1831.get(this.field1729);
        var2.field1699 = this.field1730;
        var2.field1704 = this.field1731;
        var2.field1698 = new class568(this.field1732);
    }
}
