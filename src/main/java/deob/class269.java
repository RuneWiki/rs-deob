package deob;

@ObfuscatedName("kp")
public class class269 {

    @ObfuscatedName("kp.ak")
    public boolean field2974 = false;

    @ObfuscatedName("kp.al")
    public boolean field2979 = true;

    @ObfuscatedName("kp.aj")
    public int field2984 = 0;

    @ObfuscatedName("kp.aa")
    public int field2977 = 512;

    @ObfuscatedName("kp.at")
    public class273 field2978;

    @ObfuscatedName("kp.aq")
    public int field2983;

    @ObfuscatedName("kp.ap")
    public int field2985;

    @ObfuscatedName("kp.ae")
    public int field2986;

    @ObfuscatedName("kp.ax")
    public int field2987;

    @ObfuscatedName("kp.ay")
    public int field2972;

    @ObfuscatedName("kp.au")
    public int field2989;

    @ObfuscatedName("kp.as")
    public int field2990;

    @ObfuscatedName("kp.aw")
    public int field2991;

    @ObfuscatedName("kp.ad")
    public int[] field2992 = new int[1024];

    @ObfuscatedName("kp.ak()V")
    public void method4978() {
        this.field2983 = this.field2986 / 2;
        this.field2985 = this.field2987 / 2;
        this.field2972 = -this.field2983;
        this.field2989 = this.field2986 - this.field2983;
        this.field2990 = -this.field2985;
        this.field2991 = this.field2987 - this.field2985;
    }

    @ObfuscatedName("kp.al(IIII)V")
    public void method4977(int arg0, int arg1, int arg2, int arg3) {
        this.field2983 = arg0 - arg1;
        this.field2985 = arg2 - arg3;
        this.field2972 = -this.field2983;
        this.field2989 = this.field2986 - this.field2983;
        this.field2990 = -this.field2985;
        this.field2991 = this.field2987 - this.field2985;
    }

    @ObfuscatedName("kp.aj(III)V")
    public void method4980(int arg0, int arg1, int arg2) {
        this.field2974 = arg0 < 0 || arg0 > this.field2986 || arg1 < 0 || arg1 > this.field2986 || arg2 < 0 || arg2 > this.field2986;
    }
}
