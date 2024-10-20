package deob;

@ObfuscatedName("bk")
public class class77 {

    @ObfuscatedName("bk.l")
    public final class305 field1013;

    @ObfuscatedName("bk.s")
    public final int field1014;

    @ObfuscatedName("bk.e")
    public int field1015 = 0;

    public class77(class305 arg0, String arg1) {
        this.field1013 = arg0;
        this.field1014 = arg0.method5041();
    }

    @ObfuscatedName("bk.c(B)Z")
    public boolean method1959() {
        this.field1015 = 0;
        for (int var1 = 0; var1 < this.field1014; var1++) {
            if (!this.field1013.method4984(var1) || this.field1013.method5011(var1)) {
                this.field1015++;
            }
        }
        return this.field1015 >= this.field1014;
    }
}
