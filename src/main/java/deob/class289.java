package deob;

@ObfuscatedName("ks")
public class class289 extends class285 {

    @ObfuscatedName("ks.h")
    public int field3649;

    @ObfuscatedName("ks.h(Lks;I)I")
    public int method4796(class289 arg0) {
        return this.field3649 - arg0.field3649;
    }

    @ObfuscatedName("ks.au(Lju;I)I")
    public int method4703(class285 arg0) {
        return this.method4796((class289) arg0);
    }

    public int compareTo(Object arg0) {
        return this.method4796((class289) arg0);
    }
}
