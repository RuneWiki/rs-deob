package deob;

@ObfuscatedName("ry")
public class class462 {

    @ObfuscatedName("ry.am")
    public int field4789;

    @ObfuscatedName("ry.ap")
    public int field4790;

    @ObfuscatedName("ry.af")
    public int field4791;

    @ObfuscatedName("ry.aj")
    public int field4792;

    public class462(int arg0, int arg1) {
        this(0, 0, arg0, arg1);
    }

    public class462(int arg0, int arg1, int arg2, int arg3) {
        this.method7754(arg0, arg1);
        this.method7735(arg2, arg3);
    }

    @ObfuscatedName("ry.am(III)V")
    public void method7754(int arg0, int arg1) {
        this.field4789 = arg0;
        this.field4790 = arg1;
    }

    @ObfuscatedName("ry.ap(III)V")
    public void method7735(int arg0, int arg1) {
        this.field4791 = arg0;
        this.field4792 = arg1;
    }

    @ObfuscatedName("ry.af(III)Z")
    public boolean method7738(int arg0, int arg1) {
        return arg0 >= this.field4789 && arg0 < this.field4791 + this.field4789 && arg1 >= this.field4790 && arg1 < this.field4792 + this.field4790;
    }

    public String toString() {
        return null;
    }

    @ObfuscatedName("ry.aj(Lry;Lry;B)V")
    public void method7740(class462 arg0, class462 arg1) {
        this.method7741(arg0, arg1);
        this.method7749(arg0, arg1);
    }

    @ObfuscatedName("ry.aq(Lry;Lry;I)V")
    public void method7741(class462 arg0, class462 arg1) {
        arg1.field4789 = this.field4789;
        arg1.field4791 = this.field4791;
        if (this.field4789 < arg0.field4789) {
            arg1.field4791 -= arg0.field4789 - this.field4789;
            arg1.field4789 = arg0.field4789;
        }
        if (arg1.method7737() > arg0.method7737()) {
            arg1.field4791 -= arg1.method7737() - arg0.method7737();
        }
        if (arg1.field4791 < 0) {
            arg1.field4791 = 0;
        }
    }

    @ObfuscatedName("ry.ar(Lry;Lry;I)V")
    public void method7749(class462 arg0, class462 arg1) {
        arg1.field4790 = this.field4790;
        arg1.field4792 = this.field4792;
        if (this.field4790 < arg0.field4790) {
            arg1.field4792 -= arg0.field4790 - this.field4790;
            arg1.field4790 = arg0.field4790;
        }
        if (arg1.method7743() > arg0.method7743()) {
            arg1.field4792 -= arg1.method7743() - arg0.method7743();
        }
        if (arg1.field4792 < 0) {
            arg1.field4792 = 0;
        }
    }

    @ObfuscatedName("ry.ag(I)I")
    public int method7737() {
        return this.field4791 + this.field4789;
    }

    @ObfuscatedName("ry.ao(I)I")
    public int method7743() {
        return this.field4792 + this.field4790;
    }
}
