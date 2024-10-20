package deob;

@ObfuscatedName("rd")
public class class453 {

    @ObfuscatedName("rd.ab")
    public long field4847 = -1L;

    @ObfuscatedName("rd.ay")
    public long field4846 = -1L;

    @ObfuscatedName("rd.an")
    public boolean field4840 = false;

    @ObfuscatedName("rd.au")
    public long field4839 = 0L;

    @ObfuscatedName("rd.ax")
    public long field4842 = 0L;

    @ObfuscatedName("rd.ao")
    public long field4843 = 0L;

    @ObfuscatedName("rd.am")
    public int field4838 = 0;

    @ObfuscatedName("rd.ac")
    public int field4845 = 0;

    @ObfuscatedName("rd.ae")
    public int field4841 = 0;

    @ObfuscatedName("rd.ad")
    public int field4844 = 0;

    @ObfuscatedName("rd.ab(B)V")
    public void method7756() {
        this.field4847 = class329.method5009();
    }

    @ObfuscatedName("rd.ay(I)V")
    public void method7765() {
        if (this.field4847 != -1L) {
            this.field4842 = class329.method5009() - this.field4847;
            this.field4847 = -1L;
        }
    }

    @ObfuscatedName("rd.an(II)V")
    public void method7763(int arg0) {
        this.field4846 = class329.method5009();
        this.field4838 = arg0;
    }

    @ObfuscatedName("rd.au(I)V")
    public void method7742() {
        if (this.field4846 != -1L) {
            this.field4839 = class329.method5009() - this.field4846;
            this.field4846 = -1L;
        }
        this.field4841++;
        this.field4840 = true;
    }

    @ObfuscatedName("rd.ax(I)V")
    public void method7743() {
        this.field4840 = false;
        this.field4845 = 0;
    }

    @ObfuscatedName("rd.ao(I)V")
    public void method7762() {
        this.method7742();
    }

    @ObfuscatedName("rd.am(Lvg;I)V")
    public void method7745(class549 arg0) {
        method5915(arg0, this.field4842);
        method5915(arg0, this.field4839);
        method5915(arg0, this.field4843);
        arg0.method8782(this.field4838);
        arg0.method8782(this.field4845);
        arg0.method8782(this.field4841);
        arg0.method8782(this.field4844);
    }

    @ObfuscatedName("nm.ac(Lvg;J)V")
    public static void method5915(class549 arg0, long arg1) {
        long var3 = arg1 / 10L;
        if (var3 < 0L) {
            var3 = 0L;
        } else if (var3 > 65535L) {
            var3 = 65535L;
        }
        arg0.method8782((int) var3);
    }
}
