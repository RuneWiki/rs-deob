package deob;

@ObfuscatedName("h")
public final class class26 extends class78 {

    @ObfuscatedName("h.e")
    public int field619;

    @ObfuscatedName("h.p")
    public int field612;

    @ObfuscatedName("h.a")
    public int field617;

    @ObfuscatedName("h.g")
    public int field614;

    @ObfuscatedName("h.u")
    public int field613;

    @ObfuscatedName("h.k")
    public int field616;

    @ObfuscatedName("h.m")
    public class38 field627;

    @ObfuscatedName("h.t")
    public int field618 = 0;

    @ObfuscatedName("h.l")
    public int field624 = 0;

    @ObfuscatedName("h.f")
    public boolean field620 = false;

    public class26(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field619 = arg0;
        this.field617 = arg1;
        this.field614 = arg2;
        this.field613 = arg3;
        this.field616 = arg4;
        this.field612 = arg5 + arg6;
        int var8 = class39.method467(this.field619).field918;
        if (var8 == -1) {
            this.field620 = true;
        } else {
            this.field620 = false;
            this.field627 = class38.method81(var8);
        }
    }

    @ObfuscatedName("h.e(II)V")
    public final void method528(int arg0) {
        if (this.field620) {
            return;
        }
        this.field624 += arg0;
        while (this.field624 > this.field627.field909[this.field618]) {
            this.field624 -= this.field627.field909[this.field618];
            this.field618++;
            if (this.field618 >= this.field627.field907.length) {
                this.field620 = true;
                break;
            }
        }
    }

    @ObfuscatedName("h.p(B)Lcs;")
    public final class98 method12() {
        class39 var1 = class39.method467(this.field619);
        class98 var2;
        if (this.field620) {
            var2 = var1.method771(-1);
        } else {
            var2 = var1.method771(this.field618);
        }
        return var2 == null ? null : var2;
    }
}
