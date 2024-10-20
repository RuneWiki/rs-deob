package deob;

@ObfuscatedName("y")
public class class23 extends class29 {

    @ObfuscatedName("y.w(Lfi;Lfi;B)V")
    public void method154(class177 arg0, class177 arg1) {
        int var3 = arg1.method2931();
        if (class37.field515.field517 != var3) {
            throw new IllegalStateException("");
        }
        this.field415 = arg1.method2931();
        this.field421 = arg1.method2931();
        this.field427 = arg1.method2886();
        this.field416 = arg1.method2886();
        this.field417 = arg1.method2886();
        this.field422 = arg1.method2886();
        this.field421 = Math.min(this.field421, 4);
        this.field418 = new short[1][64][64];
        this.field419 = new short[this.field421][64][64];
        this.field423 = new byte[this.field421][64][64];
        this.field424 = new byte[this.field421][64][64];
        this.field425 = new class32[this.field421][64][64][];
        int var4 = arg0.method2931();
        if (class36.field513.field507 != var4) {
            throw new IllegalStateException("");
        }
        int var5 = arg0.method2931();
        int var6 = arg0.method2931();
        if (this.field417 != var5 || this.field422 != var6) {
            throw new IllegalStateException("");
        }
        for (int var7 = 0; var7 < 64; var7++) {
            for (int var8 = 0; var8 < 64; var8++) {
                this.method210(var7, var8, arg0);
            }
        }
    }

    public boolean equals(Object arg0) {
        if ((arg0 instanceof class23)) {
            class23 var2 = (class23) arg0;
            return this.field417 == var2.field417 && this.field422 == var2.field422;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field417 | this.field422 << 8;
    }
}
