package deob;

@ObfuscatedName("fl")
public class class149 extends class148 {

    // $FF: synthetic field
    public final class151 this$0;

    @ObfuscatedName("fl.ak")
    public int field1693;

    @ObfuscatedName("fl.al")
    public boolean field1696;

    public class149(class151 arg0) {
        this.this$0 = arg0;
        this.field1693 = -1;
    }

    @ObfuscatedName("fl.ak(Lua;I)V")
    public void method3050(class546 arg0) {
        this.field1693 = arg0.method8798();
        this.field1696 = arg0.method8796() == 1;
    }

    @ObfuscatedName("fl.al(Lgc;B)V")
    public void method3051(class159 arg0) {
        arg0.method3110(this.field1693, this.field1696);
    }
}
