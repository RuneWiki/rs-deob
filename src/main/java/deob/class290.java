package deob;

@ObfuscatedName("le")
public class class290 {

    @ObfuscatedName("le.aq")
    public boolean field3099 = false;

    @ObfuscatedName("le.aw")
    public boolean field3086 = true;

    @ObfuscatedName("le.al")
    public int field3087 = 0;

    @ObfuscatedName("le.as")
    public int field3090 = 512;

    @ObfuscatedName("le.aa")
    public class294 field3091;

    @ObfuscatedName("le.aj")
    public int field3097;

    @ObfuscatedName("le.af")
    public int field3098;

    @ObfuscatedName("le.ax")
    public int field3085;

    @ObfuscatedName("le.an")
    public int field3089;

    @ObfuscatedName("le.ag")
    public int field3103;

    @ObfuscatedName("le.am")
    public int field3088;

    @ObfuscatedName("le.ad")
    public int field3102;

    @ObfuscatedName("le.at")
    public int field3104;

    @ObfuscatedName("le.ay")
    public int[] field3105 = new int[1024];

    @ObfuscatedName("le.aq()V")
    public void method5320() {
        this.field3097 = this.field3085 / 2;
        this.field3098 = this.field3089 / 2;
        this.field3103 = -this.field3097;
        this.field3088 = this.field3085 - this.field3097;
        this.field3102 = -this.field3098;
        this.field3104 = this.field3089 - this.field3098;
    }

    @ObfuscatedName("le.aw(IIII)V")
    public void method5319(int arg0, int arg1, int arg2, int arg3) {
        this.field3097 = arg0 - arg1;
        this.field3098 = arg2 - arg3;
        this.field3103 = -this.field3097;
        this.field3088 = this.field3085 - this.field3097;
        this.field3102 = -this.field3098;
        this.field3104 = this.field3089 - this.field3098;
    }

    @ObfuscatedName("le.al(III)V")
    public void method5321(int arg0, int arg1, int arg2) {
        this.field3099 = arg0 < 0 || arg0 > this.field3085 || arg1 < 0 || arg1 > this.field3085 || arg2 < 0 || arg2 > this.field3085;
    }
}
