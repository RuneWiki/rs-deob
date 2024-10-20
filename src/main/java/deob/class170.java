package deob;

@ObfuscatedName("gk")
public class class170 extends class148 {

    // $FF: synthetic field
    public final class151 this$0;

    @ObfuscatedName("gk.ak")
    public long field1837;

    @ObfuscatedName("gk.al")
    public String field1838;

    public class170(class151 arg0) {
        this.this$0 = arg0;
        this.field1837 = -1L;
        this.field1838 = null;
    }

    @ObfuscatedName("gk.ak(Lua;I)V")
    public void method3050(class546 arg0) {
        if (arg0.method8796() != 255) {
            arg0.field5344--;
            this.field1837 = arg0.method8802();
        }
        this.field1838 = arg0.method8805();
    }

    @ObfuscatedName("gk.al(Lgc;B)V")
    public void method3051(class159 arg0) {
        arg0.method3115(this.field1837, this.field1838);
    }
}
