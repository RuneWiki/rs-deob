package deob;

@ObfuscatedName("os")
public class class385 {

    @ObfuscatedName("os.aj")
    public long field4442 = -1L;

    @ObfuscatedName("os.al")
    public long field4434 = -1L;

    @ObfuscatedName("os.ac")
    public boolean field4435 = false;

    @ObfuscatedName("os.ab")
    public long field4437 = 0L;

    @ObfuscatedName("os.an")
    public long field4436 = 0L;

    @ObfuscatedName("os.ao")
    public long field4433 = 0L;

    @ObfuscatedName("os.av")
    public int field4439 = 0;

    @ObfuscatedName("os.aq")
    public int field4440 = 0;

    @ObfuscatedName("os.ap")
    public int field4438 = 0;

    @ObfuscatedName("os.ar")
    public int field4441 = 0;

    @ObfuscatedName("os.aj(I)V")
    public void method6735() {
        this.field4442 = class290.method4466();
    }

    @ObfuscatedName("os.al(B)V")
    public void method6722() {
        if (this.field4442 != -1L) {
            this.field4436 = class290.method4466() - this.field4442;
            this.field4442 = -1L;
        }
    }

    @ObfuscatedName("os.ac(II)V")
    public void method6732(int arg0) {
        this.field4434 = class290.method4466();
        this.field4439 = arg0;
    }

    @ObfuscatedName("os.ab(I)V")
    public void method6734() {
        if (this.field4434 != -1L) {
            this.field4437 = class290.method4466() - this.field4434;
            this.field4434 = -1L;
        }
        this.field4438++;
        this.field4435 = true;
    }

    @ObfuscatedName("os.an(I)V")
    public void method6723() {
        this.field4435 = false;
        this.field4440 = 0;
    }

    @ObfuscatedName("os.ao(B)V")
    public void method6724() {
        this.method6734();
    }

    @ObfuscatedName("os.av(Lsy;I)V")
    public void method6720(class478 arg0) {
        long var2 = this.field4436;
        long var4 = var2 / 10L;
        if (var4 < 0L) {
            var4 = 0L;
        } else if (var4 > 65535L) {
            var4 = 65535L;
        }
        arg0.method7887((int) var4);
        long var6 = this.field4437;
        long var8 = var6 / 10L;
        if (var8 < 0L) {
            var8 = 0L;
        } else if (var8 > 65535L) {
            var8 = 65535L;
        }
        arg0.method7887((int) var8);
        long var10 = this.field4433;
        long var12 = var10 / 10L;
        if (var12 < 0L) {
            var12 = 0L;
        } else if (var12 > 65535L) {
            var12 = 65535L;
        }
        arg0.method7887((int) var12);
        arg0.method7887(this.field4439);
        arg0.method7887(this.field4440);
        arg0.method7887(this.field4438);
        arg0.method7887(this.field4441);
    }
}
