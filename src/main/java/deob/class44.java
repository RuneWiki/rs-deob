package deob;

@ObfuscatedName("ap")
public abstract class class44 {

    @ObfuscatedName("ap.n")
    public final class223 field322;

    @ObfuscatedName("ap.p")
    public final class223 field320;

    @ObfuscatedName("ap.l")
    public int field321;

    @ObfuscatedName("ap.z")
    public int field324;

    public class44(class223 arg0, class223 arg1) {
        this.field320 = arg0;
        this.field322 = arg1;
    }

    @ObfuscatedName("ap.q(III)Z")
    public boolean method564(int arg0, int arg1) {
        if (this.method561(arg0, arg1)) {
            return true;
        } else {
            return this.method562(arg0, arg1);
        }
    }

    @ObfuscatedName("ap.g(I)Z")
    public boolean method559() {
        return this.method244() >= 0;
    }

    @ObfuscatedName("ap.o(III)Z")
    public boolean method561(int arg0, int arg1) {
        if (!this.method559()) {
            return false;
        }
        class253 var3 = class253.method3211(this.method244());
        int var4 = this.method247();
        int var5 = this.method238();
        switch(var3.field3260.field3493) {
            case 0:
                if (arg0 >= this.field321 && arg0 < this.field321 + var4) {
                    break;
                }
                return false;
            case 1:
                if (arg0 >= this.field321 - var4 / 2 && arg0 <= var4 / 2 + this.field321) {
                    break;
                }
                return false;
            case 2:
                if (arg0 <= this.field321 - var4 || arg0 > this.field321) {
                    return false;
                }
        }
        switch(var3.field3261.field3228) {
            case 0:
                if (arg1 >= this.field324 && arg1 < this.field324 + var5) {
                    break;
                }
                return false;
            case 1:
                if (arg1 <= this.field324 - var5 || arg1 > this.field324) {
                    return false;
                }
                break;
            case 2:
                if (arg1 < this.field324 - var5 / 2 || arg1 > var5 / 2 + this.field324) {
                    return false;
                }
        }
        return true;
    }

    @ObfuscatedName("ap.an(III)Z")
    public boolean method562(int arg0, int arg1) {
        class38 var3 = this.method236();
        if (var3 == null) {
            return false;
        } else if (arg0 >= this.field321 - var3.field256 / 2 && arg0 <= var3.field256 / 2 + this.field321) {
            return arg1 >= this.field324 && arg1 <= this.field324 + var3.field257;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ap.h(I)I")
    public abstract int method244();

    @ObfuscatedName("ap.v(I)Lah;")
    public abstract class38 method236();

    @ObfuscatedName("ap.w(I)I")
    public abstract int method238();

    @ObfuscatedName("ap.x(B)I")
    public abstract int method247();
}
