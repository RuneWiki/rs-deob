package deob;

@ObfuscatedName("ja")
public class class278 extends class274 {

    @ObfuscatedName("ja.c")
    public int field3579;

    @ObfuscatedName("ja.c(Lja;I)I")
    public int method4793(class278 arg0) {
        return this.field3579 - arg0.field3579;
    }

    @ObfuscatedName("ja.an(Ljw;B)I")
    public int method4686(class274 arg0) {
        return this.method4793((class278) arg0);
    }

    public int compareTo(Object arg0) {
        return this.method4793((class278) arg0);
    }
}
