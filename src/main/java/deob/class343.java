package deob;

@ObfuscatedName("mv")
public class class343 {

    @ObfuscatedName("mv.t")
    public String field3984;

    @ObfuscatedName("mv.j")
    public class245 field3986;

    @ObfuscatedName("mv.n")
    public int field3987 = 0;

    @ObfuscatedName("mv.p")
    public boolean field3988 = false;

    public class343(class245 arg0) {
        this.field3986 = arg0;
    }

    @ObfuscatedName("mv.h(Ljava/lang/String;I)V")
    public void method5864(String arg0) {
        if (arg0 != null && !arg0.isEmpty() && this.field3984 != arg0) {
            this.field3984 = arg0;
            this.field3987 = 0;
            this.field3988 = false;
            this.method5865();
        }
    }

    @ObfuscatedName("mv.v(B)I")
    public int method5865() {
        if (this.field3987 < 33) {
            if (!this.field3986.method3856(class45.field327.field331, this.field3984)) {
                return this.field3987;
            }
            this.field3987 = 33;
        }
        if (this.field3987 == 33) {
            if (this.field3986.method3854(class45.field328.field331, this.field3984) && !this.field3986.method3856(class45.field328.field331, this.field3984)) {
                return this.field3987;
            }
            this.field3987 = 66;
        }
        if (this.field3987 == 66) {
            if (!this.field3986.method3856(this.field3984, class45.field326.field331)) {
                return this.field3987;
            }
            this.field3987 = 100;
            this.field3988 = true;
        }
        return this.field3987;
    }

    @ObfuscatedName("mv.x(I)Z")
    public boolean method5872() {
        return this.field3988;
    }

    @ObfuscatedName("mv.w(I)I")
    public int method5867() {
        return this.field3987;
    }
}
