package deob;

@ObfuscatedName("bl")
public class class68 {

    @ObfuscatedName("bl.o")
    public final class246 field555;

    @ObfuscatedName("bl.q")
    public final int field550;

    @ObfuscatedName("bl.j")
    public int field558 = 0;

    public class68(class246 arg0, String arg1) {
        this.field555 = arg0;
        this.field550 = arg0.method3945();
    }

    @ObfuscatedName("bl.m(I)Z")
    public boolean method1040() {
        this.field558 = 0;
        for (int var1 = 0; var1 < this.field550; var1++) {
            if (!this.field555.method4029(var1) || this.field555.method4035(var1)) {
                this.field558++;
            }
        }
        return this.field558 >= this.field550;
    }
}
