package deob;

@ObfuscatedName("l")
public class class23 extends class29 {

    @ObfuscatedName("l.d(Lfg;Lfg;I)V")
    public void method146(class174 arg0, class174 arg1) {
        int var3 = arg1.method2955();
        if (class37.field523.field524 != var3) {
            throw new IllegalStateException("");
        }
        this.field426 = arg1.method2955();
        this.field420 = arg1.method2955();
        this.field419 = arg1.method3035();
        this.field427 = arg1.method3035();
        this.field417 = arg1.method3035();
        this.field418 = arg1.method3035();
        this.field420 = Math.min(this.field420, 4);
        this.field421 = new short[1][64][64];
        this.field422 = new short[this.field420][64][64];
        this.field423 = new byte[this.field420][64][64];
        this.field424 = new byte[this.field420][64][64];
        this.field425 = new class32[this.field420][64][64][];
        int var4 = arg0.method2955();
        if (class36.field516.field514 != var4) {
            throw new IllegalStateException("");
        }
        int var5 = arg0.method2955();
        int var6 = arg0.method2955();
        if (this.field417 != var5 || this.field418 != var6) {
            throw new IllegalStateException("");
        }
        for (int var7 = 0; var7 < 64; var7++) {
            for (int var8 = 0; var8 < 64; var8++) {
                this.method219(var7, var8, arg0);
            }
        }
    }

    public boolean equals(Object arg0) {
        if ((arg0 instanceof class23)) {
            class23 var2 = (class23) arg0;
            return this.field417 == var2.field417 && this.field418 == var2.field418;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field417 | this.field418 << 8;
    }
}
