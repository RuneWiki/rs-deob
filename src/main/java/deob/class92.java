package deob;

@ObfuscatedName("ck")
public class class92 {

    @ObfuscatedName("ck.o")
    public final class251 field1110;

    @ObfuscatedName("ck.u")
    public final int field1111;

    @ObfuscatedName("ck.p")
    public int field1112 = 0;

    public class92(class251 arg0, String arg1) {
        this.field1110 = arg0;
        this.field1111 = arg0.method4002();
    }

    @ObfuscatedName("ck.f(I)Z")
    public boolean method1810() {
        this.field1112 = 0;
        for (int var1 = 0; var1 < this.field1111; var1++) {
            if (!this.field1110.method3898(var1) || this.field1110.method3916(var1)) {
                this.field1112++;
            }
        }
        return this.field1112 >= this.field1111;
    }
}
