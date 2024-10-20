package deob;

@ObfuscatedName("ll")
public class class292 extends class304 {

    @ObfuscatedName("ll.ac")
    public final int field3166;

    @ObfuscatedName("ll.ae")
    public final class299 field3163;

    @ObfuscatedName("ll.ag")
    public final int field3165;

    @ObfuscatedName("ll.am")
    public final int field3164;

    public class292(class352 arg0, class352 arg1, int arg2, class299 arg3) {
        super(arg0, arg1);
        this.field3166 = arg2;
        this.field3163 = arg3;
        class184 var5 = class184.method3200(this.method5246());
        class565 var6 = var5.method3467(false);
        if (var6 == null) {
            this.field3165 = 0;
            this.field3164 = 0;
        } else {
            this.field3165 = var6.field5518;
            this.field3164 = var6.field5511;
        }
    }

    @ObfuscatedName("ll.ae(I)I")
    public int method5246() {
        return this.field3166;
    }

    @ObfuscatedName("ll.ag(B)Lls;")
    public class299 method5247() {
        return this.field3163;
    }

    @ObfuscatedName("ll.am(I)I")
    public int method5248() {
        return this.field3165;
    }

    @ObfuscatedName("ll.ax(I)I")
    public int method5249() {
        return this.field3164;
    }
}
