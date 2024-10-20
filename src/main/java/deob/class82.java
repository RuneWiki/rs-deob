package deob;

@ObfuscatedName("cg")
public final class class82 extends class139 {

    @ObfuscatedName("cg.p")
    public int field1240;

    @ObfuscatedName("cg.i")
    public int field1237;

    @ObfuscatedName("cg.w")
    public int field1238;

    @ObfuscatedName("cg.s")
    public int field1239;

    @ObfuscatedName("cg.j")
    public int field1241;

    @ObfuscatedName("cg.a")
    public int field1236;

    @ObfuscatedName("cg.t")
    public class272 field1242;

    @ObfuscatedName("cg.r")
    public int field1246 = 0;

    @ObfuscatedName("cg.m")
    public int field1244 = 0;

    @ObfuscatedName("cg.h")
    public boolean field1245 = false;

    public class82(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field1240 = arg0;
        this.field1238 = arg1;
        this.field1239 = arg2;
        this.field1241 = arg3;
        this.field1236 = arg4;
        this.field1237 = arg5 + arg6;
        int var8 = class257.method82(this.field1240).field3396;
        if (var8 == -1) {
            this.field1245 = true;
        } else {
            this.field1245 = false;
            this.field1242 = class272.method2308(var8);
        }
    }

    @ObfuscatedName("cg.p(IB)V")
    public final void method1682(int arg0) {
        if (this.field1245) {
            return;
        }
        this.field1244 += arg0;
        while (this.field1244 > this.field1242.field3670[this.field1246]) {
            this.field1244 -= this.field1242.field3670[this.field1246];
            this.field1246++;
            if (this.field1246 >= this.field1242.field3660.length) {
                this.field1245 = true;
                break;
            }
        }
    }

    @ObfuscatedName("cg.m(I)Len;")
    public final class131 method1045() {
        class257 var1 = class257.method82(this.field1240);
        class131 var2;
        if (this.field1245) {
            var2 = var1.method4252(-1);
        } else {
            var2 = var1.method4252(this.field1246);
        }
        return var2 == null ? null : var2;
    }
}
