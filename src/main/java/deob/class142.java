package deob;

@ObfuscatedName("en")
public class class142 extends class106 {

    @ObfuscatedName("en.m")
    public class142 field1902;

    @ObfuscatedName("en.c")
    public class142 field1901;

    @ObfuscatedName("en.c()V")
    public void method1841() {
        if (this.field1901 != null) {
            this.field1901.field1902 = this.field1902;
            this.field1902.field1901 = this.field1901;
            this.field1902 = null;
            this.field1901 = null;
        }
    }
}
