package deob;

@ObfuscatedName("ky")
public class class261 {

    @ObfuscatedName("ky.ap")
    public boolean field2933 = false;

    @ObfuscatedName("ky.aw")
    public boolean field2914 = true;

    @ObfuscatedName("ky.ak")
    public int field2917 = 0;

    @ObfuscatedName("ky.ay")
    public int field2918 = 512;

    @ObfuscatedName("ky.as")
    public class265 field2913;

    @ObfuscatedName("ky.ao")
    public int field2919;

    @ObfuscatedName("ky.af")
    public int field2928;

    @ObfuscatedName("ky.ar")
    public int field2927;

    @ObfuscatedName("ky.ab")
    public int field2923;

    @ObfuscatedName("ky.az")
    public int field2929;

    @ObfuscatedName("ky.ag")
    public int field2930;

    @ObfuscatedName("ky.ad")
    public int field2931;

    @ObfuscatedName("ky.ac")
    public int field2932;

    @ObfuscatedName("ky.av")
    public int[] field2926 = new int[1024];

    @ObfuscatedName("ky.ap()V")
    public void method5173() {
        this.field2919 = this.field2927 / 2;
        this.field2928 = this.field2923 / 2;
        this.field2929 = -this.field2919;
        this.field2930 = this.field2927 - this.field2919;
        this.field2931 = -this.field2928;
        this.field2932 = this.field2923 - this.field2928;
    }

    @ObfuscatedName("ky.aw(IIII)V")
    public void method5166(int arg0, int arg1, int arg2, int arg3) {
        this.field2919 = arg0 - arg1;
        this.field2928 = arg2 - arg3;
        this.field2929 = -this.field2919;
        this.field2930 = this.field2927 - this.field2919;
        this.field2931 = -this.field2928;
        this.field2932 = this.field2923 - this.field2928;
    }

    @ObfuscatedName("ky.ak(III)V")
    public void method5168(int arg0, int arg1, int arg2) {
        this.field2933 = arg0 < 0 || arg0 > this.field2927 || arg1 < 0 || arg1 > this.field2927 || arg2 < 0 || arg2 > this.field2927;
    }
}
