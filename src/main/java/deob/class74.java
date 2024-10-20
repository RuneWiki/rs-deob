package deob;

@ObfuscatedName("ck")
public final class class74 extends class189 {

    @ObfuscatedName("ck.ab")
    public int field877;

    @ObfuscatedName("ck.ay")
    public int field870;

    @ObfuscatedName("ck.an")
    public int field871;

    @ObfuscatedName("ck.au")
    public int field878;

    @ObfuscatedName("ck.ax")
    public int field873;

    @ObfuscatedName("ck.ao")
    public int field869;

    @ObfuscatedName("ck.am")
    public class264 field875;

    @ObfuscatedName("ck.ac")
    public int field874 = 0;

    @ObfuscatedName("ck.ae")
    public int field872 = 0;

    @ObfuscatedName("ck.ad")
    public boolean field876 = false;

    public class74(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field877 = arg0;
        this.field871 = arg1;
        this.field878 = arg2;
        this.field873 = arg3;
        this.field869 = arg4;
        this.field870 = arg5 + arg6;
        int var8 = class251.method5487(this.field877).field2649;
        if (var8 == -1) {
            this.field876 = true;
        } else {
            this.field876 = false;
            this.field875 = class264.method3551(var8);
        }
    }

    @ObfuscatedName("ck.ab(II)V")
    public final void method2086(int arg0) {
        if (this.field876) {
            return;
        }
        this.field872 += arg0;
        if (this.field875.method4915()) {
            this.field874 += arg0;
            if (this.field874 >= this.field875.method4907()) {
                this.field876 = true;
            }
            return;
        }
        while (this.field872 > this.field875.field2874[this.field874]) {
            this.field872 -= this.field875.field2874[this.field874];
            this.field874++;
            if (this.field874 >= this.field875.field2872.length) {
                this.field876 = true;
                break;
            }
        }
    }

    @ObfuscatedName("ck.ae(I)Lhr;")
    public final class197 method2088() {
        class251 var1 = class251.method5487(this.field877);
        class197 var2;
        if (this.field876) {
            var2 = var1.method4597(-1);
        } else {
            var2 = var1.method4597(this.field874);
        }
        return var2 == null ? null : var2;
    }
}
