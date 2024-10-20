package deob;

@ObfuscatedName("rz")
public class class466 {

    @ObfuscatedName("rz.az")
    public int field4857;

    @ObfuscatedName("rz.ah")
    public int field4854;

    @ObfuscatedName("rz.af")
    public int field4855;

    @ObfuscatedName("rz.at")
    public int field4856;

    public class466(int arg0, int arg1) {
        this(0, 0, arg0, arg1);
    }

    public class466(int arg0, int arg1, int arg2, int arg3) {
        this.method7624(arg0, arg1);
        this.method7621(arg2, arg3);
    }

    @ObfuscatedName("rz.az(IIB)V")
    public void method7624(int arg0, int arg1) {
        this.field4857 = arg0;
        this.field4854 = arg1;
    }

    @ObfuscatedName("rz.ah(IIB)V")
    public void method7621(int arg0, int arg1) {
        this.field4855 = arg0;
        this.field4856 = arg1;
    }

    @ObfuscatedName("rz.af(III)Z")
    public boolean method7622(int arg0, int arg1) {
        return arg0 >= this.field4857 && arg0 < this.field4857 + this.field4855 && arg1 >= this.field4854 && arg1 < this.field4856 + this.field4854;
    }

    public String toString() {
        return null;
    }

    @ObfuscatedName("rz.at(Lrz;Lrz;I)V")
    public void method7634(class466 arg0, class466 arg1) {
        this.method7620(arg0, arg1);
        this.method7625(arg0, arg1);
    }

    @ObfuscatedName("rz.an(Lrz;Lrz;I)V")
    public void method7620(class466 arg0, class466 arg1) {
        arg1.field4857 = this.field4857;
        arg1.field4855 = this.field4855;
        if (this.field4857 < arg0.field4857) {
            arg1.field4855 -= arg0.field4857 - this.field4857;
            arg1.field4857 = arg0.field4857;
        }
        if (arg1.method7623() > arg0.method7623()) {
            arg1.field4855 -= arg1.method7623() - arg0.method7623();
        }
        if (arg1.field4855 < 0) {
            arg1.field4855 = 0;
        }
    }

    @ObfuscatedName("rz.ao(Lrz;Lrz;I)V")
    public void method7625(class466 arg0, class466 arg1) {
        arg1.field4854 = this.field4854;
        arg1.field4856 = this.field4856;
        if (this.field4854 < arg0.field4854) {
            arg1.field4856 -= arg0.field4854 - this.field4854;
            arg1.field4854 = arg0.field4854;
        }
        if (arg1.method7627() > arg0.method7627()) {
            arg1.field4856 -= arg1.method7627() - arg0.method7627();
        }
        if (arg1.field4856 < 0) {
            arg1.field4856 = 0;
        }
    }

    @ObfuscatedName("rz.ab(I)I")
    public int method7623() {
        return this.field4857 + this.field4855;
    }

    @ObfuscatedName("rz.aw(B)I")
    public int method7627() {
        return this.field4856 + this.field4854;
    }
}
