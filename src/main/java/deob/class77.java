package deob;

@ObfuscatedName("bj")
public class class77 {

    @ObfuscatedName("bj.v")
    public final class313 field1019;

    @ObfuscatedName("bj.q")
    public final int field1020;

    @ObfuscatedName("bj.f")
    public int field1021 = 0;

    public class77(class313 arg0, String arg1) {
        this.field1019 = arg0;
        this.field1020 = arg0.method5311();
    }

    @ObfuscatedName("bj.c(B)Z")
    public boolean method1979() {
        this.field1021 = 0;
        for (int var1 = 0; var1 < this.field1020; var1++) {
            if (!this.field1019.method5261(var1) || this.field1019.method5260(var1)) {
                this.field1021++;
            }
        }
        return this.field1021 >= this.field1020;
    }
}
