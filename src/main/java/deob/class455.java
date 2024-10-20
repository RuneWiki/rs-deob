package deob;

@ObfuscatedName("rs")
public class class455 {

    @ObfuscatedName("rs.ac")
    public long field4879 = -1L;

    @ObfuscatedName("rs.ae")
    public long field4884 = -1L;

    @ObfuscatedName("rs.ag")
    public boolean field4880 = false;

    @ObfuscatedName("rs.am")
    public long field4881 = 0L;

    @ObfuscatedName("rs.ax")
    public long field4882 = 0L;

    @ObfuscatedName("rs.aq")
    public long field4883 = 0L;

    @ObfuscatedName("rs.af")
    public int field4878 = 0;

    @ObfuscatedName("rs.at")
    public int field4885 = 0;

    @ObfuscatedName("rs.au")
    public int field4886 = 0;

    @ObfuscatedName("rs.ar")
    public int field4887 = 0;

    @ObfuscatedName("rs.ac(I)V")
    public void method7871() {
        this.field4879 = class331.method3482();
    }

    @ObfuscatedName("rs.ae(I)V")
    public void method7872() {
        if (this.field4879 != -1L) {
            this.field4882 = class331.method3482() - this.field4879;
            this.field4879 = -1L;
        }
    }

    @ObfuscatedName("rs.ag(II)V")
    public void method7870(int arg0) {
        this.field4884 = class331.method3482();
        this.field4878 = arg0;
    }

    @ObfuscatedName("rs.am(S)V")
    public void method7874() {
        if (this.field4884 != -1L) {
            this.field4881 = class331.method3482() - this.field4884;
            this.field4884 = -1L;
        }
        this.field4886++;
        this.field4880 = true;
    }

    @ObfuscatedName("rs.ax(I)V")
    public void method7875() {
        this.field4880 = false;
        this.field4885 = 0;
    }

    @ObfuscatedName("rs.aq(I)V")
    public void method7890() {
        this.method7874();
    }

    @ObfuscatedName("rs.af(Lvf;I)V")
    public void method7892(class551 arg0) {
        long var2 = this.field4882;
        long var4 = var2 / 10L;
        if (var4 < 0L) {
            var4 = 0L;
        } else if (var4 > 65535L) {
            var4 = 65535L;
        }
        arg0.method8958((int) var4);
        long var6 = this.field4881;
        long var8 = var6 / 10L;
        if (var8 < 0L) {
            var8 = 0L;
        } else if (var8 > 65535L) {
            var8 = 65535L;
        }
        arg0.method8958((int) var8);
        long var10 = this.field4883;
        long var12 = var10 / 10L;
        if (var12 < 0L) {
            var12 = 0L;
        } else if (var12 > 65535L) {
            var12 = 65535L;
        }
        arg0.method8958((int) var12);
        arg0.method8958(this.field4878);
        arg0.method8958(this.field4885);
        arg0.method8958(this.field4886);
        arg0.method8958(this.field4887);
    }
}
