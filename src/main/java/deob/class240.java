package deob;

@ObfuscatedName("jo")
public class class240 extends class254 {

    @ObfuscatedName("jo.aj(Lsy;I)V")
    public void method4402(class478 arg0) {
        int var2 = arg0.method7909();
        if (class260.field2992.field2990 != var2) {
            throw new IllegalStateException("");
        }
        this.field2957 = arg0.method7909();
        this.field2945 = arg0.method7909();
        this.field2944 = arg0.method7905();
        this.field2941 = arg0.method7905();
        this.field2942 = arg0.method7905();
        this.field2943 = arg0.method7905();
        this.field2949 = arg0.method7922();
        this.field2946 = arg0.method7922();
    }

    @ObfuscatedName("jo.al(Lsy;I)V")
    public void method4403(class478 arg0) {
        this.field2945 = Math.min(this.field2945, 4);
        this.field2948 = new short[1][64][64];
        this.field2940 = new short[this.field2945][64][64];
        this.field2950 = new byte[this.field2945][64][64];
        this.field2953 = new byte[this.field2945][64][64];
        this.field2952 = new class256[this.field2945][64][64][];
        int var2 = arg0.method7909();
        if (class259.field2981.field2982 != var2) {
            throw new IllegalStateException("");
        }
        int var3 = arg0.method7909();
        int var4 = arg0.method7909();
        if (this.field2942 != var3 || this.field2943 != var4) {
            throw new IllegalStateException("");
        }
        for (int var5 = 0; var5 < 64; var5++) {
            for (int var6 = 0; var6 < 64; var6++) {
                this.method4770(var5, var6, arg0);
            }
        }
    }

    public boolean equals(Object arg0) {
        if ((arg0 instanceof class240)) {
            class240 var2 = (class240) arg0;
            return this.field2942 == var2.field2942 && this.field2943 == var2.field2943;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field2942 | this.field2943 << 8;
    }
}
