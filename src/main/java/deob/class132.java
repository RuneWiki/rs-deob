package deob;

@ObfuscatedName("ee")
public class class132 {

    @ObfuscatedName("ee.a")
    public class132 field1877;

    @ObfuscatedName("ee.f")
    public class132 field1876;

    @ObfuscatedName("ee.u()V")
    public void method2282() {
        if (this.field1876 != null) {
            this.field1876.field1877 = this.field1877;
            this.field1877.field1876 = this.field1876;
            this.field1877 = null;
            this.field1876 = null;
        }
    }
}
