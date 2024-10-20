package deob;

@ObfuscatedName("dw")
public class class87 {

    @ObfuscatedName("dw.ae")
    public final class388 field1071;

    @ObfuscatedName("dw.ag")
    public final int field1072;

    @ObfuscatedName("dw.am")
    public int field1075 = 0;

    public class87(class388 arg0, String arg1) {
        this.field1071 = arg0;
        this.field1072 = arg0.method6793();
    }

    @ObfuscatedName("dw.ac(I)Z")
    public boolean method2365() {
        this.field1075 = 0;
        for (int var1 = 0; var1 < this.field1072; var1++) {
            if (!this.field1071.method6740(var1) || this.field1071.method6739(var1)) {
                this.field1075++;
            }
        }
        return this.field1075 >= this.field1072;
    }
}
