package deob;

@ObfuscatedName("bk")
public class class44 {

    @ObfuscatedName("bk.az")
    public int field297 = 2;

    @ObfuscatedName("bk.ah")
    public int[] field293 = new int[2];

    @ObfuscatedName("bk.af")
    public int[] field296 = new int[2];

    @ObfuscatedName("bk.at")
    public int field295;

    @ObfuscatedName("bk.an")
    public int field292;

    @ObfuscatedName("bk.ao")
    public int field302;

    @ObfuscatedName("bk.ab")
    public int field298;

    @ObfuscatedName("bk.aw")
    public int field299;

    @ObfuscatedName("bk.ad")
    public int field300;

    @ObfuscatedName("bk.al")
    public int field301;

    @ObfuscatedName("bk.as")
    public int field294;

    public class44() {
        this.field293[0] = 0;
        this.field293[1] = 65535;
        this.field296[0] = 0;
        this.field296[1] = 65535;
    }

    @ObfuscatedName("bk.az(Lur;)V")
    public final void method783(class535 arg0) {
        this.field302 = arg0.method8462();
        this.field295 = arg0.method8682();
        this.field292 = arg0.method8682();
        this.method786(arg0);
    }

    @ObfuscatedName("bk.ah(Lur;)V")
    public final void method786(class535 arg0) {
        this.field297 = arg0.method8462();
        this.field293 = new int[this.field297];
        this.field296 = new int[this.field297];
        for (int var2 = 0; var2 < this.field297; var2++) {
            this.field293[var2] = arg0.method8670();
            this.field296[var2] = arg0.method8670();
        }
    }

    @ObfuscatedName("bk.af()V")
    public final void method777() {
        this.field298 = 0;
        this.field299 = 0;
        this.field300 = 0;
        this.field301 = 0;
        this.field294 = 0;
    }

    @ObfuscatedName("bk.at(I)I")
    public final int method775(int arg0) {
        if (this.field294 >= this.field298) {
            this.field301 = this.field296[this.field299++] << 15;
            if (this.field299 >= this.field297) {
                this.field299 = this.field297 - 1;
            }
            this.field298 = (int) ((double) this.field293[this.field299] / 65536.0D * (double) arg0);
            if (this.field298 > this.field294) {
                this.field300 = ((this.field296[this.field299] << 15) - this.field301) / (this.field298 - this.field294);
            }
        }
        this.field301 += this.field300;
        this.field294++;
        return this.field301 - this.field300 >> 15;
    }
}
