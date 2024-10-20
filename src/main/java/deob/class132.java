package deob;

@ObfuscatedName("ei")
public class class132 {

    @ObfuscatedName("ei.g")
    public class132 field1904;

    @ObfuscatedName("ei.h")
    public class132 field1903;

    @ObfuscatedName("ei.o()V")
    public void method2247() {
        if (this.field1903 != null) {
            this.field1903.field1904 = this.field1904;
            this.field1904.field1903 = this.field1903;
            this.field1904 = null;
            this.field1903 = null;
        }
    }
}
