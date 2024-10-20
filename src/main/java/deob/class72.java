package deob;

@ObfuscatedName("cg")
public final class class72 extends class233 {

    @ObfuscatedName("cg.au")
    public int field905;

    @ObfuscatedName("cg.ae")
    public int field896;

    @ObfuscatedName("cg.ao")
    public int field897;

    @ObfuscatedName("cg.at")
    public int field898;

    @ObfuscatedName("cg.ac")
    public int field899;

    @ObfuscatedName("cg.ai")
    public int field895;

    @ObfuscatedName("cg.az")
    public class209 field901;

    @ObfuscatedName("cg.ap")
    public int field902 = 0;

    @ObfuscatedName("cg.aa")
    public int field903 = 0;

    @ObfuscatedName("cg.af")
    public boolean field904 = false;

    public class72(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field905 = arg0;
        this.field897 = arg1;
        this.field898 = arg2;
        this.field899 = arg3;
        this.field895 = arg4;
        this.field896 = arg5 + arg6;
        int var8 = class199.method3551(this.field905).field2102;
        if (var8 == -1) {
            this.field904 = true;
        } else {
            this.field904 = false;
            this.field901 = class209.method3394(var8);
        }
    }

    @ObfuscatedName("cg.au(IB)V")
    public final void method1988(int arg0) {
        if (this.field904) {
            return;
        }
        this.field903 += arg0;
        if (this.field901.method3775()) {
            this.field902 += arg0;
            if (this.field902 >= this.field901.method3747()) {
                this.field904 = true;
            }
            return;
        }
        while (this.field903 > this.field901.field2324[this.field902]) {
            this.field903 -= this.field901.field2324[this.field902];
            this.field902++;
            if (this.field902 >= this.field901.field2313.length) {
                this.field904 = true;
                break;
            }
        }
    }

    @ObfuscatedName("cg.ae(I)Ljr;")
    public final class240 method1990() {
        class199 var1 = class199.method3551(this.field905);
        class240 var2;
        if (this.field904) {
            var2 = var1.method3462(-1);
        } else {
            var2 = var1.method3462(this.field902);
        }
        return var2 == null ? null : var2;
    }
}
