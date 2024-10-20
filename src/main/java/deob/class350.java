package deob;

@ObfuscatedName("nv")
public class class350 {

    @ObfuscatedName("nv.ab")
    public int field3706;

    @ObfuscatedName("nv.ay")
    public int field3705;

    @ObfuscatedName("nv.an")
    public int field3704;

    public class350(int arg0, int arg1, int arg2) {
        this.field3706 = arg0;
        this.field3705 = arg1;
        this.field3704 = arg2;
    }

    public class350(class350 arg0) {
        this.field3706 = arg0.field3706;
        this.field3705 = arg0.field3705;
        this.field3704 = arg0.field3704;
    }

    public class350(int arg0) {
        if (arg0 == -1) {
            this.field3706 = -1;
        } else {
            this.field3706 = arg0 >> 28 & 0x3;
            this.field3705 = arg0 >> 14 & 0x3FFF;
            this.field3704 = arg0 & 0x3FFF;
        }
    }

    @ObfuscatedName("nv.ab(I)I")
    public int method5935() {
        return method5926(this.field3706, this.field3705, this.field3704);
    }

    @ObfuscatedName("nv.ay(IIII)I")
    public static int method5926(int arg0, int arg1, int arg2) {
        return arg0 << 28 | arg1 << 14 | arg2;
    }

    @ObfuscatedName("nv.an(II)I")
    public static int method5927(int arg0) {
        return arg0 >> 28;
    }

    @ObfuscatedName("nv.ax(II)I")
    public static int method5929(int arg0) {
        return arg0 & 0x3FFF;
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof class350)) {
            return this.method5931((class350) arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("nv.ao(Lnv;B)Z")
    public boolean method5931(class350 arg0) {
        if (this.field3706 != arg0.field3706) {
            return false;
        } else if (this.field3705 == arg0.field3705) {
            return this.field3704 == arg0.field3704;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.method5935();
    }

    public String toString() {
        return this.method5933(",");
    }

    @ObfuscatedName("nv.am(Ljava/lang/String;I)Ljava/lang/String;")
    public String method5933(String arg0) {
        return this.field3706 + arg0 + (this.field3705 >> 6) + arg0 + (this.field3704 >> 6) + arg0 + (this.field3705 & 0x3F) + arg0 + (this.field3704 & 0x3F);
    }

    @ObfuscatedName("nv.ac(IB)I")
    public static int method5934(int arg0) {
        return arg0 >> 3;
    }

    @ObfuscatedName("nv.ae(II)I")
    public static int method5953(int arg0) {
        return arg0 << 3;
    }
}
