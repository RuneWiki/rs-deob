package deob;

@ObfuscatedName("py")
public class class414 {

    @ObfuscatedName("py.au")
    public long field4565 = -1L;

    @ObfuscatedName("py.ae")
    public long field4564 = -1L;

    @ObfuscatedName("py.ao")
    public boolean field4569 = false;

    @ObfuscatedName("py.at")
    public long field4566 = 0L;

    @ObfuscatedName("py.ac")
    public long field4567 = 0L;

    @ObfuscatedName("py.ai")
    public long field4573 = 0L;

    @ObfuscatedName("py.az")
    public int field4568 = 0;

    @ObfuscatedName("py.ap")
    public int field4570 = 0;

    @ObfuscatedName("py.aa")
    public int field4571 = 0;

    @ObfuscatedName("py.af")
    public int field4572 = 0;

    @ObfuscatedName("py.au(S)V")
    public void method7062() {
        this.field4565 = class302.method655();
    }

    @ObfuscatedName("py.ae(I)V")
    public void method7081() {
        if (this.field4565 != -1L) {
            this.field4567 = class302.method655() - this.field4565;
            this.field4565 = -1L;
        }
    }

    @ObfuscatedName("py.ao(II)V")
    public void method7064(int arg0) {
        this.field4564 = class302.method655();
        this.field4568 = arg0;
    }

    @ObfuscatedName("py.at(I)V")
    public void method7065() {
        if (this.field4564 != -1L) {
            this.field4566 = class302.method655() - this.field4564;
            this.field4564 = -1L;
        }
        this.field4571++;
        this.field4569 = true;
    }

    @ObfuscatedName("py.ac(I)V")
    public void method7066() {
        this.field4569 = false;
        this.field4570 = 0;
    }

    @ObfuscatedName("py.ai(I)V")
    public void method7061() {
        this.method7065();
    }

    @ObfuscatedName("py.az(Ltm;I)V")
    public void method7079(class515 arg0) {
        method2359(arg0, this.field4567);
        method2359(arg0, this.field4566);
        method2359(arg0, this.field4573);
        arg0.method8345(this.field4568);
        arg0.method8345(this.field4570);
        arg0.method8345(this.field4571);
        arg0.method8345(this.field4572);
    }

    @ObfuscatedName("dp.ap(Ltm;J)V")
    public static void method2359(class515 arg0, long arg1) {
        long var3 = arg1 / 10L;
        if (var3 < 0L) {
            var3 = 0L;
        } else if (var3 > 65535L) {
            var3 = 65535L;
        }
        arg0.method8345((int) var3);
    }
}
