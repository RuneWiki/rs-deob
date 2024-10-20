package deob;

@ObfuscatedName("ch")
public final class class85 extends class142 {

    @ObfuscatedName("ch.d")
    public int field1323;

    @ObfuscatedName("ch.q")
    public int field1317;

    @ObfuscatedName("ch.x")
    public int field1320;

    @ObfuscatedName("ch.y")
    public class261 field1322;

    @ObfuscatedName("ch.e")
    public int field1318;

    @ObfuscatedName("ch.f")
    public int field1319;

    @ObfuscatedName("ch.v")
    public int field1321;

    @ObfuscatedName("ch.t")
    public int field1328 = 0;

    @ObfuscatedName("ch.i")
    public int field1324 = 0;

    @ObfuscatedName("ch.r")
    public boolean field1325 = false;

    public class85(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field1323 = arg0;
        this.field1318 = arg1;
        this.field1319 = arg2;
        this.field1320 = arg3;
        this.field1321 = arg4;
        this.field1317 = arg5 + arg6;
        int var8 = class246.method465(this.field1323).field3310;
        if (var8 == -1) {
            this.field1325 = true;
        } else {
            this.field1325 = false;
            this.field1322 = class261.method494(var8);
        }
    }

    @ObfuscatedName("ch.d(II)V")
    public final void method1538(int arg0) {
        if (this.field1325) {
            return;
        }
        this.field1324 += arg0;
        while (this.field1324 > this.field1322.field3589[this.field1328]) {
            this.field1324 -= this.field1322.field3589[this.field1328];
            this.field1328++;
            if (this.field1328 >= this.field1322.field3586.length) {
                this.field1325 = true;
                break;
            }
        }
    }

    @ObfuscatedName("ch.x(I)Lev;")
    public final class134 method1046() {
        class246 var1 = class246.method465(this.field1323);
        class134 var2;
        if (this.field1325) {
            var2 = var1.method3935(-1);
        } else {
            var2 = var1.method3935(this.field1328);
        }
        return var2 == null ? null : var2;
    }
}
