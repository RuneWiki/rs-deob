package deob;

@ObfuscatedName("lo")
public class class299 {

    @ObfuscatedName("lo.aq")
    public boolean field3193 = false;

    @ObfuscatedName("lo.ad")
    public boolean field3186 = true;

    @ObfuscatedName("lo.ag")
    public int field3187 = 0;

    @ObfuscatedName("lo.an")
    public int field3185 = 512;

    @ObfuscatedName("lo.aj")
    public class303 field3195;

    @ObfuscatedName("lo.ah")
    public int field3197;

    @ObfuscatedName("lo.az")
    public int field3198;

    @ObfuscatedName("lo.ax")
    public int field3199;

    @ObfuscatedName("lo.ac")
    public int field3200;

    @ObfuscatedName("lo.al")
    public int field3189;

    @ObfuscatedName("lo.ay")
    public int field3202;

    @ObfuscatedName("lo.ao")
    public int field3190;

    @ObfuscatedName("lo.aa")
    public int field3191;

    @ObfuscatedName("lo.as")
    public int[] field3205 = new int[1024];

    @ObfuscatedName("lo.aq()V")
    public void method5407() {
        this.field3197 = this.field3199 / 2;
        this.field3198 = this.field3200 / 2;
        this.field3189 = -this.field3197;
        this.field3202 = this.field3199 - this.field3197;
        this.field3190 = -this.field3198;
        this.field3191 = this.field3200 - this.field3198;
    }

    @ObfuscatedName("lo.ad(IIII)V")
    public void method5408(int arg0, int arg1, int arg2, int arg3) {
        this.field3197 = arg0 - arg1;
        this.field3198 = arg2 - arg3;
        this.field3189 = -this.field3197;
        this.field3202 = this.field3199 - this.field3197;
        this.field3190 = -this.field3198;
        this.field3191 = this.field3200 - this.field3198;
    }

    @ObfuscatedName("lo.ag(III)V")
    public void method5409(int arg0, int arg1, int arg2) {
        this.field3193 = arg0 < 0 || arg0 > this.field3199 || arg1 < 0 || arg1 > this.field3199 || arg2 < 0 || arg2 > this.field3199;
    }
}
