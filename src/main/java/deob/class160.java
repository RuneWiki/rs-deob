package deob;

@ObfuscatedName("gm")
public class class160 extends class164 {

    // $FF: synthetic field
    public final class165 this$0;

    @ObfuscatedName("gm.ak")
    public String field1789;

    @ObfuscatedName("gm.al")
    public int field1791;

    @ObfuscatedName("gm.aj")
    public byte field1787;

    public class160(class165 arg0) {
        this.this$0 = arg0;
        this.field1789 = null;
    }

    @ObfuscatedName("gm.ak(Lua;I)V")
    public void method3089(class546 arg0) {
        if (arg0.method8796() != 255) {
            arg0.field5344--;
            arg0.method8802();
        }
        this.field1789 = arg0.method8805();
        this.field1791 = arg0.method8798();
        this.field1787 = arg0.method8797();
        arg0.method8802();
    }

    @ObfuscatedName("gm.al(Lgo;I)V")
    public void method3091(class168 arg0) {
        class150 var2 = new class150();
        var2.field1698 = new class568(this.field1789);
        var2.field1704 = this.field1791;
        var2.field1699 = this.field1787;
        arg0.method3196(var2);
    }
}
