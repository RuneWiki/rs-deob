package deob;

@ObfuscatedName("le")
public final class class318 {

    @ObfuscatedName("le.u")
    public int field3835;

    @ObfuscatedName("le.f")
    public class181[] field3834;

    @ObfuscatedName("le.b")
    public class181 field3833;

    @ObfuscatedName("le.g")
    public class181 field3836;

    @ObfuscatedName("le.z")
    public int field3837 = 0;

    public class318(int arg0) {
        this.field3835 = arg0;
        this.field3834 = new class181[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class181 var3 = this.field3834[var2] = new class181();
            var3.field2127 = var3;
            var3.field2128 = var3;
        }
    }

    @ObfuscatedName("le.u(J)Lfb;")
    public class181 method5549(long arg0) {
        class181 var3 = this.field3834[(int) (arg0 & (long) (this.field3835 - 1))];
        for (this.field3833 = var3.field2127; this.field3833 != var3; this.field3833 = this.field3833.field2127) {
            if (this.field3833.field2126 == arg0) {
                class181 var4 = this.field3833;
                this.field3833 = this.field3833.field2127;
                return var4;
            }
        }
        this.field3833 = null;
        return null;
    }

    @ObfuscatedName("le.f(Lfb;J)V")
    public void method5550(class181 arg0, long arg1) {
        if (arg0.field2128 != null) {
            arg0.method3332();
        }
        class181 var4 = this.field3834[(int) (arg1 & (long) (this.field3835 - 1))];
        arg0.field2128 = var4.field2128;
        arg0.field2127 = var4;
        arg0.field2128.field2127 = arg0;
        arg0.field2127.field2128 = arg0;
        arg0.field2126 = arg1;
    }

    @ObfuscatedName("le.b()Lfb;")
    public class181 method5551() {
        this.field3837 = 0;
        return this.method5556();
    }

    @ObfuscatedName("le.g()Lfb;")
    public class181 method5556() {
        if (this.field3837 > 0 && this.field3834[this.field3837 - 1] != this.field3836) {
            class181 var1 = this.field3836;
            this.field3836 = var1.field2127;
            return var1;
        }
        class181 var2;
        do {
            if (this.field3837 >= this.field3835) {
                return null;
            }
            var2 = this.field3834[this.field3837++].field2127;
        } while (this.field3834[this.field3837 - 1] == var2);
        this.field3836 = var2.field2127;
        return var2;
    }
}
