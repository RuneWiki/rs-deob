package deob;

@ObfuscatedName("ko")
public class class289 extends class285 {

    @ObfuscatedName("ko.c")
    public int field3674;

    @ObfuscatedName("ko.c(Lko;B)I")
    public int method5051(class289 arg0) {
        return this.field3674 - arg0.field3674;
    }

    @ObfuscatedName("ko.a(Ljx;B)I")
    public int method4937(class285 arg0) {
        return this.method5051((class289) arg0);
    }

    public int compareTo(Object arg0) {
        return this.method5051((class289) arg0);
    }
}
