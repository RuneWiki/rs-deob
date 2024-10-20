package deob;

@ObfuscatedName("ce")
public final class class82 extends class139 {

    @ObfuscatedName("ce.s")
    public int field1260;

    @ObfuscatedName("ce.g")
    public int field1259;

    @ObfuscatedName("ce.m")
    public int field1262;

    @ObfuscatedName("ce.h")
    public int field1258;

    @ObfuscatedName("ce.i")
    public int field1255;

    @ObfuscatedName("ce.w")
    public int field1256;

    @ObfuscatedName("ce.t")
    public class272 field1261;

    @ObfuscatedName("ce.d")
    public int field1257 = 0;

    @ObfuscatedName("ce.z")
    public int field1263 = 0;

    @ObfuscatedName("ce.k")
    public boolean field1264 = false;

    public class82(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field1260 = arg0;
        this.field1262 = arg1;
        this.field1258 = arg2;
        this.field1255 = arg3;
        this.field1256 = arg4;
        this.field1259 = arg5 + arg6;
        int var8 = class257.method3116(this.field1260).field3405;
        if (var8 == -1) {
            this.field1264 = true;
        } else {
            this.field1264 = false;
            this.field1261 = class272.method4180(var8);
        }
    }

    @ObfuscatedName("ce.s(IB)V")
    public final void method1713(int arg0) {
        if (this.field1264) {
            return;
        }
        this.field1263 += arg0;
        while (this.field1263 > this.field1261.field3684[this.field1257]) {
            this.field1263 -= this.field1261.field3684[this.field1257];
            this.field1257++;
            if (this.field1257 >= this.field1261.field3689.length) {
                this.field1264 = true;
                break;
            }
        }
    }

    @ObfuscatedName("ce.z(I)Les;")
    public final class131 method1039() {
        class257 var1 = class257.method3116(this.field1260);
        class131 var2;
        if (this.field1264) {
            var2 = var1.method4406(-1);
        } else {
            var2 = var1.method4406(this.field1257);
        }
        return var2 == null ? null : var2;
    }
}
