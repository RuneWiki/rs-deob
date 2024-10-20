package deob;

@ObfuscatedName("lv")
public class class290 implements class306 {

    @ObfuscatedName("lv.ac")
    public int field3158;

    @ObfuscatedName("lv.ae")
    public int field3159;

    @ObfuscatedName("lv.ag")
    public int field3150;

    @ObfuscatedName("lv.am")
    public int field3153;

    @ObfuscatedName("lv.ax")
    public int field3152;

    @ObfuscatedName("lv.aq")
    public int field3155;

    @ObfuscatedName("lv.af")
    public int field3156;

    @ObfuscatedName("lv.at")
    public int field3157;

    @ObfuscatedName("lv.au")
    public int field3154;

    @ObfuscatedName("lv.ar")
    public int field3151;

    @ObfuscatedName("lv.ac(Lky;I)V")
    public void method5265(class286 arg0) {
        if (arg0.field3106 > this.field3152) {
            arg0.field3106 = this.field3152;
        }
        if (arg0.field3102 < this.field3152) {
            arg0.field3102 = this.field3152;
        }
        if (arg0.field3108 > this.field3155) {
            arg0.field3108 = this.field3155;
        }
        if (arg0.field3112 < this.field3155) {
            arg0.field3112 = this.field3155;
        }
    }

    @ObfuscatedName("lv.ae(IIII)Z")
    public boolean method5267(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field3158 && arg0 < this.field3159 + this.field3158) {
            return arg1 >= (this.field3156 << 3) + (this.field3150 << 6) && arg1 <= (this.field3156 << 3) + (this.field3150 << 6) + 7 && arg2 >= (this.field3157 << 3) + (this.field3153 << 6) && arg2 <= (this.field3157 << 3) + (this.field3153 << 6) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("lv.ag(III)Z")
    public boolean method5268(int arg0, int arg1) {
        return arg0 >= (this.field3154 << 3) + (this.field3152 << 6) && arg0 <= (this.field3154 << 3) + (this.field3152 << 6) + 7 && arg1 >= (this.field3155 << 6) + (this.field3151 << 3) && arg1 <= (this.field3155 << 6) + (this.field3151 << 3) + 7;
    }

    @ObfuscatedName("lv.am(IIIB)[I")
    public int[] method5273(int arg0, int arg1, int arg2) {
        return this.method5267(arg0, arg1, arg2) ? new int[] { this.field3154 * 8 - this.field3156 * 8 + this.field3152 * 64 - this.field3150 * 64 + arg1, this.field3151 * 8 - this.field3157 * 8 + this.field3155 * 64 - this.field3153 * 64 + arg2 } : null;
    }

    @ObfuscatedName("lv.ax(III)Lnm;")
    public class352 method5270(int arg0, int arg1) {
        if (this.method5268(arg0, arg1)) {
            int var3 = this.field3156 * 8 - this.field3154 * 8 + this.field3150 * 64 - this.field3152 * 64 + arg0;
            int var4 = this.field3157 * 8 - this.field3151 * 8 + this.field3153 * 64 - this.field3155 * 64 + arg1;
            return new class352(this.field3158, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("lv.aq(Lvf;I)V")
    public void method5271(class551 arg0) {
        this.field3158 = arg0.method8955();
        this.field3159 = arg0.method8955();
        this.field3150 = arg0.method9119();
        this.field3156 = arg0.method8955();
        this.field3153 = arg0.method9119();
        this.field3157 = arg0.method8955();
        this.field3152 = arg0.method9119();
        this.field3154 = arg0.method8955();
        this.field3155 = arg0.method9119();
        this.field3151 = arg0.method8955();
        this.method5544();
    }

    @ObfuscatedName("lv.af(B)V")
    public void method5544() {
    }
}
