package deob;

@ObfuscatedName("qs")
public class class434 {

    @ObfuscatedName("qs.at")
    public int field4668;

    @ObfuscatedName("qs.an")
    public int field4666;

    @ObfuscatedName("qs.av")
    public int field4667;

    @ObfuscatedName("qs.as")
    public int field4665;

    public class434(int arg0, int arg1) {
        this(0, 0, arg0, arg1);
    }

    public class434(int arg0, int arg1, int arg2, int arg3) {
        this.method7329(arg0, arg1);
        this.method7351(arg2, arg3);
    }

    @ObfuscatedName("qs.at(III)V")
    public void method7329(int arg0, int arg1) {
        this.field4668 = arg0;
        this.field4666 = arg1;
    }

    @ObfuscatedName("qs.an(III)V")
    public void method7351(int arg0, int arg1) {
        this.field4667 = arg0;
        this.field4665 = arg1;
    }

    @ObfuscatedName("qs.av(IIB)Z")
    public boolean method7331(int arg0, int arg1) {
        return arg0 >= this.field4668 && arg0 < this.field4668 + this.field4667 && arg1 >= this.field4666 && arg1 < this.field4666 + this.field4665;
    }

    public String toString() {
        return null;
    }

    @ObfuscatedName("qs.as(Lqs;Lqs;I)V")
    public void method7333(class434 arg0, class434 arg1) {
        this.method7334(arg0, arg1);
        this.method7335(arg0, arg1);
    }

    @ObfuscatedName("qs.ax(Lqs;Lqs;I)V")
    public void method7334(class434 arg0, class434 arg1) {
        arg1.field4668 = this.field4668;
        arg1.field4667 = this.field4667;
        if (this.field4668 < arg0.field4668) {
            arg1.field4667 -= arg0.field4668 - this.field4668;
            arg1.field4668 = arg0.field4668;
        }
        if (arg1.method7339() > arg0.method7339()) {
            arg1.field4667 -= arg1.method7339() - arg0.method7339();
        }
        if (arg1.field4667 < 0) {
            arg1.field4667 = 0;
        }
    }

    @ObfuscatedName("qs.ap(Lqs;Lqs;B)V")
    public void method7335(class434 arg0, class434 arg1) {
        arg1.field4666 = this.field4666;
        arg1.field4665 = this.field4665;
        if (this.field4666 < arg0.field4666) {
            arg1.field4665 -= arg0.field4666 - this.field4666;
            arg1.field4666 = arg0.field4666;
        }
        if (arg1.method7337() > arg0.method7337()) {
            arg1.field4665 -= arg1.method7337() - arg0.method7337();
        }
        if (arg1.field4665 < 0) {
            arg1.field4665 = 0;
        }
    }

    @ObfuscatedName("qs.ab(I)I")
    public int method7339() {
        return this.field4668 + this.field4667;
    }

    @ObfuscatedName("qs.ak(I)I")
    public int method7337() {
        return this.field4666 + this.field4665;
    }
}
