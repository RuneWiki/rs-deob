package deob;

@ObfuscatedName("fm")
public class class149 extends class148 {

    // $FF: synthetic field
    public final class151 this$0;

    @ObfuscatedName("fm.aq")
    public int field1698;

    @ObfuscatedName("fm.ad")
    public boolean field1699;

    public class149(class151 arg0) {
        this.this$0 = arg0;
        this.field1698 = -1;
    }

    @ObfuscatedName("fm.aq(Lvp;B)V")
    public void method3076(class547 arg0) {
        this.field1698 = arg0.method8899();
        this.field1699 = arg0.method8804() == 1;
    }

    @ObfuscatedName("fm.ad(Lgk;B)V")
    public void method3075(class159 arg0) {
        arg0.method3116(this.field1698, this.field1699);
    }
}
