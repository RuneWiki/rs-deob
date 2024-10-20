package deob;

@ObfuscatedName("gh")
public class class161 extends class146 {

    // $FF: synthetic field
    public final class149 this$0;

    @ObfuscatedName("gh.aq")
    public long field1778;

    @ObfuscatedName("gh.aw")
    public String field1777;

    @ObfuscatedName("gh.al")
    public int field1776;

    public class161(class149 arg0) {
        this.this$0 = arg0;
        this.field1778 = -1L;
        this.field1777 = null;
        this.field1776 = 0;
    }

    @ObfuscatedName("gh.aq(Luq;I)V")
    public void method3033(class534 arg0) {
        if (arg0.method8591() != 255) {
            arg0.field5200--;
            this.field1778 = arg0.method8598();
        }
        this.field1777 = arg0.method8601();
        this.field1776 = arg0.method8593();
    }

    @ObfuscatedName("gh.aw(Lgt;I)V")
    public void method3030(class157 arg0) {
        arg0.method3115(this.field1778, this.field1777, this.field1776);
    }
}
