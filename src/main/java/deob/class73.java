package deob;

@ObfuscatedName("cz")
public final class class73 extends class249 {

    @ObfuscatedName("cz.az")
    public int field881;

    @ObfuscatedName("cz.ah")
    public int field882;

    @ObfuscatedName("cz.af")
    public int field892;

    @ObfuscatedName("cz.at")
    public int field897;

    @ObfuscatedName("cz.an")
    public int field885;

    @ObfuscatedName("cz.ao")
    public int field886;

    @ObfuscatedName("cz.ab")
    public class225 field891;

    @ObfuscatedName("cz.aw")
    public int field888 = 0;

    @ObfuscatedName("cz.ad")
    public int field889 = 0;

    @ObfuscatedName("cz.al")
    public boolean field883 = false;

    public class73(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field881 = arg0;
        this.field892 = arg1;
        this.field897 = arg2;
        this.field885 = arg3;
        this.field886 = arg4;
        this.field882 = arg5 + arg6;
        int var8 = class213.method2771(this.field881).field2183;
        if (var8 == -1) {
            this.field883 = true;
        } else {
            this.field883 = false;
            this.field891 = class225.method288(var8);
        }
    }

    @ObfuscatedName("cz.az(IB)V")
    public final void method1977(int arg0) {
        if (this.field883) {
            return;
        }
        this.field889 += arg0;
        if (this.field891.method3940()) {
            this.field888 += arg0;
            if (this.field888 >= this.field891.method3904()) {
                this.field883 = true;
            }
            return;
        }
        while (this.field889 > this.field891.field2393[this.field888]) {
            this.field889 -= this.field891.field2393[this.field888];
            this.field888++;
            if (this.field888 >= this.field891.field2386.length) {
                this.field883 = true;
                break;
            }
        }
    }

    @ObfuscatedName("cz.ah(I)Ljn;")
    public final class256 method1979() {
        class213 var1 = class213.method2771(this.field881);
        class256 var2;
        if (this.field883) {
            var2 = var1.method3609(-1);
        } else {
            var2 = var1.method3609(this.field888);
        }
        return var2 == null ? null : var2;
    }
}
