package deob;

@ObfuscatedName("ix")
public abstract class class256 {

    @ObfuscatedName("ix.f")
    public final class297 field3003;

    @ObfuscatedName("ix.r")
    public final class297 field3000;

    @ObfuscatedName("ix.u")
    public int field3002;

    @ObfuscatedName("ix.b")
    public int field3001;

    public class256(class297 arg0, class297 arg1) {
        this.field3000 = arg0;
        this.field3003 = arg1;
    }

    @ObfuscatedName("ix.a(III)Z")
    public boolean method4809(int arg0, int arg1) {
        if (this.method4813(arg0, arg1)) {
            return true;
        } else {
            return this.method4812(arg0, arg1);
        }
    }

    @ObfuscatedName("ix.s(S)Z")
    public boolean method4814() {
        return this.method4455() >= 0;
    }

    @ObfuscatedName("ix.l(III)Z")
    public boolean method4813(int arg0, int arg1) {
        if (!this.method4814()) {
            return false;
        }
        class179 var3 = class179.method3153(this.method4455());
        int var4 = this.method4457();
        int var5 = this.method4458();
        switch(var3.field1932.field2010) {
            case 0:
                if (arg0 >= this.field3002 && arg0 < this.field3002 + var4) {
                    break;
                }
                return false;
            case 1:
                if (arg0 >= this.field3002 - var4 / 2 && arg0 <= var4 / 2 + this.field3002) {
                    break;
                }
                return false;
            case 2:
                if (arg0 <= this.field3002 - var4 || arg0 > this.field3002) {
                    return false;
                }
        }
        switch(var3.field1947.field2072) {
            case 0:
                if (arg1 > this.field3001 - var5 && arg1 <= this.field3001) {
                    break;
                }
                return false;
            case 1:
                if (arg1 < this.field3001 || arg1 >= this.field3001 + var5) {
                    return false;
                }
                break;
            case 2:
                if (arg1 < this.field3001 - var5 / 2 || arg1 > var5 / 2 + this.field3001) {
                    return false;
                }
        }
        return true;
    }

    @ObfuscatedName("ix.t(IIB)Z")
    public boolean method4812(int arg0, int arg1) {
        class251 var3 = this.method4456();
        if (var3 == null) {
            return false;
        } else if (arg0 >= this.field3002 - var3.field2973 / 2 && arg0 <= var3.field2973 / 2 + this.field3002) {
            return arg1 >= this.field3001 && arg1 <= this.field3001 + var3.field2972;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ix.x(I)I")
    public abstract int method4457();

    @ObfuscatedName("ix.e(I)I")
    public abstract int method4455();

    @ObfuscatedName("ix.v(I)Lii;")
    public abstract class251 method4456();

    @ObfuscatedName("ix.m(I)I")
    public abstract int method4458();
}
