package deob;

@ObfuscatedName("gs")
public class class163 extends class148 {

    // $FF: synthetic field
    public final class151 this$0;

    @ObfuscatedName("gs.ak")
    public long field1805;

    @ObfuscatedName("gs.al")
    public String field1802;

    @ObfuscatedName("gs.aj")
    public int field1803;

    public class163(class151 arg0) {
        this.this$0 = arg0;
        this.field1805 = -1L;
        this.field1802 = null;
        this.field1803 = 0;
    }

    @ObfuscatedName("gs.ak(Lua;I)V")
    public void method3050(class546 arg0) {
        if (arg0.method8796() != 255) {
            arg0.field5344--;
            this.field1805 = arg0.method8802();
        }
        this.field1802 = arg0.method8805();
        this.field1803 = arg0.method8798();
    }

    @ObfuscatedName("gs.al(Lgc;B)V")
    public void method3051(class159 arg0) {
        arg0.method3112(this.field1805, this.field1802, this.field1803);
    }
}
