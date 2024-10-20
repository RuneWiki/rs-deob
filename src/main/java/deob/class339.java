package deob;

@ObfuscatedName("ns")
public class class339 {

    @ObfuscatedName("ns.aq")
    public int field3623;

    @ObfuscatedName("ns.aw")
    public int field3622;

    @ObfuscatedName("ns.al")
    public int field3624;

    public class339(int arg0, int arg1, int arg2) {
        this.field3623 = arg0;
        this.field3622 = arg1;
        this.field3624 = arg2;
    }

    public class339(class339 arg0) {
        this.field3623 = arg0.field3623;
        this.field3622 = arg0.field3622;
        this.field3624 = arg0.field3624;
    }

    public class339(int arg0) {
        if (arg0 == -1) {
            this.field3623 = -1;
        } else {
            this.field3623 = arg0 >> 28 & 0x3;
            this.field3622 = arg0 >> 14 & 0x3FFF;
            this.field3624 = arg0 & 0x3FFF;
        }
    }

    @ObfuscatedName("ns.aq(B)I")
    public int method5759() {
        int var1 = this.field3623;
        int var2 = this.field3622;
        int var3 = this.field3624;
        return var1 << 28 | var2 << 14 | var3;
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof class339)) {
            return this.method5773((class339) arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("ns.aw(Lns;I)Z")
    public boolean method5773(class339 arg0) {
        if (this.field3623 != arg0.field3623) {
            return false;
        } else if (this.field3622 == arg0.field3622) {
            return this.field3624 == arg0.field3624;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.method5759();
    }

    public String toString() {
        return this.method5762(",");
    }

    @ObfuscatedName("ns.al(Ljava/lang/String;B)Ljava/lang/String;")
    public String method5762(String arg0) {
        return this.field3623 + arg0 + (this.field3622 >> 6) + arg0 + (this.field3624 >> 6) + arg0 + (this.field3622 & 0x3F) + arg0 + (this.field3624 & 0x3F);
    }
}
