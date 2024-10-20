package deob;

@ObfuscatedName("ge")
public class class204 extends class208 {

    @ObfuscatedName("ge.cv")
    public class204 field3102;

    @ObfuscatedName("ge.cq")
    public class204 field3101;

    @ObfuscatedName("ge.fu()V")
    public void method3645() {
        if (this.field3101 != null) {
            this.field3101.field3102 = this.field3102;
            this.field3102.field3101 = this.field3101;
            this.field3102 = null;
            this.field3101 = null;
        }
    }
}
