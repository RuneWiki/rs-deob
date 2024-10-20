package deob;

@ObfuscatedName("cl")
public final class class72 extends class234 {

    @ObfuscatedName("cl.aw")
    public int field889;

    @ObfuscatedName("cl.ay")
    public int field896;

    @ObfuscatedName("cl.ar")
    public int field891;

    @ObfuscatedName("cl.am")
    public int field892;

    @ObfuscatedName("cl.as")
    public int field893;

    @ObfuscatedName("cl.aj")
    public int field894;

    @ObfuscatedName("cl.ag")
    public class210 field895;

    @ObfuscatedName("cl.az")
    public int field890 = 0;

    @ObfuscatedName("cl.av")
    public int field897 = 0;

    @ObfuscatedName("cl.ap")
    public boolean field898 = false;

    public class72(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field889 = arg0;
        this.field891 = arg1;
        this.field892 = arg2;
        this.field893 = arg3;
        this.field894 = arg4;
        this.field896 = arg5 + arg6;
        int var8 = class199.method3394(this.field889).field2061;
        if (var8 == -1) {
            this.field898 = true;
        } else {
            this.field898 = false;
            this.field895 = class210.method2904(var8);
        }
    }

    @ObfuscatedName("cl.aw(IB)V")
    public final void method1985(int arg0) {
        if (this.field898) {
            return;
        }
        this.field897 += arg0;
        if (this.field895.method3738()) {
            this.field890 += arg0;
            if (this.field890 >= this.field895.method3739()) {
                this.field898 = true;
            }
            return;
        }
        while (this.field897 > this.field895.field2273[this.field890]) {
            this.field897 -= this.field895.field2273[this.field890];
            this.field890++;
            if (this.field890 >= this.field895.field2265.length) {
                this.field898 = true;
                break;
            }
        }
    }

    @ObfuscatedName("cl.ay(I)Ljo;")
    public final class241 method1986() {
        class199 var1 = class199.method3394(this.field889);
        class241 var2;
        if (this.field898) {
            var2 = var1.method3442(-1);
        } else {
            var2 = var1.method3442(this.field890);
        }
        return var2 == null ? null : var2;
    }
}
