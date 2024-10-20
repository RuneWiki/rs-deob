package deob;

@ObfuscatedName("ca")
public final class class85 extends class142 {

    @ObfuscatedName("ca.w")
    public int field1368;

    @ObfuscatedName("ca.o")
    public int field1361;

    @ObfuscatedName("ca.x")
    public int field1364;

    @ObfuscatedName("ca.k")
    public int field1365;

    @ObfuscatedName("ca.f")
    public int field1363;

    @ObfuscatedName("ca.i")
    public int field1375;

    @ObfuscatedName("ca.j")
    public class264 field1366;

    @ObfuscatedName("ca.m")
    public int field1372 = 0;

    @ObfuscatedName("ca.u")
    public int field1367 = 0;

    @ObfuscatedName("ca.r")
    public boolean field1360 = false;

    public class85(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field1368 = arg0;
        this.field1365 = arg1;
        this.field1363 = arg2;
        this.field1364 = arg3;
        this.field1375 = arg4;
        this.field1361 = arg5 + arg6;
        int var8 = Statics.method3709(this.field1368).field3345;
        if (var8 == -1) {
            this.field1360 = true;
        } else {
            this.field1360 = false;
            this.field1366 = class264.method3098(var8);
        }
    }

    @ObfuscatedName("ca.w(II)V")
    public final void method1516(int arg0) {
        if (this.field1360) {
            return;
        }
        this.field1367 += arg0;
        while (this.field1367 > this.field1366.field3622[this.field1372]) {
            this.field1367 -= this.field1366.field3622[this.field1372];
            this.field1372++;
            if (this.field1372 >= this.field1366.field3620.length) {
                this.field1360 = true;
                break;
            }
        }
    }

    @ObfuscatedName("ca.x(I)Lev;")
    public final class134 method1017() {
        class249 var1 = Statics.method3709(this.field1368);
        class134 var2;
        if (this.field1360) {
            var2 = var1.method3940(-1);
        } else {
            var2 = var1.method3940(this.field1372);
        }
        return var2 == null ? null : var2;
    }
}
