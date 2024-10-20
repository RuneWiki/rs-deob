package deob;

@ObfuscatedName("cj")
public final class class84 extends class141 {

    @ObfuscatedName("cj.a")
    public int field1256;

    @ObfuscatedName("cj.w")
    public int field1253;

    @ObfuscatedName("cj.e")
    public int field1254;

    @ObfuscatedName("cj.k")
    public int field1255;

    @ObfuscatedName("cj.u")
    public int field1261;

    @ObfuscatedName("cj.z")
    public int field1258;

    @ObfuscatedName("cj.t")
    public class272 field1262;

    @ObfuscatedName("cj.f")
    public int field1259 = 0;

    @ObfuscatedName("cj.g")
    public int field1260 = 0;

    @ObfuscatedName("cj.j")
    public boolean field1264 = false;

    public class84(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field1256 = arg0;
        this.field1254 = arg1;
        this.field1255 = arg2;
        this.field1261 = arg3;
        this.field1258 = arg4;
        this.field1253 = arg5 + arg6;
        int var8 = class257.method4035(this.field1256).field3414;
        if (var8 == -1) {
            this.field1264 = true;
        } else {
            this.field1264 = false;
            this.field1262 = class272.method3881(var8);
        }
    }

    @ObfuscatedName("cj.a(II)V")
    public final void method1484(int arg0) {
        if (this.field1264) {
            return;
        }
        this.field1260 += arg0;
        while (this.field1260 > this.field1262.field3676[this.field1259]) {
            this.field1260 -= this.field1262.field3676[this.field1259];
            this.field1259++;
            if (this.field1259 >= this.field1262.field3671.length) {
                this.field1264 = true;
                break;
            }
        }
    }

    @ObfuscatedName("cj.e(I)Lef;")
    public final class133 method981() {
        class257 var1 = class257.method4035(this.field1256);
        class133 var2;
        if (this.field1264) {
            var2 = var1.method4109(-1);
        } else {
            var2 = var1.method4109(this.field1259);
        }
        return var2 == null ? null : var2;
    }
}
