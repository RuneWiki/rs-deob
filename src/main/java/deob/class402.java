package deob;

@ObfuscatedName("px")
public class class402 {

    @ObfuscatedName("px.at")
    public long field4507 = -1L;

    @ObfuscatedName("px.an")
    public long field4505 = -1L;

    @ObfuscatedName("px.av")
    public boolean field4500 = false;

    @ObfuscatedName("px.as")
    public long field4501 = 0L;

    @ObfuscatedName("px.ax")
    public long field4502 = 0L;

    @ObfuscatedName("px.ap")
    public long field4503 = 0L;

    @ObfuscatedName("px.ab")
    public int field4498 = 0;

    @ObfuscatedName("px.ak")
    public int field4508 = 0;

    @ObfuscatedName("px.ae")
    public int field4506 = 0;

    @ObfuscatedName("px.af")
    public int field4499 = 0;

    @ObfuscatedName("px.at(I)V")
    public void method6957() {
        this.field4507 = class301.method4630();
    }

    @ObfuscatedName("px.an(I)V")
    public void method6953() {
        if (this.field4507 != -1L) {
            this.field4502 = class301.method4630() - this.field4507;
            this.field4507 = -1L;
        }
    }

    @ObfuscatedName("px.av(II)V")
    public void method6954(int arg0) {
        this.field4505 = class301.method4630();
        this.field4498 = arg0;
    }

    @ObfuscatedName("px.as(I)V")
    public void method6955() {
        if (this.field4505 != -1L) {
            this.field4501 = class301.method4630() - this.field4505;
            this.field4505 = -1L;
        }
        this.field4506++;
        this.field4500 = true;
    }

    @ObfuscatedName("px.ax(I)V")
    public void method6962() {
        this.field4500 = false;
        this.field4508 = 0;
    }

    @ObfuscatedName("px.ap(I)V")
    public void method6970() {
        this.method6955();
    }

    @ObfuscatedName("px.ab(Ltz;I)V")
    public void method6951(class501 arg0) {
        method5085(arg0, this.field4502);
        method5085(arg0, this.field4501);
        method5085(arg0, this.field4503);
        arg0.method8114(this.field4498);
        arg0.method8114(this.field4508);
        arg0.method8114(this.field4506);
        arg0.method8114(this.field4499);
    }

    @ObfuscatedName("ke.ak(Ltz;J)V")
    public static void method5085(class501 arg0, long arg1) {
        long var3 = arg1 / 10L;
        if (var3 < 0L) {
            var3 = 0L;
        } else if (var3 > 65535L) {
            var3 = 65535L;
        }
        arg0.method8114((int) var3);
    }
}
