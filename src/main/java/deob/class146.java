package deob;

@ObfuscatedName("fp")
public class class146 extends class148 {

    // $FF: synthetic field
    public final class151 this$0;

    @ObfuscatedName("fp.ak")
    public long field1686;

    @ObfuscatedName("fp.al")
    public String field1684;

    public class146(class151 arg0) {
        this.this$0 = arg0;
        this.field1686 = -1L;
        this.field1684 = null;
    }

    @ObfuscatedName("fp.ak(Lua;I)V")
    public void method3050(class546 arg0) {
        if (arg0.method8796() != 255) {
            arg0.field5344--;
            this.field1686 = arg0.method8802();
        }
        this.field1684 = arg0.method8805();
    }

    @ObfuscatedName("fp.al(Lgc;B)V")
    public void method3051(class159 arg0) {
        arg0.method3112(this.field1686, this.field1684, 0);
    }
}
