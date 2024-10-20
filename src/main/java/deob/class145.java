package deob;

@ObfuscatedName("fb")
public class class145 extends class148 {

    // $FF: synthetic field
    public final class151 this$0;

    @ObfuscatedName("fb.ak")
    public int field1678;

    @ObfuscatedName("fb.al")
    public int field1681;

    @ObfuscatedName("fb.aj")
    public int field1679;

    @ObfuscatedName("fb.az")
    public int field1680;

    public class145(class151 arg0) {
        this.this$0 = arg0;
        this.field1678 = -1;
    }

    @ObfuscatedName("fb.ak(Lua;I)V")
    public void method3050(class546 arg0) {
        this.field1678 = arg0.method8798();
        this.field1681 = arg0.method8801();
        this.field1679 = arg0.method8796();
        this.field1680 = arg0.method8796();
    }

    @ObfuscatedName("fb.al(Lgc;B)V")
    public void method3051(class159 arg0) {
        arg0.method3120(this.field1678, this.field1681, this.field1679, this.field1680);
    }
}
