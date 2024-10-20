package deob;

@ObfuscatedName("go")
public class class204 extends class208 {

    @ObfuscatedName("go.cn")
    public class204 field3084;

    @ObfuscatedName("go.cy")
    public class204 field3083;

    @ObfuscatedName("go.fn()V")
    public void method3689() {
        if (this.field3083 != null) {
            this.field3083.field3084 = this.field3084;
            this.field3084.field3083 = this.field3083;
            this.field3084 = null;
            this.field3083 = null;
        }
    }
}
