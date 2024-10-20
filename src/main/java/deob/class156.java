package deob;

@ObfuscatedName("fw")
public class class156 extends class164 {

    // $FF: synthetic field
    public final class165 this$0;

    @ObfuscatedName("fw.ak")
    public int field1747;

    public class156(class165 arg0) {
        this.this$0 = arg0;
        this.field1747 = -1;
    }

    @ObfuscatedName("fw.ak(Lua;I)V")
    public void method3089(class546 arg0) {
        this.field1747 = arg0.method8798();
        arg0.method8796();
        if (arg0.method8796() != 255) {
            arg0.field5344--;
            arg0.method8802();
        }
    }

    @ObfuscatedName("fw.al(Lgo;I)V")
    public void method3091(class168 arg0) {
        arg0.method3211(this.field1747);
    }
}
