package deob;

@ObfuscatedName("dw")
public class class80 {

    @ObfuscatedName("dw.an")
    public final class342 field1017;

    @ObfuscatedName("dw.aw")
    public final int field1018;

    @ObfuscatedName("dw.ac")
    public int field1019 = 0;

    public class80(class342 arg0, String arg1) {
        this.field1017 = arg0;
        this.field1018 = arg0.method6082();
    }

    @ObfuscatedName("dw.af(B)Z")
    public boolean method2122() {
        this.field1019 = 0;
        for (int var1 = 0; var1 < this.field1018; var1++) {
            if (!this.field1017.method6027(var1) || this.field1017.method6031(var1)) {
                this.field1019++;
            }
        }
        return this.field1019 >= this.field1018;
    }
}
