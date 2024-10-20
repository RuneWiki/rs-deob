package deob;

@ObfuscatedName("jp")
public class class279 extends class275 {

    @ObfuscatedName("jp.c")
    public int field3598;

    @ObfuscatedName("jp.c(Ljp;I)I")
    public int method4805(class279 arg0) {
        return this.field3598 - arg0.field3598;
    }

    @ObfuscatedName("jp.az(Ljk;I)I")
    public int method4693(class275 arg0) {
        return this.method4805((class279) arg0);
    }

    public int compareTo(Object arg0) {
        return this.method4805((class279) arg0);
    }
}
