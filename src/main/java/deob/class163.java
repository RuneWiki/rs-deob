package deob;

@ObfuscatedName("ga")
public class class163 extends class156 {

    // $FF: synthetic field
    public final class157 this$0;

    @ObfuscatedName("ga.af")
    public String field1788;

    @ObfuscatedName("ga.an")
    public byte field1787;

    @ObfuscatedName("ga.aw")
    public byte field1786;

    public class163(class157 arg0) {
        this.this$0 = arg0;
    }

    @ObfuscatedName("ga.af(Lsg;I)V")
    public void method3061(class489 arg0) {
        this.field1788 = arg0.method8305();
        if (this.field1788 != null) {
            arg0.method8248();
            this.field1787 = arg0.method8249();
            this.field1786 = arg0.method8249();
        }
    }

    @ObfuscatedName("ga.an(Lgj;B)V")
    public void method3060(class160 arg0) {
        arg0.field1773 = this.field1788;
        if (this.field1788 != null) {
            arg0.field1769 = this.field1787;
            arg0.field1775 = this.field1786;
        }
    }
}
