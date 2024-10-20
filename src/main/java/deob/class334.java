package deob;

@ObfuscatedName("ls")
public class class334 {

    @ObfuscatedName("ls.y")
    public String field4001;

    @ObfuscatedName("ls.k")
    public class262 field4002;

    @ObfuscatedName("ls.s")
    public int field3999 = 0;

    @ObfuscatedName("ls.p")
    public boolean field4004 = false;

    public class334(class262 arg0) {
        this.field4002 = arg0;
    }

    @ObfuscatedName("ls.d(Ljava/lang/String;I)V")
    public void method5588(String arg0) {
        if (arg0 != null && !arg0.isEmpty() && this.field4001 != arg0) {
            this.field4001 = arg0;
            this.field3999 = 0;
            this.field4004 = false;
            this.method5589();
        }
    }

    @ObfuscatedName("ls.z(I)I")
    public int method5589() {
        if (this.field3999 < 25) {
            if (!this.field4002.method4335(class42.field542.field543, this.field4001)) {
                return this.field3999;
            }
            this.field3999 = 25;
        }
        if (this.field3999 == 25) {
            if (!this.field4002.method4335(this.field4001, class42.field545.field543)) {
                return 25 + this.field4002.method4298(this.field4001) * 25 / 100;
            }
            this.field3999 = 50;
        }
        if (this.field3999 == 50) {
            if (this.field4002.method4293(class42.field549.field543, this.field4001) && !this.field4002.method4335(class42.field549.field543, this.field4001)) {
                return 50;
            }
            this.field3999 = 75;
        }
        if (this.field3999 == 75) {
            if (!this.field4002.method4335(this.field4001, class42.field546.field543)) {
                return 75;
            }
            this.field3999 = 100;
            this.field4004 = true;
        }
        return this.field3999;
    }

    @ObfuscatedName("ls.n(I)Z")
    public boolean method5590() {
        return this.field4004;
    }

    @ObfuscatedName("ls.r(B)I")
    public int method5591() {
        return this.field3999;
    }
}
