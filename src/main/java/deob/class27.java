package deob;

@ObfuscatedName("ad")
public class class27 implements class43 {

    @ObfuscatedName("ad.i")
    public int field389;

    @ObfuscatedName("ad.c")
    public int field371;

    @ObfuscatedName("ad.e")
    public int field373;

    @ObfuscatedName("ad.v")
    public int field391;

    @ObfuscatedName("ad.b")
    public int field370;

    @ObfuscatedName("ad.y")
    public int field375;

    @ObfuscatedName("ad.h")
    public int field376;

    @ObfuscatedName("ad.x")
    public int field377;

    @ObfuscatedName("ad.f")
    public int field378;

    @ObfuscatedName("ad.n")
    public int field382;

    @ObfuscatedName("ad.a")
    public int field380;

    @ObfuscatedName("ad.o")
    public int field381;

    @ObfuscatedName("ad.z")
    public int field372;

    @ObfuscatedName("ad.q")
    public int field383;

    @ObfuscatedName("ad.i(Lai;B)V")
    public void method165(class33 arg0) {
        if (arg0.field459 > this.field370) {
            arg0.field459 = this.field370;
        }
        if (arg0.field466 < this.field370) {
            arg0.field466 = this.field370;
        }
        if (arg0.field457 > this.field375) {
            arg0.field457 = this.field375;
        }
        if (arg0.field462 < this.field375) {
            arg0.field462 = this.field375;
        }
    }

    @ObfuscatedName("ad.c(IIII)Z")
    public boolean method166(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field389 && arg0 < this.field389 + this.field371) {
            return arg1 >= (this.field376 << 3) + (this.field373 << 6) && arg1 <= (this.field378 << 3) + (this.field373 << 6) + 7 && arg2 >= (this.field391 << 6) + (this.field377 << 3) && arg2 <= (this.field391 << 6) + (this.field382 << 3) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ad.e(III)Z")
    public boolean method167(int arg0, int arg1) {
        return arg0 >= (this.field380 << 3) + (this.field370 << 6) && arg0 <= (this.field372 << 3) + (this.field370 << 6) + 7 && arg1 >= (this.field381 << 3) + (this.field375 << 6) && arg1 <= (this.field383 << 3) + (this.field375 << 6) + 7;
    }

    @ObfuscatedName("ad.v(IIII)[I")
    public int[] method168(int arg0, int arg1, int arg2) {
        return this.method166(arg0, arg1, arg2) ? new int[] { this.field380 * 8 - this.field376 * 8 + this.field370 * 64 - this.field373 * 64 + arg1, this.field381 * 8 - this.field377 * 8 + this.field375 * 64 - this.field391 * 64 + arg2 } : null;
    }

    @ObfuscatedName("ad.b(III)Lhh;")
    public class213 method186(int arg0, int arg1) {
        if (this.method167(arg0, arg1)) {
            int var3 = this.field376 * 8 - this.field380 * 8 + this.field373 * 64 - this.field370 * 64 + arg0;
            int var4 = this.field377 * 8 - this.field381 * 8 + this.field391 * 64 - this.field375 * 64 + arg1;
            return new class213(this.field389, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("ad.y(Lfx;B)V")
    public void method174(class174 arg0) {
        this.field389 = arg0.method2870();
        this.field371 = arg0.method2870();
        this.field373 = arg0.method2872();
        this.field376 = arg0.method2870();
        this.field378 = arg0.method2870();
        this.field391 = arg0.method2872();
        this.field377 = arg0.method2870();
        this.field382 = arg0.method2870();
        this.field370 = arg0.method2872();
        this.field380 = arg0.method2870();
        this.field372 = arg0.method2870();
        this.field375 = arg0.method2872();
        this.field381 = arg0.method2870();
        this.field383 = arg0.method2870();
        this.method171();
    }

    @ObfuscatedName("ad.h(I)V")
    public void method171() {
    }
}
