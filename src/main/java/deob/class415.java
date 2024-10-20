package deob;

@ObfuscatedName("pm")
public class class415 {

    @ObfuscatedName("pm.aw")
    public long field4565 = -1L;

    @ObfuscatedName("pm.ay")
    public long field4568 = -1L;

    @ObfuscatedName("pm.ar")
    public boolean field4563 = false;

    @ObfuscatedName("pm.am")
    public long field4562 = 0L;

    @ObfuscatedName("pm.as")
    public long field4566 = 0L;

    @ObfuscatedName("pm.aj")
    public long field4567 = 0L;

    @ObfuscatedName("pm.ag")
    public int field4570 = 0;

    @ObfuscatedName("pm.az")
    public int field4569 = 0;

    @ObfuscatedName("pm.av")
    public int field4564 = 0;

    @ObfuscatedName("pm.ap")
    public int field4571 = 0;

    @ObfuscatedName("pm.aw(S)V")
    public void method7033() {
        this.field4565 = class303.method2705();
    }

    @ObfuscatedName("pm.ay(I)V")
    public void method7020() {
        if (this.field4565 != -1L) {
            this.field4566 = class303.method2705() - this.field4565;
            this.field4565 = -1L;
        }
    }

    @ObfuscatedName("pm.ar(II)V")
    public void method7021(int arg0) {
        this.field4568 = class303.method2705();
        this.field4570 = arg0;
    }

    @ObfuscatedName("pm.am(I)V")
    public void method7022() {
        if (this.field4568 != -1L) {
            this.field4562 = class303.method2705() - this.field4568;
            this.field4568 = -1L;
        }
        this.field4564++;
        this.field4563 = true;
    }

    @ObfuscatedName("pm.as(I)V")
    public void method7023() {
        this.field4563 = false;
        this.field4569 = 0;
    }

    @ObfuscatedName("pm.aj(I)V")
    public void method7024() {
        this.method7022();
    }

    @ObfuscatedName("pm.ag(Lty;B)V")
    public void method7025(class514 arg0) {
        Statics.method1160(arg0, this.field4566);
        Statics.method1160(arg0, this.field4562);
        Statics.method1160(arg0, this.field4567);
        arg0.method8228(this.field4570);
        arg0.method8228(this.field4569);
        arg0.method8228(this.field4564);
        arg0.method8228(this.field4571);
    }
}
