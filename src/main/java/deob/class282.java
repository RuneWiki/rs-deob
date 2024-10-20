package deob;

@ObfuscatedName("jz")
public class class282 {

    @ObfuscatedName("jz.z")
    public long field3598 = -1L;

    @ObfuscatedName("jz.k")
    public long field3603 = -1L;

    @ObfuscatedName("jz.s")
    public boolean field3599 = false;

    @ObfuscatedName("jz.t")
    public long field3601 = 0L;

    @ObfuscatedName("jz.i")
    public long field3602 = 0L;

    @ObfuscatedName("jz.o")
    public long field3607 = 0L;

    @ObfuscatedName("jz.x")
    public int field3604 = 0;

    @ObfuscatedName("jz.w")
    public int field3605 = 0;

    @ObfuscatedName("jz.g")
    public int field3606 = 0;

    @ObfuscatedName("jz.m")
    public int field3600 = 0;

    @ObfuscatedName("jz.z(I)V")
    public void method4716() {
        this.field3598 = class307.method2184();
    }

    @ObfuscatedName("jz.k(I)V")
    public void method4708() {
        if (this.field3598 != -1L) {
            this.field3602 = class307.method2184() - this.field3598;
            this.field3598 = -1L;
        }
    }

    @ObfuscatedName("jz.s(II)V")
    public void method4720(int arg0) {
        this.field3603 = class307.method2184();
        this.field3604 = arg0;
    }

    @ObfuscatedName("jz.t(I)V")
    public void method4710() {
        if (this.field3603 != -1L) {
            this.field3601 = class307.method2184() - this.field3603;
            this.field3603 = -1L;
        }
        this.field3606++;
        this.field3599 = true;
    }

    @ObfuscatedName("jz.i(I)V")
    public void method4711() {
        this.field3599 = false;
        this.field3605 = 0;
    }

    @ObfuscatedName("jz.o(I)V")
    public void method4709() {
        this.method4710();
    }

    @ObfuscatedName("jz.x(Lkf;I)V")
    public void method4718(class310 arg0) {
        long var2 = this.field3602;
        long var4 = var2 / 10L;
        if (var4 < 0L) {
            var4 = 0L;
        } else if (var4 > 65535L) {
            var4 = 65535L;
        }
        arg0.method5178((int) var4);
        long var6 = this.field3601;
        long var8 = var6 / 10L;
        if (var8 < 0L) {
            var8 = 0L;
        } else if (var8 > 65535L) {
            var8 = 65535L;
        }
        arg0.method5178((int) var8);
        long var10 = this.field3607;
        long var12 = var10 / 10L;
        if (var12 < 0L) {
            var12 = 0L;
        } else if (var12 > 65535L) {
            var12 = 65535L;
        }
        arg0.method5178((int) var12);
        arg0.method5178(this.field3604);
        arg0.method5178(this.field3605);
        arg0.method5178(this.field3606);
        arg0.method5178(this.field3600);
    }
}
