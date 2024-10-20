package deob;

@ObfuscatedName("ch")
public final class class73 extends class247 {

    @ObfuscatedName("ch.ac")
    public int field893;

    @ObfuscatedName("ch.al")
    public int field890;

    @ObfuscatedName("ch.ak")
    public int field899;

    @ObfuscatedName("ch.ax")
    public int field892;

    @ObfuscatedName("ch.ao")
    public int field895;

    @ObfuscatedName("ch.ah")
    public int field894;

    @ObfuscatedName("ch.ar")
    public class223 field898;

    @ObfuscatedName("ch.ab")
    public int field896 = 0;

    @ObfuscatedName("ch.am")
    public int field897 = 0;

    @ObfuscatedName("ch.av")
    public boolean field901 = false;

    public class73(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field893 = arg0;
        this.field899 = arg1;
        this.field892 = arg2;
        this.field895 = arg3;
        this.field894 = arg4;
        this.field890 = arg5 + arg6;
        int var8 = class211.method6757(this.field893).field2127;
        if (var8 == -1) {
            this.field901 = true;
        } else {
            this.field901 = false;
            this.field898 = class223.method687(var8);
        }
    }

    @ObfuscatedName("ch.ac(IB)V")
    public final void method2008(int arg0) {
        if (this.field901) {
            return;
        }
        this.field897 += arg0;
        if (this.field898.method3851()) {
            this.field896 += arg0;
            if (this.field896 >= this.field898.method3860()) {
                this.field901 = true;
            }
            return;
        }
        while (this.field897 > this.field898.field2313[this.field896]) {
            this.field897 -= this.field898.field2313[this.field896];
            this.field896++;
            if (this.field896 >= this.field898.field2326.length) {
                this.field901 = true;
                break;
            }
        }
    }

    @ObfuscatedName("ch.al(B)Ljn;")
    public final class254 method2007() {
        class211 var1 = class211.method6757(this.field893);
        class254 var2;
        if (this.field901) {
            var2 = var1.method3537(-1);
        } else {
            var2 = var1.method3537(this.field896);
        }
        return var2 == null ? null : var2;
    }
}
