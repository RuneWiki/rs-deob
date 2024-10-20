package deob;

@ObfuscatedName("ml")
public class class342 {

    @ObfuscatedName("ml.p")
    public String field3965;

    @ObfuscatedName("ml.g")
    public class244 field3969;

    @ObfuscatedName("ml.n")
    public int field3967 = 0;

    @ObfuscatedName("ml.u")
    public boolean field3966 = false;

    public class342(class244 arg0) {
        this.field3969 = arg0;
    }

    @ObfuscatedName("ml.m(Ljava/lang/String;I)V")
    public void method5963(String arg0) {
        if (arg0 != null && !arg0.isEmpty() && this.field3965 != arg0) {
            this.field3965 = arg0;
            this.field3967 = 0;
            this.field3966 = false;
            this.method5958();
        }
    }

    @ObfuscatedName("ml.o(I)I")
    public int method5958() {
        if (this.field3967 < 33) {
            if (!this.field3969.method3939(class45.field326.field328, this.field3965)) {
                return this.field3967;
            }
            this.field3967 = 33;
        }
        if (this.field3967 == 33) {
            if (this.field3969.method3981(class45.field325.field328, this.field3965) && !this.field3969.method3939(class45.field325.field328, this.field3965)) {
                return this.field3967;
            }
            this.field3967 = 66;
        }
        if (this.field3967 == 66) {
            if (!this.field3969.method3939(this.field3965, class45.field327.field328)) {
                return this.field3967;
            }
            this.field3967 = 100;
            this.field3966 = true;
        }
        return this.field3967;
    }

    @ObfuscatedName("ml.q(I)Z")
    public boolean method5962() {
        return this.field3966;
    }

    @ObfuscatedName("ml.j(I)I")
    public int method5957() {
        return this.field3967;
    }
}
