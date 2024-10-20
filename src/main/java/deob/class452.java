package deob;

@ObfuscatedName("ri")
public class class452 {

    @ObfuscatedName("ri.aq")
    public long field4855 = -1L;

    @ObfuscatedName("ri.ad")
    public long field4853 = -1L;

    @ObfuscatedName("ri.ag")
    public boolean field4860 = false;

    @ObfuscatedName("ri.ak")
    public long field4858 = 0L;

    @ObfuscatedName("ri.ap")
    public long field4856 = 0L;

    @ObfuscatedName("ri.an")
    public long field4857 = 0L;

    @ObfuscatedName("ri.aj")
    public int field4854 = 0;

    @ObfuscatedName("ri.av")
    public int field4859 = 0;

    @ObfuscatedName("ri.ab")
    public int field4852 = 0;

    @ObfuscatedName("ri.ai")
    public int field4861 = 0;

    @ObfuscatedName("ri.aq(I)V")
    public void method7638() {
        this.field4855 = class327.method4500();
    }

    @ObfuscatedName("ri.ad(I)V")
    public void method7648() {
        if (this.field4855 != -1L) {
            this.field4856 = class327.method4500() - this.field4855;
            this.field4855 = -1L;
        }
    }

    @ObfuscatedName("ri.ag(II)V")
    public void method7644(int arg0) {
        this.field4853 = class327.method4500();
        this.field4854 = arg0;
    }

    @ObfuscatedName("ri.ak(I)V")
    public void method7641() {
        if (this.field4853 != -1L) {
            this.field4858 = class327.method4500() - this.field4853;
            this.field4853 = -1L;
        }
        this.field4852++;
        this.field4860 = true;
    }

    @ObfuscatedName("ri.ap(I)V")
    public void method7642() {
        this.field4860 = false;
        this.field4859 = 0;
    }

    @ObfuscatedName("ri.an(B)V")
    public void method7643() {
        this.method7641();
    }

    @ObfuscatedName("ri.aj(Lvp;B)V")
    public void method7646(class547 arg0) {
        method7358(arg0, this.field4856);
        method7358(arg0, this.field4858);
        method7358(arg0, this.field4857);
        arg0.method8712(this.field4854);
        arg0.method8712(this.field4859);
        arg0.method8712(this.field4852);
        arg0.method8712(this.field4861);
    }

    @ObfuscatedName("ql.av(Lvp;J)V")
    public static void method7358(class547 arg0, long arg1) {
        long var3 = arg1 / 10L;
        if (var3 < 0L) {
            var3 = 0L;
        } else if (var3 > 65535L) {
            var3 = 65535L;
        }
        arg0.method8712((int) var3);
    }
}
