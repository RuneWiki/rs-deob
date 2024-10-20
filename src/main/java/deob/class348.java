package deob;

@ObfuscatedName("nl")
public class class348 {

    @ObfuscatedName("nl.aq")
    public int field3734;

    @ObfuscatedName("nl.ad")
    public int field3733;

    @ObfuscatedName("nl.ag")
    public int field3735;

    public class348(int arg0, int arg1, int arg2) {
        this.field3734 = arg0;
        this.field3733 = arg1;
        this.field3735 = arg2;
    }

    public class348(class348 arg0) {
        this.field3734 = arg0.field3734;
        this.field3733 = arg0.field3733;
        this.field3735 = arg0.field3735;
    }

    public class348(int arg0) {
        if (arg0 == -1) {
            this.field3734 = -1;
        } else {
            this.field3734 = arg0 >> 28 & 0x3;
            this.field3733 = arg0 >> 14 & 0x3FFF;
            this.field3735 = arg0 & 0x3FFF;
        }
    }

    @ObfuscatedName("nl.aq(B)I")
    public int method5852() {
        return Statics.method5840(this.field3734, this.field3733, this.field3735);
    }

    @ObfuscatedName("nl.ag(II)I")
    public static int method5849(int arg0) {
        return arg0 >> 28 & 0x3;
    }

    @ObfuscatedName("nl.ap(II)I")
    public static int method5854(int arg0) {
        return arg0 & 0x3FFF;
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof class348)) {
            return this.method5859((class348) arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("nl.an(Lnl;I)Z")
    public boolean method5859(class348 arg0) {
        if (this.field3734 != arg0.field3734) {
            return false;
        } else if (this.field3733 == arg0.field3733) {
            return this.field3735 == arg0.field3735;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.method5852();
    }

    public String toString() {
        return this.method5845(",");
    }

    @ObfuscatedName("nl.aj(Ljava/lang/String;I)Ljava/lang/String;")
    public String method5845(String arg0) {
        return this.field3734 + arg0 + (this.field3733 >> 6) + arg0 + (this.field3735 >> 6) + arg0 + (this.field3733 & 0x3F) + arg0 + (this.field3735 & 0x3F);
    }

    @ObfuscatedName("nl.av(IB)I")
    public static int method5863(int arg0) {
        return arg0 >> 3;
    }

    @ObfuscatedName("nl.ab(IB)I")
    public static int method5847(int arg0) {
        return arg0 << 3;
    }

    @ObfuscatedName("nl.ai(II)I")
    public static int method5869(int arg0) {
        return arg0 << 3;
    }
}
