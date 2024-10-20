package deob;

@ObfuscatedName("kt")
public class class289 extends class285 {

    @ObfuscatedName("kt.f")
    public int field3639;

    @ObfuscatedName("kt.f(Lkt;I)I")
    public int method4878(class289 arg0) {
        return this.field3639 - arg0.field3639;
    }

    @ObfuscatedName("kt.av(Ljh;B)I")
    public int method4771(class285 arg0) {
        return this.method4878((class289) arg0);
    }

    public int compareTo(Object arg0) {
        return this.method4878((class289) arg0);
    }
}
