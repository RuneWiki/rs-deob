package deob;

@ObfuscatedName("qa")
public class class420 {

    @ObfuscatedName("qa.aq")
    public int field4688;

    @ObfuscatedName("qa.ad")
    public int field4687;

    @ObfuscatedName("qa.ag")
    public int field4686;

    @ObfuscatedName("qa.ak")
    public int field4689;

    public class420(int arg0, int arg1) {
        this(0, 0, arg0, arg1);
    }

    public class420(int arg0, int arg1, int arg2, int arg3) {
        this.method7021(arg0, arg1);
        this.method7022(arg2, arg3);
    }

    @ObfuscatedName("qa.aq(III)V")
    public void method7021(int arg0, int arg1) {
        this.field4688 = arg0;
        this.field4687 = arg1;
    }

    @ObfuscatedName("qa.ad(III)V")
    public void method7022(int arg0, int arg1) {
        this.field4686 = arg0;
        this.field4689 = arg1;
    }

    @ObfuscatedName("qa.ag(III)Z")
    public boolean method7023(int arg0, int arg1) {
        return arg0 >= this.field4688 && arg0 < this.field4688 + this.field4686 && arg1 >= this.field4687 && arg1 < this.field4689 + this.field4687;
    }

    public String toString() {
        return null;
    }

    @ObfuscatedName("qa.ak(Lqa;Lqa;B)V")
    public void method7019(class420 arg0, class420 arg1) {
        this.method7024(arg0, arg1);
        this.method7025(arg0, arg1);
    }

    @ObfuscatedName("qa.ap(Lqa;Lqa;I)V")
    public void method7024(class420 arg0, class420 arg1) {
        arg1.field4688 = this.field4688;
        arg1.field4686 = this.field4686;
        if (this.field4688 < arg0.field4688) {
            arg1.field4686 -= arg0.field4688 - this.field4688;
            arg1.field4688 = arg0.field4688;
        }
        if (arg1.method7026() > arg0.method7026()) {
            arg1.field4686 -= arg1.method7026() - arg0.method7026();
        }
        if (arg1.field4686 < 0) {
            arg1.field4686 = 0;
        }
    }

    @ObfuscatedName("qa.an(Lqa;Lqa;I)V")
    public void method7025(class420 arg0, class420 arg1) {
        arg1.field4687 = this.field4687;
        arg1.field4689 = this.field4689;
        if (this.field4687 < arg0.field4687) {
            arg1.field4689 -= arg0.field4687 - this.field4687;
            arg1.field4687 = arg0.field4687;
        }
        if (arg1.method7052() > arg0.method7052()) {
            arg1.field4689 -= arg1.method7052() - arg0.method7052();
        }
        if (arg1.field4689 < 0) {
            arg1.field4689 = 0;
        }
    }

    @ObfuscatedName("qa.aj(B)I")
    public int method7026() {
        return this.field4688 + this.field4686;
    }

    @ObfuscatedName("qa.av(B)I")
    public int method7052() {
        return this.field4689 + this.field4687;
    }
}
