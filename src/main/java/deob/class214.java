package deob;

@ObfuscatedName("hp")
public class class214 extends class212 {

    @ObfuscatedName("hp.cp")
    public long field2507;

    @ObfuscatedName("hp.cb")
    public class214 field2506;

    @ObfuscatedName("hp.cv")
    public class214 field2505;

    @ObfuscatedName("hp.cn()V")
    public void method4025() {
        if (this.field2505 != null) {
            this.field2505.field2506 = this.field2506;
            this.field2506.field2505 = this.field2505;
            this.field2506 = null;
            this.field2505 = null;
        }
    }
}
