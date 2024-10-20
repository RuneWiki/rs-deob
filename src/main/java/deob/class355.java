package deob;

@ObfuscatedName("mu")
public class class355 {

    @ObfuscatedName("mu.v")
    public long field4175 = -1L;

    @ObfuscatedName("mu.c")
    public long field4173 = -1L;

    @ObfuscatedName("mu.i")
    public boolean field4180 = false;

    @ObfuscatedName("mu.f")
    public long field4174 = 0L;

    @ObfuscatedName("mu.b")
    public long field4176 = 0L;

    @ObfuscatedName("mu.n")
    public long field4172 = 0L;

    @ObfuscatedName("mu.s")
    public int field4178 = 0;

    @ObfuscatedName("mu.l")
    public int field4179 = 0;

    @ObfuscatedName("mu.q")
    public int field4177 = 0;

    @ObfuscatedName("mu.o")
    public int field4181 = 0;

    @ObfuscatedName("mu.v(B)V")
    public void method5980() {
        this.field4175 = class270.method2724();
    }

    @ObfuscatedName("mu.c(I)V")
    public void method5968() {
        if (this.field4175 != -1L) {
            this.field4176 = class270.method2724() - this.field4175;
            this.field4175 = -1L;
        }
    }

    @ObfuscatedName("mu.i(II)V")
    public void method5969(int arg0) {
        this.field4173 = class270.method2724();
        this.field4178 = arg0;
    }

    @ObfuscatedName("mu.f(I)V")
    public void method5970() {
        if (this.field4173 != -1L) {
            this.field4174 = class270.method2724() - this.field4173;
            this.field4173 = -1L;
        }
        this.field4177++;
        this.field4180 = true;
    }

    @ObfuscatedName("mu.b(B)V")
    public void method5986() {
        this.field4180 = false;
        this.field4179 = 0;
    }

    @ObfuscatedName("mu.n(I)V")
    public void method5972() {
        this.method5970();
    }

    @ObfuscatedName("mu.s(Lpi;I)V")
    public void method5973(class438 arg0) {
        long var2 = this.field4176;
        long var4 = var2 / 10L;
        if (var4 < 0L) {
            var4 = 0L;
        } else if (var4 > 65535L) {
            var4 = 65535L;
        }
        arg0.method6955((int) var4);
        long var6 = this.field4174;
        long var8 = var6 / 10L;
        if (var8 < 0L) {
            var8 = 0L;
        } else if (var8 > 65535L) {
            var8 = 65535L;
        }
        arg0.method6955((int) var8);
        long var10 = this.field4172;
        long var12 = var10 / 10L;
        if (var12 < 0L) {
            var12 = 0L;
        } else if (var12 > 65535L) {
            var12 = 65535L;
        }
        arg0.method6955((int) var12);
        arg0.method6955(this.field4178);
        arg0.method6955(this.field4179);
        arg0.method6955(this.field4177);
        arg0.method6955(this.field4181);
    }
}
