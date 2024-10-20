package deob;

@ObfuscatedName("mi")
public final class class364 implements Comparable {

    @ObfuscatedName("mi.s")
    public Object field4273;

    @ObfuscatedName("mi.h")
    public Object field4272;

    @ObfuscatedName("mi.w")
    public long field4271;

    @ObfuscatedName("mi.v")
    public long field4274;

    public class364(Object arg0, Object arg1) {
        this.field4273 = arg0;
        this.field4272 = arg1;
    }

    @ObfuscatedName("mi.s(Lmi;S)I")
    public int method5912(class364 arg0) {
        if (this.field4274 < arg0.field4274) {
            return -1;
        } else if (this.field4274 > arg0.field4274) {
            return 1;
        } else {
            return 0;
        }
    }

    public boolean equals(Object arg0) {
        if (!arg0 instanceof class364) {
            throw new IllegalArgumentException();
        }
        return this.field4272.equals(((class364) arg0).field4272);
    }

    public int hashCode() {
        return this.field4272.hashCode();
    }

    public int compareTo(Object arg0) {
        return this.method5912((class364) arg0);
    }
}
