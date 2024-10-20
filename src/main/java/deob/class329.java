package deob;

@ObfuscatedName("lp")
public class class329 {

    @ObfuscatedName("lp.r")
    public String field3904;

    @ObfuscatedName("lp.j")
    public class250 field3909;

    @ObfuscatedName("lp.p")
    public int field3908 = 0;

    @ObfuscatedName("lp.e")
    public boolean field3911 = false;

    public class329(class250 arg0) {
        this.field3909 = arg0;
    }

    @ObfuscatedName("lp.y(Ljava/lang/String;I)V")
    public void method5620(String arg0) {
        if (arg0 != null && !arg0.isEmpty() && this.field3904 != arg0) {
            this.field3904 = arg0;
            this.field3908 = 0;
            this.field3911 = false;
            this.method5621();
        }
    }

    @ObfuscatedName("lp.c(I)I")
    public int method5621() {
        if (this.field3908 < 25) {
            if (!this.field3909.method4337(class30.field281.field277, this.field3904)) {
                return this.field3908;
            }
            this.field3908 = 25;
        }
        if (this.field3908 == 25) {
            if (!this.field3909.method4337(this.field3904, class30.field279.field277)) {
                return 25 + this.field3909.method4281(this.field3904) * 25 / 100;
            }
            this.field3908 = 50;
        }
        if (this.field3908 == 50) {
            if (this.field3909.method4276(class30.field278.field277, this.field3904) && !this.field3909.method4337(class30.field278.field277, this.field3904)) {
                return 50;
            }
            this.field3908 = 75;
        }
        if (this.field3908 == 75) {
            if (!this.field3909.method4337(this.field3904, class30.field280.field277)) {
                return 75;
            }
            this.field3908 = 100;
            this.field3911 = true;
        }
        return this.field3908;
    }

    @ObfuscatedName("lp.n(I)Z")
    public boolean method5626() {
        return this.field3911;
    }

    @ObfuscatedName("lp.u(I)I")
    public int method5623() {
        return this.field3908;
    }
}
