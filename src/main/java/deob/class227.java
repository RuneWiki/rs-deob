package deob;

@ObfuscatedName("hh")
public class class227 extends class209 {

    @ObfuscatedName("hh.f")
    public final int field2609;

    @ObfuscatedName("hh.h")
    public final int field2607;

    @ObfuscatedName("hh.e")
    public final int[] field2608;

    @ObfuscatedName("hh.b")
    public final int[] field2610;

    public class227(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        this.field2609 = arg0;
        this.field2607 = arg1;
        this.field2608 = arg2;
        this.field2610 = arg3;
    }

    @ObfuscatedName("hh.f(III)Z")
    public boolean method4099(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field2610.length) {
            int var3 = this.field2610[arg1];
            if (arg0 >= var3 && arg0 <= this.field2608[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
