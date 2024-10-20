package deob;

@ObfuscatedName("cg")
public final class class85 extends class142 {

    @ObfuscatedName("cg.s")
    public int field1353;

    @ObfuscatedName("cg.c")
    public int field1362;

    @ObfuscatedName("cg.f")
    public int field1360;

    @ObfuscatedName("cg.m")
    public int field1358;

    @ObfuscatedName("cg.h")
    public int field1355;

    @ObfuscatedName("cg.t")
    public int field1357;

    @ObfuscatedName("cg.p")
    public class264 field1354;

    @ObfuscatedName("cg.d")
    public int field1359 = 0;

    @ObfuscatedName("cg.n")
    public int field1352 = 0;

    @ObfuscatedName("cg.z")
    public boolean field1361 = false;

    public class85(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field1353 = arg0;
        this.field1360 = arg1;
        this.field1358 = arg2;
        this.field1355 = arg3;
        this.field1357 = arg4;
        this.field1362 = arg5 + arg6;
        int var8 = class249.method3835(this.field1353).field3338;
        if (var8 == -1) {
            this.field1361 = true;
        } else {
            this.field1361 = false;
            this.field1354 = class264.method341(var8);
        }
    }

    @ObfuscatedName("cg.s(II)V")
    public final void method1551(int arg0) {
        if (this.field1361) {
            return;
        }
        this.field1352 += arg0;
        while (this.field1352 > this.field1354.field3631[this.field1359]) {
            this.field1352 -= this.field1354.field3631[this.field1359];
            this.field1359++;
            if (this.field1359 >= this.field1354.field3620.length) {
                this.field1361 = true;
                break;
            }
        }
    }

    @ObfuscatedName("cg.f(B)Leb;")
    public final class134 method1016() {
        class249 var1 = class249.method3835(this.field1353);
        class134 var2;
        if (this.field1361) {
            var2 = var1.method4051(-1);
        } else {
            var2 = var1.method4051(this.field1359);
        }
        return var2 == null ? null : var2;
    }
}
