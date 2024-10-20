package deob;

@ObfuscatedName("ng")
public class class376 extends class373 {

    @ObfuscatedName("ng.c")
    public int field4363;

    @ObfuscatedName("ng.c(Lng;I)I")
    public int method6325(class376 arg0) {
        return this.field4363 - arg0.field4363;
    }

    @ObfuscatedName("ng.p(Lnc;I)I")
    public int method6198(class373 arg0) {
        return this.method6325((class376) arg0);
    }

    public int compareTo(Object arg0) {
        return this.method6325((class376) arg0);
    }
}
