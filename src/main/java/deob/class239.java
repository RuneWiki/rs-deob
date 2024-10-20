package deob;

@ObfuscatedName("io")
public class class239 {

    @ObfuscatedName("io.g")
    public int field2793;

    @ObfuscatedName("io.e")
    public int field2791;

    @ObfuscatedName("io.b")
    public int field2790;

    public class239() {
        this.field2793 = -1;
    }

    public class239(int arg0, int arg1, int arg2) {
        this.field2793 = arg0;
        this.field2791 = arg1;
        this.field2790 = arg2;
    }

    public class239(class239 arg0) {
        this.field2793 = arg0.field2793;
        this.field2791 = arg0.field2791;
        this.field2790 = arg0.field2790;
    }

    public class239(int arg0) {
        if (arg0 == -1) {
            this.field2793 = -1;
        } else {
            this.field2793 = arg0 >> 28 & 0x3;
            this.field2791 = arg0 >> 14 & 0x3FFF;
            this.field2790 = arg0 & 0x3FFF;
        }
    }

    @ObfuscatedName("io.g(IIII)V")
    public void method4113(int arg0, int arg1, int arg2) {
        this.field2793 = arg0;
        this.field2791 = arg1;
        this.field2790 = arg2;
    }

    @ObfuscatedName("io.e(I)I")
    public int method4126() {
        return this.field2793 << 28 | this.field2791 << 14 | this.field2790;
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof class239)) {
            return this.method4123((class239) arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("io.b(Lio;B)Z")
    public boolean method4123(class239 arg0) {
        if (this.field2793 != arg0.field2793) {
            return false;
        } else if (this.field2791 == arg0.field2791) {
            return this.field2790 == arg0.field2790;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.method4126();
    }

    public String toString() {
        return this.method4117(",");
    }

    @ObfuscatedName("io.z(Ljava/lang/String;I)Ljava/lang/String;")
    public String method4117(String arg0) {
        return this.field2793 + arg0 + (this.field2791 >> 6) + arg0 + (this.field2790 >> 6) + arg0 + (this.field2791 & 0x3F) + arg0 + (this.field2790 & 0x3F);
    }
}
