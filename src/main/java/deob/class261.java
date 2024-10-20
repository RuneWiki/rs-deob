package deob;

@ObfuscatedName("kr")
public class class261 {

    @ObfuscatedName("kr.ac")
    public boolean field2900 = false;

    @ObfuscatedName("kr.ae")
    public boolean field2909 = true;

    @ObfuscatedName("kr.ag")
    public int field2908 = 0;

    @ObfuscatedName("kr.aq")
    public int field2919 = 512;

    @ObfuscatedName("kr.af")
    public class265 field2905;

    @ObfuscatedName("kr.ah")
    public int field2911;

    @ObfuscatedName("kr.ap")
    public int field2899;

    @ObfuscatedName("kr.ab")
    public int field2913;

    @ObfuscatedName("kr.az")
    public int field2904;

    @ObfuscatedName("kr.aa")
    public int field2915;

    @ObfuscatedName("kr.ai")
    public int field2916;

    @ObfuscatedName("kr.ao")
    public int field2917;

    @ObfuscatedName("kr.as")
    public int field2914;

    @ObfuscatedName("kr.ay")
    public int[] field2901 = new int[1024];

    @ObfuscatedName("kr.ac()V")
    public void method5005() {
        this.field2911 = this.field2913 / 2;
        this.field2899 = this.field2904 / 2;
        this.field2915 = -this.field2911;
        this.field2916 = this.field2913 - this.field2911;
        this.field2917 = -this.field2899;
        this.field2914 = this.field2904 - this.field2899;
    }

    @ObfuscatedName("kr.ae(IIII)V")
    public void method5004(int arg0, int arg1, int arg2, int arg3) {
        this.field2911 = arg0 - arg1;
        this.field2899 = arg2 - arg3;
        this.field2915 = -this.field2911;
        this.field2916 = this.field2913 - this.field2911;
        this.field2917 = -this.field2899;
        this.field2914 = this.field2904 - this.field2899;
    }

    @ObfuscatedName("kr.ag(III)V")
    public void method5009(int arg0, int arg1, int arg2) {
        this.field2900 = arg0 < 0 || arg0 > this.field2913 || arg1 < 0 || arg1 > this.field2913 || arg2 < 0 || arg2 > this.field2913;
    }
}
