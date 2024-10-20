package deob;

@ObfuscatedName("gx")
public class class166 extends class151 {

    // $FF: synthetic field
    public final class154 this$0;

    @ObfuscatedName("gx.ac")
    public long field1811;

    @ObfuscatedName("gx.ae")
    public String field1809;

    @ObfuscatedName("gx.ag")
    public int field1808;

    public class166(class154 arg0) {
        this.this$0 = arg0;
        this.field1811 = -1L;
        this.field1809 = null;
        this.field1808 = 0;
    }

    @ObfuscatedName("gx.ac(Lvf;B)V")
    public void method3246(class551 arg0) {
        if (arg0.method8955() != 255) {
            arg0.field5415--;
            this.field1811 = arg0.method8980();
        }
        this.field1809 = arg0.method8987();
        this.field1808 = arg0.method9119();
    }

    @ObfuscatedName("gx.ae(Lgo;B)V")
    public void method3247(class162 arg0) {
        arg0.method3328(this.field1811, this.field1809, this.field1808);
    }
}
