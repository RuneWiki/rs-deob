package deob;

@ObfuscatedName("bu")
public class class64 {

    @ObfuscatedName("bu.p")
    public final class249 field716;

    @ObfuscatedName("bu.i")
    public final int field713;

    @ObfuscatedName("bu.w")
    public int field714 = 0;

    public class64(class249 arg0, String arg1) {
        this.field716 = arg0;
        this.field713 = arg0.method4045();
    }

    @ObfuscatedName("bu.p(I)Z")
    public boolean method961() {
        this.field714 = 0;
        for (int var1 = 0; var1 < this.field713; var1++) {
            if (!this.field716.method4145(var1) || this.field716.method4158(var1)) {
                this.field714++;
            }
        }
        return this.field714 >= this.field713;
    }
}
