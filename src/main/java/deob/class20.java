package deob;

@ObfuscatedName("m")
public final class class20 extends class94 {

    @ObfuscatedName("m.x")
    public int field270;

    @ObfuscatedName("m.p")
    public int field269;

    @ObfuscatedName("m.k")
    public int field264;

    @ObfuscatedName("m.a")
    public int field271;

    @ObfuscatedName("m.q")
    public int field266;

    @ObfuscatedName("m.j")
    public int field268;

    @ObfuscatedName("m.v")
    public class34 field263;

    @ObfuscatedName("m.w")
    public int field265 = 0;

    @ObfuscatedName("m.l")
    public int field267 = 0;

    @ObfuscatedName("m.s")
    public boolean field272 = false;

    public class20(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field269 = arg0;
        this.field271 = arg1;
        this.field266 = arg2;
        this.field270 = arg3;
        this.field268 = arg4;
        this.field264 = arg5 + arg6;
        int var8 = class35.method1621(this.field269).field875;
        if (var8 == -1) {
            this.field272 = true;
        } else {
            this.field272 = false;
            this.field263 = class34.method516(var8);
        }
    }

    @ObfuscatedName("m.x(II)V")
    public final void method163(int arg0) {
        if (this.field272) {
            return;
        }
        this.field267 += arg0;
        while (this.field267 > this.field263.field853[this.field265]) {
            this.field267 -= this.field263.field853[this.field265];
            this.field265++;
            if (this.field265 >= this.field263.field851.length) {
                this.field272 = true;
                break;
            }
        }
    }

    @ObfuscatedName("m.p(I)Ldi;")
    public final class112 method10() {
        class35 var1 = class35.method1621(this.field269);
        class112 var2;
        if (this.field272) {
            var2 = var1.method717(-1);
        } else {
            var2 = var1.method717(this.field265);
        }
        return var2 == null ? null : var2;
    }
}
