package deob;

@ObfuscatedName("gc")
public class class163 extends class148 {

    // $FF: synthetic field
    public final class151 this$0;

    @ObfuscatedName("gc.aq")
    public long field1801;

    @ObfuscatedName("gc.ad")
    public String field1800;

    @ObfuscatedName("gc.ag")
    public int field1802;

    public class163(class151 arg0) {
        this.this$0 = arg0;
        this.field1801 = -1L;
        this.field1800 = null;
        this.field1802 = 0;
    }

    @ObfuscatedName("gc.aq(Lvp;B)V")
    public void method3076(class547 arg0) {
        if (arg0.method8804() != 255) {
            arg0.field5363--;
            this.field1801 = arg0.method8735();
        }
        this.field1800 = arg0.method8738();
        this.field1802 = arg0.method8899();
    }

    @ObfuscatedName("gc.ad(Lgk;B)V")
    public void method3075(class159 arg0) {
        arg0.method3146(this.field1801, this.field1800, this.field1802);
    }
}
