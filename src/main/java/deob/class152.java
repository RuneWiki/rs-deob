package deob;

@ObfuscatedName("fq")
public class class152 extends class148 {

    // $FF: synthetic field
    public final class151 this$0;

    @ObfuscatedName("fq.ak")
    public int field1717;

    @ObfuscatedName("fq.al")
    public byte field1719;

    public class152(class151 arg0) {
        this.this$0 = arg0;
        this.field1717 = -1;
    }

    @ObfuscatedName("fq.ak(Lua;I)V")
    public void method3050(class546 arg0) {
        this.field1717 = arg0.method8798();
        this.field1719 = arg0.method8797();
    }

    @ObfuscatedName("fq.al(Lgc;B)V")
    public void method3051(class159 arg0) {
        arg0.method3117(this.field1717, this.field1719);
    }
}
