package deob;

@ObfuscatedName("lp")
public class class288 {

    @ObfuscatedName("lp.am")
    public boolean field3099 = false;

    @ObfuscatedName("lp.ap")
    public boolean field3081 = true;

    @ObfuscatedName("lp.af")
    public int field3082 = 0;

    @ObfuscatedName("lp.ar")
    public int field3093 = 512;

    @ObfuscatedName("lp.ag")
    public class292 field3095;

    @ObfuscatedName("lp.ad")
    public int field3092;

    @ObfuscatedName("lp.ax")
    public int field3094;

    @ObfuscatedName("lp.aw")
    public int field3080;

    @ObfuscatedName("lp.az")
    public int field3086;

    @ObfuscatedName("lp.av")
    public int field3096;

    @ObfuscatedName("lp.ak")
    public int field3097;

    @ObfuscatedName("lp.ay")
    public int field3098;

    @ObfuscatedName("lp.as")
    public int field3100;

    @ObfuscatedName("lp.ab")
    public int[] field3083 = new int[1024];

    @ObfuscatedName("lp.am()V")
    public void method5291() {
        this.field3092 = this.field3080 / 2;
        this.field3094 = this.field3086 / 2;
        this.field3096 = -this.field3092;
        this.field3097 = this.field3080 - this.field3092;
        this.field3098 = -this.field3094;
        this.field3100 = this.field3086 - this.field3094;
    }

    @ObfuscatedName("lp.ap(IIII)V")
    public void method5292(int arg0, int arg1, int arg2, int arg3) {
        this.field3092 = arg0 - arg1;
        this.field3094 = arg2 - arg3;
        this.field3096 = -this.field3092;
        this.field3097 = this.field3080 - this.field3092;
        this.field3098 = -this.field3094;
        this.field3100 = this.field3086 - this.field3094;
    }

    @ObfuscatedName("lp.af(III)V")
    public void method5300(int arg0, int arg1, int arg2) {
        this.field3099 = arg0 < 0 || arg0 > this.field3080 || arg1 < 0 || arg1 > this.field3080 || arg2 < 0 || arg2 > this.field3080;
    }
}
