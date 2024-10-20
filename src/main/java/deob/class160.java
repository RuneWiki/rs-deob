package deob;

@ObfuscatedName("fo")
public class class160 extends class153 {

    // $FF: synthetic field
    public final class154 this$0;

    @ObfuscatedName("fo.h")
    public String field1815;

    @ObfuscatedName("fo.e")
    public byte field1814;

    @ObfuscatedName("fo.v")
    public byte field1816;

    public class160(class154 arg0) {
        this.this$0 = arg0;
    }

    @ObfuscatedName("fo.h(Lqy;I)V")
    public void method2911(class467 arg0) {
        this.field1815 = arg0.method7800();
        if (this.field1815 != null) {
            arg0.method7792();
            this.field1814 = arg0.method7793();
            this.field1816 = arg0.method7793();
        }
    }

    @ObfuscatedName("fo.e(Lfn;I)V")
    public void method2916(class157 arg0) {
        arg0.field1796 = this.field1815;
        if (this.field1815 != null) {
            arg0.field1797 = this.field1814;
            arg0.field1800 = this.field1816;
        }
    }
}
