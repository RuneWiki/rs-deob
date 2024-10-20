package deob;

@ObfuscatedName("jm")
public class class244 extends class258 {

    @ObfuscatedName("jm.af(Lsg;I)V")
    public void method4621(class489 arg0) {
        int var2 = arg0.method8248();
        if (class264.field3030.field3032 != var2) {
            throw new IllegalStateException("");
        }
        this.field2990 = arg0.method8248();
        this.field2995 = arg0.method8248();
        this.field2996 = arg0.method8250();
        this.field3001 = arg0.method8250();
        this.field2988 = arg0.method8250();
        this.field2989 = arg0.method8250();
        this.field2992 = arg0.method8300();
        this.field2993 = arg0.method8300();
    }

    @ObfuscatedName("jm.an(Lsg;S)V")
    public void method4632(class489 arg0) {
        this.field2995 = Math.min(this.field2995, 4);
        this.field2994 = new short[1][64][64];
        this.field2987 = new short[this.field2995][64][64];
        this.field2991 = new byte[this.field2995][64][64];
        this.field2997 = new byte[this.field2995][64][64];
        this.field2998 = new class260[this.field2995][64][64][];
        int var2 = arg0.method8248();
        if (class263.field3025.field3027 != var2) {
            throw new IllegalStateException("");
        }
        int var3 = arg0.method8248();
        int var4 = arg0.method8248();
        if (this.field2988 != var3 || this.field2989 != var4) {
            throw new IllegalStateException("");
        }
        for (int var5 = 0; var5 < 64; var5++) {
            for (int var6 = 0; var6 < 64; var6++) {
                this.method4957(var5, var6, arg0);
            }
        }
    }

    public boolean equals(Object arg0) {
        if ((arg0 instanceof class244)) {
            class244 var2 = (class244) arg0;
            return this.field2988 == var2.field2988 && this.field2989 == var2.field2989;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field2988 | this.field2989 << 8;
    }
}
