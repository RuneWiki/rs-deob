package deob;

@ObfuscatedName("gi")
public class class172 extends class165 {

    // $FF: synthetic field
    public final class166 this$0;

    @ObfuscatedName("gi.ab")
    public String field1818;

    @ObfuscatedName("gi.ay")
    public byte field1817;

    @ObfuscatedName("gi.an")
    public byte field1819;

    public class172(class166 arg0) {
        this.this$0 = arg0;
    }

    @ObfuscatedName("gi.ab(Lvg;B)V")
    public void method3203(class549 arg0) {
        this.field1818 = arg0.method8807();
        if (this.field1818 != null) {
            arg0.method9025();
            this.field1817 = arg0.method8798();
            this.field1819 = arg0.method8798();
        }
    }

    @ObfuscatedName("gi.ay(Lgx;I)V")
    public void method3207(class169 arg0) {
        arg0.field1803 = this.field1818;
        if (this.field1818 != null) {
            arg0.field1805 = this.field1817;
            arg0.field1807 = this.field1819;
        }
    }
}
