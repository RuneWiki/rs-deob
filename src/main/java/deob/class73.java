package deob;

@ObfuscatedName("cp")
public final class class73 extends class278 {

    @ObfuscatedName("cp.aq")
    public int field904;

    @ObfuscatedName("cp.aw")
    public int field903;

    @ObfuscatedName("cp.al")
    public int field906;

    @ObfuscatedName("cp.ai")
    public int field902;

    @ObfuscatedName("cp.ar")
    public int field900;

    @ObfuscatedName("cp.as")
    public int field901;

    @ObfuscatedName("cp.aa")
    public class207 field905;

    @ObfuscatedName("cp.az")
    public int field899 = 0;

    @ObfuscatedName("cp.ao")
    public int field907 = 0;

    @ObfuscatedName("cp.au")
    public boolean field908 = false;

    public class73(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field904 = arg0;
        this.field906 = arg1;
        this.field902 = arg2;
        this.field900 = arg3;
        this.field901 = arg4;
        this.field903 = arg5 + arg6;
        int var8 = Statics.method3501(this.field904).field2040;
        if (var8 == -1) {
            this.field908 = true;
        } else {
            this.field908 = false;
            this.field905 = class207.method3902(var8);
        }
    }

    @ObfuscatedName("cp.aq(II)V")
    public final void method2017(int arg0) {
        if (this.field908) {
            return;
        }
        this.field907 += arg0;
        if (this.field905.method3731()) {
            this.field899 += arg0;
            if (this.field899 >= this.field905.method3732()) {
                this.field908 = true;
            }
            return;
        }
        while (this.field907 > this.field905.field2257[this.field899]) {
            this.field907 -= this.field905.field2257[this.field899];
            this.field899++;
            if (this.field899 >= this.field905.field2259.length) {
                this.field908 = true;
                break;
            }
        }
    }

    @ObfuscatedName("cp.aw(I)Lkz;")
    public final class285 method2016() {
        class195 var1 = Statics.method3501(this.field904);
        class285 var2;
        if (this.field908) {
            var2 = var1.method3453(-1);
        } else {
            var2 = var1.method3453(this.field899);
        }
        return var2 == null ? null : var2;
    }
}
