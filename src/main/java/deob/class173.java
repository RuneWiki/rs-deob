package deob;

@ObfuscatedName("gw")
public class class173 extends class151 {

    // $FF: synthetic field
    public final class154 this$0;

    @ObfuscatedName("gw.ac")
    public long field1851;

    @ObfuscatedName("gw.ae")
    public String field1850;

    public class173(class154 arg0) {
        this.this$0 = arg0;
        this.field1851 = -1L;
        this.field1850 = null;
    }

    @ObfuscatedName("gw.ac(Lvf;B)V")
    public void method3246(class551 arg0) {
        if (arg0.method8955() != 255) {
            arg0.field5415--;
            this.field1851 = arg0.method8980();
        }
        this.field1850 = arg0.method8987();
    }

    @ObfuscatedName("gw.ae(Lgo;B)V")
    public void method3247(class162 arg0) {
        arg0.method3309(this.field1851, this.field1850);
    }
}
