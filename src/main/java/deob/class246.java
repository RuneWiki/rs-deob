package deob;

@ObfuscatedName("jq")
public class class246 {

    @ObfuscatedName("jq.aw")
    public boolean field2794 = false;

    @ObfuscatedName("jq.ay")
    public boolean field2793 = true;

    @ObfuscatedName("jq.ar")
    public int field2784 = 0;

    @ObfuscatedName("jq.aj")
    public int field2782 = 512;

    @ObfuscatedName("jq.ag")
    public class250 field2783;

    @ObfuscatedName("jq.ah")
    public int field2801;

    @ObfuscatedName("jq.ax")
    public int field2795;

    @ObfuscatedName("jq.aa")
    public int field2796;

    @ObfuscatedName("jq.au")
    public int field2797;

    @ObfuscatedName("jq.ae")
    public int field2798;

    @ObfuscatedName("jq.ab")
    public int field2787;

    @ObfuscatedName("jq.ad")
    public int field2800;

    @ObfuscatedName("jq.ao")
    public int field2799;

    @ObfuscatedName("jq.ac")
    public int[] field2802 = new int[1024];

    @ObfuscatedName("jq.aw()V")
    public void method4598() {
        this.field2801 = this.field2796 / 2;
        this.field2795 = this.field2797 / 2;
        this.field2798 = -this.field2801;
        this.field2787 = this.field2796 - this.field2801;
        this.field2800 = -this.field2795;
        this.field2799 = this.field2797 - this.field2795;
    }

    @ObfuscatedName("jq.ay(IIII)V")
    public void method4595(int arg0, int arg1, int arg2, int arg3) {
        this.field2801 = arg0 - arg1;
        this.field2795 = arg2 - arg3;
        this.field2798 = -this.field2801;
        this.field2787 = this.field2796 - this.field2801;
        this.field2800 = -this.field2795;
        this.field2799 = this.field2797 - this.field2795;
    }

    @ObfuscatedName("jq.ar(III)V")
    public void method4596(int arg0, int arg1, int arg2) {
        this.field2794 = arg0 < 0 || arg0 > this.field2796 || arg1 < 0 || arg1 > this.field2796 || arg2 < 0 || arg2 > this.field2796;
    }
}
