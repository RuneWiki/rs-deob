package deob;

@ObfuscatedName("lw")
public class class303 implements class306 {

    @ObfuscatedName("lw.ac")
    public int field3253;

    @ObfuscatedName("lw.ae")
    public int field3246;

    @ObfuscatedName("lw.ag")
    public int field3251;

    @ObfuscatedName("lw.am")
    public int field3248;

    @ObfuscatedName("lw.ax")
    public int field3249;

    @ObfuscatedName("lw.aq")
    public int field3250;

    @ObfuscatedName("lw.ac(Lky;I)V")
    public void method5265(class286 arg0) {
        if (arg0.field3106 > this.field3249) {
            arg0.field3106 = this.field3249;
        }
        if (arg0.field3102 < this.field3249) {
            arg0.field3102 = this.field3249;
        }
        if (arg0.field3108 > this.field3250) {
            arg0.field3108 = this.field3250;
        }
        if (arg0.field3112 < this.field3250) {
            arg0.field3112 = this.field3250;
        }
    }

    @ObfuscatedName("lw.ae(IIII)Z")
    public boolean method5267(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field3253 && arg0 < this.field3253 + this.field3246) {
            return arg1 >> 6 == this.field3251 && arg2 >> 6 == this.field3248;
        } else {
            return false;
        }
    }

    @ObfuscatedName("lw.ag(III)Z")
    public boolean method5268(int arg0, int arg1) {
        return arg0 >> 6 == this.field3249 && arg1 >> 6 == this.field3250;
    }

    @ObfuscatedName("lw.am(IIIB)[I")
    public int[] method5273(int arg0, int arg1, int arg2) {
        return this.method5267(arg0, arg1, arg2) ? new int[] { this.field3249 * 64 - this.field3251 * 64 + arg1, this.field3250 * 64 - this.field3248 * 64 + arg2 } : null;
    }

    @ObfuscatedName("lw.ax(III)Lnm;")
    public class352 method5270(int arg0, int arg1) {
        if (this.method5268(arg0, arg1)) {
            int var3 = this.field3251 * 64 - this.field3249 * 64 + arg0;
            int var4 = this.field3248 * 64 - this.field3250 * 64 + arg1;
            return new class352(this.field3253, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("lw.aq(Lvf;I)V")
    public void method5271(class551 arg0) {
        this.field3253 = arg0.method8955();
        this.field3246 = arg0.method8955();
        this.field3251 = arg0.method9119();
        this.field3248 = arg0.method9119();
        this.field3249 = arg0.method9119();
        this.field3250 = arg0.method9119();
        this.method5618();
    }

    @ObfuscatedName("lw.af(I)V")
    public void method5618() {
    }
}
