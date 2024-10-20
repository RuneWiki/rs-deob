package deob;

@ObfuscatedName("kv")
public class class312 {

    @ObfuscatedName("kv.s")
    public long field3786 = -1L;

    @ObfuscatedName("kv.t")
    public long field3781 = -1L;

    @ObfuscatedName("kv.v")
    public boolean field3782 = false;

    @ObfuscatedName("kv.j")
    public long field3783 = 0L;

    @ObfuscatedName("kv.l")
    public long field3785 = 0L;

    @ObfuscatedName("kv.n")
    public long field3789 = 0L;

    @ObfuscatedName("kv.w")
    public int field3787 = 0;

    @ObfuscatedName("kv.f")
    public int field3780 = 0;

    @ObfuscatedName("kv.o")
    public int field3788 = 0;

    @ObfuscatedName("kv.x")
    public int field3784 = 0;

    @ObfuscatedName("kv.s(I)V")
    public void method5088() {
        this.field3786 = class382.method2013();
    }

    @ObfuscatedName("kv.t(I)V")
    public void method5089() {
        if (this.field3786 != -1L) {
            this.field3785 = class382.method2013() - this.field3786;
            this.field3786 = -1L;
        }
    }

    @ObfuscatedName("kv.v(II)V")
    public void method5093(int arg0) {
        this.field3781 = class382.method2013();
        this.field3787 = arg0;
    }

    @ObfuscatedName("kv.j(I)V")
    public void method5108() {
        if (this.field3781 != -1L) {
            this.field3783 = class382.method2013() - this.field3781;
            this.field3781 = -1L;
        }
        this.field3788++;
        this.field3782 = true;
    }

    @ObfuscatedName("kv.l(I)V")
    public void method5092() {
        this.field3782 = false;
        this.field3780 = 0;
    }

    @ObfuscatedName("kv.n(I)V")
    public void method5097() {
        this.method5108();
    }

    @ObfuscatedName("kv.w(Lnv;I)V")
    public void method5098(class385 arg0) {
        method4373(arg0, this.field3785);
        method4373(arg0, this.field3783);
        method4373(arg0, this.field3789);
        arg0.method6132(this.field3787);
        arg0.method6132(this.field3780);
        arg0.method6132(this.field3788);
        arg0.method6132(this.field3784);
    }

    @ObfuscatedName("jv.f(Lnv;J)V")
    public static void method4373(class385 arg0, long arg1) {
        long var3 = arg1 / 10L;
        if (var3 < 0L) {
            var3 = 0L;
        } else if (var3 > 65535L) {
            var3 = 65535L;
        }
        arg0.method6132((int) var3);
    }
}
