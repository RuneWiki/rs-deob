package deob;

@ObfuscatedName("ko")
public class class289 extends class407 {

    @ObfuscatedName("ko.c")
    public final int field3340;

    @ObfuscatedName("ko.p")
    public final int field3341;

    @ObfuscatedName("ko.f")
    public final int[] field3342;

    @ObfuscatedName("ko.n")
    public final int[] field3343;

    public class289(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        this.field3340 = arg0;
        this.field3341 = arg1;
        this.field3342 = arg2;
        this.field3343 = arg3;
    }

    @ObfuscatedName("ko.c(III)Z")
    public boolean method5111(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field3343.length) {
            int var3 = this.field3343[arg1];
            if (arg0 >= var3 && arg0 <= this.field3342[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
