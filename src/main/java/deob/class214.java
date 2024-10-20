package deob;

@ObfuscatedName("ha")
public class class214 {

    @ObfuscatedName("ha.j")
    public byte field3093;

    @ObfuscatedName("ha.y")
    public int field3094;

    @ObfuscatedName("ha.z")
    public int field3097;

    @ObfuscatedName("ha.l")
    public int field3096;

    @ObfuscatedName("ha.w")
    public int field3098;

    @ObfuscatedName("ha.d")
    public int field3095;

    public class214() {
    }

    public class214(class114 arg0, boolean arg1) {
        this.field3093 = arg0.method2323();
        this.field3094 = arg0.method2324();
        this.field3097 = arg0.method2327();
        this.field3096 = arg0.method2327();
        this.field3098 = arg0.method2327();
        this.field3095 = arg0.method2327();
        if (arg1) {
            this.method3632(method3163(arg0));
        }
    }

    @ObfuscatedName("fd.j(Lde;I)Ljava/lang/Integer;")
    public static Integer method3163(class114 arg0) {
        int var1 = 0;
        boolean var2 = false;
        while (true) {
            int var3 = arg0.method2322();
            if (var3 == 255) {
                return var2 ? var1 : null;
            }
            if (var3 != 0) {
                throw new IllegalStateException("");
            }
            while (true) {
                int var4 = arg0.method2322();
                if (var4 == 255) {
                    break;
                }
                arg0.field1894--;
                if (arg0.method2324() != 0) {
                    throw new IllegalStateException("");
                }
                if (var2) {
                    throw new IllegalStateException("");
                }
                var1 = arg0.method2327();
                var2 = true;
            }
        }
    }

    @ObfuscatedName("ha.y(Ljava/lang/Integer;B)V")
    public void method3632(Integer arg0) {
    }

    @ObfuscatedName("ha.z(I)I")
    public int method3640() {
        return this.field3093 & 0x7;
    }

    @ObfuscatedName("ha.l(I)I")
    public int method3646() {
        return (this.field3093 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("ha.w(II)V")
    public void method3635(int arg0) {
        this.field3093 &= 0xFFFFFFF8;
        this.field3093 = (byte) (this.field3093 | arg0 & 0x7);
    }

    @ObfuscatedName("ha.d(II)V")
    public void method3636(int arg0) {
        this.field3093 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field3093 = (byte) (this.field3093 | 0x8);
        }
    }
}
