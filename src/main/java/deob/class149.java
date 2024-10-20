package deob;

@ObfuscatedName("fi")
public class class149 extends class151 {

    // $FF: synthetic field
    public final class154 this$0;

    @ObfuscatedName("fi.ac")
    public long field1701;

    @ObfuscatedName("fi.ae")
    public String field1700;

    public class149(class154 arg0) {
        this.this$0 = arg0;
        this.field1701 = -1L;
        this.field1700 = null;
    }

    @ObfuscatedName("fi.ac(Lvf;B)V")
    public void method3246(class551 arg0) {
        if (arg0.method8955() != 255) {
            arg0.field5415--;
            this.field1701 = arg0.method8980();
        }
        this.field1700 = arg0.method8987();
    }

    @ObfuscatedName("fi.ae(Lgo;B)V")
    public void method3247(class162 arg0) {
        arg0.method3328(this.field1701, this.field1700, 0);
    }
}
