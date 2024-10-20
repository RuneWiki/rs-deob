package deob;

@ObfuscatedName("jy")
public class class244 {

    @ObfuscatedName("jy.at")
    public boolean field2799 = false;

    @ObfuscatedName("jy.an")
    public boolean field2806 = true;

    @ObfuscatedName("jy.av")
    public int field2794 = 0;

    @ObfuscatedName("jy.ap")
    public int field2797 = 512;

    @ObfuscatedName("jy.ab")
    public class248 field2793;

    @ObfuscatedName("jy.aj")
    public int field2804;

    @ObfuscatedName("jy.ad")
    public int field2805;

    @ObfuscatedName("jy.ac")
    public int field2801;

    @ObfuscatedName("jy.ag")
    public int field2807;

    @ObfuscatedName("jy.ar")
    public int field2798;

    @ObfuscatedName("jy.ah")
    public int field2809;

    @ObfuscatedName("jy.az")
    public int field2810;

    @ObfuscatedName("jy.au")
    public int field2811;

    @ObfuscatedName("jy.ai")
    public int[] field2812 = new int[1024];

    @ObfuscatedName("jy.at()V")
    public void method4574() {
        this.field2804 = this.field2801 / 2;
        this.field2805 = this.field2807 / 2;
        this.field2798 = -this.field2804;
        this.field2809 = this.field2801 - this.field2804;
        this.field2810 = -this.field2805;
        this.field2811 = this.field2807 - this.field2805;
    }

    @ObfuscatedName("jy.an(IIII)V")
    public void method4575(int arg0, int arg1, int arg2, int arg3) {
        this.field2804 = arg0 - arg1;
        this.field2805 = arg2 - arg3;
        this.field2798 = -this.field2804;
        this.field2809 = this.field2801 - this.field2804;
        this.field2810 = -this.field2805;
        this.field2811 = this.field2807 - this.field2805;
    }

    @ObfuscatedName("jy.av(III)V")
    public void method4573(int arg0, int arg1, int arg2) {
        this.field2799 = arg0 < 0 || arg0 > this.field2801 || arg1 < 0 || arg1 > this.field2801 || arg2 < 0 || arg2 > this.field2801;
    }
}
