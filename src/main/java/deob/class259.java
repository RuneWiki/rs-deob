package deob;

@ObfuscatedName("jb")
public class class259 {

    @ObfuscatedName("jb.ac")
    public boolean field2839 = false;

    @ObfuscatedName("jb.al")
    public boolean field2832 = true;

    @ObfuscatedName("jb.ak")
    public int field2833 = 0;

    @ObfuscatedName("jb.ah")
    public int field2831 = 512;

    @ObfuscatedName("jb.ar")
    public class263 field2837;

    @ObfuscatedName("jb.ap")
    public int field2849;

    @ObfuscatedName("jb.ay")
    public int field2844;

    @ObfuscatedName("jb.as")
    public int field2843;

    @ObfuscatedName("jb.aj")
    public int field2846;

    @ObfuscatedName("jb.an")
    public int field2847;

    @ObfuscatedName("jb.au")
    public int field2851;

    @ObfuscatedName("jb.ai")
    public int field2845;

    @ObfuscatedName("jb.ae")
    public int field2850;

    @ObfuscatedName("jb.aw")
    public int[] field2848 = new int[1024];

    @ObfuscatedName("jb.ac()V")
    public void method4722() {
        this.field2849 = this.field2843 / 2;
        this.field2844 = this.field2846 / 2;
        this.field2847 = -this.field2849;
        this.field2851 = this.field2843 - this.field2849;
        this.field2845 = -this.field2844;
        this.field2850 = this.field2846 - this.field2844;
    }

    @ObfuscatedName("jb.al(IIII)V")
    public void method4721(int arg0, int arg1, int arg2, int arg3) {
        this.field2849 = arg0 - arg1;
        this.field2844 = arg2 - arg3;
        this.field2847 = -this.field2849;
        this.field2851 = this.field2843 - this.field2849;
        this.field2845 = -this.field2844;
        this.field2850 = this.field2846 - this.field2844;
    }

    @ObfuscatedName("jb.ak(III)V")
    public void method4723(int arg0, int arg1, int arg2) {
        this.field2839 = arg0 < 0 || arg0 > this.field2843 || arg1 < 0 || arg1 > this.field2843 || arg2 < 0 || arg2 > this.field2843;
    }
}
