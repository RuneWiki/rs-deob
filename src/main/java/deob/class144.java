package deob;

@ObfuscatedName("fd")
public class class144 extends class143 {

    // $FF: synthetic field
    public final class146 this$0;

    @ObfuscatedName("fd.at")
    public int field1630;

    @ObfuscatedName("fd.an")
    public boolean field1626;

    public class144(class146 arg0) {
        this.this$0 = arg0;
        this.field1630 = -1;
    }

    @ObfuscatedName("fd.at(Ltz;B)V")
    public void method2929(class501 arg0) {
        this.field1630 = arg0.method8195();
        this.field1626 = arg0.method8129() == 1;
    }

    @ObfuscatedName("fd.an(Lfs;B)V")
    public void method2928(class154 arg0) {
        arg0.method2987(this.field1630, this.field1626);
    }
}
