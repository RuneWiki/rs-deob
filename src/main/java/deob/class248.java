package deob;

@ObfuscatedName("je")
public class class248 extends class254 {

    @ObfuscatedName("je.aj")
    public int field2886;

    @ObfuscatedName("je.al")
    public int field2887;

    @ObfuscatedName("je.ac")
    public int field2888;

    @ObfuscatedName("je.ab")
    public int field2890;

    @ObfuscatedName("je.aj(Lsy;I)V")
    public void method4708(class478 arg0) {
        int var2 = arg0.method7909();
        if (class260.field2993.field2990 != var2) {
            throw new IllegalStateException("");
        }
        this.field2957 = arg0.method7909();
        this.field2945 = arg0.method7909();
        this.field2944 = arg0.method7905();
        this.field2941 = arg0.method7905();
        this.field2886 = arg0.method7909();
        this.field2887 = arg0.method7909();
        this.field2942 = arg0.method7905();
        this.field2943 = arg0.method7905();
        this.field2888 = arg0.method7909();
        this.field2890 = arg0.method7909();
        this.field2949 = arg0.method7922();
        this.field2946 = arg0.method7922();
    }

    @ObfuscatedName("je.al(Lsy;I)V")
    public void method4403(class478 arg0) {
        this.field2945 = Math.min(this.field2945, 4);
        this.field2948 = new short[1][64][64];
        this.field2940 = new short[this.field2945][64][64];
        this.field2950 = new byte[this.field2945][64][64];
        this.field2953 = new byte[this.field2945][64][64];
        this.field2952 = new class256[this.field2945][64][64][];
        int var2 = arg0.method7909();
        if (class259.field2987.field2982 != var2) {
            throw new IllegalStateException("");
        }
        int var3 = arg0.method7909();
        int var4 = arg0.method7909();
        int var5 = arg0.method7909();
        int var6 = arg0.method7909();
        if (this.field2942 != var3 || this.field2943 != var4 || this.field2888 != var5 || this.field2890 != var6) {
            throw new IllegalStateException("");
        }
        for (int var7 = 0; var7 < 8; var7++) {
            for (int var8 = 0; var8 < 8; var8++) {
                this.method4770(this.field2888 * 8 + var7, this.field2890 * 8 + var8, arg0);
            }
        }
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof class248)) {
            return false;
        }
        class248 var2 = (class248) arg0;
        if (this.field2942 == var2.field2942 && this.field2943 == var2.field2943) {
            return this.field2888 == var2.field2888 && this.field2890 == var2.field2890;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field2942 | this.field2943 << 8 | this.field2888 << 16 | this.field2890 << 24;
    }

    @ObfuscatedName("je.ac(I)I")
    public int method4711() {
        return this.field2886;
    }

    @ObfuscatedName("je.ab(B)I")
    public int method4712() {
        return this.field2887;
    }

    @ObfuscatedName("je.an(B)I")
    public int method4713() {
        return this.field2888;
    }

    @ObfuscatedName("je.ao(S)I")
    public int method4721() {
        return this.field2890;
    }
}
