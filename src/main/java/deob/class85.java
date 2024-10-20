package deob;

@ObfuscatedName("cj")
public final class class85 extends class142 {

    @ObfuscatedName("cj.i")
    public int field1376;

    @ObfuscatedName("cj.c")
    public int field1383;

    @ObfuscatedName("cj.e")
    public int field1375;

    @ObfuscatedName("cj.v")
    public int field1377;

    @ObfuscatedName("cj.b")
    public int field1379;

    @ObfuscatedName("cj.y")
    public class261 field1378;

    @ObfuscatedName("cj.h")
    public int field1380;

    @ObfuscatedName("cj.x")
    public int field1382 = 0;

    @ObfuscatedName("cj.f")
    public int field1384 = 0;

    @ObfuscatedName("cj.n")
    public boolean field1387 = false;

    public class85(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field1376 = arg0;
        this.field1375 = arg1;
        this.field1377 = arg2;
        this.field1379 = arg3;
        this.field1380 = arg4;
        this.field1383 = arg5 + arg6;
        int var8 = class246.method1412(this.field1376).field3327;
        if (var8 == -1) {
            this.field1387 = true;
        } else {
            this.field1387 = false;
            this.field1378 = class261.method3748(var8);
        }
    }

    @ObfuscatedName("cj.i(II)V")
    public final void method1531(int arg0) {
        if (this.field1387) {
            return;
        }
        this.field1384 += arg0;
        while (this.field1384 > this.field1378.field3605[this.field1382]) {
            this.field1384 -= this.field1378.field3605[this.field1382];
            this.field1382++;
            if (this.field1382 >= this.field1378.field3600.length) {
                this.field1387 = true;
                break;
            }
        }
    }

    @ObfuscatedName("cj.e(I)Led;")
    public final class134 method1026() {
        class246 var1 = class246.method1412(this.field1376);
        class134 var2;
        if (this.field1387) {
            var2 = var1.method3990(-1);
        } else {
            var2 = var1.method3990(this.field1382);
        }
        return var2 == null ? null : var2;
    }
}
