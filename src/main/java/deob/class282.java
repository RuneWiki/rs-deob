package deob;

@ObfuscatedName("jc")
public class class282 extends class274 {

    @ObfuscatedName("jc.p")
    public int field3706;

    @ObfuscatedName("jc.i")
    public int field3708;

    @ObfuscatedName("jc.w")
    public boolean field3707;

    @ObfuscatedName("jc.s")
    public boolean field3705;

    @ObfuscatedName("jc.p(Ljc;I)I")
    public int method4772(class282 arg0) {
        if (client.field996 == this.field3706 && client.field996 != arg0.field3706) {
            return -1;
        } else if (client.field996 == arg0.field3706 && client.field996 != this.field3706) {
            return 1;
        } else if (this.field3706 != 0 && arg0.field3706 == 0) {
            return -1;
        } else if (arg0.field3706 != 0 && this.field3706 == 0) {
            return 1;
        } else if (this.field3707 && !arg0.field3707) {
            return -1;
        } else if (!this.field3707 && arg0.field3707) {
            return 1;
        } else if (this.field3705 && !arg0.field3705) {
            return -1;
        } else if (!this.field3705 && arg0.field3705) {
            return 1;
        } else {
            return super.method4651(arg0);
        }
    }

    @ObfuscatedName("jc.ai(Lju;B)I")
    public int method4651(class274 arg0) {
        return this.method4772((class282) arg0);
    }

    public int compareTo(Object arg0) {
        return this.method4772((class282) arg0);
    }
}
