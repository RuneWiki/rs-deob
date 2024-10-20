package deob;

@ObfuscatedName("ka")
public class class268 extends class282 {

    @ObfuscatedName("ka.az(Lur;I)V")
    public void method4814(class535 arg0) {
        int var2 = arg0.method8462();
        if (class288.field3134.field3133 != var2) {
            throw new IllegalStateException("");
        }
        this.field3095 = arg0.method8462();
        this.field3096 = arg0.method8462();
        this.field3103 = arg0.method8670();
        this.field3104 = arg0.method8670();
        this.field3093 = arg0.method8670();
        this.field3094 = arg0.method8670();
        this.field3100 = arg0.method8633();
        this.field3091 = arg0.method8633();
    }

    @ObfuscatedName("ka.ah(Lur;B)V")
    public void method4815(class535 arg0) {
        this.field3096 = Math.min(this.field3096, 4);
        this.field3099 = new short[1][64][64];
        this.field3092 = new short[this.field3096][64][64];
        this.field3101 = new byte[this.field3096][64][64];
        this.field3102 = new byte[this.field3096][64][64];
        this.field3097 = new class284[this.field3096][64][64][];
        int var2 = arg0.method8462();
        if (class287.field3130.field3132 != var2) {
            throw new IllegalStateException("");
        }
        int var3 = arg0.method8462();
        int var4 = arg0.method8462();
        if (this.field3093 != var3 || this.field3094 != var4) {
            throw new IllegalStateException("");
        }
        for (int var5 = 0; var5 < 64; var5++) {
            for (int var6 = 0; var6 < 64; var6++) {
                this.method5176(var5, var6, arg0);
            }
        }
    }

    public boolean equals(Object arg0) {
        if ((arg0 instanceof class268)) {
            class268 var2 = (class268) arg0;
            return this.field3093 == var2.field3093 && this.field3094 == var2.field3094;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field3093 | this.field3094 << 8;
    }
}
