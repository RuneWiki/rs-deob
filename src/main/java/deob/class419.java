package deob;

@ObfuscatedName("qi")
public class class419 {

    @ObfuscatedName("qi.ak")
    public int field4674;

    @ObfuscatedName("qi.al")
    public int field4672;

    @ObfuscatedName("qi.aj")
    public int field4673;

    @ObfuscatedName("qi.az")
    public int field4671;

    public class419(int arg0, int arg1) {
        this(0, 0, arg0, arg1);
    }

    public class419(int arg0, int arg1, int arg2, int arg3) {
        this.method7088(arg0, arg1);
        this.method7089(arg2, arg3);
    }

    @ObfuscatedName("qi.ak(III)V")
    public void method7088(int arg0, int arg1) {
        this.field4674 = arg0;
        this.field4672 = arg1;
    }

    @ObfuscatedName("qi.al(III)V")
    public void method7089(int arg0, int arg1) {
        this.field4673 = arg0;
        this.field4671 = arg1;
    }

    @ObfuscatedName("qi.aj(III)Z")
    public boolean method7099(int arg0, int arg1) {
        return arg0 >= this.field4674 && arg0 < this.field4674 + this.field4673 && arg1 >= this.field4672 && arg1 < this.field4672 + this.field4671;
    }

    public String toString() {
        return null;
    }

    @ObfuscatedName("qi.az(Lqi;Lqi;I)V")
    public void method7091(class419 arg0, class419 arg1) {
        this.method7092(arg0, arg1);
        this.method7093(arg0, arg1);
    }

    @ObfuscatedName("qi.af(Lqi;Lqi;B)V")
    public void method7092(class419 arg0, class419 arg1) {
        arg1.field4674 = this.field4674;
        arg1.field4673 = this.field4673;
        if (this.field4674 < arg0.field4674) {
            arg1.field4673 -= arg0.field4674 - this.field4674;
            arg1.field4674 = arg0.field4674;
        }
        if (arg1.method7094() > arg0.method7094()) {
            arg1.field4673 -= arg1.method7094() - arg0.method7094();
        }
        if (arg1.field4673 < 0) {
            arg1.field4673 = 0;
        }
    }

    @ObfuscatedName("qi.aa(Lqi;Lqi;B)V")
    public void method7093(class419 arg0, class419 arg1) {
        arg1.field4672 = this.field4672;
        arg1.field4671 = this.field4671;
        if (this.field4672 < arg0.field4672) {
            arg1.field4671 -= arg0.field4672 - this.field4672;
            arg1.field4672 = arg0.field4672;
        }
        if (arg1.method7095() > arg0.method7095()) {
            arg1.field4671 -= arg1.method7095() - arg0.method7095();
        }
        if (arg1.field4671 < 0) {
            arg1.field4671 = 0;
        }
    }

    @ObfuscatedName("qi.at(B)I")
    public int method7094() {
        return this.field4674 + this.field4673;
    }

    @ObfuscatedName("qi.ab(I)I")
    public int method7095() {
        return this.field4672 + this.field4671;
    }
}
