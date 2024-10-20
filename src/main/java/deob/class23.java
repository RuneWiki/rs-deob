package deob;

@ObfuscatedName("g")
public class class23 extends class29 {

    @ObfuscatedName("g.d(Lgy;Lgy;I)V")
    public void method155(class195 arg0, class195 arg1) {
        int var3 = arg1.method3330();
        if (class38.field510.field508 != var3) {
            throw new IllegalStateException("");
        }
        this.field415 = arg1.method3330();
        this.field411 = arg1.method3330();
        this.field412 = arg1.method3269();
        this.field421 = arg1.method3269();
        this.field423 = arg1.method3269();
        this.field414 = arg1.method3269();
        this.field411 = Math.min(this.field411, 4);
        this.field424 = new short[1][64][64];
        this.field417 = new short[this.field411][64][64];
        this.field419 = new byte[this.field411][64][64];
        this.field420 = new byte[this.field411][64][64];
        this.field418 = new class32[this.field411][64][64][];
        int var4 = arg0.method3330();
        if (class37.field500.field502 != var4) {
            throw new IllegalStateException("");
        }
        int var5 = arg0.method3330();
        int var6 = arg0.method3330();
        if (this.field423 != var5 || this.field414 != var6) {
            throw new IllegalStateException("");
        }
        for (int var7 = 0; var7 < 64; var7++) {
            for (int var8 = 0; var8 < 64; var8++) {
                this.method214(var7, var8, arg0);
            }
        }
    }

    public boolean equals(Object arg0) {
        if ((arg0 instanceof class23)) {
            class23 var2 = (class23) arg0;
            return this.field423 == var2.field423 && this.field414 == var2.field414;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field423 | this.field414 << 8;
    }
}
