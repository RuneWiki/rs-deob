package deob;

@ObfuscatedName("kq")
public class class285 implements class306 {

    @ObfuscatedName("kq.ac")
    public int field3092;

    @ObfuscatedName("kq.ae")
    public int field3089;

    @ObfuscatedName("kq.ag")
    public int field3090;

    @ObfuscatedName("kq.am")
    public int field3091;

    @ObfuscatedName("kq.ax")
    public int field3094;

    @ObfuscatedName("kq.aq")
    public int field3088;

    @ObfuscatedName("kq.af")
    public int field3098;

    @ObfuscatedName("kq.at")
    public int field3095;

    @ObfuscatedName("kq.au")
    public int field3096;

    @ObfuscatedName("kq.ar")
    public int field3097;

    @ObfuscatedName("kq.ac(Lky;I)V")
    public void method5265(class286 arg0) {
        if (arg0.field3106 > this.field3098) {
            arg0.field3106 = this.field3098;
        }
        if (arg0.field3102 < this.field3096) {
            arg0.field3102 = this.field3096;
        }
        if (arg0.field3108 > this.field3095) {
            arg0.field3108 = this.field3095;
        }
        if (arg0.field3112 < this.field3097) {
            arg0.field3112 = this.field3097;
        }
    }

    @ObfuscatedName("kq.ae(IIII)Z")
    public boolean method5267(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field3092 && arg0 < this.field3092 + this.field3089) {
            return arg1 >> 6 >= this.field3090 && arg1 >> 6 <= this.field3094 && arg2 >> 6 >= this.field3091 && arg2 >> 6 <= this.field3088;
        } else {
            return false;
        }
    }

    @ObfuscatedName("kq.ag(III)Z")
    public boolean method5268(int arg0, int arg1) {
        return arg0 >> 6 >= this.field3098 && arg0 >> 6 <= this.field3096 && arg1 >> 6 >= this.field3095 && arg1 >> 6 <= this.field3097;
    }

    @ObfuscatedName("kq.am(IIIB)[I")
    public int[] method5273(int arg0, int arg1, int arg2) {
        return this.method5267(arg0, arg1, arg2) ? new int[] { this.field3098 * 64 - this.field3090 * 64 + arg1, this.field3095 * 64 - this.field3091 * 64 + arg2 } : null;
    }

    @ObfuscatedName("kq.ax(III)Lnm;")
    public class352 method5270(int arg0, int arg1) {
        if (this.method5268(arg0, arg1)) {
            int var3 = this.field3090 * 64 - this.field3098 * 64 + arg0;
            int var4 = this.field3091 * 64 - this.field3095 * 64 + arg1;
            return new class352(this.field3092, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("kq.aq(Lvf;I)V")
    public void method5271(class551 arg0) {
        this.field3092 = arg0.method8955();
        this.field3089 = arg0.method8955();
        this.field3090 = arg0.method9119();
        this.field3091 = arg0.method9119();
        this.field3094 = arg0.method9119();
        this.field3088 = arg0.method9119();
        this.field3098 = arg0.method9119();
        this.field3095 = arg0.method9119();
        this.field3096 = arg0.method9119();
        this.field3097 = arg0.method9119();
        this.method5269();
    }

    @ObfuscatedName("kq.af(B)V")
    public void method5269() {
    }
}
