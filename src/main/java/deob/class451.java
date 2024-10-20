package deob;

@ObfuscatedName("rd")
public class class451 {

    @ObfuscatedName("rd.ak")
    public long field4835 = -1L;

    @ObfuscatedName("rd.al")
    public long field4834 = -1L;

    @ObfuscatedName("rd.aj")
    public boolean field4836 = false;

    @ObfuscatedName("rd.az")
    public long field4837 = 0L;

    @ObfuscatedName("rd.af")
    public long field4843 = 0L;

    @ObfuscatedName("rd.aa")
    public long field4839 = 0L;

    @ObfuscatedName("rd.at")
    public int field4840 = 0;

    @ObfuscatedName("rd.ab")
    public int field4841 = 0;

    @ObfuscatedName("rd.ac")
    public int field4842 = 0;

    @ObfuscatedName("rd.ao")
    public int field4838 = 0;

    @ObfuscatedName("rd.ak(S)V")
    public void method7674() {
        this.field4835 = class326.method2895();
    }

    @ObfuscatedName("rd.al(I)V")
    public void method7673() {
        if (this.field4835 != -1L) {
            this.field4843 = class326.method2895() - this.field4835;
            this.field4835 = -1L;
        }
    }

    @ObfuscatedName("rd.aj(IB)V")
    public void method7675(int arg0) {
        this.field4834 = class326.method2895();
        this.field4840 = arg0;
    }

    @ObfuscatedName("rd.az(S)V")
    public void method7677() {
        if (this.field4834 != -1L) {
            this.field4837 = class326.method2895() - this.field4834;
            this.field4834 = -1L;
        }
        this.field4842++;
        this.field4836 = true;
    }

    @ObfuscatedName("rd.af(I)V")
    public void method7678() {
        this.field4836 = false;
        this.field4841 = 0;
    }

    @ObfuscatedName("rd.aa(I)V")
    public void method7679() {
        this.method7677();
    }

    @ObfuscatedName("rd.at(Lua;I)V")
    public void method7685(class546 arg0) {
        long var2 = this.field4843;
        long var4 = var2 / 10L;
        if (var4 < 0L) {
            var4 = 0L;
        } else if (var4 > 65535L) {
            var4 = 65535L;
        }
        arg0.method8780((int) var4);
        long var6 = this.field4837;
        long var8 = var6 / 10L;
        if (var8 < 0L) {
            var8 = 0L;
        } else if (var8 > 65535L) {
            var8 = 65535L;
        }
        arg0.method8780((int) var8);
        long var10 = this.field4839;
        long var12 = var10 / 10L;
        if (var12 < 0L) {
            var12 = 0L;
        } else if (var12 > 65535L) {
            var12 = 65535L;
        }
        arg0.method8780((int) var12);
        arg0.method8780(this.field4840);
        arg0.method8780(this.field4841);
        arg0.method8780(this.field4842);
        arg0.method8780(this.field4838);
    }
}
