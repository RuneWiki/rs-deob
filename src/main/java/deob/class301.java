package deob;

@ObfuscatedName("ko")
public class class301 {

    @ObfuscatedName("ko.f")
    public int field3464;

    @ObfuscatedName("ko.w")
    public int field3463;

    @ObfuscatedName("ko.v")
    public int field3462;

    public class301(int arg0, int arg1, int arg2) {
        this.field3464 = arg0;
        this.field3463 = arg1;
        this.field3462 = arg2;
    }

    public class301(class301 arg0) {
        this.field3464 = arg0.field3464;
        this.field3463 = arg0.field3463;
        this.field3462 = arg0.field3462;
    }

    public class301(int arg0) {
        if (arg0 == -1) {
            this.field3464 = -1;
        } else {
            this.field3464 = arg0 >> 28 & 0x3;
            this.field3463 = arg0 >> 14 & 0x3FFF;
            this.field3462 = arg0 & 0x3FFF;
        }
    }

    @ObfuscatedName("ko.f(I)I")
    public int method5322() {
        return method4515(this.field3464, this.field3463, this.field3462);
    }

    @ObfuscatedName("ix.w(IIII)I")
    public static int method4515(int arg0, int arg1, int arg2) {
        return arg0 << 28 | arg1 << 14 | arg2;
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof class301)) {
            return this.method5321((class301) arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("ko.v(Lko;B)Z")
    public boolean method5321(class301 arg0) {
        if (this.field3464 != arg0.field3464) {
            return false;
        } else if (this.field3463 == arg0.field3463) {
            return this.field3462 == arg0.field3462;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.method5322();
    }

    public String toString() {
        return this.method5323(",");
    }

    @ObfuscatedName("ko.s(Ljava/lang/String;B)Ljava/lang/String;")
    public String method5323(String arg0) {
        return this.field3464 + arg0 + (this.field3463 >> 6) + arg0 + (this.field3462 >> 6) + arg0 + (this.field3463 & 0x3F) + arg0 + (this.field3462 & 0x3F);
    }
}
