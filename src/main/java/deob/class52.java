package deob;

@ObfuscatedName("dr")
public class class52 implements class45 {

    @ObfuscatedName("dr.n")
    public class81 field422;

    @ObfuscatedName("dr.o")
    public int field418;

    @ObfuscatedName("dr.j")
    public class149[] field421;

    @ObfuscatedName("dr.h")
    public double field420 = 1.0D;

    @ObfuscatedName("dr.t")
    public int field419 = 0;

    @ObfuscatedName("dr.r")
    public int field417 = 128;

    @ObfuscatedName("dr.p")
    public class13 field416 = new class13();

    @ObfuscatedName("dr.w(D)V")
    public void method756(double arg0) {
        this.field420 = arg0;
        this.method759();
    }

    @ObfuscatedName("dr.p(II)I")
    public int method739(int arg0) {
        return this.field421[arg0] == null ? 0 : this.field421[arg0].field2237;
    }

    @ObfuscatedName("dr.o(II)Z")
    public boolean method733(int arg0) {
        return this.field421[arg0].field2238;
    }

    @ObfuscatedName("dr.i(B)V")
    public void method759() {
        for (int var1 = 0; var1 < this.field421.length; var1++) {
            if (this.field421[var1] != null) {
                this.field421[var1].method2757();
            }
        }
        this.field416 = new class13();
        this.field419 = this.field418;
    }

    @ObfuscatedName("dr.j(IB)[I")
    public int[] method732(int arg0) {
        class149 var2 = this.field421[arg0];
        if (var2 != null) {
            if (var2.field2245 != null) {
                this.field416.method249(var2);
                var2.field2246 = true;
                return var2.field2245;
            }
            boolean var3 = var2.method2760(this.field420, this.field417, this.field422);
            if (var3) {
                if (this.field419 == 0) {
                    class149 var4 = (class149) this.field416.method252();
                    var4.method2757();
                } else {
                    this.field419--;
                }
                this.field416.method249(var2);
                var2.field2246 = true;
                return var2.field2245;
            }
        }
        return null;
    }

    @ObfuscatedName("dr.t(II)Z")
    public boolean method731(int arg0) {
        return this.field417 == 64;
    }

    @ObfuscatedName("dr.s(II)V")
    public void method766(int arg0) {
        for (int var2 = 0; var2 < this.field421.length; var2++) {
            class149 var3 = this.field421[var2];
            if (var3 != null && var3.field2240 != 0 && var3.field2246) {
                var3.method2755(arg0);
                var3.field2246 = false;
            }
        }
    }

    public class52(class81 arg0, class81 arg1, int arg2, double arg3, int arg4) {
        this.field422 = arg1;
        this.field418 = arg2;
        this.field419 = this.field418;
        this.field420 = arg3;
        this.field417 = arg4;
        int[] var7 = arg0.method1113(0);
        int var8 = var7.length;
        this.field421 = new class149[arg0.method1093(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class31 var10 = new class31(arg0.method1083(0, var7[var9]));
            this.field421[var7[var9]] = new class149(var10);
        }
    }
}
