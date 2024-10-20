package deob;

@ObfuscatedName("ca")
public final class class75 extends class248 {

    @ObfuscatedName("ca.ap")
    public int field888;

    @ObfuscatedName("ca.aw")
    public int field891;

    @ObfuscatedName("ca.ak")
    public int field885;

    @ObfuscatedName("ca.aj")
    public int field886;

    @ObfuscatedName("ca.ai")
    public int field883;

    @ObfuscatedName("ca.ay")
    public int field884;

    @ObfuscatedName("ca.as")
    public class213 field889;

    @ObfuscatedName("ca.ae")
    public int field890 = 0;

    @ObfuscatedName("ca.am")
    public int field887 = 0;

    @ObfuscatedName("ca.at")
    public boolean field892 = false;

    public class75(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field888 = arg0;
        this.field885 = arg1;
        this.field886 = arg2;
        this.field883 = arg3;
        this.field884 = arg4;
        this.field891 = arg5 + arg6;
        int var8 = class200.method6851(this.field888).field2087;
        if (var8 == -1) {
            this.field892 = true;
        } else {
            this.field892 = false;
            this.field889 = class213.method6692(var8);
        }
    }

    @ObfuscatedName("ca.ap(IB)V")
    public final void method2244(int arg0) {
        if (this.field892) {
            return;
        }
        this.field887 += arg0;
        if (this.field889.method4100()) {
            this.field890 += arg0;
            if (this.field890 >= this.field889.method4101()) {
                this.field892 = true;
            } else {
                client.method5758(this.field889, this.field890, this.field886, this.field883, false);
            }
            return;
        }
        while (this.field887 > this.field889.field2316[this.field890]) {
            this.field887 -= this.field889.field2316[this.field890];
            this.field890++;
            if (this.field890 >= this.field889.field2314.length) {
                this.field892 = true;
                break;
            }
            client.method5758(this.field889, this.field890, this.field886, this.field883, false);
        }
    }

    @ObfuscatedName("ca.au(I)Ljy;")
    public final class256 method2245() {
        class200 var1 = class200.method6851(this.field888);
        class256 var2;
        if (this.field892) {
            var2 = var1.method3812(-1);
        } else {
            var2 = var1.method3812(this.field890);
        }
        return var2 == null ? null : var2;
    }
}
