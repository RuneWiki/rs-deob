package deob;

@ObfuscatedName("lq")
public class class293 implements class306 {

    @ObfuscatedName("lq.ac")
    public int field3182;

    @ObfuscatedName("lq.ae")
    public int field3170;

    @ObfuscatedName("lq.ag")
    public int field3181;

    @ObfuscatedName("lq.am")
    public int field3172;

    @ObfuscatedName("lq.ax")
    public int field3173;

    @ObfuscatedName("lq.aq")
    public int field3174;

    @ObfuscatedName("lq.af")
    public int field3175;

    @ObfuscatedName("lq.at")
    public int field3176;

    @ObfuscatedName("lq.au")
    public int field3177;

    @ObfuscatedName("lq.ar")
    public int field3178;

    @ObfuscatedName("lq.al")
    public int field3179;

    @ObfuscatedName("lq.ad")
    public int field3169;

    @ObfuscatedName("lq.ah")
    public int field3171;

    @ObfuscatedName("lq.ap")
    public int field3180;

    @ObfuscatedName("lq.ac(Lky;I)V")
    public void method5265(class286 arg0) {
        if (arg0.field3106 > this.field3173) {
            arg0.field3106 = this.field3173;
        }
        if (arg0.field3102 < this.field3173) {
            arg0.field3102 = this.field3173;
        }
        if (arg0.field3108 > this.field3174) {
            arg0.field3108 = this.field3174;
        }
        if (arg0.field3112 < this.field3174) {
            arg0.field3112 = this.field3174;
        }
    }

    @ObfuscatedName("lq.ae(IIII)Z")
    public boolean method5267(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field3182 && arg0 < this.field3182 + this.field3170) {
            return arg1 >= (this.field3181 << 6) + (this.field3175 << 3) && arg1 <= (this.field3181 << 6) + (this.field3177 << 3) + 7 && arg2 >= (this.field3176 << 3) + (this.field3172 << 6) && arg2 <= (this.field3178 << 3) + (this.field3172 << 6) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("lq.ag(III)Z")
    public boolean method5268(int arg0, int arg1) {
        return arg0 >= (this.field3179 << 3) + (this.field3173 << 6) && arg0 <= (this.field3173 << 6) + (this.field3171 << 3) + 7 && arg1 >= (this.field3174 << 6) + (this.field3169 << 3) && arg1 <= (this.field3180 << 3) + (this.field3174 << 6) + 7;
    }

    @ObfuscatedName("lq.am(IIIB)[I")
    public int[] method5273(int arg0, int arg1, int arg2) {
        return this.method5267(arg0, arg1, arg2) ? new int[] { this.field3179 * 8 - this.field3175 * 8 + this.field3173 * 64 - this.field3181 * 64 + arg1, this.field3169 * 8 - this.field3176 * 8 + this.field3174 * 64 - this.field3172 * 64 + arg2 } : null;
    }

    @ObfuscatedName("lq.ax(III)Lnm;")
    public class352 method5270(int arg0, int arg1) {
        if (this.method5268(arg0, arg1)) {
            int var3 = this.field3175 * 8 - this.field3179 * 8 + this.field3181 * 64 - this.field3173 * 64 + arg0;
            int var4 = this.field3176 * 8 - this.field3169 * 8 + this.field3172 * 64 - this.field3174 * 64 + arg1;
            return new class352(this.field3182, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("lq.aq(Lvf;I)V")
    public void method5271(class551 arg0) {
        this.field3182 = arg0.method8955();
        this.field3170 = arg0.method8955();
        this.field3181 = arg0.method9119();
        this.field3175 = arg0.method8955();
        this.field3177 = arg0.method8955();
        this.field3172 = arg0.method9119();
        this.field3176 = arg0.method8955();
        this.field3178 = arg0.method8955();
        this.field3173 = arg0.method9119();
        this.field3179 = arg0.method8955();
        this.field3171 = arg0.method8955();
        this.field3174 = arg0.method9119();
        this.field3169 = arg0.method8955();
        this.field3180 = arg0.method8955();
        this.method5559();
    }

    @ObfuscatedName("lq.af(I)V")
    public void method5559() {
    }
}
