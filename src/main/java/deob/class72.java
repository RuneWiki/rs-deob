package deob;

@ObfuscatedName("ck")
public final class class72 extends class276 {

    @ObfuscatedName("ck.am")
    public int field870;

    @ObfuscatedName("ck.ap")
    public int field866;

    @ObfuscatedName("ck.af")
    public int field867;

    @ObfuscatedName("ck.aj")
    public int field868;

    @ObfuscatedName("ck.aq")
    public int field872;

    @ObfuscatedName("ck.ar")
    public int field874;

    @ObfuscatedName("ck.ag")
    public class205 field869;

    @ObfuscatedName("ck.ao")
    public int field871 = 0;

    @ObfuscatedName("ck.ae")
    public int field873 = 0;

    @ObfuscatedName("ck.aa")
    public boolean field865 = false;

    public class72(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field870 = arg0;
        this.field867 = arg1;
        this.field868 = arg2;
        this.field872 = arg3;
        this.field874 = arg4;
        this.field866 = arg5 + arg6;
        int var8 = class194.method3107(this.field870).field2023;
        if (var8 == -1) {
            this.field865 = true;
        } else {
            this.field865 = false;
            this.field869 = class205.method73(var8);
        }
    }

    @ObfuscatedName("ck.am(II)V")
    public final void method2055(int arg0) {
        if (this.field865) {
            return;
        }
        this.field873 += arg0;
        if (this.field869.method3760()) {
            this.field871 += arg0;
            if (this.field871 >= this.field869.method3784()) {
                this.field865 = true;
            }
            return;
        }
        while (this.field873 > this.field869.field2234[this.field871]) {
            this.field873 -= this.field869.field2234[this.field871];
            this.field871++;
            if (this.field871 >= this.field869.field2222.length) {
                this.field865 = true;
                break;
            }
        }
    }

    @ObfuscatedName("ck.ap(I)Lko;")
    public final class283 method2053() {
        class194 var1 = class194.method3107(this.field870);
        class283 var2;
        if (this.field865) {
            var2 = var1.method3472(-1);
        } else {
            var2 = var1.method3472(this.field871);
        }
        return var2 == null ? null : var2;
    }
}
