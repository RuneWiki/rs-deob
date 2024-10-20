package deob;

@ObfuscatedName("ms")
public class class343 {

    @ObfuscatedName("ms.c")
    public long field4092 = -1L;

    @ObfuscatedName("ms.l")
    public long field4087 = -1L;

    @ObfuscatedName("ms.s")
    public boolean field4088 = false;

    @ObfuscatedName("ms.e")
    public long field4089 = 0L;

    @ObfuscatedName("ms.r")
    public long field4090 = 0L;

    @ObfuscatedName("ms.o")
    public long field4086 = 0L;

    @ObfuscatedName("ms.i")
    public int field4091 = 0;

    @ObfuscatedName("ms.w")
    public int field4098 = 0;

    @ObfuscatedName("ms.v")
    public int field4094 = 0;

    @ObfuscatedName("ms.a")
    public int field4095 = 0;

    @ObfuscatedName("ms.c(I)V")
    public void method5654() {
        this.field4092 = class262.method4787();
    }

    @ObfuscatedName("ms.l(I)V")
    public void method5667() {
        if (this.field4092 != -1L) {
            this.field4090 = class262.method4787() - this.field4092;
            this.field4092 = -1L;
        }
    }

    @ObfuscatedName("ms.s(II)V")
    public void method5656(int arg0) {
        this.field4087 = class262.method4787();
        this.field4091 = arg0;
    }

    @ObfuscatedName("ms.e(B)V")
    public void method5664() {
        if (this.field4087 != -1L) {
            this.field4089 = class262.method4787() - this.field4087;
            this.field4087 = -1L;
        }
        this.field4094++;
        this.field4088 = true;
    }

    @ObfuscatedName("ms.r(I)V")
    public void method5658() {
        this.field4088 = false;
        this.field4098 = 0;
    }

    @ObfuscatedName("ms.o(I)V")
    public void method5659() {
        this.method5664();
    }

    @ObfuscatedName("ms.i(Lpi;B)V")
    public void method5660(class421 arg0) {
        method5027(arg0, this.field4090);
        method5027(arg0, this.field4089);
        method5027(arg0, this.field4086);
        arg0.method6757(this.field4091);
        arg0.method6757(this.field4098);
        arg0.method6757(this.field4094);
        arg0.method6757(this.field4095);
    }

    @ObfuscatedName("ki.w(Lpi;J)V")
    public static void method5027(class421 arg0, long arg1) {
        long var3 = arg1 / 10L;
        if (var3 < 0L) {
            var3 = 0L;
        } else if (var3 > 65535L) {
            var3 = 65535L;
        }
        arg0.method6757((int) var3);
    }
}
