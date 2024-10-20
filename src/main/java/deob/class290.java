package deob;

@ObfuscatedName("lm")
public class class290 implements class293 {

    @ObfuscatedName("lm.az")
    public int field3147;

    @ObfuscatedName("lm.ah")
    public int field3142;

    @ObfuscatedName("lm.af")
    public int field3143;

    @ObfuscatedName("lm.at")
    public int field3145;

    @ObfuscatedName("lm.an")
    public int field3144;

    @ObfuscatedName("lm.ao")
    public int field3146;

    @ObfuscatedName("lm.az(Lkf;I)V")
    public void method4856(class273 arg0) {
        if (arg0.field2996 > this.field3144) {
            arg0.field2996 = this.field3144;
        }
        if (arg0.field3002 < this.field3144) {
            arg0.field3002 = this.field3144;
        }
        if (arg0.field2998 > this.field3146) {
            arg0.field2998 = this.field3146;
        }
        if (arg0.field2999 < this.field3146) {
            arg0.field2999 = this.field3146;
        }
    }

    @ObfuscatedName("lm.ah(IIII)Z")
    public boolean method4857(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field3147 && arg0 < this.field3147 + this.field3142) {
            return arg1 >> 6 == this.field3143 && arg2 >> 6 == this.field3145;
        } else {
            return false;
        }
    }

    @ObfuscatedName("lm.af(III)Z")
    public boolean method4870(int arg0, int arg1) {
        return arg0 >> 6 == this.field3144 && arg1 >> 6 == this.field3146;
    }

    @ObfuscatedName("lm.at(IIII)[I")
    public int[] method4859(int arg0, int arg1, int arg2) {
        return this.method4857(arg0, arg1, arg2) ? new int[] { this.field3144 * 64 - this.field3143 * 64 + arg1, this.field3146 * 64 - this.field3145 * 64 + arg2 } : null;
    }

    @ObfuscatedName("lm.an(IIB)Lnn;")
    public class339 method4860(int arg0, int arg1) {
        if (this.method4870(arg0, arg1)) {
            int var3 = this.field3143 * 64 - this.field3144 * 64 + arg0;
            int var4 = this.field3145 * 64 - this.field3146 * 64 + arg1;
            return new class339(this.field3147, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("lm.ao(Lur;I)V")
    public void method4872(class535 arg0) {
        this.field3147 = arg0.method8462();
        this.field3142 = arg0.method8462();
        this.field3143 = arg0.method8670();
        this.field3145 = arg0.method8670();
        this.field3144 = arg0.method8670();
        this.field3146 = arg0.method8670();
        this.method5212();
    }

    @ObfuscatedName("lm.ab(B)V")
    public void method5212() {
    }
}
