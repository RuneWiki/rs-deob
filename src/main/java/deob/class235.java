package deob;

@ObfuscatedName("if")
public class class235 {

    @ObfuscatedName("if.a")
    public int field2652;

    @ObfuscatedName("if.s")
    public int field2650;

    @ObfuscatedName("if.g")
    public int field2649;

    public class235(int arg0, int arg1, int arg2) {
        this.field2652 = arg0;
        this.field2650 = arg1;
        this.field2649 = arg2;
    }

    public class235(class235 arg0) {
        this.field2652 = arg0.field2652;
        this.field2650 = arg0.field2650;
        this.field2649 = arg0.field2649;
    }

    public class235(int arg0) {
        if (arg0 == -1) {
            this.field2652 = -1;
        } else {
            this.field2652 = arg0 >> 28 & 0x3;
            this.field2650 = arg0 >> 14 & 0x3FFF;
            this.field2649 = arg0 & 0x3FFF;
        }
    }

    @ObfuscatedName("if.a(I)I")
    public int method4268() {
        return this.field2652 << 28 | this.field2650 << 14 | this.field2649;
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof class235)) {
            return this.method4269((class235) arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("if.s(Lif;I)Z")
    public boolean method4269(class235 arg0) {
        if (this.field2652 != arg0.field2652) {
            return false;
        } else if (this.field2650 == arg0.field2650) {
            return this.field2649 == arg0.field2649;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.method4268();
    }

    public String toString() {
        return this.method4271(",");
    }

    @ObfuscatedName("if.g(Ljava/lang/String;B)Ljava/lang/String;")
    public String method4271(String arg0) {
        return this.field2652 + arg0 + (this.field2650 >> 6) + arg0 + (this.field2649 >> 6) + arg0 + (this.field2650 & 0x3F) + arg0 + (this.field2649 & 0x3F);
    }
}
